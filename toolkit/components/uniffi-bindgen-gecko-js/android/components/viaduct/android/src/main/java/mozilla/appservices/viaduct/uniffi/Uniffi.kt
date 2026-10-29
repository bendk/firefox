@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.viaduct.uniffi
import kotlinx.coroutines.launch
import uniffi.DeconstructedType137
suspend fun awaitRustFuture457000000461(
    rustFuture: kotlin.Long,
) : mozilla.appservices.viaduct.`Response`
{
    try {
        val completion = CompleteRustFuture457000000461();
        while(true) {
            val futureReady = kotlin.coroutines.suspendCoroutine<kotlin.Boolean> { continuation ->
                val pollResult = Scaffolding.rustFuturePoll457000000461(
                    rustFuture,
                    continuation,
                    completion,
            )
                when (pollResult) {
                    uniffi.UNIFFI_RUST_FUTURE_PENDING -> {
                        // Don't do anything at this point.
                        // The contiunation will be resumed when the Rust waker is called
                        // and Rust calls the `uniffiContinuationResume`
                    }
                    uniffi.UNIFFI_RUST_FUTURE_COMPLETE -> continuation.resumeWith(Result.success(true))
                    uniffi.UNIFFI_RUST_FUTURE_CANCELLED -> continuation.resumeWith(
                        Result.failure(kotlin.coroutines.cancellation.CancellationException())
                    )
                    else -> continuation.resumeWith(
                        Result.failure(uniffi.InternalException("Error polling Rust future (code: $pollResult)"))
                    )
                }
            }
            if (futureReady) {
                return completion.value!!
            }
        }
    } finally {
        Scaffolding.rustFutureFree457000000461(rustFuture)
    }
}
class CompleteRustFuture457000000461 {
    var value: mozilla.appservices.viaduct.`Response`? = null;
    fun complete(
        v0: Int,
        v1: String?,
        v2: Short,
        v3: java.nio.ByteBuffer?,
        v4: kotlin.ByteArray?,
    ) {
        this.value = liftType460(
            v0,
            v1,
            v2,
            v3,
            v4,
        )
    }
}



@JvmName("lowerUInt")
inline fun lowerUInt(value: kotlin.UInt): Int {
    return uniffi.lowerUInt(value)
}

@JvmName("liftUInt")
inline fun liftUInt(
    v1: Int
): kotlin.UInt {
    return uniffi.liftUInt(
        v1
    )
}

inline fun writeUInt(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UInt) {
    uniffi.writeUInt(buf, offset, value)
}

