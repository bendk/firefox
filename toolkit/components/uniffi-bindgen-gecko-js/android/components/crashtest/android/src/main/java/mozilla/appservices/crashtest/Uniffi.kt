package mozilla.appservices.crashtest

sealed class `CrashTestException`(message: kotlin.String) : kotlin.Exception(message) {
    class `ErrorFromTheRustCode`(message: kotlin.String) : `CrashTestException`(message)

    companion object
}
public fun `triggerRustAbort`(): Unit {

    val uniffiReturn = mozilla.appservices.crashtest.uniffi.Scaffolding.functionCrashtestTriggerRustAbort(
    )
}
public fun `triggerRustError`(): Unit {

    val uniffiReturn = mozilla.appservices.crashtest.uniffi.Scaffolding.functionCrashtestTriggerRustError(
    )
}
public fun `triggerRustPanic`(): Unit {

    val uniffiReturn = mozilla.appservices.crashtest.uniffi.Scaffolding.functionCrashtestTriggerRustPanic(
    )
}