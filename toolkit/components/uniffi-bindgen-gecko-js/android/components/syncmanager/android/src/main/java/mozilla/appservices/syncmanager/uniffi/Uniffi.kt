@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.syncmanager.uniffi
import uniffi.DeconstructedType99
import uniffi.DeconstructedType425
import uniffi.DeconstructedType424
import mozilla.appservices.sync15.uniffi.DeconstructedType420



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



// Deconstructed version of DeviceSettings
class DeconstructedType422(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: java.nio.ByteBuffer?,
)

@JvmName("lowerType422")
fun lowerType422(rec: mozilla.appservices.syncmanager.`DeviceSettings`): DeconstructedType422 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`fxaDeviceId`)
    val uniffiFieldLowered1 = lowerString(rec.`name`)
    val uniffiFieldLowered2 = lowerType98(rec.`kind`)
    val uniffiFieldLowered3 = lowerType16(rec.`enabledEngines`)
    return DeconstructedType422(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType422")
fun liftType422(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: java.nio.ByteBuffer?,
): mozilla.appservices.syncmanager.`DeviceSettings` {
    return mozilla.appservices.syncmanager.`DeviceSettings`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType98(
            v2,
        ),
        liftType16(
            v3,
        ),
    )
}

fun writeType422(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`DeviceSettings`) {
    writeString(buf, offset + 0, value.`fxaDeviceId`)
    writeString(buf, offset + 24, value.`name`)
    writeType98(buf, offset + 48, value.`kind`)
    writeType16(buf, offset + 56, value.`enabledEngines`)
}

fun readType422(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`DeviceSettings` {
    return mozilla.appservices.syncmanager.`DeviceSettings`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType98(buf, offset + 48),
        readType16(buf, offset + 56),
    )
}

// Deconstructed version of SyncAuthInfo
class DeconstructedType421(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType421")
fun lowerType421(rec: mozilla.appservices.syncmanager.`SyncAuthInfo`): DeconstructedType421 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`kid`)
    val uniffiFieldLowered1 = lowerString(rec.`fxaAccessToken`)
    val uniffiFieldLowered2 = lowerString(rec.`syncKey`)
    val uniffiFieldLowered3 = lowerString(rec.`tokenserverUrl`)
    return DeconstructedType421(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType421")
fun liftType421(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
): mozilla.appservices.syncmanager.`SyncAuthInfo` {
    return mozilla.appservices.syncmanager.`SyncAuthInfo`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
            v3,
        ),
    )
}

fun writeType421(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`SyncAuthInfo`) {
    writeString(buf, offset + 0, value.`kid`)
    writeString(buf, offset + 24, value.`fxaAccessToken`)
    writeString(buf, offset + 48, value.`syncKey`)
    writeString(buf, offset + 72, value.`tokenserverUrl`)
}

