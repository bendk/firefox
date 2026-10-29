@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.rust_log_forwarder.uniffi

@JvmName("lowerType344")
fun lowerType344(value: mozilla.appservices.rust_log_forwarder.`Level`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType344")
fun liftType344(value: kotlin.Int): mozilla.appservices.rust_log_forwarder.`Level` {
    return mozilla.appservices.rust_log_forwarder.`Level`.values()[value]
}

fun writeType344(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.rust_log_forwarder.`Level`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType344(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.rust_log_forwarder.`Level` {
    return liftType344(readInt(buf, offset))
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



// Deconstructed version of Record
class DeconstructedType345(
    val v0: Int,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType345")
fun lowerType345(rec: mozilla.appservices.rust_log_forwarder.`Record`): DeconstructedType345 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType344(rec.`level`)
    val uniffiFieldLowered1 = lowerString(rec.`target`)
    val uniffiFieldLowered2 = lowerString(rec.`message`)
    return DeconstructedType345(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType345")
fun liftType345(
    v0: Int,
    v1: String?,
    v2: String?,
): mozilla.appservices.rust_log_forwarder.`Record` {
    return mozilla.appservices.rust_log_forwarder.`Record`(
        liftType344(
            v0,
        ),
        liftString(
            v1,
        ),
        liftString(
            v2,
        ),
    )
}

fun writeType345(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.rust_log_forwarder.`Record`) {
    writeType344(buf, offset + 0, value.`level`)
    writeString(buf, offset + 8, value.`target`)
    writeString(buf, offset + 32, value.`message`)
}

fun readType345(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.rust_log_forwarder.`Record` {
    return mozilla.appservices.rust_log_forwarder.`Record`(
        readType344(buf, offset + 0),
        readString(buf, offset + 8),
        readString(buf, offset + 32),
    )
}


public val callbackInterfaceHandleMap343 = uniffi.HandleMap<mozilla.appservices.rust_log_forwarder.`AppServicesLogger`>();
fun callbackInterfaceDispatch343000000(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: Int,
    `uniffiArg2`: String?,
    `uniffiArg3`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap343.get(uniffiHandle)
    val `record` = liftType345(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
    )
    val uniffiReturn = uniffiObj.`log`(
        `record`,
    )
}

fun callbackInterfaceFree343(handle: kotlin.Long) {
    callbackInterfaceHandleMap343.remove(handle)
}
fun lowerType343(value: mozilla.appservices.rust_log_forwarder.`AppServicesLogger`): kotlin.Long {
    return callbackInterfaceHandleMap343.insert(value)
}

fun writeType343(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.rust_log_forwarder.`AppServicesLogger`) {
    writeLong(buf, offset, callbackInterfaceHandleMap343.insert(value))
}

// Note: no read/lift function, since callback interfaces can't be passed back from Rust to Kotlin


@JvmName("lowerType342")
fun lowerType342(value: mozilla.appservices.rust_log_forwarder.`AppServicesLogger`?): kotlin.Long {
    if (value == null) {
        return 0
    } else {
        return lowerType343(value)
    }
}

fun writeType342(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.rust_log_forwarder.`AppServicesLogger`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType343(buf, offset + 8, value)
    }
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
    @JvmName("functionRustLogForwarderSetLogger")
    @JvmStatic external fun functionRustLogForwarderSetLogger(
        `uniffiArg0`: Long,
    )
    @JvmName("functionRustLogForwarderSetMaxLevel")
    @JvmStatic external fun functionRustLogForwarderSetMaxLevel(
        `uniffiArg0`: Int,
    )
}