inline fun readUInt(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UInt {
    return uniffi.readUInt(buf, offset)
}





@JvmName("lowerString")
inline fun lowerString(value: kotlin.String): String? {
    return uniffi.lowerString(value)
}

@JvmName("liftString")
inline fun liftString(
    v1: String?
): kotlin.String {
    return uniffi.liftString(
        v1
    )
}

inline fun writeString(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.String) {
    uniffi.writeString(buf, offset, value)
}

inline fun readString(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.String {
    return uniffi.readString(buf, offset)
}





@JvmName("lowerOptionString")
inline fun lowerOptionString(value: kotlin.String?): String? {
    return uniffi.lowerOptionString(value)
}

@JvmName("liftOptionString")
inline fun liftOptionString(
    v1: String?
): kotlin.String? {
    return uniffi.liftOptionString(
        v1
    )
}

inline fun writeType18(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.String?) {
    uniffi.writeType18(buf, offset, value)
}

inline fun readType18(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.String? {
    return uniffi.readType18(buf, offset)
}



// Deconstructed version of ClientSettings
class DeconstructedType464(
    val v0: Int,
    val v1: Int,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType464")
fun lowerType464(rec: mozilla.appservices.viaduct.`ClientSettings`): DeconstructedType464 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerUInt(rec.`timeout`)
    val uniffiFieldLowered1 = lowerUInt(rec.`redirectLimit`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`ohttpChannel`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`userAgent`)
    return DeconstructedType464(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType464")
fun liftType464(
    v0: Int,
    v1: Int,
    v2: String?,
    v3: String?,
): mozilla.appservices.viaduct.`ClientSettings` {
    return mozilla.appservices.viaduct.`ClientSettings`(
        liftUInt(
            v0,
        ),
        liftUInt(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftOptionString(
            v3,
        ),
    )
}

fun writeType464(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`ClientSettings`) {
    writeUInt(buf, offset + 0, value.`timeout`)
    writeUInt(buf, offset + 4, value.`redirectLimit`)
    writeType18(buf, offset + 8, value.`ohttpChannel`)
    writeType18(buf, offset + 40, value.`userAgent`)
}

fun readType464(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`ClientSettings` {
    return mozilla.appservices.viaduct.`ClientSettings`(
        readUInt(buf, offset + 0),
        readUInt(buf, offset + 4),
        readType18(buf, offset + 8),
        readType18(buf, offset + 40),
    )
}

// Deconstructed version of OhttpConfig
class DeconstructedType457(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType457")
fun lowerType457(rec: mozilla.appservices.viaduct.`OhttpConfig`): DeconstructedType457 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`relayUrl`)
    val uniffiFieldLowered1 = lowerString(rec.`gatewayHost`)
    return DeconstructedType457(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType457")
fun liftType457(
    v0: String?,
    v1: String?,
): mozilla.appservices.viaduct.`OhttpConfig` {
    return mozilla.appservices.viaduct.`OhttpConfig`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType457(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`OhttpConfig`) {
    writeString(buf, offset + 0, value.`relayUrl`)
    writeString(buf, offset + 24, value.`gatewayHost`)
}

fun readType457(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`OhttpConfig` {
    return mozilla.appservices.viaduct.`OhttpConfig`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
    )
}

@JvmName("lowerType461")
fun lowerType461(value: mozilla.appservices.viaduct.`Method`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType461")
fun liftType461(value: kotlin.Int): mozilla.appservices.viaduct.`Method` {
    return mozilla.appservices.viaduct.`Method`.values()[value]
}

fun writeType461(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`Method`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType461(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`Method` {
    return liftType461(readInt(buf, offset))
}


@JvmName("lowerType462")
fun lowerType462(value: mozilla.appservices.viaduct.`ViaductUrl`): String? {
    return lowerString(value)
}

@JvmName("liftType462")
fun liftType462(
    v0: String?,
): mozilla.appservices.viaduct.`ViaductUrl` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType462(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`ViaductUrl`) {
    writeString(buf, offset, value)
}

fun readType462(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`ViaductUrl` {
    val builtinValue = readString(buf, offset)
    return builtinValue
}



@JvmName("lowerType131")
inline fun lowerType131(value: kotlin.collections.Map<kotlin.String, kotlin.String>): java.nio.ByteBuffer? {
    return uniffi.lowerType131(value)
}

@JvmName("liftType131")
inline fun liftType131(
    v1: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.String, kotlin.String> {
    return uniffi.liftType131(
        v1
    )
}

inline fun writeType131(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.String>) {
    uniffi.writeType131(buf, offset, value)
}

inline fun readType131(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.String> {
    return uniffi.readType131(buf, offset)
}




@JvmName("lowerType463")
fun lowerType463(value: mozilla.appservices.viaduct.`Headers`): java.nio.ByteBuffer? {
    return lowerType131(value)
}

@JvmName("liftType463")
fun liftType463(
    v0: java.nio.ByteBuffer?,
): mozilla.appservices.viaduct.`Headers` {
    val builtinValue = liftType131(
        v0,
    )
    return builtinValue
}

fun writeType463(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`Headers`) {
    writeType131(buf, offset, value)
}

fun readType463(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`Headers` {
    val builtinValue = readType131(buf, offset)
    return builtinValue
}



@JvmName("lowerBytes")
inline fun lowerBytes(value: kotlin.ByteArray): kotlin.ByteArray? {
    return uniffi.lowerBytes(value)
}

@JvmName("liftBytes")
inline fun liftBytes(
    v1: kotlin.ByteArray?
): kotlin.ByteArray {
    return uniffi.liftBytes(
        v1
    )
}

inline fun writeBytes(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ByteArray) {
    uniffi.writeBytes(buf, offset, value)
}

inline fun readBytes(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ByteArray {
    return uniffi.readBytes(buf, offset)
}





@JvmName("lowerType137")
inline fun lowerType137(value: kotlin.ByteArray?): DeconstructedType137 {
    return uniffi.lowerType137(value)
}

@JvmName("liftType137")
inline fun liftType137(
    v1: Boolean,
    v2: kotlin.ByteArray?
): kotlin.ByteArray? {
    return uniffi.liftType137(
        v1,
        v2
    )
}

inline fun writeType137(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ByteArray?) {
    uniffi.writeType137(buf, offset, value)
}

inline fun readType137(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ByteArray? {
    return uniffi.readType137(buf, offset)
}



// Deconstructed version of Request
class DeconstructedType459(
    val v0: Int,
    val v1: String?,
    val v2: java.nio.ByteBuffer?,
    val v3: Boolean,
    val v4: kotlin.ByteArray?,
)

@JvmName("lowerType459")
fun lowerType459(rec: mozilla.appservices.viaduct.`Request`): DeconstructedType459 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType461(rec.`method`)
    val uniffiFieldLowered1 = lowerType462(rec.`url`)
    val uniffiFieldLowered2 = lowerType463(rec.`headers`)
    val uniffiFieldLowered3 = lowerType137(rec.`body`)
    return DeconstructedType459(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
    )
}

@JvmName("liftType459")
fun liftType459(
    v0: Int,
    v1: String?,
    v2: java.nio.ByteBuffer?,
    v3: Boolean,
    v4: kotlin.ByteArray?,
): mozilla.appservices.viaduct.`Request` {
    return mozilla.appservices.viaduct.`Request`(
        liftType461(
            v0,
        ),
        liftType462(
            v1,
        ),
        liftType463(
            v2,
        ),
        liftType137(
            v3,
            v4,
        ),
    )
}

fun writeType459(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`Request`) {
    writeType461(buf, offset + 0, value.`method`)
    writeType462(buf, offset + 8, value.`url`)
    writeType463(buf, offset + 32, value.`headers`)
    writeType137(buf, offset + 48, value.`body`)
}

fun readType459(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`Request` {
    return mozilla.appservices.viaduct.`Request`(
        readType461(buf, offset + 0),
        readType462(buf, offset + 8),
        readType463(buf, offset + 32),
        readType137(buf, offset + 48),
    )
}



@JvmName("lowerUShort")
inline fun lowerUShort(value: kotlin.UShort): Short {
    return uniffi.lowerUShort(value)
}

@JvmName("liftUShort")
inline fun liftUShort(
    v1: Short
): kotlin.UShort {
    return uniffi.liftUShort(
        v1
    )
}

inline fun writeUShort(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UShort) {
    uniffi.writeUShort(buf, offset, value)
}

inline fun readUShort(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UShort {
    return uniffi.readUShort(buf, offset)
}



// Deconstructed version of Response
class DeconstructedType460(
    val v0: Int,
    val v1: String?,
    val v2: Short,
    val v3: java.nio.ByteBuffer?,
    val v4: kotlin.ByteArray?,
)

@JvmName("lowerType460")
fun lowerType460(rec: mozilla.appservices.viaduct.`Response`): DeconstructedType460 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType461(rec.`requestMethod`)
    val uniffiFieldLowered1 = lowerType462(rec.`url`)
    val uniffiFieldLowered2 = lowerUShort(rec.`status`)
    val uniffiFieldLowered3 = lowerType463(rec.`headers`)
    val uniffiFieldLowered4 = lowerBytes(rec.`body`)
    return DeconstructedType460(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType460")
fun liftType460(
    v0: Int,
    v1: String?,
    v2: Short,
    v3: java.nio.ByteBuffer?,
    v4: kotlin.ByteArray?,
): mozilla.appservices.viaduct.`Response` {
    return mozilla.appservices.viaduct.`Response`(
        liftType461(
            v0,
        ),
        liftType462(
            v1,
        ),
        liftUShort(
            v2,
        ),
        liftType463(
            v3,
        ),
        liftBytes(
            v4,
        ),
    )
}

fun writeType460(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`Response`) {
    writeType461(buf, offset + 0, value.`requestMethod`)
    writeType462(buf, offset + 8, value.`url`)
    writeUShort(buf, offset + 32, value.`status`)
    writeType463(buf, offset + 40, value.`headers`)
    writeBytes(buf, offset + 56, value.`body`)
}

fun readType460(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`Response` {
    return mozilla.appservices.viaduct.`Response`(
        readType461(buf, offset + 0),
        readType462(buf, offset + 8),
        readUShort(buf, offset + 32),
        readType463(buf, offset + 40),
        readBytes(buf, offset + 56),
    )
}

// Deconstructed version of ViaductError
class DeconstructedType456(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType456")
fun lowerType456(value: mozilla.appservices.viaduct.`ViaductException`): DeconstructedType456 {
    when (value) {
        is mozilla.appservices.viaduct.`ViaductException`.`RequestHeaderException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`BackendException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`NetworkException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`BackendAlreadyInitialized` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType456(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`BackendNotInitialized` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            return DeconstructedType456(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`SetBackendException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            return DeconstructedType456(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`UrlException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 6
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`NonTlsUrl` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 7
            return DeconstructedType456(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpChannelNotConfigured` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 8
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpConfigFetchFailed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 9
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpRequestException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 10
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpResponseException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 11
            val uniffiFieldLowered1 = lowerString(value.v1)
            return DeconstructedType456(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpNotSupported` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 12
            return DeconstructedType456(
                uniffiFieldLowered0,
                null,
            )
        }
    }
}

@JvmName("liftType456")
fun liftType456(
    v0: Int,
    v1: String?,
): mozilla.appservices.viaduct.`ViaductException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`RequestHeaderException`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`BackendException`(
                liftString(
                    v1,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`NetworkException`(
                liftString(
                    v1,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`BackendAlreadyInitialized`(
            )
        }
        4 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`BackendNotInitialized`(
            )
        }
        5 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`SetBackendException`(
            )
        }
        6 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`UrlException`(
                liftString(
                    v1,
                ),
            )
        }
        7 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`NonTlsUrl`(
            )
        }
        8 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`OhttpChannelNotConfigured`(
                liftString(
                    v1,
                ),
            )
        }
        9 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`OhttpConfigFetchFailed`(
                liftString(
                    v1,
                ),
            )
        }
        10 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`OhttpRequestException`(
                liftString(
                    v1,
                ),
            )
        }
        11 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`OhttpResponseException`(
                liftString(
                    v1,
                ),
            )
        }
        12 -> {
            return mozilla.appservices.viaduct.`ViaductException`.`OhttpNotSupported`(
            )
        }
        else -> {
            throw uniffi.InternalException("liftType456: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType456(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`ViaductException`) {
    when (value) {
        is mozilla.appservices.viaduct.`ViaductException`.`RequestHeaderException` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`BackendException` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`NetworkException` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`BackendAlreadyInitialized` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.viaduct.`ViaductException`.`BackendNotInitialized` -> {
            writeInt(buf, offset, 4);
        }
        is mozilla.appservices.viaduct.`ViaductException`.`SetBackendException` -> {
            writeInt(buf, offset, 5);
        }
        is mozilla.appservices.viaduct.`ViaductException`.`UrlException` -> {
            writeInt(buf, offset, 6);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`NonTlsUrl` -> {
            writeInt(buf, offset, 7);
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpChannelNotConfigured` -> {
            writeInt(buf, offset, 8);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpConfigFetchFailed` -> {
            writeInt(buf, offset, 9);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpRequestException` -> {
            writeInt(buf, offset, 10);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpResponseException` -> {
            writeInt(buf, offset, 11);
            writeString(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.viaduct.`ViaductException`.`OhttpNotSupported` -> {
            writeInt(buf, offset, 12);
        }
    }
}

fun readType456(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`ViaductException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.viaduct.`ViaductException`.`RequestHeaderException`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.viaduct.`ViaductException`.`BackendException`(
                readString(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.viaduct.`ViaductException`.`NetworkException`(
                readString(buf, offset + 8),
            )
        }
        3 -> {
            mozilla.appservices.viaduct.`ViaductException`.`BackendAlreadyInitialized`(
            )
        }
        4 -> {
            mozilla.appservices.viaduct.`ViaductException`.`BackendNotInitialized`(
            )
        }
        5 -> {
            mozilla.appservices.viaduct.`ViaductException`.`SetBackendException`(
            )
        }
        6 -> {
            mozilla.appservices.viaduct.`ViaductException`.`UrlException`(
                readString(buf, offset + 8),
            )
        }
        7 -> {
            mozilla.appservices.viaduct.`ViaductException`.`NonTlsUrl`(
            )
        }
        8 -> {
            mozilla.appservices.viaduct.`ViaductException`.`OhttpChannelNotConfigured`(
                readString(buf, offset + 8),
            )
        }
        9 -> {
            mozilla.appservices.viaduct.`ViaductException`.`OhttpConfigFetchFailed`(
                readString(buf, offset + 8),
            )
        }
        10 -> {
            mozilla.appservices.viaduct.`ViaductException`.`OhttpRequestException`(
                readString(buf, offset + 8),
            )
        }
        11 -> {
            mozilla.appservices.viaduct.`ViaductException`.`OhttpResponseException`(
                readString(buf, offset + 8),
            )
        }
        12 -> {
            mozilla.appservices.viaduct.`ViaductException`.`OhttpNotSupported`(
            )
        }
        else -> {
            throw uniffi.InternalException("liftType456: Invalid enum discriminant: ${discriminant}")
        }
    }
}

fun objectToHandle458(obj: mozilla.appservices.viaduct.`Backend`): kotlin.Long {
    if (obj is mozilla.appservices.viaduct.BackendImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap458.insert(obj)
    }
}

fun handleToObject458(handle: kotlin.Long): mozilla.appservices.viaduct.`Backend` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return mozilla.appservices.viaduct.BackendImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap458.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef458")
fun lowerObjectReceiverRef458(value: mozilla.appservices.viaduct.BackendImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType458")
fun lowerType458(value: mozilla.appservices.viaduct.`Backend`): kotlin.Long {
    return objectToHandle458(value)
}

@JvmName("liftType458")
fun liftType458(handle: kotlin.Long): mozilla.appservices.viaduct.`Backend` {
    return handleToObject458(handle)
}

fun writeType458(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.viaduct.`Backend`) {
    writeLong(buf, offset, objectToHandle458(value))
}

fun readType458(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.viaduct.`Backend` {
    return handleToObject458(readLong(buf, offset))
}


public val callbackInterfaceHandleMap458 = uniffi.HandleMap<mozilla.appservices.viaduct.`Backend`>();
fun callbackInterfaceDispatch458000000(
    uniffiHandle: kotlin.Long,
    uniffiOneshotHandle: kotlin.Long,
    `uniffiArg1`: Int,
    `uniffiArg2`: String?,
    `uniffiArg3`: java.nio.ByteBuffer?,
    `uniffiArg4`: Boolean,
    `uniffiArg5`: kotlin.ByteArray?,
    `uniffiArg6`: Int,
    `uniffiArg7`: Int,
    `uniffiArg8`: String?,
    `uniffiArg9`: String?,
) {
    // Using `GlobalScope` is labeled as a "delicate API" and generally discouraged in Kotlin programs, since it breaks structured concurrency.
    // However, our parent task is a Rust future, so we're going to need to break structure concurrency in any case.
    //
    // Uniffi does its best to support structured concurrency across the FFI.
    // If the Rust future is dropped, `uniffiForeignFutureDroppedCallbackImpl` is called, which will cancel the Kotlin coroutine if it's still running.
    @OptIn(kotlinx.coroutines.DelicateCoroutinesApi::class)
    kotlinx.coroutines.GlobalScope.launch uniffiCoroutineBlock@ {
        try {
            val uniffiObj = callbackInterfaceHandleMap458.get(uniffiHandle)
            val `request` = liftType459(
                `uniffiArg1`,
                `uniffiArg2`,
                `uniffiArg3`,
                `uniffiArg4`,
                `uniffiArg5`,
            )
            val `settings` = liftType464(
                `uniffiArg6`,
                `uniffiArg7`,
                `uniffiArg8`,
                `uniffiArg9`,
            )
            val uniffiReturn = try {
                uniffiObj.`sendRequest`(
                    `request`,
                    `settings`,
                )
            } catch(uniffiErr: mozilla.appservices.viaduct.`ViaductException`) {
                val uniffiErrLowered = lowerType456(uniffiErr)
                Scaffolding.completeKotlinFutureErr457000000461(
                    uniffiOneshotHandle,
                    uniffiErrLowered.v0,
                    uniffiErrLowered.v1,
                )
                return@uniffiCoroutineBlock Unit
            }
            val uniffiReturnLowered = lowerType460(uniffiReturn)
            Scaffolding.completeKotlinFuture457000000461(
                uniffiOneshotHandle,
                uniffiReturnLowered.v0,
                uniffiReturnLowered.v1,
                uniffiReturnLowered.v2,
                uniffiReturnLowered.v3,
                uniffiReturnLowered.v4,
            )
        } catch(e: Throwable) {
            Scaffolding.completeKotlinFutureUnexpectedErr457000000461(uniffiOneshotHandle)
        }
    }
}

fun callbackInterfaceFree458(handle: kotlin.Long) {
    callbackInterfaceHandleMap458.remove(handle)
}



@JvmName("lowerType16")
inline fun lowerType16(value: kotlin.collections.List<kotlin.String>): java.nio.ByteBuffer? {
    return uniffi.lowerType16(value)
}

@JvmName("liftType16")
inline fun liftType16(
    v1: java.nio.ByteBuffer?
): kotlin.collections.List<kotlin.String> {
    return uniffi.liftType16(
        v1
    )
}

inline fun writeType16(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.String>) {
    uniffi.writeType16(buf, offset, value)
}

inline fun readType16(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.String> {
    return uniffi.readType16(buf, offset)
}





@JvmName("lowerUByte")
inline fun lowerUByte(value: kotlin.UByte): Byte {
    return uniffi.lowerUByte(value)
}

@JvmName("liftUByte")
inline fun liftUByte(
    v1: Byte
): kotlin.UByte {
    return uniffi.liftUByte(
        v1
    )
}

inline fun writeUByte(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UByte) {
    uniffi.writeUByte(buf, offset, value)
}

inline fun readUByte(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UByte {
    return uniffi.readUByte(buf, offset)
}





@JvmName("lowerByte")
inline fun lowerByte(value: kotlin.Byte): Byte {
    return uniffi.lowerByte(value)
}

@JvmName("liftByte")
inline fun liftByte(
    v1: Byte
): kotlin.Byte {
    return uniffi.liftByte(
        v1
    )
}

inline fun writeByte(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Byte) {
    uniffi.writeByte(buf, offset, value)
}

inline fun readByte(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Byte {
    return uniffi.readByte(buf, offset)
}





@JvmName("lowerShort")
inline fun lowerShort(value: kotlin.Short): Short {
    return uniffi.lowerShort(value)
}

@JvmName("liftShort")
inline fun liftShort(
    v1: Short
): kotlin.Short {
    return uniffi.liftShort(
        v1
    )
}

inline fun writeShort(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Short) {
    uniffi.writeShort(buf, offset, value)
}

inline fun readShort(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Short {
    return uniffi.readShort(buf, offset)
}





@JvmName("lowerInt")
inline fun lowerInt(value: kotlin.Int): Int {
    return uniffi.lowerInt(value)
}

@JvmName("liftInt")
inline fun liftInt(
    v1: Int
): kotlin.Int {
    return uniffi.liftInt(
        v1
    )
}

inline fun writeInt(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Int) {
    uniffi.writeInt(buf, offset, value)
}

inline fun readInt(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Int {
    return uniffi.readInt(buf, offset)
}





@JvmName("lowerULong")
inline fun lowerULong(value: kotlin.ULong): Long {
    return uniffi.lowerULong(value)
}

@JvmName("liftULong")
inline fun liftULong(
    v1: Long
): kotlin.ULong {
    return uniffi.liftULong(
        v1
    )
}

inline fun writeULong(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ULong) {
    uniffi.writeULong(buf, offset, value)
}

inline fun readULong(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ULong {
    return uniffi.readULong(buf, offset)
}





@JvmName("lowerLong")
inline fun lowerLong(value: kotlin.Long): Long {
    return uniffi.lowerLong(value)
}

@JvmName("liftLong")
inline fun liftLong(
    v1: Long
): kotlin.Long {
    return uniffi.liftLong(
        v1
    )
}

inline fun writeLong(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Long) {
    uniffi.writeLong(buf, offset, value)
}

inline fun readLong(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Long {
    return uniffi.readLong(buf, offset)
}





@JvmName("lowerFloat")
inline fun lowerFloat(value: kotlin.Float): Float {
    return uniffi.lowerFloat(value)
}

@JvmName("liftFloat")
inline fun liftFloat(
    v1: Float
): kotlin.Float {
    return uniffi.liftFloat(
        v1
    )
}

inline fun writeFloat(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Float) {
    uniffi.writeFloat(buf, offset, value)
}

inline fun readFloat(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Float {
    return uniffi.readFloat(buf, offset)
}





@JvmName("lowerDouble")
inline fun lowerDouble(value: kotlin.Double): Double {
    return uniffi.lowerDouble(value)
}

@JvmName("liftDouble")
inline fun liftDouble(
    v1: Double
): kotlin.Double {
    return uniffi.liftDouble(
        v1
    )
}

inline fun writeDouble(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Double) {
    uniffi.writeDouble(buf, offset, value)
}

inline fun readDouble(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Double {
    return uniffi.readDouble(buf, offset)
}




inline fun lowerBytesRef(v: java.nio.ByteBuffer): java.nio.ByteBuffer? {
    return uniffi.lowerBytesRef(v)
}

object Scaffolding {
    init {
        // Reference uniffi.Scaffolding to ensure it's init() function runs
        @Suppress("UNUSED_EXPRESSION")
        uniffi.Scaffolding
    }
    @JvmName("functionViaductAllowAndroidEmulatorLoopback")
    @JvmStatic external fun functionViaductAllowAndroidEmulatorLoopback(
    )
    @JvmName("functionViaductClearOhttpChannels")
    @JvmStatic external fun functionViaductClearOhttpChannels(
    )
    @JvmName("functionViaductConfigureDefaultOhttpChannels")
    @JvmStatic external fun functionViaductConfigureDefaultOhttpChannels(
    )
    @JvmName("functionViaductConfigureOhttpChannel")
    @JvmStatic external fun functionViaductConfigureOhttpChannel(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    )
    @JvmName("functionViaductInitBackend")
    @JvmStatic external fun functionViaductInitBackend(
        `uniffiArg0`: Long,
    )
    @JvmName("functionViaductListOhttpChannels")
    @JvmStatic external fun functionViaductListOhttpChannels(
    ) : java.nio.ByteBuffer?
    @JvmName("functionViaductSendOhttpRequest")
    @JvmStatic external fun functionViaductSendOhttpRequest(
        `uniffiArg0`: Int,
        `uniffiArg1`: String?,
        `uniffiArg2`: java.nio.ByteBuffer?,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: kotlin.ByteArray?,
        `uniffiArg5`: String?,
    ) : kotlin.Long
    @JvmName("functionViaductSetGlobalDefaultUserAgent")
    @JvmStatic external fun functionViaductSetGlobalDefaultUserAgent(
        `uniffiArg0`: String?,
    )
    @JvmName("methodViaductBackendSendRequest")
    @JvmStatic external fun methodViaductBackendSendRequest(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: kotlin.ByteArray?,
        `uniffiArg6`: Int,
        `uniffiArg7`: Int,
        `uniffiArg8`: String?,
        `uniffiArg9`: String?,
    ) : kotlin.Long
    @JvmStatic external fun objectCloneHandle458(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree458(handle: kotlin.Long)
    @JvmStatic external fun rustFuturePoll457000000461(
        rustFuture: kotlin.Long,
        continuation: kotlin.coroutines.Continuation<kotlin.Boolean>,
        completion: CompleteRustFuture457000000461,
    ): Int
    @JvmStatic external fun rustFutureCancel457000000461(rustFuture: kotlin.Long)
    @JvmStatic external fun rustFutureFree457000000461(rustFuture: kotlin.Long)
    @JvmStatic external fun completeKotlinFuture457000000461(
        oneshotHandle: kotlin.Long,
        v0: Int,
        v1: String?,
        v2: Short,
        v3: java.nio.ByteBuffer?,
        v4: kotlin.ByteArray?,
    )
    @JvmStatic external fun completeKotlinFutureErr457000000461(
        oneshotHandle: kotlin.Long,
        v0: Int,
        v1: String?,
    )
    @JvmStatic external fun completeKotlinFutureUnexpectedErr457000000461(
        oneshotHandle: kotlin.Long,
    )
}