fun readType421(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncAuthInfo` {
    return mozilla.appservices.syncmanager.`SyncAuthInfo`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
    )
}

@JvmName("lowerType418")
fun lowerType418(value: mozilla.appservices.syncmanager.`SyncReason`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType418")
fun liftType418(value: kotlin.Int): mozilla.appservices.syncmanager.`SyncReason` {
    return mozilla.appservices.syncmanager.`SyncReason`.values()[value]
}

fun writeType418(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`SyncReason`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType418(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncReason` {
    return liftType418(readInt(buf, offset))
}

// Deconstructed version of SyncEngineSelection
class DeconstructedType419(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType419")
fun lowerType419(value: mozilla.appservices.syncmanager.`SyncEngineSelection`): DeconstructedType419 {
    when (value) {
        is mozilla.appservices.syncmanager.`SyncEngineSelection`.`All` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType419(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.syncmanager.`SyncEngineSelection`.`Some` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerType16(value.`engines`)
            return DeconstructedType419(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType419")
fun liftType419(
    v0: Int,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.syncmanager.`SyncEngineSelection` {
    when (v0) {
        0 -> {
            return mozilla.appservices.syncmanager.`SyncEngineSelection`.`All`
        }
        1 -> {
            return mozilla.appservices.syncmanager.`SyncEngineSelection`.`Some`(
                liftType16(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType419: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType419(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`SyncEngineSelection`) {
    when (value) {
        is mozilla.appservices.syncmanager.`SyncEngineSelection`.`All` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.syncmanager.`SyncEngineSelection`.`Some` -> {
            writeInt(buf, offset, 1);
            writeType16(buf, offset + 8, value.`engines`)
        }
    }
}

fun readType419(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncEngineSelection` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.syncmanager.`SyncEngineSelection`.`All`
        }
        1 -> {
            mozilla.appservices.syncmanager.`SyncEngineSelection`.`Some`(
                readType16(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType419: Invalid enum discriminant: ${discriminant}")
        }
    }
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



// Deconstructed version of SyncParams
class DeconstructedType426(
    val v0: Int,
    val v1: Int,
    val v2: java.nio.ByteBuffer?,
    val v3: Int,
    val v4: java.nio.ByteBuffer?,
    val v5: java.nio.ByteBuffer?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: Int,
    val v14: java.nio.ByteBuffer?,
)

@JvmName("lowerType426")
fun lowerType426(rec: mozilla.appservices.syncmanager.`SyncParams`): DeconstructedType426 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType418(rec.`reason`)
    val uniffiFieldLowered1 = lowerType419(rec.`engines`)
    val uniffiFieldLowered2 = lowerType420(rec.`engineChoicesModel`)
    val uniffiFieldLowered3 = lowerType131(rec.`localEncryptionKeys`)
    val uniffiFieldLowered4 = lowerType421(rec.`authInfo`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`persistedState`)
    val uniffiFieldLowered6 = lowerType422(rec.`deviceSettings`)
    return DeconstructedType426(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered4.v2,
        uniffiFieldLowered4.v3,
        uniffiFieldLowered5,
        uniffiFieldLowered6.v0,
        uniffiFieldLowered6.v1,
        uniffiFieldLowered6.v2,
        uniffiFieldLowered6.v3,
    )
}

@JvmName("liftType426")
fun liftType426(
    v0: Int,
    v1: Int,
    v2: java.nio.ByteBuffer?,
    v3: Int,
    v4: java.nio.ByteBuffer?,
    v5: java.nio.ByteBuffer?,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: Int,
    v14: java.nio.ByteBuffer?,
): mozilla.appservices.syncmanager.`SyncParams` {
    return mozilla.appservices.syncmanager.`SyncParams`(
        liftType418(
            v0,
        ),
        liftType419(
            v1,
            v2,
        ),
        liftType420(
            v3,
            v4,
        ),
        liftType131(
            v5,
        ),
        liftType421(
            v6,
            v7,
            v8,
            v9,
        ),
        liftOptionString(
            v10,
        ),
        liftType422(
            v11,
            v12,
            v13,
            v14,
        ),
    )
}

fun writeType426(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`SyncParams`) {
    writeType418(buf, offset + 0, value.`reason`)
    writeType419(buf, offset + 8, value.`engines`)
    writeType420(buf, offset + 32, value.`engineChoicesModel`)
    writeType131(buf, offset + 56, value.`localEncryptionKeys`)
    writeType421(buf, offset + 72, value.`authInfo`)
    writeType18(buf, offset + 168, value.`persistedState`)
    writeType422(buf, offset + 200, value.`deviceSettings`)
}

fun readType426(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncParams` {
    return mozilla.appservices.syncmanager.`SyncParams`(
        readType418(buf, offset + 0),
        readType419(buf, offset + 8),
        readType420(buf, offset + 32),
        readType131(buf, offset + 56),
        readType421(buf, offset + 72),
        readType18(buf, offset + 168),
        readType422(buf, offset + 200),
    )
}

@JvmName("lowerType423")
fun lowerType423(value: mozilla.appservices.syncmanager.`ServiceStatus`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType423")
fun liftType423(value: kotlin.Int): mozilla.appservices.syncmanager.`ServiceStatus` {
    return mozilla.appservices.syncmanager.`ServiceStatus`.values()[value]
}

fun writeType423(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`ServiceStatus`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType423(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`ServiceStatus` {
    return liftType423(readInt(buf, offset))
}



@JvmName("lowerType99")
inline fun lowerType99(value: kotlin.collections.List<kotlin.String>?): DeconstructedType99 {
    return uniffi.lowerType99(value)
}

@JvmName("liftType99")
inline fun liftType99(
    v1: Boolean,
    v2: java.nio.ByteBuffer?
): kotlin.collections.List<kotlin.String>? {
    return uniffi.liftType99(
        v1,
        v2
    )
}

inline fun writeType99(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.String>?) {
    uniffi.writeType99(buf, offset, value)
}

inline fun readType99(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.String>? {
    return uniffi.readType99(buf, offset)
}





@JvmName("lowerType425")
inline fun lowerType425(value: java.time.Instant): DeconstructedType425 {
    return uniffi.lowerType425(value)
}

@JvmName("liftType425")
inline fun liftType425(
    v1: Long,
    v2: Int
): java.time.Instant {
    return uniffi.liftType425(
        v1,
        v2
    )
}

inline fun writeType425(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: java.time.Instant) {
    uniffi.writeType425(buf, offset, value)
}

inline fun readType425(buf: java.nio.ByteBuffer, offset: kotlin.Int): java.time.Instant {
    return uniffi.readType425(buf, offset)
}





@JvmName("lowerType424")
inline fun lowerType424(value: java.time.Instant?): DeconstructedType424 {
    return uniffi.lowerType424(value)
}

@JvmName("liftType424")
inline fun liftType424(
    v1: Boolean,
    v2: Long,
    v3: Int
): java.time.Instant? {
    return uniffi.liftType424(
        v1,
        v2,
        v3
    )
}

inline fun writeType424(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: java.time.Instant?) {
    uniffi.writeType424(buf, offset, value)
}

inline fun readType424(buf: java.nio.ByteBuffer, offset: kotlin.Int): java.time.Instant? {
    return uniffi.readType424(buf, offset)
}



// Deconstructed version of SyncResult
class DeconstructedType427(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
    val v2: java.nio.ByteBuffer?,
    val v3: String?,
    val v4: Boolean,
    val v5: java.nio.ByteBuffer?,
    val v6: Boolean,
    val v7: Long,
    val v8: Int,
    val v9: String?,
)

@JvmName("lowerType427")
fun lowerType427(rec: mozilla.appservices.syncmanager.`SyncResult`): DeconstructedType427 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType423(rec.`status`)
    val uniffiFieldLowered1 = lowerType16(rec.`successful`)
    val uniffiFieldLowered2 = lowerType131(rec.`failures`)
    val uniffiFieldLowered3 = lowerString(rec.`persistedState`)
    val uniffiFieldLowered4 = lowerType99(rec.`declined`)
    val uniffiFieldLowered5 = lowerType424(rec.`nextSyncAllowedAt`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`telemetryJson`)
    return DeconstructedType427(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered5.v2,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType427")
fun liftType427(
    v0: Int,
    v1: java.nio.ByteBuffer?,
    v2: java.nio.ByteBuffer?,
    v3: String?,
    v4: Boolean,
    v5: java.nio.ByteBuffer?,
    v6: Boolean,
    v7: Long,
    v8: Int,
    v9: String?,
): mozilla.appservices.syncmanager.`SyncResult` {
    return mozilla.appservices.syncmanager.`SyncResult`(
        liftType423(
            v0,
        ),
        liftType16(
            v1,
        ),
        liftType131(
            v2,
        ),
        liftString(
            v3,
        ),
        liftType99(
            v4,
            v5,
        ),
        liftType424(
            v6,
            v7,
            v8,
        ),
        liftOptionString(
            v9,
        ),
    )
}

fun writeType427(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`SyncResult`) {
    writeType423(buf, offset + 0, value.`status`)
    writeType16(buf, offset + 8, value.`successful`)
    writeType131(buf, offset + 24, value.`failures`)
    writeString(buf, offset + 40, value.`persistedState`)
    writeType99(buf, offset + 64, value.`declined`)
    writeType424(buf, offset + 88, value.`nextSyncAllowedAt`)
    writeType18(buf, offset + 112, value.`telemetryJson`)
}

fun readType427(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncResult` {
    return mozilla.appservices.syncmanager.`SyncResult`(
        readType423(buf, offset + 0),
        readType16(buf, offset + 8),
        readType131(buf, offset + 24),
        readString(buf, offset + 40),
        readType99(buf, offset + 64),
        readType424(buf, offset + 88),
        readType18(buf, offset + 112),
    )
}

@JvmName("liftType428")
fun liftType428(v0: kotlin.Int, v1: kotlin.String): mozilla.appservices.syncmanager.`SyncManagerException` {
    return when(v0) {
        0 -> mozilla.appservices.syncmanager.`SyncManagerException`.`UnknownEngine`(v1)
        1 -> mozilla.appservices.syncmanager.`SyncManagerException`.`UnsupportedFeature`(v1)
        2 -> mozilla.appservices.syncmanager.`SyncManagerException`.`Busy`(v1)
        3 -> mozilla.appservices.syncmanager.`SyncManagerException`.`Sync15Exception`(v1)
        4 -> mozilla.appservices.syncmanager.`SyncManagerException`.`UrlParseException`(v1)
        5 -> mozilla.appservices.syncmanager.`SyncManagerException`.`InterruptedException`(v1)
        6 -> mozilla.appservices.syncmanager.`SyncManagerException`.`JsonException`(v1)
        7 -> mozilla.appservices.syncmanager.`SyncManagerException`.`LoginsException`(v1)
        8 -> mozilla.appservices.syncmanager.`SyncManagerException`.`PlacesException`(v1)
        9 -> mozilla.appservices.syncmanager.`SyncManagerException`.`AnyhowException`(v1)
        else -> throw uniffi.InternalException("liftType428: Invalid enum value: ${v0}")
    }
}


fun readType428(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncManagerException` {
    val uniffiDiscriminent = readInt(buf, offset)
    return when(uniffiDiscriminent) {
        0 -> mozilla.appservices.syncmanager.`SyncManagerException`.`UnknownEngine`(readString(buf, offset + 8))
        1 -> mozilla.appservices.syncmanager.`SyncManagerException`.`UnsupportedFeature`(readString(buf, offset + 8))
        2 -> mozilla.appservices.syncmanager.`SyncManagerException`.`Busy`(readString(buf, offset + 8))
        3 -> mozilla.appservices.syncmanager.`SyncManagerException`.`Sync15Exception`(readString(buf, offset + 8))
        4 -> mozilla.appservices.syncmanager.`SyncManagerException`.`UrlParseException`(readString(buf, offset + 8))
        5 -> mozilla.appservices.syncmanager.`SyncManagerException`.`InterruptedException`(readString(buf, offset + 8))
        6 -> mozilla.appservices.syncmanager.`SyncManagerException`.`JsonException`(readString(buf, offset + 8))
        7 -> mozilla.appservices.syncmanager.`SyncManagerException`.`LoginsException`(readString(buf, offset + 8))
        8 -> mozilla.appservices.syncmanager.`SyncManagerException`.`PlacesException`(readString(buf, offset + 8))
        9 -> mozilla.appservices.syncmanager.`SyncManagerException`.`AnyhowException`(readString(buf, offset + 8))
        else -> throw uniffi.InternalException("readType428: Invalid enum value: ${uniffiDiscriminent}")
    }
}



fun objectToHandle7287(obj: mozilla.appservices.syncmanager.`SyncManager`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject7287(handle: kotlin.Long): mozilla.appservices.syncmanager.`SyncManager` {
    return mozilla.appservices.syncmanager.`SyncManager`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef7287")
fun lowerObjectRef7287(value: mozilla.appservices.syncmanager.`SyncManager`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType7287")
fun lowerType7287(value: mozilla.appservices.syncmanager.`SyncManager`): kotlin.Long {
    return objectToHandle7287(value)
}

@JvmName("liftType7287")
fun liftType7287(handle: kotlin.Long): mozilla.appservices.syncmanager.`SyncManager` {
    return handleToObject7287(handle)
}

fun writeType7287(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.syncmanager.`SyncManager`) {
    writeLong(buf, offset, objectToHandle7287(value))
}

fun readType7287(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.syncmanager.`SyncManager` {
    return handleToObject7287(readLong(buf, offset))
}



@JvmName("lowerType98")
inline fun lowerType98(value: mozilla.appservices.sync15.`DeviceType`): Int {
    return mozilla.appservices.sync15.uniffi.lowerType98(value)
}

@JvmName("liftType98")
inline fun liftType98(
    v1: Int
): mozilla.appservices.sync15.`DeviceType` {
    return mozilla.appservices.sync15.uniffi.liftType98(
        v1
    )
}

inline fun writeType98(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.sync15.`DeviceType`) {
    mozilla.appservices.sync15.uniffi.writeType98(buf, offset, value)
}

inline fun readType98(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.sync15.`DeviceType` {
    return mozilla.appservices.sync15.uniffi.readType98(buf, offset)
}





@JvmName("lowerType420")
inline fun lowerType420(value: mozilla.appservices.sync15.`EngineChoicesModel`): DeconstructedType420 {
    return mozilla.appservices.sync15.uniffi.lowerType420(value)
}

@JvmName("liftType420")
inline fun liftType420(
    v1: Int,
    v2: java.nio.ByteBuffer?
): mozilla.appservices.sync15.`EngineChoicesModel` {
    return mozilla.appservices.sync15.uniffi.liftType420(
        v1,
        v2
    )
}

inline fun writeType420(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.sync15.`EngineChoicesModel`) {
    mozilla.appservices.sync15.uniffi.writeType420(buf, offset, value)
}

inline fun readType420(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.sync15.`EngineChoicesModel` {
    return mozilla.appservices.sync15.uniffi.readType420(buf, offset)
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
    @JvmName("methodSyncManagerSyncManagerDisconnect")
    @JvmStatic external fun methodSyncManagerSyncManagerDisconnect(
        `uniffiArg0`: Long,
    )
    @JvmName("methodSyncManagerSyncManagerGetAvailableEngines")
    @JvmStatic external fun methodSyncManagerSyncManagerGetAvailableEngines(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodSyncManagerSyncManagerSync")
    @JvmStatic external fun methodSyncManagerSyncManagerSync(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: Int,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: Int,
        `uniffiArg5`: java.nio.ByteBuffer?,
        `uniffiArg6`: java.nio.ByteBuffer?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: String?,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: String?,
        `uniffiArg13`: String?,
        `uniffiArg14`: Int,
        `uniffiArg15`: java.nio.ByteBuffer?,
    ) : mozilla.appservices.syncmanager.`SyncResult`
    @JvmName("constructorSyncManagerSyncManagerNew")
    @JvmStatic external fun constructorSyncManagerSyncManagerNew(
    ) : Long
    @JvmStatic external fun objectCloneHandle7287(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree7287(handle: kotlin.Long)
}