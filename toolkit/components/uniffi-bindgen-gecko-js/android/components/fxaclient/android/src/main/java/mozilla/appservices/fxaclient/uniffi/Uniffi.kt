@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.fxaclient.uniffi
import uniffi.DeconstructedType56
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



// Deconstructed version of ScopedKey
class DeconstructedType97(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType97")
fun lowerType97(rec: mozilla.appservices.fxaclient.`ScopedKey`): DeconstructedType97 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`kty`)
    val uniffiFieldLowered1 = lowerString(rec.`scope`)
    val uniffiFieldLowered2 = lowerString(rec.`k`)
    val uniffiFieldLowered3 = lowerString(rec.`kid`)
    return DeconstructedType97(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType97")
fun liftType97(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
): mozilla.appservices.fxaclient.`ScopedKey` {
    return mozilla.appservices.fxaclient.`ScopedKey`(
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
    )
}

fun writeType97(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`ScopedKey`) {
    writeString(buf, offset + 0, value.`kty`)
    writeString(buf, offset + 24, value.`scope`)
    writeString(buf, offset + 48, value.`k`)
    writeString(buf, offset + 72, value.`kid`)
}

fun readType97(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`ScopedKey` {
    return mozilla.appservices.fxaclient.`ScopedKey`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readString(buf, offset + 72),
    )
}


// Deconstructed version of mozilla.appservices.fxaclient.`ScopedKey`?
class DeconstructedType96(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
)

@JvmName("lowerType96")
fun lowerType96(value: mozilla.appservices.fxaclient.`ScopedKey`?): DeconstructedType96 {
    if (value == null) {
        return DeconstructedType96(
            false,
            null,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType97(value)
        return DeconstructedType96(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
            uniffiFieldLowered.v3,
        )
    }
}

@JvmName("liftType96")
fun liftType96(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
): mozilla.appservices.fxaclient.`ScopedKey`? {
    if (v0) {
        return liftType97(
            v1,
            v2,
            v3,
            v4,
        )
    } else {
        return null
    }
}

fun writeType96(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`ScopedKey`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType97(buf, offset + 8, value)
    }
}
fun readType96(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`ScopedKey`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType97(buf, offset + 8)
    }
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



// Deconstructed version of AccessTokenInfo
class DeconstructedType120(
    val v0: String?,
    val v1: String?,
    val v2: Boolean,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: Long,
)

@JvmName("lowerType120")
fun lowerType120(rec: mozilla.appservices.fxaclient.`AccessTokenInfo`): DeconstructedType120 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`scope`)
    val uniffiFieldLowered1 = lowerString(rec.`token`)
    val uniffiFieldLowered2 = lowerType96(rec.`key`)
    val uniffiFieldLowered3 = lowerLong(rec.`expiresAt`)
    return DeconstructedType120(
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

@JvmName("liftType120")
fun liftType120(
    v0: String?,
    v1: String?,
    v2: Boolean,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: Long,
): mozilla.appservices.fxaclient.`AccessTokenInfo` {
    return mozilla.appservices.fxaclient.`AccessTokenInfo`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType96(
            v2,
            v3,
            v4,
            v5,
            v6,
        ),
        liftLong(
            v7,
        ),
    )
}

fun writeType120(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`AccessTokenInfo`) {
    writeString(buf, offset + 0, value.`scope`)
    writeString(buf, offset + 24, value.`token`)
    writeType96(buf, offset + 48, value.`key`)
    writeLong(buf, offset + 152, value.`expiresAt`)
}

