@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.sync15.uniffi

@JvmName("lowerType98")
fun lowerType98(value: mozilla.appservices.sync15.`DeviceType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType98")
fun liftType98(value: kotlin.Int): mozilla.appservices.sync15.`DeviceType` {
    return mozilla.appservices.sync15.`DeviceType`.values()[value]
}

fun writeType98(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.sync15.`DeviceType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType98(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.sync15.`DeviceType` {
    return liftType98(readInt(buf, offset))
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





@JvmName("lowerType24")
inline fun lowerType24(value: kotlin.collections.Map<kotlin.String, kotlin.Boolean>): java.nio.ByteBuffer? {
    return uniffi.lowerType24(value)
}

@JvmName("liftType24")
inline fun liftType24(
    v1: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.String, kotlin.Boolean> {
    return uniffi.liftType24(
        v1
    )
}

inline fun writeType24(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.Boolean>) {
    uniffi.writeType24(buf, offset, value)
}

inline fun readType24(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.Boolean> {
    return uniffi.readType24(buf, offset)
}



// Deconstructed version of EngineChoicesModel
class DeconstructedType420(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType420")
fun lowerType420(value: mozilla.appservices.sync15.`EngineChoicesModel`): DeconstructedType420 {
    when (value) {
        is mozilla.appservices.sync15.`EngineChoicesModel`.`Account` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerType24(value.`enabledChanges`)
            return DeconstructedType420(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.sync15.`EngineChoicesModel`.`Device` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType420(
                uniffiFieldLowered0,
                null,
            )
        }
    }
}

@JvmName("liftType420")
fun liftType420(
    v0: Int,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.sync15.`EngineChoicesModel` {
    when (v0) {
        0 -> {
            return mozilla.appservices.sync15.`EngineChoicesModel`.`Account`(
                liftType24(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.sync15.`EngineChoicesModel`.`Device`
        }
        else -> {
            throw uniffi.InternalException("liftType420: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType420(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.sync15.`EngineChoicesModel`) {
    when (value) {
        is mozilla.appservices.sync15.`EngineChoicesModel`.`Account` -> {
            writeInt(buf, offset, 0);
            writeType24(buf, offset + 8, value.`enabledChanges`)
        }
        is mozilla.appservices.sync15.`EngineChoicesModel`.`Device` -> {
            writeInt(buf, offset, 1);
        }
    }
}

fun readType420(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.sync15.`EngineChoicesModel` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.sync15.`EngineChoicesModel`.`Account`(
                readType24(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.sync15.`EngineChoicesModel`.`Device`
        }
        else -> {
            throw uniffi.InternalException("liftType420: Invalid enum discriminant: ${discriminant}")
        }
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
}