@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.remotesettings.uniffi
import org.json.JSONObject
import uniffi.DeconstructedType328
import uniffi.DeconstructedType11



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



// Deconstructed version of Attachment
class DeconstructedType330(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: Long,
)

@JvmName("lowerType330")
fun lowerType330(rec: mozilla.appservices.remotesettings.`Attachment`): DeconstructedType330 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`filename`)
    val uniffiFieldLowered1 = lowerString(rec.`mimetype`)
    val uniffiFieldLowered2 = lowerString(rec.`location`)
    val uniffiFieldLowered3 = lowerString(rec.`hash`)
    val uniffiFieldLowered4 = lowerULong(rec.`size`)
    return DeconstructedType330(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType330")
fun liftType330(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: Long,
): mozilla.appservices.remotesettings.`Attachment` {
    return mozilla.appservices.remotesettings.`Attachment`(
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
        liftULong(
            v4,
        ),
    )
}

fun writeType330(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`Attachment`) {
    writeString(buf, offset + 0, value.`filename`)
    writeString(buf, offset + 24, value.`mimetype`)
    writeString(buf, offset + 48, value.`location`)
    writeString(buf, offset + 72, value.`hash`)
    writeULong(buf, offset + 96, value.`size`)
}

fun readType330(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`Attachment` {
    return mozilla.appservices.remotesettings.`Attachment`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
        readULong(buf, offset + 96),
    )
}

// Deconstructed version of RemoteSettingsServer
class DeconstructedType325(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType325")
fun lowerType325(value: mozilla.appservices.remotesettings.`RemoteSettingsServer`): DeconstructedType325 {
    when (value) {
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Prod` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType325(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Stage` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType325(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Dev` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            return DeconstructedType325(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Custom` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            val uniffiFieldLowered1 = lowerString(value.`url`)
            return DeconstructedType325(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType325")
fun liftType325(
    v0: Int,
    v1: String?,
): mozilla.appservices.remotesettings.`RemoteSettingsServer` {
    when (v0) {
        0 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Prod`
        }
        1 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Stage`
        }
        2 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Dev`
        }
        3 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Custom`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType325: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType325(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsServer`) {
    when (value) {
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Prod` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Stage` -> {
            writeInt(buf, offset, 1);
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Dev` -> {
            writeInt(buf, offset, 2);
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Custom` -> {
            writeInt(buf, offset, 3);
            writeString(buf, offset + 8, value.`url`)
        }
    }
}

fun readType325(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsServer` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Prod`
        }
        1 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Stage`
        }
        2 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Dev`
        }
        3 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsServer`.`Custom`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType325: Invalid enum discriminant: ${discriminant}")
        }
    }
}


// Deconstructed version of mozilla.appservices.remotesettings.`RemoteSettingsServer`?
class DeconstructedType324(
    val v0: Boolean,
    val v1: Int,
    val v2: String?,
)

@JvmName("lowerType324")
fun lowerType324(value: mozilla.appservices.remotesettings.`RemoteSettingsServer`?): DeconstructedType324 {
    if (value == null) {
        return DeconstructedType324(
            false,
            0,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType325(value)
        return DeconstructedType324(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
        )
    }
}

@JvmName("liftType324")
fun liftType324(
    v0: Boolean,
    v1: Int,
    v2: String?,
): mozilla.appservices.remotesettings.`RemoteSettingsServer`? {
    if (v0) {
        return liftType325(
            v1,
            v2,
        )
    } else {
        return null
    }
}

fun writeType324(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsServer`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType325(buf, offset + 8, value)
    }
}
fun readType324(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsServer`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType325(buf, offset + 8)
    }
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





@JvmName("lowerType328")
inline fun lowerType328(value: kotlin.collections.Map<kotlin.String, kotlin.String>?): DeconstructedType328 {
    return uniffi.lowerType328(value)
}

@JvmName("liftType328")
inline fun liftType328(
    v1: Boolean,
    v2: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.String, kotlin.String>? {
    return uniffi.liftType328(
        v1,
        v2
    )
}

inline fun writeType328(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.String>?) {
    uniffi.writeType328(buf, offset, value)
}

inline fun readType328(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.String>? {
    return uniffi.readType328(buf, offset)
}



// Deconstructed version of RemoteSettingsContext
class DeconstructedType327(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: Boolean,
    val v10: java.nio.ByteBuffer?,
)

@JvmName("lowerType327")
fun lowerType327(rec: mozilla.appservices.remotesettings.`RemoteSettingsContext`): DeconstructedType327 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`channel`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`appVersion`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`appId`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`locale`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`os`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`osVersion`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`formFactor`)
    val uniffiFieldLowered7 = lowerOptionString(rec.`country`)
    val uniffiFieldLowered8 = lowerOptionString(rec.`distribution`)
    val uniffiFieldLowered9 = lowerType328(rec.`customTargettingAttributes`)
    return DeconstructedType327(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9.v0,
        uniffiFieldLowered9.v1,
    )
}

@JvmName("liftType327")
fun liftType327(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: Boolean,
    v10: java.nio.ByteBuffer?,
): mozilla.appservices.remotesettings.`RemoteSettingsContext` {
    return mozilla.appservices.remotesettings.`RemoteSettingsContext`(
        liftOptionString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftOptionString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
        liftOptionString(
            v5,
        ),
        liftOptionString(
            v6,
        ),
        liftOptionString(
            v7,
        ),
        liftOptionString(
            v8,
        ),
        liftType328(
            v9,
            v10,
        ),
    )
}

fun writeType327(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsContext`) {
    writeType18(buf, offset + 0, value.`channel`)
    writeType18(buf, offset + 32, value.`appVersion`)
    writeType18(buf, offset + 64, value.`appId`)
    writeType18(buf, offset + 96, value.`locale`)
    writeType18(buf, offset + 128, value.`os`)
    writeType18(buf, offset + 160, value.`osVersion`)
    writeType18(buf, offset + 192, value.`formFactor`)
    writeType18(buf, offset + 224, value.`country`)
    writeType18(buf, offset + 256, value.`distribution`)
    writeType328(buf, offset + 288, value.`customTargettingAttributes`)
}

fun readType327(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsContext` {
    return mozilla.appservices.remotesettings.`RemoteSettingsContext`(
        readType18(buf, offset + 0),
        readType18(buf, offset + 32),
        readType18(buf, offset + 64),
        readType18(buf, offset + 96),
        readType18(buf, offset + 128),
        readType18(buf, offset + 160),
        readType18(buf, offset + 192),
        readType18(buf, offset + 224),
        readType18(buf, offset + 256),
        readType328(buf, offset + 288),
    )
}


// Deconstructed version of mozilla.appservices.remotesettings.`RemoteSettingsContext`?
class DeconstructedType326(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: Boolean,
    val v11: java.nio.ByteBuffer?,
)

@JvmName("lowerType326")
fun lowerType326(value: mozilla.appservices.remotesettings.`RemoteSettingsContext`?): DeconstructedType326 {
    if (value == null) {
        return DeconstructedType326(
            false,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType327(value)
        return DeconstructedType326(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
            uniffiFieldLowered.v4,
            uniffiFieldLowered.v5,
            uniffiFieldLowered.v6,
            uniffiFieldLowered.v7,
            uniffiFieldLowered.v8,
            uniffiFieldLowered.v9,
            uniffiFieldLowered.v10,
        )
    }
}

@JvmName("liftType326")
fun liftType326(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: Boolean,
    v11: java.nio.ByteBuffer?,
): mozilla.appservices.remotesettings.`RemoteSettingsContext`? {
    if (v0) {
        return liftType327(
            v1,
            v2,
            v3,
            v4,
            v5,
            v6,
            v7,
            v8,
            v9,
            v10,
            v11,
        )
    } else {
        return null
    }
}

fun writeType326(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsContext`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType327(buf, offset + 8, value)
    }
}
fun readType326(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsContext`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType327(buf, offset + 8)
    }
}

// Deconstructed version of RemoteSettingsConfig
class DeconstructedType338(
    val v0: Boolean,
    val v1: Int,
    val v2: String?,
    val v3: String?,
    val v4: Boolean,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: String?,
    val v14: Boolean,
    val v15: java.nio.ByteBuffer?,
)

@JvmName("lowerType338")
fun lowerType338(rec: mozilla.appservices.remotesettings.`RemoteSettingsConfig`): DeconstructedType338 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType324(rec.`server`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`bucketName`)
    val uniffiFieldLowered2 = lowerType326(rec.`appContext`)
    return DeconstructedType338(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered2.v2,
        uniffiFieldLowered2.v3,
        uniffiFieldLowered2.v4,
        uniffiFieldLowered2.v5,
        uniffiFieldLowered2.v6,
        uniffiFieldLowered2.v7,
        uniffiFieldLowered2.v8,
        uniffiFieldLowered2.v9,
        uniffiFieldLowered2.v10,
        uniffiFieldLowered2.v11,
    )
}

@JvmName("liftType338")
fun liftType338(
    v0: Boolean,
    v1: Int,
    v2: String?,
    v3: String?,
    v4: Boolean,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: String?,
    v14: Boolean,
    v15: java.nio.ByteBuffer?,
): mozilla.appservices.remotesettings.`RemoteSettingsConfig` {
    return mozilla.appservices.remotesettings.`RemoteSettingsConfig`(
        liftType324(
            v0,
            v1,
            v2,
        ),
        liftOptionString(
            v3,
        ),
        liftType326(
            v4,
            v5,
            v6,
            v7,
            v8,
            v9,
            v10,
            v11,
            v12,
            v13,
            v14,
            v15,
        ),
    )
}

fun writeType338(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsConfig`) {
    writeType324(buf, offset + 0, value.`server`)
    writeType18(buf, offset + 40, value.`bucketName`)
    writeType326(buf, offset + 72, value.`appContext`)
}

fun readType338(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsConfig` {
    return mozilla.appservices.remotesettings.`RemoteSettingsConfig`(
        readType324(buf, offset + 0),
        readType18(buf, offset + 40),
        readType326(buf, offset + 72),
    )
}



@JvmName("lowerBoolean")
inline fun lowerBoolean(value: kotlin.Boolean): Boolean {
    return uniffi.lowerBoolean(value)
}

@JvmName("liftBoolean")
inline fun liftBoolean(
    v1: Boolean
): kotlin.Boolean {
    return uniffi.liftBoolean(
        v1
    )
}

inline fun writeBoolean(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Boolean) {
    uniffi.writeBoolean(buf, offset, value)
}

inline fun readBoolean(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Boolean {
    return uniffi.readBoolean(buf, offset)
}




// Deconstructed version of mozilla.appservices.remotesettings.`Attachment`?
class DeconstructedType329(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: Long,
)

@JvmName("lowerType329")
fun lowerType329(value: mozilla.appservices.remotesettings.`Attachment`?): DeconstructedType329 {
    if (value == null) {
        return DeconstructedType329(
            false,
            null,
            null,
            null,
            null,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerType330(value)
        return DeconstructedType329(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
            uniffiFieldLowered.v4,
        )
    }
}

@JvmName("liftType329")
fun liftType329(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: Long,
): mozilla.appservices.remotesettings.`Attachment`? {
    if (v0) {
        return liftType330(
            v1,
            v2,
            v3,
            v4,
            v5,
        )
    } else {
        return null
    }
}

fun writeType329(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`Attachment`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType330(buf, offset + 8, value)
    }
}
fun readType329(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`Attachment`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType330(buf, offset + 8)
    }
}


@JvmName("lowerType331")
fun lowerType331(value: mozilla.appservices.remotesettings.`RsJsonObject`): String? {
    val value = (value.toString())
    return lowerString(value)
}

@JvmName("liftType331")
fun liftType331(
    v0: String?,
): mozilla.appservices.remotesettings.`RsJsonObject` {
    val builtinValue = liftString(
        v0,
    )
    return JSONObject(builtinValue)
}

fun writeType331(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RsJsonObject`) {
    val value = (value.toString())
    writeString(buf, offset, value)
}

fun readType331(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RsJsonObject` {
    val builtinValue = readString(buf, offset)
    return JSONObject(builtinValue)
}

// Deconstructed version of RemoteSettingsRecord
class DeconstructedType332(
    val v0: String?,
    val v1: Long,
    val v2: Boolean,
    val v3: Boolean,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: Long,
    val v9: String?,
)

@JvmName("lowerType332")
fun lowerType332(rec: mozilla.appservices.remotesettings.`RemoteSettingsRecord`): DeconstructedType332 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerULong(rec.`lastModified`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`deleted`)
    val uniffiFieldLowered3 = lowerType329(rec.`attachment`)
    val uniffiFieldLowered4 = lowerType331(rec.`fields`)
    return DeconstructedType332(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered3.v2,
        uniffiFieldLowered3.v3,
        uniffiFieldLowered3.v4,
        uniffiFieldLowered3.v5,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType332")
fun liftType332(
    v0: String?,
    v1: Long,
    v2: Boolean,
    v3: Boolean,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: Long,
    v9: String?,
): mozilla.appservices.remotesettings.`RemoteSettingsRecord` {
    return mozilla.appservices.remotesettings.`RemoteSettingsRecord`(
        liftString(
            v0,
        ),
        liftULong(
            v1,
        ),
        liftBoolean(
            v2,
        ),
        liftType329(
            v3,
            v4,
            v5,
            v6,
            v7,
            v8,
        ),
        liftType331(
            v9,
        ),
    )
}

fun writeType332(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsRecord`) {
    writeString(buf, offset + 0, value.`id`)
    writeULong(buf, offset + 24, value.`lastModified`)
    writeBoolean(buf, offset + 32, value.`deleted`)
    writeType329(buf, offset + 40, value.`attachment`)
    writeType331(buf, offset + 152, value.`fields`)
}

fun readType332(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsRecord` {
    return mozilla.appservices.remotesettings.`RemoteSettingsRecord`(
        readString(buf, offset + 0),
        readULong(buf, offset + 24),
        readBoolean(buf, offset + 32),
        readType329(buf, offset + 40),
        readType331(buf, offset + 152),
    )
}

// Deconstructed version of UptakeEventExtras
class DeconstructedType341(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
)

@JvmName("lowerType341")
fun lowerType341(rec: mozilla.appservices.remotesettings.`UptakeEventExtras`): DeconstructedType341 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`value`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`source`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`age`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`trigger`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`timestamp`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`duration`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`errorName`)
    return DeconstructedType341(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType341")
fun liftType341(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
): mozilla.appservices.remotesettings.`UptakeEventExtras` {
    return mozilla.appservices.remotesettings.`UptakeEventExtras`(
        liftOptionString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftOptionString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
        liftOptionString(
            v5,
        ),
        liftOptionString(
            v6,
        ),
    )
}

fun writeType341(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`UptakeEventExtras`) {
    writeType18(buf, offset + 0, value.`value`)
    writeType18(buf, offset + 32, value.`source`)
    writeType18(buf, offset + 64, value.`age`)
    writeType18(buf, offset + 96, value.`trigger`)
    writeType18(buf, offset + 128, value.`timestamp`)
    writeType18(buf, offset + 160, value.`duration`)
    writeType18(buf, offset + 192, value.`errorName`)
}

fun readType341(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`UptakeEventExtras` {
    return mozilla.appservices.remotesettings.`UptakeEventExtras`(
        readType18(buf, offset + 0),
        readType18(buf, offset + 32),
        readType18(buf, offset + 64),
        readType18(buf, offset + 96),
        readType18(buf, offset + 128),
        readType18(buf, offset + 160),
        readType18(buf, offset + 192),
    )
}

// Deconstructed version of RemoteSettingsError
class DeconstructedType333(
    val v0: Int,
    val v1: String?,
    val v2: Long,
)

@JvmName("lowerType333")
fun lowerType333(value: mozilla.appservices.remotesettings.`RemoteSettingsException`): DeconstructedType333 {
    when (value) {
        is mozilla.appservices.remotesettings.`RemoteSettingsException`.`Network` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType333(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
            )
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsException`.`Backoff` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered2 = lowerULong(value.`seconds`)
            return DeconstructedType333(
                uniffiFieldLowered0,
                null,
                uniffiFieldLowered2,
            )
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType333(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
            )
        }
    }
}

@JvmName("liftType333")
fun liftType333(
    v0: Int,
    v1: String?,
    v2: Long,
): mozilla.appservices.remotesettings.`RemoteSettingsException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsException`.`Network`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsException`.`Backoff`(
                liftULong(
                    v2,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.remotesettings.`RemoteSettingsException`.`Other`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType333: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType333(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsException`) {
    when (value) {
        is mozilla.appservices.remotesettings.`RemoteSettingsException`.`Network` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsException`.`Backoff` -> {
            writeInt(buf, offset, 1);
            writeULong(buf, offset + 8, value.`seconds`)
        }
        is mozilla.appservices.remotesettings.`RemoteSettingsException`.`Other` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType333(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsException`.`Network`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsException`.`Backoff`(
                readULong(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.remotesettings.`RemoteSettingsException`.`Other`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType333: Invalid enum discriminant: ${discriminant}")
        }
    }
}

@JvmName("lowerType5428")
fun lowerType5428(value: mozilla.appservices.remotesettings.`SyncStatus`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType5428")
fun liftType5428(value: kotlin.Int): mozilla.appservices.remotesettings.`SyncStatus` {
    return mozilla.appservices.remotesettings.`SyncStatus`.values()[value]
}

fun writeType5428(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`SyncStatus`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType5428(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`SyncStatus` {
    return liftType5428(readInt(buf, offset))
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





@JvmName("lowerType11")
inline fun lowerType11(value: kotlin.ULong?): DeconstructedType11 {
    return uniffi.lowerType11(value)
}

@JvmName("liftType11")
inline fun liftType11(
    v1: Boolean,
    v2: Long
): kotlin.ULong? {
    return uniffi.liftType11(
        v1,
        v2
    )
}

inline fun writeType11(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ULong?) {
    uniffi.writeType11(buf, offset, value)
}

inline fun readType11(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ULong? {
    return uniffi.readType11(buf, offset)
}




fun lowerToBuffer335(value: kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 176).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType332(buf, offset, it)
        offset += 176
    }
    return buf
}

fun liftFromBuffer335(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 176
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType332(buf, offset))
                offset += 176
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType335")
fun lowerType335(value: kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>): java.nio.ByteBuffer {
    return lowerToBuffer335(value)
}

@JvmName("liftType335")
fun liftType335(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`> {
    return liftFromBuffer335(buf)
}

fun writeType335(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>) {
    val childBuf = lowerToBuffer335(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType335(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer335(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?
class DeconstructedType334(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType334")
fun lowerType334(value: kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?): DeconstructedType334 {
    if (value == null) {
        return DeconstructedType334(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType335(value)
        return DeconstructedType334(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType334")
fun liftType334(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>? {
    if (v0) {
        return liftType335(
            v1,
        )
    } else {
        return null
    }
}

fun writeType334(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType335(buf, offset + 8, value)
    }
}
fun readType334(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType335(buf, offset + 8)
    }
}


@JvmName("lowerType337")
fun lowerType337(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 200).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType332(buf, offset + 24, it.value)
        offset += 200
    }
    return buf
}

@JvmName("liftType337")
fun liftType337(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 200
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType332(buf, offset + 24),
                )
                offset += 200
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType337(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>) {
    val childBuf = lowerType337(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType337(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType337(childBuf)
}


// Deconstructed version of kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?
class DeconstructedType336(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType336")
fun lowerType336(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?): DeconstructedType336 {
    if (value == null) {
        return DeconstructedType336(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType337(value)
        return DeconstructedType336(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType336")
fun liftType336(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>? {
    if (v0) {
        return liftType337(
            v1,
        )
    } else {
        return null
    }
}

fun writeType336(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType337(buf, offset + 8, value)
    }
}
fun readType336(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType337(buf, offset + 8)
    }
}

fun objectToHandle339(obj: mozilla.appservices.remotesettings.`RemoteSettingsClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject339(handle: kotlin.Long): mozilla.appservices.remotesettings.`RemoteSettingsClient` {
    return mozilla.appservices.remotesettings.`RemoteSettingsClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef339")
fun lowerObjectRef339(value: mozilla.appservices.remotesettings.`RemoteSettingsClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType339")
fun lowerType339(value: mozilla.appservices.remotesettings.`RemoteSettingsClient`): kotlin.Long {
    return objectToHandle339(value)
}

@JvmName("liftType339")
fun liftType339(handle: kotlin.Long): mozilla.appservices.remotesettings.`RemoteSettingsClient` {
    return handleToObject339(handle)
}

fun writeType339(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsClient`) {
    writeLong(buf, offset, objectToHandle339(value))
}

fun readType339(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsClient` {
    return handleToObject339(readLong(buf, offset))
}

fun objectToHandle340(obj: mozilla.appservices.remotesettings.`RemoteSettingsTelemetry`): kotlin.Long {
    if (obj is mozilla.appservices.remotesettings.RemoteSettingsTelemetryImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap340.insert(obj)
    }
}

fun handleToObject340(handle: kotlin.Long): mozilla.appservices.remotesettings.`RemoteSettingsTelemetry` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return mozilla.appservices.remotesettings.RemoteSettingsTelemetryImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap340.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef340")
fun lowerObjectReceiverRef340(value: mozilla.appservices.remotesettings.RemoteSettingsTelemetryImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType340")
fun lowerType340(value: mozilla.appservices.remotesettings.`RemoteSettingsTelemetry`): kotlin.Long {
    return objectToHandle340(value)
}

@JvmName("liftType340")
fun liftType340(handle: kotlin.Long): mozilla.appservices.remotesettings.`RemoteSettingsTelemetry` {
    return handleToObject340(handle)
}

fun writeType340(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsTelemetry`) {
    writeLong(buf, offset, objectToHandle340(value))
}

fun readType340(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsTelemetry` {
    return handleToObject340(readLong(buf, offset))
}


public val callbackInterfaceHandleMap340 = uniffi.HandleMap<mozilla.appservices.remotesettings.`RemoteSettingsTelemetry`>();
fun callbackInterfaceDispatch340000000(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
    `uniffiArg3`: String?,
    `uniffiArg4`: String?,
    `uniffiArg5`: String?,
    `uniffiArg6`: String?,
    `uniffiArg7`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap340.get(uniffiHandle)
    val `extras` = liftType341(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
        `uniffiArg4`,
        `uniffiArg5`,
        `uniffiArg6`,
        `uniffiArg7`,
    )
    val uniffiReturn = uniffiObj.`reportUptake`(
        `extras`,
    )
}

fun callbackInterfaceFree340(handle: kotlin.Long) {
    callbackInterfaceHandleMap340.remove(handle)
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



fun objectToHandle222(obj: mozilla.appservices.remotesettings.`RemoteSettingsService`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject222(handle: kotlin.Long): mozilla.appservices.remotesettings.`RemoteSettingsService` {
    return mozilla.appservices.remotesettings.`RemoteSettingsService`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef222")
fun lowerObjectRef222(value: mozilla.appservices.remotesettings.`RemoteSettingsService`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType222")
fun lowerType222(value: mozilla.appservices.remotesettings.`RemoteSettingsService`): kotlin.Long {
    return objectToHandle222(value)
}

@JvmName("liftType222")
fun liftType222(handle: kotlin.Long): mozilla.appservices.remotesettings.`RemoteSettingsService` {
    return handleToObject222(handle)
}

fun writeType222(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsService`) {
    writeLong(buf, offset, objectToHandle222(value))
}

fun readType222(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsService` {
    return handleToObject222(readLong(buf, offset))
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
    @JvmName("methodRemoteSettingsRemoteSettingsClientCollectionName")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientCollectionName(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodRemoteSettingsRemoteSettingsClientGetAttachment")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientGetAttachment(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: Long,
        `uniffiArg10`: String?,
    ) : kotlin.ByteArray?
    @JvmName("methodRemoteSettingsRemoteSettingsClientGetLastModifiedTimestamp")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientGetLastModifiedTimestamp(
        `uniffiArg0`: Long,
    ) : kotlin.ULong?
    @JvmName("methodRemoteSettingsRemoteSettingsClientGetRecords")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientGetRecords(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : kotlin.collections.List<mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?
    @JvmName("methodRemoteSettingsRemoteSettingsClientGetRecordsMap")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientGetRecordsMap(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : kotlin.collections.Map<kotlin.String, mozilla.appservices.remotesettings.`RemoteSettingsRecord`>?
    @JvmName("methodRemoteSettingsRemoteSettingsClientResetStorage")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientResetStorage(
        `uniffiArg0`: Long,
    )
    @JvmName("methodRemoteSettingsRemoteSettingsClientShutdown")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientShutdown(
        `uniffiArg0`: Long,
    )
    @JvmName("methodRemoteSettingsRemoteSettingsClientSync")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsClientSync(
        `uniffiArg0`: Long,
    )
    @JvmName("methodRemoteSettingsRemoteSettingsTelemetryReportUptake")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsTelemetryReportUptake(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
    )
    @JvmName("methodRemoteSettingsRemoteSettingsServiceClientUrl")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsServiceClientUrl(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodRemoteSettingsRemoteSettingsServiceMakeClient")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsServiceMakeClient(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodRemoteSettingsRemoteSettingsServiceSetTelemetry")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsServiceSetTelemetry(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    )
    @JvmName("methodRemoteSettingsRemoteSettingsServiceSync")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsServiceSync(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodRemoteSettingsRemoteSettingsServiceUpdateConfig")
    @JvmStatic external fun methodRemoteSettingsRemoteSettingsServiceUpdateConfig(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: String?,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: String?,
        `uniffiArg13`: String?,
        `uniffiArg14`: String?,
        `uniffiArg15`: Boolean,
        `uniffiArg16`: java.nio.ByteBuffer?,
    )
    @JvmName("constructorRemoteSettingsRemoteSettingsServiceNew")
    @JvmStatic external fun constructorRemoteSettingsRemoteSettingsServiceNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: String?,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: String?,
        `uniffiArg13`: String?,
        `uniffiArg14`: String?,
        `uniffiArg15`: Boolean,
        `uniffiArg16`: java.nio.ByteBuffer?,
    ) : Long
    @JvmStatic external fun objectCloneHandle339(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree339(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle340(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree340(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle222(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree222(handle: kotlin.Long)
}