fun readType120(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`AccessTokenInfo` {
    return mozilla.appservices.fxaclient.`AccessTokenInfo`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType96(buf, offset + 48),
        readLong(buf, offset + 152),
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



// Deconstructed version of AttachedClient
class DeconstructedType122(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: Boolean,
    val v4: String?,
    val v5: Boolean,
    val v6: Long,
    val v7: Boolean,
    val v8: Long,
    val v9: Boolean,
    val v10: java.nio.ByteBuffer?,
)

@JvmName("lowerType122")
fun lowerType122(rec: mozilla.appservices.fxaclient.`AttachedClient`): DeconstructedType122 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerOptionString(rec.`clientId`)
    val uniffiFieldLowered1 = lowerOptionString(rec.`deviceId`)
    val uniffiFieldLowered2 = lowerType98(rec.`deviceType`)
    val uniffiFieldLowered3 = lowerBoolean(rec.`isCurrentSession`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`name`)
    val uniffiFieldLowered5 = lowerType56(rec.`createdTime`)
    val uniffiFieldLowered6 = lowerType56(rec.`lastAccessTime`)
    val uniffiFieldLowered7 = lowerType99(rec.`scope`)
    return DeconstructedType122(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5.v0,
        uniffiFieldLowered5.v1,
        uniffiFieldLowered6.v0,
        uniffiFieldLowered6.v1,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
    )
}

@JvmName("liftType122")
fun liftType122(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: Boolean,
    v4: String?,
    v5: Boolean,
    v6: Long,
    v7: Boolean,
    v8: Long,
    v9: Boolean,
    v10: java.nio.ByteBuffer?,
): mozilla.appservices.fxaclient.`AttachedClient` {
    return mozilla.appservices.fxaclient.`AttachedClient`(
        liftOptionString(
            v0,
        ),
        liftOptionString(
            v1,
        ),
        liftType98(
            v2,
        ),
        liftBoolean(
            v3,
        ),
        liftOptionString(
            v4,
        ),
        liftType56(
            v5,
            v6,
        ),
        liftType56(
            v7,
            v8,
        ),
        liftType99(
            v9,
            v10,
        ),
    )
}

fun writeType122(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`AttachedClient`) {
    writeType18(buf, offset + 0, value.`clientId`)
    writeType18(buf, offset + 32, value.`deviceId`)
    writeType98(buf, offset + 64, value.`deviceType`)
    writeBoolean(buf, offset + 68, value.`isCurrentSession`)
    writeType18(buf, offset + 72, value.`name`)
    writeType56(buf, offset + 104, value.`createdTime`)
    writeType56(buf, offset + 120, value.`lastAccessTime`)
    writeType99(buf, offset + 136, value.`scope`)
}

fun readType122(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`AttachedClient` {
    return mozilla.appservices.fxaclient.`AttachedClient`(
        readType18(buf, offset + 0),
        readType18(buf, offset + 32),
        readType98(buf, offset + 64),
        readBoolean(buf, offset + 68),
        readType18(buf, offset + 72),
        readType56(buf, offset + 104),
        readType56(buf, offset + 120),
        readType99(buf, offset + 136),
    )
}


@JvmName("lowerType117")
fun lowerType117(rec: mozilla.appservices.fxaclient.`AuthorizationInfo`): Boolean {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerBoolean(rec.`active`)
    return uniffiFieldLowered0
}

@JvmName("liftType117")
fun liftType117(
    v0: Boolean,
): mozilla.appservices.fxaclient.`AuthorizationInfo` {
    return mozilla.appservices.fxaclient.`AuthorizationInfo`(
        liftBoolean(
            v0,
        ),
    )
}

fun writeType117(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`AuthorizationInfo`) {
    writeBoolean(buf, offset + 0, value.`active`)
}

fun readType117(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`AuthorizationInfo` {
    return mozilla.appservices.fxaclient.`AuthorizationInfo`(
        readBoolean(buf, offset + 0),
    )
}

// Deconstructed version of AuthorizationParameters
class DeconstructedType116(
    val v0: String?,
    val v1: java.nio.ByteBuffer?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
)

@JvmName("lowerType116")
fun lowerType116(rec: mozilla.appservices.fxaclient.`AuthorizationParameters`): DeconstructedType116 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`clientId`)
    val uniffiFieldLowered1 = lowerType16(rec.`scope`)
    val uniffiFieldLowered2 = lowerString(rec.`state`)
    val uniffiFieldLowered3 = lowerString(rec.`accessType`)
    val uniffiFieldLowered4 = lowerOptionString(rec.`codeChallenge`)
    val uniffiFieldLowered5 = lowerOptionString(rec.`codeChallengeMethod`)
    val uniffiFieldLowered6 = lowerOptionString(rec.`keysJwk`)
    return DeconstructedType116(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType116")
fun liftType116(
    v0: String?,
    v1: java.nio.ByteBuffer?,
    v2: String?,
    v3: String?,
    v4: String?,
    v5: String?,
    v6: String?,
): mozilla.appservices.fxaclient.`AuthorizationParameters` {
    return mozilla.appservices.fxaclient.`AuthorizationParameters`(
        liftString(
            v0,
        ),
        liftType16(
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
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
    )
}

fun writeType116(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`AuthorizationParameters`) {
    writeString(buf, offset + 0, value.`clientId`)
    writeType16(buf, offset + 24, value.`scope`)
    writeString(buf, offset + 40, value.`state`)
    writeString(buf, offset + 64, value.`accessType`)
    writeType18(buf, offset + 88, value.`codeChallenge`)
    writeType18(buf, offset + 120, value.`codeChallengeMethod`)
    writeType18(buf, offset + 152, value.`keysJwk`)
}

fun readType116(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`AuthorizationParameters` {
    return mozilla.appservices.fxaclient.`AuthorizationParameters`(
        readString(buf, offset + 0),
        readType16(buf, offset + 24),
        readString(buf, offset + 40),
        readString(buf, offset + 64),
        readType18(buf, offset + 88),
        readType18(buf, offset + 120),
        readType18(buf, offset + 152),
    )
}


@JvmName("lowerType113")
fun lowerType113(rec: mozilla.appservices.fxaclient.`CloseTabsPayload`): java.nio.ByteBuffer? {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType16(rec.`urls`)
    return uniffiFieldLowered0
}

@JvmName("liftType113")
fun liftType113(
    v0: java.nio.ByteBuffer?,
): mozilla.appservices.fxaclient.`CloseTabsPayload` {
    return mozilla.appservices.fxaclient.`CloseTabsPayload`(
        liftType16(
            v0,
        ),
    )
}

fun writeType113(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`CloseTabsPayload`) {
    writeType16(buf, offset + 0, value.`urls`)
}

fun readType113(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`CloseTabsPayload` {
    return mozilla.appservices.fxaclient.`CloseTabsPayload`(
        readType16(buf, offset + 0),
    )
}

@JvmName("lowerType101")
fun lowerType101(value: mozilla.appservices.fxaclient.`DeviceCapability`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType101")
fun liftType101(value: kotlin.Int): mozilla.appservices.fxaclient.`DeviceCapability` {
    return mozilla.appservices.fxaclient.`DeviceCapability`.values()[value]
}

fun writeType101(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`DeviceCapability`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType101(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`DeviceCapability` {
    return liftType101(readInt(buf, offset))
}


fun lowerToBuffer100(value: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 4).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType101(buf, offset, it)
        offset += 4
    }
    return buf
}

fun liftFromBuffer100(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 4
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType101(buf, offset))
                offset += 4
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType100")
fun lowerType100(value: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>): java.nio.ByteBuffer {
    return lowerToBuffer100(value)
}

@JvmName("liftType100")
fun liftType100(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`> {
    return liftFromBuffer100(buf)
}

fun writeType100(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>) {
    val childBuf = lowerToBuffer100(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType100(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer100(childBuf)
}

// Deconstructed version of DevicePushSubscription
class DeconstructedType103(
    val v0: String?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType103")
fun lowerType103(rec: mozilla.appservices.fxaclient.`DevicePushSubscription`): DeconstructedType103 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`endpoint`)
    val uniffiFieldLowered1 = lowerString(rec.`publicKey`)
    val uniffiFieldLowered2 = lowerString(rec.`authKey`)
    return DeconstructedType103(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType103")
fun liftType103(
    v0: String?,
    v1: String?,
    v2: String?,
): mozilla.appservices.fxaclient.`DevicePushSubscription` {
    return mozilla.appservices.fxaclient.`DevicePushSubscription`(
        liftString(
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

fun writeType103(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`DevicePushSubscription`) {
    writeString(buf, offset + 0, value.`endpoint`)
    writeString(buf, offset + 24, value.`publicKey`)
    writeString(buf, offset + 48, value.`authKey`)
}

fun readType103(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`DevicePushSubscription` {
    return mozilla.appservices.fxaclient.`DevicePushSubscription`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
    )
}


// Deconstructed version of mozilla.appservices.fxaclient.`DevicePushSubscription`?
class DeconstructedType102(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: String?,
)

@JvmName("lowerType102")
fun lowerType102(value: mozilla.appservices.fxaclient.`DevicePushSubscription`?): DeconstructedType102 {
    if (value == null) {
        return DeconstructedType102(
            false,
            null,
            null,
            null,
        )
    } else {
        val uniffiFieldLowered = lowerType103(value)
        return DeconstructedType102(
            true,
            uniffiFieldLowered.v0,
            uniffiFieldLowered.v1,
            uniffiFieldLowered.v2,
        )
    }
}

@JvmName("liftType102")
fun liftType102(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: String?,
): mozilla.appservices.fxaclient.`DevicePushSubscription`? {
    if (v0) {
        return liftType103(
            v1,
            v2,
            v3,
        )
    } else {
        return null
    }
}

fun writeType102(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`DevicePushSubscription`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType103(buf, offset + 8, value)
    }
}
fun readType102(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`DevicePushSubscription`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType103(buf, offset + 8)
    }
}

// Deconstructed version of Device
class DeconstructedType111(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: java.nio.ByteBuffer?,
    val v4: Boolean,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: Boolean,
    val v9: Boolean,
    val v10: Boolean,
    val v11: Long,
)

@JvmName("lowerType111")
fun lowerType111(rec: mozilla.appservices.fxaclient.`Device`): DeconstructedType111 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerString(rec.`displayName`)
    val uniffiFieldLowered2 = lowerType98(rec.`deviceType`)
    val uniffiFieldLowered3 = lowerType100(rec.`capabilities`)
    val uniffiFieldLowered4 = lowerType102(rec.`pushSubscription`)
    val uniffiFieldLowered5 = lowerBoolean(rec.`pushEndpointExpired`)
    val uniffiFieldLowered6 = lowerBoolean(rec.`isCurrentDevice`)
    val uniffiFieldLowered7 = lowerType56(rec.`lastAccessTime`)
    return DeconstructedType111(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered4.v2,
        uniffiFieldLowered4.v3,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
        uniffiFieldLowered7.v0,
        uniffiFieldLowered7.v1,
    )
}

@JvmName("liftType111")
fun liftType111(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: java.nio.ByteBuffer?,
    v4: Boolean,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: Boolean,
    v9: Boolean,
    v10: Boolean,
    v11: Long,
): mozilla.appservices.fxaclient.`Device` {
    return mozilla.appservices.fxaclient.`Device`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType98(
            v2,
        ),
        liftType100(
            v3,
        ),
        liftType102(
            v4,
            v5,
            v6,
            v7,
        ),
        liftBoolean(
            v8,
        ),
        liftBoolean(
            v9,
        ),
        liftType56(
            v10,
            v11,
        ),
    )
}

fun writeType111(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`Device`) {
    writeString(buf, offset + 0, value.`id`)
    writeString(buf, offset + 24, value.`displayName`)
    writeType98(buf, offset + 48, value.`deviceType`)
    writeType100(buf, offset + 56, value.`capabilities`)
    writeType102(buf, offset + 72, value.`pushSubscription`)
    writeBoolean(buf, offset + 152, value.`pushEndpointExpired`)
    writeBoolean(buf, offset + 153, value.`isCurrentDevice`)
    writeType56(buf, offset + 160, value.`lastAccessTime`)
}

fun readType111(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`Device` {
    return mozilla.appservices.fxaclient.`Device`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType98(buf, offset + 48),
        readType100(buf, offset + 56),
        readType102(buf, offset + 72),
        readBoolean(buf, offset + 152),
        readBoolean(buf, offset + 153),
        readType56(buf, offset + 160),
    )
}

// Deconstructed version of DeviceConfig
class DeconstructedType108(
    val v0: String?,
    val v1: Int,
    val v2: java.nio.ByteBuffer?,
)

@JvmName("lowerType108")
fun lowerType108(rec: mozilla.appservices.fxaclient.`DeviceConfig`): DeconstructedType108 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`name`)
    val uniffiFieldLowered1 = lowerType98(rec.`deviceType`)
    val uniffiFieldLowered2 = lowerType100(rec.`capabilities`)
    return DeconstructedType108(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType108")
fun liftType108(
    v0: String?,
    v1: Int,
    v2: java.nio.ByteBuffer?,
): mozilla.appservices.fxaclient.`DeviceConfig` {
    return mozilla.appservices.fxaclient.`DeviceConfig`(
        liftString(
            v0,
        ),
        liftType98(
            v1,
        ),
        liftType100(
            v2,
        ),
    )
}

fun writeType108(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`DeviceConfig`) {
    writeString(buf, offset + 0, value.`name`)
    writeType98(buf, offset + 24, value.`deviceType`)
    writeType100(buf, offset + 32, value.`capabilities`)
}

fun readType108(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`DeviceConfig` {
    return mozilla.appservices.fxaclient.`DeviceConfig`(
        readString(buf, offset + 0),
        readType98(buf, offset + 24),
        readType100(buf, offset + 32),
    )
}

// Deconstructed version of FxaServer
class DeconstructedType104(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType104")
fun lowerType104(value: mozilla.appservices.fxaclient.`FxaServer`): DeconstructedType104 {
    when (value) {
        is mozilla.appservices.fxaclient.`FxaServer`.`Release` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType104(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`Stable` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType104(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`Stage` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            return DeconstructedType104(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`China` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType104(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`LocalDev` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            return DeconstructedType104(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`Custom` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            val uniffiFieldLowered1 = lowerString(value.`url`)
            return DeconstructedType104(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType104")
fun liftType104(
    v0: Int,
    v1: String?,
): mozilla.appservices.fxaclient.`FxaServer` {
    when (v0) {
        0 -> {
            return mozilla.appservices.fxaclient.`FxaServer`.`Release`
        }
        1 -> {
            return mozilla.appservices.fxaclient.`FxaServer`.`Stable`
        }
        2 -> {
            return mozilla.appservices.fxaclient.`FxaServer`.`Stage`
        }
        3 -> {
            return mozilla.appservices.fxaclient.`FxaServer`.`China`
        }
        4 -> {
            return mozilla.appservices.fxaclient.`FxaServer`.`LocalDev`
        }
        5 -> {
            return mozilla.appservices.fxaclient.`FxaServer`.`Custom`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType104: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType104(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`FxaServer`) {
    when (value) {
        is mozilla.appservices.fxaclient.`FxaServer`.`Release` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`Stable` -> {
            writeInt(buf, offset, 1);
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`Stage` -> {
            writeInt(buf, offset, 2);
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`China` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`LocalDev` -> {
            writeInt(buf, offset, 4);
        }
        is mozilla.appservices.fxaclient.`FxaServer`.`Custom` -> {
            writeInt(buf, offset, 5);
            writeString(buf, offset + 8, value.`url`)
        }
    }
}

fun readType104(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FxaServer` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.fxaclient.`FxaServer`.`Release`
        }
        1 -> {
            mozilla.appservices.fxaclient.`FxaServer`.`Stable`
        }
        2 -> {
            mozilla.appservices.fxaclient.`FxaServer`.`Stage`
        }
        3 -> {
            mozilla.appservices.fxaclient.`FxaServer`.`China`
        }
        4 -> {
            mozilla.appservices.fxaclient.`FxaServer`.`LocalDev`
        }
        5 -> {
            mozilla.appservices.fxaclient.`FxaServer`.`Custom`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType104: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of FxaConfig
class DeconstructedType115(
    val v0: Int,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: String?,
)

@JvmName("lowerType115")
fun lowerType115(rec: mozilla.appservices.fxaclient.`FxaConfig`): DeconstructedType115 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType104(rec.`server`)
    val uniffiFieldLowered1 = lowerString(rec.`clientId`)
    val uniffiFieldLowered2 = lowerString(rec.`redirectUri`)
    val uniffiFieldLowered3 = lowerOptionString(rec.`tokenServerUrlOverride`)
    return DeconstructedType115(
        uniffiFieldLowered0.v0,
        uniffiFieldLowered0.v1,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType115")
fun liftType115(
    v0: Int,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: String?,
): mozilla.appservices.fxaclient.`FxaConfig` {
    return mozilla.appservices.fxaclient.`FxaConfig`(
        liftType104(
            v0,
            v1,
        ),
        liftString(
            v2,
        ),
        liftString(
            v3,
        ),
        liftOptionString(
            v4,
        ),
    )
}

fun writeType115(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`FxaConfig`) {
    writeType104(buf, offset + 0, value.`server`)
    writeString(buf, offset + 32, value.`clientId`)
    writeString(buf, offset + 56, value.`redirectUri`)
    writeType18(buf, offset + 80, value.`tokenServerUrlOverride`)
}

fun readType115(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FxaConfig` {
    return mozilla.appservices.fxaclient.`FxaConfig`(
        readType104(buf, offset + 0),
        readString(buf, offset + 32),
        readString(buf, offset + 56),
        readType18(buf, offset + 80),
    )
}

// Deconstructed version of LocalDevice
class DeconstructedType119(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: java.nio.ByteBuffer?,
    val v4: Boolean,
    val v5: String?,
    val v6: String?,
    val v7: String?,
    val v8: Boolean,
)

@JvmName("lowerType119")
fun lowerType119(rec: mozilla.appservices.fxaclient.`LocalDevice`): DeconstructedType119 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerString(rec.`displayName`)
    val uniffiFieldLowered2 = lowerType98(rec.`deviceType`)
    val uniffiFieldLowered3 = lowerType100(rec.`capabilities`)
    val uniffiFieldLowered4 = lowerType102(rec.`pushSubscription`)
    val uniffiFieldLowered5 = lowerBoolean(rec.`pushEndpointExpired`)
    return DeconstructedType119(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4.v0,
        uniffiFieldLowered4.v1,
        uniffiFieldLowered4.v2,
        uniffiFieldLowered4.v3,
        uniffiFieldLowered5,
    )
}

@JvmName("liftType119")
fun liftType119(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: java.nio.ByteBuffer?,
    v4: Boolean,
    v5: String?,
    v6: String?,
    v7: String?,
    v8: Boolean,
): mozilla.appservices.fxaclient.`LocalDevice` {
    return mozilla.appservices.fxaclient.`LocalDevice`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType98(
            v2,
        ),
        liftType100(
            v3,
        ),
        liftType102(
            v4,
            v5,
            v6,
            v7,
        ),
        liftBoolean(
            v8,
        ),
    )
}

fun writeType119(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`LocalDevice`) {
    writeString(buf, offset + 0, value.`id`)
    writeString(buf, offset + 24, value.`displayName`)
    writeType98(buf, offset + 48, value.`deviceType`)
    writeType100(buf, offset + 56, value.`capabilities`)
    writeType102(buf, offset + 72, value.`pushSubscription`)
    writeBoolean(buf, offset + 152, value.`pushEndpointExpired`)
}

fun readType119(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`LocalDevice` {
    return mozilla.appservices.fxaclient.`LocalDevice`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType98(buf, offset + 48),
        readType100(buf, offset + 56),
        readType102(buf, offset + 72),
        readBoolean(buf, offset + 152),
    )
}

// Deconstructed version of Profile
class DeconstructedType124(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: String?,
    val v4: Boolean,
)

@JvmName("lowerType124")
fun lowerType124(rec: mozilla.appservices.fxaclient.`Profile`): DeconstructedType124 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`uid`)
    val uniffiFieldLowered1 = lowerString(rec.`email`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`displayName`)
    val uniffiFieldLowered3 = lowerString(rec.`avatar`)
    val uniffiFieldLowered4 = lowerBoolean(rec.`isDefaultAvatar`)
    return DeconstructedType124(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
    )
}

@JvmName("liftType124")
fun liftType124(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: String?,
    v4: Boolean,
): mozilla.appservices.fxaclient.`Profile` {
    return mozilla.appservices.fxaclient.`Profile`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftString(
            v3,
        ),
        liftBoolean(
            v4,
        ),
    )
}

fun writeType124(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`Profile`) {
    writeString(buf, offset + 0, value.`uid`)
    writeString(buf, offset + 24, value.`email`)
    writeType18(buf, offset + 48, value.`displayName`)
    writeString(buf, offset + 80, value.`avatar`)
    writeBoolean(buf, offset + 104, value.`isDefaultAvatar`)
}

fun readType124(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`Profile` {
    return mozilla.appservices.fxaclient.`Profile`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType18(buf, offset + 48),
        readString(buf, offset + 80),
        readBoolean(buf, offset + 104),
    )
}

// Deconstructed version of TabHistoryEntry
class DeconstructedType106(
    val v0: String?,
    val v1: String?,
    val v2: Boolean,
)

@JvmName("lowerType106")
fun lowerType106(rec: mozilla.appservices.fxaclient.`TabHistoryEntry`): DeconstructedType106 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`title`)
    val uniffiFieldLowered1 = lowerString(rec.`url`)
    val uniffiFieldLowered2 = lowerBoolean(rec.`isPrivate`)
    return DeconstructedType106(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType106")
fun liftType106(
    v0: String?,
    v1: String?,
    v2: Boolean,
): mozilla.appservices.fxaclient.`TabHistoryEntry` {
    return mozilla.appservices.fxaclient.`TabHistoryEntry`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftBoolean(
            v2,
        ),
    )
}

fun writeType106(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`TabHistoryEntry`) {
    writeString(buf, offset + 0, value.`title`)
    writeString(buf, offset + 24, value.`url`)
    writeBoolean(buf, offset + 48, value.`isPrivate`)
}

fun readType106(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`TabHistoryEntry` {
    return mozilla.appservices.fxaclient.`TabHistoryEntry`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readBoolean(buf, offset + 48),
    )
}


fun lowerToBuffer105(value: kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 56).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType106(buf, offset, it)
        offset += 56
    }
    return buf
}

fun liftFromBuffer105(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 56
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType106(buf, offset))
                offset += 56
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType105")
fun lowerType105(value: kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`>): java.nio.ByteBuffer {
    return lowerToBuffer105(value)
}

@JvmName("liftType105")
fun liftType105(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`> {
    return liftFromBuffer105(buf)
}

fun writeType105(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`>) {
    val childBuf = lowerToBuffer105(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType105(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer105(childBuf)
}

// Deconstructed version of SendTabPayload
class DeconstructedType112(
    val v0: java.nio.ByteBuffer?,
    val v1: String?,
    val v2: String?,
)

@JvmName("lowerType112")
fun lowerType112(rec: mozilla.appservices.fxaclient.`SendTabPayload`): DeconstructedType112 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType105(rec.`entries`)
    val uniffiFieldLowered1 = lowerString(rec.`flowId`)
    val uniffiFieldLowered2 = lowerString(rec.`streamId`)
    return DeconstructedType112(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType112")
fun liftType112(
    v0: java.nio.ByteBuffer?,
    v1: String?,
    v2: String?,
): mozilla.appservices.fxaclient.`SendTabPayload` {
    return mozilla.appservices.fxaclient.`SendTabPayload`(
        liftType105(
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

fun writeType112(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`SendTabPayload`) {
    writeType105(buf, offset + 0, value.`entries`)
    writeString(buf, offset + 16, value.`flowId`)
    writeString(buf, offset + 40, value.`streamId`)
}

fun readType112(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`SendTabPayload` {
    return mozilla.appservices.fxaclient.`SendTabPayload`(
        readType105(buf, offset + 0),
        readString(buf, offset + 16),
        readString(buf, offset + 40),
    )
}


// Deconstructed version of mozilla.appservices.fxaclient.`Device`?
class DeconstructedType110(
    val v0: Boolean,
    val v1: String?,
    val v2: String?,
    val v3: Int,
    val v4: java.nio.ByteBuffer?,
    val v5: Boolean,
    val v6: String?,
    val v7: String?,
    val v8: String?,
    val v9: Boolean,
    val v10: Boolean,
    val v11: Boolean,
    val v12: Long,
)

@JvmName("lowerType110")
fun lowerType110(value: mozilla.appservices.fxaclient.`Device`?): DeconstructedType110 {
    if (value == null) {
        return DeconstructedType110(
            false,
            null,
            null,
            0,
            null,
            false,
            null,
            null,
            null,
            false,
            false,
            false,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerType111(value)
        return DeconstructedType110(
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

@JvmName("liftType110")
fun liftType110(
    v0: Boolean,
    v1: String?,
    v2: String?,
    v3: Int,
    v4: java.nio.ByteBuffer?,
    v5: Boolean,
    v6: String?,
    v7: String?,
    v8: String?,
    v9: Boolean,
    v10: Boolean,
    v11: Boolean,
    v12: Long,
): mozilla.appservices.fxaclient.`Device`? {
    if (v0) {
        return liftType111(
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

fun writeType110(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`Device`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType111(buf, offset + 8, value)
    }
}
fun readType110(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`Device`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType111(buf, offset + 8)
    }
}

// Deconstructed version of IncomingDeviceCommand
class DeconstructedType107(
    val v0: Int,
    val v1: Boolean,
    val v2: String?,
    val v3: String?,
    val v4: Int,
    val v5: java.nio.ByteBuffer?,
    val v6: Boolean,
    val v7: String?,
    val v8: String?,
    val v9: String?,
    val v10: Boolean,
    val v11: Boolean,
    val v12: Boolean,
    val v13: Long,
    val v14: java.nio.ByteBuffer?,
    val v15: String?,
    val v16: String?,
    val v17: String?,
    val v18: Boolean,
    val v19: String?,
    val v20: String?,
    val v21: String?,
    val v22: Boolean,
    val v23: Boolean,
    val v24: Boolean,
    val v25: java.nio.ByteBuffer?,
)

@JvmName("lowerType107")
fun lowerType107(value: mozilla.appservices.fxaclient.`IncomingDeviceCommand`): DeconstructedType107 {
    when (value) {
        is mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabReceived` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType110(value.`sender`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered25 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered24 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered19 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered18 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v12
            val uniffiFieldDeconstructed1 = lowerType112(value.`payload`)
            val uniffiFieldLowered14 = uniffiFieldDeconstructed1.v0
            val uniffiFieldLowered16 = uniffiFieldDeconstructed1.v1
            val uniffiFieldLowered17 = uniffiFieldDeconstructed1.v2
            return DeconstructedType107(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                uniffiFieldLowered13,
                uniffiFieldLowered14,
                null,
                uniffiFieldLowered16,
                uniffiFieldLowered17,
                uniffiFieldLowered18,
                uniffiFieldLowered19,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
                uniffiFieldLowered24,
                uniffiFieldLowered25,
            )
        }
        is mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabsClosed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldDeconstructed0 = lowerType110(value.`sender`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered25 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered24 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered19 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered18 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v12
            val uniffiFieldLowered14 = lowerType113(value.`payload`)
            return DeconstructedType107(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                uniffiFieldLowered4,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                uniffiFieldLowered13,
                uniffiFieldLowered14,
                null,
                null,
                null,
                uniffiFieldLowered18,
                uniffiFieldLowered19,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
                uniffiFieldLowered24,
                uniffiFieldLowered25,
            )
        }
    }
}

@JvmName("liftType107")
fun liftType107(
    v0: Int,
    v1: Boolean,
    v2: String?,
    v3: String?,
    v4: Int,
    v5: java.nio.ByteBuffer?,
    v6: Boolean,
    v7: String?,
    v8: String?,
    v9: String?,
    v10: Boolean,
    v11: Boolean,
    v12: Boolean,
    v13: Long,
    v14: java.nio.ByteBuffer?,
    v15: String?,
    v16: String?,
    v17: String?,
    v18: Boolean,
    v19: String?,
    v20: String?,
    v21: String?,
    v22: Boolean,
    v23: Boolean,
    v24: Boolean,
    v25: java.nio.ByteBuffer?,
): mozilla.appservices.fxaclient.`IncomingDeviceCommand` {
    when (v0) {
        0 -> {
            return mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabReceived`(
                liftType110(
                    v1,
                    v2,
                    v3,
                    v4,
                    v25,
                    v24,
                    v21,
                    v19,
                    v20,
                    v18,
                    v23,
                    v22,
                    v13,
                ),
                liftType112(
                    v14,
                    v16,
                    v17,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabsClosed`(
                liftType110(
                    v1,
                    v2,
                    v3,
                    v4,
                    v25,
                    v24,
                    v21,
                    v19,
                    v20,
                    v18,
                    v23,
                    v22,
                    v13,
                ),
                liftType113(
                    v14,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType107: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType107(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`IncomingDeviceCommand`) {
    when (value) {
        is mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabReceived` -> {
            writeInt(buf, offset, 0);
            writeType110(buf, offset + 8, value.`sender`)
            writeType112(buf, offset + 192, value.`payload`)
        }
        is mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabsClosed` -> {
            writeInt(buf, offset, 1);
            writeType110(buf, offset + 8, value.`sender`)
            writeType113(buf, offset + 192, value.`payload`)
        }
    }
}

fun readType107(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`IncomingDeviceCommand` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabReceived`(
                readType110(buf, offset + 8),
                readType112(buf, offset + 192),
            )
        }
        1 -> {
            mozilla.appservices.fxaclient.`IncomingDeviceCommand`.`TabsClosed`(
                readType110(buf, offset + 8),
                readType113(buf, offset + 192),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType107: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of AccountEvent
class DeconstructedType126(
    val v0: Int,
    val v1: Int,
    val v2: Boolean,
    val v3: String?,
    val v4: String?,
    val v5: Int,
    val v6: java.nio.ByteBuffer?,
    val v7: Boolean,
    val v8: String?,
    val v9: String?,
    val v10: String?,
    val v11: Boolean,
    val v12: Boolean,
    val v13: Boolean,
    val v14: Long,
    val v15: java.nio.ByteBuffer?,
    val v16: String?,
    val v17: String?,
    val v18: String?,
    val v19: Boolean,
    val v20: String?,
    val v21: String?,
    val v22: String?,
    val v23: Boolean,
    val v24: Boolean,
    val v25: Boolean,
    val v26: java.nio.ByteBuffer?,
)

@JvmName("lowerType126")
fun lowerType126(value: mozilla.appservices.fxaclient.`AccountEvent`): DeconstructedType126 {
    when (value) {
        is mozilla.appservices.fxaclient.`AccountEvent`.`CommandReceived` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType107(value.`command`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            val uniffiFieldLowered4 = uniffiFieldDeconstructed0.v3
            val uniffiFieldLowered5 = uniffiFieldDeconstructed0.v4
            val uniffiFieldLowered26 = uniffiFieldDeconstructed0.v5
            val uniffiFieldLowered25 = uniffiFieldDeconstructed0.v6
            val uniffiFieldLowered21 = uniffiFieldDeconstructed0.v7
            val uniffiFieldLowered20 = uniffiFieldDeconstructed0.v8
            val uniffiFieldLowered18 = uniffiFieldDeconstructed0.v9
            val uniffiFieldLowered19 = uniffiFieldDeconstructed0.v10
            val uniffiFieldLowered24 = uniffiFieldDeconstructed0.v11
            val uniffiFieldLowered23 = uniffiFieldDeconstructed0.v12
            val uniffiFieldLowered14 = uniffiFieldDeconstructed0.v13
            val uniffiFieldLowered15 = uniffiFieldDeconstructed0.v14
            val uniffiFieldLowered16 = uniffiFieldDeconstructed0.v15
            val uniffiFieldLowered17 = uniffiFieldDeconstructed0.v16
            val uniffiFieldLowered10 = uniffiFieldDeconstructed0.v17
            val uniffiFieldLowered11 = uniffiFieldDeconstructed0.v18
            val uniffiFieldLowered8 = uniffiFieldDeconstructed0.v19
            val uniffiFieldLowered9 = uniffiFieldDeconstructed0.v20
            val uniffiFieldLowered22 = uniffiFieldDeconstructed0.v21
            val uniffiFieldLowered7 = uniffiFieldDeconstructed0.v22
            val uniffiFieldLowered13 = uniffiFieldDeconstructed0.v23
            val uniffiFieldLowered12 = uniffiFieldDeconstructed0.v24
            val uniffiFieldLowered6 = uniffiFieldDeconstructed0.v25
            return DeconstructedType126(
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
                uniffiFieldLowered17,
                uniffiFieldLowered18,
                uniffiFieldLowered19,
                uniffiFieldLowered20,
                uniffiFieldLowered21,
                uniffiFieldLowered22,
                uniffiFieldLowered23,
                uniffiFieldLowered24,
                uniffiFieldLowered25,
                uniffiFieldLowered26,
            )
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`ProfileUpdated` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType126(
                uniffiFieldLowered0,
                0,
                false,
                null,
                null,
                0,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                0L,
                null,
                null,
                null,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`AccountAuthStateChanged` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            return DeconstructedType126(
                uniffiFieldLowered0,
                0,
                false,
                null,
                null,
                0,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                0L,
                null,
                null,
                null,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`AccountDestroyed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType126(
                uniffiFieldLowered0,
                0,
                false,
                null,
                null,
                0,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                0L,
                null,
                null,
                null,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`DeviceConnected` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            val uniffiFieldLowered3 = lowerString(value.`deviceName`)
            return DeconstructedType126(
                uniffiFieldLowered0,
                0,
                false,
                uniffiFieldLowered3,
                null,
                0,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                0L,
                null,
                null,
                null,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`DeviceDisconnected` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            val uniffiFieldLowered3 = lowerString(value.`deviceId`)
            val uniffiFieldLowered2 = lowerBoolean(value.`isLocalDevice`)
            return DeconstructedType126(
                uniffiFieldLowered0,
                0,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                null,
                0,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                0L,
                null,
                null,
                null,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`Unknown` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 6
            return DeconstructedType126(
                uniffiFieldLowered0,
                0,
                false,
                null,
                null,
                0,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                0L,
                null,
                null,
                null,
                null,
                false,
                null,
                null,
                null,
                false,
                false,
                false,
                null,
            )
        }
    }
}

@JvmName("liftType126")
fun liftType126(
    v0: Int,
    v1: Int,
    v2: Boolean,
    v3: String?,
    v4: String?,
    v5: Int,
    v6: java.nio.ByteBuffer?,
    v7: Boolean,
    v8: String?,
    v9: String?,
    v10: String?,
    v11: Boolean,
    v12: Boolean,
    v13: Boolean,
    v14: Long,
    v15: java.nio.ByteBuffer?,
    v16: String?,
    v17: String?,
    v18: String?,
    v19: Boolean,
    v20: String?,
    v21: String?,
    v22: String?,
    v23: Boolean,
    v24: Boolean,
    v25: Boolean,
    v26: java.nio.ByteBuffer?,
): mozilla.appservices.fxaclient.`AccountEvent` {
    when (v0) {
        0 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`CommandReceived`(
                liftType107(
                    v1,
                    v2,
                    v3,
                    v4,
                    v5,
                    v26,
                    v25,
                    v21,
                    v20,
                    v18,
                    v19,
                    v24,
                    v23,
                    v14,
                    v15,
                    v16,
                    v17,
                    v10,
                    v11,
                    v8,
                    v9,
                    v22,
                    v7,
                    v13,
                    v12,
                    v6,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`ProfileUpdated`
        }
        2 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`AccountAuthStateChanged`
        }
        3 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`AccountDestroyed`
        }
        4 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`DeviceConnected`(
                liftString(
                    v3,
                ),
            )
        }
        5 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`DeviceDisconnected`(
                liftString(
                    v3,
                ),
                liftBoolean(
                    v2,
                ),
            )
        }
        6 -> {
            return mozilla.appservices.fxaclient.`AccountEvent`.`Unknown`
        }
        else -> {
            throw uniffi.InternalException("liftType126: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType126(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`AccountEvent`) {
    when (value) {
        is mozilla.appservices.fxaclient.`AccountEvent`.`CommandReceived` -> {
            writeInt(buf, offset, 0);
            writeType107(buf, offset + 8, value.`command`)
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`ProfileUpdated` -> {
            writeInt(buf, offset, 1);
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`AccountAuthStateChanged` -> {
            writeInt(buf, offset, 2);
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`AccountDestroyed` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`DeviceConnected` -> {
            writeInt(buf, offset, 4);
            writeString(buf, offset + 8, value.`deviceName`)
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`DeviceDisconnected` -> {
            writeInt(buf, offset, 5);
            writeString(buf, offset + 8, value.`deviceId`)
            writeBoolean(buf, offset + 32, value.`isLocalDevice`)
        }
        is mozilla.appservices.fxaclient.`AccountEvent`.`Unknown` -> {
            writeInt(buf, offset, 6);
        }
    }
}

fun readType126(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`AccountEvent` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`CommandReceived`(
                readType107(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`ProfileUpdated`
        }
        2 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`AccountAuthStateChanged`
        }
        3 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`AccountDestroyed`
        }
        4 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`DeviceConnected`(
                readString(buf, offset + 8),
            )
        }
        5 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`DeviceDisconnected`(
                readString(buf, offset + 8),
                readBoolean(buf, offset + 32),
            )
        }
        6 -> {
            mozilla.appservices.fxaclient.`AccountEvent`.`Unknown`
        }
        else -> {
            throw uniffi.InternalException("liftType126: Invalid enum discriminant: ${discriminant}")
        }
    }
}

// Deconstructed version of CloseTabsResult
class DeconstructedType118(
    val v0: Int,
    val v1: java.nio.ByteBuffer?,
)

@JvmName("lowerType118")
fun lowerType118(value: mozilla.appservices.fxaclient.`CloseTabsResult`): DeconstructedType118 {
    when (value) {
        is mozilla.appservices.fxaclient.`CloseTabsResult`.`Ok` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType118(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`CloseTabsResult`.`TabsNotClosed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerType16(value.`urls`)
            return DeconstructedType118(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType118")
fun liftType118(
    v0: Int,
    v1: java.nio.ByteBuffer?,
): mozilla.appservices.fxaclient.`CloseTabsResult` {
    when (v0) {
        0 -> {
            return mozilla.appservices.fxaclient.`CloseTabsResult`.`Ok`
        }
        1 -> {
            return mozilla.appservices.fxaclient.`CloseTabsResult`.`TabsNotClosed`(
                liftType16(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType118: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType118(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`CloseTabsResult`) {
    when (value) {
        is mozilla.appservices.fxaclient.`CloseTabsResult`.`Ok` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.fxaclient.`CloseTabsResult`.`TabsNotClosed` -> {
            writeInt(buf, offset, 1);
            writeType16(buf, offset + 8, value.`urls`)
        }
    }
}

fun readType118(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`CloseTabsResult` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.fxaclient.`CloseTabsResult`.`Ok`
        }
        1 -> {
            mozilla.appservices.fxaclient.`CloseTabsResult`.`TabsNotClosed`(
                readType16(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType118: Invalid enum discriminant: ${discriminant}")
        }
    }
}

@JvmName("liftType114")
fun liftType114(v0: kotlin.Int, v1: kotlin.String): mozilla.appservices.fxaclient.`FxaException` {
    return when(v0) {
        0 -> mozilla.appservices.fxaclient.`FxaException`.`Authentication`(v1)
        1 -> mozilla.appservices.fxaclient.`FxaException`.`Forbidden`(v1)
        2 -> mozilla.appservices.fxaclient.`FxaException`.`Network`(v1)
        3 -> mozilla.appservices.fxaclient.`FxaException`.`NoExistingAuthFlow`(v1)
        4 -> mozilla.appservices.fxaclient.`FxaException`.`WrongAuthFlow`(v1)
        5 -> mozilla.appservices.fxaclient.`FxaException`.`OriginMismatch`(v1)
        6 -> mozilla.appservices.fxaclient.`FxaException`.`SyncScopedKeyMissingInServerResponse`(v1)
        7 -> mozilla.appservices.fxaclient.`FxaException`.`Panic`(v1)
        8 -> mozilla.appservices.fxaclient.`FxaException`.`Other`(v1)
        else -> throw uniffi.InternalException("liftType114: Invalid enum value: ${v0}")
    }
}


fun readType114(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FxaException` {
    val uniffiDiscriminent = readInt(buf, offset)
    return when(uniffiDiscriminent) {
        0 -> mozilla.appservices.fxaclient.`FxaException`.`Authentication`(readString(buf, offset + 8))
        1 -> mozilla.appservices.fxaclient.`FxaException`.`Forbidden`(readString(buf, offset + 8))
        2 -> mozilla.appservices.fxaclient.`FxaException`.`Network`(readString(buf, offset + 8))
        3 -> mozilla.appservices.fxaclient.`FxaException`.`NoExistingAuthFlow`(readString(buf, offset + 8))
        4 -> mozilla.appservices.fxaclient.`FxaException`.`WrongAuthFlow`(readString(buf, offset + 8))
        5 -> mozilla.appservices.fxaclient.`FxaException`.`OriginMismatch`(readString(buf, offset + 8))
        6 -> mozilla.appservices.fxaclient.`FxaException`.`SyncScopedKeyMissingInServerResponse`(readString(buf, offset + 8))
        7 -> mozilla.appservices.fxaclient.`FxaException`.`Panic`(readString(buf, offset + 8))
        8 -> mozilla.appservices.fxaclient.`FxaException`.`Other`(readString(buf, offset + 8))
        else -> throw uniffi.InternalException("readType114: Invalid enum value: ${uniffiDiscriminent}")
    }
}



// Deconstructed version of FxaEvent
class DeconstructedType128(
    val v0: Int,
    val v1: String?,
    val v2: Int,
    val v3: java.nio.ByteBuffer?,
    val v4: String?,
    val v5: String?,
    val v6: String?,
    val v7: String?,
)

@JvmName("lowerType128")
fun lowerType128(value: mozilla.appservices.fxaclient.`FxaEvent`): DeconstructedType128 {
    when (value) {
        is mozilla.appservices.fxaclient.`FxaEvent`.`Initialize` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldDeconstructed0 = lowerType108(value.`deviceConfig`)
            val uniffiFieldLowered1 = uniffiFieldDeconstructed0.v0
            val uniffiFieldLowered2 = uniffiFieldDeconstructed0.v1
            val uniffiFieldLowered3 = uniffiFieldDeconstructed0.v2
            return DeconstructedType128(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
                uniffiFieldLowered3,
                null,
                null,
                null,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`BeginOAuthFlow` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`service`)
            val uniffiFieldLowered3 = lowerType16(value.`scopes`)
            val uniffiFieldLowered7 = lowerString(value.`entrypoint`)
            return DeconstructedType128(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0,
                uniffiFieldLowered3,
                null,
                null,
                null,
                uniffiFieldLowered7,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`BeginPairingFlow` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`pairingUrl`)
            val uniffiFieldLowered7 = lowerString(value.`service`)
            val uniffiFieldLowered3 = lowerType16(value.`scopes`)
            val uniffiFieldLowered6 = lowerString(value.`entrypoint`)
            return DeconstructedType128(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0,
                uniffiFieldLowered3,
                null,
                null,
                uniffiFieldLowered6,
                uniffiFieldLowered7,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CompleteOAuthFlow` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            val uniffiFieldLowered1 = lowerString(value.`code`)
            val uniffiFieldLowered7 = lowerString(value.`state`)
            return DeconstructedType128(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0,
                null,
                null,
                null,
                null,
                uniffiFieldLowered7,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CancelOAuthFlow` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            return DeconstructedType128(
                uniffiFieldLowered0,
                null,
                0,
                null,
                null,
                null,
                null,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CheckAuthorizationStatus` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            return DeconstructedType128(
                uniffiFieldLowered0,
                null,
                0,
                null,
                null,
                null,
                null,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`WebChannelPasswordChange` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 6
            val uniffiFieldLowered1 = lowerString(value.`jsonPayload`)
            return DeconstructedType128(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                0,
                null,
                null,
                null,
                null,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`Disconnect` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 7
            return DeconstructedType128(
                uniffiFieldLowered0,
                null,
                0,
                null,
                null,
                null,
                null,
                null,
            )
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CallGetProfile` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 8
            return DeconstructedType128(
                uniffiFieldLowered0,
                null,
                0,
                null,
                null,
                null,
                null,
                null,
            )
        }
    }
}

@JvmName("liftType128")
fun liftType128(
    v0: Int,
    v1: String?,
    v2: Int,
    v3: java.nio.ByteBuffer?,
    v4: String?,
    v5: String?,
    v6: String?,
    v7: String?,
): mozilla.appservices.fxaclient.`FxaEvent` {
    when (v0) {
        0 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`Initialize`(
                liftType108(
                    v1,
                    v2,
                    v3,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`BeginOAuthFlow`(
                liftString(
                    v1,
                ),
                liftType16(
                    v3,
                ),
                liftString(
                    v7,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`BeginPairingFlow`(
                liftString(
                    v1,
                ),
                liftString(
                    v7,
                ),
                liftType16(
                    v3,
                ),
                liftString(
                    v6,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`CompleteOAuthFlow`(
                liftString(
                    v1,
                ),
                liftString(
                    v7,
                ),
            )
        }
        4 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`CancelOAuthFlow`
        }
        5 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`CheckAuthorizationStatus`
        }
        6 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`WebChannelPasswordChange`(
                liftString(
                    v1,
                ),
            )
        }
        7 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`Disconnect`
        }
        8 -> {
            return mozilla.appservices.fxaclient.`FxaEvent`.`CallGetProfile`
        }
        else -> {
            throw uniffi.InternalException("liftType128: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType128(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`FxaEvent`) {
    when (value) {
        is mozilla.appservices.fxaclient.`FxaEvent`.`Initialize` -> {
            writeInt(buf, offset, 0);
            writeType108(buf, offset + 8, value.`deviceConfig`)
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`BeginOAuthFlow` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`service`)
            writeType16(buf, offset + 32, value.`scopes`)
            writeString(buf, offset + 48, value.`entrypoint`)
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`BeginPairingFlow` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`pairingUrl`)
            writeString(buf, offset + 32, value.`service`)
            writeType16(buf, offset + 56, value.`scopes`)
            writeString(buf, offset + 72, value.`entrypoint`)
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CompleteOAuthFlow` -> {
            writeInt(buf, offset, 3);
            writeString(buf, offset + 8, value.`code`)
            writeString(buf, offset + 32, value.`state`)
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CancelOAuthFlow` -> {
            writeInt(buf, offset, 4);
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CheckAuthorizationStatus` -> {
            writeInt(buf, offset, 5);
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`WebChannelPasswordChange` -> {
            writeInt(buf, offset, 6);
            writeString(buf, offset + 8, value.`jsonPayload`)
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`Disconnect` -> {
            writeInt(buf, offset, 7);
        }
        is mozilla.appservices.fxaclient.`FxaEvent`.`CallGetProfile` -> {
            writeInt(buf, offset, 8);
        }
    }
}

fun readType128(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FxaEvent` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`Initialize`(
                readType108(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`BeginOAuthFlow`(
                readString(buf, offset + 8),
                readType16(buf, offset + 32),
                readString(buf, offset + 48),
            )
        }
        2 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`BeginPairingFlow`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
                readType16(buf, offset + 56),
                readString(buf, offset + 72),
            )
        }
        3 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`CompleteOAuthFlow`(
                readString(buf, offset + 8),
                readString(buf, offset + 32),
            )
        }
        4 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`CancelOAuthFlow`
        }
        5 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`CheckAuthorizationStatus`
        }
        6 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`WebChannelPasswordChange`(
                readString(buf, offset + 8),
            )
        }
        7 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`Disconnect`
        }
        8 -> {
            mozilla.appservices.fxaclient.`FxaEvent`.`CallGetProfile`
        }
        else -> {
            throw uniffi.InternalException("liftType128: Invalid enum discriminant: ${discriminant}")
        }
    }
}

@JvmName("lowerType109")
fun lowerType109(value: mozilla.appservices.fxaclient.`FxaRustAuthState`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType109")
fun liftType109(value: kotlin.Int): mozilla.appservices.fxaclient.`FxaRustAuthState` {
    return mozilla.appservices.fxaclient.`FxaRustAuthState`.values()[value]
}

fun writeType109(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`FxaRustAuthState`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType109(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FxaRustAuthState` {
    return liftType109(readInt(buf, offset))
}

// Deconstructed version of FxaState
class DeconstructedType125(
    val v0: Int,
    val v1: String?,
    val v2: Int,
)

@JvmName("lowerType125")
fun lowerType125(value: mozilla.appservices.fxaclient.`FxaState`): DeconstructedType125 {
    when (value) {
        is mozilla.appservices.fxaclient.`FxaState`.`Uninitialized` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType125(
                uniffiFieldLowered0,
                null,
                0,
            )
        }
        is mozilla.appservices.fxaclient.`FxaState`.`Disconnected` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            return DeconstructedType125(
                uniffiFieldLowered0,
                null,
                0,
            )
        }
        is mozilla.appservices.fxaclient.`FxaState`.`Authenticating` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`oauthUrl`)
            val uniffiFieldLowered2 = lowerType109(value.`initialState`)
            return DeconstructedType125(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
                uniffiFieldLowered2,
            )
        }
        is mozilla.appservices.fxaclient.`FxaState`.`Connected` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType125(
                uniffiFieldLowered0,
                null,
                0,
            )
        }
        is mozilla.appservices.fxaclient.`FxaState`.`AuthIssues` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            return DeconstructedType125(
                uniffiFieldLowered0,
                null,
                0,
            )
        }
    }
}

@JvmName("liftType125")
fun liftType125(
    v0: Int,
    v1: String?,
    v2: Int,
): mozilla.appservices.fxaclient.`FxaState` {
    when (v0) {
        0 -> {
            return mozilla.appservices.fxaclient.`FxaState`.`Uninitialized`
        }
        1 -> {
            return mozilla.appservices.fxaclient.`FxaState`.`Disconnected`
        }
        2 -> {
            return mozilla.appservices.fxaclient.`FxaState`.`Authenticating`(
                liftString(
                    v1,
                ),
                liftType109(
                    v2,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.fxaclient.`FxaState`.`Connected`
        }
        4 -> {
            return mozilla.appservices.fxaclient.`FxaState`.`AuthIssues`
        }
        else -> {
            throw uniffi.InternalException("liftType125: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType125(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`FxaState`) {
    when (value) {
        is mozilla.appservices.fxaclient.`FxaState`.`Uninitialized` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.fxaclient.`FxaState`.`Disconnected` -> {
            writeInt(buf, offset, 1);
        }
        is mozilla.appservices.fxaclient.`FxaState`.`Authenticating` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`oauthUrl`)
            writeType109(buf, offset + 32, value.`initialState`)
        }
        is mozilla.appservices.fxaclient.`FxaState`.`Connected` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.fxaclient.`FxaState`.`AuthIssues` -> {
            writeInt(buf, offset, 4);
        }
    }
}

fun readType125(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FxaState` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.fxaclient.`FxaState`.`Uninitialized`
        }
        1 -> {
            mozilla.appservices.fxaclient.`FxaState`.`Disconnected`
        }
        2 -> {
            mozilla.appservices.fxaclient.`FxaState`.`Authenticating`(
                readString(buf, offset + 8),
                readType109(buf, offset + 32),
            )
        }
        3 -> {
            mozilla.appservices.fxaclient.`FxaState`.`Connected`
        }
        4 -> {
            mozilla.appservices.fxaclient.`FxaState`.`AuthIssues`
        }
        else -> {
            throw uniffi.InternalException("liftType125: Invalid enum discriminant: ${discriminant}")
        }
    }
}


fun lowerToBuffer121(value: kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 160).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType122(buf, offset, it)
        offset += 160
    }
    return buf
}

fun liftFromBuffer121(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 160
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType122(buf, offset))
                offset += 160
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType121")
fun lowerType121(value: kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`>): java.nio.ByteBuffer {
    return lowerToBuffer121(value)
}

@JvmName("liftType121")
fun liftType121(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`> {
    return liftFromBuffer121(buf)
}

fun writeType121(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`>) {
    val childBuf = lowerToBuffer121(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType121(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer121(childBuf)
}


fun lowerToBuffer123(value: kotlin.collections.List<mozilla.appservices.fxaclient.`Device`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 176).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType111(buf, offset, it)
        offset += 176
    }
    return buf
}

fun liftFromBuffer123(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`Device`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 176
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType111(buf, offset))
                offset += 176
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType123")
fun lowerType123(value: kotlin.collections.List<mozilla.appservices.fxaclient.`Device`>): java.nio.ByteBuffer {
    return lowerToBuffer123(value)
}

@JvmName("liftType123")
fun liftType123(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`Device`> {
    return liftFromBuffer123(buf)
}

fun writeType123(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.fxaclient.`Device`>) {
    val childBuf = lowerToBuffer123(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType123(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.fxaclient.`Device`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer123(childBuf)
}


fun lowerToBuffer127(value: kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 256).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType107(buf, offset, it)
        offset += 256
    }
    return buf
}

fun liftFromBuffer127(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 256
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType107(buf, offset))
                offset += 256
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType127")
fun lowerType127(value: kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`>): java.nio.ByteBuffer {
    return lowerToBuffer127(value)
}

@JvmName("liftType127")
fun liftType127(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`> {
    return liftFromBuffer127(buf)
}

fun writeType127(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`>) {
    val childBuf = lowerToBuffer127(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType127(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer127(childBuf)
}

fun objectToHandle2506(obj: mozilla.appservices.fxaclient.`FirefoxAccount`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject2506(handle: kotlin.Long): mozilla.appservices.fxaclient.`FirefoxAccount` {
    return mozilla.appservices.fxaclient.`FirefoxAccount`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef2506")
fun lowerObjectRef2506(value: mozilla.appservices.fxaclient.`FirefoxAccount`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType2506")
fun lowerType2506(value: mozilla.appservices.fxaclient.`FirefoxAccount`): kotlin.Long {
    return objectToHandle2506(value)
}

@JvmName("liftType2506")
fun liftType2506(handle: kotlin.Long): mozilla.appservices.fxaclient.`FirefoxAccount` {
    return handleToObject2506(handle)
}

fun writeType2506(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.fxaclient.`FirefoxAccount`) {
    writeLong(buf, offset, objectToHandle2506(value))
}

fun readType2506(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.fxaclient.`FirefoxAccount` {
    return handleToObject2506(readLong(buf, offset))
}



@JvmName("lowerType98")
inline fun lowerType98(value: mozilla.appservices.sync15.`DeviceType`): Int {
    return mozilla.appservices.sync15.uniffi.lowerType98(value)
}

@JvmName("liftType98")
inline fun liftType98(
    v1: Int
): mozilla.appservices.sync15.`DeviceType` {
    return mozilla.appservices.sync15.uniffi.liftType98(
        v1
    )
}

inline fun writeType98(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.sync15.`DeviceType`) {
    mozilla.appservices.sync15.uniffi.writeType98(buf, offset, value)
}

inline fun readType98(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.sync15.`DeviceType` {
    return mozilla.appservices.sync15.uniffi.readType98(buf, offset)
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
    @JvmName("methodFxaClientFirefoxAccountAuthorizeCodeUsingSessionToken")
    @JvmStatic external fun methodFxaClientFirefoxAccountAuthorizeCodeUsingSessionToken(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: java.nio.ByteBuffer?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountCheckAuthorizationStatus")
    @JvmStatic external fun methodFxaClientFirefoxAccountCheckAuthorizationStatus(
        `uniffiArg0`: Long,
    ) : Boolean
    @JvmName("methodFxaClientFirefoxAccountClearAccessTokenCache")
    @JvmStatic external fun methodFxaClientFirefoxAccountClearAccessTokenCache(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountClearDeviceName")
    @JvmStatic external fun methodFxaClientFirefoxAccountClearDeviceName(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountCloseTabs")
    @JvmStatic external fun methodFxaClientFirefoxAccountCloseTabs(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: java.nio.ByteBuffer?,
    ) : mozilla.appservices.fxaclient.`CloseTabsResult`
    @JvmName("methodFxaClientFirefoxAccountDisconnect")
    @JvmStatic external fun methodFxaClientFirefoxAccountDisconnect(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountEnsureCapabilities")
    @JvmStatic external fun methodFxaClientFirefoxAccountEnsureCapabilities(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    ) : mozilla.appservices.fxaclient.`LocalDevice`
    @JvmName("methodFxaClientFirefoxAccountGatherTelemetry")
    @JvmStatic external fun methodFxaClientFirefoxAccountGatherTelemetry(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetAccessToken")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetAccessToken(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Boolean,
    ) : mozilla.appservices.fxaclient.`AccessTokenInfo`
    @JvmName("methodFxaClientFirefoxAccountGetAttachedClients")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetAttachedClients(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodFxaClientFirefoxAccountGetAuthState")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetAuthState(
        `uniffiArg0`: Long,
    ) : Int
    @JvmName("methodFxaClientFirefoxAccountGetConnectionSuccessUrl")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetConnectionSuccessUrl(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetCurrentDeviceId")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetCurrentDeviceId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetDevices")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetDevices(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : java.nio.ByteBuffer?
    @JvmName("methodFxaClientFirefoxAccountGetManageAccountUrl")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetManageAccountUrl(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetManageDevicesUrl")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetManageDevicesUrl(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetPairingAuthorityUrl")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetPairingAuthorityUrl(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetProfile")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetProfile(
        `uniffiArg0`: Long,
        `uniffiArg1`: Boolean,
    ) : mozilla.appservices.fxaclient.`Profile`
    @JvmName("methodFxaClientFirefoxAccountGetSessionToken")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetSessionToken(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetSignedInUserForWebChannel")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetSignedInUserForWebChannel(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountGetState")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetState(
        `uniffiArg0`: Long,
    ) : mozilla.appservices.fxaclient.`FxaState`
    @JvmName("methodFxaClientFirefoxAccountGetTokenServerEndpointUrl")
    @JvmStatic external fun methodFxaClientFirefoxAccountGetTokenServerEndpointUrl(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodFxaClientFirefoxAccountHandlePushMessage")
    @JvmStatic external fun methodFxaClientFirefoxAccountHandlePushMessage(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.fxaclient.`AccountEvent`
    @JvmName("methodFxaClientFirefoxAccountHandleSessionTokenChange")
    @JvmStatic external fun methodFxaClientFirefoxAccountHandleSessionTokenChange(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodFxaClientFirefoxAccountHandleWebChannelLogin")
    @JvmStatic external fun methodFxaClientFirefoxAccountHandleWebChannelLogin(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodFxaClientFirefoxAccountHandleWebChannelPasswordChange")
    @JvmStatic external fun methodFxaClientFirefoxAccountHandleWebChannelPasswordChange(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodFxaClientFirefoxAccountHasScope")
    @JvmStatic external fun methodFxaClientFirefoxAccountHasScope(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : Boolean
    @JvmName("methodFxaClientFirefoxAccountInitializeDevice")
    @JvmStatic external fun methodFxaClientFirefoxAccountInitializeDevice(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: java.nio.ByteBuffer?,
    ) : mozilla.appservices.fxaclient.`LocalDevice`
    @JvmName("methodFxaClientFirefoxAccountMatchesServer")
    @JvmStatic external fun methodFxaClientFirefoxAccountMatchesServer(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
    ) : Boolean
    @JvmName("methodFxaClientFirefoxAccountOnAuthIssues")
    @JvmStatic external fun methodFxaClientFirefoxAccountOnAuthIssues(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountPollDeviceCommands")
    @JvmStatic external fun methodFxaClientFirefoxAccountPollDeviceCommands(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodFxaClientFirefoxAccountProcessEvent")
    @JvmStatic external fun methodFxaClientFirefoxAccountProcessEvent(
        `uniffiArg0`: Long,
        `uniffiArg1`: Int,
        `uniffiArg2`: String?,
        `uniffiArg3`: Int,
        `uniffiArg4`: java.nio.ByteBuffer?,
        `uniffiArg5`: String?,
        `uniffiArg6`: String?,
        `uniffiArg7`: String?,
        `uniffiArg8`: String?,
    ) : mozilla.appservices.fxaclient.`FxaState`
    @JvmName("methodFxaClientFirefoxAccountResetAuthRecheckTimer")
    @JvmStatic external fun methodFxaClientFirefoxAccountResetAuthRecheckTimer(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountSendSingleTab")
    @JvmStatic external fun methodFxaClientFirefoxAccountSendSingleTab(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: Boolean,
    )
    @JvmName("methodFxaClientFirefoxAccountSetDeviceName")
    @JvmStatic external fun methodFxaClientFirefoxAccountSetDeviceName(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : mozilla.appservices.fxaclient.`LocalDevice`
    @JvmName("methodFxaClientFirefoxAccountSetPushSubscription")
    @JvmStatic external fun methodFxaClientFirefoxAccountSetPushSubscription(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
    ) : mozilla.appservices.fxaclient.`LocalDevice`
    @JvmName("methodFxaClientFirefoxAccountSimulateNetworkError")
    @JvmStatic external fun methodFxaClientFirefoxAccountSimulateNetworkError(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountSimulatePermanentAuthTokenIssue")
    @JvmStatic external fun methodFxaClientFirefoxAccountSimulatePermanentAuthTokenIssue(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountSimulateTemporaryAuthTokenIssue")
    @JvmStatic external fun methodFxaClientFirefoxAccountSimulateTemporaryAuthTokenIssue(
        `uniffiArg0`: Long,
    )
    @JvmName("methodFxaClientFirefoxAccountToJson")
    @JvmStatic external fun methodFxaClientFirefoxAccountToJson(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("constructorFxaClientFirefoxAccountFromJson")
    @JvmStatic external fun constructorFxaClientFirefoxAccountFromJson(
        `uniffiArg0`: String?,
    ) : Long
    @JvmName("constructorFxaClientFirefoxAccountNew")
    @JvmStatic external fun constructorFxaClientFirefoxAccountNew(
        `uniffiArg0`: Int,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
        `uniffiArg3`: String?,
        `uniffiArg4`: String?,
    ) : Long
    @JvmStatic external fun objectCloneHandle2506(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree2506(handle: kotlin.Long)
}