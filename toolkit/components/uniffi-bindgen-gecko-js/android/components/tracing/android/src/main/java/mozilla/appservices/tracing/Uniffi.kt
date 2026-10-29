package mozilla.appservices.tracing
public interface `EventSink` {
    fun `onEvent`(`event`: mozilla.appservices.tracing.`TracingEvent`): Unit
    
}

enum class `TracingLevel` {
    `ERROR`,`WARN`,`INFO`,`DEBUG`,`TRACE`;

    companion object
}

data class `EventTarget` (
    var `target`: kotlin.String,
    var `level`: mozilla.appservices.tracing.`TracingLevel`,
) {
    

    companion object
}

data class `EventSinkSpecification` (
    var `targets`: kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`> = emptyList(),
    var `minLevel`: mozilla.appservices.tracing.`TracingLevel`? = null,
) {
    

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `TracingJsonValue` = kotlin.String

data class `TracingEvent` (
    var `level`: mozilla.appservices.tracing.`TracingLevel`,
    var `target`: kotlin.String,
    var `name`: kotlin.String,
    var `message`: kotlin.String,
    var `fields`: mozilla.appservices.tracing.`TracingJsonValue`,
) {
    

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `EventSinkId` = kotlin.UInt
public fun `registerEventSink`(`targets`: mozilla.appservices.tracing.`EventSinkSpecification` , `sink`: mozilla.appservices.tracing.`EventSink`): mozilla.appservices.tracing.`EventSinkId` {
    val uniffiArgLowered0 = mozilla.appservices.tracing.uniffi.lowerType447(`targets`)
    val uniffiArgLowered1 = mozilla.appservices.tracing.uniffi.lowerType448(`sink`)

    val uniffiReturn = mozilla.appservices.tracing.uniffi.Scaffolding.functionTracingSupportRegisterEventSink(
        uniffiArgLowered0.v0,
        uniffiArgLowered0.v1,
        uniffiArgLowered0.v2,
        uniffiArgLowered1,
    )
    return mozilla.appservices.tracing.uniffi.liftType449(uniffiReturn)
}
public fun `unregisterEventSink`(`id`: mozilla.appservices.tracing.`EventSinkId`): Unit {
    val uniffiArgLowered0 = mozilla.appservices.tracing.uniffi.lowerType449(`id`)

    val uniffiReturn = mozilla.appservices.tracing.uniffi.Scaffolding.functionTracingSupportUnregisterEventSink(
        uniffiArgLowered0,
    )
}