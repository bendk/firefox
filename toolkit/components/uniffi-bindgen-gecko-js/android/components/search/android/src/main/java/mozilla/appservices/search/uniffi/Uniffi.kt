@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.search.uniffi
import uniffi.DeconstructedType328
import uniffi.DeconstructedType99



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



@JvmName("lowerType347")
fun lowerType347(value: mozilla.appservices.search.`JsonEngineMethod`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType347")
fun liftType347(value: kotlin.Int): mozilla.appservices.search.`JsonEngineMethod` {
    return mozilla.appservices.search.`JsonEngineMethod`.values()[value]
}

fun writeType347(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`JsonEngineMethod`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType347(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`JsonEngineMethod` {
    return liftType347(readInt(buf, offset))
}


// Deconstructed version of mozilla.appservices.search.`JsonEngineMethod`?
class DeconstructedType346(
    val v0: Boolean,
    val v1: Int,
)

@JvmName("lowerType346")
fun lowerType346(value: mozilla.appservices.search.`JsonEngineMethod`?): DeconstructedType346 {
    if (value == null) {
        return DeconstructedType346(
            false,
            0,
        )
    } else {
        val uniffiFieldLowered = lowerType347(value)
        return DeconstructedType346(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType346")
fun liftType346(
    v0: Boolean,
    v1: Int,
): mozilla.appservices.search.`JsonEngineMethod`? {
    if (v0) {
        return liftType347(
            v1,
        )
    } else {
        return null
    }
}

fun writeType346(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`JsonEngineMethod`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType347(buf, offset + 4, value)
    }
}
fun readType346(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`JsonEngineMethod`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType347(buf, offset + 4)
    }
}

// Deconstructed version of SearchUrlParam
class DeconstructedType350(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType350")
fun lowerType350(rec: mozilla.appservices.search.`SearchUrlParam`): DeconstructedType350 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`name`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`value`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`enterpriseValue`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`experimentConfig`)
    return DeconstructedType350(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType350")
fun liftType350(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
): mozilla.appservices.search.`SearchUrlParam` {
    return mozilla.appservices.search.`SearchUrlParam`(
        liftString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftOptionString(
            v3,
        ),
    )
}

fun writeType350(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchUrlParam`) {
    writeString(buf, offset + 0, value.`name`)
    writeType18(buf, offset + 24, value.`value`)
    writeType18(buf, offset + 56, value.`enterpriseValue`)
    writeType18(buf, offset + 88, value.`experimentConfig`)
}

fun readType350(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchUrlParam` {
    return mozilla.appservices.search.`SearchUrlParam`(
        readString(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
        readType18(buf, offset + 88),
    )
}


fun lowerToBuffer349(value: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 120).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType350(buf, offset, it)
        offset += 120
    }
    return buf
}

fun liftFromBuffer349(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 120
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType350(buf, offset))
                offset += 120
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType349")
fun lowerType349(value: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>): java.nio.ByteBuffer {
    return lowerToBuffer349(value)
}

@JvmName("liftType349")
fun liftType349(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`> {
    return liftFromBuffer349(buf)
}

fun writeType349(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>) {
    val childBuf = lowerToBuffer349(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType349(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer349(childBuf)
}


// Deconstructed version of kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>?
class DeconstructedType348(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType348")
fun lowerType348(value: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>?): DeconstructedType348 {
    if (value == null) {
        return DeconstructedType348(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType349(value)
        return DeconstructedType348(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType348")
fun liftType348(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>? {
    if (v0) {
        return liftType349(
            v1,
        )
    } else {
        return null
    }
}

fun writeType348(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType349(buf, offset + 8, value)
    }
}
fun readType348(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType349(buf, offset + 8)
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





@JvmName("lowerType328")
inline fun lowerType328(value: kotlin.collections.Map<kotlin.String, kotlin.String>?): DeconstructedType328 {
    return uniffi.lowerType328(value)
}

@JvmName("liftType328")
inline fun liftType328(
    v1: Boolean,
    v2: java.nio.ByteBuffer?
): kotlin.collections.Map<kotlin.String, kotlin.String>? {
    return uniffi.liftType328(
        v1,
        v2
    )
}

inline fun writeType328(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.String>?) {
    uniffi.writeType328(buf, offset, value)
}

inline fun readType328(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.String>? {
    return uniffi.readType328(buf, offset)
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



// Deconstructed version of JSONEngineUrl
class DeconstructedType352(
    val v0: String?,
    val v1: Boolean,
    val v2: Int,
    val v3: Boolean,
    val v4: java.nio.ByteBuffer?,
    val v5: String?,
    val v6: Boolean,
    val v7: java.nio.ByteBuffer?,
    val v8: String?,
    val v9: Boolean,
    val v10: Boolean,
    val v11: java.nio.ByteBuffer?,
)

@JvmName("lowerType352")
fun lowerType352(rec: mozilla.appservices.search.`JsonEngineUrl`): DeconstructedType352 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`base`)
    val uniffiFieldLowered1 = lowerType346(rec.`method`)
    val uniffiFieldLowered2 = lowerType348(rec.`params`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`searchTermParamName`)
    val uniffiFieldLowered4 = lowerType328(rec.`displayNameMap`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`isNewUntil`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`excludePartnerCodeFromTelemetry`)
    val uniffiFieldLowered7 = lowerType99(rec.`acceptedContentTypes`)
    return DeconstructedType352(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
    )
}

@JvmName("liftType352")
fun liftType352(
    v0: String?,
    v1: Boolean,
    v2: Int,
    v3: Boolean,
    v4: java.nio.ByteBuffer?,
    v5: String?,
    v6: Boolean,
    v7: java.nio.ByteBuffer?,
    v8: String?,
    v9: Boolean,
    v10: Boolean,
    v11: java.nio.ByteBuffer?,
): mozilla.appservices.search.`JsonEngineUrl` {
    return mozilla.appservices.search.`JsonEngineUrl`(
        liftOptionString(
            v0,
        ),
        liftType346(
            v1,
            v2,
        ),
        liftType348(
            v3,
            v4,
        ),
        liftOptionString(
            v5,
        ),
        liftType328(
            v6,
            v7,
        ),
        liftOptionString(
            v8,
        ),
        liftBoolean(
            v9,
        ),
        liftType99(
            v10,
            v11,
        ),
    )
}

fun writeType352(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`JsonEngineUrl`) {
    writeType18(buf, offset + 0, value.`base`)
    writeType346(buf, offset + 32, value.`method`)
    writeType348(buf, offset + 40, value.`params`)
    writeType18(buf, offset + 64, value.`searchTermParamName`)
    writeType328(buf, offset + 96, value.`displayNameMap`)
    writeType18(buf, offset + 120, value.`isNewUntil`)
    writeBoolean(buf, offset + 152, value.`excludePartnerCodeFromTelemetry`)
    writeType99(buf, offset + 160, value.`acceptedContentTypes`)
}

fun readType352(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`JsonEngineUrl` {
    return mozilla.appservices.search.`JsonEngineUrl`(
        readType18(buf, offset + 0),
        readType346(buf, offset + 32),
        readType348(buf, offset + 40),
        readType18(buf, offset + 64),
        readType328(buf, offset + 96),
        readType18(buf, offset + 120),
        readBoolean(buf, offset + 152),
        readType99(buf, offset + 160),
    )
}


// Deconstructed version of mozilla.appservices.search.`JsonEngineUrl`?
class DeconstructedType351(
    val v0: Boolean,
    val v1: String?,
    val v2: Boolean,
    val v3: Int,
    val v4: Boolean,
    val v5: java.nio.ByteBuffer?,
    val v6: String?,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
    val v9: String?,
    val v10: Boolean,
    val v11: Boolean,
    val v12: java.nio.ByteBuffer?,
)

@JvmName("lowerType351")
fun lowerType351(value: mozilla.appservices.search.`JsonEngineUrl`?): DeconstructedType351 {
    if (value == null) {
        return DeconstructedType351(
            false,
            null,
            false,
            0,
            false,
            null,
            null,
            false,
            null,
            null,
            false,
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType352(value)
        return DeconstructedType351(
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
        )
    }
}

@JvmName("liftType351")
fun liftType351(
    v0: Boolean,
    v1: String?,
    v2: Boolean,
    v3: Int,
    v4: Boolean,
    v5: java.nio.ByteBuffer?,
    v6: String?,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
    v9: String?,
    v10: Boolean,
    v11: Boolean,
    v12: java.nio.ByteBuffer?,
): mozilla.appservices.search.`JsonEngineUrl`? {
    if (v0) {
        return liftType352(
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
        )
    } else {
        return null
    }
}

fun writeType351(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`JsonEngineUrl`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType352(buf, offset + 8, value)
    }
}
fun readType351(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`JsonEngineUrl`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType352(buf, offset + 8)
    }
}

// Deconstructed version of JSONEngineUrls
class DeconstructedType6252(
    val v0: Boolean,
    val v1: String?,
    val v2: Boolean,
    val v3: Int,
    val v4: Boolean,
    val v5: java.nio.ByteBuffer?,
    val v6: String?,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
    val v9: String?,
    val v10: Boolean,
    val v11: Boolean,
    val v12: java.nio.ByteBuffer?,
    val v13: Boolean,
    val v14: String?,
    val v15: Boolean,
    val v16: Int,
    val v17: Boolean,
    val v18: java.nio.ByteBuffer?,
    val v19: String?,
    val v20: Boolean,
    val v21: java.nio.ByteBuffer?,
    val v22: String?,
    val v23: Boolean,
    val v24: Boolean,
    val v25: java.nio.ByteBuffer?,
    val v26: Boolean,
    val v27: String?,
    val v28: Boolean,
    val v29: Int,
    val v30: Boolean,
    val v31: java.nio.ByteBuffer?,
    val v32: String?,
    val v33: Boolean,
    val v34: java.nio.ByteBuffer?,
    val v35: String?,
    val v36: Boolean,
    val v37: Boolean,
    val v38: java.nio.ByteBuffer?,
    val v39: Boolean,
    val v40: String?,
    val v41: Boolean,
    val v42: Int,
    val v43: Boolean,
    val v44: java.nio.ByteBuffer?,
    val v45: String?,
    val v46: Boolean,
    val v47: java.nio.ByteBuffer?,
    val v48: String?,
    val v49: Boolean,
    val v50: Boolean,
    val v51: java.nio.ByteBuffer?,
    val v52: Boolean,
    val v53: String?,
    val v54: Boolean,
    val v55: Int,
    val v56: Boolean,
    val v57: java.nio.ByteBuffer?,
    val v58: String?,
    val v59: Boolean,
    val v60: java.nio.ByteBuffer?,
    val v61: String?,
    val v62: Boolean,
    val v63: Boolean,
    val v64: java.nio.ByteBuffer?,
)

@JvmName("lowerType6252")
fun lowerType6252(rec: mozilla.appservices.search.`JsonEngineUrls`): DeconstructedType6252 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType351(rec.`search`)
    val uniffiFieldLowered1 = lowerType351(rec.`suggestions`)
    val uniffiFieldLowered2 = lowerType351(rec.`trending`)
    val uniffiFieldLowered3 = lowerType351(rec.`searchForm`)
    val uniffiFieldLowered4 = lowerType351(rec.`visualSearch`)
    return DeconstructedType6252(
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
        uniffiFieldLowered0.v11,
        uniffiFieldLowered0.v12,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered1.v4,
        uniffiFieldLowered1.v5,
        uniffiFieldLowered1.v6,
        uniffiFieldLowered1.v7,
        uniffiFieldLowered1.v8,
        uniffiFieldLowered1.v9,
        uniffiFieldLowered1.v10,
        uniffiFieldLowered1.v11,
        uniffiFieldLowered1.v12,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered2.v2,
        uniffiFieldLowered2.v3,
        uniffiFieldLowered2.v4,
        uniffiFieldLowered2.v5,
        uniffiFieldLowered2.v6,
        uniffiFieldLowered2.v7,
        uniffiFieldLowered2.v8,
        uniffiFieldLowered2.v9,
        uniffiFieldLowered2.v10,
        uniffiFieldLowered2.v11,
        uniffiFieldLowered2.v12,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered3.v2,
        uniffiFieldLowered3.v3,
        uniffiFieldLowered3.v4,
        uniffiFieldLowered3.v5,
        uniffiFieldLowered3.v6,
        uniffiFieldLowered3.v7,
        uniffiFieldLowered3.v8,
        uniffiFieldLowered3.v9,
        uniffiFieldLowered3.v10,
        uniffiFieldLowered3.v11,
        uniffiFieldLowered3.v12,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered4.v2,
        uniffiFieldLowered4.v3,
        uniffiFieldLowered4.v4,
        uniffiFieldLowered4.v5,
        uniffiFieldLowered4.v6,
        uniffiFieldLowered4.v7,
        uniffiFieldLowered4.v8,
        uniffiFieldLowered4.v9,
        uniffiFieldLowered4.v10,
        uniffiFieldLowered4.v11,
        uniffiFieldLowered4.v12,
    )
}

@JvmName("liftType6252")
fun liftType6252(
    v0: Boolean,
    v1: String?,
    v2: Boolean,
    v3: Int,
    v4: Boolean,
    v5: java.nio.ByteBuffer?,
    v6: String?,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
    v9: String?,
    v10: Boolean,
    v11: Boolean,
    v12: java.nio.ByteBuffer?,
    v13: Boolean,
    v14: String?,
    v15: Boolean,
    v16: Int,
    v17: Boolean,
    v18: java.nio.ByteBuffer?,
    v19: String?,
    v20: Boolean,
    v21: java.nio.ByteBuffer?,
    v22: String?,
    v23: Boolean,
    v24: Boolean,
    v25: java.nio.ByteBuffer?,
    v26: Boolean,
    v27: String?,
    v28: Boolean,
    v29: Int,
    v30: Boolean,
    v31: java.nio.ByteBuffer?,
    v32: String?,
    v33: Boolean,
    v34: java.nio.ByteBuffer?,
    v35: String?,
    v36: Boolean,
    v37: Boolean,
    v38: java.nio.ByteBuffer?,
    v39: Boolean,
    v40: String?,
    v41: Boolean,
    v42: Int,
    v43: Boolean,
    v44: java.nio.ByteBuffer?,
    v45: String?,
    v46: Boolean,
    v47: java.nio.ByteBuffer?,
    v48: String?,
    v49: Boolean,
    v50: Boolean,
    v51: java.nio.ByteBuffer?,
    v52: Boolean,
    v53: String?,
    v54: Boolean,
    v55: Int,
    v56: Boolean,
    v57: java.nio.ByteBuffer?,
    v58: String?,
    v59: Boolean,
    v60: java.nio.ByteBuffer?,
    v61: String?,
    v62: Boolean,
    v63: Boolean,
    v64: java.nio.ByteBuffer?,
): mozilla.appservices.search.`JsonEngineUrls` {
    return mozilla.appservices.search.`JsonEngineUrls`(
        liftType351(
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
            v11,
            v12,
        ),
        liftType351(
            v13,
            v14,
            v15,
            v16,
            v17,
            v18,
            v19,
            v20,
            v21,
            v22,
            v23,
            v24,
            v25,
        ),
        liftType351(
            v26,
            v27,
            v28,
            v29,
            v30,
            v31,
            v32,
            v33,
            v34,
            v35,
            v36,
            v37,
            v38,
        ),
        liftType351(
            v39,
            v40,
            v41,
            v42,
            v43,
            v44,
            v45,
            v46,
            v47,
            v48,
            v49,
            v50,
            v51,
        ),
        liftType351(
            v52,
            v53,
            v54,
            v55,
            v56,
            v57,
            v58,
            v59,
            v60,
            v61,
            v62,
            v63,
            v64,
        ),
    )
}

fun writeType6252(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`JsonEngineUrls`) {
    writeType351(buf, offset + 0, value.`search`)
    writeType351(buf, offset + 192, value.`suggestions`)
    writeType351(buf, offset + 384, value.`trending`)
    writeType351(buf, offset + 576, value.`searchForm`)
    writeType351(buf, offset + 768, value.`visualSearch`)
}

fun readType6252(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`JsonEngineUrls` {
    return mozilla.appservices.search.`JsonEngineUrls`(
        readType351(buf, offset + 0),
        readType351(buf, offset + 192),
        readType351(buf, offset + 384),
        readType351(buf, offset + 576),
        readType351(buf, offset + 768),
    )
}

@JvmName("lowerType357")
fun lowerType357(value: mozilla.appservices.search.`SearchEngineClassification`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType357")
fun liftType357(value: kotlin.Int): mozilla.appservices.search.`SearchEngineClassification` {
    return mozilla.appservices.search.`SearchEngineClassification`.values()[value]
}

fun writeType357(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineClassification`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType357(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineClassification` {
    return liftType357(readInt(buf, offset))
}

// Deconstructed version of SearchEngineUrl
class DeconstructedType363(
    val v0: String?,
    val v1: String?,
    val v2: java.nio.ByteBuffer?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Boolean,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
)

@JvmName("lowerType363")
fun lowerType363(rec: mozilla.appservices.search.`SearchEngineUrl`): DeconstructedType363 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`base`)
    val uniffiFieldLowered1 = lowerString(rec.`method`)
    val uniffiFieldLowered2 = lowerType349(rec.`params`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`searchTermParamName`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`displayName`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`isNewUntil`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`excludePartnerCodeFromTelemetry`)
    val uniffiFieldLowered7 = lowerType99(rec.`acceptedContentTypes`)
    return DeconstructedType363(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
    )
}

@JvmName("liftType363")
fun liftType363(
    v0: String?,
    v1: String?,
    v2: java.nio.ByteBuffer?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Boolean,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
): mozilla.appservices.search.`SearchEngineUrl` {
    return mozilla.appservices.search.`SearchEngineUrl`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType349(
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
        liftBoolean(
            v6,
        ),
        liftType99(
            v7,
            v8,
        ),
    )
}

fun writeType363(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineUrl`) {
    writeString(buf, offset + 0, value.`base`)
    writeString(buf, offset + 24, value.`method`)
    writeType349(buf, offset + 48, value.`params`)
    writeType18(buf, offset + 64, value.`searchTermParamName`)
    writeType18(buf, offset + 96, value.`displayName`)
    writeType18(buf, offset + 128, value.`isNewUntil`)
    writeBoolean(buf, offset + 160, value.`excludePartnerCodeFromTelemetry`)
    writeType99(buf, offset + 168, value.`acceptedContentTypes`)
}

fun readType363(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineUrl` {
    return mozilla.appservices.search.`SearchEngineUrl`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType349(buf, offset + 48),
        readType18(buf, offset + 64),
        readType18(buf, offset + 96),
        readType18(buf, offset + 128),
        readBoolean(buf, offset + 160),
        readType99(buf, offset + 168),
    )
}


// Deconstructed version of mozilla.appservices.search.`SearchEngineUrl`?
class DeconstructedType364(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: java.nio.ByteBuffer?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: Boolean,
    val v8: Boolean,
    val v9: java.nio.ByteBuffer?,
)

@JvmName("lowerType364")
fun lowerType364(value: mozilla.appservices.search.`SearchEngineUrl`?): DeconstructedType364 {
    if (value == null) {
        return DeconstructedType364(
            false,
            null,
            null,
            null,
            null,
            null,
            null,
            false,
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType363(value)
        return DeconstructedType364(
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

@JvmName("liftType364")
fun liftType364(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: java.nio.ByteBuffer?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: Boolean,
    v8: Boolean,
    v9: java.nio.ByteBuffer?,
): mozilla.appservices.search.`SearchEngineUrl`? {
    if (v0) {
        return liftType363(
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

fun writeType364(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineUrl`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType363(buf, offset + 8, value)
    }
}
fun readType364(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineUrl`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType363(buf, offset + 8)
    }
}

// Deconstructed version of SearchEngineUrls
class DeconstructedType358(
    val v0: String?,
    val v1: String?,
    val v2: java.nio.ByteBuffer?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Boolean,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
    val v9: Boolean,
    val v10: String?,
    val v11: String?,
    val v12: java.nio.ByteBuffer?,
    val v13: String?,
    val v14: String?,
    val v15: String?,
    val v16: Boolean,
    val v17: Boolean,
    val v18: java.nio.ByteBuffer?,
    val v19: Boolean,
    val v20: String?,
    val v21: String?,
    val v22: java.nio.ByteBuffer?,
    val v23: String?,
    val v24: String?,
    val v25: String?,
    val v26: Boolean,
    val v27: Boolean,
    val v28: java.nio.ByteBuffer?,
    val v29: Boolean,
    val v30: String?,
    val v31: String?,
    val v32: java.nio.ByteBuffer?,
    val v33: String?,
    val v34: String?,
    val v35: String?,
    val v36: Boolean,
    val v37: Boolean,
    val v38: java.nio.ByteBuffer?,
    val v39: Boolean,
    val v40: String?,
    val v41: String?,
    val v42: java.nio.ByteBuffer?,
    val v43: String?,
    val v44: String?,
    val v45: String?,
    val v46: Boolean,
    val v47: Boolean,
    val v48: java.nio.ByteBuffer?,
)

@JvmName("lowerType358")
fun lowerType358(rec: mozilla.appservices.search.`SearchEngineUrls`): DeconstructedType358 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType363(rec.`search`)
    val uniffiFieldLowered1 = lowerType364(rec.`suggestions`)
    val uniffiFieldLowered2 = lowerType364(rec.`trending`)
    val uniffiFieldLowered3 = lowerType364(rec.`searchForm`)
    val uniffiFieldLowered4 = lowerType364(rec.`visualSearch`)
    return DeconstructedType358(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered0.v3,
        uniffiFieldLowered0.v4,
        uniffiFieldLowered0.v5,
        uniffiFieldLowered0.v6,
        uniffiFieldLowered0.v7,
        uniffiFieldLowered0.v8,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered1.v4,
        uniffiFieldLowered1.v5,
        uniffiFieldLowered1.v6,
        uniffiFieldLowered1.v7,
        uniffiFieldLowered1.v8,
        uniffiFieldLowered1.v9,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered2.v2,
        uniffiFieldLowered2.v3,
        uniffiFieldLowered2.v4,
        uniffiFieldLowered2.v5,
        uniffiFieldLowered2.v6,
        uniffiFieldLowered2.v7,
        uniffiFieldLowered2.v8,
        uniffiFieldLowered2.v9,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
        uniffiFieldLowered3.v2,
        uniffiFieldLowered3.v3,
        uniffiFieldLowered3.v4,
        uniffiFieldLowered3.v5,
        uniffiFieldLowered3.v6,
        uniffiFieldLowered3.v7,
        uniffiFieldLowered3.v8,
        uniffiFieldLowered3.v9,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered4.v2,
        uniffiFieldLowered4.v3,
        uniffiFieldLowered4.v4,
        uniffiFieldLowered4.v5,
        uniffiFieldLowered4.v6,
        uniffiFieldLowered4.v7,
        uniffiFieldLowered4.v8,
        uniffiFieldLowered4.v9,
    )
}

@JvmName("liftType358")
fun liftType358(
    v0: String?,
    v1: String?,
    v2: java.nio.ByteBuffer?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Boolean,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
    v9: Boolean,
    v10: String?,
    v11: String?,
    v12: java.nio.ByteBuffer?,
    v13: String?,
    v14: String?,
    v15: String?,
    v16: Boolean,
    v17: Boolean,
    v18: java.nio.ByteBuffer?,
    v19: Boolean,
    v20: String?,
    v21: String?,
    v22: java.nio.ByteBuffer?,
    v23: String?,
    v24: String?,
    v25: String?,
    v26: Boolean,
    v27: Boolean,
    v28: java.nio.ByteBuffer?,
    v29: Boolean,
    v30: String?,
    v31: String?,
    v32: java.nio.ByteBuffer?,
    v33: String?,
    v34: String?,
    v35: String?,
    v36: Boolean,
    v37: Boolean,
    v38: java.nio.ByteBuffer?,
    v39: Boolean,
    v40: String?,
    v41: String?,
    v42: java.nio.ByteBuffer?,
    v43: String?,
    v44: String?,
    v45: String?,
    v46: Boolean,
    v47: Boolean,
    v48: java.nio.ByteBuffer?,
): mozilla.appservices.search.`SearchEngineUrls` {
    return mozilla.appservices.search.`SearchEngineUrls`(
        liftType363(
            v0,
            v1,
            v2,
            v3,
            v4,
            v5,
            v6,
            v7,
            v8,
        ),
        liftType364(
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
        ),
        liftType364(
            v19,
            v20,
            v21,
            v22,
            v23,
            v24,
            v25,
            v26,
            v27,
            v28,
        ),
        liftType364(
            v29,
            v30,
            v31,
            v32,
            v33,
            v34,
            v35,
            v36,
            v37,
            v38,
        ),
        liftType364(
            v39,
            v40,
            v41,
            v42,
            v43,
            v44,
            v45,
            v46,
            v47,
            v48,
        ),
    )
}

fun writeType358(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineUrls`) {
    writeType363(buf, offset + 0, value.`search`)
    writeType364(buf, offset + 192, value.`suggestions`)
    writeType364(buf, offset + 392, value.`trending`)
    writeType364(buf, offset + 592, value.`searchForm`)
    writeType364(buf, offset + 792, value.`visualSearch`)
}

fun readType358(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineUrls` {
    return mozilla.appservices.search.`SearchEngineUrls`(
        readType363(buf, offset + 0),
        readType364(buf, offset + 192),
        readType364(buf, offset + 392),
        readType364(buf, offset + 592),
        readType364(buf, offset + 792),
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



// Deconstructed version of SearchEngineDefinition
class DeconstructedType354(
    val v0: java.nio.ByteBuffer?,
    val v1: String?,
    val v2: Int,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Boolean,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: java.nio.ByteBuffer?,
    val v12: String?,
    val v13: String?,
    val v14: String?,
    val v15: Boolean,
    val v16: Boolean,
    val v17: java.nio.ByteBuffer?,
    val v18: Boolean,
    val v19: String?,
    val v20: String?,
    val v21: java.nio.ByteBuffer?,
    val v22: String?,
    val v23: String?,
    val v24: String?,
    val v25: Boolean,
    val v26: Boolean,
    val v27: java.nio.ByteBuffer?,
    val v28: Boolean,
    val v29: String?,
    val v30: String?,
    val v31: java.nio.ByteBuffer?,
    val v32: String?,
    val v33: String?,
    val v34: String?,
    val v35: Boolean,
    val v36: Boolean,
    val v37: java.nio.ByteBuffer?,
    val v38: Boolean,
    val v39: String?,
    val v40: String?,
    val v41: java.nio.ByteBuffer?,
    val v42: String?,
    val v43: String?,
    val v44: String?,
    val v45: Boolean,
    val v46: Boolean,
    val v47: java.nio.ByteBuffer?,
    val v48: Boolean,
    val v49: String?,
    val v50: String?,
    val v51: java.nio.ByteBuffer?,
    val v52: String?,
    val v53: String?,
    val v54: String?,
    val v55: Boolean,
    val v56: Boolean,
    val v57: java.nio.ByteBuffer?,
    val v58: Long,
    val v59: String?,
)

@JvmName("lowerType354")
fun lowerType354(rec: mozilla.appservices.search.`SearchEngineDefinition`): DeconstructedType354 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`aliases`)
    val uniffiFieldLowered1 = lowerString(rec.`charset`)
    val uniffiFieldLowered2 = lowerType357(rec.`classification`)
    val uniffiFieldLowered3 = lowerString(rec.`identifier`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`isNewUntil`)
    val uniffiFieldLowered5 = lowerString(rec.`name`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`optional`)
    val uniffiFieldLowered7 = lowerString(rec.`partnerCode`)
    val uniffiFieldLowered8 = lowerString(rec.`telemetrySuffix`)
    val uniffiFieldLowered9 = lowerType358(rec.`urls`)
    val uniffiFieldLowered10 = lowerOptionUInt(rec.`orderHint`)
    val uniffiFieldLowered11 = lowerOptionString(rec.`clickUrl`)
    return DeconstructedType354(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9.v0,
        uniffiFieldLowered9.v1,
        uniffiFieldLowered9.v2,
        uniffiFieldLowered9.v3,
        uniffiFieldLowered9.v4,
        uniffiFieldLowered9.v5,
        uniffiFieldLowered9.v6,
        uniffiFieldLowered9.v7,
        uniffiFieldLowered9.v8,
        uniffiFieldLowered9.v9,
        uniffiFieldLowered9.v10,
        uniffiFieldLowered9.v11,
        uniffiFieldLowered9.v12,
        uniffiFieldLowered9.v13,
        uniffiFieldLowered9.v14,
        uniffiFieldLowered9.v15,
        uniffiFieldLowered9.v16,
        uniffiFieldLowered9.v17,
        uniffiFieldLowered9.v18,
        uniffiFieldLowered9.v19,
        uniffiFieldLowered9.v20,
        uniffiFieldLowered9.v21,
        uniffiFieldLowered9.v22,
        uniffiFieldLowered9.v23,
        uniffiFieldLowered9.v24,
        uniffiFieldLowered9.v25,
        uniffiFieldLowered9.v26,
        uniffiFieldLowered9.v27,
        uniffiFieldLowered9.v28,
        uniffiFieldLowered9.v29,
        uniffiFieldLowered9.v30,
        uniffiFieldLowered9.v31,
        uniffiFieldLowered9.v32,
        uniffiFieldLowered9.v33,
        uniffiFieldLowered9.v34,
        uniffiFieldLowered9.v35,
        uniffiFieldLowered9.v36,
        uniffiFieldLowered9.v37,
        uniffiFieldLowered9.v38,
        uniffiFieldLowered9.v39,
        uniffiFieldLowered9.v40,
        uniffiFieldLowered9.v41,
        uniffiFieldLowered9.v42,
        uniffiFieldLowered9.v43,
        uniffiFieldLowered9.v44,
        uniffiFieldLowered9.v45,
        uniffiFieldLowered9.v46,
        uniffiFieldLowered9.v47,
        uniffiFieldLowered9.v48,
        uniffiFieldLowered10,
        uniffiFieldLowered11,
    )
}

@JvmName("liftType354")
fun liftType354(
    v0: java.nio.ByteBuffer?,
    v1: String?,
    v2: Int,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Boolean,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: java.nio.ByteBuffer?,
    v12: String?,
    v13: String?,
    v14: String?,
    v15: Boolean,
    v16: Boolean,
    v17: java.nio.ByteBuffer?,
    v18: Boolean,
    v19: String?,
    v20: String?,
    v21: java.nio.ByteBuffer?,
    v22: String?,
    v23: String?,
    v24: String?,
    v25: Boolean,
    v26: Boolean,
    v27: java.nio.ByteBuffer?,
    v28: Boolean,
    v29: String?,
    v30: String?,
    v31: java.nio.ByteBuffer?,
    v32: String?,
    v33: String?,
    v34: String?,
    v35: Boolean,
    v36: Boolean,
    v37: java.nio.ByteBuffer?,
    v38: Boolean,
    v39: String?,
    v40: String?,
    v41: java.nio.ByteBuffer?,
    v42: String?,
    v43: String?,
    v44: String?,
    v45: Boolean,
    v46: Boolean,
    v47: java.nio.ByteBuffer?,
    v48: Boolean,
    v49: String?,
    v50: String?,
    v51: java.nio.ByteBuffer?,
    v52: String?,
    v53: String?,
    v54: String?,
    v55: Boolean,
    v56: Boolean,
    v57: java.nio.ByteBuffer?,
    v58: Long,
    v59: String?,
): mozilla.appservices.search.`SearchEngineDefinition` {
    return mozilla.appservices.search.`SearchEngineDefinition`(
        liftType16(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType357(
            v2,
        ),
        liftString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
        liftString(
            v5,
        ),
        liftBoolean(
            v6,
        ),
        liftString(
            v7,
        ),
        liftString(
            v8,
        ),
        liftType358(
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
            v19,
            v20,
            v21,
            v22,
            v23,
            v24,
            v25,
            v26,
            v27,
            v28,
            v29,
            v30,
            v31,
            v32,
            v33,
            v34,
            v35,
            v36,
            v37,
            v38,
            v39,
            v40,
            v41,
            v42,
            v43,
            v44,
            v45,
            v46,
            v47,
            v48,
            v49,
            v50,
            v51,
            v52,
            v53,
            v54,
            v55,
            v56,
            v57,
        ),
        liftOptionUInt(
            v58,
        ),
        liftOptionString(
            v59,
        ),
    )
}

fun writeType354(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineDefinition`) {
    writeType16(buf, offset + 0, value.`aliases`)
    writeString(buf, offset + 16, value.`charset`)
    writeType357(buf, offset + 40, value.`classification`)
    writeString(buf, offset + 48, value.`identifier`)
    writeType18(buf, offset + 72, value.`isNewUntil`)
    writeString(buf, offset + 104, value.`name`)
    writeBoolean(buf, offset + 128, value.`optional`)
    writeString(buf, offset + 136, value.`partnerCode`)
    writeString(buf, offset + 160, value.`telemetrySuffix`)
    writeType358(buf, offset + 184, value.`urls`)
    writeType145(buf, offset + 1176, value.`orderHint`)
    writeType18(buf, offset + 1184, value.`clickUrl`)
}

fun readType354(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineDefinition` {
    return mozilla.appservices.search.`SearchEngineDefinition`(
        readType16(buf, offset + 0),
        readString(buf, offset + 16),
        readType357(buf, offset + 40),
        readString(buf, offset + 48),
        readType18(buf, offset + 72),
        readString(buf, offset + 104),
        readBoolean(buf, offset + 128),
        readString(buf, offset + 136),
        readString(buf, offset + 160),
        readType358(buf, offset + 184),
        readType145(buf, offset + 1176),
        readType18(buf, offset + 1184),
    )
}


fun lowerToBuffer353(value: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 1216).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType354(buf, offset, it)
        offset += 1216
    }
    return buf
}

fun liftFromBuffer353(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 1216
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType354(buf, offset))
                offset += 1216
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType353")
fun lowerType353(value: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`>): java.nio.ByteBuffer {
    return lowerToBuffer353(value)
}

@JvmName("liftType353")
fun liftType353(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`> {
    return liftFromBuffer353(buf)
}

fun writeType353(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`>) {
    val childBuf = lowerToBuffer353(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType353(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer353(childBuf)
}

// Deconstructed version of RefinedSearchConfig
class DeconstructedType372(
    val v0: java.nio.ByteBuffer?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType372")
fun lowerType372(rec: mozilla.appservices.search.`RefinedSearchConfig`): DeconstructedType372 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType353(rec.`engines`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`appDefaultEngineId`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`appPrivateDefaultEngineId`)
    return DeconstructedType372(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType372")
fun liftType372(
    v0: java.nio.ByteBuffer?,
    v1: String?,
    v2: String?,
): mozilla.appservices.search.`RefinedSearchConfig` {
    return mozilla.appservices.search.`RefinedSearchConfig`(
        liftType353(
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

fun writeType372(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`RefinedSearchConfig`) {
    writeType353(buf, offset + 0, value.`engines`)
    writeType18(buf, offset + 16, value.`appDefaultEngineId`)
    writeType18(buf, offset + 48, value.`appPrivateDefaultEngineId`)
}

fun readType372(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`RefinedSearchConfig` {
    return mozilla.appservices.search.`RefinedSearchConfig`(
        readType353(buf, offset + 0),
        readType18(buf, offset + 16),
        readType18(buf, offset + 48),
    )
}

@JvmName("lowerType359")
fun lowerType359(value: mozilla.appservices.search.`SearchEngineClassificationV3`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType359")
fun liftType359(value: kotlin.Int): mozilla.appservices.search.`SearchEngineClassificationV3` {
    return mozilla.appservices.search.`SearchEngineClassificationV3`.values()[value]
}

fun writeType359(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineClassificationV3`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType359(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineClassificationV3` {
    return liftType359(readInt(buf, offset))
}

// Deconstructed version of SearchEnginePartnerDetails
class DeconstructedType362(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType362")
fun lowerType362(rec: mozilla.appservices.search.`SearchEnginePartnerDetails`): DeconstructedType362 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`code`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`telemetrySuffix`)
    return DeconstructedType362(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType362")
fun liftType362(
    v0: String?,
    v1: String?,
): mozilla.appservices.search.`SearchEnginePartnerDetails` {
    return mozilla.appservices.search.`SearchEnginePartnerDetails`(
        liftOptionString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
    )
}

fun writeType362(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEnginePartnerDetails`) {
    writeType18(buf, offset + 0, value.`code`)
    writeType18(buf, offset + 32, value.`telemetrySuffix`)
}

fun readType362(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEnginePartnerDetails` {
    return mozilla.appservices.search.`SearchEnginePartnerDetails`(
        readType18(buf, offset + 0),
        readType18(buf, offset + 32),
    )
}


@JvmName("lowerType361")
fun lowerType361(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 88).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType362(buf, offset + 24, it.value)
        offset += 88
    }
    return buf
}

@JvmName("liftType361")
fun liftType361(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 88
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType362(buf, offset + 24),
                )
                offset += 88
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType361(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>) {
    val childBuf = lowerType361(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType361(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType361(childBuf)
}


// Deconstructed version of kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>?
class DeconstructedType360(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType360")
fun lowerType360(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>?): DeconstructedType360 {
    if (value == null) {
        return DeconstructedType360(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType361(value)
        return DeconstructedType360(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType360")
fun liftType360(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>? {
    if (v0) {
        return liftType361(
            v1,
        )
    } else {
        return null
    }
}

fun writeType360(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType361(buf, offset + 8, value)
    }
}
fun readType360(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType361(buf, offset + 8)
    }
}

// Deconstructed version of SearchEngineDefinitionV3
class DeconstructedType356(
    val v0: java.nio.ByteBuffer?,
    val v1: String?,
    val v2: Int,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Boolean,
    val v7: Boolean,
    val v8: java.nio.ByteBuffer?,
    val v9: String?,
    val v10: String?,
    val v11: java.nio.ByteBuffer?,
    val v12: String?,
    val v13: String?,
    val v14: String?,
    val v15: Boolean,
    val v16: Boolean,
    val v17: java.nio.ByteBuffer?,
    val v18: Boolean,
    val v19: String?,
    val v20: String?,
    val v21: java.nio.ByteBuffer?,
    val v22: String?,
    val v23: String?,
    val v24: String?,
    val v25: Boolean,
    val v26: Boolean,
    val v27: java.nio.ByteBuffer?,
    val v28: Boolean,
    val v29: String?,
    val v30: String?,
    val v31: java.nio.ByteBuffer?,
    val v32: String?,
    val v33: String?,
    val v34: String?,
    val v35: Boolean,
    val v36: Boolean,
    val v37: java.nio.ByteBuffer?,
    val v38: Boolean,
    val v39: String?,
    val v40: String?,
    val v41: java.nio.ByteBuffer?,
    val v42: String?,
    val v43: String?,
    val v44: String?,
    val v45: Boolean,
    val v46: Boolean,
    val v47: java.nio.ByteBuffer?,
    val v48: Boolean,
    val v49: String?,
    val v50: String?,
    val v51: java.nio.ByteBuffer?,
    val v52: String?,
    val v53: String?,
    val v54: String?,
    val v55: Boolean,
    val v56: Boolean,
    val v57: java.nio.ByteBuffer?,
    val v58: Long,
    val v59: Boolean,
)

@JvmName("lowerType356")
fun lowerType356(rec: mozilla.appservices.search.`SearchEngineDefinitionV3`): DeconstructedType356 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`aliases`)
    val uniffiFieldLowered1 = lowerString(rec.`charset`)
    val uniffiFieldLowered2 = lowerType359(rec.`classification`)
    val uniffiFieldLowered3 = lowerString(rec.`identifier`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`isNewUntil`)
    val uniffiFieldLowered5 = lowerString(rec.`name`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`optional`)
    val uniffiFieldLowered7 = lowerType360(rec.`partner`)
    val uniffiFieldLowered8 = lowerType358(rec.`urls`)
    val uniffiFieldLowered9 = lowerOptionUInt(rec.`orderHint`)
    val uniffiFieldLowered10 = lowerBoolean(rec.`deprecated`)
    return DeconstructedType356(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
        uniffiFieldLowered8.v0,
        uniffiFieldLowered8.v1,
        uniffiFieldLowered8.v2,
        uniffiFieldLowered8.v3,
        uniffiFieldLowered8.v4,
        uniffiFieldLowered8.v5,
        uniffiFieldLowered8.v6,
        uniffiFieldLowered8.v7,
        uniffiFieldLowered8.v8,
        uniffiFieldLowered8.v9,
        uniffiFieldLowered8.v10,
        uniffiFieldLowered8.v11,
        uniffiFieldLowered8.v12,
        uniffiFieldLowered8.v13,
        uniffiFieldLowered8.v14,
        uniffiFieldLowered8.v15,
        uniffiFieldLowered8.v16,
        uniffiFieldLowered8.v17,
        uniffiFieldLowered8.v18,
        uniffiFieldLowered8.v19,
        uniffiFieldLowered8.v20,
        uniffiFieldLowered8.v21,
        uniffiFieldLowered8.v22,
        uniffiFieldLowered8.v23,
        uniffiFieldLowered8.v24,
        uniffiFieldLowered8.v25,
        uniffiFieldLowered8.v26,
        uniffiFieldLowered8.v27,
        uniffiFieldLowered8.v28,
        uniffiFieldLowered8.v29,
        uniffiFieldLowered8.v30,
        uniffiFieldLowered8.v31,
        uniffiFieldLowered8.v32,
        uniffiFieldLowered8.v33,
        uniffiFieldLowered8.v34,
        uniffiFieldLowered8.v35,
        uniffiFieldLowered8.v36,
        uniffiFieldLowered8.v37,
        uniffiFieldLowered8.v38,
        uniffiFieldLowered8.v39,
        uniffiFieldLowered8.v40,
        uniffiFieldLowered8.v41,
        uniffiFieldLowered8.v42,
        uniffiFieldLowered8.v43,
        uniffiFieldLowered8.v44,
        uniffiFieldLowered8.v45,
        uniffiFieldLowered8.v46,
        uniffiFieldLowered8.v47,
        uniffiFieldLowered8.v48,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
    )
}

@JvmName("liftType356")
fun liftType356(
    v0: java.nio.ByteBuffer?,
    v1: String?,
    v2: Int,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Boolean,
    v7: Boolean,
    v8: java.nio.ByteBuffer?,
    v9: String?,
    v10: String?,
    v11: java.nio.ByteBuffer?,
    v12: String?,
    v13: String?,
    v14: String?,
    v15: Boolean,
    v16: Boolean,
    v17: java.nio.ByteBuffer?,
    v18: Boolean,
    v19: String?,
    v20: String?,
    v21: java.nio.ByteBuffer?,
    v22: String?,
    v23: String?,
    v24: String?,
    v25: Boolean,
    v26: Boolean,
    v27: java.nio.ByteBuffer?,
    v28: Boolean,
    v29: String?,
    v30: String?,
    v31: java.nio.ByteBuffer?,
    v32: String?,
    v33: String?,
    v34: String?,
    v35: Boolean,
    v36: Boolean,
    v37: java.nio.ByteBuffer?,
    v38: Boolean,
    v39: String?,
    v40: String?,
    v41: java.nio.ByteBuffer?,
    v42: String?,
    v43: String?,
    v44: String?,
    v45: Boolean,
    v46: Boolean,
    v47: java.nio.ByteBuffer?,
    v48: Boolean,
    v49: String?,
    v50: String?,
    v51: java.nio.ByteBuffer?,
    v52: String?,
    v53: String?,
    v54: String?,
    v55: Boolean,
    v56: Boolean,
    v57: java.nio.ByteBuffer?,
    v58: Long,
    v59: Boolean,
): mozilla.appservices.search.`SearchEngineDefinitionV3` {
    return mozilla.appservices.search.`SearchEngineDefinitionV3`(
        liftType16(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType359(
            v2,
        ),
        liftString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
        liftString(
            v5,
        ),
        liftBoolean(
            v6,
        ),
        liftType360(
            v7,
            v8,
        ),
        liftType358(
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
            v19,
            v20,
            v21,
            v22,
            v23,
            v24,
            v25,
            v26,
            v27,
            v28,
            v29,
            v30,
            v31,
            v32,
            v33,
            v34,
            v35,
            v36,
            v37,
            v38,
            v39,
            v40,
            v41,
            v42,
            v43,
            v44,
            v45,
            v46,
            v47,
            v48,
            v49,
            v50,
            v51,
            v52,
            v53,
            v54,
            v55,
            v56,
            v57,
        ),
        liftOptionUInt(
            v58,
        ),
        liftBoolean(
            v59,
        ),
    )
}

fun writeType356(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineDefinitionV3`) {
    writeType16(buf, offset + 0, value.`aliases`)
    writeString(buf, offset + 16, value.`charset`)
    writeType359(buf, offset + 40, value.`classification`)
    writeString(buf, offset + 48, value.`identifier`)
    writeType18(buf, offset + 72, value.`isNewUntil`)
    writeString(buf, offset + 104, value.`name`)
    writeBoolean(buf, offset + 128, value.`optional`)
    writeType360(buf, offset + 136, value.`partner`)
    writeType358(buf, offset + 160, value.`urls`)
    writeType145(buf, offset + 1152, value.`orderHint`)
    writeBoolean(buf, offset + 1160, value.`deprecated`)
}

fun readType356(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineDefinitionV3` {
    return mozilla.appservices.search.`SearchEngineDefinitionV3`(
        readType16(buf, offset + 0),
        readString(buf, offset + 16),
        readType359(buf, offset + 40),
        readString(buf, offset + 48),
        readType18(buf, offset + 72),
        readString(buf, offset + 104),
        readBoolean(buf, offset + 128),
        readType360(buf, offset + 136),
        readType358(buf, offset + 160),
        readType145(buf, offset + 1152),
        readBoolean(buf, offset + 1160),
    )
}


fun lowerToBuffer355(value: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 1168).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType356(buf, offset, it)
        offset += 1168
    }
    return buf
}

fun liftFromBuffer355(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 1168
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType356(buf, offset))
                offset += 1168
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType355")
fun lowerType355(value: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`>): java.nio.ByteBuffer {
    return lowerToBuffer355(value)
}

@JvmName("liftType355")
fun liftType355(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`> {
    return liftFromBuffer355(buf)
}

fun writeType355(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`>) {
    val childBuf = lowerToBuffer355(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType355(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer355(childBuf)
}

// Deconstructed version of RefinedSearchConfigV3
class DeconstructedType375(
    val v0: java.nio.ByteBuffer?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType375")
fun lowerType375(rec: mozilla.appservices.search.`RefinedSearchConfigV3`): DeconstructedType375 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType355(rec.`engines`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`appDefaultEngineId`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`appPrivateDefaultEngineId`)
    return DeconstructedType375(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType375")
fun liftType375(
    v0: java.nio.ByteBuffer?,
    v1: String?,
    v2: String?,
): mozilla.appservices.search.`RefinedSearchConfigV3` {
    return mozilla.appservices.search.`RefinedSearchConfigV3`(
        liftType355(
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

fun writeType375(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`RefinedSearchConfigV3`) {
    writeType355(buf, offset + 0, value.`engines`)
    writeType18(buf, offset + 16, value.`appDefaultEngineId`)
    writeType18(buf, offset + 48, value.`appPrivateDefaultEngineId`)
}

fun readType375(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`RefinedSearchConfigV3` {
    return mozilla.appservices.search.`RefinedSearchConfigV3`(
        readType355(buf, offset + 0),
        readType18(buf, offset + 16),
        readType18(buf, offset + 48),
    )
}

@JvmName("lowerType365")
fun lowerType365(value: mozilla.appservices.search.`SearchUpdateChannel`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType365")
fun liftType365(value: kotlin.Int): mozilla.appservices.search.`SearchUpdateChannel` {
    return mozilla.appservices.search.`SearchUpdateChannel`.values()[value]
}

fun writeType365(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchUpdateChannel`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType365(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchUpdateChannel` {
    return liftType365(readInt(buf, offset))
}

@JvmName("lowerType366")
fun lowerType366(value: mozilla.appservices.search.`SearchApplicationName`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType366")
fun liftType366(value: kotlin.Int): mozilla.appservices.search.`SearchApplicationName` {
    return mozilla.appservices.search.`SearchApplicationName`.values()[value]
}

fun writeType366(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchApplicationName`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType366(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchApplicationName` {
    return liftType366(readInt(buf, offset))
}

@JvmName("lowerType367")
fun lowerType367(value: mozilla.appservices.search.`SearchDeviceType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType367")
fun liftType367(value: kotlin.Int): mozilla.appservices.search.`SearchDeviceType` {
    return mozilla.appservices.search.`SearchDeviceType`.values()[value]
}

fun writeType367(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchDeviceType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType367(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchDeviceType` {
    return liftType367(readInt(buf, offset))
}

// Deconstructed version of SearchUserEnvironment
class DeconstructedType371(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: String?,
    val v4: String?,
    val v5: Int,
    val v6: String?,
    val v7: Int,
)

@JvmName("lowerType371")
fun lowerType371(rec: mozilla.appservices.search.`SearchUserEnvironment`): DeconstructedType371 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`locale`)
    val uniffiFieldLowered1 = lowerString(rec.`region`)
    val uniffiFieldLowered2 = lowerType365(rec.`updateChannel`)
    val uniffiFieldLowered3 = lowerString(rec.`distributionId`)
    val uniffiFieldLowered4 = lowerString(rec.`experiment`)
    val uniffiFieldLowered5 = lowerType366(rec.`appName`)
    val uniffiFieldLowered6 = lowerString(rec.`version`)
    val uniffiFieldLowered7 = lowerType367(rec.`deviceType`)
    return DeconstructedType371(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
    )
}

@JvmName("liftType371")
fun liftType371(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: String?,
    v4: String?,
    v5: Int,
    v6: String?,
    v7: Int,
): mozilla.appservices.search.`SearchUserEnvironment` {
    return mozilla.appservices.search.`SearchUserEnvironment`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType365(
            v2,
        ),
        liftString(
            v3,
        ),
        liftString(
            v4,
        ),
        liftType366(
            v5,
        ),
        liftString(
            v6,
        ),
        liftType367(
            v7,
        ),
    )
}

fun writeType371(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchUserEnvironment`) {
    writeString(buf, offset + 0, value.`locale`)
    writeString(buf, offset + 24, value.`region`)
    writeType365(buf, offset + 48, value.`updateChannel`)
    writeString(buf, offset + 56, value.`distributionId`)
    writeString(buf, offset + 80, value.`experiment`)
    writeType366(buf, offset + 104, value.`appName`)
    writeString(buf, offset + 112, value.`version`)
    writeType367(buf, offset + 136, value.`deviceType`)
}

fun readType371(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchUserEnvironment` {
    return mozilla.appservices.search.`SearchUserEnvironment`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType365(buf, offset + 48),
        readString(buf, offset + 56),
        readString(buf, offset + 80),
        readType366(buf, offset + 104),
        readString(buf, offset + 112),
        readType367(buf, offset + 136),
    )
}

@JvmName("lowerType368")
fun lowerType368(value: mozilla.appservices.search.`SearchUpdateChannelV3`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType368")
fun liftType368(value: kotlin.Int): mozilla.appservices.search.`SearchUpdateChannelV3` {
    return mozilla.appservices.search.`SearchUpdateChannelV3`.values()[value]
}

fun writeType368(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchUpdateChannelV3`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType368(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchUpdateChannelV3` {
    return liftType368(readInt(buf, offset))
}

@JvmName("lowerType369")
fun lowerType369(value: mozilla.appservices.search.`SearchApplicationNameV3`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType369")
fun liftType369(value: kotlin.Int): mozilla.appservices.search.`SearchApplicationNameV3` {
    return mozilla.appservices.search.`SearchApplicationNameV3`.values()[value]
}

fun writeType369(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchApplicationNameV3`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType369(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchApplicationNameV3` {
    return liftType369(readInt(buf, offset))
}

@JvmName("lowerType370")
fun lowerType370(value: mozilla.appservices.search.`SearchDeviceTypeV3`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType370")
fun liftType370(value: kotlin.Int): mozilla.appservices.search.`SearchDeviceTypeV3` {
    return mozilla.appservices.search.`SearchDeviceTypeV3`.values()[value]
}

fun writeType370(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchDeviceTypeV3`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType370(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchDeviceTypeV3` {
    return liftType370(readInt(buf, offset))
}

// Deconstructed version of SearchUserEnvironmentV3
class DeconstructedType374(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: String?,
    val v4: String?,
    val v5: Int,
    val v6: String?,
    val v7: Int,
)

@JvmName("lowerType374")
fun lowerType374(rec: mozilla.appservices.search.`SearchUserEnvironmentV3`): DeconstructedType374 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`locale`)
    val uniffiFieldLowered1 = lowerString(rec.`region`)
    val uniffiFieldLowered2 = lowerType368(rec.`updateChannel`)
    val uniffiFieldLowered3 = lowerString(rec.`distributionId`)
    val uniffiFieldLowered4 = lowerString(rec.`experiment`)
    val uniffiFieldLowered5 = lowerType369(rec.`appName`)
    val uniffiFieldLowered6 = lowerString(rec.`version`)
    val uniffiFieldLowered7 = lowerType370(rec.`deviceType`)
    return DeconstructedType374(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
    )
}

@JvmName("liftType374")
fun liftType374(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: String?,
    v4: String?,
    v5: Int,
    v6: String?,
    v7: Int,
): mozilla.appservices.search.`SearchUserEnvironmentV3` {
    return mozilla.appservices.search.`SearchUserEnvironmentV3`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType368(
            v2,
        ),
        liftString(
            v3,
        ),
        liftString(
            v4,
        ),
        liftType369(
            v5,
        ),
        liftString(
            v6,
        ),
        liftType370(
            v7,
        ),
    )
}

fun writeType374(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchUserEnvironmentV3`) {
    writeString(buf, offset + 0, value.`locale`)
    writeString(buf, offset + 24, value.`region`)
    writeType368(buf, offset + 48, value.`updateChannel`)
    writeString(buf, offset + 56, value.`distributionId`)
    writeString(buf, offset + 80, value.`experiment`)
    writeType369(buf, offset + 104, value.`appName`)
    writeString(buf, offset + 112, value.`version`)
    writeType370(buf, offset + 136, value.`deviceType`)
}

fun readType374(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchUserEnvironmentV3` {
    return mozilla.appservices.search.`SearchUserEnvironmentV3`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType368(buf, offset + 48),
        readString(buf, offset + 56),
        readString(buf, offset + 80),
        readType369(buf, offset + 104),
        readString(buf, offset + 112),
        readType370(buf, offset + 136),
    )
}

// Deconstructed version of SearchApiError
class DeconstructedType373(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType373")
fun lowerType373(value: mozilla.appservices.search.`SearchApiException`): DeconstructedType373 {
    when (value) {
        is mozilla.appservices.search.`SearchApiException`.`Other` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType373(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType373")
fun liftType373(
    v0: Int,
    v1: String?,
): mozilla.appservices.search.`SearchApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.search.`SearchApiException`.`Other`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType373: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType373(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchApiException`) {
    when (value) {
        is mozilla.appservices.search.`SearchApiException`.`Other` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType373(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.search.`SearchApiException`.`Other`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType373: Invalid enum discriminant: ${discriminant}")
        }
    }
}

fun objectToHandle6391(obj: mozilla.appservices.search.`SearchEngineSelector`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject6391(handle: kotlin.Long): mozilla.appservices.search.`SearchEngineSelector` {
    return mozilla.appservices.search.`SearchEngineSelector`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef6391")
fun lowerObjectRef6391(value: mozilla.appservices.search.`SearchEngineSelector`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType6391")
fun lowerType6391(value: mozilla.appservices.search.`SearchEngineSelector`): kotlin.Long {
    return objectToHandle6391(value)
}

@JvmName("liftType6391")
fun liftType6391(handle: kotlin.Long): mozilla.appservices.search.`SearchEngineSelector` {
    return handleToObject6391(handle)
}

fun writeType6391(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.search.`SearchEngineSelector`) {
    writeLong(buf, offset, objectToHandle6391(value))
}

fun readType6391(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.search.`SearchEngineSelector` {
    return handleToObject6391(readLong(buf, offset))
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
    @JvmName("methodSearchSearchEngineSelectorFilterEngineConfiguration")
    @JvmStatic external fun methodSearchSearchEngineSelectorFilterEngineConfiguration(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: Int,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: Int,
        `uniffiArg7`: String?,
        `uniffiArg8`: Int,
    ) : mozilla.appservices.search.`RefinedSearchConfig`
    @JvmName("methodSearchSearchEngineSelectorFilterEngineConfigurationV3")
    @JvmStatic external fun methodSearchSearchEngineSelectorFilterEngineConfigurationV3(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: Int,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: Int,
        `uniffiArg7`: String?,
        `uniffiArg8`: Int,
    ) : mozilla.appservices.search.`RefinedSearchConfigV3`
    @JvmName("methodSearchSearchEngineSelectorSetConfigOverrides")
    @JvmStatic external fun methodSearchSearchEngineSelectorSetConfigOverrides(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodSearchSearchEngineSelectorSetSearchConfig")
    @JvmStatic external fun methodSearchSearchEngineSelectorSetSearchConfig(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodSearchSearchEngineSelectorSetSearchConfigV3")
    @JvmStatic external fun methodSearchSearchEngineSelectorSetSearchConfigV3(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodSearchSearchEngineSelectorUseRemoteSettingsServer")
    @JvmStatic external fun methodSearchSearchEngineSelectorUseRemoteSettingsServer(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: Boolean,
    )
    @JvmName("methodSearchSearchEngineSelectorUseRemoteSettingsServerV3")
    @JvmStatic external fun methodSearchSearchEngineSelectorUseRemoteSettingsServerV3(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    )
    @JvmName("constructorSearchSearchEngineSelectorNew")
    @JvmStatic external fun constructorSearchSearchEngineSelectorNew(
    ) : Long
    @JvmStatic external fun objectCloneHandle6391(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree6391(handle: kotlin.Long)
}