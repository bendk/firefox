@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.autofill.uniffi
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



// Deconstructed version of Address
class DeconstructedType61(
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
    val v11: Long,
    val v12: Boolean,
    val v13: Long,
    val v14: Long,
    val v15: Long,
)

@JvmName("lowerType61")
fun lowerType61(rec: mozilla.appservices.autofill.`Address`): DeconstructedType61 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerString(rec.`name`)
    val uniffiFieldLowered2 = lowerString(rec.`organization`)
    val uniffiFieldLowered3 = lowerString(rec.`streetAddress`)
    val uniffiFieldLowered4 = lowerString(rec.`addressLevel3`)
    val uniffiFieldLowered5 = lowerString(rec.`addressLevel2`)
    val uniffiFieldLowered6 = lowerString(rec.`addressLevel1`)
    val uniffiFieldLowered7 = lowerString(rec.`postalCode`)
    val uniffiFieldLowered8 = lowerString(rec.`country`)
    val uniffiFieldLowered9 = lowerString(rec.`tel`)
    val uniffiFieldLowered10 = lowerString(rec.`email`)
    val uniffiFieldLowered11 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered12 = lowerType56(rec.`timeLastUsed`)
    val uniffiFieldLowered13 = lowerLong(rec.`timeLastModified`)
    val uniffiFieldLowered14 = lowerLong(rec.`timesUsed`)
    return DeconstructedType61(
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
        uniffiFieldLowered12.v0,
        uniffiFieldLowered12.v1,
        uniffiFieldLowered13,
        uniffiFieldLowered14,
    )
}

