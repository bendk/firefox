@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.places.uniffi.uniffi



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




@JvmName("lowerType255")
fun lowerType255(value: mozilla.appservices.places.uniffi.`Guid`): String? {
    return lowerString(value)
}

@JvmName("liftType255")
fun liftType255(
    v0: String?,
): mozilla.appservices.places.uniffi.`Guid` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType255(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`Guid`) {
    writeString(buf, offset, value)
}

fun readType255(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`Guid` {
    val builtinValue = readString(buf, offset)
    return builtinValue
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




@JvmName("lowerType256")
fun lowerType256(value: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Long {
    return lowerLong(value)
}

@JvmName("liftType256")
fun liftType256(
    v0: Long,
): mozilla.appservices.places.uniffi.`PlacesTimestamp` {
    val builtinValue = liftLong(
        v0,
    )
    return builtinValue
}

fun writeType256(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`PlacesTimestamp`) {
    writeLong(buf, offset, value)
}

fun readType256(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`PlacesTimestamp` {
    val builtinValue = readLong(buf, offset)
    return builtinValue
}


@JvmName("lowerType257")
fun lowerType257(value: mozilla.appservices.places.uniffi.`Url`): String? {
    return lowerString(value)
}

@JvmName("liftType257")
fun liftType257(
    v0: String?,
): mozilla.appservices.places.uniffi.`Url` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType257(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`Url`) {
    writeString(buf, offset, value)
}

fun readType257(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`Url` {
    val builtinValue = readString(buf, offset)
    return builtinValue
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



// Deconstructed version of BookmarkData
class DeconstructedType279(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: Long,
    val v4: Long,
    val v5: String?,
    val v6: String?,
)

@JvmName("lowerType279")
fun lowerType279(rec: mozilla.appservices.places.uniffi.`BookmarkData`): DeconstructedType279 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType255(rec.`guid`)
    val uniffiFieldLowered1 = lowerType255(rec.`parentGuid`)
    val uniffiFieldLowered2 = lowerUInt(rec.`position`)
    val uniffiFieldLowered3 = lowerType256(rec.`dateAdded`)
    val uniffiFieldLowered4 = lowerType256(rec.`lastModified`)
    val uniffiFieldLowered5 = lowerType257(rec.`url`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`title`)
    return DeconstructedType279(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType279")
fun liftType279(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: Long,
    v4: Long,
    v5: String?,
    v6: String?,
): mozilla.appservices.places.uniffi.`BookmarkData` {
    return mozilla.appservices.places.uniffi.`BookmarkData`(
        liftType255(
            v0,
        ),
        liftType255(
            v1,
        ),
        liftUInt(
            v2,
        ),
        liftType256(
            v3,
        ),
        liftType256(
            v4,
        ),
        liftType257(
            v5,
        ),
        liftOptionString(
            v6,
        ),
    )
}

fun writeType279(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkData`) {
    writeType255(buf, offset + 0, value.`guid`)
    writeType255(buf, offset + 24, value.`parentGuid`)
    writeUInt(buf, offset + 48, value.`position`)
    writeType256(buf, offset + 56, value.`dateAdded`)
    writeType256(buf, offset + 64, value.`lastModified`)
    writeType257(buf, offset + 72, value.`url`)
    writeType18(buf, offset + 96, value.`title`)
}

fun readType279(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkData` {
    return mozilla.appservices.places.uniffi.`BookmarkData`(
        readType255(buf, offset + 0),
        readType255(buf, offset + 24),
        readUInt(buf, offset + 48),
        readType256(buf, offset + 56),
        readType256(buf, offset + 64),
        readType257(buf, offset + 72),
        readType18(buf, offset + 96),
    )
}


// Deconstructed version of mozilla.appservices.places.uniffi.`Guid`?
class DeconstructedType258(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType258")
fun lowerType258(value: mozilla.appservices.places.uniffi.`Guid`?): DeconstructedType258 {
    if (value == null) {
        return DeconstructedType258(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType255(value)
        return DeconstructedType258(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType258")
fun liftType258(
    v0: Boolean,
    v1: String?,
): mozilla.appservices.places.uniffi.`Guid`? {
    if (v0) {
        return liftType255(
            v1,
        )
    } else {
        return null
    }
}

fun writeType258(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`Guid`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType255(buf, offset + 8, value)
    }
}
fun readType258(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`Guid`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType255(buf, offset + 8)
    }
}


fun lowerToBuffer260(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 24).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType255(buf, offset, it)
        offset += 24
    }
    return buf
}

fun liftFromBuffer260(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 24
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType255(buf, offset))
                offset += 24
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType260")
fun lowerType260(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>): java.nio.ByteBuffer {
    return lowerToBuffer260(value)
}

@JvmName("liftType260")
fun liftType260(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`> {
    return liftFromBuffer260(buf)
}

fun writeType260(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>) {
    val childBuf = lowerToBuffer260(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType260(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer260(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>?
class DeconstructedType259(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType259")
fun lowerType259(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>?): DeconstructedType259 {
    if (value == null) {
        return DeconstructedType259(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType260(value)
        return DeconstructedType259(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType259")
fun liftType259(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>? {
    if (v0) {
        return liftType260(
            v1,
        )
    } else {
        return null
    }
}

fun writeType259(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType260(buf, offset + 8, value)
    }
}
fun readType259(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType260(buf, offset + 8)
    }
}

// Deconstructed version of BookmarkSeparator
class DeconstructedType280(
    val v0: String?,
    val v1: Long,
    val v2: Long,
    val v3: String?,
    val v4: Int,
)

@JvmName("lowerType280")
fun lowerType280(rec: mozilla.appservices.places.uniffi.`BookmarkSeparator`): DeconstructedType280 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType255(rec.`guid`)
    val uniffiFieldLowered1 = lowerType256(rec.`dateAdded`)
    val uniffiFieldLowered2 = lowerType256(rec.`lastModified`)
    val uniffiFieldLowered3 = lowerType255(rec.`parentGuid`)
    val uniffiFieldLowered4 = lowerUInt(rec.`position`)
    return DeconstructedType280(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType280")
fun liftType280(
    v0: String?,
    v1: Long,
    v2: Long,
    v3: String?,
    v4: Int,
): mozilla.appservices.places.uniffi.`BookmarkSeparator` {
    return mozilla.appservices.places.uniffi.`BookmarkSeparator`(
        liftType255(
            v0,
        ),
        liftType256(
            v1,
        ),
        liftType256(
            v2,
        ),
        liftType255(
            v3,
        ),
        liftUInt(
            v4,
        ),
    )
}

fun writeType280(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkSeparator`) {
    writeType255(buf, offset + 0, value.`guid`)
    writeType256(buf, offset + 24, value.`dateAdded`)
    writeType256(buf, offset + 32, value.`lastModified`)
    writeType255(buf, offset + 40, value.`parentGuid`)
    writeUInt(buf, offset + 64, value.`position`)
}

fun readType280(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkSeparator` {
    return mozilla.appservices.places.uniffi.`BookmarkSeparator`(
        readType255(buf, offset + 0),
        readType256(buf, offset + 24),
        readType256(buf, offset + 32),
        readType255(buf, offset + 40),
        readUInt(buf, offset + 64),
    )
}


fun lowerToBuffer262(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 168).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType263(buf, offset, it)
        offset += 168
    }
    return buf
}

fun liftFromBuffer262(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 168
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType263(buf, offset))
                offset += 168
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType262")
fun lowerType262(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>): java.nio.ByteBuffer {
    return lowerToBuffer262(value)
}

@JvmName("liftType262")
fun liftType262(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`> {
    return liftFromBuffer262(buf)
}

fun writeType262(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>) {
    val childBuf = lowerToBuffer262(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType262(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer262(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>?
class DeconstructedType261(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType261")
fun lowerType261(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>?): DeconstructedType261 {
    if (value == null) {
        return DeconstructedType261(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType262(value)
        return DeconstructedType261(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType261")
fun liftType261(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>? {
    if (v0) {
        return liftType262(
            v1,
        )
    } else {
        return null
    }
}

fun writeType261(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType262(buf, offset + 8, value)
    }
}
fun readType261(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType262(buf, offset + 8)
    }
}

// Deconstructed version of BookmarkFolder
class DeconstructedType281(
    val v0: String?,
    val v1: Long,
    val v2: Long,
    val v3: Boolean,
    val v4: String?,
    val v5: Int,
    val v6: String?,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
    val v9: Boolean,
    val v10: java.nio.ByteBuffer?,
)

@JvmName("lowerType281")
fun lowerType281(rec: mozilla.appservices.places.uniffi.`BookmarkFolder`): DeconstructedType281 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType255(rec.`guid`)
    val uniffiFieldLowered1 = lowerType256(rec.`dateAdded`)
    val uniffiFieldLowered2 = lowerType256(rec.`lastModified`)
    val uniffiFieldLowered3 = lowerType258(rec.`parentGuid`)
    val uniffiFieldLowered4 = lowerUInt(rec.`position`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered6 = lowerType259(rec.`childGuids`)
    val uniffiFieldLowered7 = lowerType261(rec.`childNodes`)
    return DeconstructedType281(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6.v0,
        uniffiFieldLowered6.v1,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
    )
}

@JvmName("liftType281")
fun liftType281(
    v0: String?,
    v1: Long,
    v2: Long,
    v3: Boolean,
    v4: String?,
    v5: Int,
    v6: String?,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
    v9: Boolean,
    v10: java.nio.ByteBuffer?,
): mozilla.appservices.places.uniffi.`BookmarkFolder` {
    return mozilla.appservices.places.uniffi.`BookmarkFolder`(
        liftType255(
            v0,
        ),
        liftType256(
            v1,
        ),
        liftType256(
            v2,
        ),
        liftType258(
            v3,
            v4,
        ),
        liftUInt(
            v5,
        ),
        liftOptionString(
            v6,
        ),
        liftType259(
            v7,
            v8,
        ),
        liftType261(
            v9,
            v10,
        ),
    )
}

fun writeType281(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkFolder`) {
    writeType255(buf, offset + 0, value.`guid`)
    writeType256(buf, offset + 24, value.`dateAdded`)
    writeType256(buf, offset + 32, value.`lastModified`)
    writeType258(buf, offset + 40, value.`parentGuid`)
    writeUInt(buf, offset + 72, value.`position`)
    writeType18(buf, offset + 80, value.`title`)
    writeType259(buf, offset + 112, value.`childGuids`)
    writeType261(buf, offset + 136, value.`childNodes`)
}

fun readType281(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkFolder` {
    return mozilla.appservices.places.uniffi.`BookmarkFolder`(
        readType255(buf, offset + 0),
        readType256(buf, offset + 24),
        readType256(buf, offset + 32),
        readType258(buf, offset + 40),
        readUInt(buf, offset + 72),
        readType18(buf, offset + 80),
        readType259(buf, offset + 112),
        readType261(buf, offset + 136),
    )
}

// Deconstructed version of BookmarkItem
class DeconstructedType263(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: Int,
    val v4: Long,
    val v5: Long,
    val v6: String?,
    val v7: String?,
    val v8: Long,
    val v9: String?,
    val v10: Long,
    val v11: Boolean,
    val v12: String?,
    val v13: String?,
    val v14: Boolean,
    val v15: java.nio.ByteBuffer?,
    val v16: Boolean,
    val v17: java.nio.ByteBuffer?,
)

@JvmName("lowerType263")
fun lowerType263(value: mozilla.appservices.places.uniffi.`BookmarkItem`): DeconstructedType263 {
    when (value) {
        is mozilla.appservices.places.uniffi.`BookmarkItem`.`Bookmark` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType279(value.`b`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered12 = uniffiFieldDeconstructed0.v6
            return DeconstructedType263(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                uniffiFieldLowered5,
                null,
                null,
                0L,
                null,
                0L,
                false,
                uniffiFieldLowered12,
                uniffiFieldLowered13,
                false,
                null,
                false,
                null,
            )
        }
        is mozilla.appservices.places.uniffi.`BookmarkItem`.`Separator` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldDeconstructed0 = lowerType280(value.`s`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v4
            return DeconstructedType263(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                uniffiFieldLowered5,
                null,
                null,
                0L,
                null,
                0L,
                false,
                null,
                null,
                false,
                null,
                false,
                null,
            )
        }
        is mozilla.appservices.places.uniffi.`BookmarkItem`.`Folder` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldDeconstructed0 = lowerType281(value.`f`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered11 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered17 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered14 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered15 = uniffiFieldDeconstructed0.v10
            return DeconstructedType263(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                uniffiFieldLowered5,
                null,
                null,
                0L,
                null,
                0L,
                uniffiFieldLowered11,
                null,
                uniffiFieldLowered13,
                uniffiFieldLowered14,
                uniffiFieldLowered15,
                uniffiFieldLowered16,
                uniffiFieldLowered17,
            )
        }
    }
}

@JvmName("liftType263")
fun liftType263(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: Int,
    v4: Long,
    v5: Long,
    v6: String?,
    v7: String?,
    v8: Long,
    v9: String?,
    v10: Long,
    v11: Boolean,
    v12: String?,
    v13: String?,
    v14: Boolean,
    v15: java.nio.ByteBuffer?,
    v16: Boolean,
    v17: java.nio.ByteBuffer?,
): mozilla.appservices.places.uniffi.`BookmarkItem` {
    when (v0) {
        0 -> {
            return mozilla.appservices.places.uniffi.`BookmarkItem`.`Bookmark`(
                liftType279(
                    v1,
                    v2,
                    v3,
                    v4,
                    v5,
                    v13,
                    v12,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.places.uniffi.`BookmarkItem`.`Separator`(
                liftType280(
                    v1,
                    v4,
                    v5,
                    v2,
                    v3,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.places.uniffi.`BookmarkItem`.`Folder`(
                liftType281(
                    v1,
                    v4,
                    v5,
                    v16,
                    v2,
                    v3,
                    v13,
                    v11,
                    v17,
                    v14,
                    v15,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType263: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType263(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkItem`) {
    when (value) {
        is mozilla.appservices.places.uniffi.`BookmarkItem`.`Bookmark` -> {
            writeInt(buf, offset, 0);
            writeType279(buf, offset + 8, value.`b`)
        }
        is mozilla.appservices.places.uniffi.`BookmarkItem`.`Separator` -> {
            writeInt(buf, offset, 1);
            writeType280(buf, offset + 8, value.`s`)
        }
        is mozilla.appservices.places.uniffi.`BookmarkItem`.`Folder` -> {
            writeInt(buf, offset, 2);
            writeType281(buf, offset + 8, value.`f`)
        }
    }
}

fun readType263(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkItem` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.places.uniffi.`BookmarkItem`.`Bookmark`(
                readType279(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.places.uniffi.`BookmarkItem`.`Separator`(
                readType280(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.places.uniffi.`BookmarkItem`.`Folder`(
                readType281(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType263: Invalid enum discriminant: ${discriminant}")
        }
    }
}



@JvmName("lowerOptionUInt")
inline fun lowerOptionUInt(value: kotlin.UInt?): Long {
    return uniffi.lowerOptionUInt(value)
}

@JvmName("liftOptionUInt")
inline fun liftOptionUInt(
    v1: Long
): kotlin.UInt? {
    return uniffi.liftOptionUInt(
        v1
    )
}

inline fun writeType145(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UInt?) {
    uniffi.writeType145(buf, offset, value)
}

inline fun readType145(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UInt? {
    return uniffi.readType145(buf, offset)
}



// Deconstructed version of BookmarkUpdateInfo
class DeconstructedType289(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Boolean,
    val v4: String?,
    val v5: Long,
)

@JvmName("lowerType289")
fun lowerType289(rec: mozilla.appservices.places.uniffi.`BookmarkUpdateInfo`): DeconstructedType289 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType255(rec.`guid`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`url`)
    val uniffiFieldLowered3 = lowerType258(rec.`parentGuid`)
    val uniffiFieldLowered4 = lowerOptionUInt(rec.`position`)
    return DeconstructedType289(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType289")
fun liftType289(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Boolean,
    v4: String?,
    v5: Long,
): mozilla.appservices.places.uniffi.`BookmarkUpdateInfo` {
    return mozilla.appservices.places.uniffi.`BookmarkUpdateInfo`(
        liftType255(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftType258(
            v3,
            v4,
        ),
        liftOptionUInt(
            v5,
        ),
    )
}

fun writeType289(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkUpdateInfo`) {
    writeType255(buf, offset + 0, value.`guid`)
    writeType18(buf, offset + 24, value.`title`)
    writeType18(buf, offset + 56, value.`url`)
    writeType258(buf, offset + 88, value.`parentGuid`)
    writeType145(buf, offset + 120, value.`position`)
}

fun readType289(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkUpdateInfo` {
    return mozilla.appservices.places.uniffi.`BookmarkUpdateInfo`(
        readType255(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
        readType258(buf, offset + 88),
        readType145(buf, offset + 120),
    )
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



@JvmName("lowerType267")
fun lowerType267(value: mozilla.appservices.places.uniffi.`DocumentType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType267")
fun liftType267(value: kotlin.Int): mozilla.appservices.places.uniffi.`DocumentType` {
    return mozilla.appservices.places.uniffi.`DocumentType`.values()[value]
}

fun writeType267(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`DocumentType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType267(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`DocumentType` {
    return liftType267(readInt(buf, offset))
}

// Deconstructed version of HistoryMetadata
class DeconstructedType266(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Long,
    val v4: Long,
    val v5: Int,
    val v6: String?,
    val v7: Int,
    val v8: String?,
)

@JvmName("lowerType266")
fun lowerType266(rec: mozilla.appservices.places.uniffi.`HistoryMetadata`): DeconstructedType266 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`url`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`previewImageUrl`)
    val uniffiFieldLowered3 = lowerLong(rec.`createdAt`)
    val uniffiFieldLowered4 = lowerLong(rec.`updatedAt`)
    val uniffiFieldLowered5 = lowerInt(rec.`totalViewTime`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`searchTerm`)
    val uniffiFieldLowered7 = lowerType267(rec.`documentType`)
    val uniffiFieldLowered8 = lowerOptionString(rec.`referrerUrl`)
    return DeconstructedType266(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
    )
}

@JvmName("liftType266")
fun liftType266(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Long,
    v4: Long,
    v5: Int,
    v6: String?,
    v7: Int,
    v8: String?,
): mozilla.appservices.places.uniffi.`HistoryMetadata` {
    return mozilla.appservices.places.uniffi.`HistoryMetadata`(
        liftString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftLong(
            v4,
        ),
        liftInt(
            v5,
        ),
        liftOptionString(
            v6,
        ),
        liftType267(
            v7,
        ),
        liftOptionString(
            v8,
        ),
    )
}

fun writeType266(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryMetadata`) {
    writeString(buf, offset + 0, value.`url`)
    writeType18(buf, offset + 24, value.`title`)
    writeType18(buf, offset + 56, value.`previewImageUrl`)
    writeLong(buf, offset + 88, value.`createdAt`)
    writeLong(buf, offset + 96, value.`updatedAt`)
    writeInt(buf, offset + 104, value.`totalViewTime`)
    writeType18(buf, offset + 112, value.`searchTerm`)
    writeType267(buf, offset + 144, value.`documentType`)
    writeType18(buf, offset + 152, value.`referrerUrl`)
}

fun readType266(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryMetadata` {
    return mozilla.appservices.places.uniffi.`HistoryMetadata`(
        readString(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
        readLong(buf, offset + 88),
        readLong(buf, offset + 96),
        readInt(buf, offset + 104),
        readType18(buf, offset + 112),
        readType267(buf, offset + 144),
        readType18(buf, offset + 152),
    )
}


fun lowerToBuffer265(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 184).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType266(buf, offset, it)
        offset += 184
    }
    return buf
}

fun liftFromBuffer265(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 184
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType266(buf, offset))
                offset += 184
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType265")
fun lowerType265(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>): java.nio.ByteBuffer {
    return lowerToBuffer265(value)
}

@JvmName("liftType265")
fun liftType265(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
    return liftFromBuffer265(buf)
}

fun writeType265(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>) {
    val childBuf = lowerToBuffer265(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType265(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer265(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>?
class DeconstructedType264(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType264")
fun lowerType264(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>?): DeconstructedType264 {
    if (value == null) {
        return DeconstructedType264(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType265(value)
        return DeconstructedType264(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType264")
fun liftType264(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>? {
    if (v0) {
        return liftType265(
            v1,
        )
    } else {
        return null
    }
}

fun writeType264(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType265(buf, offset + 8, value)
    }
}
fun readType264(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType265(buf, offset + 8)
    }
}

// Deconstructed version of Dummy
class DeconstructedType4425(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType4425")
fun lowerType4425(rec: mozilla.appservices.places.uniffi.`Dummy`): DeconstructedType4425 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType264(rec.`md`)
    return DeconstructedType4425(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
    )
}

@JvmName("liftType4425")
fun liftType4425(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.places.uniffi.`Dummy` {
    return mozilla.appservices.places.uniffi.`Dummy`(
        liftType264(
            v0,
            v1,
        ),
    )
}

fun writeType4425(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`Dummy`) {
    writeType264(buf, offset + 0, value.`md`)
}

fun readType4425(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`Dummy` {
    return mozilla.appservices.places.uniffi.`Dummy`(
        readType264(buf, offset + 0),
    )
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



// Deconstructed version of HistoryHighlight
class DeconstructedType292(
    val v0: Double,
    val v1: Int,
    val v2: String?,
    val v3: String?,
    val v4: String?,
)

@JvmName("lowerType292")
fun lowerType292(rec: mozilla.appservices.places.uniffi.`HistoryHighlight`): DeconstructedType292 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerDouble(rec.`score`)
    val uniffiFieldLowered1 = lowerInt(rec.`placeId`)
    val uniffiFieldLowered2 = lowerString(rec.`url`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`previewImageUrl`)
    return DeconstructedType292(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType292")
fun liftType292(
    v0: Double,
    v1: Int,
    v2: String?,
    v3: String?,
    v4: String?,
): mozilla.appservices.places.uniffi.`HistoryHighlight` {
    return mozilla.appservices.places.uniffi.`HistoryHighlight`(
        liftDouble(
            v0,
        ),
        liftInt(
            v1,
        ),
        liftString(
            v2,
        ),
        liftOptionString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
    )
}

fun writeType292(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryHighlight`) {
    writeDouble(buf, offset + 0, value.`score`)
    writeInt(buf, offset + 8, value.`placeId`)
    writeString(buf, offset + 16, value.`url`)
    writeType18(buf, offset + 40, value.`title`)
    writeType18(buf, offset + 72, value.`previewImageUrl`)
}

fun readType292(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryHighlight` {
    return mozilla.appservices.places.uniffi.`HistoryHighlight`(
        readDouble(buf, offset + 0),
        readInt(buf, offset + 8),
        readString(buf, offset + 16),
        readType18(buf, offset + 40),
        readType18(buf, offset + 72),
    )
}

// Deconstructed version of HistoryHighlightWeights
class DeconstructedType290(
    val v0: Double,
    val v1: Double,
)

@JvmName("lowerType290")
fun lowerType290(rec: mozilla.appservices.places.uniffi.`HistoryHighlightWeights`): DeconstructedType290 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerDouble(rec.`viewTime`)
    val uniffiFieldLowered1 = lowerDouble(rec.`frequency`)
    return DeconstructedType290(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType290")
fun liftType290(
    v0: Double,
    v1: Double,
): mozilla.appservices.places.uniffi.`HistoryHighlightWeights` {
    return mozilla.appservices.places.uniffi.`HistoryHighlightWeights`(
        liftDouble(
            v0,
        ),
        liftDouble(
            v1,
        ),
    )
}

fun writeType290(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryHighlightWeights`) {
    writeDouble(buf, offset + 0, value.`viewTime`)
    writeDouble(buf, offset + 8, value.`frequency`)
}

fun readType290(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryHighlightWeights` {
    return mozilla.appservices.places.uniffi.`HistoryHighlightWeights`(
        readDouble(buf, offset + 0),
        readDouble(buf, offset + 8),
    )
}



@JvmName("lowerOptionInt")
inline fun lowerOptionInt(value: kotlin.Int?): Long {
    return uniffi.lowerOptionInt(value)
}

@JvmName("liftOptionInt")
inline fun liftOptionInt(
    v1: Long
): kotlin.Int? {
    return uniffi.liftOptionInt(
        v1
    )
}

inline fun writeType172(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Int?) {
    uniffi.writeType172(buf, offset, value)
}

inline fun readType172(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Int? {
    return uniffi.readType172(buf, offset)
}




// Deconstructed version of mozilla.appservices.places.uniffi.`DocumentType`?
class DeconstructedType268(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType268")
fun lowerType268(value: mozilla.appservices.places.uniffi.`DocumentType`?): DeconstructedType268 {
    if (value == null) {
        return DeconstructedType268(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType267(value)
        return DeconstructedType268(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType268")
fun liftType268(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.places.uniffi.`DocumentType`? {
    if (v0) {
        return liftType267(
            v1,
        )
    } else {
        return null
    }
}

fun writeType268(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`DocumentType`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType267(buf, offset + 4, value)
    }
}
fun readType268(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`DocumentType`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType267(buf, offset + 4)
    }
}

// Deconstructed version of HistoryMetadataObservation
class DeconstructedType301(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Long,
    val v4: Boolean,
    val v5: Int,
    val v6: String?,
)

@JvmName("lowerType301")
fun lowerType301(rec: mozilla.appservices.places.uniffi.`HistoryMetadataObservation`): DeconstructedType301 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`url`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`referrerUrl`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`searchTerm`)
    val uniffiFieldLowered3 = lowerOptionInt(rec.`viewTime`)
    val uniffiFieldLowered4 = lowerType268(rec.`documentType`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`title`)
    return DeconstructedType301(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType301")
fun liftType301(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Long,
    v4: Boolean,
    v5: Int,
    v6: String?,
): mozilla.appservices.places.uniffi.`HistoryMetadataObservation` {
    return mozilla.appservices.places.uniffi.`HistoryMetadataObservation`(
        liftString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftOptionInt(
            v3,
        ),
        liftType268(
            v4,
            v5,
        ),
        liftOptionString(
            v6,
        ),
    )
}

fun writeType301(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryMetadataObservation`) {
    writeString(buf, offset + 0, value.`url`)
    writeType18(buf, offset + 24, value.`referrerUrl`)
    writeType18(buf, offset + 56, value.`searchTerm`)
    writeType172(buf, offset + 88, value.`viewTime`)
    writeType268(buf, offset + 96, value.`documentType`)
    writeType18(buf, offset + 104, value.`title`)
}

fun readType301(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryMetadataObservation` {
    return mozilla.appservices.places.uniffi.`HistoryMetadataObservation`(
        readString(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
        readType172(buf, offset + 88),
        readType268(buf, offset + 96),
        readType18(buf, offset + 104),
    )
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



// Deconstructed version of HistoryMigrationResult
class DeconstructedType303(
    val v0: Int,
    val v1: Int,
    val v2: Int,
    val v3: Long,
)

@JvmName("lowerType303")
fun lowerType303(rec: mozilla.appservices.places.uniffi.`HistoryMigrationResult`): DeconstructedType303 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerUInt(rec.`numTotal`)
    val uniffiFieldLowered1 = lowerUInt(rec.`numSucceeded`)
    val uniffiFieldLowered2 = lowerUInt(rec.`numFailed`)
    val uniffiFieldLowered3 = lowerULong(rec.`totalDuration`)
    return DeconstructedType303(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType303")
fun liftType303(
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Long,
): mozilla.appservices.places.uniffi.`HistoryMigrationResult` {
    return mozilla.appservices.places.uniffi.`HistoryMigrationResult`(
        liftUInt(
            v0,
        ),
        liftUInt(
            v1,
        ),
        liftUInt(
            v2,
        ),
        liftULong(
            v3,
        ),
    )
}

fun writeType303(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryMigrationResult`) {
    writeUInt(buf, offset + 0, value.`numTotal`)
    writeUInt(buf, offset + 4, value.`numSucceeded`)
    writeUInt(buf, offset + 8, value.`numFailed`)
    writeULong(buf, offset + 16, value.`totalDuration`)
}

fun readType303(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryMigrationResult` {
    return mozilla.appservices.places.uniffi.`HistoryMigrationResult`(
        readUInt(buf, offset + 0),
        readUInt(buf, offset + 4),
        readUInt(buf, offset + 8),
        readULong(buf, offset + 16),
    )
}

@JvmName("lowerType269")
fun lowerType269(value: mozilla.appservices.places.uniffi.`VisitType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType269")
fun liftType269(value: kotlin.Int): mozilla.appservices.places.uniffi.`VisitType` {
    return mozilla.appservices.places.uniffi.`VisitType`.values()[value]
}

fun writeType269(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`VisitType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType269(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`VisitType` {
    return liftType269(readInt(buf, offset))
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




// Deconstructed version of mozilla.appservices.places.uniffi.`Url`?
class DeconstructedType270(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType270")
fun lowerType270(value: mozilla.appservices.places.uniffi.`Url`?): DeconstructedType270 {
    if (value == null) {
        return DeconstructedType270(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType257(value)
        return DeconstructedType270(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType270")
fun liftType270(
    v0: Boolean,
    v1: String?,
): mozilla.appservices.places.uniffi.`Url`? {
    if (v0) {
        return liftType257(
            v1,
        )
    } else {
        return null
    }
}

fun writeType270(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`Url`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType257(buf, offset + 8, value)
    }
}
fun readType270(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`Url`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType257(buf, offset + 8)
    }
}

// Deconstructed version of HistoryVisitInfo
class DeconstructedType272(
    val v0: String?,
    val v1: String?,
    val v2: Long,
    val v3: Int,
    val v4: Boolean,
    val v5: Boolean,
    val v6: String?,
    val v7: Boolean,
)

@JvmName("lowerType272")
fun lowerType272(rec: mozilla.appservices.places.uniffi.`HistoryVisitInfo`): DeconstructedType272 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType257(rec.`url`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered2 = lowerType256(rec.`timestamp`)
    val uniffiFieldLowered3 = lowerType269(rec.`visitType`)
    val uniffiFieldLowered4 = lowerBoolean(rec.`isHidden`)
    val uniffiFieldLowered5 = lowerType270(rec.`previewImageUrl`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`isRemote`)
    return DeconstructedType272(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType272")
fun liftType272(
    v0: String?,
    v1: String?,
    v2: Long,
    v3: Int,
    v4: Boolean,
    v5: Boolean,
    v6: String?,
    v7: Boolean,
): mozilla.appservices.places.uniffi.`HistoryVisitInfo` {
    return mozilla.appservices.places.uniffi.`HistoryVisitInfo`(
        liftType257(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftType256(
            v2,
        ),
        liftType269(
            v3,
        ),
        liftBoolean(
            v4,
        ),
        liftType270(
            v5,
            v6,
        ),
        liftBoolean(
            v7,
        ),
    )
}

fun writeType272(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryVisitInfo`) {
    writeType257(buf, offset + 0, value.`url`)
    writeType18(buf, offset + 24, value.`title`)
    writeType256(buf, offset + 56, value.`timestamp`)
    writeType269(buf, offset + 64, value.`visitType`)
    writeBoolean(buf, offset + 68, value.`isHidden`)
    writeType270(buf, offset + 72, value.`previewImageUrl`)
    writeBoolean(buf, offset + 104, value.`isRemote`)
}

fun readType272(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryVisitInfo` {
    return mozilla.appservices.places.uniffi.`HistoryVisitInfo`(
        readType257(buf, offset + 0),
        readType18(buf, offset + 24),
        readType256(buf, offset + 56),
        readType269(buf, offset + 64),
        readBoolean(buf, offset + 68),
        readType270(buf, offset + 72),
        readBoolean(buf, offset + 104),
    )
}


fun lowerToBuffer271(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 112).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType272(buf, offset, it)
        offset += 112
    }
    return buf
}

fun liftFromBuffer271(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 112
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType272(buf, offset))
                offset += 112
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType271")
fun lowerType271(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`>): java.nio.ByteBuffer {
    return lowerToBuffer271(value)
}

@JvmName("liftType271")
fun liftType271(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`> {
    return liftFromBuffer271(buf)
}

fun writeType271(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`>) {
    val childBuf = lowerToBuffer271(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType271(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer271(childBuf)
}

// Deconstructed version of HistoryVisitInfosWithBound
class DeconstructedType298(
    val v0: java.nio.ByteBuffer?,
    val v1: Long,
    val v2: Long,
)

@JvmName("lowerType298")
fun lowerType298(rec: mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound`): DeconstructedType298 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType271(rec.`infos`)
    val uniffiFieldLowered1 = lowerLong(rec.`bound`)
    val uniffiFieldLowered2 = lowerLong(rec.`offset`)
    return DeconstructedType298(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType298")
fun liftType298(
    v0: java.nio.ByteBuffer?,
    v1: Long,
    v2: Long,
): mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound` {
    return mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound`(
        liftType271(
            v0,
        ),
        liftLong(
            v1,
        ),
        liftLong(
            v2,
        ),
    )
}

fun writeType298(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound`) {
    writeType271(buf, offset + 0, value.`infos`)
    writeLong(buf, offset + 16, value.`bound`)
    writeLong(buf, offset + 24, value.`offset`)
}

fun readType298(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound` {
    return mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound`(
        readType271(buf, offset + 0),
        readLong(buf, offset + 16),
        readLong(buf, offset + 24),
    )
}

// Deconstructed version of BookmarkPosition
class DeconstructedType273(
    val v0: Int,
    val v1: Int,
)

@JvmName("lowerType273")
fun lowerType273(value: mozilla.appservices.places.uniffi.`BookmarkPosition`): DeconstructedType273 {
    when (value) {
        is mozilla.appservices.places.uniffi.`BookmarkPosition`.`Specific` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerUInt(value.`pos`)
            return DeconstructedType273(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.places.uniffi.`BookmarkPosition`.`Append` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType273(
                uniffiFieldLowered0,
                0,
            )
        }
    }
}

@JvmName("liftType273")
fun liftType273(
    v0: Int,
    v1: Int,
): mozilla.appservices.places.uniffi.`BookmarkPosition` {
    when (v0) {
        0 -> {
            return mozilla.appservices.places.uniffi.`BookmarkPosition`.`Specific`(
                liftUInt(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.places.uniffi.`BookmarkPosition`.`Append`
        }
        else -> {
            throw uniffi.InternalException("liftType273: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType273(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkPosition`) {
    when (value) {
        is mozilla.appservices.places.uniffi.`BookmarkPosition`.`Specific` -> {
            writeInt(buf, offset, 0);
            writeUInt(buf, offset + 4, value.`pos`)
        }
        is mozilla.appservices.places.uniffi.`BookmarkPosition`.`Append` -> {
            writeInt(buf, offset, 1);
        }
    }
}

fun readType273(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkPosition` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.places.uniffi.`BookmarkPosition`.`Specific`(
                readUInt(buf, offset + 4),
            )
        }
        1 -> {
            mozilla.appservices.places.uniffi.`BookmarkPosition`.`Append`
        }
        else -> {
            throw uniffi.InternalException("liftType273: Invalid enum discriminant: ${discriminant}")
        }
    }
}


// Deconstructed version of mozilla.appservices.places.uniffi.`PlacesTimestamp`?
class DeconstructedType274(
    val v0: Boolean,
    val v1: Long,
)

@JvmName("lowerType274")
fun lowerType274(value: mozilla.appservices.places.uniffi.`PlacesTimestamp`?): DeconstructedType274 {
    if (value == null) {
        return DeconstructedType274(
            false,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerType256(value)
        return DeconstructedType274(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType274")
fun liftType274(
    v0: Boolean,
    v1: Long,
): mozilla.appservices.places.uniffi.`PlacesTimestamp`? {
    if (v0) {
        return liftType256(
            v1,
        )
    } else {
        return null
    }
}

fun writeType274(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`PlacesTimestamp`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType256(buf, offset + 8, value)
    }
}
fun readType274(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`PlacesTimestamp`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType256(buf, offset + 8)
    }
}

// Deconstructed version of InsertableBookmark
class DeconstructedType282(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: Int,
    val v4: Int,
    val v5: Boolean,
    val v6: Long,
    val v7: Boolean,
    val v8: Long,
    val v9: String?,
    val v10: String?,
)

@JvmName("lowerType282")
fun lowerType282(rec: mozilla.appservices.places.uniffi.`InsertableBookmark`): DeconstructedType282 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType258(rec.`guid`)
    val uniffiFieldLowered1 = lowerType255(rec.`parentGuid`)
    val uniffiFieldLowered2 = lowerType273(rec.`position`)
    val uniffiFieldLowered3 = lowerType274(rec.`dateAdded`)
    val uniffiFieldLowered4 = lowerType274(rec.`lastModified`)
    val uniffiFieldLowered5 = lowerType257(rec.`url`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`title`)
    return DeconstructedType282(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType282")
fun liftType282(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: Int,
    v4: Int,
    v5: Boolean,
    v6: Long,
    v7: Boolean,
    v8: Long,
    v9: String?,
    v10: String?,
): mozilla.appservices.places.uniffi.`InsertableBookmark` {
    return mozilla.appservices.places.uniffi.`InsertableBookmark`(
        liftType258(
            v0,
            v1,
        ),
        liftType255(
            v2,
        ),
        liftType273(
            v3,
            v4,
        ),
        liftType274(
            v5,
            v6,
        ),
        liftType274(
            v7,
            v8,
        ),
        liftType257(
            v9,
        ),
        liftOptionString(
            v10,
        ),
    )
}

fun writeType282(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`InsertableBookmark`) {
    writeType258(buf, offset + 0, value.`guid`)
    writeType255(buf, offset + 32, value.`parentGuid`)
    writeType273(buf, offset + 56, value.`position`)
    writeType274(buf, offset + 64, value.`dateAdded`)
    writeType274(buf, offset + 80, value.`lastModified`)
    writeType257(buf, offset + 96, value.`url`)
    writeType18(buf, offset + 120, value.`title`)
}

fun readType282(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`InsertableBookmark` {
    return mozilla.appservices.places.uniffi.`InsertableBookmark`(
        readType258(buf, offset + 0),
        readType255(buf, offset + 32),
        readType273(buf, offset + 56),
        readType274(buf, offset + 64),
        readType274(buf, offset + 80),
        readType257(buf, offset + 96),
        readType18(buf, offset + 120),
    )
}

// Deconstructed version of InsertableBookmarkSeparator
class DeconstructedType284(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: Int,
    val v4: Int,
    val v5: Boolean,
    val v6: Long,
    val v7: Boolean,
    val v8: Long,
)

@JvmName("lowerType284")
fun lowerType284(rec: mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator`): DeconstructedType284 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType258(rec.`guid`)
    val uniffiFieldLowered1 = lowerType255(rec.`parentGuid`)
    val uniffiFieldLowered2 = lowerType273(rec.`position`)
    val uniffiFieldLowered3 = lowerType274(rec.`dateAdded`)
    val uniffiFieldLowered4 = lowerType274(rec.`lastModified`)
    return DeconstructedType284(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
    )
}

@JvmName("liftType284")
fun liftType284(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: Int,
    v4: Int,
    v5: Boolean,
    v6: Long,
    v7: Boolean,
    v8: Long,
): mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator` {
    return mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator`(
        liftType258(
            v0,
            v1,
        ),
        liftType255(
            v2,
        ),
        liftType273(
            v3,
            v4,
        ),
        liftType274(
            v5,
            v6,
        ),
        liftType274(
            v7,
            v8,
        ),
    )
}

fun writeType284(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator`) {
    writeType258(buf, offset + 0, value.`guid`)
    writeType255(buf, offset + 32, value.`parentGuid`)
    writeType273(buf, offset + 56, value.`position`)
    writeType274(buf, offset + 64, value.`dateAdded`)
    writeType274(buf, offset + 80, value.`lastModified`)
}

fun readType284(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator` {
    return mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator`(
        readType258(buf, offset + 0),
        readType255(buf, offset + 32),
        readType273(buf, offset + 56),
        readType274(buf, offset + 64),
        readType274(buf, offset + 80),
    )
}


fun lowerToBuffer275(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 160).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType276(buf, offset, it)
        offset += 160
    }
    return buf
}

fun liftFromBuffer275(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 160
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType276(buf, offset))
                offset += 160
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType275")
fun lowerType275(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`>): java.nio.ByteBuffer {
    return lowerToBuffer275(value)
}

@JvmName("liftType275")
fun liftType275(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`> {
    return liftFromBuffer275(buf)
}

fun writeType275(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`>) {
    val childBuf = lowerToBuffer275(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType275(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer275(childBuf)
}

// Deconstructed version of InsertableBookmarkFolder
class DeconstructedType283(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: Int,
    val v4: Int,
    val v5: Boolean,
    val v6: Long,
    val v7: Boolean,
    val v8: Long,
    val v9: String?,
    val v10: java.nio.ByteBuffer?,
)

@JvmName("lowerType283")
fun lowerType283(rec: mozilla.appservices.places.uniffi.`InsertableBookmarkFolder`): DeconstructedType283 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType258(rec.`guid`)
    val uniffiFieldLowered1 = lowerType255(rec.`parentGuid`)
    val uniffiFieldLowered2 = lowerType273(rec.`position`)
    val uniffiFieldLowered3 = lowerType274(rec.`dateAdded`)
    val uniffiFieldLowered4 = lowerType274(rec.`lastModified`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered6 = lowerType275(rec.`children`)
    return DeconstructedType283(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType283")
fun liftType283(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: Int,
    v4: Int,
    v5: Boolean,
    v6: Long,
    v7: Boolean,
    v8: Long,
    v9: String?,
    v10: java.nio.ByteBuffer?,
): mozilla.appservices.places.uniffi.`InsertableBookmarkFolder` {
    return mozilla.appservices.places.uniffi.`InsertableBookmarkFolder`(
        liftType258(
            v0,
            v1,
        ),
        liftType255(
            v2,
        ),
        liftType273(
            v3,
            v4,
        ),
        liftType274(
            v5,
            v6,
        ),
        liftType274(
            v7,
            v8,
        ),
        liftOptionString(
            v9,
        ),
        liftType275(
            v10,
        ),
    )
}

fun writeType283(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`InsertableBookmarkFolder`) {
    writeType258(buf, offset + 0, value.`guid`)
    writeType255(buf, offset + 32, value.`parentGuid`)
    writeType273(buf, offset + 56, value.`position`)
    writeType274(buf, offset + 64, value.`dateAdded`)
    writeType274(buf, offset + 80, value.`lastModified`)
    writeType18(buf, offset + 96, value.`title`)
    writeType275(buf, offset + 128, value.`children`)
}

fun readType283(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`InsertableBookmarkFolder` {
    return mozilla.appservices.places.uniffi.`InsertableBookmarkFolder`(
        readType258(buf, offset + 0),
        readType255(buf, offset + 32),
        readType273(buf, offset + 56),
        readType274(buf, offset + 64),
        readType274(buf, offset + 80),
        readType18(buf, offset + 96),
        readType275(buf, offset + 128),
    )
}

// Deconstructed version of InsertableBookmarkItem
class DeconstructedType276(
    val v0: Int,
    val v1: Boolean,
    val v2: String?,
    val v3: String?,
    val v4: Int,
    val v5: Int,
    val v6: Boolean,
    val v7: Long,
    val v8: Boolean,
    val v9: Long,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: Int,
    val v14: Boolean,
    val v15: Boolean,
    val v16: Long,
    val v17: String?,
    val v18: java.nio.ByteBuffer?,
    val v19: String?,
    val v20: Int,
    val v21: Boolean,
    val v22: Boolean,
    val v23: Long,
)

@JvmName("lowerType276")
fun lowerType276(value: mozilla.appservices.places.uniffi.`InsertableBookmarkItem`): DeconstructedType276 {
    when (value) {
        is mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Bookmark` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType282(value.`b`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered17 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered19 = uniffiFieldDeconstructed0.v10
            return DeconstructedType276(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                0,
                false,
                0L,
                false,
                0L,
                null,
                null,
                null,
                0,
                false,
                false,
                uniffiFieldLowered16,
                uniffiFieldLowered17,
                null,
                uniffiFieldLowered19,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
            )
        }
        is mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Folder` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldDeconstructed0 = lowerType283(value.`f`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered17 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered18 = uniffiFieldDeconstructed0.v10
            return DeconstructedType276(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                0,
                false,
                0L,
                false,
                0L,
                null,
                null,
                null,
                0,
                false,
                false,
                uniffiFieldLowered16,
                uniffiFieldLowered17,
                uniffiFieldLowered18,
                null,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
            )
        }
        is mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Separator` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldDeconstructed0 = lowerType284(value.`s`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v8
            return DeconstructedType276(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                0,
                false,
                0L,
                false,
                0L,
                null,
                null,
                null,
                0,
                false,
                false,
                uniffiFieldLowered16,
                null,
                null,
                null,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
            )
        }
    }
}

@JvmName("liftType276")
fun liftType276(
    v0: Int,
    v1: Boolean,
    v2: String?,
    v3: String?,
    v4: Int,
    v5: Int,
    v6: Boolean,
    v7: Long,
    v8: Boolean,
    v9: Long,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: Int,
    v14: Boolean,
    v15: Boolean,
    v16: Long,
    v17: String?,
    v18: java.nio.ByteBuffer?,
    v19: String?,
    v20: Int,
    v21: Boolean,
    v22: Boolean,
    v23: Long,
): mozilla.appservices.places.uniffi.`InsertableBookmarkItem` {
    when (v0) {
        0 -> {
            return mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Bookmark`(
                liftType282(
                    v1,
                    v2,
                    v3,
                    v4,
                    v20,
                    v22,
                    v23,
                    v21,
                    v16,
                    v17,
                    v19,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Folder`(
                liftType283(
                    v1,
                    v2,
                    v3,
                    v4,
                    v20,
                    v22,
                    v23,
                    v21,
                    v16,
                    v17,
                    v18,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Separator`(
                liftType284(
                    v1,
                    v2,
                    v3,
                    v4,
                    v20,
                    v22,
                    v23,
                    v21,
                    v16,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType276: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType276(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`InsertableBookmarkItem`) {
    when (value) {
        is mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Bookmark` -> {
            writeInt(buf, offset, 0);
            writeType282(buf, offset + 8, value.`b`)
        }
        is mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Folder` -> {
            writeInt(buf, offset, 1);
            writeType283(buf, offset + 8, value.`f`)
        }
        is mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Separator` -> {
            writeInt(buf, offset, 2);
            writeType284(buf, offset + 8, value.`s`)
        }
    }
}

fun readType276(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`InsertableBookmarkItem` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Bookmark`(
                readType282(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Folder`(
                readType283(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.places.uniffi.`InsertableBookmarkItem`.`Separator`(
                readType284(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType276: Invalid enum discriminant: ${discriminant}")
        }
    }
}

@JvmName("lowerType277")
fun lowerType277(value: mozilla.appservices.places.uniffi.`HistoryMetadataPageMissingBehavior`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType277")
fun liftType277(value: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryMetadataPageMissingBehavior` {
    return mozilla.appservices.places.uniffi.`HistoryMetadataPageMissingBehavior`.values()[value]
}

fun writeType277(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryMetadataPageMissingBehavior`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType277(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryMetadataPageMissingBehavior` {
    return liftType277(readInt(buf, offset))
}


@JvmName("lowerType302")
fun lowerType302(rec: mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions`): Int {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType277(rec.`ifPageMissing`)
    return uniffiFieldLowered0
}

@JvmName("liftType302")
fun liftType302(
    v0: Int,
): mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions` {
    return mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions`(
        liftType277(
            v0,
        ),
    )
}

fun writeType302(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions`) {
    writeType277(buf, offset + 0, value.`ifPageMissing`)
}

fun readType302(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions` {
    return mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions`(
        readType277(buf, offset + 0),
    )
}

// Deconstructed version of PlacesRunMaintenanceOptions
class DeconstructedType306(
    val v0: Int,
    val v1: Int,
)

@JvmName("lowerType306")
fun lowerType306(rec: mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions`): DeconstructedType306 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerUInt(rec.`dbSizeLimit`)
    val uniffiFieldLowered1 = lowerUInt(rec.`pruneLimit`)
    return DeconstructedType306(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType306")
fun liftType306(
    v0: Int,
    v1: Int,
): mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions` {
    return mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions`(
        liftUInt(
            v0,
        ),
        liftUInt(
            v1,
        ),
    )
}

fun writeType306(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions`) {
    writeUInt(buf, offset + 0, value.`dbSizeLimit`)
    writeUInt(buf, offset + 4, value.`pruneLimit`)
}

fun readType306(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions` {
    return mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions`(
        readUInt(buf, offset + 0),
        readUInt(buf, offset + 4),
    )
}

// Deconstructed version of SearchResult
class DeconstructedType305(
    val v0: String?,
    val v1: String?,
    val v2: Long,
)

@JvmName("lowerType305")
fun lowerType305(rec: mozilla.appservices.places.uniffi.`SearchResult`): DeconstructedType305 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType257(rec.`url`)
    val uniffiFieldLowered1 = lowerString(rec.`title`)
    val uniffiFieldLowered2 = lowerLong(rec.`frecency`)
    return DeconstructedType305(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType305")
fun liftType305(
    v0: String?,
    v1: String?,
    v2: Long,
): mozilla.appservices.places.uniffi.`SearchResult` {
    return mozilla.appservices.places.uniffi.`SearchResult`(
        liftType257(
            v0,
        ),
        liftString(
            v1,
        ),
        liftLong(
            v2,
        ),
    )
}

fun writeType305(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`SearchResult`) {
    writeType257(buf, offset + 0, value.`url`)
    writeString(buf, offset + 24, value.`title`)
    writeLong(buf, offset + 48, value.`frecency`)
}

fun readType305(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`SearchResult` {
    return mozilla.appservices.places.uniffi.`SearchResult`(
        readType257(buf, offset + 0),
        readString(buf, offset + 24),
        readLong(buf, offset + 48),
    )
}

// Deconstructed version of TopFrecentSiteInfo
class DeconstructedType296(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType296")
fun lowerType296(rec: mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`): DeconstructedType296 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType257(rec.`url`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`title`)
    return DeconstructedType296(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType296")
fun liftType296(
    v0: String?,
    v1: String?,
): mozilla.appservices.places.uniffi.`TopFrecentSiteInfo` {
    return mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`(
        liftType257(
            v0,
        ),
        liftOptionString(
            v1,
        ),
    )
}

fun writeType296(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`) {
    writeType257(buf, offset + 0, value.`url`)
    writeType18(buf, offset + 24, value.`title`)
}

fun readType296(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`TopFrecentSiteInfo` {
    return mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`(
        readType257(buf, offset + 0),
        readType18(buf, offset + 24),
    )
}


// Deconstructed version of mozilla.appservices.places.uniffi.`VisitType`?
class DeconstructedType278(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType278")
fun lowerType278(value: mozilla.appservices.places.uniffi.`VisitType`?): DeconstructedType278 {
    if (value == null) {
        return DeconstructedType278(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType269(value)
        return DeconstructedType278(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType278")
fun liftType278(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.places.uniffi.`VisitType`? {
    if (v0) {
        return liftType269(
            v1,
        )
    } else {
        return null
    }
}

fun writeType278(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`VisitType`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType269(buf, offset + 4, value)
    }
}
fun readType278(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`VisitType`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType269(buf, offset + 4)
    }
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



// Deconstructed version of VisitObservation
class DeconstructedType287(
    val v0: String?,
    val v1: String?,
    val v2: Boolean,
    val v3: Int,
    val v4: Long,
    val v5: Long,
    val v6: Long,
    val v7: Boolean,
    val v8: Long,
    val v9: Boolean,
    val v10: String?,
    val v11: Long,
    val v12: Boolean,
    val v13: String?,
)

@JvmName("lowerType287")
fun lowerType287(rec: mozilla.appservices.places.uniffi.`VisitObservation`): DeconstructedType287 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType257(rec.`url`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`title`)
    val uniffiFieldLowered2 = lowerType278(rec.`visitType`)
    val uniffiFieldLowered3 = lowerOptionBoolean(rec.`isError`)
    val uniffiFieldLowered4 = lowerOptionBoolean(rec.`isRedirectSource`)
    val uniffiFieldLowered5 = lowerOptionBoolean(rec.`isPermanentRedirectSource`)
    val uniffiFieldLowered6 = lowerType274(rec.`at`)
    val uniffiFieldLowered7 = lowerType270(rec.`referrer`)
    val uniffiFieldLowered8 = lowerOptionBoolean(rec.`isRemote`)
    val uniffiFieldLowered9 = lowerType270(rec.`previewImageUrl`)
    return DeconstructedType287(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6.v0,
        uniffiFieldLowered6.v1,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
        uniffiFieldLowered8,
        uniffiFieldLowered9.v0,
        uniffiFieldLowered9.v1,
    )
}

@JvmName("liftType287")
fun liftType287(
    v0: String?,
    v1: String?,
    v2: Boolean,
    v3: Int,
    v4: Long,
    v5: Long,
    v6: Long,
    v7: Boolean,
    v8: Long,
    v9: Boolean,
    v10: String?,
    v11: Long,
    v12: Boolean,
    v13: String?,
): mozilla.appservices.places.uniffi.`VisitObservation` {
    return mozilla.appservices.places.uniffi.`VisitObservation`(
        liftType257(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftType278(
            v2,
            v3,
        ),
        liftOptionBoolean(
            v4,
        ),
        liftOptionBoolean(
            v5,
        ),
        liftOptionBoolean(
            v6,
        ),
        liftType274(
            v7,
            v8,
        ),
        liftType270(
            v9,
            v10,
        ),
        liftOptionBoolean(
            v11,
        ),
        liftType270(
            v12,
            v13,
        ),
    )
}

fun writeType287(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`VisitObservation`) {
    writeType257(buf, offset + 0, value.`url`)
    writeType18(buf, offset + 24, value.`title`)
    writeType278(buf, offset + 56, value.`visitType`)
    writeType207(buf, offset + 64, value.`isError`)
    writeType207(buf, offset + 66, value.`isRedirectSource`)
    writeType207(buf, offset + 68, value.`isPermanentRedirectSource`)
    writeType274(buf, offset + 72, value.`at`)
    writeType270(buf, offset + 88, value.`referrer`)
    writeType207(buf, offset + 120, value.`isRemote`)
    writeType270(buf, offset + 128, value.`previewImageUrl`)
}

fun readType287(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`VisitObservation` {
    return mozilla.appservices.places.uniffi.`VisitObservation`(
        readType257(buf, offset + 0),
        readType18(buf, offset + 24),
        readType278(buf, offset + 56),
        readType207(buf, offset + 64),
        readType207(buf, offset + 66),
        readType207(buf, offset + 68),
        readType274(buf, offset + 72),
        readType270(buf, offset + 88),
        readType207(buf, offset + 120),
        readType270(buf, offset + 128),
    )
}

@JvmName("lowerType285")
fun lowerType285(value: mozilla.appservices.places.uniffi.`ConnectionType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType285")
fun liftType285(value: kotlin.Int): mozilla.appservices.places.uniffi.`ConnectionType` {
    return mozilla.appservices.places.uniffi.`ConnectionType`.values()[value]
}

fun writeType285(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`ConnectionType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType285(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`ConnectionType` {
    return liftType285(readInt(buf, offset))
}

@JvmName("lowerType294")
fun lowerType294(value: mozilla.appservices.places.uniffi.`FrecencyThresholdOption`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType294")
fun liftType294(value: kotlin.Int): mozilla.appservices.places.uniffi.`FrecencyThresholdOption` {
    return mozilla.appservices.places.uniffi.`FrecencyThresholdOption`.values()[value]
}

fun writeType294(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`FrecencyThresholdOption`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType294(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`FrecencyThresholdOption` {
    return liftType294(readInt(buf, offset))
}

// Deconstructed version of PlacesApiError
class DeconstructedType254(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType254")
fun lowerType254(value: mozilla.appservices.places.uniffi.`PlacesApiException`): DeconstructedType254 {
    when (value) {
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`UnexpectedPlacesException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType254(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`UrlParseFailed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType254(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`PlacesConnectionBusy` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType254(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`OperationInterrupted` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType254(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`UnknownBookmarkItem` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType254(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`InvalidBookmarkOperation` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType254(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType254")
fun liftType254(
    v0: Int,
    v1: String?,
): mozilla.appservices.places.uniffi.`PlacesApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.places.uniffi.`PlacesApiException`.`UnexpectedPlacesException`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.places.uniffi.`PlacesApiException`.`UrlParseFailed`(
                liftString(
                    v1,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.places.uniffi.`PlacesApiException`.`PlacesConnectionBusy`(
                liftString(
                    v1,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.places.uniffi.`PlacesApiException`.`OperationInterrupted`(
                liftString(
                    v1,
                ),
            )
        }
        4 -> {
            return mozilla.appservices.places.uniffi.`PlacesApiException`.`UnknownBookmarkItem`(
                liftString(
                    v1,
                ),
            )
        }
        5 -> {
            return mozilla.appservices.places.uniffi.`PlacesApiException`.`InvalidBookmarkOperation`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType254: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType254(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`PlacesApiException`) {
    when (value) {
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`UnexpectedPlacesException` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`UrlParseFailed` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`PlacesConnectionBusy` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`OperationInterrupted` -> {
            writeInt(buf, offset, 3);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`UnknownBookmarkItem` -> {
            writeInt(buf, offset, 4);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.places.uniffi.`PlacesApiException`.`InvalidBookmarkOperation` -> {
            writeInt(buf, offset, 5);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType254(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`PlacesApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.places.uniffi.`PlacesApiException`.`UnexpectedPlacesException`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.places.uniffi.`PlacesApiException`.`UrlParseFailed`(
                readString(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.places.uniffi.`PlacesApiException`.`PlacesConnectionBusy`(
                readString(buf, offset + 8),
            )
        }
        3 -> {
            mozilla.appservices.places.uniffi.`PlacesApiException`.`OperationInterrupted`(
                readString(buf, offset + 8),
            )
        }
        4 -> {
            mozilla.appservices.places.uniffi.`PlacesApiException`.`UnknownBookmarkItem`(
                readString(buf, offset + 8),
            )
        }
        5 -> {
            mozilla.appservices.places.uniffi.`PlacesApiException`.`InvalidBookmarkOperation`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType254: Invalid enum discriminant: ${discriminant}")
        }
    }
}


@JvmName("lowerType297")
fun lowerType297(value: mozilla.appservices.places.uniffi.`VisitTransitionSet`): Int {
    return lowerInt(value)
}

@JvmName("liftType297")
fun liftType297(
    v0: Int,
): mozilla.appservices.places.uniffi.`VisitTransitionSet` {
    val builtinValue = liftInt(
        v0,
    )
    return builtinValue
}

fun writeType297(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`VisitTransitionSet`) {
    writeInt(buf, offset, value)
}

fun readType297(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`VisitTransitionSet` {
    val builtinValue = readInt(buf, offset)
    return builtinValue
}


// Deconstructed version of mozilla.appservices.places.uniffi.`BookmarkItem`?
class DeconstructedType288(
    val v0: Boolean,
    val v1: Int,
    val v2: String?,
    val v3: String?,
    val v4: Int,
    val v5: Long,
    val v6: Long,
    val v7: String?,
    val v8: String?,
    val v9: Long,
    val v10: String?,
    val v11: Long,
    val v12: Boolean,
    val v13: String?,
    val v14: String?,
    val v15: Boolean,
    val v16: java.nio.ByteBuffer?,
    val v17: Boolean,
    val v18: java.nio.ByteBuffer?,
)

@JvmName("lowerType288")
fun lowerType288(value: mozilla.appservices.places.uniffi.`BookmarkItem`?): DeconstructedType288 {
    if (value == null) {
        return DeconstructedType288(
            false,
            0,
            null,
            null,
            0,
            0L,
            0L,
            null,
            null,
            0L,
            null,
            0L,
            false,
            null,
            null,
            false,
            null,
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType263(value)
        return DeconstructedType288(
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
            uniffiFieldLowered.v11,
            uniffiFieldLowered.v12,
            uniffiFieldLowered.v13,
            uniffiFieldLowered.v14,
            uniffiFieldLowered.v15,
            uniffiFieldLowered.v16,
            uniffiFieldLowered.v17,
        )
    }
}

@JvmName("liftType288")
fun liftType288(
    v0: Boolean,
    v1: Int,
    v2: String?,
    v3: String?,
    v4: Int,
    v5: Long,
    v6: Long,
    v7: String?,
    v8: String?,
    v9: Long,
    v10: String?,
    v11: Long,
    v12: Boolean,
    v13: String?,
    v14: String?,
    v15: Boolean,
    v16: java.nio.ByteBuffer?,
    v17: Boolean,
    v18: java.nio.ByteBuffer?,
): mozilla.appservices.places.uniffi.`BookmarkItem`? {
    if (v0) {
        return liftType263(
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
            v12,
            v13,
            v14,
            v15,
            v16,
            v17,
            v18,
        )
    } else {
        return null
    }
}

fun writeType288(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`BookmarkItem`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType263(buf, offset + 8, value)
    }
}
fun readType288(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`BookmarkItem`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType263(buf, offset + 8)
    }
}


fun lowerToBuffer291(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 104).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType292(buf, offset, it)
        offset += 104
    }
    return buf
}

fun liftFromBuffer291(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 104
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType292(buf, offset))
                offset += 104
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType291")
fun lowerType291(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`>): java.nio.ByteBuffer {
    return lowerToBuffer291(value)
}

@JvmName("liftType291")
fun liftType291(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`> {
    return liftFromBuffer291(buf)
}

fun writeType291(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`>) {
    val childBuf = lowerToBuffer291(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType291(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer291(childBuf)
}


// Deconstructed version of mozilla.appservices.places.uniffi.`HistoryMetadata`?
class DeconstructedType293(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: Long,
    val v5: Long,
    val v6: Int,
    val v7: String?,
    val v8: Int,
    val v9: String?,
)

@JvmName("lowerType293")
fun lowerType293(value: mozilla.appservices.places.uniffi.`HistoryMetadata`?): DeconstructedType293 {
    if (value == null) {
        return DeconstructedType293(
            false,
            null,
            null,
            null,
            0L,
            0L,
            0,
            null,
            0,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType266(value)
        return DeconstructedType293(
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
        )
    }
}

@JvmName("liftType293")
fun liftType293(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: Long,
    v5: Long,
    v6: Int,
    v7: String?,
    v8: Int,
    v9: String?,
): mozilla.appservices.places.uniffi.`HistoryMetadata`? {
    if (v0) {
        return liftType266(
            v1,
            v2,
            v3,
            v4,
            v5,
            v6,
            v7,
            v8,
            v9,
        )
    } else {
        return null
    }
}

fun writeType293(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`HistoryMetadata`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType266(buf, offset + 8, value)
    }
}
fun readType293(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`HistoryMetadata`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType266(buf, offset + 8)
    }
}


fun lowerToBuffer295(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 56).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType296(buf, offset, it)
        offset += 56
    }
    return buf
}

fun liftFromBuffer295(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 56
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType296(buf, offset))
                offset += 56
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType295")
fun lowerType295(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`>): java.nio.ByteBuffer {
    return lowerToBuffer295(value)
}

@JvmName("liftType295")
fun liftType295(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`> {
    return liftFromBuffer295(buf)
}

fun writeType295(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`>) {
    val childBuf = lowerToBuffer295(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType295(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer295(childBuf)
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





@JvmName("lowerType162")
inline fun lowerType162(value: kotlin.collections.List<kotlin.Boolean>): java.nio.ByteBuffer? {
    return uniffi.lowerType162(value)
}

@JvmName("liftType162")
inline fun liftType162(
    v1: java.nio.ByteBuffer?
): kotlin.collections.List<kotlin.Boolean> {
    return uniffi.liftType162(
        v1
    )
}

inline fun writeType162(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.Boolean>) {
    uniffi.writeType162(buf, offset, value)
}

inline fun readType162(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.Boolean> {
    return uniffi.readType162(buf, offset)
}




fun lowerToBuffer299(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 24).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType257(buf, offset, it)
        offset += 24
    }
    return buf
}

fun liftFromBuffer299(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 24
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType257(buf, offset))
                offset += 24
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType299")
fun lowerType299(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`>): java.nio.ByteBuffer {
    return lowerToBuffer299(value)
}

@JvmName("liftType299")
fun liftType299(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`> {
    return liftFromBuffer299(buf)
}

fun writeType299(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`>) {
    val childBuf = lowerToBuffer299(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType299(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer299(childBuf)
}

fun objectToHandle300(obj: mozilla.appservices.places.uniffi.`SqlInterruptHandle`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject300(handle: kotlin.Long): mozilla.appservices.places.uniffi.`SqlInterruptHandle` {
    return mozilla.appservices.places.uniffi.`SqlInterruptHandle`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef300")
fun lowerObjectRef300(value: mozilla.appservices.places.uniffi.`SqlInterruptHandle`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType300")
fun lowerType300(value: mozilla.appservices.places.uniffi.`SqlInterruptHandle`): kotlin.Long {
    return objectToHandle300(value)
}

@JvmName("liftType300")
fun liftType300(handle: kotlin.Long): mozilla.appservices.places.uniffi.`SqlInterruptHandle` {
    return handleToObject300(handle)
}

fun writeType300(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`SqlInterruptHandle`) {
    writeLong(buf, offset, objectToHandle300(value))
}

fun readType300(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`SqlInterruptHandle` {
    return handleToObject300(readLong(buf, offset))
}


fun lowerToBuffer304(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 56).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType305(buf, offset, it)
        offset += 56
    }
    return buf
}

fun liftFromBuffer304(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 56
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType305(buf, offset))
                offset += 56
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType304")
fun lowerType304(value: kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`>): java.nio.ByteBuffer {
    return lowerToBuffer304(value)
}

@JvmName("liftType304")
fun liftType304(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`> {
    return liftFromBuffer304(buf)
}

fun writeType304(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`>) {
    val childBuf = lowerToBuffer304(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType304(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer304(childBuf)
}

fun objectToHandle286(obj: mozilla.appservices.places.uniffi.`PlacesConnection`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject286(handle: kotlin.Long): mozilla.appservices.places.uniffi.`PlacesConnection` {
    return mozilla.appservices.places.uniffi.`PlacesConnection`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef286")
fun lowerObjectRef286(value: mozilla.appservices.places.uniffi.`PlacesConnection`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType286")
fun lowerType286(value: mozilla.appservices.places.uniffi.`PlacesConnection`): kotlin.Long {
    return objectToHandle286(value)
}

@JvmName("liftType286")
fun liftType286(handle: kotlin.Long): mozilla.appservices.places.uniffi.`PlacesConnection` {
    return handleToObject286(handle)
}

fun writeType286(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`PlacesConnection`) {
    writeLong(buf, offset, objectToHandle286(value))
}

fun readType286(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`PlacesConnection` {
    return handleToObject286(readLong(buf, offset))
}

fun objectToHandle253(obj: mozilla.appservices.places.uniffi.`PlacesApi`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject253(handle: kotlin.Long): mozilla.appservices.places.uniffi.`PlacesApi` {
    return mozilla.appservices.places.uniffi.`PlacesApi`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef253")
fun lowerObjectRef253(value: mozilla.appservices.places.uniffi.`PlacesApi`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType253")
fun lowerType253(value: mozilla.appservices.places.uniffi.`PlacesApi`): kotlin.Long {
    return objectToHandle253(value)
}

@JvmName("liftType253")
fun liftType253(handle: kotlin.Long): mozilla.appservices.places.uniffi.`PlacesApi` {
    return handleToObject253(handle)
}

fun writeType253(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.places.uniffi.`PlacesApi`) {
    writeLong(buf, offset, objectToHandle253(value))
}

fun readType253(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.places.uniffi.`PlacesApi` {
    return handleToObject253(readLong(buf, offset))
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




inline fun lowerBytesRef(v: java.nio.ByteBuffer): java.nio.ByteBuffer? {
    return uniffi.lowerBytesRef(v)
}

object Scaffolding {
    init {
        // Reference uniffi.Scaffolding to ensure it's init() function runs
        @Suppress("UNUSED_EXPRESSION")
        uniffi.Scaffolding
    }
    @JvmName("functionPlacesPlacesApiNew")
    @JvmStatic external fun functionPlacesPlacesApiNew(
        `uniffiArg0`: String?,
    ) : Long
    @JvmName("methodPlacesSqlInterruptHandleInterrupt")
    @JvmStatic external fun methodPlacesSqlInterruptHandleInterrupt(
        `uniffiArg0`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionAcceptResult")
    @JvmStatic external fun methodPlacesPlacesConnectionAcceptResult(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    )
    @JvmName("methodPlacesPlacesConnectionApplyObservation")
    @JvmStatic external fun methodPlacesPlacesConnectionApplyObservation(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: Int,
        `uniffiArg5`: Long,
        `uniffiArg6`: Long,
        `uniffiArg7`: Long,
        `uniffiArg8`: Boolean,
        `uniffiArg9`: Long,
        `uniffiArg10`: Boolean,
        `uniffiArg11`: String?,
        `uniffiArg12`: Long,
        `uniffiArg13`: Boolean,
        `uniffiArg14`: String?,
    )
    @JvmName("methodPlacesPlacesConnectionBookmarksCountBookmarksInTrees")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksCountBookmarksInTrees(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : Int
    @JvmName("methodPlacesPlacesConnectionBookmarksDelete")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksDelete(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodPlacesPlacesConnectionBookmarksDeleteEverything")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksDeleteEverything(
        `uniffiArg0`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionBookmarksGetAllWithUrl")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksGetAllWithUrl(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionBookmarksGetByGuid")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksGetByGuid(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
    ) : mozilla.appservices.places.uniffi.`BookmarkItem`?
    @JvmName("methodPlacesPlacesConnectionBookmarksGetRecent")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksGetRecent(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionBookmarksGetTree")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksGetTree(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.places.uniffi.`BookmarkItem`?
    @JvmName("methodPlacesPlacesConnectionBookmarksGetUrlForKeyword")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksGetUrlForKeyword(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.places.uniffi.`Url`?
    @JvmName("methodPlacesPlacesConnectionBookmarksInsert")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksInsert(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Int,
        `uniffiArg6`: Int,
        `uniffiArg7`: Boolean,
        `uniffiArg8`: Long,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: Long,
        `uniffiArg11`: String?,
        `uniffiArg12`: String?,
        `uniffiArg13`: String?,
        `uniffiArg14`: Int,
        `uniffiArg15`: Boolean,
        `uniffiArg16`: Boolean,
        `uniffiArg17`: Long,
        `uniffiArg18`: String?,
        `uniffiArg19`: java.nio.ByteBuffer?,
        `uniffiArg20`: String?,
        `uniffiArg21`: Int,
        `uniffiArg22`: Boolean,
        `uniffiArg23`: Boolean,
        `uniffiArg24`: Long,
    ) : String?
    @JvmName("methodPlacesPlacesConnectionBookmarksSearch")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksSearch(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionBookmarksUpdate")
    @JvmStatic external fun methodPlacesPlacesConnectionBookmarksUpdate(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: String?,
        `uniffiArg6`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionDeleteEverythingHistory")
    @JvmStatic external fun methodPlacesPlacesConnectionDeleteEverythingHistory(
        `uniffiArg0`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionDeleteVisit")
    @JvmStatic external fun methodPlacesPlacesConnectionDeleteVisit(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionDeleteVisitsBetween")
    @JvmStatic external fun methodPlacesPlacesConnectionDeleteVisitsBetween(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionDeleteVisitsFor")
    @JvmStatic external fun methodPlacesPlacesConnectionDeleteVisitsFor(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodPlacesPlacesConnectionGetHistoryHighlights")
    @JvmStatic external fun methodPlacesPlacesConnectionGetHistoryHighlights(
        `uniffiArg0`: Long,
        `uniffiArg1`: Double,
        `uniffiArg2`: Double,
        `uniffiArg3`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetHistoryMetadataBetween")
    @JvmStatic external fun methodPlacesPlacesConnectionGetHistoryMetadataBetween(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetHistoryMetadataSince")
    @JvmStatic external fun methodPlacesPlacesConnectionGetHistoryMetadataSince(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetLatestHistoryMetadataForUrl")
    @JvmStatic external fun methodPlacesPlacesConnectionGetLatestHistoryMetadataForUrl(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.places.uniffi.`HistoryMetadata`?
    @JvmName("methodPlacesPlacesConnectionGetMostRecentHistoryMetadata")
    @JvmStatic external fun methodPlacesPlacesConnectionGetMostRecentHistoryMetadata(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetMostRecentSearchEntriesInHistoryMetadata")
    @JvmStatic external fun methodPlacesPlacesConnectionGetMostRecentSearchEntriesInHistoryMetadata(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetTopFrecentSiteInfos")
    @JvmStatic external fun methodPlacesPlacesConnectionGetTopFrecentSiteInfos(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetVisitCount")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisitCount(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
    ) : Long
    @JvmName("methodPlacesPlacesConnectionGetVisitCountForHost")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisitCountForHost(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
        `uniffiArg3`: Int,
    ) : Long
    @JvmName("methodPlacesPlacesConnectionGetVisitInfos")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisitInfos(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Long,
        `uniffiArg3`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetVisitPage")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisitPage(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Long,
        `uniffiArg3`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetVisitPageWithBound")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisitPageWithBound(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Long,
        `uniffiArg3`: Long,
        `uniffiArg4`: Int,
    ) : mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound`
    @JvmName("methodPlacesPlacesConnectionGetVisited")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisited(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionGetVisitedUrlsInRange")
    @JvmStatic external fun methodPlacesPlacesConnectionGetVisitedUrlsInRange(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Long,
        `uniffiArg3`: Boolean,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionMatchUrl")
    @JvmStatic external fun methodPlacesPlacesConnectionMatchUrl(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.places.uniffi.`Url`?
    @JvmName("methodPlacesPlacesConnectionMetadataDelete")
    @JvmStatic external fun methodPlacesPlacesConnectionMetadataDelete(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
    )
    @JvmName("methodPlacesPlacesConnectionMetadataDeleteOlderThan")
    @JvmStatic external fun methodPlacesPlacesConnectionMetadataDeleteOlderThan(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionMetadataDeleteSearchTerms")
    @JvmStatic external fun methodPlacesPlacesConnectionMetadataDeleteSearchTerms(
        `uniffiArg0`: Long,
    )
    @JvmName("methodPlacesPlacesConnectionNewInterruptHandle")
    @JvmStatic external fun methodPlacesPlacesConnectionNewInterruptHandle(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodPlacesPlacesConnectionNoteHistoryMetadataObservation")
    @JvmStatic external fun methodPlacesPlacesConnectionNoteHistoryMetadataObservation(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: Int,
        `uniffiArg7`: String?,
        `uniffiArg8`: Int,
    )
    @JvmName("methodPlacesPlacesConnectionPlacesHistoryImportFromIos")
    @JvmStatic external fun methodPlacesPlacesConnectionPlacesHistoryImportFromIos(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
    ) : mozilla.appservices.places.uniffi.`HistoryMigrationResult`
    @JvmName("methodPlacesPlacesConnectionQueryAutocomplete")
    @JvmStatic external fun methodPlacesPlacesConnectionQueryAutocomplete(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionQueryHistoryMetadata")
    @JvmStatic external fun methodPlacesPlacesConnectionQueryHistoryMetadata(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodPlacesPlacesConnectionRunMaintenance")
    @JvmStatic external fun methodPlacesPlacesConnectionRunMaintenance(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: Int,
    )
    @JvmName("methodPlacesPlacesApiNewConnection")
    @JvmStatic external fun methodPlacesPlacesApiNewConnection(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
    ) : Long
    @JvmName("methodPlacesPlacesApiRegisterWithSyncManager")
    @JvmStatic external fun methodPlacesPlacesApiRegisterWithSyncManager(
        `uniffiArg0`: Long,
    )
    @JvmStatic external fun objectCloneHandle300(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree300(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle286(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree286(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle253(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree253(handle: kotlin.Long)
}