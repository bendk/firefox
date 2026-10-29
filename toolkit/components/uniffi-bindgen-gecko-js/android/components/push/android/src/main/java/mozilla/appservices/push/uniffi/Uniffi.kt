@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.push.uniffi
import uniffi.DeconstructedType11



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





@JvmName("lowerVecByte")
inline fun lowerVecByte(value: kotlin.collections.List<kotlin.Byte>): kotlin.ByteArray? {
    return uniffi.lowerVecByte(value)
}

@JvmName("liftVecByte")
inline fun liftVecByte(
    v1: kotlin.ByteArray?
): kotlin.collections.List<kotlin.Byte> {
    return uniffi.liftVecByte(
        v1
    )
}

inline fun writeType307(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.Byte>) {
    uniffi.writeType307(buf, offset, value)
}

inline fun readType307(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.Byte> {
    return uniffi.readType307(buf, offset)
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



// Deconstructed version of DecryptResponse
class DeconstructedType314(
    val v0: kotlin.ByteArray?,
    val v1: String?,
)

@JvmName("lowerType314")
fun lowerType314(rec: mozilla.appservices.push.`DecryptResponse`): DeconstructedType314 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerVecByte(rec.`result`)
    val uniffiFieldLowered1 = lowerString(rec.`scope`)
    return DeconstructedType314(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType314")
fun liftType314(
    v0: kotlin.ByteArray?,
    v1: String?,
): mozilla.appservices.push.`DecryptResponse` {
    return mozilla.appservices.push.`DecryptResponse`(
        liftVecByte(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType314(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`DecryptResponse`) {
    writeType307(buf, offset + 0, value.`result`)
    writeString(buf, offset + 16, value.`scope`)
}

fun readType314(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`DecryptResponse` {
    return mozilla.appservices.push.`DecryptResponse`(
        readType307(buf, offset + 0),
        readString(buf, offset + 16),
    )
}

// Deconstructed version of KeyInfo
class DeconstructedType310(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType310")
fun lowerType310(rec: mozilla.appservices.push.`KeyInfo`): DeconstructedType310 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`auth`)
    val uniffiFieldLowered1 = lowerString(rec.`p256dh`)
    return DeconstructedType310(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType310")
fun liftType310(
    v0: String?,
    v1: String?,
): mozilla.appservices.push.`KeyInfo` {
    return mozilla.appservices.push.`KeyInfo`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType310(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`KeyInfo`) {
    writeString(buf, offset + 0, value.`auth`)
    writeString(buf, offset + 24, value.`p256dh`)
}

fun readType310(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`KeyInfo` {
    return mozilla.appservices.push.`KeyInfo`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
    )
}

@JvmName("lowerType308")
fun lowerType308(value: mozilla.appservices.push.`PushHttpProtocol`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType308")
fun liftType308(value: kotlin.Int): mozilla.appservices.push.`PushHttpProtocol` {
    return mozilla.appservices.push.`PushHttpProtocol`.values()[value]
}

fun writeType308(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`PushHttpProtocol`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType308(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`PushHttpProtocol` {
    return liftType308(readInt(buf, offset))
}

@JvmName("lowerType309")
fun lowerType309(value: mozilla.appservices.push.`BridgeType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType309")
fun liftType309(value: kotlin.Int): mozilla.appservices.push.`BridgeType` {
    return mozilla.appservices.push.`BridgeType`.values()[value]
}

fun writeType309(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`BridgeType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType309(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`BridgeType` {
    return liftType309(readInt(buf, offset))
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



// Deconstructed version of PushConfiguration
class DeconstructedType312(
    val v0: String?,
    val v1: Int,
    val v2: Int,
    val v3: String?,
    val v4: String?,
    val v5: Boolean,
    val v6: Long,
)

@JvmName("lowerType312")
fun lowerType312(rec: mozilla.appservices.push.`PushConfiguration`): DeconstructedType312 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`serverHost`)
    val uniffiFieldLowered1 = lowerType308(rec.`httpProtocol`)
    val uniffiFieldLowered2 = lowerType309(rec.`bridgeType`)
    val uniffiFieldLowered3 = lowerString(rec.`senderId`)
    val uniffiFieldLowered4 = lowerString(rec.`databasePath`)
    val uniffiFieldLowered5 = lowerType11(rec.`verifyConnectionRateLimiter`)
    return DeconstructedType312(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
    )
}

@JvmName("liftType312")
fun liftType312(
    v0: String?,
    v1: Int,
    v2: Int,
    v3: String?,
    v4: String?,
    v5: Boolean,
    v6: Long,
): mozilla.appservices.push.`PushConfiguration` {
    return mozilla.appservices.push.`PushConfiguration`(
        liftString(
            v0,
        ),
        liftType308(
            v1,
        ),
        liftType309(
            v2,
        ),
        liftString(
            v3,
        ),
        liftString(
            v4,
        ),
        liftType11(
            v5,
            v6,
        ),
    )
}

fun writeType312(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`PushConfiguration`) {
    writeString(buf, offset + 0, value.`serverHost`)
    writeType308(buf, offset + 24, value.`httpProtocol`)
    writeType309(buf, offset + 28, value.`bridgeType`)
    writeString(buf, offset + 32, value.`senderId`)
    writeString(buf, offset + 56, value.`databasePath`)
    writeType11(buf, offset + 80, value.`verifyConnectionRateLimiter`)
}

fun readType312(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`PushConfiguration` {
    return mozilla.appservices.push.`PushConfiguration`(
        readString(buf, offset + 0),
        readType308(buf, offset + 24),
        readType309(buf, offset + 28),
        readString(buf, offset + 32),
        readString(buf, offset + 56),
        readType11(buf, offset + 80),
    )
}

// Deconstructed version of PushSubscriptionChanged
class DeconstructedType318(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType318")
fun lowerType318(rec: mozilla.appservices.push.`PushSubscriptionChanged`): DeconstructedType318 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`channelId`)
    val uniffiFieldLowered1 = lowerString(rec.`scope`)
    return DeconstructedType318(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType318")
fun liftType318(
    v0: String?,
    v1: String?,
): mozilla.appservices.push.`PushSubscriptionChanged` {
    return mozilla.appservices.push.`PushSubscriptionChanged`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType318(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`PushSubscriptionChanged`) {
    writeString(buf, offset + 0, value.`channelId`)
    writeString(buf, offset + 24, value.`scope`)
}

fun readType318(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`PushSubscriptionChanged` {
    return mozilla.appservices.push.`PushSubscriptionChanged`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
    )
}

// Deconstructed version of SubscriptionInfo
class DeconstructedType311(
    val v0: String?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType311")
fun lowerType311(rec: mozilla.appservices.push.`SubscriptionInfo`): DeconstructedType311 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`endpoint`)
    val uniffiFieldLowered1 = lowerType310(rec.`keys`)
    return DeconstructedType311(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
    )
}

@JvmName("liftType311")
fun liftType311(
    v0: String?,
    v1: String?,
    v2: String?,
): mozilla.appservices.push.`SubscriptionInfo` {
    return mozilla.appservices.push.`SubscriptionInfo`(
        liftString(
            v0,
        ),
        liftType310(
            v1,
            v2,
        ),
    )
}

fun writeType311(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`SubscriptionInfo`) {
    writeString(buf, offset + 0, value.`endpoint`)
    writeType310(buf, offset + 24, value.`keys`)
}

fun readType311(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`SubscriptionInfo` {
    return mozilla.appservices.push.`SubscriptionInfo`(
        readString(buf, offset + 0),
        readType310(buf, offset + 24),
    )
}

// Deconstructed version of SubscriptionResponse
class DeconstructedType316(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType316")
fun lowerType316(rec: mozilla.appservices.push.`SubscriptionResponse`): DeconstructedType316 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`channelId`)
    val uniffiFieldLowered1 = lowerType311(rec.`subscriptionInfo`)
    return DeconstructedType316(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
    )
}

@JvmName("liftType316")
fun liftType316(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
): mozilla.appservices.push.`SubscriptionResponse` {
    return mozilla.appservices.push.`SubscriptionResponse`(
        liftString(
            v0,
        ),
        liftType311(
            v1,
            v2,
            v3,
        ),
    )
}

fun writeType316(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`SubscriptionResponse`) {
    writeString(buf, offset + 0, value.`channelId`)
    writeType311(buf, offset + 24, value.`subscriptionInfo`)
}

fun readType316(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`SubscriptionResponse` {
    return mozilla.appservices.push.`SubscriptionResponse`(
        readString(buf, offset + 0),
        readType311(buf, offset + 24),
    )
}

@JvmName("liftType313")
fun liftType313(v0: kotlin.Int, v1: kotlin.String): mozilla.appservices.push.`PushApiException` {
    return when(v0) {
        0 -> mozilla.appservices.push.`PushApiException`.`UaidNotRecognizedException`(v1)
        1 -> mozilla.appservices.push.`PushApiException`.`RecordNotFoundException`(v1)
        2 -> mozilla.appservices.push.`PushApiException`.`InternalException`(v1)
        else -> throw uniffi.InternalException("liftType313: Invalid enum value: ${v0}")
    }
}


fun readType313(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`PushApiException` {
    val uniffiDiscriminent = readInt(buf, offset)
    return when(uniffiDiscriminent) {
        0 -> mozilla.appservices.push.`PushApiException`.`UaidNotRecognizedException`(readString(buf, offset + 8))
        1 -> mozilla.appservices.push.`PushApiException`.`RecordNotFoundException`(readString(buf, offset + 8))
        2 -> mozilla.appservices.push.`PushApiException`.`InternalException`(readString(buf, offset + 8))
        else -> throw uniffi.InternalException("readType313: Invalid enum value: ${uniffiDiscriminent}")
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




// Deconstructed version of mozilla.appservices.push.`SubscriptionResponse`?
class DeconstructedType315(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
)

@JvmName("lowerType315")
fun lowerType315(value: mozilla.appservices.push.`SubscriptionResponse`?): DeconstructedType315 {
    if (value == null) {
        return DeconstructedType315(
            false,
            null,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType316(value)
        return DeconstructedType315(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
        )
    }
}

@JvmName("liftType315")
fun liftType315(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
): mozilla.appservices.push.`SubscriptionResponse`? {
    if (v0) {
        return liftType316(
            v1,
            v2,
            v3,
            v4,
        )
    } else {
        return null
    }
}

fun writeType315(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`SubscriptionResponse`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType316(buf, offset + 8, value)
    }
}
fun readType315(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`SubscriptionResponse`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType316(buf, offset + 8)
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




fun lowerToBuffer317(value: kotlin.collections.List<mozilla.appservices.push.`PushSubscriptionChanged`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 48).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType318(buf, offset, it)
        offset += 48
    }
    return buf
}

fun liftFromBuffer317(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.push.`PushSubscriptionChanged`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 48
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType318(buf, offset))
                offset += 48
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType317")
fun lowerType317(value: kotlin.collections.List<mozilla.appservices.push.`PushSubscriptionChanged`>): java.nio.ByteBuffer {
    return lowerToBuffer317(value)
}

@JvmName("liftType317")
fun liftType317(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.push.`PushSubscriptionChanged`> {
    return liftFromBuffer317(buf)
}

fun writeType317(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.push.`PushSubscriptionChanged`>) {
    val childBuf = lowerToBuffer317(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType317(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.push.`PushSubscriptionChanged`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer317(childBuf)
}

fun objectToHandle4879(obj: mozilla.appservices.push.`PushManager`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject4879(handle: kotlin.Long): mozilla.appservices.push.`PushManager` {
    return mozilla.appservices.push.`PushManager`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef4879")
fun lowerObjectRef4879(value: mozilla.appservices.push.`PushManager`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType4879")
fun lowerType4879(value: mozilla.appservices.push.`PushManager`): kotlin.Long {
    return objectToHandle4879(value)
}

@JvmName("liftType4879")
fun liftType4879(handle: kotlin.Long): mozilla.appservices.push.`PushManager` {
    return handleToObject4879(handle)
}

fun writeType4879(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.push.`PushManager`) {
    writeLong(buf, offset, objectToHandle4879(value))
}

fun readType4879(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.push.`PushManager` {
    return handleToObject4879(readLong(buf, offset))
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
    @JvmName("methodPushPushManagerDecrypt")
    @JvmStatic external fun methodPushPushManagerDecrypt(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : mozilla.appservices.push.`DecryptResponse`
    @JvmName("methodPushPushManagerGetSubscription")
    @JvmStatic external fun methodPushPushManagerGetSubscription(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.push.`SubscriptionResponse`?
    @JvmName("methodPushPushManagerSubscribe")
    @JvmStatic external fun methodPushPushManagerSubscribe(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    ) : mozilla.appservices.push.`SubscriptionResponse`
    @JvmName("methodPushPushManagerUnsubscribe")
    @JvmStatic external fun methodPushPushManagerUnsubscribe(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodPushPushManagerUnsubscribeAll")
    @JvmStatic external fun methodPushPushManagerUnsubscribeAll(
        `uniffiArg0`: Long,
    )
    @JvmName("methodPushPushManagerUpdate")
    @JvmStatic external fun methodPushPushManagerUpdate(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodPushPushManagerVerifyConnection")
    @JvmStatic external fun methodPushPushManagerVerifyConnection(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : java.nio.ByteBuffer?
    @JvmName("constructorPushPushManagerNew")
    @JvmStatic external fun constructorPushPushManagerNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: Int,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: Long,
    ) : Long
    @JvmStatic external fun objectCloneHandle4879(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree4879(handle: kotlin.Long)
}