@JvmName("liftType61")
fun liftType61(
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
    v11: Long,
    v12: Boolean,
    v13: Long,
    v14: Long,
    v15: Long,
): mozilla.appservices.autofill.`Address` {
    return mozilla.appservices.autofill.`Address`(
        liftString(
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
        liftString(
            v5,
        ),
        liftString(
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
        liftString(
            v10,
        ),
        liftLong(
            v11,
        ),
        liftType56(
            v12,
            v13,
        ),
        liftLong(
            v14,
        ),
        liftLong(
            v15,
        ),
    )
}

fun writeType61(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`Address`) {
    writeString(buf, offset + 0, value.`guid`)
    writeString(buf, offset + 24, value.`name`)
    writeString(buf, offset + 48, value.`organization`)
    writeString(buf, offset + 72, value.`streetAddress`)
    writeString(buf, offset + 96, value.`addressLevel3`)
    writeString(buf, offset + 120, value.`addressLevel2`)
    writeString(buf, offset + 144, value.`addressLevel1`)
    writeString(buf, offset + 168, value.`postalCode`)
    writeString(buf, offset + 192, value.`country`)
    writeString(buf, offset + 216, value.`tel`)
    writeString(buf, offset + 240, value.`email`)
    writeLong(buf, offset + 264, value.`timeCreated`)
    writeType56(buf, offset + 272, value.`timeLastUsed`)
    writeLong(buf, offset + 288, value.`timeLastModified`)
    writeLong(buf, offset + 296, value.`timesUsed`)
}

fun readType61(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`Address` {
    return mozilla.appservices.autofill.`Address`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
        readString(buf, offset + 96),
        readString(buf, offset + 120),
        readString(buf, offset + 144),
        readString(buf, offset + 168),
        readString(buf, offset + 192),
        readString(buf, offset + 216),
        readString(buf, offset + 240),
        readLong(buf, offset + 264),
        readType56(buf, offset + 272),
        readLong(buf, offset + 288),
        readLong(buf, offset + 296),
    )
}

// Deconstructed version of AddressMeta
class DeconstructedType58(
    val v0: String?,
    val v1: Long,
    val v2: Boolean,
    val v3: Long,
    val v4: Long,
    val v5: Long,
    val v6: Long,
)

@JvmName("lowerType58")
fun lowerType58(rec: mozilla.appservices.autofill.`AddressMeta`): DeconstructedType58 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered2 = lowerType56(rec.`timeLastUsed`)
    val uniffiFieldLowered3 = lowerLong(rec.`timeLastModified`)
    val uniffiFieldLowered4 = lowerLong(rec.`timesUsed`)
    val uniffiFieldLowered5 = lowerLong(rec.`syncChangeCounter`)
    return DeconstructedType58(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType58")
fun liftType58(
    v0: String?,
    v1: Long,
    v2: Boolean,
    v3: Long,
    v4: Long,
    v5: Long,
    v6: Long,
): mozilla.appservices.autofill.`AddressMeta` {
    return mozilla.appservices.autofill.`AddressMeta`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
        liftType56(
            v2,
            v3,
        ),
        liftLong(
            v4,
        ),
        liftLong(
            v5,
        ),
        liftLong(
            v6,
        ),
    )
}

fun writeType58(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`AddressMeta`) {
    writeString(buf, offset + 0, value.`guid`)
    writeLong(buf, offset + 24, value.`timeCreated`)
    writeType56(buf, offset + 32, value.`timeLastUsed`)
    writeLong(buf, offset + 48, value.`timeLastModified`)
    writeLong(buf, offset + 56, value.`timesUsed`)
    writeLong(buf, offset + 64, value.`syncChangeCounter`)
}

fun readType58(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`AddressMeta` {
    return mozilla.appservices.autofill.`AddressMeta`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
        readType56(buf, offset + 32),
        readLong(buf, offset + 48),
        readLong(buf, offset + 56),
        readLong(buf, offset + 64),
    )
}

// Deconstructed version of AddressTombstone
class DeconstructedType67(
    val v0: String?,
    val v1: Long,
)

@JvmName("lowerType67")
fun lowerType67(rec: mozilla.appservices.autofill.`AddressTombstone`): DeconstructedType67 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerLong(rec.`timeDeleted`)
    return DeconstructedType67(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType67")
fun liftType67(
    v0: String?,
    v1: Long,
): mozilla.appservices.autofill.`AddressTombstone` {
    return mozilla.appservices.autofill.`AddressTombstone`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
    )
}

fun writeType67(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`AddressTombstone`) {
    writeString(buf, offset + 0, value.`guid`)
    writeLong(buf, offset + 24, value.`timeDeleted`)
}

fun readType67(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`AddressTombstone` {
    return mozilla.appservices.autofill.`AddressTombstone`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
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



// Deconstructed version of CreditCard
class DeconstructedType62(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: Long,
    val v6: Long,
    val v7: String?,
    val v8: Long,
    val v9: Boolean,
    val v10: Long,
    val v11: Long,
    val v12: Long,
)

@JvmName("lowerType62")
fun lowerType62(rec: mozilla.appservices.autofill.`CreditCard`): DeconstructedType62 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerString(rec.`ccName`)
    val uniffiFieldLowered2 = lowerString(rec.`ccNumber`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`ccCvv`)
    val uniffiFieldLowered4 = lowerString(rec.`ccNumberLast4`)
    val uniffiFieldLowered5 = lowerLong(rec.`ccExpMonth`)
    val uniffiFieldLowered6 = lowerLong(rec.`ccExpYear`)
    val uniffiFieldLowered7 = lowerString(rec.`ccType`)
    val uniffiFieldLowered8 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered9 = lowerType56(rec.`timeLastUsed`)
    val uniffiFieldLowered10 = lowerLong(rec.`timeLastModified`)
    val uniffiFieldLowered11 = lowerLong(rec.`timesUsed`)
    return DeconstructedType62(
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
        uniffiFieldLowered10,
        uniffiFieldLowered11,
    )
}

@JvmName("liftType62")
fun liftType62(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: Long,
    v6: Long,
    v7: String?,
    v8: Long,
    v9: Boolean,
    v10: Long,
    v11: Long,
    v12: Long,
): mozilla.appservices.autofill.`CreditCard` {
    return mozilla.appservices.autofill.`CreditCard`(
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
        liftString(
            v4,
        ),
        liftLong(
            v5,
        ),
        liftLong(
            v6,
        ),
        liftString(
            v7,
        ),
        liftLong(
            v8,
        ),
        liftType56(
            v9,
            v10,
        ),
        liftLong(
            v11,
        ),
        liftLong(
            v12,
        ),
    )
}

fun writeType62(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCard`) {
    writeString(buf, offset + 0, value.`guid`)
    writeString(buf, offset + 24, value.`ccName`)
    writeString(buf, offset + 48, value.`ccNumber`)
    writeType18(buf, offset + 72, value.`ccCvv`)
    writeString(buf, offset + 104, value.`ccNumberLast4`)
    writeLong(buf, offset + 128, value.`ccExpMonth`)
    writeLong(buf, offset + 136, value.`ccExpYear`)
    writeString(buf, offset + 144, value.`ccType`)
    writeLong(buf, offset + 168, value.`timeCreated`)
    writeType56(buf, offset + 176, value.`timeLastUsed`)
    writeLong(buf, offset + 192, value.`timeLastModified`)
    writeLong(buf, offset + 200, value.`timesUsed`)
}

fun readType62(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCard` {
    return mozilla.appservices.autofill.`CreditCard`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readType18(buf, offset + 72),
        readString(buf, offset + 104),
        readLong(buf, offset + 128),
        readLong(buf, offset + 136),
        readString(buf, offset + 144),
        readLong(buf, offset + 168),
        readType56(buf, offset + 176),
        readLong(buf, offset + 192),
        readLong(buf, offset + 200),
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



// Deconstructed version of CreditCardCandidate
class DeconstructedType88(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Boolean,
    val v4: Long,
    val v5: Long,
    val v6: String?,
    val v7: Long,
    val v8: Boolean,
    val v9: Long,
    val v10: Long,
    val v11: Long,
)

@JvmName("lowerType88")
fun lowerType88(rec: mozilla.appservices.autofill.`CreditCardCandidate`): DeconstructedType88 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerString(rec.`ccName`)
    val uniffiFieldLowered2 = lowerString(rec.`ccNumberLast4`)
    val uniffiFieldLowered3 = lowerBoolean(rec.`hasCvv`)
    val uniffiFieldLowered4 = lowerLong(rec.`ccExpMonth`)
    val uniffiFieldLowered5 = lowerLong(rec.`ccExpYear`)
    val uniffiFieldLowered6 = lowerString(rec.`ccType`)
    val uniffiFieldLowered7 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered8 = lowerType56(rec.`timeLastUsed`)
    val uniffiFieldLowered9 = lowerLong(rec.`timeLastModified`)
    val uniffiFieldLowered10 = lowerLong(rec.`timesUsed`)
    return DeconstructedType88(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7,
        uniffiFieldLowered8.v0,
        uniffiFieldLowered8.v1,
        uniffiFieldLowered9,
        uniffiFieldLowered10,
    )
}

@JvmName("liftType88")
fun liftType88(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Boolean,
    v4: Long,
    v5: Long,
    v6: String?,
    v7: Long,
    v8: Boolean,
    v9: Long,
    v10: Long,
    v11: Long,
): mozilla.appservices.autofill.`CreditCardCandidate` {
    return mozilla.appservices.autofill.`CreditCardCandidate`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftString(
            v2,
        ),
        liftBoolean(
            v3,
        ),
        liftLong(
            v4,
        ),
        liftLong(
            v5,
        ),
        liftString(
            v6,
        ),
        liftLong(
            v7,
        ),
        liftType56(
            v8,
            v9,
        ),
        liftLong(
            v10,
        ),
        liftLong(
            v11,
        ),
    )
}

fun writeType88(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardCandidate`) {
    writeString(buf, offset + 0, value.`guid`)
    writeString(buf, offset + 24, value.`ccName`)
    writeString(buf, offset + 48, value.`ccNumberLast4`)
    writeBoolean(buf, offset + 72, value.`hasCvv`)
    writeLong(buf, offset + 80, value.`ccExpMonth`)
    writeLong(buf, offset + 88, value.`ccExpYear`)
    writeString(buf, offset + 96, value.`ccType`)
    writeLong(buf, offset + 120, value.`timeCreated`)
    writeType56(buf, offset + 128, value.`timeLastUsed`)
    writeLong(buf, offset + 144, value.`timeLastModified`)
    writeLong(buf, offset + 152, value.`timesUsed`)
}

fun readType88(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardCandidate` {
    return mozilla.appservices.autofill.`CreditCardCandidate`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readBoolean(buf, offset + 72),
        readLong(buf, offset + 80),
        readLong(buf, offset + 88),
        readString(buf, offset + 96),
        readLong(buf, offset + 120),
        readType56(buf, offset + 128),
        readLong(buf, offset + 144),
        readLong(buf, offset + 152),
    )
}

// Deconstructed version of CreditCardMeta
class DeconstructedType60(
    val v0: String?,
    val v1: Long,
    val v2: Boolean,
    val v3: Long,
    val v4: Long,
    val v5: Long,
    val v6: Long,
)

@JvmName("lowerType60")
fun lowerType60(rec: mozilla.appservices.autofill.`CreditCardMeta`): DeconstructedType60 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered2 = lowerType56(rec.`timeLastUsed`)
    val uniffiFieldLowered3 = lowerLong(rec.`timeLastModified`)
    val uniffiFieldLowered4 = lowerLong(rec.`timesUsed`)
    val uniffiFieldLowered5 = lowerLong(rec.`syncChangeCounter`)
    return DeconstructedType60(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2.v0,
        uniffiFieldLowered2.v1,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType60")
fun liftType60(
    v0: String?,
    v1: Long,
    v2: Boolean,
    v3: Long,
    v4: Long,
    v5: Long,
    v6: Long,
): mozilla.appservices.autofill.`CreditCardMeta` {
    return mozilla.appservices.autofill.`CreditCardMeta`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
        liftType56(
            v2,
            v3,
        ),
        liftLong(
            v4,
        ),
        liftLong(
            v5,
        ),
        liftLong(
            v6,
        ),
    )
}

fun writeType60(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardMeta`) {
    writeString(buf, offset + 0, value.`guid`)
    writeLong(buf, offset + 24, value.`timeCreated`)
    writeType56(buf, offset + 32, value.`timeLastUsed`)
    writeLong(buf, offset + 48, value.`timeLastModified`)
    writeLong(buf, offset + 56, value.`timesUsed`)
    writeLong(buf, offset + 64, value.`syncChangeCounter`)
}

fun readType60(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardMeta` {
    return mozilla.appservices.autofill.`CreditCardMeta`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
        readType56(buf, offset + 32),
        readLong(buf, offset + 48),
        readLong(buf, offset + 56),
        readLong(buf, offset + 64),
    )
}

// Deconstructed version of CreditCardTombstone
class DeconstructedType74(
    val v0: String?,
    val v1: Long,
)

@JvmName("lowerType74")
fun lowerType74(rec: mozilla.appservices.autofill.`CreditCardTombstone`): DeconstructedType74 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerLong(rec.`timeDeleted`)
    return DeconstructedType74(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
    )
}

@JvmName("liftType74")
fun liftType74(
    v0: String?,
    v1: Long,
): mozilla.appservices.autofill.`CreditCardTombstone` {
    return mozilla.appservices.autofill.`CreditCardTombstone`(
        liftString(
            v0,
        ),
        liftLong(
            v1,
        ),
    )
}

fun writeType74(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardTombstone`) {
    writeString(buf, offset + 0, value.`guid`)
    writeLong(buf, offset + 24, value.`timeDeleted`)
}

fun readType74(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardTombstone` {
    return mozilla.appservices.autofill.`CreditCardTombstone`(
        readString(buf, offset + 0),
        readLong(buf, offset + 24),
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




@JvmName("lowerType89")
fun lowerType89(rec: mozilla.appservices.autofill.`CreditCardsDeletionMetrics`): Long {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerULong(rec.`totalScrubbedRecords`)
    return uniffiFieldLowered0
}

@JvmName("liftType89")
fun liftType89(
    v0: Long,
): mozilla.appservices.autofill.`CreditCardsDeletionMetrics` {
    return mozilla.appservices.autofill.`CreditCardsDeletionMetrics`(
        liftULong(
            v0,
        ),
    )
}

fun writeType89(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardsDeletionMetrics`) {
    writeULong(buf, offset + 0, value.`totalScrubbedRecords`)
}

fun readType89(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardsDeletionMetrics` {
    return mozilla.appservices.autofill.`CreditCardsDeletionMetrics`(
        readULong(buf, offset + 0),
    )
}

// Deconstructed version of Passport
class DeconstructedType81(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: Long,
    val v5: Long,
    val v6: Long,
    val v7: Long,
    val v8: Long,
    val v9: Long,
    val v10: Long,
    val v11: Boolean,
    val v12: Long,
    val v13: Long,
    val v14: Long,
)

@JvmName("lowerType81")
fun lowerType81(rec: mozilla.appservices.autofill.`Passport`): DeconstructedType81 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`guid`)
    val uniffiFieldLowered1 = lowerString(rec.`name`)
    val uniffiFieldLowered2 = lowerString(rec.`country`)
    val uniffiFieldLowered3 = lowerString(rec.`passportNumber`)
    val uniffiFieldLowered4 = lowerLong(rec.`issueDateMonth`)
    val uniffiFieldLowered5 = lowerLong(rec.`issueDateDay`)
    val uniffiFieldLowered6 = lowerLong(rec.`issueDateYear`)
    val uniffiFieldLowered7 = lowerLong(rec.`expiryDateMonth`)
    val uniffiFieldLowered8 = lowerLong(rec.`expiryDateDay`)
    val uniffiFieldLowered9 = lowerLong(rec.`expiryDateYear`)
    val uniffiFieldLowered10 = lowerLong(rec.`timeCreated`)
    val uniffiFieldLowered11 = lowerType56(rec.`timeLastUsed`)
    val uniffiFieldLowered12 = lowerLong(rec.`timeLastModified`)
    val uniffiFieldLowered13 = lowerLong(rec.`timesUsed`)
    return DeconstructedType81(
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
        uniffiFieldLowered11.v0,
        uniffiFieldLowered11.v1,
        uniffiFieldLowered12,
        uniffiFieldLowered13,
    )
}

@JvmName("liftType81")
fun liftType81(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: Long,
    v5: Long,
    v6: Long,
    v7: Long,
    v8: Long,
    v9: Long,
    v10: Long,
    v11: Boolean,
    v12: Long,
    v13: Long,
    v14: Long,
): mozilla.appservices.autofill.`Passport` {
    return mozilla.appservices.autofill.`Passport`(
        liftString(
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
        liftLong(
            v4,
        ),
        liftLong(
            v5,
        ),
        liftLong(
            v6,
        ),
        liftLong(
            v7,
        ),
        liftLong(
            v8,
        ),
        liftLong(
            v9,
        ),
        liftLong(
            v10,
        ),
        liftType56(
            v11,
            v12,
        ),
        liftLong(
            v13,
        ),
        liftLong(
            v14,
        ),
    )
}

fun writeType81(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`Passport`) {
    writeString(buf, offset + 0, value.`guid`)
    writeString(buf, offset + 24, value.`name`)
    writeString(buf, offset + 48, value.`country`)
    writeString(buf, offset + 72, value.`passportNumber`)
    writeLong(buf, offset + 96, value.`issueDateMonth`)
    writeLong(buf, offset + 104, value.`issueDateDay`)
    writeLong(buf, offset + 112, value.`issueDateYear`)
    writeLong(buf, offset + 120, value.`expiryDateMonth`)
    writeLong(buf, offset + 128, value.`expiryDateDay`)
    writeLong(buf, offset + 136, value.`expiryDateYear`)
    writeLong(buf, offset + 144, value.`timeCreated`)
    writeType56(buf, offset + 152, value.`timeLastUsed`)
    writeLong(buf, offset + 168, value.`timeLastModified`)
    writeLong(buf, offset + 176, value.`timesUsed`)
}

fun readType81(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`Passport` {
    return mozilla.appservices.autofill.`Passport`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
        readLong(buf, offset + 96),
        readLong(buf, offset + 104),
        readLong(buf, offset + 112),
        readLong(buf, offset + 120),
        readLong(buf, offset + 128),
        readLong(buf, offset + 136),
        readLong(buf, offset + 144),
        readType56(buf, offset + 152),
        readLong(buf, offset + 168),
        readLong(buf, offset + 176),
    )
}

// Deconstructed version of UpdatableAddressFields
class DeconstructedType57(
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
)

@JvmName("lowerType57")
fun lowerType57(rec: mozilla.appservices.autofill.`UpdatableAddressFields`): DeconstructedType57 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`name`)
    val uniffiFieldLowered1 = lowerString(rec.`organization`)
    val uniffiFieldLowered2 = lowerString(rec.`streetAddress`)
    val uniffiFieldLowered3 = lowerString(rec.`addressLevel3`)
    val uniffiFieldLowered4 = lowerString(rec.`addressLevel2`)
    val uniffiFieldLowered5 = lowerString(rec.`addressLevel1`)
    val uniffiFieldLowered6 = lowerString(rec.`postalCode`)
    val uniffiFieldLowered7 = lowerString(rec.`country`)
    val uniffiFieldLowered8 = lowerString(rec.`tel`)
    val uniffiFieldLowered9 = lowerString(rec.`email`)
    return DeconstructedType57(
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
    )
}

@JvmName("liftType57")
fun liftType57(
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
): mozilla.appservices.autofill.`UpdatableAddressFields` {
    return mozilla.appservices.autofill.`UpdatableAddressFields`(
        liftString(
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
        liftString(
            v5,
        ),
        liftString(
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
    )
}

fun writeType57(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`UpdatableAddressFields`) {
    writeString(buf, offset + 0, value.`name`)
    writeString(buf, offset + 24, value.`organization`)
    writeString(buf, offset + 48, value.`streetAddress`)
    writeString(buf, offset + 72, value.`addressLevel3`)
    writeString(buf, offset + 96, value.`addressLevel2`)
    writeString(buf, offset + 120, value.`addressLevel1`)
    writeString(buf, offset + 144, value.`postalCode`)
    writeString(buf, offset + 168, value.`country`)
    writeString(buf, offset + 192, value.`tel`)
    writeString(buf, offset + 216, value.`email`)
}

fun readType57(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`UpdatableAddressFields` {
    return mozilla.appservices.autofill.`UpdatableAddressFields`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
        readString(buf, offset + 96),
        readString(buf, offset + 120),
        readString(buf, offset + 144),
        readString(buf, offset + 168),
        readString(buf, offset + 192),
        readString(buf, offset + 216),
    )
}

// Deconstructed version of UpdatableAddressFieldsWithMeta
class DeconstructedType64(
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
    val v11: Long,
    val v12: Boolean,
    val v13: Long,
    val v14: Long,
    val v15: Long,
    val v16: Long,
)

@JvmName("lowerType64")
fun lowerType64(rec: mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`): DeconstructedType64 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType57(rec.`fields`)
    val uniffiFieldLowered1 = lowerType58(rec.`meta`)
    return DeconstructedType64(
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
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered1.v4,
        uniffiFieldLowered1.v5,
        uniffiFieldLowered1.v6,
    )
}

@JvmName("liftType64")
fun liftType64(
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
    v11: Long,
    v12: Boolean,
    v13: Long,
    v14: Long,
    v15: Long,
    v16: Long,
): mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta` {
    return mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`(
        liftType57(
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
        ),
        liftType58(
            v10,
            v11,
            v12,
            v13,
            v14,
            v15,
            v16,
        ),
    )
}

fun writeType64(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`) {
    writeType57(buf, offset + 0, value.`fields`)
    writeType58(buf, offset + 240, value.`meta`)
}

fun readType64(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta` {
    return mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`(
        readType57(buf, offset + 0),
        readType58(buf, offset + 240),
    )
}

// Deconstructed version of UpdatableCreditCardFields
class DeconstructedType59(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Long,
    val v4: Long,
    val v5: String?,
)

@JvmName("lowerType59")
fun lowerType59(rec: mozilla.appservices.autofill.`UpdatableCreditCardFields`): DeconstructedType59 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`ccName`)
    val uniffiFieldLowered1 = lowerString(rec.`ccNumber`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`ccCvv`)
    val uniffiFieldLowered3 = lowerLong(rec.`ccExpMonth`)
    val uniffiFieldLowered4 = lowerLong(rec.`ccExpYear`)
    val uniffiFieldLowered5 = lowerString(rec.`ccType`)
    return DeconstructedType59(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType59")
fun liftType59(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Long,
    v4: Long,
    v5: String?,
): mozilla.appservices.autofill.`UpdatableCreditCardFields` {
    return mozilla.appservices.autofill.`UpdatableCreditCardFields`(
        liftString(
            v0,
        ),
        liftString(
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
        liftString(
            v5,
        ),
    )
}

fun writeType59(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`UpdatableCreditCardFields`) {
    writeString(buf, offset + 0, value.`ccName`)
    writeString(buf, offset + 24, value.`ccNumber`)
    writeType18(buf, offset + 48, value.`ccCvv`)
    writeLong(buf, offset + 80, value.`ccExpMonth`)
    writeLong(buf, offset + 88, value.`ccExpYear`)
    writeString(buf, offset + 96, value.`ccType`)
}

fun readType59(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`UpdatableCreditCardFields` {
    return mozilla.appservices.autofill.`UpdatableCreditCardFields`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType18(buf, offset + 48),
        readLong(buf, offset + 80),
        readLong(buf, offset + 88),
        readString(buf, offset + 96),
    )
}

// Deconstructed version of UpdatableCreditCardFieldsWithMeta
class DeconstructedType65(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Long,
    val v4: Long,
    val v5: String?,
    val v6: String?,
    val v7: Long,
    val v8: Boolean,
    val v9: Long,
    val v10: Long,
    val v11: Long,
    val v12: Long,
)

@JvmName("lowerType65")
fun lowerType65(rec: mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`): DeconstructedType65 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType59(rec.`fields`)
    val uniffiFieldLowered1 = lowerType60(rec.`meta`)
    return DeconstructedType65(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered0.v2,
        uniffiFieldLowered0.v3,
        uniffiFieldLowered0.v4,
        uniffiFieldLowered0.v5,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered1.v2,
        uniffiFieldLowered1.v3,
        uniffiFieldLowered1.v4,
        uniffiFieldLowered1.v5,
        uniffiFieldLowered1.v6,
    )
}

@JvmName("liftType65")
fun liftType65(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Long,
    v4: Long,
    v5: String?,
    v6: String?,
    v7: Long,
    v8: Boolean,
    v9: Long,
    v10: Long,
    v11: Long,
    v12: Long,
): mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta` {
    return mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`(
        liftType59(
            v0,
            v1,
            v2,
            v3,
            v4,
            v5,
        ),
        liftType60(
            v6,
            v7,
            v8,
            v9,
            v10,
            v11,
            v12,
        ),
    )
}

fun writeType65(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`) {
    writeType59(buf, offset + 0, value.`fields`)
    writeType60(buf, offset + 120, value.`meta`)
}

fun readType65(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta` {
    return mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`(
        readType59(buf, offset + 0),
        readType60(buf, offset + 120),
    )
}

// Deconstructed version of UpdatablePassportFields
class DeconstructedType80(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Long,
    val v4: Long,
    val v5: Long,
    val v6: Long,
    val v7: Long,
    val v8: Long,
)

@JvmName("lowerType80")
fun lowerType80(rec: mozilla.appservices.autofill.`UpdatablePassportFields`): DeconstructedType80 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`name`)
    val uniffiFieldLowered1 = lowerString(rec.`country`)
    val uniffiFieldLowered2 = lowerString(rec.`passportNumber`)
    val uniffiFieldLowered3 = lowerLong(rec.`issueDateMonth`)
    val uniffiFieldLowered4 = lowerLong(rec.`issueDateDay`)
    val uniffiFieldLowered5 = lowerLong(rec.`issueDateYear`)
    val uniffiFieldLowered6 = lowerLong(rec.`expiryDateMonth`)
    val uniffiFieldLowered7 = lowerLong(rec.`expiryDateDay`)
    val uniffiFieldLowered8 = lowerLong(rec.`expiryDateYear`)
    return DeconstructedType80(
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

@JvmName("liftType80")
fun liftType80(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Long,
    v4: Long,
    v5: Long,
    v6: Long,
    v7: Long,
    v8: Long,
): mozilla.appservices.autofill.`UpdatablePassportFields` {
    return mozilla.appservices.autofill.`UpdatablePassportFields`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftString(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftLong(
            v4,
        ),
        liftLong(
            v5,
        ),
        liftLong(
            v6,
        ),
        liftLong(
            v7,
        ),
        liftLong(
            v8,
        ),
    )
}

fun writeType80(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`UpdatablePassportFields`) {
    writeString(buf, offset + 0, value.`name`)
    writeString(buf, offset + 24, value.`country`)
    writeString(buf, offset + 48, value.`passportNumber`)
    writeLong(buf, offset + 72, value.`issueDateMonth`)
    writeLong(buf, offset + 80, value.`issueDateDay`)
    writeLong(buf, offset + 88, value.`issueDateYear`)
    writeLong(buf, offset + 96, value.`expiryDateMonth`)
    writeLong(buf, offset + 104, value.`expiryDateDay`)
    writeLong(buf, offset + 112, value.`expiryDateYear`)
}

fun readType80(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`UpdatablePassportFields` {
    return mozilla.appservices.autofill.`UpdatablePassportFields`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readLong(buf, offset + 72),
        readLong(buf, offset + 80),
        readLong(buf, offset + 88),
        readLong(buf, offset + 96),
        readLong(buf, offset + 104),
        readLong(buf, offset + 112),
    )
}

// Deconstructed version of AddressBulkResultEntry
class DeconstructedType72(
    val v0: Int,
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
    val v12: Long,
    val v13: Boolean,
    val v14: Long,
    val v15: Long,
    val v16: Long,
)

@JvmName("lowerType72")
fun lowerType72(value: mozilla.appservices.autofill.`AddressBulkResultEntry`): DeconstructedType72 {
    when (value) {
        is mozilla.appservices.autofill.`AddressBulkResultEntry`.`Success` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType61(value.`address`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered6 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered11 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered10 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered9 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered8 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered7 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v12
            val uniffiFieldLowered12 = uniffiFieldDeconstructed0.v13
            val uniffiFieldLowered14 = uniffiFieldDeconstructed0.v14
            val uniffiFieldLowered15 = uniffiFieldDeconstructed0.v15
            return DeconstructedType72(
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
                uniffiFieldLowered15,
                uniffiFieldLowered16,
            )
        }
        is mozilla.appservices.autofill.`AddressBulkResultEntry`.`Error` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`message`)
            return DeconstructedType72(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
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
                0L,
                false,
                0L,
                0L,
                0L,
            )
        }
    }
}

@JvmName("liftType72")
fun liftType72(
    v0: Int,
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
    v12: Long,
    v13: Boolean,
    v14: Long,
    v15: Long,
    v16: Long,
): mozilla.appservices.autofill.`AddressBulkResultEntry` {
    when (v0) {
        0 -> {
            return mozilla.appservices.autofill.`AddressBulkResultEntry`.`Success`(
                liftType61(
                    v1,
                    v2,
                    v3,
                    v4,
                    v5,
                    v6,
                    v11,
                    v10,
                    v9,
                    v8,
                    v7,
                    v16,
                    v13,
                    v12,
                    v14,
                    v15,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.autofill.`AddressBulkResultEntry`.`Error`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType72: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType72(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`AddressBulkResultEntry`) {
    when (value) {
        is mozilla.appservices.autofill.`AddressBulkResultEntry`.`Success` -> {
            writeInt(buf, offset, 0);
            writeType61(buf, offset + 8, value.`address`)
        }
        is mozilla.appservices.autofill.`AddressBulkResultEntry`.`Error` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`message`)
        }
    }
}

fun readType72(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`AddressBulkResultEntry` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.autofill.`AddressBulkResultEntry`.`Success`(
                readType61(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.autofill.`AddressBulkResultEntry`.`Error`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType72: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of AddressBulkTombstoneResultEntry
class DeconstructedType69(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType69")
fun lowerType69(value: mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`): DeconstructedType69 {
    when (value) {
        is mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Success` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`guid`)
            return DeconstructedType69(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Error` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`message`)
            return DeconstructedType69(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType69")
fun liftType69(
    v0: Int,
    v1: String?,
): mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry` {
    when (v0) {
        0 -> {
            return mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Success`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Error`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType69: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType69(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`) {
    when (value) {
        is mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Success` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`guid`)
        }
        is mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Error` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`message`)
        }
    }
}

fun readType69(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Success`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`.`Error`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType69: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of AutofillApiError
class DeconstructedType54(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType54")
fun lowerType54(value: mozilla.appservices.autofill.`AutofillApiException`): DeconstructedType54 {
    when (value) {
        is mozilla.appservices.autofill.`AutofillApiException`.`SqlException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType54(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`InterruptedException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType54(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`CryptoException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType54(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`NoSuchRecord` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            val uniffiFieldLowered1 = lowerString(value.`guid`)
            return DeconstructedType54(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`UnexpectedAutofillApiException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType54(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType54")
fun liftType54(
    v0: Int,
    v1: String?,
): mozilla.appservices.autofill.`AutofillApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.autofill.`AutofillApiException`.`SqlException`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.autofill.`AutofillApiException`.`InterruptedException`(
            )
        }
        2 -> {
            return mozilla.appservices.autofill.`AutofillApiException`.`CryptoException`(
                liftString(
                    v1,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.autofill.`AutofillApiException`.`NoSuchRecord`(
                liftString(
                    v1,
                ),
            )
        }
        4 -> {
            return mozilla.appservices.autofill.`AutofillApiException`.`UnexpectedAutofillApiException`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType54: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType54(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`AutofillApiException`) {
    when (value) {
        is mozilla.appservices.autofill.`AutofillApiException`.`SqlException` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`InterruptedException` -> {
            writeInt(buf, offset, 1);
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`CryptoException` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`NoSuchRecord` -> {
            writeInt(buf, offset, 3);
            writeString(buf, offset + 8, value.`guid`)
        }
        is mozilla.appservices.autofill.`AutofillApiException`.`UnexpectedAutofillApiException` -> {
            writeInt(buf, offset, 4);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType54(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`AutofillApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.autofill.`AutofillApiException`.`SqlException`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.autofill.`AutofillApiException`.`InterruptedException`(
            )
        }
        2 -> {
            mozilla.appservices.autofill.`AutofillApiException`.`CryptoException`(
                readString(buf, offset + 8),
            )
        }
        3 -> {
            mozilla.appservices.autofill.`AutofillApiException`.`NoSuchRecord`(
                readString(buf, offset + 8),
            )
        }
        4 -> {
            mozilla.appservices.autofill.`AutofillApiException`.`UnexpectedAutofillApiException`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType54: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of CreditCardBulkResultEntry
class DeconstructedType79(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: Long,
    val v7: Long,
    val v8: String?,
    val v9: Long,
    val v10: Boolean,
    val v11: Long,
    val v12: Long,
    val v13: Long,
)

@JvmName("lowerType79")
fun lowerType79(value: mozilla.appservices.autofill.`CreditCardBulkResultEntry`): DeconstructedType79 {
    when (value) {
        is mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Success` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType62(value.`creditCard`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered12 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered8 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered6 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered10 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered9 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered11 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered7 = uniffiFieldDeconstructed0.v12
            return DeconstructedType79(
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
            )
        }
        is mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Error` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`message`)
            return DeconstructedType79(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                null,
                null,
                null,
                null,
                0L,
                0L,
                null,
                0L,
                false,
                0L,
                0L,
                0L,
            )
        }
    }
}

@JvmName("liftType79")
fun liftType79(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: Long,
    v7: Long,
    v8: String?,
    v9: Long,
    v10: Boolean,
    v11: Long,
    v12: Long,
    v13: Long,
): mozilla.appservices.autofill.`CreditCardBulkResultEntry` {
    when (v0) {
        0 -> {
            return mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Success`(
                liftType62(
                    v1,
                    v2,
                    v3,
                    v4,
                    v5,
                    v13,
                    v12,
                    v8,
                    v6,
                    v10,
                    v9,
                    v11,
                    v7,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Error`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType79: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType79(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardBulkResultEntry`) {
    when (value) {
        is mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Success` -> {
            writeInt(buf, offset, 0);
            writeType62(buf, offset + 8, value.`creditCard`)
        }
        is mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Error` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`message`)
        }
    }
}

fun readType79(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardBulkResultEntry` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Success`(
                readType62(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.autofill.`CreditCardBulkResultEntry`.`Error`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType79: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of CreditCardBulkTombstoneResultEntry
class DeconstructedType76(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType76")
fun lowerType76(value: mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`): DeconstructedType76 {
    when (value) {
        is mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Success` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`guid`)
            return DeconstructedType76(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Error` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`message`)
            return DeconstructedType76(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType76")
fun liftType76(
    v0: Int,
    v1: String?,
): mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry` {
    when (v0) {
        0 -> {
            return mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Success`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Error`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType76: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType76(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`) {
    when (value) {
        is mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Success` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`guid`)
        }
        is mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Error` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`message`)
        }
    }
}

fun readType76(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Success`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`.`Error`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType76: Invalid enum discriminant: ${discriminant}")
        }
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



fun objectToHandle82(obj: mozilla.appservices.autofill.`AddressesBridgedEngine`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject82(handle: kotlin.Long): mozilla.appservices.autofill.`AddressesBridgedEngine` {
    return mozilla.appservices.autofill.`AddressesBridgedEngine`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef82")
fun lowerObjectRef82(value: mozilla.appservices.autofill.`AddressesBridgedEngine`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType82")
fun lowerType82(value: mozilla.appservices.autofill.`AddressesBridgedEngine`): kotlin.Long {
    return objectToHandle82(value)
}

@JvmName("liftType82")
fun liftType82(handle: kotlin.Long): mozilla.appservices.autofill.`AddressesBridgedEngine` {
    return handleToObject82(handle)
}

fun writeType82(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`AddressesBridgedEngine`) {
    writeLong(buf, offset, objectToHandle82(value))
}

fun readType82(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`AddressesBridgedEngine` {
    return handleToObject82(readLong(buf, offset))
}

fun objectToHandle83(obj: mozilla.appservices.autofill.`CreditCardsBridgedEngine`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject83(handle: kotlin.Long): mozilla.appservices.autofill.`CreditCardsBridgedEngine` {
    return mozilla.appservices.autofill.`CreditCardsBridgedEngine`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef83")
fun lowerObjectRef83(value: mozilla.appservices.autofill.`CreditCardsBridgedEngine`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType83")
fun lowerType83(value: mozilla.appservices.autofill.`CreditCardsBridgedEngine`): kotlin.Long {
    return objectToHandle83(value)
}

@JvmName("liftType83")
fun liftType83(handle: kotlin.Long): mozilla.appservices.autofill.`CreditCardsBridgedEngine` {
    return handleToObject83(handle)
}

fun writeType83(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`CreditCardsBridgedEngine`) {
    writeLong(buf, offset, objectToHandle83(value))
}

fun readType83(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`CreditCardsBridgedEngine` {
    return handleToObject83(readLong(buf, offset))
}


fun lowerToBuffer66(value: kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType67(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer66(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType67(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType66")
fun lowerType66(value: kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`>): java.nio.ByteBuffer {
    return lowerToBuffer66(value)
}

@JvmName("liftType66")
fun liftType66(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`> {
    return liftFromBuffer66(buf)
}

fun writeType66(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`>) {
    val childBuf = lowerToBuffer66(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType66(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer66(childBuf)
}


fun lowerToBuffer68(value: kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType69(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer68(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType69(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType68")
fun lowerType68(value: kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer68(value)
}

@JvmName("liftType68")
fun liftType68(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`> {
    return liftFromBuffer68(buf)
}

fun writeType68(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`>) {
    val childBuf = lowerToBuffer68(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType68(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer68(childBuf)
}


fun lowerToBuffer70(value: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 312).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType64(buf, offset, it)
        offset += 312
    }
    return buf
}

fun liftFromBuffer70(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 312
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType64(buf, offset))
                offset += 312
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType70")
fun lowerType70(value: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`>): java.nio.ByteBuffer {
    return lowerToBuffer70(value)
}

@JvmName("liftType70")
fun liftType70(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`> {
    return liftFromBuffer70(buf)
}

fun writeType70(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`>) {
    val childBuf = lowerToBuffer70(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType70(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer70(childBuf)
}


fun lowerToBuffer71(value: kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 312).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType72(buf, offset, it)
        offset += 312
    }
    return buf
}

fun liftFromBuffer71(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 312
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType72(buf, offset))
                offset += 312
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType71")
fun lowerType71(value: kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer71(value)
}

@JvmName("liftType71")
fun liftType71(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`> {
    return liftFromBuffer71(buf)
}

fun writeType71(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`>) {
    val childBuf = lowerToBuffer71(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType71(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer71(childBuf)
}


fun lowerToBuffer73(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType74(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer73(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType74(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType73")
fun lowerType73(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`>): java.nio.ByteBuffer {
    return lowerToBuffer73(value)
}

@JvmName("liftType73")
fun liftType73(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`> {
    return liftFromBuffer73(buf)
}

fun writeType73(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`>) {
    val childBuf = lowerToBuffer73(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType73(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer73(childBuf)
}


fun lowerToBuffer75(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 32).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType76(buf, offset, it)
        offset += 32
    }
    return buf
}

fun liftFromBuffer75(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 32
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType76(buf, offset))
                offset += 32
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType75")
fun lowerType75(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer75(value)
}

@JvmName("liftType75")
fun liftType75(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`> {
    return liftFromBuffer75(buf)
}

fun writeType75(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`>) {
    val childBuf = lowerToBuffer75(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType75(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer75(childBuf)
}


fun lowerToBuffer77(value: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 192).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType65(buf, offset, it)
        offset += 192
    }
    return buf
}

fun liftFromBuffer77(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 192
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType65(buf, offset))
                offset += 192
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType77")
fun lowerType77(value: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`>): java.nio.ByteBuffer {
    return lowerToBuffer77(value)
}

@JvmName("liftType77")
fun liftType77(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`> {
    return liftFromBuffer77(buf)
}

fun writeType77(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`>) {
    val childBuf = lowerToBuffer77(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType77(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer77(childBuf)
}


fun lowerToBuffer78(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 216).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType79(buf, offset, it)
        offset += 216
    }
    return buf
}

fun liftFromBuffer78(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 216
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType79(buf, offset))
                offset += 216
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType78")
fun lowerType78(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer78(value)
}

@JvmName("liftType78")
fun liftType78(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`> {
    return liftFromBuffer78(buf)
}

fun writeType78(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`>) {
    val childBuf = lowerToBuffer78(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType78(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer78(childBuf)
}


fun lowerToBuffer84(value: kotlin.collections.List<mozilla.appservices.autofill.`Address`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 304).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType61(buf, offset, it)
        offset += 304
    }
    return buf
}

fun liftFromBuffer84(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`Address`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 304
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType61(buf, offset))
                offset += 304
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType84")
fun lowerType84(value: kotlin.collections.List<mozilla.appservices.autofill.`Address`>): java.nio.ByteBuffer {
    return lowerToBuffer84(value)
}

@JvmName("liftType84")
fun liftType84(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`Address`> {
    return liftFromBuffer84(buf)
}

fun writeType84(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`Address`>) {
    val childBuf = lowerToBuffer84(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType84(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`Address`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer84(childBuf)
}


fun lowerToBuffer85(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 208).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType62(buf, offset, it)
        offset += 208
    }
    return buf
}

fun liftFromBuffer85(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 208
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType62(buf, offset))
                offset += 208
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType85")
fun lowerType85(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`>): java.nio.ByteBuffer {
    return lowerToBuffer85(value)
}

@JvmName("liftType85")
fun liftType85(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`> {
    return liftFromBuffer85(buf)
}

fun writeType85(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`>) {
    val childBuf = lowerToBuffer85(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType85(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer85(childBuf)
}


fun lowerToBuffer86(value: kotlin.collections.List<mozilla.appservices.autofill.`Passport`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 184).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType81(buf, offset, it)
        offset += 184
    }
    return buf
}

fun liftFromBuffer86(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`Passport`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 184
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType81(buf, offset))
                offset += 184
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType86")
fun lowerType86(value: kotlin.collections.List<mozilla.appservices.autofill.`Passport`>): java.nio.ByteBuffer {
    return lowerToBuffer86(value)
}

@JvmName("liftType86")
fun liftType86(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`Passport`> {
    return liftFromBuffer86(buf)
}

fun writeType86(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`Passport`>) {
    val childBuf = lowerToBuffer86(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType86(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`Passport`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer86(childBuf)
}


fun lowerToBuffer87(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 160).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType88(buf, offset, it)
        offset += 160
    }
    return buf
}

fun liftFromBuffer87(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 160
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType88(buf, offset))
                offset += 160
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType87")
fun lowerType87(value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`>): java.nio.ByteBuffer {
    return lowerToBuffer87(value)
}

@JvmName("liftType87")
fun liftType87(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`> {
    return liftFromBuffer87(buf)
}

fun writeType87(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`>) {
    val childBuf = lowerToBuffer87(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType87(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer87(childBuf)
}

fun objectToHandle55(obj: mozilla.appservices.autofill.`Store`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject55(handle: kotlin.Long): mozilla.appservices.autofill.`Store` {
    return mozilla.appservices.autofill.`Store`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef55")
fun lowerObjectRef55(value: mozilla.appservices.autofill.`Store`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType55")
fun lowerType55(value: mozilla.appservices.autofill.`Store`): kotlin.Long {
    return objectToHandle55(value)
}

@JvmName("liftType55")
fun liftType55(handle: kotlin.Long): mozilla.appservices.autofill.`Store` {
    return handleToObject55(handle)
}

fun writeType55(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.autofill.`Store`) {
    writeLong(buf, offset, objectToHandle55(value))
}

fun readType55(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.autofill.`Store` {
    return handleToObject55(readLong(buf, offset))
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
    @JvmName("functionAutofillCreateAutofillKey")
    @JvmStatic external fun functionAutofillCreateAutofillKey(
    ) : String?
    @JvmName("functionAutofillCreateAutofillStoreWithStaticKeyManager")
    @JvmStatic external fun functionAutofillCreateAutofillStoreWithStaticKeyManager(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
    ) : Long
    @JvmName("methodAutofillAddressesBridgedEngineApply")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineApply(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillAddressesBridgedEngineEnsureCurrentSyncId")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineEnsureCurrentSyncId(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodAutofillAddressesBridgedEngineLastSync")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineLastSync(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillAddressesBridgedEngineReset")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineReset(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillAddressesBridgedEngineResetSyncId")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineResetSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodAutofillAddressesBridgedEngineSetUploaded")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineSetUploaded(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: java.nio.ByteBuffer?,
    )
    @JvmName("methodAutofillAddressesBridgedEngineStoreIncoming")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineStoreIncoming(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodAutofillAddressesBridgedEngineSyncFinished")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineSyncFinished(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillAddressesBridgedEngineSyncId")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodAutofillAddressesBridgedEngineSyncStarted")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineSyncStarted(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillAddressesBridgedEngineWipe")
    @JvmStatic external fun methodAutofillAddressesBridgedEngineWipe(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillCreditCardsBridgedEngineApply")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineApply(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillCreditCardsBridgedEngineEnsureCurrentSyncId")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineEnsureCurrentSyncId(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodAutofillCreditCardsBridgedEngineLastSync")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineLastSync(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillCreditCardsBridgedEngineReset")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineReset(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillCreditCardsBridgedEngineResetSyncId")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineResetSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodAutofillCreditCardsBridgedEngineSetUploaded")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineSetUploaded(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: java.nio.ByteBuffer?,
    )
    @JvmName("methodAutofillCreditCardsBridgedEngineStoreIncoming")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineStoreIncoming(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodAutofillCreditCardsBridgedEngineSyncFinished")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineSyncFinished(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillCreditCardsBridgedEngineSyncId")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodAutofillCreditCardsBridgedEngineSyncStarted")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineSyncStarted(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillCreditCardsBridgedEngineWipe")
    @JvmStatic external fun methodAutofillCreditCardsBridgedEngineWipe(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreAddAddress")
    @JvmStatic external fun methodAutofillStoreAddAddress(
        `uniffiArg0`: Long,
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
    ) : mozilla.appservices.autofill.`Address`
    @JvmName("methodAutofillStoreAddAddressWithMeta")
    @JvmStatic external fun methodAutofillStoreAddAddressWithMeta(
        `uniffiArg0`: Long,
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
        `uniffiArg12`: Long,
        `uniffiArg13`: Boolean,
        `uniffiArg14`: Long,
        `uniffiArg15`: Long,
        `uniffiArg16`: Long,
        `uniffiArg17`: Long,
    ) : mozilla.appservices.autofill.`Address`
    @JvmName("methodAutofillStoreAddCreditCard")
    @JvmStatic external fun methodAutofillStoreAddCreditCard(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
        `uniffiArg5`: Long,
        `uniffiArg6`: String?,
    ) : mozilla.appservices.autofill.`CreditCard`
    @JvmName("methodAutofillStoreAddCreditCardWithMeta")
    @JvmStatic external fun methodAutofillStoreAddCreditCardWithMeta(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
        `uniffiArg5`: Long,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: Long,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: Long,
        `uniffiArg11`: Long,
        `uniffiArg12`: Long,
        `uniffiArg13`: Long,
    ) : mozilla.appservices.autofill.`CreditCard`
    @JvmName("methodAutofillStoreAddManyAddressTombstones")
    @JvmStatic external fun methodAutofillStoreAddManyAddressTombstones(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreAddManyAddressesWithMeta")
    @JvmStatic external fun methodAutofillStoreAddManyAddressesWithMeta(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreAddManyCreditCardTombstones")
    @JvmStatic external fun methodAutofillStoreAddManyCreditCardTombstones(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreAddManyCreditCardsWithMeta")
    @JvmStatic external fun methodAutofillStoreAddManyCreditCardsWithMeta(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreAddPassport")
    @JvmStatic external fun methodAutofillStoreAddPassport(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
        `uniffiArg5`: Long,
        `uniffiArg6`: Long,
        `uniffiArg7`: Long,
        `uniffiArg8`: Long,
        `uniffiArg9`: Long,
    ) : mozilla.appservices.autofill.`Passport`
    @JvmName("methodAutofillStoreAddressesBridgedEngine")
    @JvmStatic external fun methodAutofillStoreAddressesBridgedEngine(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillStoreCountAllAddresses")
    @JvmStatic external fun methodAutofillStoreCountAllAddresses(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillStoreCountAllCreditCards")
    @JvmStatic external fun methodAutofillStoreCountAllCreditCards(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillStoreCountAllPassports")
    @JvmStatic external fun methodAutofillStoreCountAllPassports(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillStoreCreditCardsBridgedEngine")
    @JvmStatic external fun methodAutofillStoreCreditCardsBridgedEngine(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillStoreDeleteAddress")
    @JvmStatic external fun methodAutofillStoreDeleteAddress(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodAutofillStoreDeleteAllAddresses")
    @JvmStatic external fun methodAutofillStoreDeleteAllAddresses(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreDeleteAllCreditCards")
    @JvmStatic external fun methodAutofillStoreDeleteAllCreditCards(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreDeleteCreditCard")
    @JvmStatic external fun methodAutofillStoreDeleteCreditCard(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodAutofillStoreDeletePassport")
    @JvmStatic external fun methodAutofillStoreDeletePassport(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodAutofillStoreGetAddress")
    @JvmStatic external fun methodAutofillStoreGetAddress(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.autofill.`Address`
    @JvmName("methodAutofillStoreGetAllAddresses")
    @JvmStatic external fun methodAutofillStoreGetAllAddresses(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreGetAllCreditCards")
    @JvmStatic external fun methodAutofillStoreGetAllCreditCards(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreGetAllPassports")
    @JvmStatic external fun methodAutofillStoreGetAllPassports(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreGetCreditCard")
    @JvmStatic external fun methodAutofillStoreGetCreditCard(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.autofill.`CreditCard`
    @JvmName("methodAutofillStoreGetPassport")
    @JvmStatic external fun methodAutofillStoreGetPassport(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.autofill.`Passport`
    @JvmName("methodAutofillStoreListCreditCardCandidates")
    @JvmStatic external fun methodAutofillStoreListCreditCardCandidates(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodAutofillStoreRegisterWithSyncManager")
    @JvmStatic external fun methodAutofillStoreRegisterWithSyncManager(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreRunMaintenance")
    @JvmStatic external fun methodAutofillStoreRunMaintenance(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreScrubEncryptedData")
    @JvmStatic external fun methodAutofillStoreScrubEncryptedData(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreScrubUndecryptableCreditCardDataForRemoteReplacement")
    @JvmStatic external fun methodAutofillStoreScrubUndecryptableCreditCardDataForRemoteReplacement(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodAutofillStoreShutdown")
    @JvmStatic external fun methodAutofillStoreShutdown(
        `uniffiArg0`: Long,
    )
    @JvmName("methodAutofillStoreTouchAddress")
    @JvmStatic external fun methodAutofillStoreTouchAddress(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodAutofillStoreTouchCreditCard")
    @JvmStatic external fun methodAutofillStoreTouchCreditCard(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodAutofillStoreTouchPassport")
    @JvmStatic external fun methodAutofillStoreTouchPassport(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodAutofillStoreUpdateAddress")
    @JvmStatic external fun methodAutofillStoreUpdateAddress(
        `uniffiArg0`: Long,
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
    )
    @JvmName("methodAutofillStoreUpdateAddressWithMeta")
    @JvmStatic external fun methodAutofillStoreUpdateAddressWithMeta(
        `uniffiArg0`: Long,
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
        `uniffiArg12`: Long,
        `uniffiArg13`: Boolean,
        `uniffiArg14`: Long,
        `uniffiArg15`: Long,
        `uniffiArg16`: Long,
        `uniffiArg17`: Long,
    )
    @JvmName("methodAutofillStoreUpdateCreditCard")
    @JvmStatic external fun methodAutofillStoreUpdateCreditCard(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Long,
        `uniffiArg6`: Long,
        `uniffiArg7`: String?,
    )
    @JvmName("methodAutofillStoreUpdateCreditCardWithMeta")
    @JvmStatic external fun methodAutofillStoreUpdateCreditCardWithMeta(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
        `uniffiArg5`: Long,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: Long,
        `uniffiArg9`: Boolean,
        `uniffiArg10`: Long,
        `uniffiArg11`: Long,
        `uniffiArg12`: Long,
        `uniffiArg13`: Long,
    )
    @JvmName("methodAutofillStoreUpdatePassport")
    @JvmStatic external fun methodAutofillStoreUpdatePassport(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: Long,
        `uniffiArg6`: Long,
        `uniffiArg7`: Long,
        `uniffiArg8`: Long,
        `uniffiArg9`: Long,
        `uniffiArg10`: Long,
    )
    @JvmName("constructorAutofillStoreNew")
    @JvmStatic external fun constructorAutofillStoreNew(
        `uniffiArg0`: String?,
        `uniffiArg1`: Long,
    ) : Long
    @JvmStatic external fun objectCloneHandle82(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree82(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle83(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree83(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle55(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree55(handle: kotlin.Long)
}