@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.adsclient.uniffi
import uniffi.DeconstructedType11



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



// Deconstructed version of MozAdsCacheConfig
class DeconstructedType50(
    val v0: String?,
    val v1: Boolean,
    val v2: Long,
    val v3: Boolean,
    val v4: Long,
)

@JvmName("lowerType50")
fun lowerType50(rec: mozilla.appservices.adsclient.`MozAdsCacheConfig`): DeconstructedType50 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`dbPath`)
    val uniffiFieldLowered1 = lowerType11(rec.`defaultCacheTtlSeconds`)
    val uniffiFieldLowered2 = lowerType11(rec.`maxSizeMib`)
    return DeconstructedType50(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
    )
}

@JvmName("liftType50")
fun liftType50(
    v0: String?,
    v1: Boolean,
    v2: Long,
    v3: Boolean,
    v4: Long,
): mozilla.appservices.adsclient.`MozAdsCacheConfig` {
    return mozilla.appservices.adsclient.`MozAdsCacheConfig`(
        liftString(
            v0,
        ),
        liftType11(
            v1,
            v2,
        ),
        liftType11(
            v3,
            v4,
        ),
    )
}

fun writeType50(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCacheConfig`) {
    writeString(buf, offset + 0, value.`dbPath`)
    writeType11(buf, offset + 24, value.`defaultCacheTtlSeconds`)
    writeType11(buf, offset + 40, value.`maxSizeMib`)
}

fun readType50(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCacheConfig` {
    return mozilla.appservices.adsclient.`MozAdsCacheConfig`(
        readString(buf, offset + 0),
        readType11(buf, offset + 24),
        readType11(buf, offset + 40),
    )
}

@JvmName("lowerType12")
fun lowerType12(value: mozilla.appservices.adsclient.`MozAdsCacheMode`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType12")
fun liftType12(value: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCacheMode` {
    return mozilla.appservices.adsclient.`MozAdsCacheMode`.values()[value]
}

fun writeType12(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCacheMode`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType12(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCacheMode` {
    return liftType12(readInt(buf, offset))
}

// Deconstructed version of MozAdsCachePolicy
class DeconstructedType23(
    val v0: Int,
    val v1: Boolean,
    val v2: Long,
)

@JvmName("lowerType23")
fun lowerType23(rec: mozilla.appservices.adsclient.`MozAdsCachePolicy`): DeconstructedType23 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType12(rec.`mode`)
    val uniffiFieldLowered1 = lowerType11(rec.`ttlSeconds`)
    return DeconstructedType23(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
    )
}

@JvmName("liftType23")
fun liftType23(
    v0: Int,
    v1: Boolean,
    v2: Long,
): mozilla.appservices.adsclient.`MozAdsCachePolicy` {
    return mozilla.appservices.adsclient.`MozAdsCachePolicy`(
        liftType12(
            v0,
        ),
        liftType11(
            v1,
            v2,
        ),
    )
}

fun writeType23(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCachePolicy`) {
    writeType12(buf, offset + 0, value.`mode`)
    writeType11(buf, offset + 8, value.`ttlSeconds`)
}

fun readType23(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCachePolicy` {
    return mozilla.appservices.adsclient.`MozAdsCachePolicy`(
        readType12(buf, offset + 0),
        readType11(buf, offset + 8),
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




@JvmName("lowerType33")
fun lowerType33(rec: mozilla.appservices.adsclient.`MozAdsCallbackOptions`): Boolean {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerBoolean(rec.`ohttp`)
    return uniffiFieldLowered0
}

@JvmName("liftType33")
fun liftType33(
    v0: Boolean,
): mozilla.appservices.adsclient.`MozAdsCallbackOptions` {
    return mozilla.appservices.adsclient.`MozAdsCallbackOptions`(
        liftBoolean(
            v0,
        ),
    )
}

fun writeType33(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCallbackOptions`) {
    writeBoolean(buf, offset + 0, value.`ohttp`)
}

fun readType33(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCallbackOptions` {
    return mozilla.appservices.adsclient.`MozAdsCallbackOptions`(
        readBoolean(buf, offset + 0),
    )
}


@JvmName("lowerType14")
fun lowerType14(value: mozilla.appservices.adsclient.`AdsClientUrl`): String? {
    return lowerString(value)
}

@JvmName("liftType14")
fun liftType14(
    v0: String?,
): mozilla.appservices.adsclient.`AdsClientUrl` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType14(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`AdsClientUrl`) {
    writeString(buf, offset, value)
}

fun readType14(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`AdsClientUrl` {
    val builtinValue = readString(buf, offset)
    return builtinValue
}


// Deconstructed version of mozilla.appservices.adsclient.`AdsClientUrl`?
class DeconstructedType15(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType15")
fun lowerType15(value: mozilla.appservices.adsclient.`AdsClientUrl`?): DeconstructedType15 {
    if (value == null) {
        return DeconstructedType15(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType14(value)
        return DeconstructedType15(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType15")
fun liftType15(
    v0: Boolean,
    v1: String?,
): mozilla.appservices.adsclient.`AdsClientUrl`? {
    if (v0) {
        return liftType14(
            v1,
        )
    } else {
        return null
    }
}

fun writeType15(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`AdsClientUrl`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType14(buf, offset + 8, value)
    }
}
fun readType15(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`AdsClientUrl`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType14(buf, offset + 8)
    }
}

// Deconstructed version of MozAdsCallbacks
class DeconstructedType19(
    val v0: String?,
    val v1: String?,
    val v2: Boolean,
    val v3: String?,
)

@JvmName("lowerType19")
fun lowerType19(rec: mozilla.appservices.adsclient.`MozAdsCallbacks`): DeconstructedType19 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType14(rec.`click`)
    val uniffiFieldLowered1 = lowerType14(rec.`impression`)
    val uniffiFieldLowered2 = lowerType15(rec.`report`)
    return DeconstructedType19(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
    )
}

@JvmName("liftType19")
fun liftType19(
    v0: String?,
    v1: String?,
    v2: Boolean,
    v3: String?,
): mozilla.appservices.adsclient.`MozAdsCallbacks` {
    return mozilla.appservices.adsclient.`MozAdsCallbacks`(
        liftType14(
            v0,
        ),
        liftType14(
            v1,
        ),
        liftType15(
            v2,
            v3,
        ),
    )
}

fun writeType19(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCallbacks`) {
    writeType14(buf, offset + 0, value.`click`)
    writeType14(buf, offset + 24, value.`impression`)
    writeType15(buf, offset + 48, value.`report`)
}

fun readType19(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCallbacks` {
    return mozilla.appservices.adsclient.`MozAdsCallbacks`(
        readType14(buf, offset + 0),
        readType14(buf, offset + 24),
        readType15(buf, offset + 48),
    )
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



@JvmName("lowerType17")
fun lowerType17(value: mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType17")
fun liftType17(value: kotlin.Int): mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy` {
    return mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy`.values()[value]
}

fun writeType17(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType17(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy` {
    return liftType17(readInt(buf, offset))
}

// Deconstructed version of MozAdsContentCategory
class DeconstructedType465(
    val v0: java.nio.ByteBuffer?,
    val v1: Int,
)

@JvmName("lowerType465")
fun lowerType465(rec: mozilla.appservices.adsclient.`MozAdsContentCategory`): DeconstructedType465 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`categories`)
    val uniffiFieldLowered1 = lowerType17(rec.`taxonomy`)
    return DeconstructedType465(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType465")
fun liftType465(
    v0: java.nio.ByteBuffer?,
    v1: Int,
): mozilla.appservices.adsclient.`MozAdsContentCategory` {
    return mozilla.appservices.adsclient.`MozAdsContentCategory`(
        liftType16(
            v0,
        ),
        liftType17(
            v1,
        ),
    )
}

fun writeType465(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsContentCategory`) {
    writeType16(buf, offset + 0, value.`categories`)
    writeType17(buf, offset + 16, value.`taxonomy`)
}

fun readType465(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsContentCategory` {
    return mozilla.appservices.adsclient.`MozAdsContentCategory`(
        readType16(buf, offset + 0),
        readType17(buf, offset + 16),
    )
}

// Deconstructed version of MozAdsIABContent
class DeconstructedType21(
    val v0: java.nio.ByteBuffer?,
    val v1: Int,
)

@JvmName("lowerType21")
fun lowerType21(rec: mozilla.appservices.adsclient.`MozAdsIabContent`): DeconstructedType21 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`categoryIds`)
    val uniffiFieldLowered1 = lowerType17(rec.`taxonomy`)
    return DeconstructedType21(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType21")
fun liftType21(
    v0: java.nio.ByteBuffer?,
    v1: Int,
): mozilla.appservices.adsclient.`MozAdsIabContent` {
    return mozilla.appservices.adsclient.`MozAdsIabContent`(
        liftType16(
            v0,
        ),
        liftType17(
            v1,
        ),
    )
}

fun writeType21(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsIabContent`) {
    writeType16(buf, offset + 0, value.`categoryIds`)
    writeType17(buf, offset + 16, value.`taxonomy`)
}

fun readType21(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsIabContent` {
    return mozilla.appservices.adsclient.`MozAdsIabContent`(
        readType16(buf, offset + 0),
        readType17(buf, offset + 16),
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



// Deconstructed version of MozAdsImage
class DeconstructedType29(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: Boolean,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
)

@JvmName("lowerType29")
fun lowerType29(rec: mozilla.appservices.adsclient.`MozAdsImage`): DeconstructedType29 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`altText`)
    val uniffiFieldLowered1 = lowerString(rec.`blockKey`)
    val uniffiFieldLowered2 = lowerType19(rec.`callbacks`)
    val uniffiFieldLowered3 = lowerString(rec.`format`)
    val uniffiFieldLowered4 = lowerType14(rec.`imageUrl`)
    val uniffiFieldLowered5 = lowerType14(rec.`url`)
    return DeconstructedType29(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered2.v2,
        uniffiFieldLowered2.v3,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType29")
fun liftType29(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: Boolean,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
): mozilla.appservices.adsclient.`MozAdsImage` {
    return mozilla.appservices.adsclient.`MozAdsImage`(
        liftOptionString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType19(
            v2,
            v3,
            v4,
            v5,
        ),
        liftString(
            v6,
        ),
        liftType14(
            v7,
        ),
        liftType14(
            v8,
        ),
    )
}

fun writeType29(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsImage`) {
    writeType18(buf, offset + 0, value.`altText`)
    writeString(buf, offset + 32, value.`blockKey`)
    writeType19(buf, offset + 56, value.`callbacks`)
    writeString(buf, offset + 136, value.`format`)
    writeType14(buf, offset + 160, value.`imageUrl`)
    writeType14(buf, offset + 184, value.`url`)
}

fun readType29(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsImage` {
    return mozilla.appservices.adsclient.`MozAdsImage`(
        readType18(buf, offset + 0),
        readString(buf, offset + 32),
        readType19(buf, offset + 56),
        readString(buf, offset + 136),
        readType14(buf, offset + 160),
        readType14(buf, offset + 184),
    )
}


// Deconstructed version of mozilla.appservices.adsclient.`MozAdsIabContent`?
class DeconstructedType20(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
    val v2: Int,
)

@JvmName("lowerType20")
fun lowerType20(value: mozilla.appservices.adsclient.`MozAdsIabContent`?): DeconstructedType20 {
    if (value == null) {
        return DeconstructedType20(
            false,
            null,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType21(value)
        return DeconstructedType20(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
        )
    }
}

@JvmName("liftType20")
fun liftType20(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
    v2: Int,
): mozilla.appservices.adsclient.`MozAdsIabContent`? {
    if (v0) {
        return liftType21(
            v1,
            v2,
        )
    } else {
        return null
    }
}

fun writeType20(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsIabContent`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType21(buf, offset + 8, value)
    }
}
fun readType20(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsIabContent`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType21(buf, offset + 8)
    }
}

// Deconstructed version of MozAdsPlacementRequest
class DeconstructedType36(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
    val v2: Int,
    val v3: String?,
)

@JvmName("lowerType36")
fun lowerType36(rec: mozilla.appservices.adsclient.`MozAdsPlacementRequest`): DeconstructedType36 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType20(rec.`iabContent`)
    val uniffiFieldLowered1 = lowerString(rec.`placementId`)
    return DeconstructedType36(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType36")
fun liftType36(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
    v2: Int,
    v3: String?,
): mozilla.appservices.adsclient.`MozAdsPlacementRequest` {
    return mozilla.appservices.adsclient.`MozAdsPlacementRequest`(
        liftType20(
            v0,
            v1,
            v2,
        ),
        liftString(
            v3,
        ),
    )
}

fun writeType36(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsPlacementRequest`) {
    writeType20(buf, offset + 0, value.`iabContent`)
    writeString(buf, offset + 32, value.`placementId`)
}

fun readType36(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsPlacementRequest` {
    return mozilla.appservices.adsclient.`MozAdsPlacementRequest`(
        readType20(buf, offset + 0),
        readString(buf, offset + 32),
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



// Deconstructed version of MozAdsPlacementRequestWithCount
class DeconstructedType41(
    val v0: Int,
    val v1: Boolean,
    val v2: java.nio.ByteBuffer?,
    val v3: Int,
    val v4: String?,
)

@JvmName("lowerType41")
fun lowerType41(rec: mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`): DeconstructedType41 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerUInt(rec.`count`)
    val uniffiFieldLowered1 = lowerType20(rec.`iabContent`)
    val uniffiFieldLowered2 = lowerString(rec.`placementId`)
    return DeconstructedType41(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType41")
fun liftType41(
    v0: Int,
    v1: Boolean,
    v2: java.nio.ByteBuffer?,
    v3: Int,
    v4: String?,
): mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount` {
    return mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`(
        liftUInt(
            v0,
        ),
        liftType20(
            v1,
            v2,
            v3,
        ),
        liftString(
            v4,
        ),
    )
}

fun writeType41(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`) {
    writeUInt(buf, offset + 0, value.`count`)
    writeType20(buf, offset + 8, value.`iabContent`)
    writeString(buf, offset + 40, value.`placementId`)
}

fun readType41(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount` {
    return mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`(
        readUInt(buf, offset + 0),
        readType20(buf, offset + 8),
        readString(buf, offset + 40),
    )
}


// Deconstructed version of mozilla.appservices.adsclient.`MozAdsCachePolicy`?
class DeconstructedType22(
    val v0: Boolean,
    val v1: Int,
    val v2: Boolean,
    val v3: Long,
)

@JvmName("lowerType22")
fun lowerType22(value: mozilla.appservices.adsclient.`MozAdsCachePolicy`?): DeconstructedType22 {
    if (value == null) {
        return DeconstructedType22(
            false,
            0,
            false,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerType23(value)
        return DeconstructedType22(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
        )
    }
}

@JvmName("liftType22")
fun liftType22(
    v0: Boolean,
    v1: Int,
    v2: Boolean,
    v3: Long,
): mozilla.appservices.adsclient.`MozAdsCachePolicy`? {
    if (v0) {
        return liftType23(
            v1,
            v2,
            v3,
        )
    } else {
        return null
    }
}

fun writeType22(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCachePolicy`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType23(buf, offset + 8, value)
    }
}
fun readType22(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCachePolicy`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType23(buf, offset + 8)
    }
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





@JvmName("lowerType25")
inline fun lowerType25(value: kotlin.collections.Map<kotlin.String, kotlin.Double>): java.nio.ByteBuffer? {
    return uniffi.lowerType25(value)
}

@JvmName("liftType25")
inline fun liftType25(
    v1: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.String, kotlin.Double> {
    return uniffi.liftType25(
        v1
    )
}

inline fun writeType25(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.Double>) {
    uniffi.writeType25(buf, offset, value)
}

inline fun readType25(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.Double> {
    return uniffi.readType25(buf, offset)
}



// Deconstructed version of MozAdsRequestOptions
class DeconstructedType38(
    val v0: java.nio.ByteBuffer?,
    val v1: Boolean,
    val v2: Int,
    val v3: Boolean,
    val v4: Long,
    val v5: java.nio.ByteBuffer?,
    val v6: Boolean,
    val v7: java.nio.ByteBuffer?,
)

@JvmName("lowerType38")
fun lowerType38(rec: mozilla.appservices.adsclient.`MozAdsRequestOptions`): DeconstructedType38 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`blocks`)
    val uniffiFieldLowered1 = lowerType22(rec.`cachePolicy`)
    val uniffiFieldLowered2 = lowerType24(rec.`flags`)
    val uniffiFieldLowered3 = lowerBoolean(rec.`ohttp`)
    val uniffiFieldLowered4 = lowerType25(rec.`relevance`)
    return DeconstructedType38(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType38")
fun liftType38(
    v0: java.nio.ByteBuffer?,
    v1: Boolean,
    v2: Int,
    v3: Boolean,
    v4: Long,
    v5: java.nio.ByteBuffer?,
    v6: Boolean,
    v7: java.nio.ByteBuffer?,
): mozilla.appservices.adsclient.`MozAdsRequestOptions` {
    return mozilla.appservices.adsclient.`MozAdsRequestOptions`(
        liftType16(
            v0,
        ),
        liftType22(
            v1,
            v2,
            v3,
            v4,
        ),
        liftType24(
            v5,
        ),
        liftBoolean(
            v6,
        ),
        liftType25(
            v7,
        ),
    )
}

fun writeType38(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsRequestOptions`) {
    writeType16(buf, offset + 0, value.`blocks`)
    writeType22(buf, offset + 16, value.`cachePolicy`)
    writeType24(buf, offset + 48, value.`flags`)
    writeBoolean(buf, offset + 64, value.`ohttp`)
    writeType25(buf, offset + 72, value.`relevance`)
}

fun readType38(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsRequestOptions` {
    return mozilla.appservices.adsclient.`MozAdsRequestOptions`(
        readType16(buf, offset + 0),
        readType22(buf, offset + 16),
        readType24(buf, offset + 48),
        readBoolean(buf, offset + 64),
        readType25(buf, offset + 72),
    )
}

// Deconstructed version of MozAdsSpocFrequencyCaps
class DeconstructedType26(
    val v0: String?,
    val v1: Int,
)

@JvmName("lowerType26")
fun lowerType26(rec: mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps`): DeconstructedType26 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`capKey`)
    val uniffiFieldLowered1 = lowerUInt(rec.`day`)
    return DeconstructedType26(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType26")
fun liftType26(
    v0: String?,
    v1: Int,
): mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps` {
    return mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps`(
        liftString(
            v0,
        ),
        liftUInt(
            v1,
        ),
    )
}

fun writeType26(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps`) {
    writeString(buf, offset + 0, value.`capKey`)
    writeUInt(buf, offset + 24, value.`day`)
}

fun readType26(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps` {
    return mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps`(
        readString(buf, offset + 0),
        readUInt(buf, offset + 24),
    )
}



@JvmName("lowerType28")
inline fun lowerType28(value: kotlin.collections.Map<kotlin.String, kotlin.UInt>): java.nio.ByteBuffer? {
    return uniffi.lowerType28(value)
}

@JvmName("liftType28")
inline fun liftType28(
    v1: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.String, kotlin.UInt> {
    return uniffi.liftType28(
        v1
    )
}

inline fun writeType28(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.UInt>) {
    uniffi.writeType28(buf, offset, value)
}

inline fun readType28(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.UInt> {
    return uniffi.readType28(buf, offset)
}



// Deconstructed version of MozAdsSpocRanking
class DeconstructedType27(
    val v0: Double,
    val v1: java.nio.ByteBuffer?,
    val v2: Int,
)

@JvmName("lowerType27")
fun lowerType27(rec: mozilla.appservices.adsclient.`MozAdsSpocRanking`): DeconstructedType27 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerDouble(rec.`itemScore`)
    val uniffiFieldLowered1 = lowerType28(rec.`personalizationModels`)
    val uniffiFieldLowered2 = lowerUInt(rec.`priority`)
    return DeconstructedType27(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType27")
fun liftType27(
    v0: Double,
    v1: java.nio.ByteBuffer?,
    v2: Int,
): mozilla.appservices.adsclient.`MozAdsSpocRanking` {
    return mozilla.appservices.adsclient.`MozAdsSpocRanking`(
        liftDouble(
            v0,
        ),
        liftType28(
            v1,
        ),
        liftUInt(
            v2,
        ),
    )
}

fun writeType27(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsSpocRanking`) {
    writeDouble(buf, offset + 0, value.`itemScore`)
    writeType28(buf, offset + 8, value.`personalizationModels`)
    writeUInt(buf, offset + 24, value.`priority`)
}

fun readType27(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsSpocRanking` {
    return mozilla.appservices.adsclient.`MozAdsSpocRanking`(
        readDouble(buf, offset + 0),
        readType28(buf, offset + 8),
        readUInt(buf, offset + 24),
    )
}

// Deconstructed version of MozAdsSpoc
class DeconstructedType30(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Boolean,
    val v4: String?,
    val v5: String?,
    val v6: Int,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: Double,
    val v12: java.nio.ByteBuffer?,
    val v13: Int,
    val v14: String?,
    val v15: String?,
    val v16: String?,
    val v17: String?,
)

@JvmName("lowerType30")
fun lowerType30(rec: mozilla.appservices.adsclient.`MozAdsSpoc`): DeconstructedType30 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`blockKey`)
    val uniffiFieldLowered1 = lowerType19(rec.`callbacks`)
    val uniffiFieldLowered2 = lowerType26(rec.`caps`)
    val uniffiFieldLowered3 = lowerString(rec.`domain`)
    val uniffiFieldLowered4 = lowerString(rec.`excerpt`)
    val uniffiFieldLowered5 = lowerString(rec.`format`)
    val uniffiFieldLowered6 = lowerType14(rec.`imageUrl`)
    val uniffiFieldLowered7 = lowerType27(rec.`ranking`)
    val uniffiFieldLowered8 = lowerString(rec.`sponsor`)
    val uniffiFieldLowered9 = lowerOptionString(rec.`sponsoredByOverride`)
    val uniffiFieldLowered10 = lowerString(rec.`title`)
    val uniffiFieldLowered11 = lowerType14(rec.`url`)
    return DeconstructedType30(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
        uniffiFieldLowered7.v2,
        uniffiFieldLowered8,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
        uniffiFieldLowered11,
    )
}

@JvmName("liftType30")
fun liftType30(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Boolean,
    v4: String?,
    v5: String?,
    v6: Int,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: Double,
    v12: java.nio.ByteBuffer?,
    v13: Int,
    v14: String?,
    v15: String?,
    v16: String?,
    v17: String?,
): mozilla.appservices.adsclient.`MozAdsSpoc` {
    return mozilla.appservices.adsclient.`MozAdsSpoc`(
        liftString(
            v0,
        ),
        liftType19(
            v1,
            v2,
            v3,
            v4,
        ),
        liftType26(
            v5,
            v6,
        ),
        liftString(
            v7,
        ),
        liftString(
            v8,
        ),
        liftString(
            v9,
        ),
        liftType14(
            v10,
        ),
        liftType27(
            v11,
            v12,
            v13,
        ),
        liftString(
            v14,
        ),
        liftOptionString(
            v15,
        ),
        liftString(
            v16,
        ),
        liftType14(
            v17,
        ),
    )
}

fun writeType30(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsSpoc`) {
    writeString(buf, offset + 0, value.`blockKey`)
    writeType19(buf, offset + 24, value.`callbacks`)
    writeType26(buf, offset + 104, value.`caps`)
    writeString(buf, offset + 136, value.`domain`)
    writeString(buf, offset + 160, value.`excerpt`)
    writeString(buf, offset + 184, value.`format`)
    writeType14(buf, offset + 208, value.`imageUrl`)
    writeType27(buf, offset + 232, value.`ranking`)
    writeString(buf, offset + 264, value.`sponsor`)
    writeType18(buf, offset + 288, value.`sponsoredByOverride`)
    writeString(buf, offset + 320, value.`title`)
    writeType14(buf, offset + 344, value.`url`)
}

fun readType30(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsSpoc` {
    return mozilla.appservices.adsclient.`MozAdsSpoc`(
        readString(buf, offset + 0),
        readType19(buf, offset + 24),
        readType26(buf, offset + 104),
        readString(buf, offset + 136),
        readString(buf, offset + 160),
        readString(buf, offset + 184),
        readType14(buf, offset + 208),
        readType27(buf, offset + 232),
        readString(buf, offset + 264),
        readType18(buf, offset + 288),
        readString(buf, offset + 320),
        readType14(buf, offset + 344),
    )
}


@JvmName("lowerType466")
fun lowerType466(rec: mozilla.appservices.adsclient.`MozAdsStoreConfig`): String? {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`dbPath`)
    return uniffiFieldLowered0
}

@JvmName("liftType466")
fun liftType466(
    v0: String?,
): mozilla.appservices.adsclient.`MozAdsStoreConfig` {
    return mozilla.appservices.adsclient.`MozAdsStoreConfig`(
        liftString(
            v0,
        ),
    )
}

fun writeType466(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsStoreConfig`) {
    writeString(buf, offset + 0, value.`dbPath`)
}

fun readType466(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsStoreConfig` {
    return mozilla.appservices.adsclient.`MozAdsStoreConfig`(
        readString(buf, offset + 0),
    )
}

// Deconstructed version of MozAdsTile
class DeconstructedType48(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Boolean,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
)

@JvmName("lowerType48")
fun lowerType48(rec: mozilla.appservices.adsclient.`MozAdsTile`): DeconstructedType48 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`blockKey`)
    val uniffiFieldLowered1 = lowerType19(rec.`callbacks`)
    val uniffiFieldLowered2 = lowerString(rec.`format`)
    val uniffiFieldLowered3 = lowerType14(rec.`imageUrl`)
    val uniffiFieldLowered4 = lowerString(rec.`name`)
    val uniffiFieldLowered5 = lowerType14(rec.`url`)
    return DeconstructedType48(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType48")
fun liftType48(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Boolean,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
): mozilla.appservices.adsclient.`MozAdsTile` {
    return mozilla.appservices.adsclient.`MozAdsTile`(
        liftString(
            v0,
        ),
        liftType19(
            v1,
            v2,
            v3,
            v4,
        ),
        liftString(
            v5,
        ),
        liftType14(
            v6,
        ),
        liftString(
            v7,
        ),
        liftType14(
            v8,
        ),
    )
}

fun writeType48(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsTile`) {
    writeString(buf, offset + 0, value.`blockKey`)
    writeType19(buf, offset + 24, value.`callbacks`)
    writeString(buf, offset + 104, value.`format`)
    writeType14(buf, offset + 128, value.`imageUrl`)
    writeString(buf, offset + 152, value.`name`)
    writeType14(buf, offset + 176, value.`url`)
}

fun readType48(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsTile` {
    return mozilla.appservices.adsclient.`MozAdsTile`(
        readString(buf, offset + 0),
        readType19(buf, offset + 24),
        readString(buf, offset + 104),
        readType14(buf, offset + 128),
        readString(buf, offset + 152),
        readType14(buf, offset + 176),
    )
}

// Deconstructed version of MozAdsClientApiError
class DeconstructedType31(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType31")
fun lowerType31(value: mozilla.appservices.adsclient.`MozAdsClientApiException`): DeconstructedType31 {
    when (value) {
        is mozilla.appservices.adsclient.`MozAdsClientApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType31(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType31")
fun liftType31(
    v0: Int,
    v1: String?,
): mozilla.appservices.adsclient.`MozAdsClientApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.adsclient.`MozAdsClientApiException`.`Other`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType31: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType31(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsClientApiException`) {
    when (value) {
        is mozilla.appservices.adsclient.`MozAdsClientApiException`.`Other` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType31(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsClientApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.adsclient.`MozAdsClientApiException`.`Other`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType31: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of MozAdsEnvironment
class DeconstructedType52(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType52")
fun lowerType52(value: mozilla.appservices.adsclient.`MozAdsEnvironment`): DeconstructedType52 {
    when (value) {
        is mozilla.appservices.adsclient.`MozAdsEnvironment`.`Prod` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType52(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.adsclient.`MozAdsEnvironment`.`Staging` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType52(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.adsclient.`MozAdsEnvironment`.`Custom` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerType14(value.v1)
            return DeconstructedType52(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType52")
fun liftType52(
    v0: Int,
    v1: String?,
): mozilla.appservices.adsclient.`MozAdsEnvironment` {
    when (v0) {
        0 -> {
            return mozilla.appservices.adsclient.`MozAdsEnvironment`.`Prod`
        }
        1 -> {
            return mozilla.appservices.adsclient.`MozAdsEnvironment`.`Staging`
        }
        2 -> {
            return mozilla.appservices.adsclient.`MozAdsEnvironment`.`Custom`(
                liftType14(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType52: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType52(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsEnvironment`) {
    when (value) {
        is mozilla.appservices.adsclient.`MozAdsEnvironment`.`Prod` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.adsclient.`MozAdsEnvironment`.`Staging` -> {
            writeInt(buf, offset, 1);
        }
        is mozilla.appservices.adsclient.`MozAdsEnvironment`.`Custom` -> {
            writeInt(buf, offset, 2);
            writeType14(buf, offset + 8, value.v1)
        }
    }
}

fun readType52(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsEnvironment` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.adsclient.`MozAdsEnvironment`.`Prod`
        }
        1 -> {
            mozilla.appservices.adsclient.`MozAdsEnvironment`.`Staging`
        }
        2 -> {
            mozilla.appservices.adsclient.`MozAdsEnvironment`.`Custom`(
                readType14(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType52: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of MozAdsImageOrSpoc
class DeconstructedType46(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: Boolean,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: String?,
    val v14: Int,
    val v15: String?,
    val v16: String?,
    val v17: String?,
    val v18: String?,
    val v19: Double,
    val v20: java.nio.ByteBuffer?,
    val v21: Int,
    val v22: String?,
    val v23: String?,
    val v24: String?,
    val v25: String?,
)

@JvmName("lowerType46")
fun lowerType46(value: mozilla.appservices.adsclient.`MozAdsImageOrSpoc`): DeconstructedType46 {
    when (value) {
        is mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Image` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType29(value.v1)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered25 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered24 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered18 = uniffiFieldDeconstructed0.v8
            return DeconstructedType46(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                null,
                uniffiFieldLowered5,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                0,
                null,
                null,
                null,
                uniffiFieldLowered18,
                0.0,
                null,
                0,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
                uniffiFieldLowered24,
                uniffiFieldLowered25,
            )
        }
        is mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Spoc` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldDeconstructed0 = lowerType30(value.v1)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered25 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered24 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered18 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered17 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered19 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v12
            val uniffiFieldLowered14 = uniffiFieldDeconstructed0.v13
            val uniffiFieldLowered12 = uniffiFieldDeconstructed0.v14
            val uniffiFieldLowered11 = uniffiFieldDeconstructed0.v15
            val uniffiFieldLowered10 = uniffiFieldDeconstructed0.v16
            val uniffiFieldLowered9 = uniffiFieldDeconstructed0.v17
            return DeconstructedType46(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                null,
                uniffiFieldLowered5,
                null,
                null,
                null,
                uniffiFieldLowered9,
                uniffiFieldLowered10,
                uniffiFieldLowered11,
                uniffiFieldLowered12,
                null,
                uniffiFieldLowered14,
                null,
                uniffiFieldLowered16,
                uniffiFieldLowered17,
                uniffiFieldLowered18,
                uniffiFieldLowered19,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                null,
                uniffiFieldLowered23,
                uniffiFieldLowered24,
                uniffiFieldLowered25,
            )
        }
    }
}

@JvmName("liftType46")
fun liftType46(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: Boolean,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: String?,
    v14: Int,
    v15: String?,
    v16: String?,
    v17: String?,
    v18: String?,
    v19: Double,
    v20: java.nio.ByteBuffer?,
    v21: Int,
    v22: String?,
    v23: String?,
    v24: String?,
    v25: String?,
): mozilla.appservices.adsclient.`MozAdsImageOrSpoc` {
    when (v0) {
        0 -> {
            return mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Image`(
                liftType29(
                    v1,
                    v25,
                    v24,
                    v23,
                    v5,
                    v22,
                    v2,
                    v3,
                    v18,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Spoc`(
                liftType30(
                    v1,
                    v25,
                    v24,
                    v5,
                    v23,
                    v2,
                    v21,
                    v3,
                    v18,
                    v17,
                    v16,
                    v19,
                    v20,
                    v14,
                    v12,
                    v11,
                    v10,
                    v9,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType46: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType46(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsImageOrSpoc`) {
    when (value) {
        is mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Image` -> {
            writeInt(buf, offset, 0);
            writeType29(buf, offset + 8, value.v1)
        }
        is mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Spoc` -> {
            writeInt(buf, offset, 1);
            writeType30(buf, offset + 8, value.v1)
        }
    }
}

fun readType46(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsImageOrSpoc` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Image`(
                readType29(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.adsclient.`MozAdsImageOrSpoc`.`Spoc`(
                readType30(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType46: Invalid enum discriminant: ${discriminant}")
        }
    }
}

@JvmName("lowerType34")
fun lowerType34(value: mozilla.appservices.adsclient.`MozAdsReportReason`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType34")
fun liftType34(value: kotlin.Int): mozilla.appservices.adsclient.`MozAdsReportReason` {
    return mozilla.appservices.adsclient.`MozAdsReportReason`.values()[value]
}

fun writeType34(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsReportReason`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType34(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsReportReason` {
    return liftType34(readInt(buf, offset))
}


// Deconstructed version of mozilla.appservices.adsclient.`MozAdsCallbackOptions`?
class DeconstructedType32(
    val v0: Boolean,
    val v1: Boolean,
)

@JvmName("lowerType32")
fun lowerType32(value: mozilla.appservices.adsclient.`MozAdsCallbackOptions`?): DeconstructedType32 {
    if (value == null) {
        return DeconstructedType32(
            false,
            false,
        )
    } else {
        val uniffiFieldLowered = lowerType33(value)
        return DeconstructedType32(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType32")
fun liftType32(
    v0: Boolean,
    v1: Boolean,
): mozilla.appservices.adsclient.`MozAdsCallbackOptions`? {
    if (v0) {
        return liftType33(
            v1,
        )
    } else {
        return null
    }
}

fun writeType32(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsCallbackOptions`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType33(buf, offset + 1, value)
    }
}
fun readType32(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsCallbackOptions`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType33(buf, offset + 1)
    }
}


fun lowerToBuffer35(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 56).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType36(buf, offset, it)
        offset += 56
    }
    return buf
}

fun liftFromBuffer35(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 56
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType36(buf, offset))
                offset += 56
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType35")
fun lowerType35(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`>): java.nio.ByteBuffer {
    return lowerToBuffer35(value)
}

@JvmName("liftType35")
fun liftType35(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`> {
    return liftFromBuffer35(buf)
}

fun writeType35(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`>) {
    val childBuf = lowerToBuffer35(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType35(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer35(childBuf)
}


// Deconstructed version of mozilla.appservices.adsclient.`MozAdsRequestOptions`?
class DeconstructedType37(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
    val v2: Boolean,
    val v3: Int,
    val v4: Boolean,
    val v5: Long,
    val v6: java.nio.ByteBuffer?,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
)

@JvmName("lowerType37")
fun lowerType37(value: mozilla.appservices.adsclient.`MozAdsRequestOptions`?): DeconstructedType37 {
    if (value == null) {
        return DeconstructedType37(
            false,
            null,
            false,
            0,
            false,
            0L,
            null,
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType38(value)
        return DeconstructedType37(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
            uniffiFieldLowered.v4,
            uniffiFieldLowered.v5,
            uniffiFieldLowered.v6,
            uniffiFieldLowered.v7,
        )
    }
}

@JvmName("liftType37")
fun liftType37(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
    v2: Boolean,
    v3: Int,
    v4: Boolean,
    v5: Long,
    v6: java.nio.ByteBuffer?,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
): mozilla.appservices.adsclient.`MozAdsRequestOptions`? {
    if (v0) {
        return liftType38(
            v1,
            v2,
            v3,
            v4,
            v5,
            v6,
            v7,
            v8,
        )
    } else {
        return null
    }
}

fun writeType37(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsRequestOptions`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType38(buf, offset + 8, value)
    }
}
fun readType37(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsRequestOptions`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType38(buf, offset + 8)
    }
}


@JvmName("lowerType39")
fun lowerType39(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsImage`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 232).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType29(buf, offset + 24, it.value)
        offset += 232
    }
    return buf
}

@JvmName("liftType39")
fun liftType39(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsImage`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 232
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType29(buf, offset + 24),
                )
                offset += 232
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType39(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsImage`>) {
    val childBuf = lowerType39(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType39(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsImage`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType39(childBuf)
}


fun lowerToBuffer40(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 64).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType41(buf, offset, it)
        offset += 64
    }
    return buf
}

fun liftFromBuffer40(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 64
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType41(buf, offset))
                offset += 64
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType40")
fun lowerType40(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`>): java.nio.ByteBuffer {
    return lowerToBuffer40(value)
}

@JvmName("liftType40")
fun liftType40(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`> {
    return liftFromBuffer40(buf)
}

fun writeType40(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`>) {
    val childBuf = lowerToBuffer40(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType40(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer40(childBuf)
}


fun lowerToBuffer43(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 368).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType30(buf, offset, it)
        offset += 368
    }
    return buf
}

fun liftFromBuffer43(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 368
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType30(buf, offset))
                offset += 368
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType43")
fun lowerType43(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>): java.nio.ByteBuffer {
    return lowerToBuffer43(value)
}

@JvmName("liftType43")
fun liftType43(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`> {
    return liftFromBuffer43(buf)
}

fun writeType43(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>) {
    val childBuf = lowerToBuffer43(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType43(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer43(childBuf)
}


@JvmName("lowerType42")
fun lowerType42(value: kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 40).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType43(buf, offset + 24, it.value)
        offset += 40
    }
    return buf
}

@JvmName("liftType42")
fun liftType42(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 40
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType43(buf, offset + 24),
                )
                offset += 40
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType42(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>>) {
    val childBuf = lowerType42(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType42(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType42(childBuf)
}


fun lowerToBuffer45(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 376).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType46(buf, offset, it)
        offset += 376
    }
    return buf
}

fun liftFromBuffer45(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 376
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType46(buf, offset))
                offset += 376
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType45")
fun lowerType45(value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>): java.nio.ByteBuffer {
    return lowerToBuffer45(value)
}

@JvmName("liftType45")
fun liftType45(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`> {
    return liftFromBuffer45(buf)
}

fun writeType45(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>) {
    val childBuf = lowerToBuffer45(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType45(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer45(childBuf)
}


@JvmName("lowerType44")
fun lowerType44(value: kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 40).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType45(buf, offset + 24, it.value)
        offset += 40
    }
    return buf
}

@JvmName("liftType44")
fun liftType44(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 40
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType45(buf, offset + 24),
                )
                offset += 40
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType44(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>>) {
    val childBuf = lowerType44(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType44(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType44(childBuf)
}


@JvmName("lowerType47")
fun lowerType47(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsTile`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 224).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType48(buf, offset + 24, it.value)
        offset += 224
    }
    return buf
}

@JvmName("liftType47")
fun liftType47(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsTile`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 224
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType48(buf, offset + 24),
                )
                offset += 224
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType47(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsTile`>) {
    val childBuf = lowerType47(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType47(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsTile`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType47(childBuf)
}

fun objectToHandle49(obj: mozilla.appservices.adsclient.`MozAdsClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject49(handle: kotlin.Long): mozilla.appservices.adsclient.`MozAdsClient` {
    return mozilla.appservices.adsclient.`MozAdsClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef49")
fun lowerObjectRef49(value: mozilla.appservices.adsclient.`MozAdsClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType49")
fun lowerType49(value: mozilla.appservices.adsclient.`MozAdsClient`): kotlin.Long {
    return objectToHandle49(value)
}

@JvmName("liftType49")
fun liftType49(handle: kotlin.Long): mozilla.appservices.adsclient.`MozAdsClient` {
    return handleToObject49(handle)
}

fun writeType49(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsClient`) {
    writeLong(buf, offset, objectToHandle49(value))
}

fun readType49(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsClient` {
    return handleToObject49(readLong(buf, offset))
}


public val callbackInterfaceHandleMap53 = uniffi.HandleMap<mozilla.appservices.adsclient.`MozAdsTelemetry`>();
fun callbackInterfaceDispatch53000000(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap53.get(uniffiHandle)
    val `label` = liftString(
        `uniffiArg1`,
    )
    val `value` = liftString(
        `uniffiArg2`,
    )
    val uniffiReturn = uniffiObj.`recordBuildCacheError`(
        `label`,
        `value`,
    )
}
fun callbackInterfaceDispatch53000001(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap53.get(uniffiHandle)
    val `label` = liftString(
        `uniffiArg1`,
    )
    val `value` = liftString(
        `uniffiArg2`,
    )
    val uniffiReturn = uniffiObj.`recordClientError`(
        `label`,
        `value`,
    )
}
fun callbackInterfaceDispatch53000002(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap53.get(uniffiHandle)
    val `label` = liftString(
        `uniffiArg1`,
    )
    val uniffiReturn = uniffiObj.`recordClientOperationTotal`(
        `label`,
    )
}
fun callbackInterfaceDispatch53000003(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap53.get(uniffiHandle)
    val `label` = liftString(
        `uniffiArg1`,
    )
    val `value` = liftString(
        `uniffiArg2`,
    )
    val uniffiReturn = uniffiObj.`recordDeserializationError`(
        `label`,
        `value`,
    )
}
fun callbackInterfaceDispatch53000004(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap53.get(uniffiHandle)
    val `label` = liftString(
        `uniffiArg1`,
    )
    val `value` = liftString(
        `uniffiArg2`,
    )
    val uniffiReturn = uniffiObj.`recordHttpCacheOutcome`(
        `label`,
        `value`,
    )
}

fun callbackInterfaceFree53(handle: kotlin.Long) {
    callbackInterfaceHandleMap53.remove(handle)
}
fun lowerType53(value: mozilla.appservices.adsclient.`MozAdsTelemetry`): kotlin.Long {
    return callbackInterfaceHandleMap53.insert(value)
}

fun writeType53(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsTelemetry`) {
    writeLong(buf, offset, callbackInterfaceHandleMap53.insert(value))
}

// Note: no read/lift function, since callback interfaces can't be passed back from Rust to Kotlin

fun objectToHandle51(obj: mozilla.appservices.adsclient.`MozAdsClientBuilder`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject51(handle: kotlin.Long): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
    return mozilla.appservices.adsclient.`MozAdsClientBuilder`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef51")
fun lowerObjectRef51(value: mozilla.appservices.adsclient.`MozAdsClientBuilder`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType51")
fun lowerType51(value: mozilla.appservices.adsclient.`MozAdsClientBuilder`): kotlin.Long {
    return objectToHandle51(value)
}

@JvmName("liftType51")
fun liftType51(handle: kotlin.Long): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
    return handleToObject51(handle)
}

fun writeType51(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.adsclient.`MozAdsClientBuilder`) {
    writeLong(buf, offset, objectToHandle51(value))
}

fun readType51(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
    return handleToObject51(readLong(buf, offset))
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




inline fun lowerBytesRef(v: java.nio.ByteBuffer): java.nio.ByteBuffer? {
    return uniffi.lowerBytesRef(v)
}

object Scaffolding {
    init {
        // Reference uniffi.Scaffolding to ensure it's init() function runs
        @Suppress("UNUSED_EXPRESSION")
        uniffi.Scaffolding
    }
    @JvmName("methodAdsClientMozAdsClientClearCache")
    @JvmStatic external fun methodAdsClientMozAdsClientClearCache(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAdsClientMozAdsClientRecordClick")
    @JvmStatic external fun methodAdsClientMozAdsClientRecordClick(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: Boolean,
    )
    @JvmName("methodAdsClientMozAdsClientRecordImpression")
    @JvmStatic external fun methodAdsClientMozAdsClientRecordImpression(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: Boolean,
    )
    @JvmName("methodAdsClientMozAdsClientReportAd")
    @JvmStatic external fun methodAdsClientMozAdsClientReportAd(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: Boolean,
    )
    @JvmName("methodAdsClientMozAdsClientRequestImageAds")
    @JvmStatic external fun methodAdsClientMozAdsClientRequestImageAds(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: Int,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Long,
        `uniffiArg8`: java.nio.ByteBuffer?,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAdsClientMozAdsClientRequestSpocAds")
    @JvmStatic external fun methodAdsClientMozAdsClientRequestSpocAds(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: Int,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Long,
        `uniffiArg8`: java.nio.ByteBuffer?,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAdsClientMozAdsClientRequestSpocOrImageAds")
    @JvmStatic external fun methodAdsClientMozAdsClientRequestSpocOrImageAds(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: Int,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Long,
        `uniffiArg8`: java.nio.ByteBuffer?,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAdsClientMozAdsClientRequestTileAds")
    @JvmStatic external fun methodAdsClientMozAdsClientRequestTileAds(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: java.nio.ByteBuffer?,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: Int,
        `uniffiArg6`: Boolean,
        `uniffiArg7`: Long,
        `uniffiArg8`: java.nio.ByteBuffer?,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAdsClientMozAdsClientShutdown")
    @JvmStatic external fun methodAdsClientMozAdsClientShutdown(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAdsClientMozAdsClientBuilderBuild")
    @JvmStatic external fun methodAdsClientMozAdsClientBuilderBuild(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAdsClientMozAdsClientBuilderCacheConfig")
    @JvmStatic external fun methodAdsClientMozAdsClientBuilderCacheConfig(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
        `uniffiArg3`: Long,
        `uniffiArg4`: Boolean,
        `uniffiArg5`: Long,
    ) : Long
    @JvmName("methodAdsClientMozAdsClientBuilderEnvironment")
    @JvmStatic external fun methodAdsClientMozAdsClientBuilderEnvironment(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
    ) : Long
    @JvmName("methodAdsClientMozAdsClientBuilderTelemetry")
    @JvmStatic external fun methodAdsClientMozAdsClientBuilderTelemetry(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : Long
    @JvmName("constructorAdsClientMozAdsClientBuilderNew")
    @JvmStatic external fun constructorAdsClientMozAdsClientBuilderNew(
    ) : Long
    @JvmStatic external fun objectCloneHandle49(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree49(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle51(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree51(handle: kotlin.Long)
}