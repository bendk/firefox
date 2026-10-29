@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.relay.uniffi



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



// Deconstructed version of BounceStatus
class DeconstructedType319(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType319")
fun lowerType319(rec: mozilla.appservices.relay.`BounceStatus`): DeconstructedType319 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerBoolean(rec.`paused`)
    val uniffiFieldLowered1 = lowerString(rec.`bounceType`)
    return DeconstructedType319(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType319")
fun liftType319(
    v0: Boolean,
    v1: String?,
): mozilla.appservices.relay.`BounceStatus` {
    return mozilla.appservices.relay.`BounceStatus`(
        liftBoolean(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType319(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.relay.`BounceStatus`) {
    writeBoolean(buf, offset + 0, value.`paused`)
    writeString(buf, offset + 8, value.`bounceType`)
}

fun readType319(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.relay.`BounceStatus` {
    return mozilla.appservices.relay.`BounceStatus`(
        readBoolean(buf, offset + 0),
        readString(buf, offset + 8),
    )
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



// Deconstructed version of RelayAddress
class DeconstructedType321(
    val v0: String?,
    val v1: Boolean,
    val v2: String?,
    val v3: String?,
    val v4: Boolean,
    val v5: String?,
    val v6: Long,
    val v7: String?,
    val v8: Long,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: Long,
    val v14: Long,
    val v15: Long,
    val v16: Long,
    val v17: Long,
)

@JvmName("lowerType321")
fun lowerType321(rec: mozilla.appservices.relay.`RelayAddress`): DeconstructedType321 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`maskType`)
    val uniffiFieldLowered1 = lowerBoolean(rec.`enabled`)
    val uniffiFieldLowered2 = lowerString(rec.`description`)
    val uniffiFieldLowered3 = lowerString(rec.`generatedFor`)
    val uniffiFieldLowered4 = lowerBoolean(rec.`blockListEmails`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`usedOn`)
    val uniffiFieldLowered6 = lowerLong(rec.`id`)
    val uniffiFieldLowered7 = lowerString(rec.`address`)
    val uniffiFieldLowered8 = lowerLong(rec.`domain`)
    val uniffiFieldLowered9 = lowerString(rec.`fullAddress`)
    val uniffiFieldLowered10 = lowerString(rec.`createdAt`)
    val uniffiFieldLowered11 = lowerString(rec.`lastModifiedAt`)
    val uniffiFieldLowered12 = lowerOptionString(rec.`lastUsedAt`)
    val uniffiFieldLowered13 = lowerLong(rec.`numForwarded`)
    val uniffiFieldLowered14 = lowerLong(rec.`numBlocked`)
    val uniffiFieldLowered15 = lowerLong(rec.`numLevelOneTrackersBlocked`)
    val uniffiFieldLowered16 = lowerLong(rec.`numReplied`)
    val uniffiFieldLowered17 = lowerLong(rec.`numSpam`)
    return DeconstructedType321(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
        uniffiFieldLowered11,
        uniffiFieldLowered12,
        uniffiFieldLowered13,
        uniffiFieldLowered14,
        uniffiFieldLowered15,
        uniffiFieldLowered16,
        uniffiFieldLowered17,
    )
}

@JvmName("liftType321")
fun liftType321(
    v0: String?,
    v1: Boolean,
    v2: String?,
    v3: String?,
    v4: Boolean,
    v5: String?,
    v6: Long,
    v7: String?,
    v8: Long,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: Long,
    v14: Long,
    v15: Long,
    v16: Long,
    v17: Long,
): mozilla.appservices.relay.`RelayAddress` {
    return mozilla.appservices.relay.`RelayAddress`(
        liftString(
            v0,
        ),
        liftBoolean(
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
            v3,
        ),
        liftBoolean(
            v4,
        ),
        liftOptionString(
            v5,
        ),
        liftLong(
            v6,
        ),
        liftString(
            v7,
        ),
        liftLong(
            v8,
        ),
        liftString(
            v9,
        ),
        liftString(
            v10,
        ),
        liftString(
            v11,
        ),
        liftOptionString(
            v12,
        ),
        liftLong(
            v13,
        ),
        liftLong(
            v14,
        ),
        liftLong(
            v15,
        ),
        liftLong(
            v16,
        ),
        liftLong(
            v17,
        ),
    )
}

fun writeType321(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.relay.`RelayAddress`) {
    writeString(buf, offset + 0, value.`maskType`)
    writeBoolean(buf, offset + 24, value.`enabled`)
    writeString(buf, offset + 32, value.`description`)
    writeString(buf, offset + 56, value.`generatedFor`)
    writeBoolean(buf, offset + 80, value.`blockListEmails`)
    writeType18(buf, offset + 88, value.`usedOn`)
    writeLong(buf, offset + 120, value.`id`)
    writeString(buf, offset + 128, value.`address`)
    writeLong(buf, offset + 152, value.`domain`)
    writeString(buf, offset + 160, value.`fullAddress`)
    writeString(buf, offset + 184, value.`createdAt`)
    writeString(buf, offset + 208, value.`lastModifiedAt`)
    writeType18(buf, offset + 232, value.`lastUsedAt`)
    writeLong(buf, offset + 264, value.`numForwarded`)
    writeLong(buf, offset + 272, value.`numBlocked`)
    writeLong(buf, offset + 280, value.`numLevelOneTrackersBlocked`)
    writeLong(buf, offset + 288, value.`numReplied`)
    writeLong(buf, offset + 296, value.`numSpam`)
}

fun readType321(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.relay.`RelayAddress` {
    return mozilla.appservices.relay.`RelayAddress`(
        readString(buf, offset + 0),
        readBoolean(buf, offset + 24),
        readString(buf, offset + 32),
        readString(buf, offset + 56),
        readBoolean(buf, offset + 80),
        readType18(buf, offset + 88),
        readLong(buf, offset + 120),
        readString(buf, offset + 128),
        readLong(buf, offset + 152),
        readString(buf, offset + 160),
        readString(buf, offset + 184),
        readString(buf, offset + 208),
        readType18(buf, offset + 232),
        readLong(buf, offset + 264),
        readLong(buf, offset + 272),
        readLong(buf, offset + 280),
        readLong(buf, offset + 288),
        readLong(buf, offset + 296),
    )
}



@JvmName("lowerOptionBoolean")
inline fun lowerOptionBoolean(value: kotlin.Boolean?): Long {
    return uniffi.lowerOptionBoolean(value)
}

@JvmName("liftOptionBoolean")
inline fun liftOptionBoolean(
    v1: Long
): kotlin.Boolean? {
    return uniffi.liftOptionBoolean(
        v1
    )
}

inline fun writeType207(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Boolean?) {
    uniffi.writeType207(buf, offset, value)
}

inline fun readType207(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Boolean? {
    return uniffi.readType207(buf, offset)
}



// Deconstructed version of RelayProfile
class DeconstructedType323(
    val v0: Long,
    val v1: Boolean,
    val v2: Boolean,
    val v3: String?,
    val v4: Boolean,
    val v5: Boolean,
    val v6: Boolean,
    val v7: Boolean,
    val v8: Long,
    val v9: Long,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: String?,
    val v14: Boolean,
    val v15: String?,
    val v16: String?,
    val v17: Long,
    val v18: Long,
    val v19: Long,
    val v20: Long,
    val v21: Long,
    val v22: Long,
    val v23: Boolean,
    val v24: Boolean,
)

@JvmName("lowerType323")
fun lowerType323(rec: mozilla.appservices.relay.`RelayProfile`): DeconstructedType323 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerLong(rec.`id`)
    val uniffiFieldLowered1 = lowerBoolean(rec.`serverStorage`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`storePhoneLog`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`subdomain`)
    val uniffiFieldLowered4 = lowerBoolean(rec.`hasPremium`)
    val uniffiFieldLowered5 = lowerBoolean(rec.`hasPhone`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`hasVpn`)
    val uniffiFieldLowered7 = lowerBoolean(rec.`hasMegabundle`)
    val uniffiFieldLowered8 = lowerLong(rec.`onboardingState`)
    val uniffiFieldLowered9 = lowerLong(rec.`onboardingFreeState`)
    val uniffiFieldLowered10 = lowerOptionString(rec.`datePhoneRegistered`)
    val uniffiFieldLowered11 = lowerOptionString(rec.`dateSubscribed`)
    val uniffiFieldLowered12 = lowerOptionString(rec.`avatar`)
    val uniffiFieldLowered13 = lowerString(rec.`nextEmailTry`)
    val uniffiFieldLowered14 = lowerType319(rec.`bounceStatus`)
    val uniffiFieldLowered15 = lowerString(rec.`apiToken`)
    val uniffiFieldLowered16 = lowerLong(rec.`emailsBlocked`)
    val uniffiFieldLowered17 = lowerLong(rec.`emailsForwarded`)
    val uniffiFieldLowered18 = lowerLong(rec.`emailsReplied`)
    val uniffiFieldLowered19 = lowerLong(rec.`levelOneTrackersBlocked`)
    val uniffiFieldLowered20 = lowerOptionBoolean(rec.`removeLevelOneEmailTrackers`)
    val uniffiFieldLowered21 = lowerLong(rec.`totalMasks`)
    val uniffiFieldLowered22 = lowerBoolean(rec.`atMaskLimit`)
    val uniffiFieldLowered23 = lowerBoolean(rec.`metricsEnabled`)
    return DeconstructedType323(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
        uniffiFieldLowered11,
        uniffiFieldLowered12,
        uniffiFieldLowered13,
        uniffiFieldLowered14.v0,
        uniffiFieldLowered14.v1,
        uniffiFieldLowered15,
        uniffiFieldLowered16,
        uniffiFieldLowered17,
        uniffiFieldLowered18,
        uniffiFieldLowered19,
        uniffiFieldLowered20,
        uniffiFieldLowered21,
        uniffiFieldLowered22,
        uniffiFieldLowered23,
    )
}

@JvmName("liftType323")
fun liftType323(
    v0: Long,
    v1: Boolean,
    v2: Boolean,
    v3: String?,
    v4: Boolean,
    v5: Boolean,
    v6: Boolean,
    v7: Boolean,
    v8: Long,
    v9: Long,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: String?,
    v14: Boolean,
    v15: String?,
    v16: String?,
    v17: Long,
    v18: Long,
    v19: Long,
    v20: Long,
    v21: Long,
    v22: Long,
    v23: Boolean,
    v24: Boolean,
): mozilla.appservices.relay.`RelayProfile` {
    return mozilla.appservices.relay.`RelayProfile`(
        liftLong(
            v0,
        ),
        liftBoolean(
            v1,
        ),
        liftBoolean(
            v2,
        ),
        liftOptionString(
            v3,
        ),
        liftBoolean(
            v4,
        ),
        liftBoolean(
            v5,
        ),
        liftBoolean(
            v6,
        ),
        liftBoolean(
            v7,
        ),
        liftLong(
            v8,
        ),
        liftLong(
            v9,
        ),
        liftOptionString(
            v10,
        ),
        liftOptionString(
            v11,
        ),
        liftOptionString(
            v12,
        ),
        liftString(
            v13,
        ),
        liftType319(
            v14,
            v15,
        ),
        liftString(
            v16,
        ),
        liftLong(
            v17,
        ),
        liftLong(
            v18,
        ),
        liftLong(
            v19,
        ),
        liftLong(
            v20,
        ),
        liftOptionBoolean(
            v21,
        ),
        liftLong(
            v22,
        ),
        liftBoolean(
            v23,
        ),
        liftBoolean(
            v24,
        ),
    )
}

fun writeType323(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.relay.`RelayProfile`) {
    writeLong(buf, offset + 0, value.`id`)
    writeBoolean(buf, offset + 8, value.`serverStorage`)
    writeBoolean(buf, offset + 9, value.`storePhoneLog`)
    writeType18(buf, offset + 16, value.`subdomain`)
    writeBoolean(buf, offset + 48, value.`hasPremium`)
    writeBoolean(buf, offset + 49, value.`hasPhone`)
    writeBoolean(buf, offset + 50, value.`hasVpn`)
    writeBoolean(buf, offset + 51, value.`hasMegabundle`)
    writeLong(buf, offset + 56, value.`onboardingState`)
    writeLong(buf, offset + 64, value.`onboardingFreeState`)
    writeType18(buf, offset + 72, value.`datePhoneRegistered`)
    writeType18(buf, offset + 104, value.`dateSubscribed`)
    writeType18(buf, offset + 136, value.`avatar`)
    writeString(buf, offset + 168, value.`nextEmailTry`)
    writeType319(buf, offset + 192, value.`bounceStatus`)
    writeString(buf, offset + 224, value.`apiToken`)
    writeLong(buf, offset + 248, value.`emailsBlocked`)
    writeLong(buf, offset + 256, value.`emailsForwarded`)
    writeLong(buf, offset + 264, value.`emailsReplied`)
    writeLong(buf, offset + 272, value.`levelOneTrackersBlocked`)
    writeType207(buf, offset + 280, value.`removeLevelOneEmailTrackers`)
    writeLong(buf, offset + 288, value.`totalMasks`)
    writeBoolean(buf, offset + 296, value.`atMaskLimit`)
    writeBoolean(buf, offset + 297, value.`metricsEnabled`)
}

fun readType323(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.relay.`RelayProfile` {
    return mozilla.appservices.relay.`RelayProfile`(
        readLong(buf, offset + 0),
        readBoolean(buf, offset + 8),
        readBoolean(buf, offset + 9),
        readType18(buf, offset + 16),
        readBoolean(buf, offset + 48),
        readBoolean(buf, offset + 49),
        readBoolean(buf, offset + 50),
        readBoolean(buf, offset + 51),
        readLong(buf, offset + 56),
        readLong(buf, offset + 64),
        readType18(buf, offset + 72),
        readType18(buf, offset + 104),
        readType18(buf, offset + 136),
        readString(buf, offset + 168),
        readType319(buf, offset + 192),
        readString(buf, offset + 224),
        readLong(buf, offset + 248),
        readLong(buf, offset + 256),
        readLong(buf, offset + 264),
        readLong(buf, offset + 272),
        readType207(buf, offset + 280),
        readLong(buf, offset + 288),
        readBoolean(buf, offset + 296),
        readBoolean(buf, offset + 297),
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



// Deconstructed version of RelayApiError
class DeconstructedType320(
    val v0: Int,
    val v1: String?,
    val v2: Short,
    val v3: String?,
)

@JvmName("lowerType320")
fun lowerType320(value: mozilla.appservices.relay.`RelayApiException`): DeconstructedType320 {
    when (value) {
        is mozilla.appservices.relay.`RelayApiException`.`Network` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType320(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0.toShort(),
                null,
            )
        }
        is mozilla.appservices.relay.`RelayApiException`.`Api` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered2 = lowerUShort(value.`status`)
            val uniffiFieldLowered1 = lowerString(value.`code`)
            val uniffiFieldLowered3 = lowerString(value.`detail`)
            return DeconstructedType320(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
            )
        }
        is mozilla.appservices.relay.`RelayApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType320(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0.toShort(),
                null,
            )
        }
    }
}

@JvmName("liftType320")
fun liftType320(
    v0: Int,
    v1: String?,
    v2: Short,
    v3: String?,
): mozilla.appservices.relay.`RelayApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.relay.`RelayApiException`.`Network`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.relay.`RelayApiException`.`Api`(
                liftUShort(
                    v2,
                ),
                liftString(
                    v1,
                ),
                liftString(
                    v3,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.relay.`RelayApiException`.`Other`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType320: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType320(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.relay.`RelayApiException`) {
    when (value) {
        is mozilla.appservices.relay.`RelayApiException`.`Network` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.relay.`RelayApiException`.`Api` -> {
            writeInt(buf, offset, 1);
            writeUShort(buf, offset + 4, value.`status`)
            writeString(buf, offset + 8, value.`code`)
            writeString(buf, offset + 32, value.`detail`)
        }
        is mozilla.appservices.relay.`RelayApiException`.`Other` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType320(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.relay.`RelayApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.relay.`RelayApiException`.`Network`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.relay.`RelayApiException`.`Api`(
                readUShort(buf, offset + 4),
                readString(buf, offset + 8),
                readString(buf, offset + 32),
            )
        }
        2 -> {
            mozilla.appservices.relay.`RelayApiException`.`Other`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType320: Invalid enum discriminant: ${discriminant}")
        }
    }
}


fun lowerToBuffer322(value: kotlin.collections.List<mozilla.appservices.relay.`RelayAddress`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 304).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType321(buf, offset, it)
        offset += 304
    }
    return buf
}

fun liftFromBuffer322(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.relay.`RelayAddress`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 304
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType321(buf, offset))
                offset += 304
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType322")
fun lowerType322(value: kotlin.collections.List<mozilla.appservices.relay.`RelayAddress`>): java.nio.ByteBuffer {
    return lowerToBuffer322(value)
}

@JvmName("liftType322")
fun liftType322(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.relay.`RelayAddress`> {
    return liftFromBuffer322(buf)
}

fun writeType322(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.relay.`RelayAddress`>) {
    val childBuf = lowerToBuffer322(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType322(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.relay.`RelayAddress`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer322(childBuf)
}

fun objectToHandle5185(obj: mozilla.appservices.relay.`RelayClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject5185(handle: kotlin.Long): mozilla.appservices.relay.`RelayClient` {
    return mozilla.appservices.relay.`RelayClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef5185")
fun lowerObjectRef5185(value: mozilla.appservices.relay.`RelayClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType5185")
fun lowerType5185(value: mozilla.appservices.relay.`RelayClient`): kotlin.Long {
    return objectToHandle5185(value)
}

@JvmName("liftType5185")
fun liftType5185(handle: kotlin.Long): mozilla.appservices.relay.`RelayClient` {
    return handleToObject5185(handle)
}

fun writeType5185(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.relay.`RelayClient`) {
    writeLong(buf, offset, objectToHandle5185(value))
}

fun readType5185(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.relay.`RelayClient` {
    return handleToObject5185(readLong(buf, offset))
}

fun objectToHandle5186(obj: mozilla.appservices.relay.`RelayRemoteSettingsClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject5186(handle: kotlin.Long): mozilla.appservices.relay.`RelayRemoteSettingsClient` {
    return mozilla.appservices.relay.`RelayRemoteSettingsClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef5186")
fun lowerObjectRef5186(value: mozilla.appservices.relay.`RelayRemoteSettingsClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType5186")
fun lowerType5186(value: mozilla.appservices.relay.`RelayRemoteSettingsClient`): kotlin.Long {
    return objectToHandle5186(value)
}

@JvmName("liftType5186")
fun liftType5186(handle: kotlin.Long): mozilla.appservices.relay.`RelayRemoteSettingsClient` {
    return handleToObject5186(handle)
}

fun writeType5186(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.relay.`RelayRemoteSettingsClient`) {
    writeLong(buf, offset, objectToHandle5186(value))
}

fun readType5186(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.relay.`RelayRemoteSettingsClient` {
    return handleToObject5186(readLong(buf, offset))
}



@JvmName("lowerType222")
inline fun lowerType222(value: mozilla.appservices.remotesettings.`RemoteSettingsService`): Long {
    return mozilla.appservices.remotesettings.uniffi.lowerType222(value)
}

@JvmName("liftType222")
inline fun liftType222(
    v1: Long
): mozilla.appservices.remotesettings.`RemoteSettingsService` {
    return mozilla.appservices.remotesettings.uniffi.liftType222(
        v1
    )
}

inline fun writeType222(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsService`) {
    mozilla.appservices.remotesettings.uniffi.writeType222(buf, offset, value)
}

inline fun readType222(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsService` {
    return mozilla.appservices.remotesettings.uniffi.readType222(buf, offset)
}


@JvmName("lowerObjectRef222")
inline fun lowerObjectRef222(value: mozilla.appservices.remotesettings.`RemoteSettingsService`): kotlin.Long {
    return mozilla.appservices.remotesettings.uniffi.lowerObjectRef222(value)
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
    @JvmName("methodRelayRelayClientAcceptTerms")
    @JvmStatic external fun methodRelayRelayClientAcceptTerms(
        `uniffiArg0`: Long,
    )
    @JvmName("methodRelayRelayClientCreateAddress")
    @JvmStatic external fun methodRelayRelayClientCreateAddress(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
    ) : mozilla.appservices.relay.`RelayAddress`
    @JvmName("methodRelayRelayClientFetchAddresses")
    @JvmStatic external fun methodRelayRelayClientFetchAddresses(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodRelayRelayClientFetchProfile")
    @JvmStatic external fun methodRelayRelayClientFetchProfile(
        `uniffiArg0`: Long,
    ) : mozilla.appservices.relay.`RelayProfile`
    @JvmName("methodRelayRelayRemoteSettingsClientShouldShowRelay")
    @JvmStatic external fun methodRelayRelayRemoteSettingsClientShouldShowRelay(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: Boolean,
    ) : Boolean
    @JvmName("constructorRelayRelayClientNew")
    @JvmStatic external fun constructorRelayRelayClientNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("constructorRelayRelayRemoteSettingsClientNew")
    @JvmStatic external fun constructorRelayRelayRemoteSettingsClientNew(
        `uniffiArg0`: Long,
    ) : Long
    @JvmStatic external fun objectCloneHandle5185(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree5185(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle5186(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree5186(handle: kotlin.Long)
}