@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.remotetabs.uniffi



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



// Deconstructed version of RemoteTabRecord
class DeconstructedType430(
    val v0: String?,
    val v1: java.nio.ByteBuffer?,
    val v2: String?,
    val v3: Long,
    val v4: Boolean,
    val v5: Boolean,
    val v6: Int,
    val v7: String?,
    val v8: String?,
)

@JvmName("lowerType430")
fun lowerType430(rec: mozilla.appservices.remotetabs.`RemoteTabRecord`): DeconstructedType430 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`title`)
    val uniffiFieldLowered1 = lowerType16(rec.`urlHistory`)
    val uniffiFieldLowered2 = lowerOptionString(rec.`icon`)
    val uniffiFieldLowered3 = lowerLong(rec.`lastUsed`)
    val uniffiFieldLowered4 = lowerBoolean(rec.`inactive`)
    val uniffiFieldLowered5 = lowerBoolean(rec.`pinned`)
    val uniffiFieldLowered6 = lowerUInt(rec.`index`)
    val uniffiFieldLowered7 = lowerString(rec.`windowId`)
    val uniffiFieldLowered8 = lowerString(rec.`tabGroupId`)
    return DeconstructedType430(
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

@JvmName("liftType430")
fun liftType430(
    v0: String?,
    v1: java.nio.ByteBuffer?,
    v2: String?,
    v3: Long,
    v4: Boolean,
    v5: Boolean,
    v6: Int,
    v7: String?,
    v8: String?,
): mozilla.appservices.remotetabs.`RemoteTabRecord` {
    return mozilla.appservices.remotetabs.`RemoteTabRecord`(
        liftString(
            v0,
        ),
        liftType16(
            v1,
        ),
        liftOptionString(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftBoolean(
            v4,
        ),
        liftBoolean(
            v5,
        ),
        liftUInt(
            v6,
        ),
        liftString(
            v7,
        ),
        liftString(
            v8,
        ),
    )
}

fun writeType430(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`RemoteTabRecord`) {
    writeString(buf, offset + 0, value.`title`)
    writeType16(buf, offset + 24, value.`urlHistory`)
    writeType18(buf, offset + 40, value.`icon`)
    writeLong(buf, offset + 72, value.`lastUsed`)
    writeBoolean(buf, offset + 80, value.`inactive`)
    writeBoolean(buf, offset + 81, value.`pinned`)
    writeUInt(buf, offset + 84, value.`index`)
    writeString(buf, offset + 88, value.`windowId`)
    writeString(buf, offset + 112, value.`tabGroupId`)
}

fun readType430(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`RemoteTabRecord` {
    return mozilla.appservices.remotetabs.`RemoteTabRecord`(
        readString(buf, offset + 0),
        readType16(buf, offset + 24),
        readType18(buf, offset + 40),
        readLong(buf, offset + 72),
        readBoolean(buf, offset + 80),
        readBoolean(buf, offset + 81),
        readUInt(buf, offset + 84),
        readString(buf, offset + 88),
        readString(buf, offset + 112),
    )
}


fun lowerToBuffer429(value: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 136).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType430(buf, offset, it)
        offset += 136
    }
    return buf
}

fun liftFromBuffer429(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 136
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType430(buf, offset))
                offset += 136
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType429")
fun lowerType429(value: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>): java.nio.ByteBuffer {
    return lowerToBuffer429(value)
}

@JvmName("liftType429")
fun liftType429(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`> {
    return liftFromBuffer429(buf)
}

fun writeType429(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>) {
    val childBuf = lowerToBuffer429(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType429(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer429(childBuf)
}

// Deconstructed version of TabGroup
class DeconstructedType432(
    val v0: String?,
    val v1: String?,
    val v2: String?,
    val v3: Boolean,
)

@JvmName("lowerType432")
fun lowerType432(rec: mozilla.appservices.remotetabs.`TabGroup`): DeconstructedType432 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerString(rec.`name`)
    val uniffiFieldLowered2 = lowerString(rec.`color`)
    val uniffiFieldLowered3 = lowerBoolean(rec.`collapsed`)
    return DeconstructedType432(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType432")
fun liftType432(
    v0: String?,
    v1: String?,
    v2: String?,
    v3: Boolean,
): mozilla.appservices.remotetabs.`TabGroup` {
    return mozilla.appservices.remotetabs.`TabGroup`(
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
    )
}

fun writeType432(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`TabGroup`) {
    writeString(buf, offset + 0, value.`id`)
    writeString(buf, offset + 24, value.`name`)
    writeString(buf, offset + 48, value.`color`)
    writeBoolean(buf, offset + 72, value.`collapsed`)
}

fun readType432(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`TabGroup` {
    return mozilla.appservices.remotetabs.`TabGroup`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readString(buf, offset + 48),
        readBoolean(buf, offset + 72),
    )
}


@JvmName("lowerType431")
fun lowerType431(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`TabGroup`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 104).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType432(buf, offset + 24, it.value)
        offset += 104
    }
    return buf
}

@JvmName("liftType431")
fun liftType431(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`TabGroup`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 104
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType432(buf, offset + 24),
                )
                offset += 104
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType431(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`TabGroup`>) {
    val childBuf = lowerType431(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType431(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`TabGroup`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType431(childBuf)
}


@JvmName("lowerType436")
fun lowerType436(value: mozilla.appservices.remotetabs.`Timestamp`): Long {
    return lowerLong(value)
}

@JvmName("liftType436")
fun liftType436(
    v0: Long,
): mozilla.appservices.remotetabs.`Timestamp` {
    val builtinValue = liftLong(
        v0,
    )
    return builtinValue
}

fun writeType436(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`Timestamp`) {
    writeLong(buf, offset, value)
}

fun readType436(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`Timestamp` {
    val builtinValue = readLong(buf, offset)
    return builtinValue
}

@JvmName("lowerType438")
fun lowerType438(value: mozilla.appservices.remotetabs.`WindowType`): kotlin.Int {
    return value.ordinal
}

@JvmName("liftType438")
fun liftType438(value: kotlin.Int): mozilla.appservices.remotetabs.`WindowType` {
    return mozilla.appservices.remotetabs.`WindowType`.values()[value]
}

fun writeType438(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`WindowType`) {
    writeInt(buf, offset, value.ordinal)
}

fun readType438(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`WindowType` {
    return liftType438(readInt(buf, offset))
}

// Deconstructed version of Window
class DeconstructedType434(
    val v0: String?,
    val v1: Long,
    val v2: Int,
    val v3: Int,
)

@JvmName("lowerType434")
fun lowerType434(rec: mozilla.appservices.remotetabs.`Window`): DeconstructedType434 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`id`)
    val uniffiFieldLowered1 = lowerType436(rec.`lastUsed`)
    val uniffiFieldLowered2 = lowerUInt(rec.`index`)
    val uniffiFieldLowered3 = lowerType438(rec.`windowType`)
    return DeconstructedType434(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
    )
}

@JvmName("liftType434")
fun liftType434(
    v0: String?,
    v1: Long,
    v2: Int,
    v3: Int,
): mozilla.appservices.remotetabs.`Window` {
    return mozilla.appservices.remotetabs.`Window`(
        liftString(
            v0,
        ),
        liftType436(
            v1,
        ),
        liftUInt(
            v2,
        ),
        liftType438(
            v3,
        ),
    )
}

fun writeType434(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`Window`) {
    writeString(buf, offset + 0, value.`id`)
    writeType436(buf, offset + 24, value.`lastUsed`)
    writeUInt(buf, offset + 32, value.`index`)
    writeType438(buf, offset + 36, value.`windowType`)
}

fun readType434(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`Window` {
    return mozilla.appservices.remotetabs.`Window`(
        readString(buf, offset + 0),
        readType436(buf, offset + 24),
        readUInt(buf, offset + 32),
        readType438(buf, offset + 36),
    )
}


@JvmName("lowerType433")
fun lowerType433(value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`Window`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 64).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeString(buf, offset, it.key)
        writeType434(buf, offset + 24, it.value)
        offset += 64
    }
    return buf
}

@JvmName("liftType433")
fun liftType433(buf: java.nio.ByteBuffer?): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`Window`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 64
        var offset = 0
        return buildMap(len) {
            for (i in 0..<len) {
                put(
                    readString(buf, offset),
                    readType434(buf, offset + 24),
                )
                offset += 64
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

fun writeType433(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`Window`>) {
    val childBuf = lowerType433(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType433(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`Window`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftType433(childBuf)
}

// Deconstructed version of ClientRemoteTabs
class DeconstructedType444(
    val v0: String?,
    val v1: String?,
    val v2: Int,
    val v3: Long,
    val v4: java.nio.ByteBuffer?,
    val v5: java.nio.ByteBuffer?,
    val v6: java.nio.ByteBuffer?,
)

@JvmName("lowerType444")
fun lowerType444(rec: mozilla.appservices.remotetabs.`ClientRemoteTabs`): DeconstructedType444 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`clientId`)
    val uniffiFieldLowered1 = lowerString(rec.`clientName`)
    val uniffiFieldLowered2 = lowerType98(rec.`deviceType`)
    val uniffiFieldLowered3 = lowerLong(rec.`lastModified`)
    val uniffiFieldLowered4 = lowerType429(rec.`remoteTabs`)
    val uniffiFieldLowered5 = lowerType431(rec.`tabGroups`)
    val uniffiFieldLowered6 = lowerType433(rec.`windows`)
    return DeconstructedType444(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
        uniffiFieldLowered3,
        uniffiFieldLowered4,
        uniffiFieldLowered5,
        uniffiFieldLowered6,
    )
}

@JvmName("liftType444")
fun liftType444(
    v0: String?,
    v1: String?,
    v2: Int,
    v3: Long,
    v4: java.nio.ByteBuffer?,
    v5: java.nio.ByteBuffer?,
    v6: java.nio.ByteBuffer?,
): mozilla.appservices.remotetabs.`ClientRemoteTabs` {
    return mozilla.appservices.remotetabs.`ClientRemoteTabs`(
        liftString(
            v0,
        ),
        liftString(
            v1,
        ),
        liftType98(
            v2,
        ),
        liftLong(
            v3,
        ),
        liftType429(
            v4,
        ),
        liftType431(
            v5,
        ),
        liftType433(
            v6,
        ),
    )
}

fun writeType444(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`ClientRemoteTabs`) {
    writeString(buf, offset + 0, value.`clientId`)
    writeString(buf, offset + 24, value.`clientName`)
    writeType98(buf, offset + 48, value.`deviceType`)
    writeLong(buf, offset + 56, value.`lastModified`)
    writeType429(buf, offset + 64, value.`remoteTabs`)
    writeType431(buf, offset + 80, value.`tabGroups`)
    writeType433(buf, offset + 96, value.`windows`)
}

fun readType444(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`ClientRemoteTabs` {
    return mozilla.appservices.remotetabs.`ClientRemoteTabs`(
        readString(buf, offset + 0),
        readString(buf, offset + 24),
        readType98(buf, offset + 48),
        readLong(buf, offset + 56),
        readType429(buf, offset + 64),
        readType431(buf, offset + 80),
        readType433(buf, offset + 96),
    )
}

// Deconstructed version of LocalTabsInfo
class DeconstructedType446(
    val v0: java.nio.ByteBuffer?,
    val v1: java.nio.ByteBuffer?,
    val v2: java.nio.ByteBuffer?,
)

@JvmName("lowerType446")
fun lowerType446(rec: mozilla.appservices.remotetabs.`LocalTabsInfo`): DeconstructedType446 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerType429(rec.`tabs`)
    val uniffiFieldLowered1 = lowerType431(rec.`tabGroups`)
    val uniffiFieldLowered2 = lowerType433(rec.`windows`)
    return DeconstructedType446(
        uniffiFieldLowered0,
        uniffiFieldLowered1,
        uniffiFieldLowered2,
    )
}

@JvmName("liftType446")
fun liftType446(
    v0: java.nio.ByteBuffer?,
    v1: java.nio.ByteBuffer?,
    v2: java.nio.ByteBuffer?,
): mozilla.appservices.remotetabs.`LocalTabsInfo` {
    return mozilla.appservices.remotetabs.`LocalTabsInfo`(
        liftType429(
            v0,
        ),
        liftType431(
            v1,
        ),
        liftType433(
            v2,
        ),
    )
}

fun writeType446(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`LocalTabsInfo`) {
    writeType429(buf, offset + 0, value.`tabs`)
    writeType431(buf, offset + 16, value.`tabGroups`)
    writeType433(buf, offset + 32, value.`windows`)
}

fun readType446(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`LocalTabsInfo` {
    return mozilla.appservices.remotetabs.`LocalTabsInfo`(
        readType429(buf, offset + 0),
        readType431(buf, offset + 16),
        readType433(buf, offset + 32),
    )
}

// Deconstructed version of RemoteCommand
class DeconstructedType435(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType435")
fun lowerType435(value: mozilla.appservices.remotetabs.`RemoteCommand`): DeconstructedType435 {
    when (value) {
        is mozilla.appservices.remotetabs.`RemoteCommand`.`CloseTab` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`url`)
            return DeconstructedType435(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType435")
fun liftType435(
    v0: Int,
    v1: String?,
): mozilla.appservices.remotetabs.`RemoteCommand` {
    when (v0) {
        0 -> {
            return mozilla.appservices.remotetabs.`RemoteCommand`.`CloseTab`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType435: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType435(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`RemoteCommand`) {
    when (value) {
        is mozilla.appservices.remotetabs.`RemoteCommand`.`CloseTab` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`url`)
        }
    }
}

fun readType435(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`RemoteCommand` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.remotetabs.`RemoteCommand`.`CloseTab`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType435: Invalid enum discriminant: ${discriminant}")
        }
    }
}


// Deconstructed version of mozilla.appservices.remotetabs.`Timestamp`?
class DeconstructedType437(
    val v0: Boolean,
    val v1: Long,
)

@JvmName("lowerType437")
fun lowerType437(value: mozilla.appservices.remotetabs.`Timestamp`?): DeconstructedType437 {
    if (value == null) {
        return DeconstructedType437(
            false,
            0L,
        )
    } else {
        val uniffiFieldLowered = lowerType436(value)
        return DeconstructedType437(
            true,
            uniffiFieldLowered,
        )
    }
}

@JvmName("liftType437")
fun liftType437(
    v0: Boolean,
    v1: Long,
): mozilla.appservices.remotetabs.`Timestamp`? {
    if (v0) {
        return liftType436(
            v1,
        )
    } else {
        return null
    }
}

fun writeType437(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`Timestamp`?) {
    if (value == null) {
        writeByte(buf, offset, 0.toByte())
    } else {
        writeByte(buf, offset, 1.toByte())
        writeType436(buf, offset + 8, value)
    }
}
fun readType437(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`Timestamp`? {
    return when (readByte(buf, offset)) {
        0.toByte() -> null
        else -> readType436(buf, offset + 8)
    }
}

// Deconstructed version of PendingCommand
class DeconstructedType441(
    val v0: String?,
    val v1: Int,
    val v2: String?,
    val v3: Long,
    val v4: Boolean,
    val v5: Long,
)

@JvmName("lowerType441")
fun lowerType441(rec: mozilla.appservices.remotetabs.`PendingCommand`): DeconstructedType441 {
    // Prepare by deconstructing all recursive types
    val uniffiFieldLowered0 = lowerString(rec.`deviceId`)
    val uniffiFieldLowered1 = lowerType435(rec.`command`)
    val uniffiFieldLowered2 = lowerType436(rec.`timeRequested`)
    val uniffiFieldLowered3 = lowerType437(rec.`timeSent`)
    return DeconstructedType441(
        uniffiFieldLowered0,
        uniffiFieldLowered1.v0,
        uniffiFieldLowered1.v1,
        uniffiFieldLowered2,
        uniffiFieldLowered3.v0,
        uniffiFieldLowered3.v1,
    )
}

@JvmName("liftType441")
fun liftType441(
    v0: String?,
    v1: Int,
    v2: String?,
    v3: Long,
    v4: Boolean,
    v5: Long,
): mozilla.appservices.remotetabs.`PendingCommand` {
    return mozilla.appservices.remotetabs.`PendingCommand`(
        liftString(
            v0,
        ),
        liftType435(
            v1,
            v2,
        ),
        liftType436(
            v3,
        ),
        liftType437(
            v4,
            v5,
        ),
    )
}

fun writeType441(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`PendingCommand`) {
    writeString(buf, offset + 0, value.`deviceId`)
    writeType435(buf, offset + 24, value.`command`)
    writeType436(buf, offset + 56, value.`timeRequested`)
    writeType437(buf, offset + 64, value.`timeSent`)
}

fun readType441(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`PendingCommand` {
    return mozilla.appservices.remotetabs.`PendingCommand`(
        readString(buf, offset + 0),
        readType435(buf, offset + 24),
        readType436(buf, offset + 56),
        readType437(buf, offset + 64),
    )
}

// Deconstructed version of TabsApiError
class DeconstructedType439(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType439")
fun lowerType439(value: mozilla.appservices.remotetabs.`TabsApiException`): DeconstructedType439 {
    when (value) {
        is mozilla.appservices.remotetabs.`TabsApiException`.`SyncException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType439(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.remotetabs.`TabsApiException`.`SqlException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType439(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.remotetabs.`TabsApiException`.`UnexpectedTabsException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType439(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType439")
fun liftType439(
    v0: Int,
    v1: String?,
): mozilla.appservices.remotetabs.`TabsApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.remotetabs.`TabsApiException`.`SyncException`(
                liftString(
                    v1,
                ),
            )
        }
        1 -> {
            return mozilla.appservices.remotetabs.`TabsApiException`.`SqlException`(
                liftString(
                    v1,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.remotetabs.`TabsApiException`.`UnexpectedTabsException`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType439: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType439(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`TabsApiException`) {
    when (value) {
        is mozilla.appservices.remotetabs.`TabsApiException`.`SyncException` -> {
            writeInt(buf, offset, 0);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.remotetabs.`TabsApiException`.`SqlException` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.remotetabs.`TabsApiException`.`UnexpectedTabsException` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType439(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`TabsApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.remotetabs.`TabsApiException`.`SyncException`(
                readString(buf, offset + 8),
            )
        }
        1 -> {
            mozilla.appservices.remotetabs.`TabsApiException`.`SqlException`(
                readString(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.remotetabs.`TabsApiException`.`UnexpectedTabsException`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType439: Invalid enum discriminant: ${discriminant}")
        }
    }
}


fun lowerToBuffer440(value: kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 80).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType441(buf, offset, it)
        offset += 80
    }
    return buf
}

fun liftFromBuffer440(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 80
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType441(buf, offset))
                offset += 80
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType440")
fun lowerType440(value: kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`>): java.nio.ByteBuffer {
    return lowerToBuffer440(value)
}

@JvmName("liftType440")
fun liftType440(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`> {
    return liftFromBuffer440(buf)
}

fun writeType440(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`>) {
    val childBuf = lowerToBuffer440(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType440(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer440(childBuf)
}

fun objectToHandle445(obj: mozilla.appservices.remotetabs.`RemoteCommandStore`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject445(handle: kotlin.Long): mozilla.appservices.remotetabs.`RemoteCommandStore` {
    return mozilla.appservices.remotetabs.`RemoteCommandStore`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef445")
fun lowerObjectRef445(value: mozilla.appservices.remotetabs.`RemoteCommandStore`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType445")
fun lowerType445(value: mozilla.appservices.remotetabs.`RemoteCommandStore`): kotlin.Long {
    return objectToHandle445(value)
}

@JvmName("liftType445")
fun liftType445(handle: kotlin.Long): mozilla.appservices.remotetabs.`RemoteCommandStore` {
    return handleToObject445(handle)
}

fun writeType445(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`RemoteCommandStore`) {
    writeLong(buf, offset, objectToHandle445(value))
}

fun readType445(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`RemoteCommandStore` {
    return handleToObject445(readLong(buf, offset))
}

fun objectToHandle442(obj: mozilla.appservices.remotetabs.`TabsBridgedEngine`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject442(handle: kotlin.Long): mozilla.appservices.remotetabs.`TabsBridgedEngine` {
    return mozilla.appservices.remotetabs.`TabsBridgedEngine`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef442")
fun lowerObjectRef442(value: mozilla.appservices.remotetabs.`TabsBridgedEngine`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType442")
fun lowerType442(value: mozilla.appservices.remotetabs.`TabsBridgedEngine`): kotlin.Long {
    return objectToHandle442(value)
}

@JvmName("liftType442")
fun liftType442(handle: kotlin.Long): mozilla.appservices.remotetabs.`TabsBridgedEngine` {
    return handleToObject442(handle)
}

fun writeType442(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`TabsBridgedEngine`) {
    writeLong(buf, offset, objectToHandle442(value))
}

fun readType442(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`TabsBridgedEngine` {
    return handleToObject442(readLong(buf, offset))
}


fun lowerToBuffer443(value: kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`>): java.nio.ByteBuffer {
    val buf = uniffi.Scaffolding.ffiBufferAlloc(value.size * 112).order(java.nio.ByteOrder.nativeOrder())
    var offset = 0
    value.forEach {
        writeType444(buf, offset, it)
        offset += 112
    }
    return buf
}

fun liftFromBuffer443(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`> {
    val buf = buf!!.order(java.nio.ByteOrder.nativeOrder())
    try {
        val len = buf.capacity() / 112
        var offset = 0
        return buildList(len) {
            for (i in 0..<len) {
                add(readType444(buf, offset))
                offset += 112
            }
        }
    } finally {
        uniffi.Scaffolding.ffiBufferFree(buf)
    }
}

@JvmName("lowerType443")
fun lowerType443(value: kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`>): java.nio.ByteBuffer {
    return lowerToBuffer443(value)
}

@JvmName("liftType443")
fun liftType443(buf: java.nio.ByteBuffer?): kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`> {
    return liftFromBuffer443(buf)
}

fun writeType443(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`>) {
    val childBuf = lowerToBuffer443(value)
    uniffi.writeBuffer(buf, offset, childBuf)
}

fun readType443(buf: java.nio.ByteBuffer, offset: kotlin.Int): kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`> {
    val childBuf = uniffi.readBuffer(buf, offset)
    return liftFromBuffer443(childBuf)
}

fun objectToHandle7279(obj: mozilla.appservices.remotetabs.`TabsStore`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject7279(handle: kotlin.Long): mozilla.appservices.remotetabs.`TabsStore` {
    return mozilla.appservices.remotetabs.`TabsStore`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef7279")
fun lowerObjectRef7279(value: mozilla.appservices.remotetabs.`TabsStore`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType7279")
fun lowerType7279(value: mozilla.appservices.remotetabs.`TabsStore`): kotlin.Long {
    return objectToHandle7279(value)
}

@JvmName("liftType7279")
fun liftType7279(handle: kotlin.Long): mozilla.appservices.remotetabs.`TabsStore` {
    return handleToObject7279(handle)
}

fun writeType7279(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.remotetabs.`TabsStore`) {
    writeLong(buf, offset, objectToHandle7279(value))
}

fun readType7279(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.remotetabs.`TabsStore` {
    return handleToObject7279(readLong(buf, offset))
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
    @JvmName("methodTabsRemoteCommandStoreAddRemoteCommand")
    @JvmStatic external fun methodTabsRemoteCommandStoreAddRemoteCommand(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
    ) : Boolean
    @JvmName("methodTabsRemoteCommandStoreAddRemoteCommandAt")
    @JvmStatic external fun methodTabsRemoteCommandStoreAddRemoteCommandAt(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
    ) : Boolean
    @JvmName("methodTabsRemoteCommandStoreGetUnsentCommands")
    @JvmStatic external fun methodTabsRemoteCommandStoreGetUnsentCommands(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodTabsRemoteCommandStoreRemoveRemoteCommand")
    @JvmStatic external fun methodTabsRemoteCommandStoreRemoveRemoteCommand(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
    ) : Boolean
    @JvmName("methodTabsRemoteCommandStoreSetPendingCommandSent")
    @JvmStatic external fun methodTabsRemoteCommandStoreSetPendingCommandSent(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
        `uniffiArg2`: Int,
        `uniffiArg3`: String?,
        `uniffiArg4`: Long,
        `uniffiArg5`: Boolean,
        `uniffiArg6`: Long,
    ) : Boolean
    @JvmName("methodTabsTabsBridgedEngineApply")
    @JvmStatic external fun methodTabsTabsBridgedEngineApply(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodTabsTabsBridgedEngineEnsureCurrentSyncId")
    @JvmStatic external fun methodTabsTabsBridgedEngineEnsureCurrentSyncId(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("methodTabsTabsBridgedEngineLastSync")
    @JvmStatic external fun methodTabsTabsBridgedEngineLastSync(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodTabsTabsBridgedEngineReset")
    @JvmStatic external fun methodTabsTabsBridgedEngineReset(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsBridgedEngineResetLastSync")
    @JvmStatic external fun methodTabsTabsBridgedEngineResetLastSync(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsBridgedEngineResetSyncId")
    @JvmStatic external fun methodTabsTabsBridgedEngineResetSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodTabsTabsBridgedEngineSetClients")
    @JvmStatic external fun methodTabsTabsBridgedEngineSetClients(
        `uniffiArg0`: Long,
        `uniffiArg1`: String?,
    )
    @JvmName("methodTabsTabsBridgedEngineSetUploaded")
    @JvmStatic external fun methodTabsTabsBridgedEngineSetUploaded(
        `uniffiArg0`: Long,
        `uniffiArg1`: Long,
        `uniffiArg2`: java.nio.ByteBuffer?,
    )
    @JvmName("methodTabsTabsBridgedEngineStoreIncoming")
    @JvmStatic external fun methodTabsTabsBridgedEngineStoreIncoming(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodTabsTabsBridgedEngineSyncFinished")
    @JvmStatic external fun methodTabsTabsBridgedEngineSyncFinished(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsBridgedEngineSyncId")
    @JvmStatic external fun methodTabsTabsBridgedEngineSyncId(
        `uniffiArg0`: Long,
    ) : String?
    @JvmName("methodTabsTabsBridgedEngineSyncStarted")
    @JvmStatic external fun methodTabsTabsBridgedEngineSyncStarted(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsBridgedEngineWipe")
    @JvmStatic external fun methodTabsTabsBridgedEngineWipe(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsStoreBridgedEngine")
    @JvmStatic external fun methodTabsTabsStoreBridgedEngine(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodTabsTabsStoreCloseConnection")
    @JvmStatic external fun methodTabsTabsStoreCloseConnection(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsStoreGetAll")
    @JvmStatic external fun methodTabsTabsStoreGetAll(
        `uniffiArg0`: Long,
    ) : java.nio.ByteBuffer?
    @JvmName("methodTabsTabsStoreNewRemoteCommandStore")
    @JvmStatic external fun methodTabsTabsStoreNewRemoteCommandStore(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("methodTabsTabsStoreRegisterWithSyncManager")
    @JvmStatic external fun methodTabsTabsStoreRegisterWithSyncManager(
        `uniffiArg0`: Long,
    )
    @JvmName("methodTabsTabsStoreSetLocalTabs")
    @JvmStatic external fun methodTabsTabsStoreSetLocalTabs(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
    )
    @JvmName("methodTabsTabsStoreSetLocalTabsInfo")
    @JvmStatic external fun methodTabsTabsStoreSetLocalTabsInfo(
        `uniffiArg0`: Long,
        `uniffiArg1`: java.nio.ByteBuffer?,
        `uniffiArg2`: java.nio.ByteBuffer?,
        `uniffiArg3`: java.nio.ByteBuffer?,
    )
    @JvmName("constructorTabsTabsStoreNew")
    @JvmStatic external fun constructorTabsTabsStoreNew(
        `uniffiArg0`: String?,
    ) : Long
    @JvmStatic external fun objectCloneHandle445(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree445(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle442(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree442(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle7279(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree7279(handle: kotlin.Long)
}