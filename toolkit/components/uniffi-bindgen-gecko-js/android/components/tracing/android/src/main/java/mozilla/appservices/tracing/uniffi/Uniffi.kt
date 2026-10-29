@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.tracing.uniffi



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



@JvmName("lowerType453")
fun lowerType453(value: mozilla.appservices.tracing.`TracingLevel`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType453")
fun liftType453(value: kotlin.Int): mozilla.appservices.tracing.`TracingLevel` {
    return mozilla.appservices.tracing.`TracingLevel`.values()[value]
}

fun writeType453(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`TracingLevel`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType453(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`TracingLevel` {
    return liftType453(readInt(buf, offset))
}

// Deconstructed version of EventTarget
class DeconstructedType451(
    val v0: String?,
    val v1: Int,
)

@JvmName("lowerType451")
fun lowerType451(rec: mozilla.appservices.tracing.`EventTarget`): DeconstructedType451 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`target`)
    val uniffiFieldLowered1 = lowerType453(rec.`level`)
    return DeconstructedType451(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType451")
fun liftType451(
    v0: String?,
    v1: Int,
): mozilla.appservices.tracing.`EventTarget` {
    return mozilla.appservices.tracing.`EventTarget`(
        liftString(
            v0,
        ),
        liftType453(
            v1,
        ),
    )
}

fun writeType451(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`EventTarget`) {
    writeString(buf, offset + 0, value.`target`)
    writeType453(buf, offset + 24, value.`level`)
}

fun readType451(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`EventTarget` {
    return mozilla.appservices.tracing.`EventTarget`(
        readString(buf, offset + 0),
        readType453(buf, offset + 24),
    )
}


fun lowerToBuffer450(value: kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType451(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer450(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType451(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType450")
fun lowerType450(value: kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`>): java.nio.ByteBuffer {
    return lowerToBuffer450(value)
}

@JvmName("liftType450")
fun liftType450(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`> {
    return liftFromBuffer450(buf)
}

fun writeType450(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`>) {
    val childBuf = lowerToBuffer450(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType450(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.tracing.`EventTarget`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer450(childBuf)
}


// Deconstructed version of mozilla.appservices.tracing.`TracingLevel`?
class DeconstructedType452(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType452")
fun lowerType452(value: mozilla.appservices.tracing.`TracingLevel`?): DeconstructedType452 {
    if (value == null) {
        return DeconstructedType452(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType453(value)
        return DeconstructedType452(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType452")
fun liftType452(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.tracing.`TracingLevel`? {
    if (v0) {
        return liftType453(
            v1,
        )
    } else {
        return null
    }
}

fun writeType452(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`TracingLevel`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType453(buf, offset + 4, value)
    }
}
fun readType452(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`TracingLevel`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType453(buf, offset + 4)
    }
}

// Deconstructed version of EventSinkSpecification
class DeconstructedType447(
    val v0: java.nio.ByteBuffer?,
    val v1: Boolean,
    val v2: Int,
)

@JvmName("lowerType447")
fun lowerType447(rec: mozilla.appservices.tracing.`EventSinkSpecification`): DeconstructedType447 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType450(rec.`targets`)
    val uniffiFieldLowered1 = lowerType452(rec.`minLevel`)
    return DeconstructedType447(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
    )
}

@JvmName("liftType447")
fun liftType447(
    v0: java.nio.ByteBuffer?,
    v1: Boolean,
    v2: Int,
): mozilla.appservices.tracing.`EventSinkSpecification` {
    return mozilla.appservices.tracing.`EventSinkSpecification`(
        liftType450(
            v0,
        ),
        liftType452(
            v1,
            v2,
        ),
    )
}

fun writeType447(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`EventSinkSpecification`) {
    writeType450(buf, offset + 0, value.`targets`)
    writeType452(buf, offset + 16, value.`minLevel`)
}

fun readType447(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`EventSinkSpecification` {
    return mozilla.appservices.tracing.`EventSinkSpecification`(
        readType450(buf, offset + 0),
        readType452(buf, offset + 16),
    )
}


@JvmName("lowerType454")
fun lowerType454(value: mozilla.appservices.tracing.`TracingJsonValue`): String? {
    return lowerString(value)
}

@JvmName("liftType454")
fun liftType454(
    v0: String?,
): mozilla.appservices.tracing.`TracingJsonValue` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType454(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`TracingJsonValue`) {
    writeString(buf, offset, value)
}

fun readType454(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`TracingJsonValue` {
    val builtinValue = readString(buf, offset)
    return builtinValue
}

// Deconstructed version of TracingEvent
class DeconstructedType455(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
)

@JvmName("lowerType455")
fun lowerType455(rec: mozilla.appservices.tracing.`TracingEvent`): DeconstructedType455 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType453(rec.`level`)
    val uniffiFieldLowered1 = lowerString(rec.`target`)
    val uniffiFieldLowered2 = lowerString(rec.`name`)
    val uniffiFieldLowered3 = lowerString(rec.`message`)
    val uniffiFieldLowered4 = lowerType454(rec.`fields`)
    return DeconstructedType455(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType455")
fun liftType455(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
): mozilla.appservices.tracing.`TracingEvent` {
    return mozilla.appservices.tracing.`TracingEvent`(
        liftType453(
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
        liftType454(
            v4,
        ),
    )
}

fun writeType455(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`TracingEvent`) {
    writeType453(buf, offset + 0, value.`level`)
    writeString(buf, offset + 8, value.`target`)
    writeString(buf, offset + 32, value.`name`)
    writeString(buf, offset + 56, value.`message`)
    writeType454(buf, offset + 80, value.`fields`)
}

fun readType455(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`TracingEvent` {
    return mozilla.appservices.tracing.`TracingEvent`(
        readType453(buf, offset + 0),
        readString(buf, offset + 8),
        readString(buf, offset + 32),
        readString(buf, offset + 56),
        readType454(buf, offset + 80),
    )
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




@JvmName("lowerType449")
fun lowerType449(value: mozilla.appservices.tracing.`EventSinkId`): Int {
    return lowerUInt(value)
}

@JvmName("liftType449")
fun liftType449(
    v0: Int,
): mozilla.appservices.tracing.`EventSinkId` {
    val builtinValue = liftUInt(
        v0,
    )
    return builtinValue
}

fun writeType449(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`EventSinkId`) {
    writeUInt(buf, offset, value)
}

fun readType449(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.tracing.`EventSinkId` {
    val builtinValue = readUInt(buf, offset)
    return builtinValue
}


public val callbackInterfaceHandleMap448 = uniffi.HandleMap<mozilla.appservices.tracing.`EventSink`>();
fun callbackInterfaceDispatch448000000(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: Int,
    `uniffiArg2`: String?,
    `uniffiArg3`: String?,
    `uniffiArg4`: String?,
    `uniffiArg5`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap448.get(uniffiHandle)
    val `event` = liftType455(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
        `uniffiArg4`,
        `uniffiArg5`,
    )
    val uniffiReturn = uniffiObj.`onEvent`(
        `event`,
    )
}

fun callbackInterfaceFree448(handle: kotlin.Long) {
    callbackInterfaceHandleMap448.remove(handle)
}
fun lowerType448(value: mozilla.appservices.tracing.`EventSink`): kotlin.Long {
    return callbackInterfaceHandleMap448.insert(value)
}

fun writeType448(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.tracing.`EventSink`) {
    writeLong(buf, offset, callbackInterfaceHandleMap448.insert(value))
}

// Note: no read/lift function, since callback interfaces can't be passed back from Rust to Kotlin



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
    @JvmName("functionTracingSupportRegisterEventSink")
    @JvmStatic external fun functionTracingSupportRegisterEventSink(
        `uniffiArg0`: java.nio.ByteBuffer?,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: Int,
        `uniffiArg3`: Long,
    ) : Int
    @JvmName("functionTracingSupportUnregisterEventSink")
    @JvmStatic external fun functionTracingSupportUnregisterEventSink(
        `uniffiArg0`: Int,
    )
}