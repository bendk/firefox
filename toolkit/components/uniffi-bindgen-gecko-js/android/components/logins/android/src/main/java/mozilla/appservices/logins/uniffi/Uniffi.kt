@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.logins.uniffi
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



// Deconstructed version of Login
class DeconstructedType154(
    val v0: String?,
    val v1: Long,
    val v2: Long,
    val v3: Long,
    val v4: Long,
    val v5: Boolean,
    val v6: Long,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: String?,
)

@JvmName("lowerType154")
fun lowerType154(rec: mozilla.appservices.logins.`Login`): DeconstructedType154 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerLong(rec.`timesUsed`)
    val uniffiFieldLowered2 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered3 = lowerLong(rec.`timeLastUsed`)
    val uniffiFieldLowered4 = lowerLong(rec.`timePasswordChanged`)
    val uniffiFieldLowered5 = lowerType56(rec.`timeLastBreachAlertDismissed`)
    val uniffiFieldLowered6 = lowerString(rec.`origin`)
    val uniffiFieldLowered7 = lowerOptionString(rec.`httpRealm`)
    val uniffiFieldLowered8 = lowerOptionString(rec.`formActionOrigin`)
    val uniffiFieldLowered9 = lowerString(rec.`usernameField`)
    val uniffiFieldLowered10 = lowerString(rec.`passwordField`)
    val uniffiFieldLowered11 = lowerString(rec.`password`)
    val uniffiFieldLowered12 = lowerString(rec.`username`)
    return DeconstructedType154(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
        uniffiFieldLowered11,
        uniffiFieldLowered12,
    )
}

@JvmName("liftType154")
fun liftType154(
    v0: String?,
    v1: Long,
    v2: Long,
    v3: Long,
    v4: Long,
    v5: Boolean,
    v6: Long,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: String?,
): mozilla.appservices.logins.`Login` {
    return mozilla.appservices.logins.`Login`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
        liftLong(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftLong(
            v4,
        ),
        liftType56(
            v5,
            v6,
        ),
        liftString(
            v7,
        ),
        liftOptionString(
            v8,
        ),
        liftOptionString(
            v9,
        ),
        liftString(
            v10,
        ),
        liftString(
            v11,
        ),
        liftString(
            v12,
        ),
        liftString(
            v13,
        ),
    )
}

fun writeType154(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`Login`) {
    writeString(buf, offset + 0, value.`id`)
    writeLong(buf, offset + 24, value.`timesUsed`)
    writeLong(buf, offset + 32, value.`timeCreated`)
    writeLong(buf, offset + 40, value.`timeLastUsed`)
    writeLong(buf, offset + 48, value.`timePasswordChanged`)
    writeType56(buf, offset + 56, value.`timeLastBreachAlertDismissed`)
    writeString(buf, offset + 72, value.`origin`)
    writeType18(buf, offset + 96, value.`httpRealm`)
    writeType18(buf, offset + 128, value.`formActionOrigin`)
    writeString(buf, offset + 160, value.`usernameField`)
    writeString(buf, offset + 184, value.`passwordField`)
    writeString(buf, offset + 208, value.`password`)
    writeString(buf, offset + 232, value.`username`)
}

fun readType154(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`Login` {
    return mozilla.appservices.logins.`Login`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
        readLong(buf, offset + 32),
        readLong(buf, offset + 40),
        readLong(buf, offset + 48),
        readType56(buf, offset + 56),
        readString(buf, offset + 72),
        readType18(buf, offset + 96),
        readType18(buf, offset + 128),
        readString(buf, offset + 160),
        readString(buf, offset + 184),
        readString(buf, offset + 208),
        readString(buf, offset + 232),
    )
}

// Deconstructed version of LoginCandidate
class DeconstructedType167(
    val v0: String?,
    val v1: Long,
    val v2: Long,
    val v3: Long,
    val v4: Long,
    val v5: Boolean,
    val v6: Long,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
)

@JvmName("lowerType167")
fun lowerType167(rec: mozilla.appservices.logins.`LoginCandidate`): DeconstructedType167 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerLong(rec.`timesUsed`)
    val uniffiFieldLowered2 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered3 = lowerLong(rec.`timeLastUsed`)
    val uniffiFieldLowered4 = lowerLong(rec.`timePasswordChanged`)
    val uniffiFieldLowered5 = lowerType56(rec.`timeLastBreachAlertDismissed`)
    val uniffiFieldLowered6 = lowerString(rec.`origin`)
    val uniffiFieldLowered7 = lowerOptionString(rec.`httpRealm`)
    val uniffiFieldLowered8 = lowerOptionString(rec.`formActionOrigin`)
    val uniffiFieldLowered9 = lowerString(rec.`usernameField`)
    val uniffiFieldLowered10 = lowerString(rec.`passwordField`)
    return DeconstructedType167(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
    )
}

