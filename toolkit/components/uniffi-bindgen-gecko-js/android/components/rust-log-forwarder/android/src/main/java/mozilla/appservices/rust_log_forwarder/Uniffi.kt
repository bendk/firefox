package mozilla.appservices.rust_log_forwarder
public interface `AppServicesLogger` {
    fun `log`(`record`: mozilla.appservices.rust_log_forwarder.`Record`): Unit
    
}

enum class `Level` {
    `ERROR`,`WARN`,`INFO`,`DEBUG`,`TRACE`;

    companion object
}

data class `Record` (
    var `level`: mozilla.appservices.rust_log_forwarder.`Level`,
    var `target`: kotlin.String,
    var `message`: kotlin.String,
) {
    

    companion object
}
public fun `setLogger`(`logger`: mozilla.appservices.rust_log_forwarder.`AppServicesLogger`?): Unit {
    val uniffiArgLowered0 = mozilla.appservices.rust_log_forwarder.uniffi.lowerType342(`logger`)

    val uniffiReturn = mozilla.appservices.rust_log_forwarder.uniffi.Scaffolding.functionRustLogForwarderSetLogger(
        uniffiArgLowered0,
    )
}
public fun `setMaxLevel`(`level`: mozilla.appservices.rust_log_forwarder.`Level`): Unit {
    val uniffiArgLowered0 = mozilla.appservices.rust_log_forwarder.uniffi.lowerType344(`level`)

    val uniffiReturn = mozilla.appservices.rust_log_forwarder.uniffi.Scaffolding.functionRustLogForwarderSetMaxLevel(
        uniffiArgLowered0,
    )
}