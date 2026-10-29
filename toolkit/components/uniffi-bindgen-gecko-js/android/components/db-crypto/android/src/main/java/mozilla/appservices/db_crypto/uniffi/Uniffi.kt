@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
@file:Suppress("NOTHING_TO_INLINE")
package mozilla.appservices.db_crypto.uniffi



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



// Deconstructed version of DbCryptoApiError
class DeconstructedType93(
    val v0: Int,
    val v1: String?,
)

@JvmName("lowerType93")
fun lowerType93(value: mozilla.appservices.db_crypto.`DbCryptoApiException`): DeconstructedType93 {
    when (value) {
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssUninitialized` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 0
            return DeconstructedType93(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssAuthenticationException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 1
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType93(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 2
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType93(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationCanceled` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 3
            return DeconstructedType93(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`MissingKey` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 4
            return DeconstructedType93(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`InvalidKey` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 5
            return DeconstructedType93(
                uniffiFieldLowered0,
                null,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`EncryptionFailed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 6
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType93(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`DecryptionFailed` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 7
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType93(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`Interrupted` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 8
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType93(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`UnexpectedDbCryptoApiException` -> {
            // The discriminant is always the first FFI field
            val uniffiFieldLowered0 = 9
            val uniffiFieldLowered1 = lowerString(value.`reason`)
            return DeconstructedType93(
                uniffiFieldLowered0,
                uniffiFieldLowered1,
            )
        }
    }
}

@JvmName("liftType93")
fun liftType93(
    v0: Int,
    v1: String?,
): mozilla.appservices.db_crypto.`DbCryptoApiException` {
    when (v0) {
        0 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssUninitialized`(
            )
        }
        1 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssAuthenticationException`(
                liftString(
                    v1,
                ),
            )
        }
        2 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationException`(
                liftString(
                    v1,
                ),
            )
        }
        3 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationCanceled`(
            )
        }
        4 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`MissingKey`(
            )
        }
        5 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`InvalidKey`(
            )
        }
        6 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`EncryptionFailed`(
                liftString(
                    v1,
                ),
            )
        }
        7 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`DecryptionFailed`(
                liftString(
                    v1,
                ),
            )
        }
        8 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`Interrupted`(
                liftString(
                    v1,
                ),
            )
        }
        9 -> {
            return mozilla.appservices.db_crypto.`DbCryptoApiException`.`UnexpectedDbCryptoApiException`(
                liftString(
                    v1,
                ),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType93: Invalid enum discriminant: ${v0}")
        }
    }
}

fun writeType93(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.db_crypto.`DbCryptoApiException`) {
    when (value) {
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssUninitialized` -> {
            writeInt(buf, offset, 0);
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssAuthenticationException` -> {
            writeInt(buf, offset, 1);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationException` -> {
            writeInt(buf, offset, 2);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationCanceled` -> {
            writeInt(buf, offset, 3);
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`MissingKey` -> {
            writeInt(buf, offset, 4);
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`InvalidKey` -> {
            writeInt(buf, offset, 5);
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`EncryptionFailed` -> {
            writeInt(buf, offset, 6);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`DecryptionFailed` -> {
            writeInt(buf, offset, 7);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`Interrupted` -> {
            writeInt(buf, offset, 8);
            writeString(buf, offset + 8, value.`reason`)
        }
        is mozilla.appservices.db_crypto.`DbCryptoApiException`.`UnexpectedDbCryptoApiException` -> {
            writeInt(buf, offset, 9);
            writeString(buf, offset + 8, value.`reason`)
        }
    }
}

fun readType93(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.db_crypto.`DbCryptoApiException` {
    val discriminant = readInt(buf, offset);
    return when (discriminant) {
        0 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssUninitialized`(
            )
        }
        1 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`NssAuthenticationException`(
                readString(buf, offset + 8),
            )
        }
        2 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationException`(
                readString(buf, offset + 8),
            )
        }
        3 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`AuthenticationCanceled`(
            )
        }
        4 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`MissingKey`(
            )
        }
        5 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`InvalidKey`(
            )
        }
        6 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`EncryptionFailed`(
                readString(buf, offset + 8),
            )
        }
        7 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`DecryptionFailed`(
                readString(buf, offset + 8),
            )
        }
        8 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`Interrupted`(
                readString(buf, offset + 8),
            )
        }
        9 -> {
            mozilla.appservices.db_crypto.`DbCryptoApiException`.`UnexpectedDbCryptoApiException`(
                readString(buf, offset + 8),
            )
        }
        else -> {
            throw uniffi.InternalException("liftType93: Invalid enum discriminant: ${discriminant}")
        }
    }
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



fun objectToHandle63(obj: mozilla.appservices.db_crypto.`EncryptorDecryptor`): kotlin.Long {
    if (obj is mozilla.appservices.db_crypto.EncryptorDecryptorImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap63.insert(obj)
    }
}

fun handleToObject63(handle: kotlin.Long): mozilla.appservices.db_crypto.`EncryptorDecryptor` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return mozilla.appservices.db_crypto.EncryptorDecryptorImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap63.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef63")
fun lowerObjectReceiverRef63(value: mozilla.appservices.db_crypto.EncryptorDecryptorImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType63")
fun lowerType63(value: mozilla.appservices.db_crypto.`EncryptorDecryptor`): kotlin.Long {
    return objectToHandle63(value)
}

@JvmName("liftType63")
fun liftType63(handle: kotlin.Long): mozilla.appservices.db_crypto.`EncryptorDecryptor` {
    return handleToObject63(handle)
}

fun writeType63(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.db_crypto.`EncryptorDecryptor`) {
    writeLong(buf, offset, objectToHandle63(value))
}

fun readType63(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.db_crypto.`EncryptorDecryptor` {
    return handleToObject63(readLong(buf, offset))
}


public val callbackInterfaceHandleMap63 = uniffi.HandleMap<mozilla.appservices.db_crypto.`EncryptorDecryptor`>();
fun callbackInterfaceDispatch63000000(
    uniffiHandle: kotlin.Long,
    uniffiReturnPointer: kotlin.Long,
    `uniffiArg1`: kotlin.ByteArray?,
) : kotlin.ByteArray?
{
    val uniffiObj = callbackInterfaceHandleMap63.get(uniffiHandle)
    val `ciphertext` = liftBytes(
        `uniffiArg1`,
    )
    val uniffiReturn = try {
        uniffiObj.`decrypt`(
            `ciphertext`,
        )
    } catch(uniffiErr: mozilla.appservices.db_crypto.`DbCryptoApiException`) {
        val uniffiErrLowered = lowerType93(uniffiErr)
        Scaffolding.setCallbackError94000000096(
            uniffiReturnPointer,
            uniffiErrLowered.v0,
            uniffiErrLowered.v1,
        )
        return null
    }
    return lowerBytes(uniffiReturn)
}
fun callbackInterfaceDispatch63000001(
    uniffiHandle: kotlin.Long,
    uniffiReturnPointer: kotlin.Long,
    `uniffiArg1`: kotlin.ByteArray?,
) : kotlin.ByteArray?
{
    val uniffiObj = callbackInterfaceHandleMap63.get(uniffiHandle)
    val `cleartext` = liftBytes(
        `uniffiArg1`,
    )
    val uniffiReturn = try {
        uniffiObj.`encrypt`(
            `cleartext`,
        )
    } catch(uniffiErr: mozilla.appservices.db_crypto.`DbCryptoApiException`) {
        val uniffiErrLowered = lowerType93(uniffiErr)
        Scaffolding.setCallbackError94000000096(
            uniffiReturnPointer,
            uniffiErrLowered.v0,
            uniffiErrLowered.v1,
        )
        return null
    }
    return lowerBytes(uniffiReturn)
}

fun callbackInterfaceFree63(handle: kotlin.Long) {
    callbackInterfaceHandleMap63.remove(handle)
}

fun objectToHandle94(obj: mozilla.appservices.db_crypto.`KeyManager`): kotlin.Long {
    if (obj is mozilla.appservices.db_crypto.KeyManagerImpl) {
        // Rust-implemented interface
        return obj.uniffiCloneHandle()
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap94.insert(obj)
    }
}

fun handleToObject94(handle: kotlin.Long): mozilla.appservices.db_crypto.`KeyManager` {
    if ((handle and 1L) == 0L) {
        // Rust-implemented interface
        return mozilla.appservices.db_crypto.KeyManagerImpl(uniffi.WithHandle, handle)
    } else {
        // Kotlin-implemented interface
        return callbackInterfaceHandleMap94.remove(handle)
    }
}

@JvmName("lowerObjectReceiverRef94")
fun lowerObjectReceiverRef94(value: mozilla.appservices.db_crypto.KeyManagerImpl): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType94")
fun lowerType94(value: mozilla.appservices.db_crypto.`KeyManager`): kotlin.Long {
    return objectToHandle94(value)
}

@JvmName("liftType94")
fun liftType94(handle: kotlin.Long): mozilla.appservices.db_crypto.`KeyManager` {
    return handleToObject94(handle)
}

fun writeType94(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.db_crypto.`KeyManager`) {
    writeLong(buf, offset, objectToHandle94(value))
}

fun readType94(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.db_crypto.`KeyManager` {
    return handleToObject94(readLong(buf, offset))
}


public val callbackInterfaceHandleMap94 = uniffi.HandleMap<mozilla.appservices.db_crypto.`KeyManager`>();
fun callbackInterfaceDispatch94000000(
    uniffiHandle: kotlin.Long,
    uniffiReturnPointer: kotlin.Long,
) : kotlin.ByteArray?
{
    val uniffiObj = callbackInterfaceHandleMap94.get(uniffiHandle)
    val uniffiReturn = try {
        uniffiObj.`getKey`(
        )
    } catch(uniffiErr: mozilla.appservices.db_crypto.`DbCryptoApiException`) {
        val uniffiErrLowered = lowerType93(uniffiErr)
        Scaffolding.setCallbackError94000000096(
            uniffiReturnPointer,
            uniffiErrLowered.v0,
            uniffiErrLowered.v1,
        )
        return null
    }
    return lowerBytes(uniffiReturn)
}

fun callbackInterfaceFree94(handle: kotlin.Long) {
    callbackInterfaceHandleMap94.remove(handle)
}

fun objectToHandle1909(obj: mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject1909(handle: kotlin.Long): mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor` {
    return mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef1909")
fun lowerObjectRef1909(value: mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType1909")
fun lowerType1909(value: mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor`): kotlin.Long {
    return objectToHandle1909(value)
}

@JvmName("liftType1909")
fun liftType1909(handle: kotlin.Long): mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor` {
    return handleToObject1909(handle)
}

fun writeType1909(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor`) {
    writeLong(buf, offset, objectToHandle1909(value))
}

fun readType1909(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.db_crypto.`ManagedEncryptorDecryptor` {
    return handleToObject1909(readLong(buf, offset))
}

fun objectToHandle1910(obj: mozilla.appservices.db_crypto.`StaticKeyManager`): kotlin.Long {
    return obj.uniffiCloneHandle()
}

fun handleToObject1910(handle: kotlin.Long): mozilla.appservices.db_crypto.`StaticKeyManager` {
    return mozilla.appservices.db_crypto.`StaticKeyManager`(uniffi.WithHandle, handle)
}

@JvmName("lowerObjectRef1910")
fun lowerObjectRef1910(value: mozilla.appservices.db_crypto.`StaticKeyManager`): kotlin.Long {
    return value.uniffiHandle
}

@JvmName("lowerType1910")
fun lowerType1910(value: mozilla.appservices.db_crypto.`StaticKeyManager`): kotlin.Long {
    return objectToHandle1910(value)
}

@JvmName("liftType1910")
fun liftType1910(handle: kotlin.Long): mozilla.appservices.db_crypto.`StaticKeyManager` {
    return handleToObject1910(handle)
}

fun writeType1910(buf: java.nio.ByteBuffer, offset: kotlin.Int, value: mozilla.appservices.db_crypto.`StaticKeyManager`) {
    writeLong(buf, offset, objectToHandle1910(value))
}

fun readType1910(buf: java.nio.ByteBuffer, offset: kotlin.Int): mozilla.appservices.db_crypto.`StaticKeyManager` {
    return handleToObject1910(readLong(buf, offset))
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
    @JvmName("functionDbCryptoCheckCanary")
    @JvmStatic external fun functionDbCryptoCheckCanary(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
        `uniffiArg2`: String?,
    ) : Boolean
    @JvmName("functionDbCryptoCreateCanary")
    @JvmStatic external fun functionDbCryptoCreateCanary(
        `uniffiArg0`: String?,
        `uniffiArg1`: String?,
    ) : String?
    @JvmName("functionDbCryptoCreateKey")
    @JvmStatic external fun functionDbCryptoCreateKey(
    ) : String?
    @JvmName("functionDbCryptoCreateManagedEncdec")
    @JvmStatic external fun functionDbCryptoCreateManagedEncdec(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("functionDbCryptoCreateStaticKeyManager")
    @JvmStatic external fun functionDbCryptoCreateStaticKeyManager(
        `uniffiArg0`: String?,
    ) : Long
    @JvmName("methodDbCryptoEncryptorDecryptorDecrypt")
    @JvmStatic external fun methodDbCryptoEncryptorDecryptorDecrypt(
        `uniffiArg0`: Long,
        `uniffiArg1`: kotlin.ByteArray?,
    ) : kotlin.ByteArray?
    @JvmName("methodDbCryptoEncryptorDecryptorEncrypt")
    @JvmStatic external fun methodDbCryptoEncryptorDecryptorEncrypt(
        `uniffiArg0`: Long,
        `uniffiArg1`: kotlin.ByteArray?,
    ) : kotlin.ByteArray?
    @JvmName("methodDbCryptoKeyManagerGetKey")
    @JvmStatic external fun methodDbCryptoKeyManagerGetKey(
        `uniffiArg0`: Long,
    ) : kotlin.ByteArray?
    @JvmName("constructorDbCryptoManagedEncryptorDecryptorNew")
    @JvmStatic external fun constructorDbCryptoManagedEncryptorDecryptorNew(
        `uniffiArg0`: Long,
    ) : Long
    @JvmName("constructorDbCryptoStaticKeyManagerNew")
    @JvmStatic external fun constructorDbCryptoStaticKeyManagerNew(
        `uniffiArg0`: String?,
    ) : Long
    @JvmStatic external fun objectCloneHandle63(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree63(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle94(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree94(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle1909(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree1909(handle: kotlin.Long)
    @JvmStatic external fun objectCloneHandle1910(handle: kotlin.Long): kotlin.Long
    @JvmStatic external fun objectFree1910(handle: kotlin.Long)
    @JvmStatic external fun setCallbackError94000000096(
        resultPtr: kotlin.Long,
        v0: Int,
        v1: String?,
    )
}