@JvmName("liftType167")
fun liftType167(
    v0: String?,
    v1: Long,
    v2: Long,
    v3: Long,
    v4: Long,
    v5: Boolean,
    v6: Long,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
): mozilla.appservices.logins.`LoginCandidate` {
    return mozilla.appservices.logins.`LoginCandidate`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
        liftLong(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftLong(
            v4,
        ),
        liftType56(
            v5,
            v6,
        ),
        liftString(
            v7,
        ),
        liftOptionString(
            v8,
        ),
        liftOptionString(
            v9,
        ),
        liftString(
            v10,
        ),
        liftString(
            v11,
        ),
    )
}

fun writeType167(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginCandidate`) {
    writeString(buf, offset + 0, value.`id`)
    writeLong(buf, offset + 24, value.`timesUsed`)
    writeLong(buf, offset + 32, value.`timeCreated`)
    writeLong(buf, offset + 40, value.`timeLastUsed`)
    writeLong(buf, offset + 48, value.`timePasswordChanged`)
    writeType56(buf, offset + 56, value.`timeLastBreachAlertDismissed`)
    writeString(buf, offset + 72, value.`origin`)
    writeType18(buf, offset + 96, value.`httpRealm`)
    writeType18(buf, offset + 128, value.`formActionOrigin`)
    writeString(buf, offset + 160, value.`usernameField`)
    writeString(buf, offset + 184, value.`passwordField`)
}

fun readType167(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginCandidate` {
    return mozilla.appservices.logins.`LoginCandidate`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
        readLong(buf, offset + 32),
        readLong(buf, offset + 40),
        readLong(buf, offset + 48),
        readType56(buf, offset + 56),
        readString(buf, offset + 72),
        readType18(buf, offset + 96),
        readType18(buf, offset + 128),
        readString(buf, offset + 160),
        readString(buf, offset + 184),
    )
}

// Deconstructed version of LoginEntry
class DeconstructedType152(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
)

