package mozilla.appservices.remotesettings
import org.json.JSONObject
public interface `RemoteSettingsClientInterface` {
    fun `collectionName`(): kotlin.String
    
    fun `getAttachment`(`record`: mozilla.appservices.remotesettings.`RemoteSettingsRecord`): kotlin.ByteArray
    
    fun `getLastModifiedTimestamp`(): kotlin.ULong?
    
    fun `getRecords`(`syncIfEmpty`: kotlin.Boolean = false): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?
    
    fun `getRecordsMap`(`syncIfEmpty`: kotlin.Boolean = false): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?
    
    fun `resetStorage`(): Unit
    
    fun `shutdown`(): Unit
    
    fun `sync`(): Unit
    
}
public interface `RemoteSettingsTelemetry` {
    fun `reportUptake`(`extras`: mozilla.appservices.remotesettings.`UptakeEventExtras`): Unit
    
}
public interface `RemoteSettingsServiceInterface` {
    fun `clientUrl`(): kotlin.String
    
    fun `makeClient`(`collectionName`: kotlin.String): mozilla.appservices.remotesettings.`RemoteSettingsClient`
    
    fun `setTelemetry`(`telemetry`: mozilla.appservices.remotesettings.`RemoteSettingsTelemetry`): Unit
    
    fun `sync`(): kotlin.collections.List<kotlin.String>
    
    fun `updateConfig`(`config`: mozilla.appservices.remotesettings.`RemoteSettingsConfig`): Unit
    
}

data class `Attachment` (
    var `filename`: kotlin.String,
    var `mimetype`: kotlin.String,
    var `location`: kotlin.String,
    var `hash`: kotlin.String,
    var `size`: kotlin.ULong,
) {
    

    companion object
}

sealed class `RemoteSettingsServer` {
    object `Prod` : `RemoteSettingsServer`()
    
    object `Stage` : `RemoteSettingsServer`()
    
    object `Dev` : `RemoteSettingsServer`()
    
    data class `Custom`(val `url`: kotlin.String,) : `RemoteSettingsServer`()
    
    

    companion object
}

data class `RemoteSettingsContext` (
    var `channel`: kotlin.String? = null,
    var `appVersion`: kotlin.String? = null,
    var `appId`: kotlin.String? = null,
    var `locale`: kotlin.String? = null,
    var `os`: kotlin.String? = null,
    var `osVersion`: kotlin.String? = null,
    var `formFactor`: kotlin.String? = null,
    var `country`: kotlin.String? = null,
    var `distribution`: kotlin.String? = null,
    var `customTargettingAttributes`: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
) {
    

    companion object
}

data class `RemoteSettingsConfig` (
    var `server`: mozilla.appservices.remotesettings.`RemoteSettingsServer`? = null,
    var `bucketName`: kotlin.String? = null,
    var `appContext`: mozilla.appservices.remotesettings.`RemoteSettingsContext`? = null,
) {
    

    companion object
}



