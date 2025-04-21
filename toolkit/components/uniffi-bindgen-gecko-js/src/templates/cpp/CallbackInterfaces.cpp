/* -*- Mode: C++; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* vim: set ts=8 sts=2 et sw=2 tw=80: */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


{%- for (preprocessor_condition, handlers, preprocessor_condition_end) in future_callback_handlers.iter() %}
{{ preprocessor_condition }}
{%- for handler in handlers %}
class {{ handler.class_name }} final : public PromiseNativeHandler {
public:
  NS_DECL_ISUPPORTS

private:
  {{ handler.complete_handler_type_name }} mCompleteHandler;
  uint64_t mCallbackData;

public:
  {{ handler.class_name }}(
    {{ handler.complete_handler_type_name }}
    aCompleteHandler,
    uint64_t aCallbackData)
  : mCompleteHandler(aCompleteHandler),
    mCallbackData(aCallbackData) { }

  MOZ_CAN_RUN_SCRIPT
  virtual void ResolvedCallback(JSContext* aCx, JS::Handle<JS::Value> aValue,
                                ErrorResult& aRv) override {
    // This will only fail if our callback functions are called multiple times
    MOZ_ASSERT(mCompleteHandler);

    // Complete an async callback method by lowering `callResult` and calling the Rust callback
    // function
    RootedDictionary<UniFFIScaffoldingCallResult> callResult(aCx);
    if (!callResult.Init(aCx, aValue)) {
      MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] callback method did not return a UniFFIScaffoldingCallResult"));
      callResult.mCode = UniFFIScaffoldingCallCode::Internal_error;
    }

    {{ handler.result_type_name }} result{};
    switch (callResult.mCode) {
      case UniFFIScaffoldingCallCode::Success: {
        result.call_status.code = RUST_CALL_SUCCESS;
        {% if let Some(return_type) = handler.return_type %}
        if (!callResult.mData.WasPassed()) {
          MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] No data passed"));
          result.call_status.code = RUST_CALL_INTERNAL_ERROR;
          break;
        }
        ErrorResult error;
        {{ return_type.ffi_value_class }} returnValue;
        returnValue.Lower(callResult.mData.Value(), error);
        if (error.Failed()) {
          MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] Failed to lower return value"));
          result.call_status.code = RUST_CALL_INTERNAL_ERROR;
        } else {
          result.return_value = returnValue.IntoRust();
        }
        {% endif %}
        break;
      }

      case UniFFIScaffoldingCallCode::Error: {
        result.call_status.code = RUST_CALL_ERROR;
        if (!callResult.mData.WasPassed()) {
          MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] No data passed"));
          result.call_status.code = RUST_CALL_INTERNAL_ERROR;
          break;
        }
        ErrorResult error;
        FfiValueRustBuffer errorBuf;
        errorBuf.Lower(callResult.mData.Value(), error);
        if (error.Failed()) {
          MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] Failed to lower error buffer"));
          result.call_status.code = RUST_CALL_INTERNAL_ERROR;
        } else {
          result.call_status.error_buf = errorBuf.IntoRust();
        }
        break;
      }

      default: {
        result.call_status.code = RUST_CALL_INTERNAL_ERROR;
        break;
      }
    }
    mCompleteHandler(mCallbackData, result);
    mCompleteHandler = nullptr;
  }

  virtual void RejectedCallback(JSContext* aCx, JS::Handle<JS::Value> aValue,
                                ErrorResult& aRv) override {
    MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] promise rejected"));
    MOZ_ASSERT(mCompleteHandler);
    {{ handler.result_type_name }} result{};
    result.call_status.code = RUST_CALL_INTERNAL_ERROR;
    mCompleteHandler(mCallbackData, result);
    mCompleteHandler = nullptr;
  }

protected:
  ~{{ handler.class_name }}() {
    if (mCompleteHandler) {
      MOZ_LOG(gUniffiLogger, LogLevel::Error, ("[{{ handler.class_name }}] promise never completed"));
      {{ handler.result_type_name }} result{};
      result.call_status.code = RUST_CALL_INTERNAL_ERROR;
      mCompleteHandler(mCallbackData, result);
    }
  }
};

NS_IMPL_ISUPPORTS0({{ handler.class_name }});

{%- endfor %}
{{ preprocessor_condition_end }}
{%- endfor %}