@JvmName("lowerType152")
fun lowerType152(rec: mozilla.appservices.logins.`LoginEntry`): DeconstructedType152 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`origin`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`httpRealm`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`formActionOrigin`)
    val uniffiFieldLowered3 = lowerString(rec.`usernameField`)
    val uniffiFieldLowered4 = lowerString(rec.`passwordField`)
    val uniffiFieldLowered5 = lowerString(rec.`password`)
    val uniffiFieldLowered6 = lowerString(rec.`username`)
    return DeconstructedType152(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType152")
fun liftType152(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
): mozilla.appservices.logins.`LoginEntry` {
    return mozilla.appservices.logins.`LoginEntry`(
        liftString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftOptionString(
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
    )
}

fun writeType152(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginEntry`) {
    writeString(buf, offset + 0, value.`origin`)
    writeType18(buf, offset + 24, value.`httpRealm`)
    writeType18(buf, offset + 56, value.`formActionOrigin`)
    writeString(buf, offset + 88, value.`usernameField`)
    writeString(buf, offset + 112, value.`passwordField`)
    writeString(buf, offset + 136, value.`password`)
    writeString(buf, offset + 160, value.`username`)
}

fun readType152(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginEntry` {
    return mozilla.appservices.logins.`LoginEntry`(
        readString(buf, offset + 0),
        readType18(buf, offset + 24),
        readType18(buf, offset + 56),
        readString(buf, offset + 88),
        readString(buf, offset + 112),
        readString(buf, offset + 136),
        readString(buf, offset + 160),
    )
}

// Deconstructed version of LoginMeta
class DeconstructedType153(
    val v0: String?,
    val v1: Long,
    val v2: Long,
    val v3: Long,
    val v4: Long,
    val v5: Boolean,
    val v6: Long,
)

@JvmName("lowerType153")
fun lowerType153(rec: mozilla.appservices.logins.`LoginMeta`): DeconstructedType153 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerLong(rec.`timesUsed`)
    val uniffiFieldLowered2 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered3 = lowerLong(rec.`timeLastUsed`)
    val uniffiFieldLowered4 = lowerLong(rec.`timePasswordChanged`)
    val uniffiFieldLowered5 = lowerType56(rec.`timeLastBreachAlertDismissed`)
    return DeconstructedType153(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
    )
}

@JvmName("liftType153")
fun liftType153(
    v0: String?,
    v1: Long,
    v2: Long,
    v3: Long,
    v4: Long,
    v5: Boolean,
    v6: Long,
): mozilla.appservices.logins.`LoginMeta` {
    return mozilla.appservices.logins.`LoginMeta`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
        liftLong(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftLong(
            v4,
        ),
        liftType56(
            v5,
            v6,
        ),
    )
}

fun writeType153(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginMeta`) {
    writeString(buf, offset + 0, value.`id`)
    writeLong(buf, offset + 24, value.`timesUsed`)
    writeLong(buf, offset + 32, value.`timeCreated`)
    writeLong(buf, offset + 40, value.`timeLastUsed`)
    writeLong(buf, offset + 48, value.`timePasswordChanged`)
    writeType56(buf, offset + 56, value.`timeLastBreachAlertDismissed`)
}

fun readType153(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginMeta` {
    return mozilla.appservices.logins.`LoginMeta`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
        readLong(buf, offset + 32),
        readLong(buf, offset + 40),
        readLong(buf, offset + 48),
        readType56(buf, offset + 56),
    )
}

// Deconstructed version of LoginEntryWithMeta
class DeconstructedType160(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: Long,
    val v9: Long,
    val v10: Long,
    val v11: Long,
    val v12: Boolean,
    val v13: Long,
)

@JvmName("lowerType160")
fun lowerType160(rec: mozilla.appservices.logins.`LoginEntryWithMeta`): DeconstructedType160 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType152(rec.`entry`)
    val uniffiFieldLowered1 = lowerType153(rec.`meta`)
    return DeconstructedType160(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered0.v3,
        uniffiFieldLowered0.v4,
        uniffiFieldLowered0.v5,
        uniffiFieldLowered0.v6,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered1.v4,
        uniffiFieldLowered1.v5,
        uniffiFieldLowered1.v6,
    )
}

@JvmName("liftType160")
fun liftType160(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: Long,
    v9: Long,
    v10: Long,
    v11: Long,
    v12: Boolean,
    v13: Long,
): mozilla.appservices.logins.`LoginEntryWithMeta` {
    return mozilla.appservices.logins.`LoginEntryWithMeta`(
        liftType152(
            v0,
            v1,
            v2,
            v3,
            v4,
            v5,
            v6,
        ),
        liftType153(
            v7,
            v8,
            v9,
            v10,
            v11,
            v12,
            v13,
        ),
    )
}

fun writeType160(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginEntryWithMeta`) {
    writeType152(buf, offset + 0, value.`entry`)
    writeType153(buf, offset + 184, value.`meta`)
}

fun readType160(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginEntryWithMeta` {
    return mozilla.appservices.logins.`LoginEntryWithMeta`(
        readType152(buf, offset + 0),
        readType153(buf, offset + 184),
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



// Deconstructed version of LoginsDeletionMetrics
class DeconstructedType163(
    val v0: Long,
    val v1: Long,
)

@JvmName("lowerType163")
fun lowerType163(rec: mozilla.appservices.logins.`LoginsDeletionMetrics`): DeconstructedType163 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerULong(rec.`localDeleted`)
    val uniffiFieldLowered1 = lowerULong(rec.`mirrorDeleted`)
    return DeconstructedType163(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType163")
fun liftType163(
    v0: Long,
    v1: Long,
): mozilla.appservices.logins.`LoginsDeletionMetrics` {
    return mozilla.appservices.logins.`LoginsDeletionMetrics`(
        liftULong(
            v0,
        ),
        liftULong(
            v1,
        ),
    )
}

fun writeType163(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginsDeletionMetrics`) {
    writeULong(buf, offset + 0, value.`localDeleted`)
    writeULong(buf, offset + 8, value.`mirrorDeleted`)
}

fun readType163(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginsDeletionMetrics` {
    return mozilla.appservices.logins.`LoginsDeletionMetrics`(
        readULong(buf, offset + 0),
        readULong(buf, offset + 8),
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




@JvmName("lowerType169")
fun lowerType169(rec: mozilla.appservices.logins.`RunMaintenanceOptions`): Boolean {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerBoolean(rec.`deleteUndecryptableRecordsForRemoteReplacement`)
    return uniffiFieldLowered0
}

@JvmName("liftType169")
fun liftType169(
    v0: Boolean,
): mozilla.appservices.logins.`RunMaintenanceOptions` {
    return mozilla.appservices.logins.`RunMaintenanceOptions`(
        liftBoolean(
            v0,
        ),
    )
}

fun writeType169(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`RunMaintenanceOptions`) {
    writeBoolean(buf, offset + 0, value.`deleteUndecryptableRecordsForRemoteReplacement`)
}

fun readType169(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`RunMaintenanceOptions` {
    return mozilla.appservices.logins.`RunMaintenanceOptions`(
        readBoolean(buf, offset + 0),
    )
}

// Deconstructed version of BulkResultEntry
class DeconstructedType158(
    val v0: Int,
    val v1: String?,
    val v2: Long,
    val v3: Long,
    val v4: Long,
    val v5: Long,
    val v6: Boolean,
    val v7: Long,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: String?,
    val v14: String?,
)

@JvmName("lowerType158")
fun lowerType158(value: mozilla.appservices.logins.`BulkResultEntry`): DeconstructedType158 {
    when (value) {
        is mozilla.appservices.logins.`BulkResultEntry`.`Success` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType154(value.`login`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered6 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered7 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered14 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered8 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered9 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered10 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered11 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered12 = uniffiFieldDeconstructed0.v12
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v13
            return DeconstructedType158(
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
                uniffiFieldLowered13,
                uniffiFieldLowered14,
            )
        }
        is mozilla.appservices.logins.`BulkResultEntry`.`Error` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`message`)
            return DeconstructedType158(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0L,
                0L,
                0L,
                0L,
                false,
                0L,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
            )
        }
    }
}

@JvmName("liftType158")
fun liftType158(
    v0: Int,
    v1: String?,
    v2: Long,
    v3: Long,
    v4: Long,
    v5: Long,
    v6: Boolean,
    v7: Long,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: String?,
    v14: String?,
): mozilla.appservices.logins.`BulkResultEntry` {
    when (v0) {
        0 -> {
            return mozilla.appservices.logins.`BulkResultEntry`.`Success`(
                liftType154(
                    v1,
                    v2,
                    v3,
                    v4,
                    v5,
                    v6,
                    v7,
                    v14,
                    v8,
                    v9,
                    v10,
                    v11,
                    v12,
                    v13,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.logins.`BulkResultEntry`.`Error`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType158: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType158(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`BulkResultEntry`) {
    when (value) {
        is mozilla.appservices.logins.`BulkResultEntry`.`Success` -> {
            writeInt(buf, offset, 0);
            writeType154(buf, offset + 8, value.`login`)
        }
        is mozilla.appservices.logins.`BulkResultEntry`.`Error` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`message`)
        }
    }
}

fun readType158(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`BulkResultEntry` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.logins.`BulkResultEntry`.`Success`(
                readType154(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.logins.`BulkResultEntry`.`Error`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType158: Invalid enum discriminant: ${discriminant}")
        }
    }
}

@JvmName("lowerType3347")
fun lowerType3347(value: mozilla.appservices.logins.`LoginOrErrorMessage`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType3347")
fun liftType3347(value: kotlin.Int): mozilla.appservices.logins.`LoginOrErrorMessage` {
    return mozilla.appservices.logins.`LoginOrErrorMessage`.values()[value]
}

fun writeType3347(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginOrErrorMessage`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType3347(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginOrErrorMessage` {
    return liftType3347(readInt(buf, offset))
}

// Deconstructed version of LoginsApiError
class DeconstructedType155(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType155")
fun lowerType155(value: mozilla.appservices.logins.`LoginsApiException`): DeconstructedType155 {
    when (value) {
        is mozilla.appservices.logins.`LoginsApiException`.`NssUninitialized` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType155(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`NssAuthenticationException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`AuthenticationException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`AuthenticationCanceled` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType155(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`InvalidRecord` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`NoSuchRecord` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`MissingKey` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 6
            return DeconstructedType155(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`InvalidKey` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 7
            return DeconstructedType155(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`EncryptionFailed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 8
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`DecryptionFailed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 9
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`Interrupted` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 10
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.logins.`LoginsApiException`.`UnexpectedLoginsApiException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 11
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType155(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType155")
fun liftType155(
    v0: Int,
    v1: String?,
): mozilla.appservices.logins.`LoginsApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`NssUninitialized`(
            )
        }
        1 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`NssAuthenticationException`(
                liftString(
                    v1,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`AuthenticationException`(
                liftString(
                    v1,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`AuthenticationCanceled`(
            )
        }
        4 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`InvalidRecord`(
                liftString(
                    v1,
                ),
            )
        }
        5 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`NoSuchRecord`(
                liftString(
                    v1,
                ),
            )
        }
        6 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`MissingKey`(
            )
        }
        7 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`InvalidKey`(
            )
        }
        8 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`EncryptionFailed`(
                liftString(
                    v1,
                ),
            )
        }
        9 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`DecryptionFailed`(
                liftString(
                    v1,
                ),
            )
        }
        10 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`Interrupted`(
                liftString(
                    v1,
                ),
            )
        }
        11 -> {
            return mozilla.appservices.logins.`LoginsApiException`.`UnexpectedLoginsApiException`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType155: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType155(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginsApiException`) {
    when (value) {
        is mozilla.appservices.logins.`LoginsApiException`.`NssUninitialized` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.logins.`LoginsApiException`.`NssAuthenticationException` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`AuthenticationException` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`AuthenticationCanceled` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.logins.`LoginsApiException`.`InvalidRecord` -> {
            writeInt(buf, offset, 4);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`NoSuchRecord` -> {
            writeInt(buf, offset, 5);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`MissingKey` -> {
            writeInt(buf, offset, 6);
        }
        is mozilla.appservices.logins.`LoginsApiException`.`InvalidKey` -> {
            writeInt(buf, offset, 7);
        }
        is mozilla.appservices.logins.`LoginsApiException`.`EncryptionFailed` -> {
            writeInt(buf, offset, 8);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`DecryptionFailed` -> {
            writeInt(buf, offset, 9);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`Interrupted` -> {
            writeInt(buf, offset, 10);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.logins.`LoginsApiException`.`UnexpectedLoginsApiException` -> {
            writeInt(buf, offset, 11);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType155(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginsApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.logins.`LoginsApiException`.`NssUninitialized`(
            )
        }
        1 -> {
            mozilla.appservices.logins.`LoginsApiException`.`NssAuthenticationException`(
                readString(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.logins.`LoginsApiException`.`AuthenticationException`(
                readString(buf, offset + 8),
            )
        }
        3 -> {
            mozilla.appservices.logins.`LoginsApiException`.`AuthenticationCanceled`(
            )
        }
        4 -> {
            mozilla.appservices.logins.`LoginsApiException`.`InvalidRecord`(
                readString(buf, offset + 8),
            )
        }
        5 -> {
            mozilla.appservices.logins.`LoginsApiException`.`NoSuchRecord`(
                readString(buf, offset + 8),
            )
        }
        6 -> {
            mozilla.appservices.logins.`LoginsApiException`.`MissingKey`(
            )
        }
        7 -> {
            mozilla.appservices.logins.`LoginsApiException`.`InvalidKey`(
            )
        }
        8 -> {
            mozilla.appservices.logins.`LoginsApiException`.`EncryptionFailed`(
                readString(buf, offset + 8),
            )
        }
        9 -> {
            mozilla.appservices.logins.`LoginsApiException`.`DecryptionFailed`(
                readString(buf, offset + 8),
            )
        }
        10 -> {
            mozilla.appservices.logins.`LoginsApiException`.`Interrupted`(
                readString(buf, offset + 8),
            )
        }
        11 -> {
            mozilla.appservices.logins.`LoginsApiException`.`UnexpectedLoginsApiException`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType155: Invalid enum discriminant: ${discriminant}")
        }
    }
}


fun lowerToBuffer156(value: kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 184).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType152(buf, offset, it)
        offset += 184
    }
    return buf
}

fun liftFromBuffer156(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 184
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType152(buf, offset))
                offset += 184
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType156")
fun lowerType156(value: kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer156(value)
}

@JvmName("liftType156")
fun liftType156(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`> {
    return liftFromBuffer156(buf)
}

fun writeType156(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`>) {
    val childBuf = lowerToBuffer156(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType156(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer156(childBuf)
}


fun lowerToBuffer157(value: kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 264).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType158(buf, offset, it)
        offset += 264
    }
    return buf
}

fun liftFromBuffer157(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 264
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType158(buf, offset))
                offset += 264
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType157")
fun lowerType157(value: kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer157(value)
}

@JvmName("liftType157")
fun liftType157(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`> {
    return liftFromBuffer157(buf)
}

fun writeType157(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`>) {
    val childBuf = lowerToBuffer157(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType157(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer157(childBuf)
}


fun lowerToBuffer159(value: kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 256).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType160(buf, offset, it)
        offset += 256
    }
    return buf
}

fun liftFromBuffer159(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 256
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType160(buf, offset))
                offset += 256
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType159")
fun lowerType159(value: kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`>): java.nio.ByteBuffer {
    return lowerToBuffer159(value)
}

@JvmName("liftType159")
fun liftType159(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`> {
    return liftFromBuffer159(buf)
}

fun writeType159(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`>) {
    val childBuf = lowerToBuffer159(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType159(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer159(childBuf)
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



fun objectToHandle161(obj: mozilla.appservices.logins.`LoginsBridgedEngine`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject161(handle: kotlin.Long): mozilla.appservices.logins.`LoginsBridgedEngine` {
    return mozilla.appservices.logins.`LoginsBridgedEngine`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef161")
fun lowerObjectRef161(value: mozilla.appservices.logins.`LoginsBridgedEngine`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType161")
fun lowerType161(value: mozilla.appservices.logins.`LoginsBridgedEngine`): kotlin.Long {
    return objectToHandle161(value)
}

@JvmName("liftType161")
fun liftType161(handle: kotlin.Long): mozilla.appservices.logins.`LoginsBridgedEngine` {
    return handleToObject161(handle)
}

fun writeType161(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginsBridgedEngine`) {
    writeLong(buf, offset, objectToHandle161(value))
}

fun readType161(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginsBridgedEngine` {
    return handleToObject161(readLong(buf, offset))
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




// Deconstructed version of mozilla.appservices.logins.`Login`?
class DeconstructedType164(
    val v0: Boolean,
    val v1: String?,
    val v2: Long,
    val v3: Long,
    val v4: Long,
    val v5: Long,
    val v6: Boolean,
    val v7: Long,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: String?,
    val v12: String?,
    val v13: String?,
    val v14: String?,
)

@JvmName("lowerType164")
fun lowerType164(value: mozilla.appservices.logins.`Login`?): DeconstructedType164 {
    if (value == null) {
        return DeconstructedType164(
            false,
            null,
            0L,
            0L,
            0L,
            0L,
            false,
            0L,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType154(value)
        return DeconstructedType164(
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
        )
    }
}

@JvmName("liftType164")
fun liftType164(
    v0: Boolean,
    v1: String?,
    v2: Long,
    v3: Long,
    v4: Long,
    v5: Long,
    v6: Boolean,
    v7: Long,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: String?,
    v12: String?,
    v13: String?,
    v14: String?,
): mozilla.appservices.logins.`Login`? {
    if (v0) {
        return liftType154(
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
        )
    } else {
        return null
    }
}

fun writeType164(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`Login`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType154(buf, offset + 8, value)
    }
}
fun readType164(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`Login`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType154(buf, offset + 8)
    }
}


fun lowerToBuffer165(value: kotlin.collections.List<mozilla.appservices.logins.`Login`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 256).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType154(buf, offset, it)
        offset += 256
    }
    return buf
}

fun liftFromBuffer165(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`Login`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 256
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType154(buf, offset))
                offset += 256
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType165")
fun lowerType165(value: kotlin.collections.List<mozilla.appservices.logins.`Login`>): java.nio.ByteBuffer {
    return lowerToBuffer165(value)
}

@JvmName("liftType165")
fun liftType165(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`Login`> {
    return liftFromBuffer165(buf)
}

fun writeType165(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.logins.`Login`>) {
    val childBuf = lowerToBuffer165(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType165(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.logins.`Login`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer165(childBuf)
}


fun lowerToBuffer166(value: kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 208).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType167(buf, offset, it)
        offset += 208
    }
    return buf
}

fun liftFromBuffer166(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 208
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType167(buf, offset))
                offset += 208
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType166")
fun lowerType166(value: kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`>): java.nio.ByteBuffer {
    return lowerToBuffer166(value)
}

@JvmName("liftType166")
fun liftType166(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`> {
    return liftFromBuffer166(buf)
}

fun writeType166(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`>) {
    val childBuf = lowerToBuffer166(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType166(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer166(childBuf)
}


// Deconstructed version of mozilla.appservices.logins.`RunMaintenanceOptions`?
class DeconstructedType168(
    val v0: Boolean,
    val v1: Boolean,
)

@JvmName("lowerType168")
fun lowerType168(value: mozilla.appservices.logins.`RunMaintenanceOptions`?): DeconstructedType168 {
    if (value == null) {
        return DeconstructedType168(
            false,
            false,
        )
    } else {
        val uniffiFieldLowered = lowerType169(value)
        return DeconstructedType168(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType168")
fun liftType168(
    v0: Boolean,
    v1: Boolean,
): mozilla.appservices.logins.`RunMaintenanceOptions`? {
    if (v0) {
        return liftType169(
            v1,
        )
    } else {
        return null
    }
}

fun writeType168(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`RunMaintenanceOptions`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType169(buf, offset + 1, value)
    }
}
fun readType168(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`RunMaintenanceOptions`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType169(buf, offset + 1)
    }
}

fun objectToHandle151(obj: mozilla.appservices.logins.`LoginStore`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject151(handle: kotlin.Long): mozilla.appservices.logins.`LoginStore` {
    return mozilla.appservices.logins.`LoginStore`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef151")
fun lowerObjectRef151(value: mozilla.appservices.logins.`LoginStore`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType151")
fun lowerType151(value: mozilla.appservices.logins.`LoginStore`): kotlin.Long {
    return objectToHandle151(value)
}

@JvmName("liftType151")
fun liftType151(handle: kotlin.Long): mozilla.appservices.logins.`LoginStore` {
    return handleToObject151(handle)
}

fun writeType151(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.logins.`LoginStore`) {
    writeLong(buf, offset, objectToHandle151(value))
}

fun readType151(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.logins.`LoginStore` {
    return handleToObject151(readLong(buf, offset))
}



@JvmName("lowerType63")
inline fun lowerType63(value: mozilla.appservices.db_crypto.`EncryptorDecryptor`): Long {
    return mozilla.appservices.db_crypto.uniffi.lowerType63(value)
}

@JvmName("liftType63")
inline fun liftType63(
    v1: Long
): mozilla.appservices.db_crypto.`EncryptorDecryptor` {
    return mozilla.appservices.db_crypto.uniffi.liftType63(
        v1
    )
}

inline fun writeType63(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.db_crypto.`EncryptorDecryptor`) {
    mozilla.appservices.db_crypto.uniffi.writeType63(buf, offset, value)
}

inline fun readType63(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.db_crypto.`EncryptorDecryptor` {
    return mozilla.appservices.db_crypto.uniffi.readType63(buf, offset)
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
    @JvmName("functionLoginsCreateLoginStoreWithStaticKeyManager")
    @JvmStatic external fun functionLoginsCreateLoginStoreWithStaticKeyManager(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodLoginsLoginsBridgedEngineApply")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineApply(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginsBridgedEngineEnsureCurrentSyncId")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineEnsureCurrentSyncId(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodLoginsLoginsBridgedEngineLastSync")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineLastSync(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodLoginsLoginsBridgedEngineReset")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineReset(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginsBridgedEngineResetLastSync")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineResetLastSync(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginsBridgedEngineResetSyncId")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineResetSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodLoginsLoginsBridgedEngineSetUploaded")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineSetUploaded(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: java.nio.ByteBuffer?,
    )
    @JvmName("methodLoginsLoginsBridgedEngineStoreIncoming")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineStoreIncoming(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodLoginsLoginsBridgedEngineSyncFinished")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineSyncFinished(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginsBridgedEngineSyncId")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodLoginsLoginsBridgedEngineSyncStarted")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineSyncStarted(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginsBridgedEngineWipe")
    @JvmStatic external fun methodLoginsLoginsBridgedEngineWipe(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginStoreAdd")
    @JvmStatic external fun methodLoginsLoginStoreAdd(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
    ) : mozilla.appservices.logins.`Login`
    @JvmName("methodLoginsLoginStoreAddMany")
    @JvmStatic external fun methodLoginsLoginStoreAddMany(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreAddManyWithMeta")
    @JvmStatic external fun methodLoginsLoginStoreAddManyWithMeta(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreAddOrUpdate")
    @JvmStatic external fun methodLoginsLoginStoreAddOrUpdate(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
    ) : mozilla.appservices.logins.`Login`
    @JvmName("methodLoginsLoginStoreAddWithMeta")
    @JvmStatic external fun methodLoginsLoginStoreAddWithMeta(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
        `uniffiArg9`: Long,
        `uniffiArg10`: Long,
        `uniffiArg11`: Long,
        `uniffiArg12`: Long,
        `uniffiArg13`: Boolean,
        `uniffiArg14`: Long,
    ) : mozilla.appservices.logins.`Login`
    @JvmName("methodLoginsLoginStoreArePotentiallyVulnerablePasswords")
    @JvmStatic external fun methodLoginsLoginStoreArePotentiallyVulnerablePasswords(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreBridgedEngine")
    @JvmStatic external fun methodLoginsLoginStoreBridgedEngine(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodLoginsLoginStoreCount")
    @JvmStatic external fun methodLoginsLoginStoreCount(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodLoginsLoginStoreCountByFormActionOrigin")
    @JvmStatic external fun methodLoginsLoginStoreCountByFormActionOrigin(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodLoginsLoginStoreCountByOrigin")
    @JvmStatic external fun methodLoginsLoginStoreCountByOrigin(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodLoginsLoginStoreDelete")
    @JvmStatic external fun methodLoginsLoginStoreDelete(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodLoginsLoginStoreDeleteAll")
    @JvmStatic external fun methodLoginsLoginStoreDeleteAll(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreDeleteAllExceptFxa")
    @JvmStatic external fun methodLoginsLoginStoreDeleteAllExceptFxa(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreDeleteMany")
    @JvmStatic external fun methodLoginsLoginStoreDeleteMany(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreDeleteUndecryptableRecordsForRemoteReplacement")
    @JvmStatic external fun methodLoginsLoginStoreDeleteUndecryptableRecordsForRemoteReplacement(
        `uniffiArg0`: Long,
    ) : mozilla.appservices.logins.`LoginsDeletionMetrics`
    @JvmName("methodLoginsLoginStoreFindLoginToUpdate")
    @JvmStatic external fun methodLoginsLoginStoreFindLoginToUpdate(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
    ) : mozilla.appservices.logins.`Login`?
    @JvmName("methodLoginsLoginStoreGet")
    @JvmStatic external fun methodLoginsLoginStoreGet(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.logins.`Login`?
    @JvmName("methodLoginsLoginStoreGetByBaseDomain")
    @JvmStatic external fun methodLoginsLoginStoreGetByBaseDomain(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreGetMany")
    @JvmStatic external fun methodLoginsLoginStoreGetMany(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreHasLoginsByBaseDomain")
    @JvmStatic external fun methodLoginsLoginStoreHasLoginsByBaseDomain(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodLoginsLoginStoreIsEmpty")
    @JvmStatic external fun methodLoginsLoginStoreIsEmpty(
        `uniffiArg0`: Long,
    ) : Boolean
    @JvmName("methodLoginsLoginStoreIsPotentiallyVulnerablePassword")
    @JvmStatic external fun methodLoginsLoginStoreIsPotentiallyVulnerablePassword(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodLoginsLoginStoreList")
    @JvmStatic external fun methodLoginsLoginStoreList(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreListCandidates")
    @JvmStatic external fun methodLoginsLoginStoreListCandidates(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreListCandidatesByOrigin")
    @JvmStatic external fun methodLoginsLoginStoreListCandidatesByOrigin(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
        `uniffiArg2`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodLoginsLoginStoreRecordBreachAlertDismissal")
    @JvmStatic external fun methodLoginsLoginStoreRecordBreachAlertDismissal(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodLoginsLoginStoreRecordBreachAlertDismissalTime")
    @JvmStatic external fun methodLoginsLoginStoreRecordBreachAlertDismissalTime(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Long,
    )
    @JvmName("methodLoginsLoginStoreRecordPotentiallyVulnerablePasswords")
    @JvmStatic external fun methodLoginsLoginStoreRecordPotentiallyVulnerablePasswords(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodLoginsLoginStoreRegisterWithSyncManager")
    @JvmStatic external fun methodLoginsLoginStoreRegisterWithSyncManager(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginStoreReset")
    @JvmStatic external fun methodLoginsLoginStoreReset(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginStoreResetAllBreaches")
    @JvmStatic external fun methodLoginsLoginStoreResetAllBreaches(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginStoreRunMaintenance")
    @JvmStatic external fun methodLoginsLoginStoreRunMaintenance(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
        `uniffiArg2`: Boolean,
    )
    @JvmName("methodLoginsLoginStoreShutdown")
    @JvmStatic external fun methodLoginsLoginStoreShutdown(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginStoreTouch")
    @JvmStatic external fun methodLoginsLoginStoreTouch(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodLoginsLoginStoreUpdate")
    @JvmStatic external fun methodLoginsLoginStoreUpdate(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
    ) : mozilla.appservices.logins.`Login`
    @JvmName("methodLoginsLoginStoreWipeLocal")
    @JvmStatic external fun methodLoginsLoginStoreWipeLocal(
        `uniffiArg0`: Long,
    )
    @JvmName("methodLoginsLoginStoreWipeLocalExceptFxa")
    @JvmStatic external fun methodLoginsLoginStoreWipeLocalExceptFxa(
        `uniffiArg0`: Long,
    )
    @JvmName("constructorLoginsLoginStoreNew")
    @JvmStatic external fun constructorLoginsLoginStoreNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: Long,
    ) : Long
    @JvmStatic external fun objectCloneHandle161(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree161(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle151(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree151(handle: kotlin.Long)
}