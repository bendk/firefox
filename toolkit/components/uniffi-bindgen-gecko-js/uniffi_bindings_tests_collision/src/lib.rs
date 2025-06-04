uniffi::setup_scaffolding!("uniffi_bindings_tests_collision");

// Same name as in uniffi_bindings_tests!
#[uniffi::export(callback_interface)]
pub trait TestCallbackInterface {
    fn get_value(&self) -> String;
}

#[uniffi::export]
pub fn invoke_collision_callback(cb: Box<dyn TestCallbackInterface>) -> String {
    cb.get_value()
}