// Callback interface method handlers, vtables, etc.
{%- for (preprocessor_condition, callback_interfaces, preprocessor_condition_end) in callback_interfaces.iter() %}
{{ preprocessor_condition }}

{%- for cbi in callback_interfaces %}
static StaticRefPtr<dom::UniFFICallbackHandler> {{ cbi.handler_var }};

{%- for meth in cbi.methods %}
{%- let method_index = loop.index0 %}
{%- let arguments = meth.arguments %}

class {{ meth.handler_class_name }} : public UniffiCallbackMethodHandlerBase {
private:
  // Rust arguments
  {%- for a in arguments %}
  {{ a.ffi_value_class }} {{ a.field_name }}{};
  {%- endfor %}
  {%- if meth.is_async() %}
  RefPtr<PromiseNativeHandler> mPromiseCompleteHandler;
  {%- endif %}

public:
  {{ meth.handler_class_name }}(
      uint64_t aUniffiHandle
      {%- for a in arguments -%}
      , {{ a.ty.type_name }} {{ a.name }}
      {%- endfor -%}
      {%- if meth.is_async() -%}
      , RefPtr<PromiseNativeHandler> aPromiseCompleteHandler
      {%- endif -%}
    )
    : UniffiCallbackMethodHandlerBase("{{ cbi.name }}", aUniffiHandle)
    {%- for a in arguments %}, {{ a.field_name }}({{ a.ffi_value_class }}::FromRust({{ a.name }})){% endfor %}
    {%- if meth.is_async() -%}
    , mPromiseCompleteHandler(aPromiseCompleteHandler)
    {%- endif -%}
  {
  }

  MOZ_CAN_RUN_SCRIPT
  void MakeCall(JSContext* aCx, dom::UniFFICallbackHandler* aJsHandler, ErrorResult& aError) override {
    nsTArray<dom::OwningUniFFIScaffoldingValue> uniffiArgs;

    // Setup
    if (!uniffiArgs.AppendElements({{ arguments.len() + 1 }}, mozilla::fallible)) {
      aError.Throw(NS_ERROR_OUT_OF_MEMORY);
      return;
    }

    // Convert each argument
    mUniffiHandle.Lift(
      aCx,
      &uniffiArgs[0],
      aError);
    if (aError.Failed()) {
        return;
    }
    {%- for a in arguments %}
    {{ a.field_name }}.Lift(
      aCx,
      &uniffiArgs[{{ loop.index }}],
      aError);
    if (aError.Failed()) {
        return;
    }
    {%- endfor %}

    {%- if !meth.is_async() %}
    // Stores the return value.  For now, we currently don't do anything with it, since we only support
    // fire-and-forget callbacks.
    NullableRootedUnion<dom::OwningUniFFIScaffoldingValue> returnValue(aCx);
    // Make the call
    aJsHandler->Call(mUniffiHandle.IntoRust(), {{ method_index }}, uniffiArgs, returnValue, aError);
    {%- else %}
    RefPtr<dom::Promise> result = aJsHandler->CallAsync(mUniffiHandle.IntoRust(), {{ method_index }}, uniffiArgs, aError);
    result->AppendNativeHandler(mPromiseCompleteHandler);
    {%- endif %}
  }
};

