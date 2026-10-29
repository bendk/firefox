@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package uniffi.context_id.uniffi



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



// Deconstructed version of ApiError
class DeconstructedType91(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType91")
fun lowerType91(value: uniffi.context_id.`ApiException`): DeconstructedType91 {
    when (value) {
        is uniffi.context_id.`ApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType91(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType91")
fun liftType91(
    v0: Int,
    v1: String?,
): uniffi.context_id.`ApiException` {
    when (v0) {
        0 -> {
            return uniffi.context_id.`ApiException`.`Other`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType91: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType91(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: uniffi.context_id.`ApiException`) {
    when (value) {
        is uniffi.context_id.`ApiException`.`Other` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType91(buf: java.nio.ByteBuffer, offset: kotlin.Int): uniffi.context_id.`ApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            uniffi.context_id.`ApiException`.`Other`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType91: Invalid enum discriminant: ${discriminant}")
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



fun objectToHandle1293(obj: uniffi.context_id.`ContextIdComponent`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject1293(handle: kotlin.Long): uniffi.context_id.`ContextIdComponent` {
    return uniffi.context_id.`ContextIdComponent`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef1293")
fun lowerObjectRef1293(value: uniffi.context_id.`ContextIdComponent`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType1293")
fun lowerType1293(value: uniffi.context_id.`ContextIdComponent`): kotlin.Long {
    return objectToHandle1293(value)
}

@JvmName("liftType1293")
fun liftType1293(handle: kotlin.Long): uniffi.context_id.`ContextIdComponent` {
    return handleToObject1293(handle)
}

fun writeType1293(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: uniffi.context_id.`ContextIdComponent`) {
    writeLong(buf, offset, objectToHandle1293(value))
}

fun readType1293(buf: java.nio.ByteBuffer, offset: kotlin.Int): uniffi.context_id.`ContextIdComponent` {
    return handleToObject1293(readLong(buf, offset))
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




public val callbackInterfaceHandleMap90 = uniffi.HandleMap<uniffi.context_id.`ContextIdCallback`>();
fun callbackInterfaceDispatch90000000(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: Long,
)
{
    val uniffiObj = callbackInterfaceHandleMap90.get(uniffiHandle)
    val `contextId` = liftString(
        `uniffiArg1`,
    )
    val `creationDate` = liftLong(
        `uniffiArg2`,
    )
    val uniffiReturn = uniffiObj.`persist`(
        `contextId`,
        `creationDate`,
    )
}
fun callbackInterfaceDispatch90000001(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap90.get(uniffiHandle)
    val `oldContextId` = liftString(
        `uniffiArg1`,
    )
    val uniffiReturn = uniffiObj.`rotated`(
        `oldContextId`,
    )
}

fun callbackInterfaceFree90(handle: kotlin.Long) {
    callbackInterfaceHandleMap90.remove(handle)
}
fun lowerType90(value: uniffi.context_id.`ContextIdCallback`): kotlin.Long {
    return callbackInterfaceHandleMap90.insert(value)
}

fun writeType90(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: uniffi.context_id.`ContextIdCallback`) {
    writeLong(buf, offset, callbackInterfaceHandleMap90.insert(value))
}

// Note: no read/lift function, since callback interfaces can't be passed back from Rust to Kotlin



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
    @JvmName("methodContextIdContextIdComponentForceRotation")
    @JvmStatic external fun methodContextIdContextIdComponentForceRotation(
        `uniffiArg0`: Long,
    )
    @JvmName("methodContextIdContextIdComponentRequest")
    @JvmStatic external fun methodContextIdContextIdComponentRequest(
        `uniffiArg0`: Long,
        `uniffiArg1`: Byte,
    ) : String?
    @JvmName("methodContextIdContextIdComponentUnsetCallback")
    @JvmStatic external fun methodContextIdContextIdComponentUnsetCallback(
        `uniffiArg0`: Long,
    )
    @JvmName("constructorContextIdContextIdComponentNew")
    @JvmStatic external fun constructorContextIdContextIdComponentNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: Long,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: Long,
    ) : Long
    @JvmStatic external fun objectCloneHandle1293(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree1293(handle: kotlin.Long)
}