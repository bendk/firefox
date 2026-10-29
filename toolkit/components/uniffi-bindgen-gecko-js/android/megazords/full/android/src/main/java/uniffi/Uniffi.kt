@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
package uniffi



fun readByte(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Byte = buf.get(offset)
fun writeByte(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Byte) = buf.put(offset, value)

fun readUByte(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UByte = buf.get(offset).toUByte()
fun writeUByte(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UByte) = buf.put(offset, value.toByte())

fun readShort(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Short = buf.getShort(offset)
fun writeShort(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Short) = buf.putShort(offset, value)

fun readUShort(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UShort = buf.getShort(offset).toUShort()
fun writeUShort(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UShort) = buf.putShort(offset, value.toShort())

fun readInt(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Int = buf.getInt(offset)
fun writeInt(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Int) = buf.putInt(offset, value)

fun readUInt(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UInt = buf.getInt(offset).toUInt()
fun writeUInt(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UInt) = buf.putInt(offset, value.toInt())

fun readLong(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Long = buf.getLong(offset)
fun writeLong(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Long) = buf.putLong(offset, value)

fun readULong(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ULong = buf.getLong(offset).toULong()
fun writeULong(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ULong) = buf.putLong(offset, value.toLong())

fun readFloat(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Float = buf.getFloat(offset)
fun writeFloat(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Float) = buf.putFloat(offset, value)

fun readDouble(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Double = buf.getDouble(offset)
fun writeDouble(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Double) = buf.putDouble(offset, value)

fun readBoolean(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Boolean {
    return buf.get(offset).toInt() == 1
}
fun writeBoolean(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Boolean) {
    buf.put(offset, if (value) { 1.toByte() } else { 0.toByte() })
}

fun readString(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.String {
    return Scaffolding.ffiBufferReadString(buf, offset)
}

fun writeString(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.String) {
    Scaffolding.ffiBufferWriteString(buf, offset, value)
}

fun readBytes(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ByteArray {
    return Scaffolding.ffiBufferReadBytes(buf, offset)
}

fun writeBytes(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ByteArray) {
    Scaffolding.ffiBufferWriteBytes(buf, offset, value)
}

fun readBuffer(buf: java.nio.ByteBuffer, offset: kotlin.Int): java.nio.ByteBuffer {
    return Scaffolding.ffiBufferReadBuffer(buf, offset).order(java.nio.ByteOrder.nativeOrder())
}

fun writeBuffer(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: java.nio.ByteBuffer) {
    Scaffolding.ffiBufferWriteBuffer(buf, offset, value)
}
fun liftUByte(v: kotlin.Byte): kotlin.UByte = v.toUByte()
fun lowerUByte(v: kotlin.UByte): kotlin.Byte = v.toByte()

fun liftByte(v: kotlin.Byte): kotlin.Byte = v
fun lowerByte(v: kotlin.Byte): kotlin.Byte = v

fun liftUShort(v: kotlin.Short): kotlin.UShort = v.toUShort()
fun lowerUShort(v: kotlin.UShort): kotlin.Short = v.toShort()

fun liftShort(v: kotlin.Short): kotlin.Short = v
fun lowerShort(v: kotlin.Short): kotlin.Short = v

fun liftUInt(v: kotlin.Int): kotlin.UInt = v.toUInt()
fun lowerUInt(v: kotlin.UInt): kotlin.Int = v.toInt()

fun liftInt(v: kotlin.Int): kotlin.Int = v
fun lowerInt(v: kotlin.Int): kotlin.Int = v

fun liftULong(v: kotlin.Long): kotlin.ULong = v.toULong()
fun lowerULong(v: kotlin.ULong): kotlin.Long = v.toLong()

fun liftLong(v: kotlin.Long): kotlin.Long = v
fun lowerLong(v: kotlin.Long): kotlin.Long = v

fun liftFloat(v: kotlin.Float): kotlin.Float = v
fun lowerFloat(v: kotlin.Float): kotlin.Float = v

fun liftDouble(v: kotlin.Double): kotlin.Double = v
fun lowerDouble(v: kotlin.Double): kotlin.Double = v

fun liftBoolean(v: kotlin.Boolean): kotlin.Boolean = v
fun lowerBoolean(v: kotlin.Boolean): kotlin.Boolean = v

fun liftString(v: kotlin.String?): kotlin.String = v!!
fun lowerString(v: kotlin.String): kotlin.String? = v

fun liftBytes(v: kotlin.ByteArray?): kotlin.ByteArray = v!!
fun lowerBytes(v: kotlin.ByteArray): kotlin.ByteArray? = v

// Optimized path for passing byte references from Kotlin -> Rust.
// These are `&[u8]` on Rust and `ByteBuffer` on Kotlin.
fun lowerBytesRef(v: java.nio.ByteBuffer): java.nio.ByteBuffer? {
    if (!v.isDirect()) {
        throw kotlin.IllegalArgumentException("Non-direct byte buffer")
    }
    return v
}

fun liftVecByte(value: kotlin.ByteArray?): kotlin.collections.List<kotlin.Byte> = value!!.toList()
fun lowerVecByte(value: kotlin.collections.List<kotlin.Byte>): kotlin.ByteArray? = value.toByteArray()

fun liftVecUByte(value: kotlin.ByteArray?): kotlin.collections.List<kotlin.UByte> = value!!.asUByteArray().toList()
fun lowerVecUByte(value: kotlin.collections.List<kotlin.UByte>): kotlin.ByteArray = value.toUByteArray().asByteArray()

fun liftVecShort(value: kotlin.ShortArray?): kotlin.collections.List<kotlin.Short> = value!!.toList()
fun lowerVecShort(value: kotlin.collections.List<kotlin.Short>): kotlin.ShortArray? = value.toShortArray()

fun liftVecUShort(value: kotlin.ShortArray?): kotlin.collections.List<kotlin.UShort> = value!!.asUShortArray().toList()
fun lowerVecUShort(value: kotlin.collections.List<kotlin.UShort>): kotlin.ShortArray = value.toUShortArray().asShortArray()

fun liftVecInt(value: kotlin.IntArray?): kotlin.collections.List<kotlin.Int> = value!!.toList()
fun lowerVecInt(value: kotlin.collections.List<kotlin.Int>): kotlin.IntArray? = value.toIntArray()

fun liftVecUInt(value: kotlin.IntArray?): kotlin.collections.List<kotlin.UInt> = value!!.asUIntArray().toList()
fun lowerVecUInt(value: kotlin.collections.List<kotlin.UInt>): kotlin.IntArray = value.toUIntArray().asIntArray()

fun liftVecLong(value: kotlin.LongArray?): kotlin.collections.List<kotlin.Long> = value!!.toList()
fun lowerVecLong(value: kotlin.collections.List<kotlin.Long>): kotlin.LongArray? = value.toLongArray()

fun liftVecULong(value: kotlin.LongArray?): kotlin.collections.List<kotlin.ULong> = value!!.asULongArray().toList()
fun lowerVecULong(value: kotlin.collections.List<kotlin.ULong>): kotlin.LongArray = value.toULongArray().asLongArray()

fun liftVecFloat(value: kotlin.FloatArray?): kotlin.collections.List<kotlin.Float> = value!!.toList()
fun lowerVecFloat(value: kotlin.collections.List<kotlin.Float>): kotlin.FloatArray? = value.toFloatArray()

fun liftVecDouble(value: kotlin.DoubleArray?): kotlin.collections.List<kotlin.Double> = value!!.toList()
fun lowerVecDouble(value: kotlin.collections.List<kotlin.Double>): kotlin.DoubleArray? = value.toDoubleArray()

fun liftOptionUByte(v: kotlin.Long): kotlin.UByte? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v.toUByte() }
}
fun lowerOptionUByte(v: kotlin.UByte?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { v.toLong() }
}

fun liftOptionByte(v: kotlin.Long): kotlin.Byte? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v.toByte() }
}
fun lowerOptionByte(v: kotlin.Byte?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { v.toLong() }
}

fun liftOptionUShort(v: kotlin.Long): kotlin.UShort? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v.toUShort() }
}
fun lowerOptionUShort(v: kotlin.UShort?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { v.toLong() }
}

fun liftOptionShort(v: kotlin.Long): kotlin.Short? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v.toShort() }
}
fun lowerOptionShort(v: kotlin.Short?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { v.toLong() }
}

fun liftOptionUInt(v: kotlin.Long): kotlin.UInt? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v.toUInt() }
}
fun lowerOptionUInt(v: kotlin.UInt?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { v.toLong() }
}

fun liftOptionInt(v: kotlin.Long): kotlin.Int? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v.toInt() }
}
fun lowerOptionInt(v: kotlin.Int?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { v.toLong() }
}

fun liftOptionBoolean(v: kotlin.Long): kotlin.Boolean? {
    return if (v == kotlin.Long.MAX_VALUE) { null } else { v == 1L }
}
fun lowerOptionBoolean(v: kotlin.Boolean?): kotlin.Long {
    return if (v == null) { kotlin.Long.MAX_VALUE } else { if (v) { 1 } else { 0 } }
}

fun liftOptionString(v: kotlin.String?): kotlin.String? = v
fun lowerOptionString(v: kotlin.String?): kotlin.String? = v


fun liftOptionFloat(v: kotlin.Int): kotlin.Float? {
    return if (v == 0xFFFF_FFFF.toInt()) {
        null
    } else {
        kotlin.Float.fromBits(v)
    }
}

fun lowerOptionFloat(v: kotlin.Float?): kotlin.Int {
    return if (v == null) {
        0xFFFF_FFFF.toInt()
    } else {
        val bits = v.toRawBits()
        if (bits == 0xFFFF_FFFF.toInt()) {
            // The float was encoded using our special-cased NaN value.
            // Convert it to the "preferred" NaN value
            0xFFC0_0000.toInt()
        } else {
            bits
        }
    }
}

fun liftOptionDouble(v: kotlin.Long): kotlin.Double? {
    return if (v.toULong() == 0xFFFF_FFFF_FFFF_FFFFuL) {
        null
    } else {
        kotlin.Double.fromBits(v)
    }
}

fun lowerOptionDouble(v: kotlin.Double?): kotlin.Long {
    return if (v == null) {
        0xFFFF_FFFF_FFFF_FFFFuL.toLong()
    } else {
        val bits = v.toRawBits()
        if (bits.toULong() == 0xFFFF_FFFF_FFFF_FFFFuL) {
            // The float was encoded using our special-cased NaN value.
            // Convert it to the "preferred" NaN value
            0xFFF8_0000
        } else {
            bits
        }
    }
}
// Interface implemented by anything that can contain an object reference.
//
// Such types expose a `destroy()` method that must be called to cleanly
// dispose of the contained objects. Failure to call this method may result
// in memory leaks.
//
// The easiest way to ensure this method is called is to use the `.use`
// helper method to execute a block and destroy the object at the end.
interface Disposable {
    fun destroy()
    companion object {
        fun destroy(vararg args: Any?) {
            for (arg in args) {
                when (arg) {
                    is Disposable -> arg.destroy()
                    is ArrayList<*> -> {
                        for (idx in arg.indices) {
                            val element = arg[idx]
                            if (element is Disposable) {
                                element.destroy()
                            }
                        }
                    }
                    is Map<*, *> -> {
                        for (element in arg.values) {
                            if (element is Disposable) {
                                element.destroy()
                            }
                        }
                    }
                    is Iterable<*> -> {
                        for (element in arg) {
                            if (element is Disposable) {
                                element.destroy()
                            }
                        }
                    }
                }
            }
        }
    }
}

inline fun <T : Disposable?, R> T.use(block: (T) -> R) =
    try {
        block(this)
    } finally {
        try {
            // N.B. our implementation is on the nullable type `Disposable?`.
            this?.destroy()
        } catch (e: Throwable) {
            // swallow
        }
    }

/** 
 * Placeholder object used to signal that we're constructing an interface with a FFI handle.
 *
 * This is the first argument for interface constructors that input a raw handle. It exists is that
 * so we can avoid signature conflicts when an interface has a regular constructor than inputs a
 * Long.
 *
 * */
object WithHandle

/** 
 * Used to instantiate an interface without an actual pointer, for fakes in tests, mostly.
 *
 * */
object NoHandle


val CLEANER = java.lang.ref.Cleaner.create()
typealias Cleanable = java.lang.ref.Cleaner.Cleanable

// Initial value and increment amount for handles. 
// These ensure that Kotlin-generated handles always have the lowest bit set
private const val UNIFFI_HANDLEMAP_INITIAL = 1.toLong()
private const val UNIFFI_HANDLEMAP_DELTA = 2.toLong()

// Map handles to objects
//
// This is used pass an opaque 64-bit handle representing a foreign object to the Rust code.
//
// Callback handles are always odd, which allows us to differentiate them from Rust-generated
// handles.
class HandleMap<T: Any> {
    private val map = java.util.concurrent.ConcurrentHashMap<kotlin.Long, T>()
    private val counter = java.util.concurrent.atomic.AtomicLong(UNIFFI_HANDLEMAP_INITIAL)

    val size: Int
        get() = map.size

    // Insert a new object into the handle map and get a handle for it
    fun insert(obj: T): kotlin.Long {
        val handle = counter.getAndAdd(UNIFFI_HANDLEMAP_DELTA)
        map.put(handle, obj)
        return handle
    }

    // Clone a handle, creating a new one
    fun clone(handle: kotlin.Long): kotlin.Long {
        val obj = map.get(handle) ?: throw InternalException("HandleMap.clone: Invalid handle")
        return insert(obj)
    }

    // Get an object from the handle map
    fun get(handle: kotlin.Long): T {
        return map.get(handle) ?: throw InternalException("HandleMap.get: Invalid handle")
    }

    // Remove an entry from the handlemap and get the Kotlin object back
    fun remove(handle: kotlin.Long): T {
        return map.remove(handle) ?: throw InternalException("HandleMap: Invalid handle")
    }
}

const val UNIFFI_RUST_FUTURE_PENDING = 0
const val UNIFFI_RUST_FUTURE_CANCELLED = 1
const val UNIFFI_RUST_FUTURE_COMPLETE = 2

class InternalException(message: kotlin.String) : Exception(message)

fun uniffiContinuationResume(continuation: kotlin.coroutines.Continuation<kotlin.Boolean>) {
    continuation.resumeWith(Result.success(false))
}

/**
  * Scaffolding function definitions shared by all packages
  */
object Scaffolding {
    init {
        System.loadLibrary("megazord")
        Scaffolding.ffiBufferCheckSupport()
    }

    @JvmStatic external fun ffiBufferCheckSupport()
    @JvmStatic external fun ffiBufferAlloc(capacity: kotlin.Int): java.nio.ByteBuffer
    @JvmStatic external fun ffiBufferFree(buf: java.nio.ByteBuffer)
    @JvmStatic external fun ffiBufferReadString(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.String
    @JvmStatic external fun ffiBufferWriteString(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.String)
    @JvmStatic external fun ffiBufferReadBytes(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ByteArray
    @JvmStatic external fun ffiBufferWriteBytes(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ByteArray)
    @JvmStatic external fun ffiBufferReadBuffer(buf: java.nio.ByteBuffer, offset: kotlin.Int): java.nio.ByteBuffer
    @JvmStatic external fun ffiBufferWriteBuffer(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: java.nio.ByteBuffer)
    @JvmStatic external fun uniffiKotlinFutureComplete(kotlinFuture: kotlin.Long, resultCode: kotlin.Int)
}


// Deconstructed version of kotlin.ULong?
class DeconstructedType11(
    val v0: Boolean,
    val v1: Long,
)

@JvmName("lowerType11")
fun lowerType11(value: kotlin.ULong?): DeconstructedType11 {
    if (value == null) {
        return DeconstructedType11(
            false,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerULong(value)
        return DeconstructedType11(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType11")
fun liftType11(
    v0: Boolean,
    v1: Long,
): kotlin.ULong? {
    if (v0) {
        return liftULong(
            v1,
        )
    } else {
        return null
    }
}

fun writeType11(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ULong?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeULong(buf, offset + 8, value)
    }
}
fun readType11(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ULong? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readULong(buf, offset + 8)
    }
}


fun lowerToBuffer16(value: kotlin.collections.List<kotlin.String>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 24).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it)
        offset += 24
    }
    return buf
}

fun liftFromBuffer16(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.String> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 24
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readString(buf, offset))
                offset += 24
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType16")
fun lowerType16(value: kotlin.collections.List<kotlin.String>): java.nio.ByteBuffer {
    return lowerToBuffer16(value)
}

@JvmName("liftType16")
fun liftType16(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.String> {
    return liftFromBuffer16(buf)
}

fun writeType16(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.String>) {
    val childBuf = lowerToBuffer16(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType16(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.String> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer16(childBuf)
}


fun writeType18(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.String?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeString(buf, offset + 8, value)
    }
}
fun readType18(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.String? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readString(buf, offset + 8)
    }
}


@JvmName("lowerType24")
fun lowerType24(value: kotlin.collections.Map<kotlin.String, kotlin.Boolean>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeBoolean(buf, offset + 24, it.value)
        offset += 32
    }
    return buf
}

@JvmName("liftType24")
fun liftType24(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.Boolean> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readBoolean(buf, offset + 24),
                )
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType24(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.Boolean>) {
    val childBuf = lowerType24(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType24(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.Boolean> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType24(childBuf)
}


@JvmName("lowerType25")
fun lowerType25(value: kotlin.collections.Map<kotlin.String, kotlin.Double>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeDouble(buf, offset + 24, it.value)
        offset += 32
    }
    return buf
}

@JvmName("liftType25")
fun liftType25(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.Double> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readDouble(buf, offset + 24),
                )
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType25(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.Double>) {
    val childBuf = lowerType25(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType25(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.Double> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType25(childBuf)
}


@JvmName("lowerType28")
fun lowerType28(value: kotlin.collections.Map<kotlin.String, kotlin.UInt>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeUInt(buf, offset + 24, it.value)
        offset += 32
    }
    return buf
}

@JvmName("liftType28")
fun liftType28(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.UInt> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readUInt(buf, offset + 24),
                )
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType28(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.UInt>) {
    val childBuf = lowerType28(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType28(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.UInt> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType28(childBuf)
}


// Deconstructed version of kotlin.Long?
class DeconstructedType56(
    val v0: Boolean,
    val v1: Long,
)

@JvmName("lowerType56")
fun lowerType56(value: kotlin.Long?): DeconstructedType56 {
    if (value == null) {
        return DeconstructedType56(
            false,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerLong(value)
        return DeconstructedType56(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType56")
fun liftType56(
    v0: Boolean,
    v1: Long,
): kotlin.Long? {
    if (v0) {
        return liftLong(
            v1,
        )
    } else {
        return null
    }
}

fun writeType56(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Long?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeLong(buf, offset + 8, value)
    }
}
fun readType56(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Long? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readLong(buf, offset + 8)
    }
}


// Deconstructed version of kotlin.collections.List<kotlin.String>?
class DeconstructedType99(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType99")
fun lowerType99(value: kotlin.collections.List<kotlin.String>?): DeconstructedType99 {
    if (value == null) {
        return DeconstructedType99(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType16(value)
        return DeconstructedType99(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType99")
fun liftType99(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<kotlin.String>? {
    if (v0) {
        return liftType16(
            v1,
        )
    } else {
        return null
    }
}

fun writeType99(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.String>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType16(buf, offset + 8, value)
    }
}
fun readType99(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.String>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType16(buf, offset + 8)
    }
}


fun writeType145(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UInt?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeUInt(buf, offset + 4, value)
    }
}
fun readType145(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UInt? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readUInt(buf, offset + 4)
    }
}


fun lowerToBuffer148(value: kotlin.collections.List<kotlin.UInt>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 4).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeUInt(buf, offset, it)
        offset += 4
    }
    return buf
}

fun liftFromBuffer148(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.UInt> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 4
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readUInt(buf, offset))
                offset += 4
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType148(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.UInt>) {
    val childBuf = lowerToBuffer148(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType148(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.UInt> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer148(childBuf)
}


@JvmName("lowerType131")
fun lowerType131(value: kotlin.collections.Map<kotlin.String, kotlin.String>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 48).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeString(buf, offset + 24, it.value)
        offset += 48
    }
    return buf
}

@JvmName("liftType131")
fun liftType131(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.String> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 48
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readString(buf, offset + 24),
                )
                offset += 48
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType131(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.String>) {
    val childBuf = lowerType131(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType131(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.String> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType131(childBuf)
}


// Deconstructed version of kotlin.ByteArray?
class DeconstructedType137(
    val v0: Boolean,
    val v1: kotlin.ByteArray?,
)

@JvmName("lowerType137")
fun lowerType137(value: kotlin.ByteArray?): DeconstructedType137 {
    if (value == null) {
        return DeconstructedType137(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerBytes(value)
        return DeconstructedType137(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType137")
fun liftType137(
    v0: Boolean,
    v1: kotlin.ByteArray?,
): kotlin.ByteArray? {
    if (v0) {
        return liftBytes(
            v1,
        )
    } else {
        return null
    }
}

fun writeType137(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ByteArray?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeBytes(buf, offset + 8, value)
    }
}
fun readType137(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ByteArray? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readBytes(buf, offset + 8)
    }
}


fun lowerToBuffer162(value: kotlin.collections.List<kotlin.Boolean>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 1).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeBoolean(buf, offset, it)
        offset += 1
    }
    return buf
}

fun liftFromBuffer162(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.Boolean> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 1
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readBoolean(buf, offset))
                offset += 1
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType162")
fun lowerType162(value: kotlin.collections.List<kotlin.Boolean>): java.nio.ByteBuffer {
    return lowerToBuffer162(value)
}

@JvmName("liftType162")
fun liftType162(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.Boolean> {
    return liftFromBuffer162(buf)
}

fun writeType162(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.Boolean>) {
    val childBuf = lowerToBuffer162(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType162(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.Boolean> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer162(childBuf)
}


fun writeType172(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Int?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeInt(buf, offset + 4, value)
    }
}
fun readType172(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Int? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readInt(buf, offset + 4)
    }
}


fun writeType190(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UShort?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeUShort(buf, offset + 2, value)
    }
}
fun readType190(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UShort? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readUShort(buf, offset + 2)
    }
}


// Deconstructed version of kotlin.collections.Map<kotlin.String, kotlin.String>?
class DeconstructedType328(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType328")
fun lowerType328(value: kotlin.collections.Map<kotlin.String, kotlin.String>?): DeconstructedType328 {
    if (value == null) {
        return DeconstructedType328(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType131(value)
        return DeconstructedType328(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType328")
fun liftType328(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.Map<kotlin.String, kotlin.String>? {
    if (v0) {
        return liftType131(
            v1,
        )
    } else {
        return null
    }
}

fun writeType328(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.String>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType131(buf, offset + 8, value)
    }
}
fun readType328(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.String>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType131(buf, offset + 8)
    }
}


fun writeType207(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Boolean?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeBoolean(buf, offset + 1, value)
    }
}
fun readType207(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Boolean? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readBoolean(buf, offset + 1)
    }
}


fun lowerToBuffer307(value: kotlin.collections.List<kotlin.Byte>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 1).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeByte(buf, offset, it)
        offset += 1
    }
    return buf
}

fun liftFromBuffer307(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.Byte> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 1
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readByte(buf, offset))
                offset += 1
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType307(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.Byte>) {
    val childBuf = lowerToBuffer307(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType307(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.Byte> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer307(childBuf)
}


@JvmName("lowerType377")
fun lowerType377(value: kotlin.collections.Map<kotlin.UByte, kotlin.String>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeUByte(buf, offset, it.key)
        writeString(buf, offset + 8, it.value)
        offset += 32
    }
    return buf
}

@JvmName("liftType377")
fun liftType377(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.UByte, kotlin.String> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readUByte(buf, offset),
                    readString(buf, offset + 8),
                )
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType377(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.UByte, kotlin.String>) {
    val childBuf = lowerType377(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType377(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.UByte, kotlin.String> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType377(childBuf)
}


fun lowerToBuffer394(value: kotlin.collections.List<kotlin.Int>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 4).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeInt(buf, offset, it)
        offset += 4
    }
    return buf
}

fun liftFromBuffer394(buf: java.nio.ByteBuffer?): kotlin.collections.List<kotlin.Int> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 4
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readInt(buf, offset))
                offset += 4
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType394(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.Int>) {
    val childBuf = lowerToBuffer394(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType394(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.Int> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer394(childBuf)
}
// Deconstructed version of Timestamp
class DeconstructedType425(
    val v0: kotlin.Long,
    val v1: kotlin.Int,
)

fun lowerType425(value: java.time.Instant): DeconstructedType425 {
    var epochOffset = java.time.Duration.between(java.time.Instant.EPOCH, value)

    var sign = 1
    if (epochOffset.isNegative()) {
        sign = -1
        epochOffset = epochOffset.negated()
    }

    if (epochOffset.nano < 0) {
        // Java docs provide guarantee that nano will always be positive, so this should be impossible
        // See: https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
        throw IllegalArgumentException("Invalid timestamp, nano value must be non-negative")
    }

    // Note: nanoseconds is a u32 in Rust, but we just return a kotlin `Int` directly without bounds
    // checking.  We just checked that it was non-negative and it should never overflow the i32 max.
    return DeconstructedType425(sign * epochOffset.seconds, epochOffset.nano)
}

fun liftType425(seconds: kotlin.Long, nanoseconds: kotlin.Int): java.time.Instant {
    if (seconds >= 0) {
        return java.time.Instant.EPOCH.plus(java.time.Duration.ofSeconds(seconds, nanoseconds.toLong()))
    } else {
        return java.time.Instant.EPOCH.minus(java.time.Duration.ofSeconds(-seconds, nanoseconds.toLong()))
    }
}

fun writeType425(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: java.time.Instant) {
    val lowered = lowerType425(value)
    writeLong(buf, offset, lowered.v0)
    writeInt(buf, offset + 8, lowered.v1)
}

fun readType425(buf: java.nio.ByteBuffer, offset: kotlin.Int): java.time.Instant {
    return liftType425(
        readLong(buf, offset),
        readInt(buf, offset + 8),
    )
}


// Deconstructed version of java.time.Instant?
class DeconstructedType424(
    val v0: Boolean,
    val v1: Long,
    val v2: Int,
)

@JvmName("lowerType424")
fun lowerType424(value: java.time.Instant?): DeconstructedType424 {
    if (value == null) {
        return DeconstructedType424(
            false,
            0L,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType425(value)
        return DeconstructedType424(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
        )
    }
}

@JvmName("liftType424")
fun liftType424(
    v0: Boolean,
    v1: Long,
    v2: Int,
): java.time.Instant? {
    if (v0) {
        return liftType425(
            v1,
            v2,
        )
    } else {
        return null
    }
}

fun writeType424(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: java.time.Instant?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType425(buf, offset + 8, value)
    }
}
fun readType424(buf: java.nio.ByteBuffer, offset: kotlin.Int): java.time.Instant? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType425(buf, offset + 8)
    }
}