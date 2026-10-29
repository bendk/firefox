@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package org.mozilla.experiments.nimbus.internal.uniffi
import org.json.JSONObject
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




@JvmName("lowerType204")
fun lowerType204(value: org.mozilla.experiments.nimbus.internal.`JsonObject`): String? {
    val value = (value.toString())
    return lowerString(value)
}

@JvmName("liftType204")
fun liftType204(
    v0: String?,
): org.mozilla.experiments.nimbus.internal.`JsonObject` {
    val builtinValue = liftString(
        v0,
    )
    return JSONObject(builtinValue)
}

fun writeType204(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`JsonObject`) {
    val value = (value.toString())
    writeString(buf, offset, value)
}

fun readType204(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`JsonObject` {
    val builtinValue = readString(buf, offset)
    return JSONObject(builtinValue)
}


// Deconstructed version of org.mozilla.experiments.nimbus.internal.`JsonObject`?
class DeconstructedType203(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType203")
fun lowerType203(value: org.mozilla.experiments.nimbus.internal.`JsonObject`?): DeconstructedType203 {
    if (value == null) {
        return DeconstructedType203(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType204(value)
        return DeconstructedType203(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType203")
fun liftType203(
    v0: Boolean,
    v1: String?,
): org.mozilla.experiments.nimbus.internal.`JsonObject`? {
    if (v0) {
        return liftType204(
            v1,
        )
    } else {
        return null
    }
}

fun writeType203(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`JsonObject`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType204(buf, offset + 8, value)
    }
}
fun readType203(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`JsonObject`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType204(buf, offset + 8)
    }
}

// Deconstructed version of AppContext
class DeconstructedType235(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: Boolean,
    val v14: Long,
    val v15: Boolean,
    val v16: String?,
)

@JvmName("lowerType235")
fun lowerType235(rec: org.mozilla.experiments.nimbus.internal.`AppContext`): DeconstructedType235 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`appName`)
    val uniffiFieldLowered1 = lowerString(rec.`appId`)
    val uniffiFieldLowered2 = lowerString(rec.`channel`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`appVersion`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`appBuild`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`architecture`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`deviceManufacturer`)
    val uniffiFieldLowered7 = lowerOptionString(rec.`deviceModel`)
    val uniffiFieldLowered8 = lowerOptionString(rec.`locale`)
    val uniffiFieldLowered9 = lowerOptionString(rec.`os`)
    val uniffiFieldLowered10 = lowerOptionString(rec.`osVersion`)
    val uniffiFieldLowered11 = lowerOptionString(rec.`androidSdkVersion`)
    val uniffiFieldLowered12 = lowerOptionString(rec.`debugTag`)
    val uniffiFieldLowered13 = lowerType56(rec.`installationDate`)
    val uniffiFieldLowered14 = lowerType203(rec.`customTargetingAttributes`)
    return DeconstructedType235(
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
        uniffiFieldLowered10,
        uniffiFieldLowered11,
        uniffiFieldLowered12,
        uniffiFieldLowered13.v0,
        uniffiFieldLowered13.v1,
        uniffiFieldLowered14.v0,
        uniffiFieldLowered14.v1,
    )
}

@JvmName("liftType235")
fun liftType235(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: Boolean,
    v14: Long,
    v15: Boolean,
    v16: String?,
): org.mozilla.experiments.nimbus.internal.`AppContext` {
    return org.mozilla.experiments.nimbus.internal.`AppContext`(
        liftString(
            v0,
        ),
        liftString(
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
        liftOptionString(
            v5,
        ),
        liftOptionString(
            v6,
        ),
        liftOptionString(
            v7,
        ),
        liftOptionString(
            v8,
        ),
        liftOptionString(
            v9,
        ),
        liftOptionString(
            v10,
        ),
        liftOptionString(
            v11,
        ),
        liftOptionString(
            v12,
        ),
        liftType56(
            v13,
            v14,
        ),
        liftType203(
            v15,
            v16,
        ),
    )
}

fun writeType235(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`AppContext`) {
    writeString(buf, offset + 0, value.`appName`)
    writeString(buf, offset + 24, value.`appId`)
    writeString(buf, offset + 48, value.`channel`)
    writeType18(buf, offset + 72, value.`appVersion`)
    writeType18(buf, offset + 104, value.`appBuild`)
    writeType18(buf, offset + 136, value.`architecture`)
    writeType18(buf, offset + 168, value.`deviceManufacturer`)
    writeType18(buf, offset + 200, value.`deviceModel`)
    writeType18(buf, offset + 232, value.`locale`)
    writeType18(buf, offset + 264, value.`os`)
    writeType18(buf, offset + 296, value.`osVersion`)
    writeType18(buf, offset + 328, value.`androidSdkVersion`)
    writeType18(buf, offset + 360, value.`debugTag`)
    writeType56(buf, offset + 392, value.`installationDate`)
    writeType203(buf, offset + 408, value.`customTargetingAttributes`)
}

fun readType235(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`AppContext` {
    return org.mozilla.experiments.nimbus.internal.`AppContext`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readType18(buf, offset + 72),
        readType18(buf, offset + 104),
        readType18(buf, offset + 136),
        readType18(buf, offset + 168),
        readType18(buf, offset + 200),
        readType18(buf, offset + 232),
        readType18(buf, offset + 264),
        readType18(buf, offset + 296),
        readType18(buf, offset + 328),
        readType18(buf, offset + 360),
        readType56(buf, offset + 392),
        readType203(buf, offset + 408),
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



// Deconstructed version of ExperimentBranch
class DeconstructedType206(
    val v0: String?,
    val v1: Int,
)

@JvmName("lowerType206")
fun lowerType206(rec: org.mozilla.experiments.nimbus.internal.`ExperimentBranch`): DeconstructedType206 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`slug`)
    val uniffiFieldLowered1 = lowerInt(rec.`ratio`)
    return DeconstructedType206(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType206")
fun liftType206(
    v0: String?,
    v1: Int,
): org.mozilla.experiments.nimbus.internal.`ExperimentBranch` {
    return org.mozilla.experiments.nimbus.internal.`ExperimentBranch`(
        liftString(
            v0,
        ),
        liftInt(
            v1,
        ),
    )
}

fun writeType206(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`ExperimentBranch`) {
    writeString(buf, offset + 0, value.`slug`)
    writeInt(buf, offset + 24, value.`ratio`)
}

fun readType206(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`ExperimentBranch` {
    return org.mozilla.experiments.nimbus.internal.`ExperimentBranch`(
        readString(buf, offset + 0),
        readInt(buf, offset + 24),
    )
}


fun lowerToBuffer205(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType206(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer205(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType206(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType205")
fun lowerType205(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`>): java.nio.ByteBuffer {
    return lowerToBuffer205(value)
}

@JvmName("liftType205")
fun liftType205(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`> {
    return liftFromBuffer205(buf)
}

fun writeType205(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`>) {
    val childBuf = lowerToBuffer205(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType205(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer205(childBuf)
}

// Deconstructed version of AvailableExperiment
class DeconstructedType248(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: java.nio.ByteBuffer?,
    val v4: String?,
)

@JvmName("lowerType248")
fun lowerType248(rec: org.mozilla.experiments.nimbus.internal.`AvailableExperiment`): DeconstructedType248 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`slug`)
    val uniffiFieldLowered1 = lowerString(rec.`userFacingName`)
    val uniffiFieldLowered2 = lowerString(rec.`userFacingDescription`)
    val uniffiFieldLowered3 = lowerType205(rec.`branches`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`referenceBranch`)
    return DeconstructedType248(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType248")
fun liftType248(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: java.nio.ByteBuffer?,
    v4: String?,
): org.mozilla.experiments.nimbus.internal.`AvailableExperiment` {
    return org.mozilla.experiments.nimbus.internal.`AvailableExperiment`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftString(
            v2,
        ),
        liftType205(
            v3,
        ),
        liftOptionString(
            v4,
        ),
    )
}

fun writeType248(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`AvailableExperiment`) {
    writeString(buf, offset + 0, value.`slug`)
    writeString(buf, offset + 24, value.`userFacingName`)
    writeString(buf, offset + 48, value.`userFacingDescription`)
    writeType205(buf, offset + 72, value.`branches`)
    writeType18(buf, offset + 88, value.`referenceBranch`)
}

fun readType248(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`AvailableExperiment` {
    return org.mozilla.experiments.nimbus.internal.`AvailableExperiment`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readType205(buf, offset + 72),
        readType18(buf, offset + 88),
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



// Deconstructed version of CalculatedAttributes
class DeconstructedType201(
    val v0: Long,
    val v1: Long,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType201")
fun lowerType201(rec: org.mozilla.experiments.nimbus.internal.`CalculatedAttributes`): DeconstructedType201 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionInt(rec.`daysSinceInstall`)
    val uniffiFieldLowered1 = lowerOptionInt(rec.`daysSinceUpdate`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`language`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`region`)
    return DeconstructedType201(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType201")
fun liftType201(
    v0: Long,
    v1: Long,
    v2: String?,
    v3: String?,
): org.mozilla.experiments.nimbus.internal.`CalculatedAttributes` {
    return org.mozilla.experiments.nimbus.internal.`CalculatedAttributes`(
        liftOptionInt(
            v0,
        ),
        liftOptionInt(
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

fun writeType201(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`CalculatedAttributes`) {
    writeType172(buf, offset + 0, value.`daysSinceInstall`)
    writeType172(buf, offset + 8, value.`daysSinceUpdate`)
    writeType18(buf, offset + 16, value.`language`)
    writeType18(buf, offset + 48, value.`region`)
}

fun readType201(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`CalculatedAttributes` {
    return org.mozilla.experiments.nimbus.internal.`CalculatedAttributes`(
        readType172(buf, offset + 0),
        readType172(buf, offset + 8),
        readType18(buf, offset + 16),
        readType18(buf, offset + 48),
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



// Deconstructed version of DatabaseLoadExtraDef
class DeconstructedType229(
    val v0: Long,
    val v1: String?,
    val v2: Long,
    val v3: Long,
    val v4: String?,
)

@JvmName("lowerType229")
fun lowerType229(rec: org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef`): DeconstructedType229 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionBoolean(rec.`corrupt`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`error`)
    val uniffiFieldLowered2 = lowerOptionUShort(rec.`initialVersion`)
    val uniffiFieldLowered3 = lowerOptionUShort(rec.`migratedVersion`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`migrationError`)
    return DeconstructedType229(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType229")
fun liftType229(
    v0: Long,
    v1: String?,
    v2: Long,
    v3: Long,
    v4: String?,
): org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef`(
        liftOptionBoolean(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionUShort(
            v2,
        ),
        liftOptionUShort(
            v3,
        ),
        liftOptionString(
            v4,
        ),
    )
}

fun writeType229(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef`) {
    writeType207(buf, offset + 0, value.`corrupt`)
    writeType18(buf, offset + 8, value.`error`)
    writeType190(buf, offset + 40, value.`initialVersion`)
    writeType190(buf, offset + 44, value.`migratedVersion`)
    writeType18(buf, offset + 48, value.`migrationError`)
}

fun readType229(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef`(
        readType207(buf, offset + 0),
        readType18(buf, offset + 8),
        readType190(buf, offset + 40),
        readType190(buf, offset + 44),
        readType18(buf, offset + 48),
    )
}

// Deconstructed version of DatabaseMigrationExtraDef
class DeconstructedType230(
    val v0: String?,
    val v1: Short,
    val v2: Short,
    val v3: String?,
)

@JvmName("lowerType230")
fun lowerType230(rec: org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef`): DeconstructedType230 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`reason`)
    val uniffiFieldLowered1 = lowerUShort(rec.`fromVersion`)
    val uniffiFieldLowered2 = lowerUShort(rec.`toVersion`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`error`)
    return DeconstructedType230(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType230")
fun liftType230(
    v0: String?,
    v1: Short,
    v2: Short,
    v3: String?,
): org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef`(
        liftString(
            v0,
        ),
        liftUShort(
            v1,
        ),
        liftUShort(
            v2,
        ),
        liftOptionString(
            v3,
        ),
    )
}

fun writeType230(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef`) {
    writeString(buf, offset + 0, value.`reason`)
    writeUShort(buf, offset + 24, value.`fromVersion`)
    writeUShort(buf, offset + 26, value.`toVersion`)
    writeType18(buf, offset + 32, value.`error`)
}

fun readType230(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef`(
        readString(buf, offset + 0),
        readUShort(buf, offset + 24),
        readUShort(buf, offset + 26),
        readType18(buf, offset + 32),
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



// Deconstructed version of EnrolledExperiment
class DeconstructedType246(
    val v0: java.nio.ByteBuffer?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: Boolean,
)

@JvmName("lowerType246")
fun lowerType246(rec: org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`): DeconstructedType246 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`featureIds`)
    val uniffiFieldLowered1 = lowerString(rec.`slug`)
    val uniffiFieldLowered2 = lowerString(rec.`userFacingName`)
    val uniffiFieldLowered3 = lowerString(rec.`userFacingDescription`)
    val uniffiFieldLowered4 = lowerString(rec.`branchSlug`)
    val uniffiFieldLowered5 = lowerBoolean(rec.`isRollout`)
    return DeconstructedType246(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType246")
fun liftType246(
    v0: java.nio.ByteBuffer?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: Boolean,
): org.mozilla.experiments.nimbus.internal.`EnrolledExperiment` {
    return org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`(
        liftType16(
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
        liftString(
            v4,
        ),
        liftBoolean(
            v5,
        ),
    )
}

fun writeType246(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`) {
    writeType16(buf, offset + 0, value.`featureIds`)
    writeString(buf, offset + 16, value.`slug`)
    writeString(buf, offset + 40, value.`userFacingName`)
    writeString(buf, offset + 64, value.`userFacingDescription`)
    writeString(buf, offset + 88, value.`branchSlug`)
    writeBoolean(buf, offset + 112, value.`isRollout`)
}

fun readType246(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`EnrolledExperiment` {
    return org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`(
        readType16(buf, offset + 0),
        readString(buf, offset + 16),
        readString(buf, offset + 40),
        readString(buf, offset + 64),
        readString(buf, offset + 88),
        readBoolean(buf, offset + 112),
    )
}

@JvmName("lowerType208")
fun lowerType208(value: org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEventType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType208")
fun liftType208(value: kotlin.Int): org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEventType` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEventType`.values()[value]
}

fun writeType208(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEventType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType208(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEventType` {
    return liftType208(readInt(buf, offset))
}

// Deconstructed version of EnrollmentChangeEvent
class DeconstructedType214(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Int,
    val v4: java.nio.ByteBuffer?,
)

@JvmName("lowerType214")
fun lowerType214(rec: org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`): DeconstructedType214 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`experimentSlug`)
    val uniffiFieldLowered1 = lowerString(rec.`branchSlug`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`reason`)
    val uniffiFieldLowered3 = lowerType208(rec.`change`)
    val uniffiFieldLowered4 = lowerType16(rec.`featureIds`)
    return DeconstructedType214(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType214")
fun liftType214(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Int,
    v4: java.nio.ByteBuffer?,
): org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftType208(
            v3,
        ),
        liftType16(
            v4,
        ),
    )
}

fun writeType214(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`) {
    writeString(buf, offset + 0, value.`experimentSlug`)
    writeString(buf, offset + 24, value.`branchSlug`)
    writeType18(buf, offset + 48, value.`reason`)
    writeType208(buf, offset + 80, value.`change`)
    writeType16(buf, offset + 88, value.`featureIds`)
}

fun readType214(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType18(buf, offset + 48),
        readType208(buf, offset + 80),
        readType16(buf, offset + 88),
    )
}

// Deconstructed version of EnrollmentSlugs
class DeconstructedType199(
    val v0: String?,
    val v1: String?,
)

@JvmName("lowerType199")
fun lowerType199(rec: org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`): DeconstructedType199 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`slug`)
    val uniffiFieldLowered1 = lowerString(rec.`branchSlug`)
    return DeconstructedType199(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType199")
fun liftType199(
    v0: String?,
    v1: String?,
): org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType199(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`) {
    writeString(buf, offset + 0, value.`slug`)
    writeString(buf, offset + 24, value.`branchSlug`)
}

fun readType199(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
    )
}

@JvmName("lowerType216")
fun lowerType216(value: org.mozilla.experiments.nimbus.internal.`PrefBranch`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType216")
fun liftType216(value: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefBranch` {
    return org.mozilla.experiments.nimbus.internal.`PrefBranch`.values()[value]
}

fun writeType216(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PrefBranch`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType216(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefBranch` {
    return liftType216(readInt(buf, offset))
}


@JvmName("lowerType219")
fun lowerType219(value: org.mozilla.experiments.nimbus.internal.`PrefValue`): String? {
    return lowerString(value)
}

@JvmName("liftType219")
fun liftType219(
    v0: String?,
): org.mozilla.experiments.nimbus.internal.`PrefValue` {
    val builtinValue = liftString(
        v0,
    )
    return builtinValue
}

fun writeType219(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PrefValue`) {
    writeString(buf, offset, value)
}

fun readType219(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefValue` {
    val builtinValue = readString(buf, offset)
    return builtinValue
}


// Deconstructed version of org.mozilla.experiments.nimbus.internal.`PrefValue`?
class DeconstructedType218(
    val v0: Boolean,
    val v1: String?,
)

@JvmName("lowerType218")
fun lowerType218(value: org.mozilla.experiments.nimbus.internal.`PrefValue`?): DeconstructedType218 {
    if (value == null) {
        return DeconstructedType218(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType219(value)
        return DeconstructedType218(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType218")
fun liftType218(
    v0: Boolean,
    v1: String?,
): org.mozilla.experiments.nimbus.internal.`PrefValue`? {
    if (v0) {
        return liftType219(
            v1,
        )
    } else {
        return null
    }
}

fun writeType218(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PrefValue`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType219(buf, offset + 8, value)
    }
}
fun readType218(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefValue`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType219(buf, offset + 8)
    }
}

// Deconstructed version of OriginalGeckoPref
class DeconstructedType223(
    val v0: String?,
    val v1: Int,
    val v2: Boolean,
    val v3: String?,
)

@JvmName("lowerType223")
fun lowerType223(rec: org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`): DeconstructedType223 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`pref`)
    val uniffiFieldLowered1 = lowerType216(rec.`branch`)
    val uniffiFieldLowered2 = lowerType218(rec.`value`)
    return DeconstructedType223(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
    )
}

@JvmName("liftType223")
fun liftType223(
    v0: String?,
    v1: Int,
    v2: Boolean,
    v3: String?,
): org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref` {
    return org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`(
        liftString(
            v0,
        ),
        liftType216(
            v1,
        ),
        liftType218(
            v2,
            v3,
        ),
    )
}

fun writeType223(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`) {
    writeString(buf, offset + 0, value.`pref`)
    writeType216(buf, offset + 24, value.`branch`)
    writeType218(buf, offset + 32, value.`value`)
}

fun readType223(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref` {
    return org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`(
        readString(buf, offset + 0),
        readType216(buf, offset + 24),
        readType218(buf, offset + 32),
    )
}

// Deconstructed version of PreviousGeckoPrefState
class DeconstructedType211(
    val v0: String?,
    val v1: Int,
    val v2: Boolean,
    val v3: String?,
    val v4: String?,
    val v5: String?,
)

@JvmName("lowerType211")
fun lowerType211(rec: org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`): DeconstructedType211 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType223(rec.`originalValue`)
    val uniffiFieldLowered1 = lowerString(rec.`featureId`)
    val uniffiFieldLowered2 = lowerString(rec.`variable`)
    return DeconstructedType211(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered0.v3,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType211")
fun liftType211(
    v0: String?,
    v1: Int,
    v2: Boolean,
    v3: String?,
    v4: String?,
    v5: String?,
): org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState` {
    return org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`(
        liftType223(
            v0,
            v1,
            v2,
            v3,
        ),
        liftString(
            v4,
        ),
        liftString(
            v5,
        ),
    )
}

fun writeType211(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`) {
    writeType223(buf, offset + 0, value.`originalValue`)
    writeString(buf, offset + 64, value.`featureId`)
    writeString(buf, offset + 88, value.`variable`)
}

fun readType211(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState` {
    return org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`(
        readType223(buf, offset + 0),
        readString(buf, offset + 64),
        readString(buf, offset + 88),
    )
}


fun lowerToBuffer210(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 112).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType211(buf, offset, it)
        offset += 112
    }
    return buf
}

fun liftFromBuffer210(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 112
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType211(buf, offset))
                offset += 112
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType210")
fun lowerType210(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>): java.nio.ByteBuffer {
    return lowerToBuffer210(value)
}

@JvmName("liftType210")
fun liftType210(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`> {
    return liftFromBuffer210(buf)
}

fun writeType210(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>) {
    val childBuf = lowerToBuffer210(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType210(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer210(childBuf)
}


// Deconstructed version of kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>?
class DeconstructedType209(
    val v0: Boolean,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType209")
fun lowerType209(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>?): DeconstructedType209 {
    if (value == null) {
        return DeconstructedType209(
            false,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType210(value)
        return DeconstructedType209(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType209")
fun liftType209(
    v0: Boolean,
    v1: java.nio.ByteBuffer?,
): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>? {
    if (v0) {
        return liftType210(
            v1,
        )
    } else {
        return null
    }
}

fun writeType209(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType210(buf, offset + 8, value)
    }
}
fun readType209(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType210(buf, offset + 8)
    }
}

// Deconstructed version of EnrollmentStatusExtraDef
class DeconstructedType232(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Boolean,
    val v7: java.nio.ByteBuffer?,
)

@JvmName("lowerType232")
fun lowerType232(rec: org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`): DeconstructedType232 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`branch`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`conflictSlug`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`errorString`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`reason`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`slug`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`status`)
    val uniffiFieldLowered6 = lowerType209(rec.`prevGeckoPrefStates`)
    return DeconstructedType232(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6.v0,
        uniffiFieldLowered6.v1,
    )
}

@JvmName("liftType232")
fun liftType232(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Boolean,
    v7: java.nio.ByteBuffer?,
): org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`(
        liftOptionString(
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
        liftOptionString(
            v4,
        ),
        liftOptionString(
            v5,
        ),
        liftType209(
            v6,
            v7,
        ),
    )
}

fun writeType232(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`) {
    writeType18(buf, offset + 0, value.`branch`)
    writeType18(buf, offset + 32, value.`conflictSlug`)
    writeType18(buf, offset + 64, value.`errorString`)
    writeType18(buf, offset + 96, value.`reason`)
    writeType18(buf, offset + 128, value.`slug`)
    writeType18(buf, offset + 160, value.`status`)
    writeType209(buf, offset + 192, value.`prevGeckoPrefStates`)
}

fun readType232(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`(
        readType18(buf, offset + 0),
        readType18(buf, offset + 32),
        readType18(buf, offset + 64),
        readType18(buf, offset + 96),
        readType18(buf, offset + 128),
        readType18(buf, offset + 160),
        readType209(buf, offset + 192),
    )
}

// Deconstructed version of FeatureExposureExtraDef
class DeconstructedType233(
    val v0: String?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType233")
fun lowerType233(rec: org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`): DeconstructedType233 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`branch`)
    val uniffiFieldLowered1 = lowerString(rec.`slug`)
    val uniffiFieldLowered2 = lowerString(rec.`featureId`)
    return DeconstructedType233(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType233")
fun liftType233(
    v0: String?,
    v1: String?,
    v2: String?,
): org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`(
        liftOptionString(
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

fun writeType233(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`) {
    writeType18(buf, offset + 0, value.`branch`)
    writeString(buf, offset + 32, value.`slug`)
    writeString(buf, offset + 56, value.`featureId`)
}

fun readType233(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`(
        readType18(buf, offset + 0),
        readString(buf, offset + 32),
        readString(buf, offset + 56),
    )
}

@JvmName("lowerType212")
fun lowerType212(value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollStatus`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType212")
fun liftType212(value: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollStatus` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollStatus`.values()[value]
}

fun writeType212(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollStatus`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType212(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollStatus` {
    return liftType212(readInt(buf, offset))
}


fun lowerToBuffer213(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 104).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType214(buf, offset, it)
        offset += 104
    }
    return buf
}

fun liftFromBuffer213(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 104
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType214(buf, offset))
                offset += 104
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType213")
fun lowerType213(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>): java.nio.ByteBuffer {
    return lowerToBuffer213(value)
}

@JvmName("liftType213")
fun liftType213(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
    return liftFromBuffer213(buf)
}

fun writeType213(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>) {
    val childBuf = lowerToBuffer213(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType213(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer213(childBuf)
}

// Deconstructed version of FirefoxLabsEnrollResult
class DeconstructedType244(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType244")
fun lowerType244(rec: org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult`): DeconstructedType244 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType212(rec.`status`)
    val uniffiFieldLowered1 = lowerType213(rec.`enrollmentChangeEvents`)
    return DeconstructedType244(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType244")
fun liftType244(
    v0: Int,
    v1: java.nio.ByteBuffer?,
): org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult`(
        liftType212(
            v0,
        ),
        liftType213(
            v1,
        ),
    )
}

fun writeType244(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult`) {
    writeType212(buf, offset + 0, value.`status`)
    writeType213(buf, offset + 8, value.`enrollmentChangeEvents`)
}

fun readType244(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult`(
        readType212(buf, offset + 0),
        readType213(buf, offset + 8),
    )
}

// Deconstructed version of FirefoxLabsMetadata
class DeconstructedType250(
    val v0: String?,
    val v1: Boolean,
    val v2: String?,
    val v3: String?,
    val v4: Boolean,
    val v5: String?,
)

@JvmName("lowerType250")
fun lowerType250(rec: org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`): DeconstructedType250 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`slug`)
    val uniffiFieldLowered1 = lowerBoolean(rec.`enrolled`)
    val uniffiFieldLowered2 = lowerString(rec.`titleStringId`)
    val uniffiFieldLowered3 = lowerString(rec.`descriptionStringId`)
    val uniffiFieldLowered4 = lowerBoolean(rec.`requiresRestart`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`feedbackUrl`)
    return DeconstructedType250(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType250")
fun liftType250(
    v0: String?,
    v1: Boolean,
    v2: String?,
    v3: String?,
    v4: Boolean,
    v5: String?,
): org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`(
        liftString(
            v0,
        ),
        liftBoolean(
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
            v3,
        ),
        liftBoolean(
            v4,
        ),
        liftOptionString(
            v5,
        ),
    )
}

fun writeType250(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`) {
    writeString(buf, offset + 0, value.`slug`)
    writeBoolean(buf, offset + 24, value.`enrolled`)
    writeString(buf, offset + 32, value.`titleStringId`)
    writeString(buf, offset + 56, value.`descriptionStringId`)
    writeBoolean(buf, offset + 80, value.`requiresRestart`)
    writeType18(buf, offset + 88, value.`feedbackUrl`)
}

fun readType250(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`(
        readString(buf, offset + 0),
        readBoolean(buf, offset + 24),
        readString(buf, offset + 32),
        readString(buf, offset + 56),
        readBoolean(buf, offset + 80),
        readType18(buf, offset + 88),
    )
}

@JvmName("lowerType215")
fun lowerType215(value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollStatus`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType215")
fun liftType215(value: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollStatus` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollStatus`.values()[value]
}

fun writeType215(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollStatus`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType215(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollStatus` {
    return liftType215(readInt(buf, offset))
}

// Deconstructed version of FirefoxLabsUnenrollResult
class DeconstructedType252(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType252")
fun lowerType252(rec: org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult`): DeconstructedType252 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType215(rec.`status`)
    val uniffiFieldLowered1 = lowerType213(rec.`enrollmentChangeEvents`)
    return DeconstructedType252(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType252")
fun liftType252(
    v0: Int,
    v1: java.nio.ByteBuffer?,
): org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult`(
        liftType215(
            v0,
        ),
        liftType213(
            v1,
        ),
    )
}

fun writeType252(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult`) {
    writeType215(buf, offset + 0, value.`status`)
    writeType213(buf, offset + 8, value.`enrollmentChangeEvents`)
}

fun readType252(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult` {
    return org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult`(
        readType215(buf, offset + 0),
        readType213(buf, offset + 8),
    )
}

// Deconstructed version of GeckoPref
class DeconstructedType217(
    val v0: String?,
    val v1: Int,
)

@JvmName("lowerType217")
fun lowerType217(rec: org.mozilla.experiments.nimbus.internal.`GeckoPref`): DeconstructedType217 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`pref`)
    val uniffiFieldLowered1 = lowerType216(rec.`branch`)
    return DeconstructedType217(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType217")
fun liftType217(
    v0: String?,
    v1: Int,
): org.mozilla.experiments.nimbus.internal.`GeckoPref` {
    return org.mozilla.experiments.nimbus.internal.`GeckoPref`(
        liftString(
            v0,
        ),
        liftType216(
            v1,
        ),
    )
}

fun writeType217(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`GeckoPref`) {
    writeString(buf, offset + 0, value.`pref`)
    writeType216(buf, offset + 24, value.`branch`)
}

fun readType217(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`GeckoPref` {
    return org.mozilla.experiments.nimbus.internal.`GeckoPref`(
        readString(buf, offset + 0),
        readType216(buf, offset + 24),
    )
}

// Deconstructed version of PrefEnrollmentData
class DeconstructedType221(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType221")
fun lowerType221(rec: org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`): DeconstructedType221 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`experimentSlug`)
    val uniffiFieldLowered1 = lowerType219(rec.`prefValue`)
    val uniffiFieldLowered2 = lowerString(rec.`featureId`)
    val uniffiFieldLowered3 = lowerString(rec.`variable`)
    return DeconstructedType221(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType221")
fun liftType221(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
): org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData` {
    return org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`(
        liftString(
            v0,
        ),
        liftType219(
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
            v3,
        ),
    )
}

fun writeType221(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`) {
    writeString(buf, offset + 0, value.`experimentSlug`)
    writeType219(buf, offset + 24, value.`prefValue`)
    writeString(buf, offset + 48, value.`featureId`)
    writeString(buf, offset + 72, value.`variable`)
}

fun readType221(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData` {
    return org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`(
        readString(buf, offset + 0),
        readType219(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
    )
}


// Deconstructed version of org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`?
class DeconstructedType220(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
)

@JvmName("lowerType220")
fun lowerType220(value: org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`?): DeconstructedType220 {
    if (value == null) {
        return DeconstructedType220(
            false,
            null,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType221(value)
        return DeconstructedType220(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
        )
    }
}

@JvmName("liftType220")
fun liftType220(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
): org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`? {
    if (v0) {
        return liftType221(
            v1,
            v2,
            v3,
            v4,
        )
    } else {
        return null
    }
}

fun writeType220(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType221(buf, offset + 8, value)
    }
}
fun readType220(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType221(buf, offset + 8)
    }
}

// Deconstructed version of GeckoPrefState
class DeconstructedType226(
    val v0: String?,
    val v1: Int,
    val v2: Boolean,
    val v3: String?,
    val v4: Boolean,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: Boolean,
)

@JvmName("lowerType226")
fun lowerType226(rec: org.mozilla.experiments.nimbus.internal.`GeckoPrefState`): DeconstructedType226 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType217(rec.`geckoPref`)
    val uniffiFieldLowered1 = lowerType218(rec.`geckoValue`)
    val uniffiFieldLowered2 = lowerType220(rec.`enrollmentValue`)
    val uniffiFieldLowered3 = lowerBoolean(rec.`isUserSet`)
    return DeconstructedType226(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered2.v2,
        uniffiFieldLowered2.v3,
        uniffiFieldLowered2.v4,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType226")
fun liftType226(
    v0: String?,
    v1: Int,
    v2: Boolean,
    v3: String?,
    v4: Boolean,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: Boolean,
): org.mozilla.experiments.nimbus.internal.`GeckoPrefState` {
    return org.mozilla.experiments.nimbus.internal.`GeckoPrefState`(
        liftType217(
            v0,
            v1,
        ),
        liftType218(
            v2,
            v3,
        ),
        liftType220(
            v4,
            v5,
            v6,
            v7,
            v8,
        ),
        liftBoolean(
            v9,
        ),
    )
}

fun writeType226(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`GeckoPrefState`) {
    writeType217(buf, offset + 0, value.`geckoPref`)
    writeType218(buf, offset + 32, value.`geckoValue`)
    writeType220(buf, offset + 64, value.`enrollmentValue`)
    writeBoolean(buf, offset + 168, value.`isUserSet`)
}

fun readType226(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`GeckoPrefState` {
    return org.mozilla.experiments.nimbus.internal.`GeckoPrefState`(
        readType217(buf, offset + 0),
        readType218(buf, offset + 32),
        readType220(buf, offset + 64),
        readBoolean(buf, offset + 168),
    )
}

// Deconstructed version of MalformedFeatureConfigExtraDef
class DeconstructedType234(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType234")
fun lowerType234(rec: org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef`): DeconstructedType234 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`branch`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`slug`)
    val uniffiFieldLowered2 = lowerString(rec.`featureId`)
    val uniffiFieldLowered3 = lowerString(rec.`part`)
    return DeconstructedType234(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType234")
fun liftType234(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
): org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef`(
        liftOptionString(
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
    )
}

fun writeType234(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef`) {
    writeType18(buf, offset + 0, value.`branch`)
    writeType18(buf, offset + 32, value.`slug`)
    writeString(buf, offset + 64, value.`featureId`)
    writeString(buf, offset + 88, value.`part`)
}

fun readType234(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef` {
    return org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef`(
        readType18(buf, offset + 0),
        readType18(buf, offset + 32),
        readString(buf, offset + 64),
        readString(buf, offset + 88),
    )
}

// Deconstructed version of NimbusServerSettings
class DeconstructedType241(
    val v0: Long,
    val v1: String?,
)

@JvmName("lowerType241")
fun lowerType241(rec: org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`): DeconstructedType241 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType222(rec.`rsService`)
    val uniffiFieldLowered1 = lowerString(rec.`collectionName`)
    return DeconstructedType241(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType241")
fun liftType241(
    v0: Long,
    v1: String?,
): org.mozilla.experiments.nimbus.internal.`NimbusServerSettings` {
    return org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`(
        liftType222(
            v0,
        ),
        liftString(
            v1,
        ),
    )
}

fun writeType241(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`) {
    writeType222(buf, offset + 0, value.`rsService`)
    writeString(buf, offset + 8, value.`collectionName`)
}

fun readType241(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`NimbusServerSettings` {
    return org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`(
        readType222(buf, offset + 0),
        readString(buf, offset + 8),
    )
}

@JvmName("liftType200")
fun liftType200(v0: kotlin.Int, v1: kotlin.String): org.mozilla.experiments.nimbus.internal.`NimbusException` {
    return when(v0) {
        0 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidPersistedData`(v1)
        1 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`RkvException`(v1)
        2 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`IoException`(v1)
        3 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`JsonException`(v1)
        4 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`EvaluationException`(v1)
        5 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidExpression`(v1)
        6 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidFraction`(v1)
        7 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`TryFromSliceException`(v1)
        8 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`EmptyRatiosException`(v1)
        9 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`OutOfBoundsException`(v1)
        10 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`UrlParsingException`(v1)
        11 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`UuidException`(v1)
        12 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidExperimentFormat`(v1)
        13 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidPath`(v1)
        14 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InternalException`(v1)
        15 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`NoSuchExperiment`(v1)
        16 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`NoSuchBranch`(v1)
        17 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`DatabaseNotReady`(v1)
        18 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`VersionParsingException`(v1)
        19 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`BehaviorException`(v1)
        20 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`TryFromIntException`(v1)
        21 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`ParseIntException`(v1)
        22 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`TransformParameterException`(v1)
        23 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`ClientException`(v1)
        24 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`UniFfiCallbackException`(v1)
        25 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`RegexException`(v1)
        else -> throw uniffi.InternalException("liftType200: Invalid enum value: ${v0}")
    }
}


fun readType200(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`NimbusException` {
    val uniffiDiscriminent = readInt(buf, offset)
    return when(uniffiDiscriminent) {
        0 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidPersistedData`(readString(buf, offset + 8))
        1 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`RkvException`(readString(buf, offset + 8))
        2 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`IoException`(readString(buf, offset + 8))
        3 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`JsonException`(readString(buf, offset + 8))
        4 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`EvaluationException`(readString(buf, offset + 8))
        5 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidExpression`(readString(buf, offset + 8))
        6 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidFraction`(readString(buf, offset + 8))
        7 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`TryFromSliceException`(readString(buf, offset + 8))
        8 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`EmptyRatiosException`(readString(buf, offset + 8))
        9 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`OutOfBoundsException`(readString(buf, offset + 8))
        10 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`UrlParsingException`(readString(buf, offset + 8))
        11 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`UuidException`(readString(buf, offset + 8))
        12 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidExperimentFormat`(readString(buf, offset + 8))
        13 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InvalidPath`(readString(buf, offset + 8))
        14 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`InternalException`(readString(buf, offset + 8))
        15 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`NoSuchExperiment`(readString(buf, offset + 8))
        16 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`NoSuchBranch`(readString(buf, offset + 8))
        17 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`DatabaseNotReady`(readString(buf, offset + 8))
        18 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`VersionParsingException`(readString(buf, offset + 8))
        19 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`BehaviorException`(readString(buf, offset + 8))
        20 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`TryFromIntException`(readString(buf, offset + 8))
        21 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`ParseIntException`(readString(buf, offset + 8))
        22 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`TransformParameterException`(readString(buf, offset + 8))
        23 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`ClientException`(readString(buf, offset + 8))
        24 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`UniFfiCallbackException`(readString(buf, offset + 8))
        25 -> org.mozilla.experiments.nimbus.internal.`NimbusException`.`RegexException`(readString(buf, offset + 8))
        else -> throw uniffi.InternalException("readType200: Invalid enum value: ${uniffiDiscriminent}")
    }
}



@JvmName("lowerType251")
fun lowerType251(value: org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType251")
fun liftType251(value: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason` {
    return org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason`.values()[value]
}

fun writeType251(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType251(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason` {
    return liftType251(readInt(buf, offset))
}


@JvmName("lowerType225")
fun lowerType225(value: kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 200).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType226(buf, offset + 24, it.value)
        offset += 200
    }
    return buf
}

@JvmName("liftType225")
fun liftType225(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 200
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType226(buf, offset + 24),
                )
                offset += 200
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType225(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>) {
    val childBuf = lowerType225(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType225(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType225(childBuf)
}


@JvmName("lowerType224")
fun lowerType224(value: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 40).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType225(buf, offset + 24, it.value)
        offset += 40
    }
    return buf
}

@JvmName("liftType224")
fun liftType224(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 40
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType225(buf, offset + 24),
                )
                offset += 40
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType224(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>>) {
    val childBuf = lowerType224(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType224(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType224(childBuf)
}


fun lowerToBuffer227(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 64).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType223(buf, offset, it)
        offset += 64
    }
    return buf
}

fun liftFromBuffer227(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 64
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType223(buf, offset))
                offset += 64
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType227")
fun lowerType227(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`>): java.nio.ByteBuffer {
    return lowerToBuffer227(value)
}

@JvmName("liftType227")
fun liftType227(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`> {
    return liftFromBuffer227(buf)
}

fun writeType227(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`>) {
    val childBuf = lowerToBuffer227(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType227(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer227(childBuf)
}


fun lowerToBuffer228(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 176).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType226(buf, offset, it)
        offset += 176
    }
    return buf
}

fun liftFromBuffer228(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 176
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType226(buf, offset))
                offset += 176
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType228")
fun lowerType228(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): java.nio.ByteBuffer {
    return lowerToBuffer228(value)
}

@JvmName("liftType228")
fun liftType228(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`> {
    return liftFromBuffer228(buf)
}

fun writeType228(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>) {
    val childBuf = lowerToBuffer228(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType228(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer228(childBuf)
}

fun objectToHandle239(obj: org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`): kotlin.Long {
    if (obj is org.mozilla.experiments.nimbus.internal.GeckoPrefHandlerImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap239.insert(obj)
    }
}

fun handleToObject239(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return org.mozilla.experiments.nimbus.internal.GeckoPrefHandlerImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap239.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef239")
fun lowerObjectReceiverRef239(value: org.mozilla.experiments.nimbus.internal.GeckoPrefHandlerImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType239")
fun lowerType239(value: org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`): kotlin.Long {
    return objectToHandle239(value)
}

@JvmName("liftType239")
fun liftType239(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler` {
    return handleToObject239(handle)
}

fun writeType239(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`) {
    writeLong(buf, offset, objectToHandle239(value))
}

fun readType239(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler` {
    return handleToObject239(readLong(buf, offset))
}


public val callbackInterfaceHandleMap239 = uniffi.HandleMap<org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`>();
fun callbackInterfaceDispatch239000000(
    uniffiHandle: kotlin.Long,
) : java.nio.ByteBuffer?
{
    val uniffiObj = callbackInterfaceHandleMap239.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`getPrefsWithState`(
    )
    return lowerType224(uniffiReturn)
}
fun callbackInterfaceDispatch239000001(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: java.nio.ByteBuffer?,
)
{
    val uniffiObj = callbackInterfaceHandleMap239.get(uniffiHandle)
    val `originalGeckoPrefs` = liftType227(
        `uniffiArg1`,
    )
    val uniffiReturn = uniffiObj.`setGeckoPrefsOriginalValues`(
        `originalGeckoPrefs`,
    )
}
fun callbackInterfaceDispatch239000002(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: java.nio.ByteBuffer?,
)
{
    val uniffiObj = callbackInterfaceHandleMap239.get(uniffiHandle)
    val `newPrefsState` = liftType228(
        `uniffiArg1`,
    )
    val uniffiReturn = uniffiObj.`setGeckoPrefsState`(
        `newPrefsState`,
    )
}

fun callbackInterfaceFree239(handle: kotlin.Long) {
    callbackInterfaceHandleMap239.remove(handle)
}


fun lowerToBuffer231(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 216).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType232(buf, offset, it)
        offset += 216
    }
    return buf
}

fun liftFromBuffer231(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 216
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType232(buf, offset))
                offset += 216
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType231")
fun lowerType231(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`>): java.nio.ByteBuffer {
    return lowerToBuffer231(value)
}

@JvmName("liftType231")
fun liftType231(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`> {
    return liftFromBuffer231(buf)
}

fun writeType231(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`>) {
    val childBuf = lowerToBuffer231(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType231(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer231(childBuf)
}

fun objectToHandle237(obj: org.mozilla.experiments.nimbus.internal.`MetricsHandler`): kotlin.Long {
    if (obj is org.mozilla.experiments.nimbus.internal.MetricsHandlerImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap237.insert(obj)
    }
}

fun handleToObject237(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`MetricsHandler` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return org.mozilla.experiments.nimbus.internal.MetricsHandlerImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap237.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef237")
fun lowerObjectReceiverRef237(value: org.mozilla.experiments.nimbus.internal.MetricsHandlerImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType237")
fun lowerType237(value: org.mozilla.experiments.nimbus.internal.`MetricsHandler`): kotlin.Long {
    return objectToHandle237(value)
}

@JvmName("liftType237")
fun liftType237(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`MetricsHandler` {
    return handleToObject237(handle)
}

fun writeType237(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`MetricsHandler`) {
    writeLong(buf, offset, objectToHandle237(value))
}

fun readType237(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`MetricsHandler` {
    return handleToObject237(readLong(buf, offset))
}


public val callbackInterfaceHandleMap237 = uniffi.HandleMap<org.mozilla.experiments.nimbus.internal.`MetricsHandler`>();
fun callbackInterfaceDispatch237000000(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: Long,
    `uniffiArg2`: String?,
    `uniffiArg3`: Long,
    `uniffiArg4`: Long,
    `uniffiArg5`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val `event` = liftType229(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
        `uniffiArg4`,
        `uniffiArg5`,
    )
    val uniffiReturn = uniffiObj.`recordDatabaseLoad`(
        `event`,
    )
}
fun callbackInterfaceDispatch237000001(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: Short,
    `uniffiArg3`: Short,
    `uniffiArg4`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val `event` = liftType230(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
        `uniffiArg4`,
    )
    val uniffiReturn = uniffiObj.`recordDatabaseMigration`(
        `event`,
    )
}
fun callbackInterfaceDispatch237000002(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: java.nio.ByteBuffer?,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val `enrollmentStatusExtras` = liftType231(
        `uniffiArg1`,
    )
    val uniffiReturn = uniffiObj.`recordEnrollmentStatuses`(
        `enrollmentStatusExtras`,
    )
}
fun callbackInterfaceDispatch237000003(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
    `uniffiArg3`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val `event` = liftType233(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
    )
    val uniffiReturn = uniffiObj.`recordFeatureActivation`(
        `event`,
    )
}
fun callbackInterfaceDispatch237000004(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
    `uniffiArg3`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val `event` = liftType233(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
    )
    val uniffiReturn = uniffiObj.`recordFeatureExposure`(
        `event`,
    )
}
fun callbackInterfaceDispatch237000005(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: String?,
    `uniffiArg2`: String?,
    `uniffiArg3`: String?,
    `uniffiArg4`: String?,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val `event` = liftType234(
        `uniffiArg1`,
        `uniffiArg2`,
        `uniffiArg3`,
        `uniffiArg4`,
    )
    val uniffiReturn = uniffiObj.`recordMalformedFeatureConfig`(
        `event`,
    )
}
fun callbackInterfaceDispatch237000006(
    uniffiHandle: kotlin.Long,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`recordRolloutsOptOut`(
    )
}
fun callbackInterfaceDispatch237000007(
    uniffiHandle: kotlin.Long,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`recordStudiesOptOut`(
    )
}
fun callbackInterfaceDispatch237000008(
    uniffiHandle: kotlin.Long,
)
{
    val uniffiObj = callbackInterfaceHandleMap237.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`submitTargetingContext`(
    )
}

fun callbackInterfaceFree237(handle: kotlin.Long) {
    callbackInterfaceHandleMap237.remove(handle)
}

fun objectToHandle242(obj: org.mozilla.experiments.nimbus.internal.`NimbusStringHelper`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject242(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`NimbusStringHelper` {
    return org.mozilla.experiments.nimbus.internal.`NimbusStringHelper`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef242")
fun lowerObjectRef242(value: org.mozilla.experiments.nimbus.internal.`NimbusStringHelper`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType242")
fun lowerType242(value: org.mozilla.experiments.nimbus.internal.`NimbusStringHelper`): kotlin.Long {
    return objectToHandle242(value)
}

@JvmName("liftType242")
fun liftType242(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`NimbusStringHelper` {
    return handleToObject242(handle)
}

fun writeType242(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`NimbusStringHelper`) {
    writeLong(buf, offset, objectToHandle242(value))
}

fun readType242(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`NimbusStringHelper` {
    return handleToObject242(readLong(buf, offset))
}

fun objectToHandle243(obj: org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject243(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper` {
    return org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef243")
fun lowerObjectRef243(value: org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType243")
fun lowerType243(value: org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper`): kotlin.Long {
    return objectToHandle243(value)
}

@JvmName("liftType243")
fun liftType243(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper` {
    return handleToObject243(handle)
}

fun writeType243(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper`) {
    writeLong(buf, offset, objectToHandle243(value))
}

fun readType243(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper` {
    return handleToObject243(readLong(buf, offset))
}


fun lowerToBuffer245(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 120).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType246(buf, offset, it)
        offset += 120
    }
    return buf
}

fun liftFromBuffer245(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 120
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType246(buf, offset))
                offset += 120
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType245")
fun lowerType245(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`>): java.nio.ByteBuffer {
    return lowerToBuffer245(value)
}

@JvmName("liftType245")
fun liftType245(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`> {
    return liftFromBuffer245(buf)
}

fun writeType245(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`>) {
    val childBuf = lowerToBuffer245(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType245(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer245(childBuf)
}


fun lowerToBuffer247(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 120).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType248(buf, offset, it)
        offset += 120
    }
    return buf
}

fun liftFromBuffer247(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 120
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType248(buf, offset))
                offset += 120
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType247")
fun lowerType247(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`>): java.nio.ByteBuffer {
    return lowerToBuffer247(value)
}

@JvmName("liftType247")
fun liftType247(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`> {
    return liftFromBuffer247(buf)
}

fun writeType247(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`>) {
    val childBuf = lowerToBuffer247(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType247(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer247(childBuf)
}


fun lowerToBuffer249(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 120).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType250(buf, offset, it)
        offset += 120
    }
    return buf
}

fun liftFromBuffer249(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 120
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType250(buf, offset))
                offset += 120
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType249")
fun lowerType249(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`>): java.nio.ByteBuffer {
    return lowerToBuffer249(value)
}

@JvmName("liftType249")
fun liftType249(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`> {
    return liftFromBuffer249(buf)
}

fun writeType249(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`>) {
    val childBuf = lowerToBuffer249(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType249(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer249(childBuf)
}

fun objectToHandle4303(obj: org.mozilla.experiments.nimbus.internal.`NimbusClient`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject4303(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`NimbusClient` {
    return org.mozilla.experiments.nimbus.internal.`NimbusClient`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef4303")
fun lowerObjectRef4303(value: org.mozilla.experiments.nimbus.internal.`NimbusClient`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType4303")
fun lowerType4303(value: org.mozilla.experiments.nimbus.internal.`NimbusClient`): kotlin.Long {
    return objectToHandle4303(value)
}

@JvmName("liftType4303")
fun liftType4303(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`NimbusClient` {
    return handleToObject4303(handle)
}

fun writeType4303(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`NimbusClient`) {
    writeLong(buf, offset, objectToHandle4303(value))
}

fun readType4303(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`NimbusClient` {
    return handleToObject4303(readLong(buf, offset))
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



fun objectToHandle202(obj: org.mozilla.experiments.nimbus.internal.`RecordedContext`): kotlin.Long {
    if (obj is org.mozilla.experiments.nimbus.internal.RecordedContextImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap202.insert(obj)
    }
}

fun handleToObject202(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`RecordedContext` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return org.mozilla.experiments.nimbus.internal.RecordedContextImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap202.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef202")
fun lowerObjectReceiverRef202(value: org.mozilla.experiments.nimbus.internal.RecordedContextImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType202")
fun lowerType202(value: org.mozilla.experiments.nimbus.internal.`RecordedContext`): kotlin.Long {
    return objectToHandle202(value)
}

@JvmName("liftType202")
fun liftType202(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`RecordedContext` {
    return handleToObject202(handle)
}

fun writeType202(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`RecordedContext`) {
    writeLong(buf, offset, objectToHandle202(value))
}

fun readType202(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`RecordedContext` {
    return handleToObject202(readLong(buf, offset))
}


public val callbackInterfaceHandleMap202 = uniffi.HandleMap<org.mozilla.experiments.nimbus.internal.`RecordedContext`>();
fun callbackInterfaceDispatch202000000(
    uniffiHandle: kotlin.Long,
) : java.nio.ByteBuffer?
{
    val uniffiObj = callbackInterfaceHandleMap202.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`getEventQueries`(
    )
    return lowerType131(uniffiReturn)
}
fun callbackInterfaceDispatch202000001(
    uniffiHandle: kotlin.Long,
)
{
    val uniffiObj = callbackInterfaceHandleMap202.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`record`(
    )
}
fun callbackInterfaceDispatch202000002(
    uniffiHandle: kotlin.Long,
    `uniffiArg1`: java.nio.ByteBuffer?,
)
{
    val uniffiObj = callbackInterfaceHandleMap202.get(uniffiHandle)
    val `eventQueryValues` = liftType25(
        `uniffiArg1`,
    )
    val uniffiReturn = uniffiObj.`setEventQueryValues`(
        `eventQueryValues`,
    )
}
fun callbackInterfaceDispatch202000003(
    uniffiHandle: kotlin.Long,
) : String?
{
    val uniffiObj = callbackInterfaceHandleMap202.get(uniffiHandle)
    val uniffiReturn = uniffiObj.`toJson`(
    )
    return lowerType204(uniffiReturn)
}

fun callbackInterfaceFree202(handle: kotlin.Long) {
    callbackInterfaceHandleMap202.remove(handle)
}


fun lowerToBuffer198(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 48).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType199(buf, offset, it)
        offset += 48
    }
    return buf
}

fun liftFromBuffer198(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 48
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType199(buf, offset))
                offset += 48
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType198")
fun lowerType198(value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`>): java.nio.ByteBuffer {
    return lowerToBuffer198(value)
}

@JvmName("liftType198")
fun liftType198(buf: java.nio.ByteBuffer?): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`> {
    return liftFromBuffer198(buf)
}

fun writeType198(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`>) {
    val childBuf = lowerToBuffer198(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType198(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer198(childBuf)
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


@JvmName("lowerType236")
fun lowerType236(value: org.mozilla.experiments.nimbus.internal.`RecordedContext`?): kotlin.Long {
    if (value == null) {
        return 0
    } else {
        return lowerType202(value)
    }
}

@JvmName("liftType236")
fun liftType236(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`RecordedContext`? {
    if (handle > 0) {
        return liftType202(handle)
    } else {
        return null
    }
}

fun writeType236(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`RecordedContext`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType202(buf, offset + 8, value)
    }
}
fun readType236(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`RecordedContext`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType202(buf, offset + 8)
    }
}


@JvmName("lowerType238")
fun lowerType238(value: org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`?): kotlin.Long {
    if (value == null) {
        return 0
    } else {
        return lowerType239(value)
    }
}

@JvmName("liftType238")
fun liftType238(handle: kotlin.Long): org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`? {
    if (handle > 0) {
        return liftType239(handle)
    } else {
        return null
    }
}

fun writeType238(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType239(buf, offset + 8, value)
    }
}
fun readType238(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType239(buf, offset + 8)
    }
}


// Deconstructed version of org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`?
class DeconstructedType240(
    val v0: Boolean,
    val v1: Long,
    val v2: String?,
)

@JvmName("lowerType240")
fun lowerType240(value: org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`?): DeconstructedType240 {
    if (value == null) {
        return DeconstructedType240(
            false,
            0L,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType241(value)
        return DeconstructedType240(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
        )
    }
}

@JvmName("liftType240")
fun liftType240(
    v0: Boolean,
    v1: Long,
    v2: String?,
): org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`? {
    if (v0) {
        return liftType241(
            v1,
            v2,
        )
    } else {
        return null
    }
}

fun writeType240(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType241(buf, offset + 8, value)
    }
}
fun readType240(buf: java.nio.ByteBuffer, offset: kotlin.Int): org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType241(buf, offset + 8)
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




inline fun lowerBytesRef(v: java.nio.ByteBuffer): java.nio.ByteBuffer? {
    return uniffi.lowerBytesRef(v)
}

object Scaffolding {
    init {
        // Reference uniffi.Scaffolding to ensure it's init() function runs
        @Suppress("UNUSED_EXPRESSION")
        uniffi.Scaffolding
    }
    @JvmName("functionNimbusGetActiveEnrollments")
    @JvmStatic external fun functionNimbusGetActiveEnrollments(
        `uniffiArg0`: String?,
    ) : java.nio.ByteBuffer?
    @JvmName("functionNimbusGetCalculatedAttributes")
    @JvmStatic external fun functionNimbusGetCalculatedAttributes(
        `uniffiArg0`: Boolean,
        `uniffiArg1`: Long,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
    ) : org.mozilla.experiments.nimbus.internal.`CalculatedAttributes`
    @JvmName("functionNimbusValidateEventQueries")
    @JvmStatic external fun functionNimbusValidateEventQueries(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusGeckoPrefHandlerGetPrefsWithState")
    @JvmStatic external fun methodNimbusGeckoPrefHandlerGetPrefsWithState(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusGeckoPrefHandlerSetGeckoPrefsOriginalValues")
    @JvmStatic external fun methodNimbusGeckoPrefHandlerSetGeckoPrefsOriginalValues(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodNimbusGeckoPrefHandlerSetGeckoPrefsState")
    @JvmStatic external fun methodNimbusGeckoPrefHandlerSetGeckoPrefsState(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordDatabaseLoad")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordDatabaseLoad(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: String?,
        `uniffiArg3`: Long,
        `uniffiArg4`: Long,
        `uniffiArg5`: String?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordDatabaseMigration")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordDatabaseMigration(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Short,
        `uniffiArg3`: Short,
        `uniffiArg4`: String?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordEnrollmentStatuses")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordEnrollmentStatuses(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordFeatureActivation")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordFeatureActivation(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordFeatureExposure")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordFeatureExposure(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordMalformedFeatureConfig")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordMalformedFeatureConfig(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
    )
    @JvmName("methodNimbusMetricsHandlerRecordRolloutsOptOut")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordRolloutsOptOut(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusMetricsHandlerRecordStudiesOptOut")
    @JvmStatic external fun methodNimbusMetricsHandlerRecordStudiesOptOut(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusMetricsHandlerSubmitTargetingContext")
    @JvmStatic external fun methodNimbusMetricsHandlerSubmitTargetingContext(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusNimbusStringHelperGetUuid")
    @JvmStatic external fun methodNimbusNimbusStringHelperGetUuid(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodNimbusNimbusStringHelperStringFormat")
    @JvmStatic external fun methodNimbusNimbusStringHelperStringFormat(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    ) : String?
    @JvmName("methodNimbusNimbusTargetingHelperEvalJexl")
    @JvmStatic external fun methodNimbusNimbusTargetingHelperEvalJexl(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodNimbusNimbusTargetingHelperEvalJexlDebug")
    @JvmStatic external fun methodNimbusNimbusTargetingHelperEvalJexlDebug(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodNimbusNimbusClientAdvanceEventTime")
    @JvmStatic external fun methodNimbusNimbusClientAdvanceEventTime(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    )
    @JvmName("methodNimbusNimbusClientApplyPendingExperiments")
    @JvmStatic external fun methodNimbusNimbusClientApplyPendingExperiments(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientClearEvents")
    @JvmStatic external fun methodNimbusNimbusClientClearEvents(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusNimbusClientCreateStringHelper")
    @JvmStatic external fun methodNimbusNimbusClientCreateStringHelper(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: String?,
    ) : Long
    @JvmName("methodNimbusNimbusClientCreateTargetingHelper")
    @JvmStatic external fun methodNimbusNimbusClientCreateTargetingHelper(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: String?,
    ) : Long
    @JvmName("methodNimbusNimbusClientDumpStateToLog")
    @JvmStatic external fun methodNimbusNimbusClientDumpStateToLog(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusNimbusClientEnrollInFirefoxLab")
    @JvmStatic external fun methodNimbusNimbusClientEnrollInFirefoxLab(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult`
    @JvmName("methodNimbusNimbusClientFetchExperiments")
    @JvmStatic external fun methodNimbusNimbusClientFetchExperiments(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusNimbusClientGetActiveExperiments")
    @JvmStatic external fun methodNimbusNimbusClientGetActiveExperiments(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientGetAvailableExperiments")
    @JvmStatic external fun methodNimbusNimbusClientGetAvailableExperiments(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientGetAvailableFirefoxLabs")
    @JvmStatic external fun methodNimbusNimbusClientGetAvailableFirefoxLabs(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientGetExperimentBranch")
    @JvmStatic external fun methodNimbusNimbusClientGetExperimentBranch(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodNimbusNimbusClientGetExperimentBranches")
    @JvmStatic external fun methodNimbusNimbusClientGetExperimentBranches(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientGetExperimentParticipation")
    @JvmStatic external fun methodNimbusNimbusClientGetExperimentParticipation(
        `uniffiArg0`: Long,
    ) : Boolean
    @JvmName("methodNimbusNimbusClientGetFeatureConfigVariables")
    @JvmStatic external fun methodNimbusNimbusClientGetFeatureConfigVariables(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodNimbusNimbusClientGetPreviousGeckoPrefStates")
    @JvmStatic external fun methodNimbusNimbusClientGetPreviousGeckoPrefStates(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>?
    @JvmName("methodNimbusNimbusClientGetRolloutParticipation")
    @JvmStatic external fun methodNimbusNimbusClientGetRolloutParticipation(
        `uniffiArg0`: Long,
    ) : Boolean
    @JvmName("methodNimbusNimbusClientInitialize")
    @JvmStatic external fun methodNimbusNimbusClientInitialize(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusNimbusClientIsFetchEnabled")
    @JvmStatic external fun methodNimbusNimbusClientIsFetchEnabled(
        `uniffiArg0`: Long,
    ) : Boolean
    @JvmName("methodNimbusNimbusClientOptInWithBranch")
    @JvmStatic external fun methodNimbusNimbusClientOptInWithBranch(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientOptOut")
    @JvmStatic external fun methodNimbusNimbusClientOptOut(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientRecordEvent")
    @JvmStatic external fun methodNimbusNimbusClientRecordEvent(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
    )
    @JvmName("methodNimbusNimbusClientRecordFeatureExposure")
    @JvmStatic external fun methodNimbusNimbusClientRecordFeatureExposure(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    )
    @JvmName("methodNimbusNimbusClientRecordMalformedFeatureConfig")
    @JvmStatic external fun methodNimbusNimbusClientRecordMalformedFeatureConfig(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    )
    @JvmName("methodNimbusNimbusClientRecordPastEvent")
    @JvmStatic external fun methodNimbusNimbusClientRecordPastEvent(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
        `uniffiArg3`: Long,
    )
    @JvmName("methodNimbusNimbusClientRegisterPreviousGeckoPrefStates")
    @JvmStatic external fun methodNimbusNimbusClientRegisterPreviousGeckoPrefStates(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodNimbusNimbusClientResetEnrollments")
    @JvmStatic external fun methodNimbusNimbusClientResetEnrollments(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusNimbusClientResetTelemetryIdentifiers")
    @JvmStatic external fun methodNimbusNimbusClientResetTelemetryIdentifiers(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientSetExperimentParticipation")
    @JvmStatic external fun methodNimbusNimbusClientSetExperimentParticipation(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientSetExperimentsLocally")
    @JvmStatic external fun methodNimbusNimbusClientSetExperimentsLocally(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodNimbusNimbusClientSetFetchEnabled")
    @JvmStatic external fun methodNimbusNimbusClientSetFetchEnabled(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    )
    @JvmName("methodNimbusNimbusClientSetRolloutParticipation")
    @JvmStatic external fun methodNimbusNimbusClientSetRolloutParticipation(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientUnenrollForGeckoPref")
    @JvmStatic external fun methodNimbusNimbusClientUnenrollForGeckoPref(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: Boolean,
        `uniffiArg4`: String?,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: String?,
        `uniffiArg10`: Boolean,
        `uniffiArg11`: Int,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientUnenrollFromAllFirefoxLabs")
    @JvmStatic external fun methodNimbusNimbusClientUnenrollFromAllFirefoxLabs(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusNimbusClientUnenrollFromFirefoxLab")
    @JvmStatic external fun methodNimbusNimbusClientUnenrollFromFirefoxLab(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult`
    @JvmName("methodNimbusRecordedContextGetEventQueries")
    @JvmStatic external fun methodNimbusRecordedContextGetEventQueries(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodNimbusRecordedContextRecord")
    @JvmStatic external fun methodNimbusRecordedContextRecord(
        `uniffiArg0`: Long,
    )
    @JvmName("methodNimbusRecordedContextSetEventQueryValues")
    @JvmStatic external fun methodNimbusRecordedContextSetEventQueryValues(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodNimbusRecordedContextToJson")
    @JvmStatic external fun methodNimbusRecordedContextToJson(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("constructorNimbusNimbusClientNew")
    @JvmStatic external fun constructorNimbusNimbusClientNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: String?,
        `uniffiArg10`: String?,
        `uniffiArg11`: String?,
        `uniffiArg12`: String?,
        `uniffiArg13`: Boolean,
        `uniffiArg14`: Long,
        `uniffiArg15`: Boolean,
        `uniffiArg16`: String?,
        `uniffiArg17`: Long,
        `uniffiArg18`: java.nio.ByteBuffer?,
        `uniffiArg19`: String?,
        `uniffiArg20`: Long,
        `uniffiArg21`: Long,
        `uniffiArg22`: Boolean,
        `uniffiArg23`: Long,
        `uniffiArg24`: String?,
    ) : Long
    @JvmStatic external fun objectCloneHandle239(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree239(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle237(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree237(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle242(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree242(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle243(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree243(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle4303(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree4303(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle202(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree202(handle: kotlin.Long)
}