/**
 * Typealias from the type name used in the UDL file to the custom type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `RsJsonObject` = JSONObject

data class `RemoteSettingsRecord` (
    var `id`: kotlin.String,
    var `lastModified`: kotlin.ULong,
    var `deleted`: kotlin.Boolean,
    var `attachment`: mozilla.appservices.remotesettings.`Attachment`?,
    var `fields`: mozilla.appservices.remotesettings.`RsJsonObject`,
) {
    

    companion object
}

data class `UptakeEventExtras` (
    var `value`: kotlin.String?,
    var `source`: kotlin.String?,
    var `age`: kotlin.String?,
    var `trigger`: kotlin.String?,
    var `timestamp`: kotlin.String?,
    var `duration`: kotlin.String?,
    var `errorName`: kotlin.String?,
) {
    

    companion object
}

sealed class `RemoteSettingsException` : Exception() {
    
    class `Network`(val `reason`: kotlin.String,) : `RemoteSettingsException`()
    
    
    class `Backoff`(val `seconds`: kotlin.ULong,) : `RemoteSettingsException`()
    
    
    class `Other`(val `reason`: kotlin.String,) : `RemoteSettingsException`()
    
    
    

    companion object
}

enum class `SyncStatus` {
    `SUCCESS`,`UP_TO_DATE`,`NETWORK_ERROR`,`BACKOFF_ERROR`,`SIGNATURE_ERROR`,`SERVER_ERROR`,`UNKNOWN_ERROR`;

    companion object
}
// This template implements a class for working with a Rust struct via a handle
// to the live Rust struct on the other side of the FFI.
//
// There's some subtlety here, because we have to be careful not to operate on a Rust
// struct after it has been dropped, and because we must expose a public API for freeing
// theq Kotlin wrapper object in lieu of reliable finalizers. The core requirements are:
//
//   * Each instance holds an opaque handle to the underlying Rust struct.
//     Method calls need to read this handle from the object's state and pass it in to
//     the Rust FFI.
//
//   * When an instance is no longer needed, its handle should be passed to a
//     special destructor function provided by the Rust FFI, which will drop the
//     underlying Rust struct.
//
//   * Given an instance, calling code is expected to call the special
//     `destroy` method in order to free it after use, either by calling it explicitly
//     or by using a higher-level helper like the `use` method. Failing to do so risks
//     leaking the underlying Rust struct.
//
//   * We can't assume that calling code will do the right thing, and must be prepared
//     to handle Kotlin method calls executing concurrently with or even after a call to
//     `destroy`, and to handle multiple (possibly concurrent!) calls to `destroy`.
//
//   * We must never allow Rust code to operate on the underlying Rust struct after
//     the destructor has been called, and must never call the destructor more than once.
//     Doing so may trigger memory unsafety.
//
//   * To mitigate many of the risks of leaking memory and use-after-free unsafety, a `Cleaner`
//     is implemented to call the destructor when the Kotlin object becomes unreachable.
//     This is done in a background thread. This is not a panacea, and client code should be aware that
//      1. the thread may starve if some there are objects that have poorly performing
//     `drop` methods or do significant work in their `drop` methods.
//      2. the thread is shared across the whole library. This can be tuned by using `android_cleaner = true`,
//         or `android = true` in the [`kotlin` section of the `uniffi.toml` file](https://mozilla.github.io/uniffi-rs/kotlin/configuration.html).
//
// If we try to implement this with mutual exclusion on access to the handle, there is the
// possibility of a race between a method call and a concurrent call to `destroy`:
//
//    * Thread A starts a method call, reads the value of the handle, but is interrupted
//      before it can pass the handle over the FFI to Rust.
//    * Thread B calls `destroy` and frees the underlying Rust struct.
//    * Thread A resumes, passing the already-read handle value to Rust and triggering
//      a use-after-free.
//
// One possible solution would be to use a `ReadWriteLock`, with each method call taking
// a read lock (and thus allowed to run concurrently) and the special `destroy` method
// taking a write lock (and thus blocking on live method calls). However, we aim not to
// generate methods with any hidden blocking semantics, and a `destroy` method that might
// block if called incorrectly seems to meet that bar.
//
// So, we achieve our goals by giving each instance an associated `AtomicLong` counter to track
// the number of in-flight method calls, and an `AtomicBoolean` flag to indicate whether `destroy`
// has been called. These are updated according to the following rules:
//
//    * The initial value of the counter is 1, indicating a live object with no in-flight calls.
//      The initial value for the flag is false.
//
//    * At the start of each method call, we atomically check the counter.
//      If it is 0 then the underlying Rust struct has already been destroyed and the call is aborted.
//      If it is nonzero them we atomically increment it by 1 and proceed with the method call.
//
//    * At the end of each method call, we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
//    * When `destroy` is called, we atomically flip the flag from false to true.
//      If the flag was already true we silently fail.
//      Otherwise we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
// Astute readers may observe that this all sounds very similar to the way that Rust's `Arc<T>` works,
// and indeed it is, with the addition of a flag to guard against multiple calls to `destroy`.
//
// The overall effect is that the underlying Rust struct is destroyed only when `destroy` has been
// called *and* all in-flight method calls have completed, avoiding violating any of the expectations
// of the underlying Rust code.
//
// This makes a cleaner a better alternative to _not_ calling `destroy()` as
// and when the object is finished with, but the abstraction is not perfect: if the Rust object's `drop`
// method is slow, and/or there are many objects to cleanup, and it's on a low end Android device, then the cleaner
// thread may be starved, and the app will leak memory.
//
// In this case, `destroy`ing manually may be a better solution.
//
// The cleaner can live side by side with the manual calling of `destroy`. In the order of responsiveness, uniffi objects
// with Rust peers are reclaimed:
//
// 1. By calling the `destroy` method of the object, which calls `rustObject.free()`. If that doesn't happen:
// 2. When the object becomes unreachable, AND the Cleaner thread gets to call `rustObject.free()`. If the thread is starved then:
// 3. The memory is reclaimed when the process terminates.
//
// [1] https://stackoverflow.com/questions/24376768/can-java-finalize-an-object-when-it-is-still-in-scope/24380219

open class `RemoteSettingsClient` : RemoteSettingsClientInterface, uniffi.Disposable, AutoCloseable {
    @Suppress("UNUSED_PARAMETER")
    /**
     * @suppress
     */
    constructor(withHandle: uniffi.WithHandle, uniffiHandle: kotlin.Long) {
        this.uniffiHandle = uniffiHandle
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     *
     * This constructor can be used to instantiate a fake object. Only used for tests. Any
     * attempt to actually use an object constructed this way will fail as there is no
     * connected Rust object.
     */
    @Suppress("UNUSED_PARAMETER")
    constructor(noHandle: uniffi.NoHandle) {
        this.uniffiHandle = 0
        this.uniffiCleanable = null
    }

    /**
     * @suppress
     */
    public val uniffiHandle: kotlin.Long
    protected val uniffiCleanable: uniffi.Cleanable?

    private val wasDestroyed = java.util.concurrent.atomic.AtomicBoolean(false)
    private val callCounter = java.util.concurrent.atomic.AtomicLong(1)

    /**
     * Whether the current object has been destroyed and its reference is gone in the Rust side.
     */
    val uniffiIsDestroyed: kotlin.Boolean get() = wasDestroyed.get()

    override fun destroy() {
        // Only allow a single call to this method.
        // TODO: maybe we should log a warning if called more than once?
        if (this.wasDestroyed.compareAndSet(false, true)) {
            // This decrement always matches the initial count of 1 given at creation time.
            if (this.callCounter.decrementAndGet() == 0L) {
                uniffiCleanable?.clean()
            }
        }
    }

    @Synchronized
    override fun close() {
        this.destroy()
    }

    // Use a static inner class instead of a closure so as not to accidentally
    // capture `this` as part of the cleanable's action.
    private class UniffiCleanAction(private val uniffiHandle: kotlin.Long) : Runnable {
        override fun run() {
            if (uniffiHandle == 0.toLong()) {
                // Fake object created with `NoHandle`, don't try to free.
                return;
            }
            mozilla.appservices.remotesettings.uniffi.Scaffolding.objectFree339(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.remotesettings.uniffi.Scaffolding.objectCloneHandle339(uniffiHandle)
    }

    override public fun `collectionName`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientCollectionName(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotesettings.uniffi.liftString(uniffiReturn)
    }
    override public fun `getAttachment`(`record`: mozilla.appservices.remotesettings.`RemoteSettingsRecord`): kotlin.ByteArray {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerType332(`record`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientGetAttachment(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
    )
    return mozilla.appservices.remotesettings.uniffi.liftBytes(uniffiReturn)
    }
    override public fun `getLastModifiedTimestamp`(): kotlin.ULong? {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientGetLastModifiedTimestamp(
        uniffiArgLowered0,
    )
    return uniffiReturn

    }
    override public fun `getRecords`(`syncIfEmpty`: kotlin.Boolean): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>? {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerBoolean(`syncIfEmpty`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientGetRecords(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getRecordsMap`(`syncIfEmpty`: kotlin.Boolean): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>? {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerBoolean(`syncIfEmpty`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientGetRecordsMap(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `resetStorage`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientResetStorage(
        uniffiArgLowered0,
    )
    }
    override public fun `shutdown`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientShutdown(
        uniffiArgLowered0,
    )
    }
    override public fun `sync`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef339(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsClientSync(
        uniffiArgLowered0,
    )
    }
    
    

    companion object {
        
    }
}
// This template implements a class for working with a Rust struct via a handle
// to the live Rust struct on the other side of the FFI.
//
// There's some subtlety here, because we have to be careful not to operate on a Rust
// struct after it has been dropped, and because we must expose a public API for freeing
// theq Kotlin wrapper object in lieu of reliable finalizers. The core requirements are:
//
//   * Each instance holds an opaque handle to the underlying Rust struct.
//     Method calls need to read this handle from the object's state and pass it in to
//     the Rust FFI.
//
//   * When an instance is no longer needed, its handle should be passed to a
//     special destructor function provided by the Rust FFI, which will drop the
//     underlying Rust struct.
//
//   * Given an instance, calling code is expected to call the special
//     `destroy` method in order to free it after use, either by calling it explicitly
//     or by using a higher-level helper like the `use` method. Failing to do so risks
//     leaking the underlying Rust struct.
//
//   * We can't assume that calling code will do the right thing, and must be prepared
//     to handle Kotlin method calls executing concurrently with or even after a call to
//     `destroy`, and to handle multiple (possibly concurrent!) calls to `destroy`.
//
//   * We must never allow Rust code to operate on the underlying Rust struct after
//     the destructor has been called, and must never call the destructor more than once.
//     Doing so may trigger memory unsafety.
//
//   * To mitigate many of the risks of leaking memory and use-after-free unsafety, a `Cleaner`
//     is implemented to call the destructor when the Kotlin object becomes unreachable.
//     This is done in a background thread. This is not a panacea, and client code should be aware that
//      1. the thread may starve if some there are objects that have poorly performing
//     `drop` methods or do significant work in their `drop` methods.
//      2. the thread is shared across the whole library. This can be tuned by using `android_cleaner = true`,
//         or `android = true` in the [`kotlin` section of the `uniffi.toml` file](https://mozilla.github.io/uniffi-rs/kotlin/configuration.html).
//
// If we try to implement this with mutual exclusion on access to the handle, there is the
// possibility of a race between a method call and a concurrent call to `destroy`:
//
//    * Thread A starts a method call, reads the value of the handle, but is interrupted
//      before it can pass the handle over the FFI to Rust.
//    * Thread B calls `destroy` and frees the underlying Rust struct.
//    * Thread A resumes, passing the already-read handle value to Rust and triggering
//      a use-after-free.
//
// One possible solution would be to use a `ReadWriteLock`, with each method call taking
// a read lock (and thus allowed to run concurrently) and the special `destroy` method
// taking a write lock (and thus blocking on live method calls). However, we aim not to
// generate methods with any hidden blocking semantics, and a `destroy` method that might
// block if called incorrectly seems to meet that bar.
//
// So, we achieve our goals by giving each instance an associated `AtomicLong` counter to track
// the number of in-flight method calls, and an `AtomicBoolean` flag to indicate whether `destroy`
// has been called. These are updated according to the following rules:
//
//    * The initial value of the counter is 1, indicating a live object with no in-flight calls.
//      The initial value for the flag is false.
//
//    * At the start of each method call, we atomically check the counter.
//      If it is 0 then the underlying Rust struct has already been destroyed and the call is aborted.
//      If it is nonzero them we atomically increment it by 1 and proceed with the method call.
//
//    * At the end of each method call, we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
//    * When `destroy` is called, we atomically flip the flag from false to true.
//      If the flag was already true we silently fail.
//      Otherwise we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
// Astute readers may observe that this all sounds very similar to the way that Rust's `Arc<T>` works,
// and indeed it is, with the addition of a flag to guard against multiple calls to `destroy`.
//
// The overall effect is that the underlying Rust struct is destroyed only when `destroy` has been
// called *and* all in-flight method calls have completed, avoiding violating any of the expectations
// of the underlying Rust code.
//
// This makes a cleaner a better alternative to _not_ calling `destroy()` as
// and when the object is finished with, but the abstraction is not perfect: if the Rust object's `drop`
// method is slow, and/or there are many objects to cleanup, and it's on a low end Android device, then the cleaner
// thread may be starved, and the app will leak memory.
//
// In this case, `destroy`ing manually may be a better solution.
//
// The cleaner can live side by side with the manual calling of `destroy`. In the order of responsiveness, uniffi objects
// with Rust peers are reclaimed:
//
// 1. By calling the `destroy` method of the object, which calls `rustObject.free()`. If that doesn't happen:
// 2. When the object becomes unreachable, AND the Cleaner thread gets to call `rustObject.free()`. If the thread is starved then:
// 3. The memory is reclaimed when the process terminates.
//
// [1] https://stackoverflow.com/questions/24376768/can-java-finalize-an-object-when-it-is-still-in-scope/24380219

open class RemoteSettingsTelemetryImpl : RemoteSettingsTelemetry, uniffi.Disposable, AutoCloseable {
    @Suppress("UNUSED_PARAMETER")
    /**
     * @suppress
     */
    constructor(withHandle: uniffi.WithHandle, uniffiHandle: kotlin.Long) {
        this.uniffiHandle = uniffiHandle
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     *
     * This constructor can be used to instantiate a fake object. Only used for tests. Any
     * attempt to actually use an object constructed this way will fail as there is no
     * connected Rust object.
     */
    @Suppress("UNUSED_PARAMETER")
    constructor(noHandle: uniffi.NoHandle) {
        this.uniffiHandle = 0
        this.uniffiCleanable = null
    }

    /**
     * @suppress
     */
    public val uniffiHandle: kotlin.Long
    protected val uniffiCleanable: uniffi.Cleanable?

    private val wasDestroyed = java.util.concurrent.atomic.AtomicBoolean(false)
    private val callCounter = java.util.concurrent.atomic.AtomicLong(1)

    /**
     * Whether the current object has been destroyed and its reference is gone in the Rust side.
     */
    val uniffiIsDestroyed: kotlin.Boolean get() = wasDestroyed.get()

    override fun destroy() {
        // Only allow a single call to this method.
        // TODO: maybe we should log a warning if called more than once?
        if (this.wasDestroyed.compareAndSet(false, true)) {
            // This decrement always matches the initial count of 1 given at creation time.
            if (this.callCounter.decrementAndGet() == 0L) {
                uniffiCleanable?.clean()
            }
        }
    }

    @Synchronized
    override fun close() {
        this.destroy()
    }

    // Use a static inner class instead of a closure so as not to accidentally
    // capture `this` as part of the cleanable's action.
    private class UniffiCleanAction(private val uniffiHandle: kotlin.Long) : Runnable {
        override fun run() {
            if (uniffiHandle == 0.toLong()) {
                // Fake object created with `NoHandle`, don't try to free.
                return;
            }
            mozilla.appservices.remotesettings.uniffi.Scaffolding.objectFree340(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.remotesettings.uniffi.Scaffolding.objectCloneHandle340(uniffiHandle)
    }

    override public fun `reportUptake`(`extras`: mozilla.appservices.remotesettings.`UptakeEventExtras`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectReceiverRef340(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerType341(`extras`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsTelemetryReportUptake(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
    )
    }
    
    

    companion object {
        
    }
}
// This template implements a class for working with a Rust struct via a handle
// to the live Rust struct on the other side of the FFI.
//
// There's some subtlety here, because we have to be careful not to operate on a Rust
// struct after it has been dropped, and because we must expose a public API for freeing
// theq Kotlin wrapper object in lieu of reliable finalizers. The core requirements are:
//
//   * Each instance holds an opaque handle to the underlying Rust struct.
//     Method calls need to read this handle from the object's state and pass it in to
//     the Rust FFI.
//
//   * When an instance is no longer needed, its handle should be passed to a
//     special destructor function provided by the Rust FFI, which will drop the
//     underlying Rust struct.
//
//   * Given an instance, calling code is expected to call the special
//     `destroy` method in order to free it after use, either by calling it explicitly
//     or by using a higher-level helper like the `use` method. Failing to do so risks
//     leaking the underlying Rust struct.
//
//   * We can't assume that calling code will do the right thing, and must be prepared
//     to handle Kotlin method calls executing concurrently with or even after a call to
//     `destroy`, and to handle multiple (possibly concurrent!) calls to `destroy`.
//
//   * We must never allow Rust code to operate on the underlying Rust struct after
//     the destructor has been called, and must never call the destructor more than once.
//     Doing so may trigger memory unsafety.
//
//   * To mitigate many of the risks of leaking memory and use-after-free unsafety, a `Cleaner`
//     is implemented to call the destructor when the Kotlin object becomes unreachable.
//     This is done in a background thread. This is not a panacea, and client code should be aware that
//      1. the thread may starve if some there are objects that have poorly performing
//     `drop` methods or do significant work in their `drop` methods.
//      2. the thread is shared across the whole library. This can be tuned by using `android_cleaner = true`,
//         or `android = true` in the [`kotlin` section of the `uniffi.toml` file](https://mozilla.github.io/uniffi-rs/kotlin/configuration.html).
//
// If we try to implement this with mutual exclusion on access to the handle, there is the
// possibility of a race between a method call and a concurrent call to `destroy`:
//
//    * Thread A starts a method call, reads the value of the handle, but is interrupted
//      before it can pass the handle over the FFI to Rust.
//    * Thread B calls `destroy` and frees the underlying Rust struct.
//    * Thread A resumes, passing the already-read handle value to Rust and triggering
//      a use-after-free.
//
// One possible solution would be to use a `ReadWriteLock`, with each method call taking
// a read lock (and thus allowed to run concurrently) and the special `destroy` method
// taking a write lock (and thus blocking on live method calls). However, we aim not to
// generate methods with any hidden blocking semantics, and a `destroy` method that might
// block if called incorrectly seems to meet that bar.
//
// So, we achieve our goals by giving each instance an associated `AtomicLong` counter to track
// the number of in-flight method calls, and an `AtomicBoolean` flag to indicate whether `destroy`
// has been called. These are updated according to the following rules:
//
//    * The initial value of the counter is 1, indicating a live object with no in-flight calls.
//      The initial value for the flag is false.
//
//    * At the start of each method call, we atomically check the counter.
//      If it is 0 then the underlying Rust struct has already been destroyed and the call is aborted.
//      If it is nonzero them we atomically increment it by 1 and proceed with the method call.
//
//    * At the end of each method call, we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
//    * When `destroy` is called, we atomically flip the flag from false to true.
//      If the flag was already true we silently fail.
//      Otherwise we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
// Astute readers may observe that this all sounds very similar to the way that Rust's `Arc<T>` works,
// and indeed it is, with the addition of a flag to guard against multiple calls to `destroy`.
//
// The overall effect is that the underlying Rust struct is destroyed only when `destroy` has been
// called *and* all in-flight method calls have completed, avoiding violating any of the expectations
// of the underlying Rust code.
//
// This makes a cleaner a better alternative to _not_ calling `destroy()` as
// and when the object is finished with, but the abstraction is not perfect: if the Rust object's `drop`
// method is slow, and/or there are many objects to cleanup, and it's on a low end Android device, then the cleaner
// thread may be starved, and the app will leak memory.
//
// In this case, `destroy`ing manually may be a better solution.
//
// The cleaner can live side by side with the manual calling of `destroy`. In the order of responsiveness, uniffi objects
// with Rust peers are reclaimed:
//
// 1. By calling the `destroy` method of the object, which calls `rustObject.free()`. If that doesn't happen:
// 2. When the object becomes unreachable, AND the Cleaner thread gets to call `rustObject.free()`. If the thread is starved then:
// 3. The memory is reclaimed when the process terminates.
//
// [1] https://stackoverflow.com/questions/24376768/can-java-finalize-an-object-when-it-is-still-in-scope/24380219

open class `RemoteSettingsService` : RemoteSettingsServiceInterface, uniffi.Disposable, AutoCloseable {
    @Suppress("UNUSED_PARAMETER")
    /**
     * @suppress
     */
    constructor(withHandle: uniffi.WithHandle, uniffiHandle: kotlin.Long) {
        this.uniffiHandle = uniffiHandle
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     *
     * This constructor can be used to instantiate a fake object. Only used for tests. Any
     * attempt to actually use an object constructed this way will fail as there is no
     * connected Rust object.
     */
    @Suppress("UNUSED_PARAMETER")
    constructor(noHandle: uniffi.NoHandle) {
        this.uniffiHandle = 0
        this.uniffiCleanable = null
    }
    constructor(`storageDir`: kotlin.String , `config`: mozilla.appservices.remotesettings.`RemoteSettingsConfig`) {
        
        val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerString(`storageDir`)
        val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerType338(`config`)

        val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.constructorRemoteSettingsRemoteSettingsServiceNew(
            uniffiArgLowered0,
            uniffiArgLowered1.v0,
            uniffiArgLowered1.v1,
            uniffiArgLowered1.v2,
            uniffiArgLowered1.v3,
            uniffiArgLowered1.v4,
            uniffiArgLowered1.v5,
            uniffiArgLowered1.v6,
            uniffiArgLowered1.v7,
            uniffiArgLowered1.v8,
            uniffiArgLowered1.v9,
            uniffiArgLowered1.v10,
            uniffiArgLowered1.v11,
            uniffiArgLowered1.v12,
            uniffiArgLowered1.v13,
            uniffiArgLowered1.v14,
            uniffiArgLowered1.v15,
        )
        this.uniffiHandle = uniffiReturn
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     */
    public val uniffiHandle: kotlin.Long
    protected val uniffiCleanable: uniffi.Cleanable?

    private val wasDestroyed = java.util.concurrent.atomic.AtomicBoolean(false)
    private val callCounter = java.util.concurrent.atomic.AtomicLong(1)

    /**
     * Whether the current object has been destroyed and its reference is gone in the Rust side.
     */
    val uniffiIsDestroyed: kotlin.Boolean get() = wasDestroyed.get()

    override fun destroy() {
        // Only allow a single call to this method.
        // TODO: maybe we should log a warning if called more than once?
        if (this.wasDestroyed.compareAndSet(false, true)) {
            // This decrement always matches the initial count of 1 given at creation time.
            if (this.callCounter.decrementAndGet() == 0L) {
                uniffiCleanable?.clean()
            }
        }
    }

    @Synchronized
    override fun close() {
        this.destroy()
    }

    // Use a static inner class instead of a closure so as not to accidentally
    // capture `this` as part of the cleanable's action.
    private class UniffiCleanAction(private val uniffiHandle: kotlin.Long) : Runnable {
        override fun run() {
            if (uniffiHandle == 0.toLong()) {
                // Fake object created with `NoHandle`, don't try to free.
                return;
            }
            mozilla.appservices.remotesettings.uniffi.Scaffolding.objectFree222(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.remotesettings.uniffi.Scaffolding.objectCloneHandle222(uniffiHandle)
    }

    override public fun `clientUrl`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef222(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsServiceClientUrl(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotesettings.uniffi.liftString(uniffiReturn)
    }
    override public fun `makeClient`(`collectionName`: kotlin.String): mozilla.appservices.remotesettings.`RemoteSettingsClient` {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef222(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerString(`collectionName`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsServiceMakeClient(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.remotesettings.uniffi.liftType339(uniffiReturn)
    }
    override public fun `setTelemetry`(`telemetry`: mozilla.appservices.remotesettings.`RemoteSettingsTelemetry`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef222(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerType340(`telemetry`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsServiceSetTelemetry(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `sync`(): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef222(this)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsServiceSync(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotesettings.uniffi.liftType16(uniffiReturn)
    }
    override public fun `updateConfig`(`config`: mozilla.appservices.remotesettings.`RemoteSettingsConfig`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotesettings.uniffi.lowerObjectRef222(this)
    val uniffiArgLowered1 = mozilla.appservices.remotesettings.uniffi.lowerType338(`config`)

    val uniffiReturn = mozilla.appservices.remotesettings.uniffi.Scaffolding.methodRemoteSettingsRemoteSettingsServiceUpdateConfig(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
        uniffiArgLowered1.v10,
        uniffiArgLowered1.v11,
        uniffiArgLowered1.v12,
        uniffiArgLowered1.v13,
        uniffiArgLowered1.v14,
        uniffiArgLowered1.v15,
    )
    }
    
    

    companion object {
        
    }
}