{% match meth.async_data -%}
{% when None %}
// Sync callback methods are always wrapped to be fire-and-forget style async callbacks.  This means
// we schedule the callback asynchronously and ignore the return value and any exceptions thrown.
extern "C" void {{ meth.fn_name }}(
  uint64_t aUniffiHandle,
  {%- for a in meth.arguments %}
  {{ a.ty.type_name }} {{ a.name }},
  {%- endfor %}
  {{ meth.out_pointer_ty.type_name }} aUniffiOutReturn,
  RustCallStatus* uniffiOutStatus
) {
  UniquePtr<UniffiCallbackMethodHandlerBase> handler = MakeUnique<{{ meth.handler_class_name }}>(aUniffiHandle{% for a in arguments %}, {{ a.name }}{%- endfor %});
  UniffiCallbackMethodHandlerBase::ScheduleMakeCall(std::move(handler), &{{ cbi.handler_var }});
}
{% when Some(async_data) -%}
extern "C" void {{ meth.fn_name }}(
  uint64_t aUniffiHandle,
  {%- for a in meth.arguments %}
  {{ a.ty.type_name }} {{ a.name }},
  {%- endfor %}
  {{ async_data.complete_handler_type_name }} aUniffiForeignFutureCallback,
  uint64_t aUniffiForeignFutureCallbackData,
  // This can be used to detected when the future is dropped from the Rust side and cancel the
  // async task on the foreign side.  However, there's no way to do that in JS, so we just ignore
  // it.
  ForeignFuture *aUniffiOutForeignFuture
) {
  // Async callback methods can be called from:
  //   * async Rust functions
  //   * async-wrapped Rust functions, using something like `futures::block_on`.
  //
  // Async callback methods should not be called from sync Rust functions using `futures::block_on`,
  // since that could deadlock the JS main thread.
  //
  // The following assertion checks this.
  MOZ_ASSERT(!NS_IsMainThread());

  // Create a `PromiseNativeHandler` that will complete the promise by calling
  // the Rust callback.
  RefPtr<PromiseNativeHandler> promiseCompleteHandler = new {{ async_data.complete_func_class }}(aUniffiForeignFutureCallback, aUniffiForeignFutureCallbackData);
  UniquePtr<UniffiCallbackMethodHandlerBase> handler = MakeUnique<{{ meth.handler_class_name }}>(aUniffiHandle{% for a in arguments %}, {{ a.name }}{%- endfor %}, promiseCompleteHandler);
  // Now that everything is set up, schedule the call in the JS main thread.
  UniffiCallbackMethodHandlerBase::ScheduleMakeCall(std::move(handler), &{{ cbi.handler_var }});
}
{%- endmatch %}

{%- endfor %}

extern "C" void {{ cbi.free_fn }}(uint64_t uniffiHandle) {
  // Callback object handles are keys in a map stored in the JS handler. To
  // handle the free call, schedule a JS call to remove the key.
  UniffiCallbackMethodHandlerBase::ScheduleMakeCall(MakeUnique<UniffiCallbackFreeHandler>("{{ cbi.name }}", uniffiHandle), &{{ cbi.handler_var }});
}

static {{ cbi.vtable_struct_type.type_name }} {{ cbi.vtable_var }} {
  {%- for meth in cbi.methods %}
  {{ meth.fn_name }},
  {%- endfor %}
  {{ cbi.free_fn }}
};

{%- endfor %}
{{ preprocessor_condition_end }}
{%- endfor %}

void RegisterCallbackHandler(uint64_t aInterfaceId, UniFFICallbackHandler& aCallbackHandler, ErrorResult& aError) {
  switch (aInterfaceId) {
    {%- for (preprocessor_condition, callback_interfaces, preprocessor_condition_end) in callback_interfaces.iter() %}
    {{ preprocessor_condition }}

    {%- for cbi in callback_interfaces %}
    case {{ cbi.id }}: {
      if ({{ cbi.handler_var }}) {
        aError.ThrowUnknownError("[UniFFI] Callback handler already registered for {{ cbi.name }}"_ns);
        return;
      }

      {{ cbi.handler_var }} = &aCallbackHandler;
      {{ cbi.init_fn.0 }}(&{{ cbi.vtable_var }});
      break;
    }


    {%- endfor %}
    {{ preprocessor_condition_end }}
    {%- endfor %}

    default:
      aError.ThrowUnknownError(nsPrintfCString("RegisterCallbackHandler: Unknown callback interface id (%" PRIu64 ")", aInterfaceId));
      return;
  }
}

void DeregisterCallbackHandler(uint64_t aInterfaceId, ErrorResult& aError) {
  switch (aInterfaceId) {
    {%- for (preprocessor_condition, callback_interfaces, preprocessor_condition_end) in callback_interfaces.iter() %}
    {{ preprocessor_condition }}

    {%- for cbi in callback_interfaces %}
    case {{ cbi.id }}: {
      if (!{{ cbi.handler_var }}) {
        aError.ThrowUnknownError("[UniFFI] Callback handler not registered for {{ cbi.name }}"_ns);
        return;
      }

      {{ cbi.handler_var }} = nullptr;
      break;
    }


    {%- endfor %}
    {{ preprocessor_condition_end }}
    {%- endfor %}

    default:
      aError.ThrowUnknownError(nsPrintfCString("DeregisterCallbackHandler: Unknown callback interface id (%" PRIu64 ")", aInterfaceId));
      return;
  }
}
