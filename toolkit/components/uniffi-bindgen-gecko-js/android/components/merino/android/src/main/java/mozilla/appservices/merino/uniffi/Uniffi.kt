@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.merino.uniffi
import uniffi.DeconstructedType99
import uniffi.DeconstructedType56



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



// Deconstructed version of CuratedRecommendationsConfig
class DeconstructedType191(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType191")
fun lowerType191(rec: mozilla.appservices.merino.`CuratedRecommendationsConfig`): DeconstructedType191 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`baseHost`)
    val uniffiFieldLowered1 = lowerString(rec.`userAgentHeader`)
    return DeconstructedType191(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType191")
fun liftType191(
    v0: String?,
    v1: String?,
): mozilla.appservices.merino.`CuratedRecommendationsConfig` {
    return mozilla.appservices.merino.`CuratedRecommendationsConfig`(
        liftOptionString(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType191(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationsConfig`) {
    writeType18(buf, offset + 0, value.`baseHost`)
    writeString(buf, offset + 32, value.`userAgentHeader`)
}

fun readType191(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationsConfig` {
    return mozilla.appservices.merino.`CuratedRecommendationsConfig`(
        readType18(buf, offset + 0),
        readString(buf, offset + 32),
    )
}

@JvmName("lowerType171")
fun lowerType171(value: mozilla.appservices.merino.`CuratedRecommendationLocale`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType171")
fun liftType171(value: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationLocale` {
    return mozilla.appservices.merino.`CuratedRecommendationLocale`.values()[value]
}

fun writeType171(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationLocale`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType171(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationLocale` {
    return liftType171(readInt(buf, offset))
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



// Deconstructed version of SectionSettings
class DeconstructedType175(
    val v0: String?,
    val v1: Boolean,
    val v2: Boolean,
)

@JvmName("lowerType175")
fun lowerType175(rec: mozilla.appservices.merino.`SectionSettings`): DeconstructedType175 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`sectionId`)
    val uniffiFieldLowered1 = lowerBoolean(rec.`isFollowed`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`isBlocked`)
    return DeconstructedType175(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType175")
fun liftType175(
    v0: String?,
    v1: Boolean,
    v2: Boolean,
): mozilla.appservices.merino.`SectionSettings` {
    return mozilla.appservices.merino.`SectionSettings`(
        liftString(
            v0,
        ),
        liftBoolean(
            v1,
        ),
        liftBoolean(
            v2,
        ),
    )
}

fun writeType175(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`SectionSettings`) {
    writeString(buf, offset + 0, value.`sectionId`)
    writeBoolean(buf, offset + 24, value.`isFollowed`)
    writeBoolean(buf, offset + 25, value.`isBlocked`)
}

fun readType175(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`SectionSettings` {
    return mozilla.appservices.merino.`SectionSettings`(
        readString(buf, offset + 0),
        readBoolean(buf, offset + 24),
        readBoolean(buf, offset + 25),
    )
}


fun lowerToBuffer174(value: kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType175(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer174(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType175(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType174")
fun lowerType174(value: kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>): java.nio.ByteBuffer {
    return lowerToBuffer174(value)
}

@JvmName("liftType174")
fun liftType174(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`> {
    return liftFromBuffer174(buf)
}

fun writeType174(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>) {
    val childBuf = lowerToBuffer174(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType174(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer174(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>?
class DeconstructedType173(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType173")
fun lowerType173(value: kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>?): DeconstructedType173 {
    if (value == null) {
        return DeconstructedType173(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType174(value)
        return DeconstructedType173(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType173")
fun liftType173(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>? {
    if (v0) {
        return liftType174(
            v1,
        )
    } else {
        return null
    }
}

fun writeType173(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType174(buf, offset + 8, value)
    }
}
fun readType173(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType174(buf, offset + 8)
    }
}

// Deconstructed version of CuratedRecommendationsRequest
class DeconstructedType193(
    val v0: Int,
    val v1: String?,
    val v2: Long,
    val v3: Boolean,
    val v4: java.nio.ByteBuffer?,
    val v5: Boolean,
    val v6: java.nio.ByteBuffer?,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
    val v9: String?,
    val v10: String?,
    val v11: Boolean,
)

@JvmName("lowerType193")
fun lowerType193(rec: mozilla.appservices.merino.`CuratedRecommendationsRequest`): DeconstructedType193 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType171(rec.`locale`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`region`)
    val uniffiFieldLowered2 = lowerOptionInt(rec.`count`)
    val uniffiFieldLowered3 = lowerType99(rec.`topics`)
    val uniffiFieldLowered4 = lowerType99(rec.`feeds`)
    val uniffiFieldLowered5 = lowerType173(rec.`sections`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`experimentName`)
    val uniffiFieldLowered7 = lowerOptionString(rec.`experimentBranch`)
    val uniffiFieldLowered8 = lowerBoolean(rec.`enableInterestPicker`)
    return DeconstructedType193(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
    )
}

@JvmName("liftType193")
fun liftType193(
    v0: Int,
    v1: String?,
    v2: Long,
    v3: Boolean,
    v4: java.nio.ByteBuffer?,
    v5: Boolean,
    v6: java.nio.ByteBuffer?,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
    v9: String?,
    v10: String?,
    v11: Boolean,
): mozilla.appservices.merino.`CuratedRecommendationsRequest` {
    return mozilla.appservices.merino.`CuratedRecommendationsRequest`(
        liftType171(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionInt(
            v2,
        ),
        liftType99(
            v3,
            v4,
        ),
        liftType99(
            v5,
            v6,
        ),
        liftType173(
            v7,
            v8,
        ),
        liftOptionString(
            v9,
        ),
        liftOptionString(
            v10,
        ),
        liftBoolean(
            v11,
        ),
    )
}

fun writeType193(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationsRequest`) {
    writeType171(buf, offset + 0, value.`locale`)
    writeType18(buf, offset + 8, value.`region`)
    writeType172(buf, offset + 40, value.`count`)
    writeType99(buf, offset + 48, value.`topics`)
    writeType99(buf, offset + 72, value.`feeds`)
    writeType173(buf, offset + 96, value.`sections`)
    writeType18(buf, offset + 120, value.`experimentName`)
    writeType18(buf, offset + 152, value.`experimentBranch`)
    writeBoolean(buf, offset + 184, value.`enableInterestPicker`)
}

fun readType193(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationsRequest` {
    return mozilla.appservices.merino.`CuratedRecommendationsRequest`(
        readType171(buf, offset + 0),
        readType18(buf, offset + 8),
        readType172(buf, offset + 40),
        readType99(buf, offset + 48),
        readType99(buf, offset + 72),
        readType173(buf, offset + 96),
        readType18(buf, offset + 120),
        readType18(buf, offset + 152),
        readBoolean(buf, offset + 184),
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





@JvmName("lowerType56")
inline fun lowerType56(value: kotlin.Long?): DeconstructedType56 {
    return uniffi.lowerType56(value)
}

@JvmName("liftType56")
inline fun liftType56(
    v1: Boolean,
    v2: Long
): kotlin.Long? {
    return uniffi.liftType56(
        v1,
        v2
    )
}

inline fun writeType56(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.Long?) {
    uniffi.writeType56(buf, offset, value)
}

inline fun readType56(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.Long? {
    return uniffi.readType56(buf, offset)
}



// Deconstructed version of RecommendationDataItem
class DeconstructedType177(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: Boolean,
    val v8: String?,
    val v9: String?,
    val v10: Boolean,
    val v11: Long,
    val v12: Long,
)

@JvmName("lowerType177")
fun lowerType177(rec: mozilla.appservices.merino.`RecommendationDataItem`): DeconstructedType177 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`corpusItemId`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`scheduledCorpusItemId`)
    val uniffiFieldLowered2 = lowerString(rec.`url`)
    val uniffiFieldLowered3 = lowerString(rec.`title`)
    val uniffiFieldLowered4 = lowerString(rec.`excerpt`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`topic`)
    val uniffiFieldLowered6 = lowerString(rec.`publisher`)
    val uniffiFieldLowered7 = lowerBoolean(rec.`isTimeSensitive`)
    val uniffiFieldLowered8 = lowerString(rec.`imageUrl`)
    val uniffiFieldLowered9 = lowerOptionString(rec.`iconUrl`)
    val uniffiFieldLowered10 = lowerType56(rec.`tileId`)
    val uniffiFieldLowered11 = lowerLong(rec.`receivedRank`)
    return DeconstructedType177(
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
        uniffiFieldLowered10.v0,
        uniffiFieldLowered10.v1,
        uniffiFieldLowered11,
    )
}

@JvmName("liftType177")
fun liftType177(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: Boolean,
    v8: String?,
    v9: String?,
    v10: Boolean,
    v11: Long,
    v12: Long,
): mozilla.appservices.merino.`RecommendationDataItem` {
    return mozilla.appservices.merino.`RecommendationDataItem`(
        liftString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
            v3,
        ),
        liftString(
            v4,
        ),
        liftOptionString(
            v5,
        ),
        liftString(
            v6,
        ),
        liftBoolean(
            v7,
        ),
        liftString(
            v8,
        ),
        liftOptionString(
            v9,
        ),
        liftType56(
            v10,
            v11,
        ),
        liftLong(
            v12,
        ),
    )
}

fun writeType177(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`RecommendationDataItem`) {
    writeString(buf, offset + 0, value.`corpusItemId`)
    writeType18(buf, offset + 24, value.`scheduledCorpusItemId`)
    writeString(buf, offset + 56, value.`url`)
    writeString(buf, offset + 80, value.`title`)
    writeString(buf, offset + 104, value.`excerpt`)
    writeType18(buf, offset + 128, value.`topic`)
    writeString(buf, offset + 160, value.`publisher`)
    writeBoolean(buf, offset + 184, value.`isTimeSensitive`)
    writeString(buf, offset + 192, value.`imageUrl`)
    writeType18(buf, offset + 216, value.`iconUrl`)
    writeType56(buf, offset + 248, value.`tileId`)
    writeLong(buf, offset + 264, value.`receivedRank`)
}

fun readType177(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`RecommendationDataItem` {
    return mozilla.appservices.merino.`RecommendationDataItem`(
        readString(buf, offset + 0),
        readType18(buf, offset + 24),
        readString(buf, offset + 56),
        readString(buf, offset + 80),
        readString(buf, offset + 104),
        readType18(buf, offset + 128),
        readString(buf, offset + 160),
        readBoolean(buf, offset + 184),
        readString(buf, offset + 192),
        readType18(buf, offset + 216),
        readType56(buf, offset + 248),
        readLong(buf, offset + 264),
    )
}


fun lowerToBuffer176(value: kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 272).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType177(buf, offset, it)
        offset += 272
    }
    return buf
}

fun liftFromBuffer176(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 272
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType177(buf, offset))
                offset += 272
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType176")
fun lowerType176(value: kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`>): java.nio.ByteBuffer {
    return lowerToBuffer176(value)
}

@JvmName("liftType176")
fun liftType176(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`> {
    return liftFromBuffer176(buf)
}

fun writeType176(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`>) {
    val childBuf = lowerToBuffer176(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType176(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer176(childBuf)
}

// Deconstructed version of Tile
class DeconstructedType189(
    val v0: String?,
    val v1: Int,
    val v2: Boolean,
    val v3: Boolean,
)

@JvmName("lowerType189")
fun lowerType189(rec: mozilla.appservices.merino.`Tile`): DeconstructedType189 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`size`)
    val uniffiFieldLowered1 = lowerInt(rec.`position`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`hasAd`)
    val uniffiFieldLowered3 = lowerBoolean(rec.`hasExcerpt`)
    return DeconstructedType189(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType189")
fun liftType189(
    v0: String?,
    v1: Int,
    v2: Boolean,
    v3: Boolean,
): mozilla.appservices.merino.`Tile` {
    return mozilla.appservices.merino.`Tile`(
        liftString(
            v0,
        ),
        liftInt(
            v1,
        ),
        liftBoolean(
            v2,
        ),
        liftBoolean(
            v3,
        ),
    )
}

fun writeType189(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`Tile`) {
    writeString(buf, offset + 0, value.`size`)
    writeInt(buf, offset + 24, value.`position`)
    writeBoolean(buf, offset + 28, value.`hasAd`)
    writeBoolean(buf, offset + 29, value.`hasExcerpt`)
}

fun readType189(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`Tile` {
    return mozilla.appservices.merino.`Tile`(
        readString(buf, offset + 0),
        readInt(buf, offset + 24),
        readBoolean(buf, offset + 28),
        readBoolean(buf, offset + 29),
    )
}


fun lowerToBuffer188(value: kotlin.collections.List<mozilla.appservices.merino.`Tile`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType189(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer188(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`Tile`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType189(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType188")
fun lowerType188(value: kotlin.collections.List<mozilla.appservices.merino.`Tile`>): java.nio.ByteBuffer {
    return lowerToBuffer188(value)
}

@JvmName("liftType188")
fun liftType188(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`Tile`> {
    return liftFromBuffer188(buf)
}

fun writeType188(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`Tile`>) {
    val childBuf = lowerToBuffer188(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType188(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`Tile`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer188(childBuf)
}

// Deconstructed version of ResponsiveLayout
class DeconstructedType187(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType187")
fun lowerType187(rec: mozilla.appservices.merino.`ResponsiveLayout`): DeconstructedType187 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerInt(rec.`columnCount`)
    val uniffiFieldLowered1 = lowerType188(rec.`tiles`)
    return DeconstructedType187(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType187")
fun liftType187(
    v0: Int,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.merino.`ResponsiveLayout` {
    return mozilla.appservices.merino.`ResponsiveLayout`(
        liftInt(
            v0,
        ),
        liftType188(
            v1,
        ),
    )
}

fun writeType187(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`ResponsiveLayout`) {
    writeInt(buf, offset + 0, value.`columnCount`)
    writeType188(buf, offset + 8, value.`tiles`)
}

fun readType187(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`ResponsiveLayout` {
    return mozilla.appservices.merino.`ResponsiveLayout`(
        readInt(buf, offset + 0),
        readType188(buf, offset + 8),
    )
}


fun lowerToBuffer186(value: kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 24).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType187(buf, offset, it)
        offset += 24
    }
    return buf
}

fun liftFromBuffer186(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 24
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType187(buf, offset))
                offset += 24
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType186")
fun lowerType186(value: kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`>): java.nio.ByteBuffer {
    return lowerToBuffer186(value)
}

@JvmName("liftType186")
fun liftType186(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`> {
    return liftFromBuffer186(buf)
}

fun writeType186(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`>) {
    val childBuf = lowerToBuffer186(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType186(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer186(childBuf)
}

// Deconstructed version of Layout
class DeconstructedType183(
    val v0: String?,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType183")
fun lowerType183(rec: mozilla.appservices.merino.`Layout`): DeconstructedType183 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`name`)
    val uniffiFieldLowered1 = lowerType186(rec.`responsiveLayouts`)
    return DeconstructedType183(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType183")
fun liftType183(
    v0: String?,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.merino.`Layout` {
    return mozilla.appservices.merino.`Layout`(
        liftString(
            v0,
        ),
        liftType186(
            v1,
        ),
    )
}

fun writeType183(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`Layout`) {
    writeString(buf, offset + 0, value.`name`)
    writeType186(buf, offset + 24, value.`responsiveLayouts`)
}

fun readType183(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`Layout` {
    return mozilla.appservices.merino.`Layout`(
        readString(buf, offset + 0),
        readType186(buf, offset + 24),
    )
}

// Deconstructed version of FeedSection
class DeconstructedType180(
    val v0: String?,
    val v1: Int,
    val v2: java.nio.ByteBuffer?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: java.nio.ByteBuffer?,
    val v7: Boolean,
    val v8: Boolean,
)

@JvmName("lowerType180")
fun lowerType180(rec: mozilla.appservices.merino.`FeedSection`): DeconstructedType180 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`feedId`)
    val uniffiFieldLowered1 = lowerInt(rec.`receivedFeedRank`)
    val uniffiFieldLowered2 = lowerType176(rec.`recommendations`)
    val uniffiFieldLowered3 = lowerString(rec.`title`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`subtitle`)
    val uniffiFieldLowered5 = lowerType183(rec.`layout`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`isFollowed`)
    val uniffiFieldLowered7 = lowerBoolean(rec.`isBlocked`)
    return DeconstructedType180(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
    )
}

@JvmName("liftType180")
fun liftType180(
    v0: String?,
    v1: Int,
    v2: java.nio.ByteBuffer?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: java.nio.ByteBuffer?,
    v7: Boolean,
    v8: Boolean,
): mozilla.appservices.merino.`FeedSection` {
    return mozilla.appservices.merino.`FeedSection`(
        liftString(
            v0,
        ),
        liftInt(
            v1,
        ),
        liftType176(
            v2,
        ),
        liftString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
        liftType183(
            v5,
            v6,
        ),
        liftBoolean(
            v7,
        ),
        liftBoolean(
            v8,
        ),
    )
}

fun writeType180(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`FeedSection`) {
    writeString(buf, offset + 0, value.`feedId`)
    writeInt(buf, offset + 24, value.`receivedFeedRank`)
    writeType176(buf, offset + 32, value.`recommendations`)
    writeString(buf, offset + 48, value.`title`)
    writeType18(buf, offset + 72, value.`subtitle`)
    writeType183(buf, offset + 104, value.`layout`)
    writeBoolean(buf, offset + 144, value.`isFollowed`)
    writeBoolean(buf, offset + 145, value.`isBlocked`)
}

fun readType180(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`FeedSection` {
    return mozilla.appservices.merino.`FeedSection`(
        readString(buf, offset + 0),
        readInt(buf, offset + 24),
        readType176(buf, offset + 32),
        readString(buf, offset + 48),
        readType18(buf, offset + 72),
        readType183(buf, offset + 104),
        readBoolean(buf, offset + 144),
        readBoolean(buf, offset + 145),
    )
}


fun lowerToBuffer179(value: kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 152).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType180(buf, offset, it)
        offset += 152
    }
    return buf
}

fun liftFromBuffer179(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`FeedSection`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 152
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType180(buf, offset))
                offset += 152
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType179")
fun lowerType179(value: kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>): java.nio.ByteBuffer {
    return lowerToBuffer179(value)
}

@JvmName("liftType179")
fun liftType179(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`FeedSection`> {
    return liftFromBuffer179(buf)
}

fun writeType179(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>) {
    val childBuf = lowerToBuffer179(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType179(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`FeedSection`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer179(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>?
class DeconstructedType178(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType178")
fun lowerType178(value: kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>?): DeconstructedType178 {
    if (value == null) {
        return DeconstructedType178(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType179(value)
        return DeconstructedType178(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType178")
fun liftType178(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>? {
    if (v0) {
        return liftType179(
            v1,
        )
    } else {
        return null
    }
}

fun writeType178(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType179(buf, offset + 8, value)
    }
}
fun readType178(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType179(buf, offset + 8)
    }
}


@JvmName("lowerType185")
fun lowerType185(rec: mozilla.appservices.merino.`InterestPickerSection`): String? {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`sectionId`)
    return uniffiFieldLowered0
}

@JvmName("liftType185")
fun liftType185(
    v0: String?,
): mozilla.appservices.merino.`InterestPickerSection` {
    return mozilla.appservices.merino.`InterestPickerSection`(
        liftString(
            v0,
        ),
    )
}

fun writeType185(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`InterestPickerSection`) {
    writeString(buf, offset + 0, value.`sectionId`)
}

fun readType185(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`InterestPickerSection` {
    return mozilla.appservices.merino.`InterestPickerSection`(
        readString(buf, offset + 0),
    )
}


fun lowerToBuffer184(value: kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 24).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType185(buf, offset, it)
        offset += 24
    }
    return buf
}

fun liftFromBuffer184(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 24
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType185(buf, offset))
                offset += 24
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType184")
fun lowerType184(value: kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`>): java.nio.ByteBuffer {
    return lowerToBuffer184(value)
}

@JvmName("liftType184")
fun liftType184(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`> {
    return liftFromBuffer184(buf)
}

fun writeType184(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`>) {
    val childBuf = lowerToBuffer184(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType184(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer184(childBuf)
}

// Deconstructed version of InterestPicker
class DeconstructedType182(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: java.nio.ByteBuffer?,
)

@JvmName("lowerType182")
fun lowerType182(rec: mozilla.appservices.merino.`InterestPicker`): DeconstructedType182 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerInt(rec.`receivedFeedRank`)
    val uniffiFieldLowered1 = lowerString(rec.`title`)
    val uniffiFieldLowered2 = lowerString(rec.`subtitle`)
    val uniffiFieldLowered3 = lowerType184(rec.`sections`)
    return DeconstructedType182(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType182")
fun liftType182(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: java.nio.ByteBuffer?,
): mozilla.appservices.merino.`InterestPicker` {
    return mozilla.appservices.merino.`InterestPicker`(
        liftInt(
            v0,
        ),
        liftString(
            v1,
        ),
        liftString(
            v2,
        ),
        liftType184(
            v3,
        ),
    )
}

fun writeType182(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`InterestPicker`) {
    writeInt(buf, offset + 0, value.`receivedFeedRank`)
    writeString(buf, offset + 8, value.`title`)
    writeString(buf, offset + 32, value.`subtitle`)
    writeType184(buf, offset + 56, value.`sections`)
}

fun readType182(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`InterestPicker` {
    return mozilla.appservices.merino.`InterestPicker`(
        readInt(buf, offset + 0),
        readString(buf, offset + 8),
        readString(buf, offset + 32),
        readType184(buf, offset + 56),
    )
}


// Deconstructed version of mozilla.appservices.merino.`InterestPicker`?
class DeconstructedType181(
    val v0: Boolean,
    val v1: Int,
    val v2: String?,
    val v3: String?,
    val v4: java.nio.ByteBuffer?,
)

@JvmName("lowerType181")
fun lowerType181(value: mozilla.appservices.merino.`InterestPicker`?): DeconstructedType181 {
    if (value == null) {
        return DeconstructedType181(
            false,
            0,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType182(value)
        return DeconstructedType181(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
        )
    }
}

@JvmName("liftType181")
fun liftType181(
    v0: Boolean,
    v1: Int,
    v2: String?,
    v3: String?,
    v4: java.nio.ByteBuffer?,
): mozilla.appservices.merino.`InterestPicker`? {
    if (v0) {
        return liftType182(
            v1,
            v2,
            v3,
            v4,
        )
    } else {
        return null
    }
}

fun writeType181(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`InterestPicker`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType182(buf, offset + 8, value)
    }
}
fun readType181(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`InterestPicker`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType182(buf, offset + 8)
    }
}

// Deconstructed version of CuratedRecommendationsResponse
class DeconstructedType194(
    val v0: Long,
    val v1: java.nio.ByteBuffer?,
    val v2: Boolean,
    val v3: java.nio.ByteBuffer?,
    val v4: Boolean,
    val v5: Int,
    val v6: String?,
    val v7: String?,
    val v8: java.nio.ByteBuffer?,
)

@JvmName("lowerType194")
fun lowerType194(rec: mozilla.appservices.merino.`CuratedRecommendationsResponse`): DeconstructedType194 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerLong(rec.`recommendedAt`)
    val uniffiFieldLowered1 = lowerType176(rec.`data`)
    val uniffiFieldLowered2 = lowerType178(rec.`feeds`)
    val uniffiFieldLowered3 = lowerType181(rec.`interestPicker`)
    return DeconstructedType194(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered3.v2,
        uniffiFieldLowered3.v3,
        uniffiFieldLowered3.v4,
    )
}

@JvmName("liftType194")
fun liftType194(
    v0: Long,
    v1: java.nio.ByteBuffer?,
    v2: Boolean,
    v3: java.nio.ByteBuffer?,
    v4: Boolean,
    v5: Int,
    v6: String?,
    v7: String?,
    v8: java.nio.ByteBuffer?,
): mozilla.appservices.merino.`CuratedRecommendationsResponse` {
    return mozilla.appservices.merino.`CuratedRecommendationsResponse`(
        liftLong(
            v0,
        ),
        liftType176(
            v1,
        ),
        liftType178(
            v2,
            v3,
        ),
        liftType181(
            v4,
            v5,
            v6,
            v7,
            v8,
        ),
    )
}

fun writeType194(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationsResponse`) {
    writeLong(buf, offset + 0, value.`recommendedAt`)
    writeType176(buf, offset + 8, value.`data`)
    writeType178(buf, offset + 24, value.`feeds`)
    writeType181(buf, offset + 48, value.`interestPicker`)
}

fun readType194(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationsResponse` {
    return mozilla.appservices.merino.`CuratedRecommendationsResponse`(
        readLong(buf, offset + 0),
        readType176(buf, offset + 8),
        readType178(buf, offset + 24),
        readType181(buf, offset + 48),
    )
}


@JvmName("lowerType195")
fun lowerType195(rec: mozilla.appservices.merino.`SuggestConfig`): String? {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`baseHost`)
    return uniffiFieldLowered0
}

@JvmName("liftType195")
fun liftType195(
    v0: String?,
): mozilla.appservices.merino.`SuggestConfig` {
    return mozilla.appservices.merino.`SuggestConfig`(
        liftOptionString(
            v0,
        ),
    )
}

fun writeType195(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`SuggestConfig`) {
    writeType18(buf, offset + 0, value.`baseHost`)
}

fun readType195(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`SuggestConfig` {
    return mozilla.appservices.merino.`SuggestConfig`(
        readType18(buf, offset + 0),
    )
}

// Deconstructed version of SuggestOptions
class DeconstructedType197(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Boolean,
    val v7: java.nio.ByteBuffer?,
    val v8: String?,
    val v9: String?,
)

@JvmName("lowerType197")
fun lowerType197(rec: mozilla.appservices.merino.`SuggestOptions`): DeconstructedType197 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType99(rec.`providers`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`source`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`country`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`region`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`city`)
    val uniffiFieldLowered5 = lowerType99(rec.`clientVariants`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`requestType`)
    val uniffiFieldLowered7 = lowerOptionString(rec.`acceptLanguage`)
    return DeconstructedType197(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
    )
}

@JvmName("liftType197")
fun liftType197(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Boolean,
    v7: java.nio.ByteBuffer?,
    v8: String?,
    v9: String?,
): mozilla.appservices.merino.`SuggestOptions` {
    return mozilla.appservices.merino.`SuggestOptions`(
        liftType99(
            v0,
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
        liftType99(
            v6,
            v7,
        ),
        liftOptionString(
            v8,
        ),
        liftOptionString(
            v9,
        ),
    )
}

fun writeType197(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`SuggestOptions`) {
    writeType99(buf, offset + 0, value.`providers`)
    writeType18(buf, offset + 24, value.`source`)
    writeType18(buf, offset + 56, value.`country`)
    writeType18(buf, offset + 88, value.`region`)
    writeType18(buf, offset + 120, value.`city`)
    writeType99(buf, offset + 152, value.`clientVariants`)
    writeType18(buf, offset + 176, value.`requestType`)
    writeType18(buf, offset + 208, value.`acceptLanguage`)
}

fun readType197(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`SuggestOptions` {
    return mozilla.appservices.merino.`SuggestOptions`(
        readType99(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
        readType18(buf, offset + 88),
        readType18(buf, offset + 120),
        readType99(buf, offset + 152),
        readType18(buf, offset + 176),
        readType18(buf, offset + 208),
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





@JvmName("lowerOptionUShort")
inline fun lowerOptionUShort(value: kotlin.UShort?): Long {
    return uniffi.lowerOptionUShort(value)
}

@JvmName("liftOptionUShort")
inline fun liftOptionUShort(
    v1: Long
): kotlin.UShort? {
    return uniffi.liftOptionUShort(
        v1
    )
}

inline fun writeType190(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.UShort?) {
    uniffi.writeType190(buf, offset, value)
}

inline fun readType190(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.UShort? {
    return uniffi.readType190(buf, offset)
}



// Deconstructed version of CuratedRecommendationsApiError
class DeconstructedType192(
    val v0: Int,
    val v1: String?,
    val v2: Long,
)

@JvmName("lowerType192")
fun lowerType192(value: mozilla.appservices.merino.`CuratedRecommendationsApiException`): DeconstructedType192 {
    when (value) {
        is mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Network` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType192(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
            )
        }
        is mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered2 = lowerOptionUShort(value.`code`)
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType192(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
            )
        }
    }
}

@JvmName("liftType192")
fun liftType192(
    v0: Int,
    v1: String?,
    v2: Long,
): mozilla.appservices.merino.`CuratedRecommendationsApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Network`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Other`(
                liftOptionUShort(
                    v2,
                ),
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType192: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType192(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationsApiException`) {
    when (value) {
        is mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Network` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Other` -> {
            writeInt(buf, offset, 1);
            writeType190(buf, offset + 4, value.`code`)
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType192(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationsApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Network`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.merino.`CuratedRecommendationsApiException`.`Other`(
                readType190(buf, offset + 4),
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType192: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of MerinoSuggestApiError
class DeconstructedType196(
    val v0: Int,
    val v1: String?,
    val v2: Long,
)

@JvmName("lowerType196")
fun lowerType196(value: mozilla.appservices.merino.`MerinoSuggestApiException`): DeconstructedType196 {
    when (value) {
        is mozilla.appservices.merino.`MerinoSuggestApiException`.`Network` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType196(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
            )
        }
        is mozilla.appservices.merino.`MerinoSuggestApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered2 = lowerOptionUShort(value.`code`)
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType196(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
            )
        }
    }
}

@JvmName("liftType196")
fun liftType196(
    v0: Int,
    v1: String?,
    v2: Long,
): mozilla.appservices.merino.`MerinoSuggestApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.merino.`MerinoSuggestApiException`.`Network`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.merino.`MerinoSuggestApiException`.`Other`(
                liftOptionUShort(
                    v2,
                ),
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType196: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType196(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`MerinoSuggestApiException`) {
    when (value) {
        is mozilla.appservices.merino.`MerinoSuggestApiException`.`Network` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.merino.`MerinoSuggestApiException`.`Other` -> {
            writeInt(buf, offset, 1);
            writeType190(buf, offset + 4, value.`code`)
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType196(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`MerinoSuggestApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.merino.`MerinoSuggestApiException`.`Network`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.merino.`MerinoSuggestApiException`.`Other`(
                readType190(buf, offset + 4),
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType196: Invalid enum discriminant: ${discriminant}")
        }
    }
}

fun objectToHandle4328(obj: mozilla.appservices.merino.`CuratedRecommendationsClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject4328(handle: kotlin.Long): mozilla.appservices.merino.`CuratedRecommendationsClient` {
    return mozilla.appservices.merino.`CuratedRecommendationsClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef4328")
fun lowerObjectRef4328(value: mozilla.appservices.merino.`CuratedRecommendationsClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType4328")
fun lowerType4328(value: mozilla.appservices.merino.`CuratedRecommendationsClient`): kotlin.Long {
    return objectToHandle4328(value)
}

@JvmName("liftType4328")
fun liftType4328(handle: kotlin.Long): mozilla.appservices.merino.`CuratedRecommendationsClient` {
    return handleToObject4328(handle)
}

fun writeType4328(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationsClient`) {
    writeLong(buf, offset, objectToHandle4328(value))
}

fun readType4328(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationsClient` {
    return handleToObject4328(readLong(buf, offset))
}

fun objectToHandle4329(obj: mozilla.appservices.merino.`SuggestClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject4329(handle: kotlin.Long): mozilla.appservices.merino.`SuggestClient` {
    return mozilla.appservices.merino.`SuggestClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef4329")
fun lowerObjectRef4329(value: mozilla.appservices.merino.`SuggestClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType4329")
fun lowerType4329(value: mozilla.appservices.merino.`SuggestClient`): kotlin.Long {
    return objectToHandle4329(value)
}

@JvmName("liftType4329")
fun liftType4329(handle: kotlin.Long): mozilla.appservices.merino.`SuggestClient` {
    return handleToObject4329(handle)
}

fun writeType4329(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`SuggestClient`) {
    writeLong(buf, offset, objectToHandle4329(value))
}

fun readType4329(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`SuggestClient` {
    return handleToObject4329(readLong(buf, offset))
}


// Deconstructed version of mozilla.appservices.merino.`CuratedRecommendationLocale`?
class DeconstructedType170(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType170")
fun lowerType170(value: mozilla.appservices.merino.`CuratedRecommendationLocale`?): DeconstructedType170 {
    if (value == null) {
        return DeconstructedType170(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType171(value)
        return DeconstructedType170(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType170")
fun liftType170(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.merino.`CuratedRecommendationLocale`? {
    if (v0) {
        return liftType171(
            v1,
        )
    } else {
        return null
    }
}

fun writeType170(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.merino.`CuratedRecommendationLocale`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType171(buf, offset + 4, value)
    }
}
fun readType170(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.merino.`CuratedRecommendationLocale`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType171(buf, offset + 4)
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
    @JvmName("functionMerinoAllCuratedRecommendationLocales")
    @JvmStatic external fun functionMerinoAllCuratedRecommendationLocales(
    ) : java.nio.ByteBuffer?
    @JvmName("functionMerinoCuratedRecommendationLocaleFromString")
    @JvmStatic external fun functionMerinoCuratedRecommendationLocaleFromString(
        `uniffiArg0`: String?,
    ) : mozilla.appservices.merino.`CuratedRecommendationLocale`?
    @JvmName("methodMerinoCuratedRecommendationsClientGetCuratedRecommendations")
    @JvmStatic external fun methodMerinoCuratedRecommendationsClientGetCuratedRecommendations(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
        `uniffiArg3`: Long,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: java.nio.ByteBuffer?,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: java.nio.ByteBuffer?,
        `uniffiArg8`: Boolean,
        `uniffiArg9`: java.nio.ByteBuffer?,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: Boolean,
    ) : mozilla.appservices.merino.`CuratedRecommendationsResponse`
    @JvmName("methodMerinoSuggestClientGetSuggestions")
    @JvmStatic external fun methodMerinoSuggestClientGetSuggestions(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: Boolean,
        `uniffiArg9`: java.nio.ByteBuffer?,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
    ) : String?
    @JvmName("constructorMerinoCuratedRecommendationsClientNew")
    @JvmStatic external fun constructorMerinoCuratedRecommendationsClientNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("constructorMerinoSuggestClientNew")
    @JvmStatic external fun constructorMerinoSuggestClientNew(
        `uniffiArg0`: String?,
    ) : Long
    @JvmStatic external fun objectCloneHandle4328(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree4328(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle4329(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree4329(handle: kotlin.Long)
}