@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.suggest.uniffi
import uniffi.DeconstructedType137
import uniffi.DeconstructedType99
import mozilla.appservices.remotesettings.uniffi.DeconstructedType325



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



// Deconstructed version of AlternateNames
class DeconstructedType378(
    val v0: String?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType378")
fun lowerType378(rec: mozilla.appservices.suggest.`AlternateNames`): DeconstructedType378 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`primary`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`localized`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`abbreviation`)
    return DeconstructedType378(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType378")
fun liftType378(
    v0: String?,
    v1: String?,
    v2: String?,
): mozilla.appservices.suggest.`AlternateNames` {
    return mozilla.appservices.suggest.`AlternateNames`(
        liftString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
    )
}

fun writeType378(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`AlternateNames`) {
    writeString(buf, offset + 0, value.`primary`)
    writeType18(buf, offset + 24, value.`localized`)
    writeType18(buf, offset + 56, value.`abbreviation`)
}

fun readType378(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`AlternateNames` {
    return mozilla.appservices.suggest.`AlternateNames`(
        readString(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
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



// Deconstructed version of FtsMatchInfo
class DeconstructedType396(
    val v0: Boolean,
    val v1: Boolean,
)

@JvmName("lowerType396")
fun lowerType396(rec: mozilla.appservices.suggest.`FtsMatchInfo`): DeconstructedType396 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerBoolean(rec.`prefix`)
    val uniffiFieldLowered1 = lowerBoolean(rec.`stemming`)
    return DeconstructedType396(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType396")
fun liftType396(
    v0: Boolean,
    v1: Boolean,
): mozilla.appservices.suggest.`FtsMatchInfo` {
    return mozilla.appservices.suggest.`FtsMatchInfo`(
        liftBoolean(
            v0,
        ),
        liftBoolean(
            v1,
        ),
    )
}

fun writeType396(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`FtsMatchInfo`) {
    writeBoolean(buf, offset + 0, value.`prefix`)
    writeBoolean(buf, offset + 1, value.`stemming`)
}

fun readType396(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`FtsMatchInfo` {
    return mozilla.appservices.suggest.`FtsMatchInfo`(
        readBoolean(buf, offset + 0),
        readBoolean(buf, offset + 1),
    )
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



// Deconstructed version of GeonameType
class DeconstructedType376(
    val v0: Int,
    val v1: Byte,
)

@JvmName("lowerType376")
fun lowerType376(value: mozilla.appservices.suggest.`GeonameType`): DeconstructedType376 {
    when (value) {
        is mozilla.appservices.suggest.`GeonameType`.`Country` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType376(
                uniffiFieldLowered0,
                0.toByte(),
            )
        }
        is mozilla.appservices.suggest.`GeonameType`.`AdminDivision` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerUByte(value.`level`)
            return DeconstructedType376(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.suggest.`GeonameType`.`AdminDivisionOther` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            return DeconstructedType376(
                uniffiFieldLowered0,
                0.toByte(),
            )
        }
        is mozilla.appservices.suggest.`GeonameType`.`City` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType376(
                uniffiFieldLowered0,
                0.toByte(),
            )
        }
        is mozilla.appservices.suggest.`GeonameType`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            return DeconstructedType376(
                uniffiFieldLowered0,
                0.toByte(),
            )
        }
    }
}

@JvmName("liftType376")
fun liftType376(
    v0: Int,
    v1: Byte,
): mozilla.appservices.suggest.`GeonameType` {
    when (v0) {
        0 -> {
            return mozilla.appservices.suggest.`GeonameType`.`Country`
        }
        1 -> {
            return mozilla.appservices.suggest.`GeonameType`.`AdminDivision`(
                liftUByte(
                    v1,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.suggest.`GeonameType`.`AdminDivisionOther`
        }
        3 -> {
            return mozilla.appservices.suggest.`GeonameType`.`City`
        }
        4 -> {
            return mozilla.appservices.suggest.`GeonameType`.`Other`
        }
        else -> {
            throw uniffi.InternalException("liftType376: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType376(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`GeonameType`) {
    when (value) {
        is mozilla.appservices.suggest.`GeonameType`.`Country` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.suggest.`GeonameType`.`AdminDivision` -> {
            writeInt(buf, offset, 1);
            writeUByte(buf, offset + 4, value.`level`)
        }
        is mozilla.appservices.suggest.`GeonameType`.`AdminDivisionOther` -> {
            writeInt(buf, offset, 2);
        }
        is mozilla.appservices.suggest.`GeonameType`.`City` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.suggest.`GeonameType`.`Other` -> {
            writeInt(buf, offset, 4);
        }
    }
}

fun readType376(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`GeonameType` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.suggest.`GeonameType`.`Country`
        }
        1 -> {
            mozilla.appservices.suggest.`GeonameType`.`AdminDivision`(
                readUByte(buf, offset + 4),
            )
        }
        2 -> {
            mozilla.appservices.suggest.`GeonameType`.`AdminDivisionOther`
        }
        3 -> {
            mozilla.appservices.suggest.`GeonameType`.`City`
        }
        4 -> {
            mozilla.appservices.suggest.`GeonameType`.`Other`
        }
        else -> {
            throw uniffi.InternalException("liftType376: Invalid enum discriminant: ${discriminant}")
        }
    }
}



@JvmName("lowerType377")
inline fun lowerType377(value: kotlin.collections.Map<kotlin.UByte, kotlin.String>): java.nio.ByteBuffer? {
    return uniffi.lowerType377(value)
}

@JvmName("liftType377")
inline fun liftType377(
    v1: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.UByte, kotlin.String> {
    return uniffi.liftType377(
        v1
    )
}

inline fun writeType377(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.UByte, kotlin.String>) {
    uniffi.writeType377(buf, offset, value)
}

inline fun readType377(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.UByte, kotlin.String> {
    return uniffi.readType377(buf, offset)
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



// Deconstructed version of Geoname
class DeconstructedType381(
    val v0: Long,
    val v1: Int,
    val v2: Byte,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: java.nio.ByteBuffer?,
    val v8: Long,
    val v9: String?,
    val v10: String?,
)

@JvmName("lowerType381")
fun lowerType381(rec: mozilla.appservices.suggest.`Geoname`): DeconstructedType381 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerLong(rec.`geonameId`)
    val uniffiFieldLowered1 = lowerType376(rec.`geonameType`)
    val uniffiFieldLowered2 = lowerString(rec.`name`)
    val uniffiFieldLowered3 = lowerString(rec.`countryCode`)
    val uniffiFieldLowered4 = lowerString(rec.`featureClass`)
    val uniffiFieldLowered5 = lowerString(rec.`featureCode`)
    val uniffiFieldLowered6 = lowerType377(rec.`adminDivisionCodes`)
    val uniffiFieldLowered7 = lowerULong(rec.`population`)
    val uniffiFieldLowered8 = lowerString(rec.`latitude`)
    val uniffiFieldLowered9 = lowerString(rec.`longitude`)
    return DeconstructedType381(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9,
    )
}

@JvmName("liftType381")
fun liftType381(
    v0: Long,
    v1: Int,
    v2: Byte,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: java.nio.ByteBuffer?,
    v8: Long,
    v9: String?,
    v10: String?,
): mozilla.appservices.suggest.`Geoname` {
    return mozilla.appservices.suggest.`Geoname`(
        liftLong(
            v0,
        ),
        liftType376(
            v1,
            v2,
        ),
        liftString(
            v3,
        ),
        liftString(
            v4,
        ),
        liftString(
            v5,
        ),
        liftString(
            v6,
        ),
        liftType377(
            v7,
        ),
        liftULong(
            v8,
        ),
        liftString(
            v9,
        ),
        liftString(
            v10,
        ),
    )
}

fun writeType381(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`Geoname`) {
    writeLong(buf, offset + 0, value.`geonameId`)
    writeType376(buf, offset + 8, value.`geonameType`)
    writeString(buf, offset + 16, value.`name`)
    writeString(buf, offset + 40, value.`countryCode`)
    writeString(buf, offset + 64, value.`featureClass`)
    writeString(buf, offset + 88, value.`featureCode`)
    writeType377(buf, offset + 112, value.`adminDivisionCodes`)
    writeULong(buf, offset + 128, value.`population`)
    writeString(buf, offset + 136, value.`latitude`)
    writeString(buf, offset + 160, value.`longitude`)
}

fun readType381(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`Geoname` {
    return mozilla.appservices.suggest.`Geoname`(
        readLong(buf, offset + 0),
        readType376(buf, offset + 8),
        readString(buf, offset + 16),
        readString(buf, offset + 40),
        readString(buf, offset + 64),
        readString(buf, offset + 88),
        readType377(buf, offset + 112),
        readULong(buf, offset + 128),
        readString(buf, offset + 136),
        readString(buf, offset + 160),
    )
}


// Deconstructed version of mozilla.appservices.suggest.`AlternateNames`?
class DeconstructedType379(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType379")
fun lowerType379(value: mozilla.appservices.suggest.`AlternateNames`?): DeconstructedType379 {
    if (value == null) {
        return DeconstructedType379(
            false,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType378(value)
        return DeconstructedType379(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
        )
    }
}

@JvmName("liftType379")
fun liftType379(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
): mozilla.appservices.suggest.`AlternateNames`? {
    if (v0) {
        return liftType378(
            v1,
            v2,
            v3,
        )
    } else {
        return null
    }
}

fun writeType379(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`AlternateNames`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType378(buf, offset + 8, value)
    }
}
fun readType379(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`AlternateNames`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType378(buf, offset + 8)
    }
}


@JvmName("lowerType380")
fun lowerType380(value: kotlin.collections.Map<kotlin.UByte, mozilla.appservices.suggest.`AlternateNames`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 96).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeUByte(buf, offset, it.key)
        writeType378(buf, offset + 8, it.value)
        offset += 96
    }
    return buf
}

@JvmName("liftType380")
fun liftType380(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.UByte, mozilla.appservices.suggest.`AlternateNames`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 96
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readUByte(buf, offset),
                    readType378(buf, offset + 8),
                )
                offset += 96
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType380(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.UByte, mozilla.appservices.suggest.`AlternateNames`>) {
    val childBuf = lowerType380(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType380(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.UByte, mozilla.appservices.suggest.`AlternateNames`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType380(childBuf)
}

// Deconstructed version of GeonameAlternates
class DeconstructedType402(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Boolean,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: java.nio.ByteBuffer?,
)

@JvmName("lowerType402")
fun lowerType402(rec: mozilla.appservices.suggest.`GeonameAlternates`): DeconstructedType402 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType378(rec.`geoname`)
    val uniffiFieldLowered1 = lowerType379(rec.`country`)
    val uniffiFieldLowered2 = lowerType380(rec.`adminDivisions`)
    return DeconstructedType402(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType402")
fun liftType402(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Boolean,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: java.nio.ByteBuffer?,
): mozilla.appservices.suggest.`GeonameAlternates` {
    return mozilla.appservices.suggest.`GeonameAlternates`(
        liftType378(
            v0,
            v1,
            v2,
        ),
        liftType379(
            v3,
            v4,
            v5,
            v6,
        ),
        liftType380(
            v7,
        ),
    )
}

fun writeType402(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`GeonameAlternates`) {
    writeType378(buf, offset + 0, value.`geoname`)
    writeType379(buf, offset + 88, value.`country`)
    writeType380(buf, offset + 184, value.`adminDivisions`)
}

fun readType402(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`GeonameAlternates` {
    return mozilla.appservices.suggest.`GeonameAlternates`(
        readType378(buf, offset + 0),
        readType379(buf, offset + 88),
        readType380(buf, offset + 184),
    )
}

@JvmName("lowerType382")
fun lowerType382(value: mozilla.appservices.suggest.`GeonameMatchType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType382")
fun liftType382(value: kotlin.Int): mozilla.appservices.suggest.`GeonameMatchType` {
    return mozilla.appservices.suggest.`GeonameMatchType`.values()[value]
}

fun writeType382(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`GeonameMatchType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType382(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`GeonameMatchType` {
    return liftType382(readInt(buf, offset))
}

// Deconstructed version of GeonameMatch
class DeconstructedType406(
    val v0: Long,
    val v1: Int,
    val v2: Byte,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: java.nio.ByteBuffer?,
    val v8: Long,
    val v9: String?,
    val v10: String?,
    val v11: Int,
    val v12: Boolean,
)

@JvmName("lowerType406")
fun lowerType406(rec: mozilla.appservices.suggest.`GeonameMatch`): DeconstructedType406 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType381(rec.`geoname`)
    val uniffiFieldLowered1 = lowerType382(rec.`matchType`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`prefix`)
    return DeconstructedType406(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered0.v3,
        uniffiFieldLowered0.v4,
        uniffiFieldLowered0.v5,
        uniffiFieldLowered0.v6,
        uniffiFieldLowered0.v7,
        uniffiFieldLowered0.v8,
        uniffiFieldLowered0.v9,
        uniffiFieldLowered0.v10,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType406")
fun liftType406(
    v0: Long,
    v1: Int,
    v2: Byte,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: java.nio.ByteBuffer?,
    v8: Long,
    v9: String?,
    v10: String?,
    v11: Int,
    v12: Boolean,
): mozilla.appservices.suggest.`GeonameMatch` {
    return mozilla.appservices.suggest.`GeonameMatch`(
        liftType381(
            v0,
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
        ),
        liftType382(
            v11,
        ),
        liftBoolean(
            v12,
        ),
    )
}

fun writeType406(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`GeonameMatch`) {
    writeType381(buf, offset + 0, value.`geoname`)
    writeType382(buf, offset + 184, value.`matchType`)
    writeBoolean(buf, offset + 188, value.`prefix`)
}

fun readType406(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`GeonameMatch` {
    return mozilla.appservices.suggest.`GeonameMatch`(
        readType381(buf, offset + 0),
        readType382(buf, offset + 184),
        readBoolean(buf, offset + 188),
    )
}

// Deconstructed version of LabeledTimingSample
class DeconstructedType386(
    val v0: String?,
    val v1: Long,
)

@JvmName("lowerType386")
fun lowerType386(rec: mozilla.appservices.suggest.`LabeledTimingSample`): DeconstructedType386 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`label`)
    val uniffiFieldLowered1 = lowerULong(rec.`value`)
    return DeconstructedType386(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType386")
fun liftType386(
    v0: String?,
    v1: Long,
): mozilla.appservices.suggest.`LabeledTimingSample` {
    return mozilla.appservices.suggest.`LabeledTimingSample`(
        liftString(
            v0,
        ),
        liftULong(
            v1,
        ),
    )
}

fun writeType386(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`LabeledTimingSample`) {
    writeString(buf, offset + 0, value.`label`)
    writeULong(buf, offset + 24, value.`value`)
}

fun readType386(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`LabeledTimingSample` {
    return mozilla.appservices.suggest.`LabeledTimingSample`(
        readString(buf, offset + 0),
        readULong(buf, offset + 24),
    )
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





@JvmName("lowerType137")
inline fun lowerType137(value: kotlin.ByteArray?): DeconstructedType137 {
    return uniffi.lowerType137(value)
}

@JvmName("liftType137")
inline fun liftType137(
    v1: Boolean,
    v2: kotlin.ByteArray?
): kotlin.ByteArray? {
    return uniffi.liftType137(
        v1,
        v2
    )
}

inline fun writeType137(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.ByteArray?) {
    uniffi.writeType137(buf, offset, value)
}

inline fun readType137(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.ByteArray? {
    return uniffi.readType137(buf, offset)
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





@JvmName("lowerVecInt")
inline fun lowerVecInt(value: kotlin.collections.List<kotlin.Int>): kotlin.IntArray? {
    return uniffi.lowerVecInt(value)
}

@JvmName("liftVecInt")
inline fun liftVecInt(
    v1: kotlin.IntArray?
): kotlin.collections.List<kotlin.Int> {
    return uniffi.liftVecInt(
        v1
    )
}

inline fun writeType394(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<kotlin.Int>) {
    uniffi.writeType394(buf, offset, value)
}

inline fun readType394(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<kotlin.Int> {
    return uniffi.readType394(buf, offset)
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




// Deconstructed version of mozilla.appservices.suggest.`FtsMatchInfo`?
class DeconstructedType395(
    val v0: Boolean,
    val v1: Boolean,
    val v2: Boolean,
)

@JvmName("lowerType395")
fun lowerType395(value: mozilla.appservices.suggest.`FtsMatchInfo`?): DeconstructedType395 {
    if (value == null) {
        return DeconstructedType395(
            false,
            false,
            false,
        )
    } else {
        val uniffiFieldLowered = lowerType396(value)
        return DeconstructedType395(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
        )
    }
}

@JvmName("liftType395")
fun liftType395(
    v0: Boolean,
    v1: Boolean,
    v2: Boolean,
): mozilla.appservices.suggest.`FtsMatchInfo`? {
    if (v0) {
        return liftType396(
            v1,
            v2,
        )
    } else {
        return null
    }
}

fun writeType395(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`FtsMatchInfo`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType396(buf, offset + 1, value)
    }
}
fun readType395(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`FtsMatchInfo`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType396(buf, offset + 1)
    }
}

@JvmName("lowerType397")
fun lowerType397(value: mozilla.appservices.suggest.`YelpSubjectType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType397")
fun liftType397(value: kotlin.Int): mozilla.appservices.suggest.`YelpSubjectType` {
    return mozilla.appservices.suggest.`YelpSubjectType`.values()[value]
}

fun writeType397(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`YelpSubjectType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType397(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`YelpSubjectType` {
    return liftType397(readInt(buf, offset))
}


// Deconstructed version of mozilla.appservices.suggest.`Geoname`?
class DeconstructedType398(
    val v0: Boolean,
    val v1: Long,
    val v2: Int,
    val v3: Byte,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: java.nio.ByteBuffer?,
    val v9: Long,
    val v10: String?,
    val v11: String?,
)

@JvmName("lowerType398")
fun lowerType398(value: mozilla.appservices.suggest.`Geoname`?): DeconstructedType398 {
    if (value == null) {
        return DeconstructedType398(
            false,
            0L,
            0,
            0.toByte(),
            null,
            null,
            null,
            null,
            null,
            0L,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType381(value)
        return DeconstructedType398(
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

@JvmName("liftType398")
fun liftType398(
    v0: Boolean,
    v1: Long,
    v2: Int,
    v3: Byte,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: java.nio.ByteBuffer?,
    v9: Long,
    v10: String?,
    v11: String?,
): mozilla.appservices.suggest.`Geoname`? {
    if (v0) {
        return liftType381(
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

fun writeType398(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`Geoname`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType381(buf, offset + 8, value)
    }
}
fun readType398(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`Geoname`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType381(buf, offset + 8)
    }
}


@JvmName("lowerType400")
fun lowerType400(value: mozilla.appservices.suggest.`JsonValue`): String? {
    return lowerString(value)
}

@JvmName("liftType400")
fun liftType400(
    v0: String?,
): mozilla.appservices.suggest.`JsonValue` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType400(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`JsonValue`) {
    writeString(buf, offset, value)
}

fun readType400(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`JsonValue` {
    val builtinValue = readString(buf, offset)
    return builtinValue
}


// Deconstructed version of mozilla.appservices.suggest.`JsonValue`?
class DeconstructedType399(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType399")
fun lowerType399(value: mozilla.appservices.suggest.`JsonValue`?): DeconstructedType399 {
    if (value == null) {
        return DeconstructedType399(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType400(value)
        return DeconstructedType399(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType399")
fun liftType399(
    v0: Boolean,
    v1: String?,
): mozilla.appservices.suggest.`JsonValue`? {
    if (v0) {
        return liftType400(
            v1,
        )
    } else {
        return null
    }
}

fun writeType399(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`JsonValue`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType400(buf, offset + 8, value)
    }
}
fun readType399(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`JsonValue`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType400(buf, offset + 8)
    }
}

// Deconstructed version of Suggestion
class DeconstructedType384(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: Boolean,
    val v5: kotlin.ByteArray?,
    val v6: String?,
    val v7: String?,
    val v8: Long,
    val v9: String?,
    val v10: String?,
    val v11: kotlin.IntArray?,
    val v12: String?,
    val v13: String?,
    val v14: String?,
    val v15: Double,
    val v16: Boolean,
    val v17: Boolean,
    val v18: Boolean,
    val v19: String?,
    val v20: String?,
    val v21: String?,
    val v22: String?,
    val v23: String?,
    val v24: String?,
    val v25: String?,
    val v26: String?,
    val v27: String?,
    val v28: String?,
    val v29: String?,
    val v30: Boolean,
    val v31: Boolean,
    val v32: Int,
    val v33: String?,
    val v34: String?,
    val v35: String?,
    val v36: Byte,
    val v37: String?,
    val v38: String?,
    val v39: String?,
    val v40: java.nio.ByteBuffer?,
    val v41: Long,
    val v42: String?,
    val v43: String?,
    val v44: String?,
    val v45: String?,
)

@JvmName("lowerType384")
fun lowerType384(value: mozilla.appservices.suggest.`Suggestion`): DeconstructedType384 {
    when (value) {
        is mozilla.appservices.suggest.`Suggestion`.`Amp` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`title`)
            val uniffiFieldLowered45 = lowerString(value.`url`)
            val uniffiFieldLowered44 = lowerString(value.`rawUrl`)
            val uniffiFieldDeconstructed3 = lowerType137(value.`icon`)
            val uniffiFieldLowered4 = uniffiFieldDeconstructed3.v0
            val uniffiFieldLowered5 = uniffiFieldDeconstructed3.v1
            val uniffiFieldLowered43 = lowerOptionString(value.`iconMimetype`)
            val uniffiFieldLowered2 = lowerString(value.`fullKeyword`)
            val uniffiFieldLowered41 = lowerLong(value.`blockId`)
            val uniffiFieldLowered39 = lowerString(value.`advertiser`)
            val uniffiFieldLowered37 = lowerString(value.`iabCategory`)
            val uniffiFieldLowered11 = lowerVecInt(value.`categories`)
            val uniffiFieldLowered3 = lowerString(value.`impressionUrl`)
            val uniffiFieldLowered34 = lowerString(value.`clickUrl`)
            val uniffiFieldLowered33 = lowerString(value.`rawClickUrl`)
            val uniffiFieldLowered15 = lowerDouble(value.`score`)
            val uniffiFieldDeconstructed14 = lowerType395(value.`ftsMatchInfo`)
            val uniffiFieldLowered31 = uniffiFieldDeconstructed14.v0
            val uniffiFieldLowered30 = uniffiFieldDeconstructed14.v1
            val uniffiFieldLowered16 = uniffiFieldDeconstructed14.v2
            val uniffiFieldLowered42 = lowerString(value.`suggestionId`)
            return DeconstructedType384(
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
                null,
                uniffiFieldLowered11,
                null,
                null,
                null,
                uniffiFieldLowered15,
                uniffiFieldLowered16,
                false,
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
                null,
                null,
                uniffiFieldLowered30,
                uniffiFieldLowered31,
                0,
                uniffiFieldLowered33,
                uniffiFieldLowered34,
                null,
                0.toByte(),
                uniffiFieldLowered37,
                null,
                uniffiFieldLowered39,
                null,
                uniffiFieldLowered41,
                uniffiFieldLowered42,
                uniffiFieldLowered43,
                uniffiFieldLowered44,
                uniffiFieldLowered45,
            )
        }
        is mozilla.appservices.suggest.`Suggestion`.`Wikipedia` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`title`)
            val uniffiFieldLowered45 = lowerString(value.`url`)
            val uniffiFieldDeconstructed2 = lowerType137(value.`icon`)
            val uniffiFieldLowered4 = uniffiFieldDeconstructed2.v0
            val uniffiFieldLowered5 = uniffiFieldDeconstructed2.v1
            val uniffiFieldLowered44 = lowerOptionString(value.`iconMimetype`)
            val uniffiFieldLowered2 = lowerString(value.`fullKeyword`)
            return DeconstructedType384(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                null,
                uniffiFieldLowered4,
                uniffiFieldLowered5,
                null,
                null,
                0L,
                null,
                null,
                null,
                null,
                null,
                null,
                0.0,
                false,
                false,
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
                null,
                null,
                false,
                false,
                0,
                null,
                null,
                null,
                0.toByte(),
                null,
                null,
                null,
                null,
                0L,
                null,
                null,
                uniffiFieldLowered44,
                uniffiFieldLowered45,
            )
        }
        is mozilla.appservices.suggest.`Suggestion`.`Amo` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`title`)
            val uniffiFieldLowered45 = lowerString(value.`url`)
            val uniffiFieldLowered44 = lowerString(value.`iconUrl`)
            val uniffiFieldLowered43 = lowerString(value.`description`)
            val uniffiFieldLowered42 = lowerOptionString(value.`rating`)
            val uniffiFieldLowered41 = lowerLong(value.`numberOfRatings`)
            val uniffiFieldLowered2 = lowerString(value.`guid`)
            val uniffiFieldLowered15 = lowerDouble(value.`score`)
            return DeconstructedType384(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                null,
                false,
                null,
                null,
                null,
                0L,
                null,
                null,
                null,
                null,
                null,
                null,
                uniffiFieldLowered15,
                false,
                false,
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
                null,
                null,
                false,
                false,
                0,
                null,
                null,
                null,
                0.toByte(),
                null,
                null,
                null,
                null,
                uniffiFieldLowered41,
                uniffiFieldLowered42,
                uniffiFieldLowered43,
                uniffiFieldLowered44,
                uniffiFieldLowered45,
            )
        }
        is mozilla.appservices.suggest.`Suggestion`.`Yelp` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            val uniffiFieldLowered1 = lowerString(value.`url`)
            val uniffiFieldLowered45 = lowerString(value.`title`)
            val uniffiFieldDeconstructed2 = lowerType137(value.`icon`)
            val uniffiFieldLowered4 = uniffiFieldDeconstructed2.v0
            val uniffiFieldLowered5 = uniffiFieldDeconstructed2.v1
            val uniffiFieldLowered44 = lowerOptionString(value.`iconMimetype`)
            val uniffiFieldLowered15 = lowerDouble(value.`score`)
            val uniffiFieldLowered16 = lowerBoolean(value.`hasLocationSign`)
            val uniffiFieldLowered17 = lowerBoolean(value.`subjectExactMatch`)
            val uniffiFieldLowered32 = lowerType397(value.`subjectType`)
            val uniffiFieldLowered2 = lowerString(value.`locationParam`)
            return DeconstructedType384(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                null,
                uniffiFieldLowered4,
                uniffiFieldLowered5,
                null,
                null,
                0L,
                null,
                null,
                null,
                null,
                null,
                null,
                uniffiFieldLowered15,
                uniffiFieldLowered16,
                uniffiFieldLowered17,
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
                null,
                null,
                false,
                false,
                uniffiFieldLowered32,
                null,
                null,
                null,
                0.toByte(),
                null,
                null,
                null,
                null,
                0L,
                null,
                null,
                uniffiFieldLowered44,
                uniffiFieldLowered45,
            )
        }
        is mozilla.appservices.suggest.`Suggestion`.`Mdn` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            val uniffiFieldLowered1 = lowerString(value.`title`)
            val uniffiFieldLowered45 = lowerString(value.`url`)
            val uniffiFieldLowered44 = lowerString(value.`description`)
            val uniffiFieldLowered15 = lowerDouble(value.`score`)
            return DeconstructedType384(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                null,
                null,
                false,
                null,
                null,
                null,
                0L,
                null,
                null,
                null,
                null,
                null,
                null,
                uniffiFieldLowered15,
                false,
                false,
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
                null,
                null,
                false,
                false,
                0,
                null,
                null,
                null,
                0.toByte(),
                null,
                null,
                null,
                null,
                0L,
                null,
                null,
                uniffiFieldLowered44,
                uniffiFieldLowered45,
            )
        }
        is mozilla.appservices.suggest.`Suggestion`.`Weather` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            val uniffiFieldDeconstructed0 = lowerType398(value.`city`)
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered8 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered32 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered36 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered39 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered40 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered41 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered42 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered35 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered15 = lowerDouble(value.`score`)
            return DeconstructedType384(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                null,
                null,
                null,
                uniffiFieldLowered8,
                null,
                null,
                null,
                null,
                null,
                null,
                uniffiFieldLowered15,
                false,
                false,
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
                null,
                null,
                false,
                false,
                uniffiFieldLowered32,
                null,
                null,
                uniffiFieldLowered35,
                uniffiFieldLowered36,
                null,
                null,
                uniffiFieldLowered39,
                uniffiFieldLowered40,
                uniffiFieldLowered41,
                uniffiFieldLowered42,
                null,
                null,
                null,
            )
        }
        is mozilla.appservices.suggest.`Suggestion`.`Dynamic` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 6
            val uniffiFieldLowered1 = lowerString(value.`suggestionType`)
            val uniffiFieldDeconstructed1 = lowerType399(value.`data`)
            val uniffiFieldLowered4 = uniffiFieldDeconstructed1.v0
            val uniffiFieldLowered45 = uniffiFieldDeconstructed1.v1
            val uniffiFieldLowered43 = lowerOptionString(value.`dismissalKey`)
            val uniffiFieldLowered15 = lowerDouble(value.`score`)
            return DeconstructedType384(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                null,
                null,
                uniffiFieldLowered4,
                null,
                null,
                null,
                0L,
                null,
                null,
                null,
                null,
                null,
                null,
                uniffiFieldLowered15,
                false,
                false,
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
                null,
                null,
                false,
                false,
                0,
                null,
                null,
                null,
                0.toByte(),
                null,
                null,
                null,
                null,
                0L,
                null,
                uniffiFieldLowered43,
                null,
                uniffiFieldLowered45,
            )
        }
    }
}

@JvmName("liftType384")
fun liftType384(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: Boolean,
    v5: kotlin.ByteArray?,
    v6: String?,
    v7: String?,
    v8: Long,
    v9: String?,
    v10: String?,
    v11: kotlin.IntArray?,
    v12: String?,
    v13: String?,
    v14: String?,
    v15: Double,
    v16: Boolean,
    v17: Boolean,
    v18: Boolean,
    v19: String?,
    v20: String?,
    v21: String?,
    v22: String?,
    v23: String?,
    v24: String?,
    v25: String?,
    v26: String?,
    v27: String?,
    v28: String?,
    v29: String?,
    v30: Boolean,
    v31: Boolean,
    v32: Int,
    v33: String?,
    v34: String?,
    v35: String?,
    v36: Byte,
    v37: String?,
    v38: String?,
    v39: String?,
    v40: java.nio.ByteBuffer?,
    v41: Long,
    v42: String?,
    v43: String?,
    v44: String?,
    v45: String?,
): mozilla.appservices.suggest.`Suggestion` {
    when (v0) {
        0 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Amp`(
                liftString(
                    v1,
                ),
                liftString(
                    v45,
                ),
                liftString(
                    v44,
                ),
                liftType137(
                    v4,
                    v5,
                ),
                liftOptionString(
                    v43,
                ),
                liftString(
                    v2,
                ),
                liftLong(
                    v41,
                ),
                liftString(
                    v39,
                ),
                liftString(
                    v37,
                ),
                liftVecInt(
                    v11,
                ),
                liftString(
                    v3,
                ),
                liftString(
                    v34,
                ),
                liftString(
                    v33,
                ),
                liftDouble(
                    v15,
                ),
                liftType395(
                    v31,
                    v30,
                    v16,
                ),
                liftString(
                    v42,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Wikipedia`(
                liftString(
                    v1,
                ),
                liftString(
                    v45,
                ),
                liftType137(
                    v4,
                    v5,
                ),
                liftOptionString(
                    v44,
                ),
                liftString(
                    v2,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Amo`(
                liftString(
                    v1,
                ),
                liftString(
                    v45,
                ),
                liftString(
                    v44,
                ),
                liftString(
                    v43,
                ),
                liftOptionString(
                    v42,
                ),
                liftLong(
                    v41,
                ),
                liftString(
                    v2,
                ),
                liftDouble(
                    v15,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Yelp`(
                liftString(
                    v1,
                ),
                liftString(
                    v45,
                ),
                liftType137(
                    v4,
                    v5,
                ),
                liftOptionString(
                    v44,
                ),
                liftDouble(
                    v15,
                ),
                liftBoolean(
                    v16,
                ),
                liftBoolean(
                    v17,
                ),
                liftType397(
                    v32,
                ),
                liftString(
                    v2,
                ),
            )
        }
        4 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Mdn`(
                liftString(
                    v1,
                ),
                liftString(
                    v45,
                ),
                liftString(
                    v44,
                ),
                liftDouble(
                    v15,
                ),
            )
        }
        5 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Weather`(
                liftType398(
                    v4,
                    v8,
                    v32,
                    v36,
                    v1,
                    v2,
                    v3,
                    v39,
                    v40,
                    v41,
                    v42,
                    v35,
                ),
                liftDouble(
                    v15,
                ),
            )
        }
        6 -> {
            return mozilla.appservices.suggest.`Suggestion`.`Dynamic`(
                liftString(
                    v1,
                ),
                liftType399(
                    v4,
                    v45,
                ),
                liftOptionString(
                    v43,
                ),
                liftDouble(
                    v15,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType384: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType384(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`Suggestion`) {
    when (value) {
        is mozilla.appservices.suggest.`Suggestion`.`Amp` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`title`)
            writeString(buf, offset + 32, value.`url`)
            writeString(buf, offset + 56, value.`rawUrl`)
            writeType137(buf, offset + 80, value.`icon`)
            writeType18(buf, offset + 112, value.`iconMimetype`)
            writeString(buf, offset + 144, value.`fullKeyword`)
            writeLong(buf, offset + 168, value.`blockId`)
            writeString(buf, offset + 176, value.`advertiser`)
            writeString(buf, offset + 200, value.`iabCategory`)
            writeType394(buf, offset + 224, value.`categories`)
            writeString(buf, offset + 240, value.`impressionUrl`)
            writeString(buf, offset + 264, value.`clickUrl`)
            writeString(buf, offset + 288, value.`rawClickUrl`)
            writeDouble(buf, offset + 312, value.`score`)
            writeType395(buf, offset + 320, value.`ftsMatchInfo`)
            writeString(buf, offset + 328, value.`suggestionId`)
        }
        is mozilla.appservices.suggest.`Suggestion`.`Wikipedia` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`title`)
            writeString(buf, offset + 32, value.`url`)
            writeType137(buf, offset + 56, value.`icon`)
            writeType18(buf, offset + 88, value.`iconMimetype`)
            writeString(buf, offset + 120, value.`fullKeyword`)
        }
        is mozilla.appservices.suggest.`Suggestion`.`Amo` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`title`)
            writeString(buf, offset + 32, value.`url`)
            writeString(buf, offset + 56, value.`iconUrl`)
            writeString(buf, offset + 80, value.`description`)
            writeType18(buf, offset + 104, value.`rating`)
            writeLong(buf, offset + 136, value.`numberOfRatings`)
            writeString(buf, offset + 144, value.`guid`)
            writeDouble(buf, offset + 168, value.`score`)
        }
        is mozilla.appservices.suggest.`Suggestion`.`Yelp` -> {
            writeInt(buf, offset, 3);
            writeString(buf, offset + 8, value.`url`)
            writeString(buf, offset + 32, value.`title`)
            writeType137(buf, offset + 56, value.`icon`)
            writeType18(buf, offset + 88, value.`iconMimetype`)
            writeDouble(buf, offset + 120, value.`score`)
            writeBoolean(buf, offset + 128, value.`hasLocationSign`)
            writeBoolean(buf, offset + 129, value.`subjectExactMatch`)
            writeType397(buf, offset + 132, value.`subjectType`)
            writeString(buf, offset + 136, value.`locationParam`)
        }
        is mozilla.appservices.suggest.`Suggestion`.`Mdn` -> {
            writeInt(buf, offset, 4);
            writeString(buf, offset + 8, value.`title`)
            writeString(buf, offset + 32, value.`url`)
            writeString(buf, offset + 56, value.`description`)
            writeDouble(buf, offset + 80, value.`score`)
        }
        is mozilla.appservices.suggest.`Suggestion`.`Weather` -> {
            writeInt(buf, offset, 5);
            writeType398(buf, offset + 8, value.`city`)
            writeDouble(buf, offset + 200, value.`score`)
        }
        is mozilla.appservices.suggest.`Suggestion`.`Dynamic` -> {
            writeInt(buf, offset, 6);
            writeString(buf, offset + 8, value.`suggestionType`)
            writeType399(buf, offset + 32, value.`data`)
            writeType18(buf, offset + 64, value.`dismissalKey`)
            writeDouble(buf, offset + 96, value.`score`)
        }
    }
}

fun readType384(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`Suggestion` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.suggest.`Suggestion`.`Amp`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
                readString(buf, offset + 56),
                readType137(buf, offset + 80),
                readType18(buf, offset + 112),
                readString(buf, offset + 144),
                readLong(buf, offset + 168),
                readString(buf, offset + 176),
                readString(buf, offset + 200),
                readType394(buf, offset + 224),
                readString(buf, offset + 240),
                readString(buf, offset + 264),
                readString(buf, offset + 288),
                readDouble(buf, offset + 312),
                readType395(buf, offset + 320),
                readString(buf, offset + 328),
            )
        }
        1 -> {
            mozilla.appservices.suggest.`Suggestion`.`Wikipedia`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
                readType137(buf, offset + 56),
                readType18(buf, offset + 88),
                readString(buf, offset + 120),
            )
        }
        2 -> {
            mozilla.appservices.suggest.`Suggestion`.`Amo`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
                readString(buf, offset + 56),
                readString(buf, offset + 80),
                readType18(buf, offset + 104),
                readLong(buf, offset + 136),
                readString(buf, offset + 144),
                readDouble(buf, offset + 168),
            )
        }
        3 -> {
            mozilla.appservices.suggest.`Suggestion`.`Yelp`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
                readType137(buf, offset + 56),
                readType18(buf, offset + 88),
                readDouble(buf, offset + 120),
                readBoolean(buf, offset + 128),
                readBoolean(buf, offset + 129),
                readType397(buf, offset + 132),
                readString(buf, offset + 136),
            )
        }
        4 -> {
            mozilla.appservices.suggest.`Suggestion`.`Mdn`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
                readString(buf, offset + 56),
                readDouble(buf, offset + 80),
            )
        }
        5 -> {
            mozilla.appservices.suggest.`Suggestion`.`Weather`(
                readType398(buf, offset + 8),
                readDouble(buf, offset + 200),
            )
        }
        6 -> {
            mozilla.appservices.suggest.`Suggestion`.`Dynamic`(
                readString(buf, offset + 8),
                readType399(buf, offset + 32),
                readType18(buf, offset + 64),
                readDouble(buf, offset + 96),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType384: Invalid enum discriminant: ${discriminant}")
        }
    }
}


fun lowerToBuffer383(value: kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 352).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType384(buf, offset, it)
        offset += 352
    }
    return buf
}

fun liftFromBuffer383(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 352
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType384(buf, offset))
                offset += 352
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType383")
fun lowerType383(value: kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`>): java.nio.ByteBuffer {
    return lowerToBuffer383(value)
}

@JvmName("liftType383")
fun liftType383(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`> {
    return liftFromBuffer383(buf)
}

fun writeType383(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`>) {
    val childBuf = lowerToBuffer383(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType383(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer383(childBuf)
}


fun lowerToBuffer385(value: kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType386(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer385(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType386(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType385")
fun lowerType385(value: kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`>): java.nio.ByteBuffer {
    return lowerToBuffer385(value)
}

@JvmName("liftType385")
fun liftType385(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`> {
    return liftFromBuffer385(buf)
}

fun writeType385(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`>) {
    val childBuf = lowerToBuffer385(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType385(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer385(childBuf)
}

// Deconstructed version of QueryWithMetricsResult
class DeconstructedType415(
    val v0: java.nio.ByteBuffer?,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType415")
fun lowerType415(rec: mozilla.appservices.suggest.`QueryWithMetricsResult`): DeconstructedType415 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType383(rec.`suggestions`)
    val uniffiFieldLowered1 = lowerType385(rec.`queryTimes`)
    return DeconstructedType415(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType415")
fun liftType415(
    v0: java.nio.ByteBuffer?,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.suggest.`QueryWithMetricsResult` {
    return mozilla.appservices.suggest.`QueryWithMetricsResult`(
        liftType383(
            v0,
        ),
        liftType385(
            v1,
        ),
    )
}

fun writeType415(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`QueryWithMetricsResult`) {
    writeType383(buf, offset + 0, value.`suggestions`)
    writeType385(buf, offset + 16, value.`queryTimes`)
}

fun readType415(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`QueryWithMetricsResult` {
    return mozilla.appservices.suggest.`QueryWithMetricsResult`(
        readType383(buf, offset + 0),
        readType385(buf, offset + 16),
    )
}


@JvmName("lowerType407")
fun lowerType407(rec: mozilla.appservices.suggest.`SuggestGlobalConfig`): Int {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerInt(rec.`showLessFrequentlyCap`)
    return uniffiFieldLowered0
}

@JvmName("liftType407")
fun liftType407(
    v0: Int,
): mozilla.appservices.suggest.`SuggestGlobalConfig` {
    return mozilla.appservices.suggest.`SuggestGlobalConfig`(
        liftInt(
            v0,
        ),
    )
}

fun writeType407(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestGlobalConfig`) {
    writeInt(buf, offset + 0, value.`showLessFrequentlyCap`)
}

fun readType407(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestGlobalConfig` {
    return mozilla.appservices.suggest.`SuggestGlobalConfig`(
        readInt(buf, offset + 0),
    )
}

@JvmName("lowerType389")
fun lowerType389(value: mozilla.appservices.suggest.`SuggestionProvider`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType389")
fun liftType389(value: kotlin.Int): mozilla.appservices.suggest.`SuggestionProvider` {
    return mozilla.appservices.suggest.`SuggestionProvider`.values()[value]
}

fun writeType389(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestionProvider`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType389(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestionProvider` {
    return liftType389(readInt(buf, offset))
}


fun lowerToBuffer388(value: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 4).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType389(buf, offset, it)
        offset += 4
    }
    return buf
}

fun liftFromBuffer388(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 4
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType389(buf, offset))
                offset += 4
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType388")
fun lowerType388(value: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>): java.nio.ByteBuffer {
    return lowerToBuffer388(value)
}

@JvmName("liftType388")
fun liftType388(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`> {
    return liftFromBuffer388(buf)
}

fun writeType388(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>) {
    val childBuf = lowerToBuffer388(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType388(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer388(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>?
class DeconstructedType387(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType387")
fun lowerType387(value: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>?): DeconstructedType387 {
    if (value == null) {
        return DeconstructedType387(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType388(value)
        return DeconstructedType387(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType387")
fun liftType387(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>? {
    if (v0) {
        return liftType388(
            v1,
        )
    } else {
        return null
    }
}

fun writeType387(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType388(buf, offset + 8, value)
    }
}
fun readType387(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType388(buf, offset + 8)
    }
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



@JvmName("lowerType393")
fun lowerType393(value: mozilla.appservices.suggest.`AmpMatchingStrategy`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType393")
fun liftType393(value: kotlin.Int): mozilla.appservices.suggest.`AmpMatchingStrategy` {
    return mozilla.appservices.suggest.`AmpMatchingStrategy`.values()[value]
}

fun writeType393(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`AmpMatchingStrategy`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType393(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`AmpMatchingStrategy` {
    return liftType393(readInt(buf, offset))
}


// Deconstructed version of mozilla.appservices.suggest.`AmpMatchingStrategy`?
class DeconstructedType392(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType392")
fun lowerType392(value: mozilla.appservices.suggest.`AmpMatchingStrategy`?): DeconstructedType392 {
    if (value == null) {
        return DeconstructedType392(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType393(value)
        return DeconstructedType392(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType392")
fun liftType392(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.suggest.`AmpMatchingStrategy`? {
    if (v0) {
        return liftType393(
            v1,
        )
    } else {
        return null
    }
}

fun writeType392(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`AmpMatchingStrategy`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType393(buf, offset + 4, value)
    }
}
fun readType392(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`AmpMatchingStrategy`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType393(buf, offset + 4)
    }
}

// Deconstructed version of SuggestionProviderConstraints
class DeconstructedType391(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
    val v2: Boolean,
    val v3: Int,
)

@JvmName("lowerType391")
fun lowerType391(rec: mozilla.appservices.suggest.`SuggestionProviderConstraints`): DeconstructedType391 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType99(rec.`dynamicSuggestionTypes`)
    val uniffiFieldLowered1 = lowerType392(rec.`ampAlternativeMatching`)
    return DeconstructedType391(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
    )
}

@JvmName("liftType391")
fun liftType391(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
    v2: Boolean,
    v3: Int,
): mozilla.appservices.suggest.`SuggestionProviderConstraints` {
    return mozilla.appservices.suggest.`SuggestionProviderConstraints`(
        liftType99(
            v0,
            v1,
        ),
        liftType392(
            v2,
            v3,
        ),
    )
}

fun writeType391(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestionProviderConstraints`) {
    writeType99(buf, offset + 0, value.`dynamicSuggestionTypes`)
    writeType392(buf, offset + 24, value.`ampAlternativeMatching`)
}

fun readType391(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestionProviderConstraints` {
    return mozilla.appservices.suggest.`SuggestionProviderConstraints`(
        readType99(buf, offset + 0),
        readType392(buf, offset + 24),
    )
}


// Deconstructed version of mozilla.appservices.suggest.`SuggestionProviderConstraints`?
class DeconstructedType390(
    val v0: Boolean,
    val v1: Boolean,
    val v2: java.nio.ByteBuffer?,
    val v3: Boolean,
    val v4: Int,
)

@JvmName("lowerType390")
fun lowerType390(value: mozilla.appservices.suggest.`SuggestionProviderConstraints`?): DeconstructedType390 {
    if (value == null) {
        return DeconstructedType390(
            false,
            false,
            null,
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType391(value)
        return DeconstructedType390(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
        )
    }
}

@JvmName("liftType390")
fun liftType390(
    v0: Boolean,
    v1: Boolean,
    v2: java.nio.ByteBuffer?,
    v3: Boolean,
    v4: Int,
): mozilla.appservices.suggest.`SuggestionProviderConstraints`? {
    if (v0) {
        return liftType391(
            v1,
            v2,
            v3,
            v4,
        )
    } else {
        return null
    }
}

fun writeType390(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestionProviderConstraints`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType391(buf, offset + 8, value)
    }
}
fun readType390(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestionProviderConstraints`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType391(buf, offset + 8)
    }
}

// Deconstructed version of SuggestIngestionConstraints
class DeconstructedType410(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
    val v2: Boolean,
    val v3: Boolean,
    val v4: java.nio.ByteBuffer?,
    val v5: Boolean,
    val v6: Int,
    val v7: Boolean,
)

@JvmName("lowerType410")
fun lowerType410(rec: mozilla.appservices.suggest.`SuggestIngestionConstraints`): DeconstructedType410 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType387(rec.`providers`)
    val uniffiFieldLowered1 = lowerType390(rec.`providerConstraints`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`emptyOnly`)
    return DeconstructedType410(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered1.v4,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType410")
fun liftType410(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
    v2: Boolean,
    v3: Boolean,
    v4: java.nio.ByteBuffer?,
    v5: Boolean,
    v6: Int,
    v7: Boolean,
): mozilla.appservices.suggest.`SuggestIngestionConstraints` {
    return mozilla.appservices.suggest.`SuggestIngestionConstraints`(
        liftType387(
            v0,
            v1,
        ),
        liftType390(
            v2,
            v3,
            v4,
            v5,
            v6,
        ),
        liftBoolean(
            v7,
        ),
    )
}

fun writeType410(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestIngestionConstraints`) {
    writeType387(buf, offset + 0, value.`providers`)
    writeType390(buf, offset + 24, value.`providerConstraints`)
    writeBoolean(buf, offset + 64, value.`emptyOnly`)
}

fun readType410(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestIngestionConstraints` {
    return mozilla.appservices.suggest.`SuggestIngestionConstraints`(
        readType387(buf, offset + 0),
        readType390(buf, offset + 24),
        readBoolean(buf, offset + 64),
    )
}

// Deconstructed version of SuggestIngestionMetrics
class DeconstructedType411(
    val v0: java.nio.ByteBuffer?,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType411")
fun lowerType411(rec: mozilla.appservices.suggest.`SuggestIngestionMetrics`): DeconstructedType411 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType385(rec.`ingestionTimes`)
    val uniffiFieldLowered1 = lowerType385(rec.`downloadTimes`)
    return DeconstructedType411(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType411")
fun liftType411(
    v0: java.nio.ByteBuffer?,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.suggest.`SuggestIngestionMetrics` {
    return mozilla.appservices.suggest.`SuggestIngestionMetrics`(
        liftType385(
            v0,
        ),
        liftType385(
            v1,
        ),
    )
}

fun writeType411(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestIngestionMetrics`) {
    writeType385(buf, offset + 0, value.`ingestionTimes`)
    writeType385(buf, offset + 16, value.`downloadTimes`)
}

fun readType411(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestIngestionMetrics` {
    return mozilla.appservices.suggest.`SuggestIngestionMetrics`(
        readType385(buf, offset + 0),
        readType385(buf, offset + 16),
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



// Deconstructed version of SuggestionQuery
class DeconstructedType414(
    val v0: String?,
    val v1: java.nio.ByteBuffer?,
    val v2: Boolean,
    val v3: Boolean,
    val v4: java.nio.ByteBuffer?,
    val v5: Boolean,
    val v6: Int,
    val v7: Long,
)

@JvmName("lowerType414")
fun lowerType414(rec: mozilla.appservices.suggest.`SuggestionQuery`): DeconstructedType414 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`keyword`)
    val uniffiFieldLowered1 = lowerType388(rec.`providers`)
    val uniffiFieldLowered2 = lowerType390(rec.`providerConstraints`)
    val uniffiFieldLowered3 = lowerOptionInt(rec.`limit`)
    return DeconstructedType414(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered2.v2,
        uniffiFieldLowered2.v3,
        uniffiFieldLowered2.v4,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType414")
fun liftType414(
    v0: String?,
    v1: java.nio.ByteBuffer?,
    v2: Boolean,
    v3: Boolean,
    v4: java.nio.ByteBuffer?,
    v5: Boolean,
    v6: Int,
    v7: Long,
): mozilla.appservices.suggest.`SuggestionQuery` {
    return mozilla.appservices.suggest.`SuggestionQuery`(
        liftString(
            v0,
        ),
        liftType388(
            v1,
        ),
        liftType390(
            v2,
            v3,
            v4,
            v5,
            v6,
        ),
        liftOptionInt(
            v7,
        ),
    )
}

fun writeType414(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestionQuery`) {
    writeString(buf, offset + 0, value.`keyword`)
    writeType388(buf, offset + 24, value.`providers`)
    writeType390(buf, offset + 40, value.`providerConstraints`)
    writeType172(buf, offset + 80, value.`limit`)
}

fun readType414(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestionQuery` {
    return mozilla.appservices.suggest.`SuggestionQuery`(
        readString(buf, offset + 0),
        readType388(buf, offset + 24),
        readType390(buf, offset + 40),
        readType172(buf, offset + 80),
    )
}

@JvmName("lowerType413")
fun lowerType413(value: mozilla.appservices.suggest.`InterruptKind`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType413")
fun liftType413(value: kotlin.Int): mozilla.appservices.suggest.`InterruptKind` {
    return mozilla.appservices.suggest.`InterruptKind`.values()[value]
}

fun writeType413(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`InterruptKind`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType413(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`InterruptKind` {
    return liftType413(readInt(buf, offset))
}

// Deconstructed version of SuggestApiError
class DeconstructedType401(
    val v0: Int,
    val v1: String?,
    val v2: Long,
)

@JvmName("lowerType401")
fun lowerType401(value: mozilla.appservices.suggest.`SuggestApiException`): DeconstructedType401 {
    when (value) {
        is mozilla.appservices.suggest.`SuggestApiException`.`Network` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType401(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
            )
        }
        is mozilla.appservices.suggest.`SuggestApiException`.`Backoff` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered2 = lowerULong(value.`seconds`)
            return DeconstructedType401(
                uniffiFieldLowered0,
                null,
                uniffiFieldLowered2,
            )
        }
        is mozilla.appservices.suggest.`SuggestApiException`.`Interrupted` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            return DeconstructedType401(
                uniffiFieldLowered0,
                null,
                0L,
            )
        }
        is mozilla.appservices.suggest.`SuggestApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType401(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
            )
        }
    }
}

@JvmName("liftType401")
fun liftType401(
    v0: Int,
    v1: String?,
    v2: Long,
): mozilla.appservices.suggest.`SuggestApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.suggest.`SuggestApiException`.`Network`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.suggest.`SuggestApiException`.`Backoff`(
                liftULong(
                    v2,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.suggest.`SuggestApiException`.`Interrupted`(
            )
        }
        3 -> {
            return mozilla.appservices.suggest.`SuggestApiException`.`Other`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType401: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType401(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestApiException`) {
    when (value) {
        is mozilla.appservices.suggest.`SuggestApiException`.`Network` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.suggest.`SuggestApiException`.`Backoff` -> {
            writeInt(buf, offset, 1);
            writeULong(buf, offset + 8, value.`seconds`)
        }
        is mozilla.appservices.suggest.`SuggestApiException`.`Interrupted` -> {
            writeInt(buf, offset, 2);
        }
        is mozilla.appservices.suggest.`SuggestApiException`.`Other` -> {
            writeInt(buf, offset, 3);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType401(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.suggest.`SuggestApiException`.`Network`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.suggest.`SuggestApiException`.`Backoff`(
                readULong(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.suggest.`SuggestApiException`.`Interrupted`(
            )
        }
        3 -> {
            mozilla.appservices.suggest.`SuggestApiException`.`Other`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType401: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of SuggestProviderConfig
class DeconstructedType409(
    val v0: Int,
    val v1: Double,
    val v2: Int,
)

@JvmName("lowerType409")
fun lowerType409(value: mozilla.appservices.suggest.`SuggestProviderConfig`): DeconstructedType409 {
    when (value) {
        is mozilla.appservices.suggest.`SuggestProviderConfig`.`Weather` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerDouble(value.`score`)
            val uniffiFieldLowered2 = lowerInt(value.`minKeywordLength`)
            return DeconstructedType409(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
            )
        }
    }
}

@JvmName("liftType409")
fun liftType409(
    v0: Int,
    v1: Double,
    v2: Int,
): mozilla.appservices.suggest.`SuggestProviderConfig` {
    when (v0) {
        0 -> {
            return mozilla.appservices.suggest.`SuggestProviderConfig`.`Weather`(
                liftDouble(
                    v1,
                ),
                liftInt(
                    v2,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType409: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType409(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestProviderConfig`) {
    when (value) {
        is mozilla.appservices.suggest.`SuggestProviderConfig`.`Weather` -> {
            writeInt(buf, offset, 0);
            writeDouble(buf, offset + 8, value.`score`)
            writeInt(buf, offset + 16, value.`minKeywordLength`)
        }
    }
}

fun readType409(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestProviderConfig` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.suggest.`SuggestProviderConfig`.`Weather`(
                readDouble(buf, offset + 8),
                readInt(buf, offset + 16),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType409: Invalid enum discriminant: ${discriminant}")
        }
    }
}


fun lowerToBuffer404(value: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 184).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType381(buf, offset, it)
        offset += 184
    }
    return buf
}

fun liftFromBuffer404(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`Geoname`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 184
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType381(buf, offset))
                offset += 184
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType404")
fun lowerType404(value: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>): java.nio.ByteBuffer {
    return lowerToBuffer404(value)
}

@JvmName("liftType404")
fun liftType404(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`Geoname`> {
    return liftFromBuffer404(buf)
}

fun writeType404(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>) {
    val childBuf = lowerToBuffer404(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType404(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`Geoname`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer404(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>?
class DeconstructedType403(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType403")
fun lowerType403(value: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>?): DeconstructedType403 {
    if (value == null) {
        return DeconstructedType403(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType404(value)
        return DeconstructedType403(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType403")
fun liftType403(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>? {
    if (v0) {
        return liftType404(
            v1,
        )
    } else {
        return null
    }
}

fun writeType403(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType404(buf, offset + 8, value)
    }
}
fun readType403(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType404(buf, offset + 8)
    }
}


fun lowerToBuffer405(value: kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 192).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType406(buf, offset, it)
        offset += 192
    }
    return buf
}

fun liftFromBuffer405(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 192
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType406(buf, offset))
                offset += 192
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType405")
fun lowerType405(value: kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`>): java.nio.ByteBuffer {
    return lowerToBuffer405(value)
}

@JvmName("liftType405")
fun liftType405(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`> {
    return liftFromBuffer405(buf)
}

fun writeType405(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`>) {
    val childBuf = lowerToBuffer405(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType405(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer405(childBuf)
}


// Deconstructed version of mozilla.appservices.suggest.`SuggestProviderConfig`?
class DeconstructedType408(
    val v0: Boolean,
    val v1: Int,
    val v2: Double,
    val v3: Int,
)

@JvmName("lowerType408")
fun lowerType408(value: mozilla.appservices.suggest.`SuggestProviderConfig`?): DeconstructedType408 {
    if (value == null) {
        return DeconstructedType408(
            false,
            0,
            0.0,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType409(value)
        return DeconstructedType408(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
        )
    }
}

@JvmName("liftType408")
fun liftType408(
    v0: Boolean,
    v1: Int,
    v2: Double,
    v3: Int,
): mozilla.appservices.suggest.`SuggestProviderConfig`? {
    if (v0) {
        return liftType409(
            v1,
            v2,
            v3,
        )
    } else {
        return null
    }
}

fun writeType408(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestProviderConfig`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType409(buf, offset + 8, value)
    }
}
fun readType408(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestProviderConfig`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType409(buf, offset + 8)
    }
}


// Deconstructed version of mozilla.appservices.suggest.`InterruptKind`?
class DeconstructedType412(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType412")
fun lowerType412(value: mozilla.appservices.suggest.`InterruptKind`?): DeconstructedType412 {
    if (value == null) {
        return DeconstructedType412(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType413(value)
        return DeconstructedType412(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType412")
fun liftType412(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.suggest.`InterruptKind`? {
    if (v0) {
        return liftType413(
            v1,
        )
    } else {
        return null
    }
}

fun writeType412(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`InterruptKind`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType413(buf, offset + 4, value)
    }
}
fun readType412(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`InterruptKind`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType413(buf, offset + 4)
    }
}

fun objectToHandle416(obj: mozilla.appservices.suggest.`SuggestStore`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject416(handle: kotlin.Long): mozilla.appservices.suggest.`SuggestStore` {
    return mozilla.appservices.suggest.`SuggestStore`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef416")
fun lowerObjectRef416(value: mozilla.appservices.suggest.`SuggestStore`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType416")
fun lowerType416(value: mozilla.appservices.suggest.`SuggestStore`): kotlin.Long {
    return objectToHandle416(value)
}

@JvmName("liftType416")
fun liftType416(handle: kotlin.Long): mozilla.appservices.suggest.`SuggestStore` {
    return handleToObject416(handle)
}

fun writeType416(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestStore`) {
    writeLong(buf, offset, objectToHandle416(value))
}

fun readType416(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestStore` {
    return handleToObject416(readLong(buf, offset))
}

fun objectToHandle417(obj: mozilla.appservices.suggest.`SuggestStoreBuilder`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject417(handle: kotlin.Long): mozilla.appservices.suggest.`SuggestStoreBuilder` {
    return mozilla.appservices.suggest.`SuggestStoreBuilder`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef417")
fun lowerObjectRef417(value: mozilla.appservices.suggest.`SuggestStoreBuilder`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType417")
fun lowerType417(value: mozilla.appservices.suggest.`SuggestStoreBuilder`): kotlin.Long {
    return objectToHandle417(value)
}

@JvmName("liftType417")
fun liftType417(handle: kotlin.Long): mozilla.appservices.suggest.`SuggestStoreBuilder` {
    return handleToObject417(handle)
}

fun writeType417(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.suggest.`SuggestStoreBuilder`) {
    writeLong(buf, offset, objectToHandle417(value))
}

fun readType417(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.suggest.`SuggestStoreBuilder` {
    return handleToObject417(readLong(buf, offset))
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



@JvmName("lowerType325")
inline fun lowerType325(value: mozilla.appservices.remotesettings.`RemoteSettingsServer`): DeconstructedType325 {
    return mozilla.appservices.remotesettings.uniffi.lowerType325(value)
}

@JvmName("liftType325")
inline fun liftType325(
    v1: Int,
    v2: String?
): mozilla.appservices.remotesettings.`RemoteSettingsServer` {
    return mozilla.appservices.remotesettings.uniffi.liftType325(
        v1,
        v2
    )
}

inline fun writeType325(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotesettings.`RemoteSettingsServer`) {
    mozilla.appservices.remotesettings.uniffi.writeType325(buf, offset, value)
}

inline fun readType325(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotesettings.`RemoteSettingsServer` {
    return mozilla.appservices.remotesettings.uniffi.readType325(buf, offset)
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
    @JvmName("functionSuggestRawSuggestionUrlMatches")
    @JvmStatic external fun functionSuggestRawSuggestionUrlMatches(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodSuggestSuggestStoreAnyDismissedSuggestions")
    @JvmStatic external fun methodSuggestSuggestStoreAnyDismissedSuggestions(
        `uniffiArg0`: Long,
    ) : Boolean
    @JvmName("methodSuggestSuggestStoreClear")
    @JvmStatic external fun methodSuggestSuggestStoreClear(
        `uniffiArg0`: Long,
    )
    @JvmName("methodSuggestSuggestStoreClearDismissedSuggestions")
    @JvmStatic external fun methodSuggestSuggestStoreClearDismissedSuggestions(
        `uniffiArg0`: Long,
    )
    @JvmName("methodSuggestSuggestStoreDismissByKey")
    @JvmStatic external fun methodSuggestSuggestStoreDismissByKey(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodSuggestSuggestStoreDismissBySuggestion")
    @JvmStatic external fun methodSuggestSuggestStoreDismissBySuggestion(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: kotlin.ByteArray?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: Long,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: kotlin.IntArray?,
        `uniffiArg13`: String?,
        `uniffiArg14`: String?,
        `uniffiArg15`: String?,
        `uniffiArg16`: Double,
        `uniffiArg17`: Boolean,
        `uniffiArg18`: Boolean,
        `uniffiArg19`: Boolean,
        `uniffiArg20`: String?,
        `uniffiArg21`: String?,
        `uniffiArg22`: String?,
        `uniffiArg23`: String?,
        `uniffiArg24`: String?,
        `uniffiArg25`: String?,
        `uniffiArg26`: String?,
        `uniffiArg27`: String?,
        `uniffiArg28`: String?,
        `uniffiArg29`: String?,
        `uniffiArg30`: String?,
        `uniffiArg31`: Boolean,
        `uniffiArg32`: Boolean,
        `uniffiArg33`: Int,
        `uniffiArg34`: String?,
        `uniffiArg35`: String?,
        `uniffiArg36`: String?,
        `uniffiArg37`: Byte,
        `uniffiArg38`: String?,
        `uniffiArg39`: String?,
        `uniffiArg40`: String?,
        `uniffiArg41`: java.nio.ByteBuffer?,
        `uniffiArg42`: Long,
        `uniffiArg43`: String?,
        `uniffiArg44`: String?,
        `uniffiArg45`: String?,
        `uniffiArg46`: String?,
    )
    @JvmName("methodSuggestSuggestStoreDismissSuggestion")
    @JvmStatic external fun methodSuggestSuggestStoreDismissSuggestion(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodSuggestSuggestStoreFetchGeonameAlternates")
    @JvmStatic external fun methodSuggestSuggestStoreFetchGeonameAlternates(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Int,
        `uniffiArg3`: Byte,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: java.nio.ByteBuffer?,
        `uniffiArg9`: Long,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
    ) : mozilla.appservices.suggest.`GeonameAlternates`
    @JvmName("methodSuggestSuggestStoreFetchGeonames")
    @JvmStatic external fun methodSuggestSuggestStoreFetchGeonames(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodSuggestSuggestStoreFetchGlobalConfig")
    @JvmStatic external fun methodSuggestSuggestStoreFetchGlobalConfig(
        `uniffiArg0`: Long,
    ) : Int
    @JvmName("methodSuggestSuggestStoreFetchProviderConfig")
    @JvmStatic external fun methodSuggestSuggestStoreFetchProviderConfig(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
    ) : mozilla.appservices.suggest.`SuggestProviderConfig`?
    @JvmName("methodSuggestSuggestStoreIngest")
    @JvmStatic external fun methodSuggestSuggestStoreIngest(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: java.nio.ByteBuffer?,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: java.nio.ByteBuffer?,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Int,
        `uniffiArg8`: Boolean,
    ) : mozilla.appservices.suggest.`SuggestIngestionMetrics`
    @JvmName("methodSuggestSuggestStoreInterrupt")
    @JvmStatic external fun methodSuggestSuggestStoreInterrupt(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: Int,
    )
    @JvmName("methodSuggestSuggestStoreIsDismissedByKey")
    @JvmStatic external fun methodSuggestSuggestStoreIsDismissedByKey(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodSuggestSuggestStoreIsDismissedBySuggestion")
    @JvmStatic external fun methodSuggestSuggestStoreIsDismissedBySuggestion(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: kotlin.ByteArray?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: Long,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: kotlin.IntArray?,
        `uniffiArg13`: String?,
        `uniffiArg14`: String?,
        `uniffiArg15`: String?,
        `uniffiArg16`: Double,
        `uniffiArg17`: Boolean,
        `uniffiArg18`: Boolean,
        `uniffiArg19`: Boolean,
        `uniffiArg20`: String?,
        `uniffiArg21`: String?,
        `uniffiArg22`: String?,
        `uniffiArg23`: String?,
        `uniffiArg24`: String?,
        `uniffiArg25`: String?,
        `uniffiArg26`: String?,
        `uniffiArg27`: String?,
        `uniffiArg28`: String?,
        `uniffiArg29`: String?,
        `uniffiArg30`: String?,
        `uniffiArg31`: Boolean,
        `uniffiArg32`: Boolean,
        `uniffiArg33`: Int,
        `uniffiArg34`: String?,
        `uniffiArg35`: String?,
        `uniffiArg36`: String?,
        `uniffiArg37`: Byte,
        `uniffiArg38`: String?,
        `uniffiArg39`: String?,
        `uniffiArg40`: String?,
        `uniffiArg41`: java.nio.ByteBuffer?,
        `uniffiArg42`: Long,
        `uniffiArg43`: String?,
        `uniffiArg44`: String?,
        `uniffiArg45`: String?,
        `uniffiArg46`: String?,
    ) : Boolean
    @JvmName("methodSuggestSuggestStoreQuery")
    @JvmStatic external fun methodSuggestSuggestStoreQuery(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: java.nio.ByteBuffer?,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: java.nio.ByteBuffer?,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Int,
        `uniffiArg8`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodSuggestSuggestStoreQueryWithMetrics")
    @JvmStatic external fun methodSuggestSuggestStoreQueryWithMetrics(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: java.nio.ByteBuffer?,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: java.nio.ByteBuffer?,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Int,
        `uniffiArg8`: Long,
    ) : mozilla.appservices.suggest.`QueryWithMetricsResult`
    @JvmName("methodSuggestSuggestStoreBuilderBuild")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderBuild(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodSuggestSuggestStoreBuilderCachePath")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderCachePath(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodSuggestSuggestStoreBuilderDataPath")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderDataPath(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodSuggestSuggestStoreBuilderLoadExtension")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderLoadExtension(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    ) : Long
    @JvmName("methodSuggestSuggestStoreBuilderRemoteSettingsBucketName")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderRemoteSettingsBucketName(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodSuggestSuggestStoreBuilderRemoteSettingsServer")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderRemoteSettingsServer(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
    ) : Long
    @JvmName("methodSuggestSuggestStoreBuilderRemoteSettingsService")
    @JvmStatic external fun methodSuggestSuggestStoreBuilderRemoteSettingsService(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : Long
    @JvmName("constructorSuggestSuggestStoreNew")
    @JvmStatic external fun constructorSuggestSuggestStoreNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: Long,
    ) : Long
    @JvmName("constructorSuggestSuggestStoreBuilderNew")
    @JvmStatic external fun constructorSuggestSuggestStoreBuilderNew(
    ) : Long
    @JvmStatic external fun objectCloneHandle416(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree416(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle417(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree417(handle: kotlin.Long)
}