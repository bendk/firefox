package mozilla.appservices.autofill
public interface `AddressesBridgedEngineInterface` {
    fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String>
    
    fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String
    
    fun `lastSync`(): kotlin.Long
    
    fun `reset`(): Unit
    
    fun `resetSyncId`(): kotlin.String
    
    fun `setUploaded`(`newTimestamp`: kotlin.Long , `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `syncFinished`(): Unit
    
    fun `syncId`(): kotlin.String?
    
    fun `syncStarted`(): Unit
    
    fun `wipe`(): Unit
    
}
public interface `CreditCardsBridgedEngineInterface` {
    fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String>
    
    fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String
    
    fun `lastSync`(): kotlin.Long
    
    fun `reset`(): Unit
    
    fun `resetSyncId`(): kotlin.String
    
    fun `setUploaded`(`newTimestamp`: kotlin.Long , `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `syncFinished`(): Unit
    
    fun `syncId`(): kotlin.String?
    
    fun `syncStarted`(): Unit
    
    fun `wipe`(): Unit
    
}
public interface `StoreInterface` {
    fun `addAddress`(`a`: mozilla.appservices.autofill.`UpdatableAddressFields`): mozilla.appservices.autofill.`Address`
    
    fun `addAddressWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`): mozilla.appservices.autofill.`Address`
    
    fun `addCreditCard`(`cc`: mozilla.appservices.autofill.`UpdatableCreditCardFields`): mozilla.appservices.autofill.`CreditCard`
    
    fun `addCreditCardWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`): mozilla.appservices.autofill.`CreditCard`
    
    fun `addManyAddressTombstones`(`tombstones`: kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`>): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`>
    
    fun `addManyAddressesWithMeta`(`entriesWithMeta`: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`>): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`>
    
    fun `addManyCreditCardTombstones`(`tombstones`: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`>): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`>
    
    fun `addManyCreditCardsWithMeta`(`entriesWithMeta`: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`>): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`>
    
    fun `addPassport`(`p`: mozilla.appservices.autofill.`UpdatablePassportFields`): mozilla.appservices.autofill.`Passport`
    
    fun `addressesBridgedEngine`(): mozilla.appservices.autofill.`AddressesBridgedEngine`
    
    fun `countAllAddresses`(): kotlin.Long
    
    fun `countAllCreditCards`(): kotlin.Long
    
    fun `countAllPassports`(): kotlin.Long
    
    fun `creditCardsBridgedEngine`(): mozilla.appservices.autofill.`CreditCardsBridgedEngine`
    
    fun `deleteAddress`(`guid`: kotlin.String): kotlin.Boolean
    
    fun `deleteAllAddresses`(): Unit
    
    fun `deleteAllCreditCards`(): Unit
    
    fun `deleteCreditCard`(`guid`: kotlin.String): kotlin.Boolean
    
    fun `deletePassport`(`guid`: kotlin.String): kotlin.Boolean
    
    fun `getAddress`(`guid`: kotlin.String): mozilla.appservices.autofill.`Address`
    
    fun `getAllAddresses`(): kotlin.collections.List<mozilla.appservices.autofill.`Address`>
    
    fun `getAllCreditCards`(): kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`>
    
    fun `getAllPassports`(): kotlin.collections.List<mozilla.appservices.autofill.`Passport`>
    
    fun `getCreditCard`(`guid`: kotlin.String): mozilla.appservices.autofill.`CreditCard`
    
    fun `getPassport`(`guid`: kotlin.String): mozilla.appservices.autofill.`Passport`
    
    fun `listCreditCardCandidates`(): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`>
    
    fun `registerWithSyncManager`(): Unit
    
    fun `runMaintenance`(): Unit
    
    fun `scrubEncryptedData`(): Unit
    
    fun `scrubUndecryptableCreditCardDataForRemoteReplacement`(): mozilla.appservices.autofill.`CreditCardsDeletionMetrics`
    
    fun `shutdown`(): Unit
    
    fun `touchAddress`(`guid`: kotlin.String): Unit
    
    fun `touchCreditCard`(`guid`: kotlin.String): Unit
    
    fun `touchPassport`(`guid`: kotlin.String): Unit
    
    fun `updateAddress`(`guid`: kotlin.String , `a`: mozilla.appservices.autofill.`UpdatableAddressFields`): Unit
    
    fun `updateAddressWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`): Unit
    
    fun `updateCreditCard`(`guid`: kotlin.String , `cc`: mozilla.appservices.autofill.`UpdatableCreditCardFields`): Unit
    
    fun `updateCreditCardWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`): Unit
    
    fun `updatePassport`(`guid`: kotlin.String , `p`: mozilla.appservices.autofill.`UpdatablePassportFields`): Unit
    
}

data class `Address` (
    var `guid`: kotlin.String,
    var `name`: kotlin.String,
    var `organization`: kotlin.String,
    var `streetAddress`: kotlin.String,
    var `addressLevel3`: kotlin.String,
    var `addressLevel2`: kotlin.String,
    var `addressLevel1`: kotlin.String,
    var `postalCode`: kotlin.String,
    var `country`: kotlin.String,
    var `tel`: kotlin.String,
    var `email`: kotlin.String,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long?,
    var `timeLastModified`: kotlin.Long,
    var `timesUsed`: kotlin.Long,
) {
    

    companion object
}

data class `AddressMeta` (
    var `guid`: kotlin.String,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long?,
    var `timeLastModified`: kotlin.Long,
    var `timesUsed`: kotlin.Long,
    var `syncChangeCounter`: kotlin.Long,
) {
    

    companion object
}

data class `AddressTombstone` (
    var `guid`: kotlin.String,
    var `timeDeleted`: kotlin.Long,
) {
    

    companion object
}

data class `CreditCard` (
    var `guid`: kotlin.String,
    var `ccName`: kotlin.String,
    var `ccNumber`: kotlin.String,
    var `ccCvv`: kotlin.String? = null,
    var `ccNumberLast4`: kotlin.String,
    var `ccExpMonth`: kotlin.Long,
    var `ccExpYear`: kotlin.Long,
    var `ccType`: kotlin.String,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long?,
    var `timeLastModified`: kotlin.Long,
    var `timesUsed`: kotlin.Long,
) {
    

    companion object
}

data class `CreditCardCandidate` (
    var `guid`: kotlin.String,
    var `ccName`: kotlin.String,
    var `ccNumberLast4`: kotlin.String,
    var `hasCvv`: kotlin.Boolean,
    var `ccExpMonth`: kotlin.Long,
    var `ccExpYear`: kotlin.Long,
    var `ccType`: kotlin.String,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long?,
    var `timeLastModified`: kotlin.Long,
    var `timesUsed`: kotlin.Long,
) {
    

    companion object
}

data class `CreditCardMeta` (
    var `guid`: kotlin.String,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long?,
    var `timeLastModified`: kotlin.Long,
    var `timesUsed`: kotlin.Long,
    var `syncChangeCounter`: kotlin.Long,
) {
    

    companion object
}

data class `CreditCardTombstone` (
    var `guid`: kotlin.String,
    var `timeDeleted`: kotlin.Long,
) {
    

    companion object
}

data class `CreditCardsDeletionMetrics` (
    var `totalScrubbedRecords`: kotlin.ULong,
) {
    

    companion object
}

data class `Passport` (
    var `guid`: kotlin.String,
    var `name`: kotlin.String,
    var `country`: kotlin.String,
    var `passportNumber`: kotlin.String,
    var `issueDateMonth`: kotlin.Long,
    var `issueDateDay`: kotlin.Long,
    var `issueDateYear`: kotlin.Long,
    var `expiryDateMonth`: kotlin.Long,
    var `expiryDateDay`: kotlin.Long,
    var `expiryDateYear`: kotlin.Long,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long?,
    var `timeLastModified`: kotlin.Long,
    var `timesUsed`: kotlin.Long,
) {
    

    companion object
}

data class `UpdatableAddressFields` (
    var `name`: kotlin.String,
    var `organization`: kotlin.String,
    var `streetAddress`: kotlin.String,
    var `addressLevel3`: kotlin.String,
    var `addressLevel2`: kotlin.String,
    var `addressLevel1`: kotlin.String,
    var `postalCode`: kotlin.String,
    var `country`: kotlin.String,
    var `tel`: kotlin.String,
    var `email`: kotlin.String,
) {
    

    companion object
}

data class `UpdatableAddressFieldsWithMeta` (
    var `fields`: mozilla.appservices.autofill.`UpdatableAddressFields`,
    var `meta`: mozilla.appservices.autofill.`AddressMeta`,
) {
    

    companion object
}

data class `UpdatableCreditCardFields` (
    var `ccName`: kotlin.String,
    var `ccNumber`: kotlin.String,
    var `ccCvv`: kotlin.String? = null,
    var `ccExpMonth`: kotlin.Long,
    var `ccExpYear`: kotlin.Long,
    var `ccType`: kotlin.String,
) {
    

    companion object
}

data class `UpdatableCreditCardFieldsWithMeta` (
    var `fields`: mozilla.appservices.autofill.`UpdatableCreditCardFields`,
    var `meta`: mozilla.appservices.autofill.`CreditCardMeta`,
) {
    

    companion object
}

data class `UpdatablePassportFields` (
    var `name`: kotlin.String,
    var `country`: kotlin.String,
    var `passportNumber`: kotlin.String,
    var `issueDateMonth`: kotlin.Long,
    var `issueDateDay`: kotlin.Long,
    var `issueDateYear`: kotlin.Long,
    var `expiryDateMonth`: kotlin.Long,
    var `expiryDateDay`: kotlin.Long,
    var `expiryDateYear`: kotlin.Long,
) {
    

    companion object
}

sealed class `AddressBulkResultEntry` {
    data class `Success`(val `address`: mozilla.appservices.autofill.`Address`,) : `AddressBulkResultEntry`()
    data class `Error`(val `message`: kotlin.String,) : `AddressBulkResultEntry`()
    
    

    companion object
}

sealed class `AddressBulkTombstoneResultEntry` {
    data class `Success`(val `guid`: kotlin.String,) : `AddressBulkTombstoneResultEntry`()
    data class `Error`(val `message`: kotlin.String,) : `AddressBulkTombstoneResultEntry`()
    
    

    companion object
}

sealed class `AutofillApiException` : Exception() {
    
    class `SqlException`(val `reason`: kotlin.String,) : `AutofillApiException`()
    
    
    class `InterruptedException`() : `AutofillApiException`()
    
    
    class `CryptoException`(val `reason`: kotlin.String,) : `AutofillApiException`()
    
    
    class `NoSuchRecord`(val `guid`: kotlin.String,) : `AutofillApiException`()
    
    
    class `UnexpectedAutofillApiException`(val `reason`: kotlin.String,) : `AutofillApiException`()
    
    
    

    companion object
}

sealed class `CreditCardBulkResultEntry` {
    data class `Success`(val `creditCard`: mozilla.appservices.autofill.`CreditCard`,) : `CreditCardBulkResultEntry`()
    data class `Error`(val `message`: kotlin.String,) : `CreditCardBulkResultEntry`()
    
    

    companion object
}

sealed class `CreditCardBulkTombstoneResultEntry` {
    data class `Success`(val `guid`: kotlin.String,) : `CreditCardBulkTombstoneResultEntry`()
    data class `Error`(val `message`: kotlin.String,) : `CreditCardBulkTombstoneResultEntry`()
    
    

    companion object
}
// This template implements a class for working with a Rust struct via a handle
// to the live Rust struct on the other side of the FFI.
//
// There's some subtlety here, because we have to be careful not to operate on a Rust
// struct after it has been dropped, and because we must expose a public API for freeing
// theq Kotlin wrapper object in lieu of reliable finalizers. The core requirements are:
//
//   * Each instance holds an opaque handle to the underlying Rust struct.
//     Method calls need to read this handle from the object's state and pass it in to
//     the Rust FFI.
//
//   * When an instance is no longer needed, its handle should be passed to a
//     special destructor function provided by the Rust FFI, which will drop the
//     underlying Rust struct.
//
//   * Given an instance, calling code is expected to call the special
//     `destroy` method in order to free it after use, either by calling it explicitly
//     or by using a higher-level helper like the `use` method. Failing to do so risks
//     leaking the underlying Rust struct.
//
//   * We can't assume that calling code will do the right thing, and must be prepared
//     to handle Kotlin method calls executing concurrently with or even after a call to
//     `destroy`, and to handle multiple (possibly concurrent!) calls to `destroy`.
//
//   * We must never allow Rust code to operate on the underlying Rust struct after
//     the destructor has been called, and must never call the destructor more than once.
//     Doing so may trigger memory unsafety.
//
//   * To mitigate many of the risks of leaking memory and use-after-free unsafety, a `Cleaner`
//     is implemented to call the destructor when the Kotlin object becomes unreachable.
//     This is done in a background thread. This is not a panacea, and client code should be aware that
//      1. the thread may starve if some there are objects that have poorly performing
//     `drop` methods or do significant work in their `drop` methods.
//      2. the thread is shared across the whole library. This can be tuned by using `android_cleaner = true`,
//         or `android = true` in the [`kotlin` section of the `uniffi.toml` file](https://mozilla.github.io/uniffi-rs/kotlin/configuration.html).
//
// If we try to implement this with mutual exclusion on access to the handle, there is the
// possibility of a race between a method call and a concurrent call to `destroy`:
//
//    * Thread A starts a method call, reads the value of the handle, but is interrupted
//      before it can pass the handle over the FFI to Rust.
//    * Thread B calls `destroy` and frees the underlying Rust struct.
//    * Thread A resumes, passing the already-read handle value to Rust and triggering
//      a use-after-free.
//
// One possible solution would be to use a `ReadWriteLock`, with each method call taking
// a read lock (and thus allowed to run concurrently) and the special `destroy` method
// taking a write lock (and thus blocking on live method calls). However, we aim not to
// generate methods with any hidden blocking semantics, and a `destroy` method that might
// block if called incorrectly seems to meet that bar.
//
// So, we achieve our goals by giving each instance an associated `AtomicLong` counter to track
// the number of in-flight method calls, and an `AtomicBoolean` flag to indicate whether `destroy`
// has been called. These are updated according to the following rules:
//
//    * The initial value of the counter is 1, indicating a live object with no in-flight calls.
//      The initial value for the flag is false.
//
//    * At the start of each method call, we atomically check the counter.
//      If it is 0 then the underlying Rust struct has already been destroyed and the call is aborted.
//      If it is nonzero them we atomically increment it by 1 and proceed with the method call.
//
//    * At the end of each method call, we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
//    * When `destroy` is called, we atomically flip the flag from false to true.
//      If the flag was already true we silently fail.
//      Otherwise we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
// Astute readers may observe that this all sounds very similar to the way that Rust's `Arc<T>` works,
// and indeed it is, with the addition of a flag to guard against multiple calls to `destroy`.
//
// The overall effect is that the underlying Rust struct is destroyed only when `destroy` has been
// called *and* all in-flight method calls have completed, avoiding violating any of the expectations
// of the underlying Rust code.
//
// This makes a cleaner a better alternative to _not_ calling `destroy()` as
// and when the object is finished with, but the abstraction is not perfect: if the Rust object's `drop`
// method is slow, and/or there are many objects to cleanup, and it's on a low end Android device, then the cleaner
// thread may be starved, and the app will leak memory.
//
// In this case, `destroy`ing manually may be a better solution.
//
// The cleaner can live side by side with the manual calling of `destroy`. In the order of responsiveness, uniffi objects
// with Rust peers are reclaimed:
//
// 1. By calling the `destroy` method of the object, which calls `rustObject.free()`. If that doesn't happen:
// 2. When the object becomes unreachable, AND the Cleaner thread gets to call `rustObject.free()`. If the thread is starved then:
// 3. The memory is reclaimed when the process terminates.
//
// [1] https://stackoverflow.com/questions/24376768/can-java-finalize-an-object-when-it-is-still-in-scope/24380219

open class `AddressesBridgedEngine` : AddressesBridgedEngineInterface, uniffi.Disposable, AutoCloseable {
    @Suppress("UNUSED_PARAMETER")
    /**
     * @suppress
     */
    constructor(withHandle: uniffi.WithHandle, uniffiHandle: kotlin.Long) {
        this.uniffiHandle = uniffiHandle
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     *
     * This constructor can be used to instantiate a fake object. Only used for tests. Any
     * attempt to actually use an object constructed this way will fail as there is no
     * connected Rust object.
     */
    @Suppress("UNUSED_PARAMETER")
    constructor(noHandle: uniffi.NoHandle) {
        this.uniffiHandle = 0
        this.uniffiCleanable = null
    }

    /**
     * @suppress
     */
    public val uniffiHandle: kotlin.Long
    protected val uniffiCleanable: uniffi.Cleanable?

    private val wasDestroyed = java.util.concurrent.atomic.AtomicBoolean(false)
    private val callCounter = java.util.concurrent.atomic.AtomicLong(1)

    /**
     * Whether the current object has been destroyed and its reference is gone in the Rust side.
     */
    val uniffiIsDestroyed: kotlin.Boolean get() = wasDestroyed.get()

    override fun destroy() {
        // Only allow a single call to this method.
        // TODO: maybe we should log a warning if called more than once?
        if (this.wasDestroyed.compareAndSet(false, true)) {
            // This decrement always matches the initial count of 1 given at creation time.
            if (this.callCounter.decrementAndGet() == 0L) {
                uniffiCleanable?.clean()
            }
        }
    }

    @Synchronized
    override fun close() {
        this.destroy()
    }

    // Use a static inner class instead of a closure so as not to accidentally
    // capture `this` as part of the cleanable's action.
    private class UniffiCleanAction(private val uniffiHandle: kotlin.Long) : Runnable {
        override fun run() {
            if (uniffiHandle == 0.toLong()) {
                // Fake object created with `NoHandle`, don't try to free.
                return;
            }
            mozilla.appservices.autofill.uniffi.Scaffolding.objectFree82(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.autofill.uniffi.Scaffolding.objectCloneHandle82(uniffiHandle)
    }

    override public fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerLong(`serverModifiedMillis`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineApply(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType16(uniffiReturn)
    }
    override public fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`newSyncId`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineEnsureCurrentSyncId(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftString(uniffiReturn)
    }
    override public fun `lastSync`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineLastSync(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftLong(uniffiReturn)
    }
    override public fun `reset`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineReset(
        uniffiArgLowered0,
    )
    }
    override public fun `resetSyncId`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineResetSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftString(uniffiReturn)
    }
    override public fun `setUploaded`(`newTimestamp`: kotlin.Long, `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerLong(`newTimestamp`)
    val uniffiArgLowered2 = mozilla.appservices.autofill.uniffi.lowerType16(`uploadedIds`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineSetUploaded(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType16(`incomingEnvelopesAsJson`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineStoreIncoming(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `syncFinished`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineSyncFinished(
        uniffiArgLowered0,
    )
    }
    override public fun `syncId`(): kotlin.String? {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `syncStarted`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineSyncStarted(
        uniffiArgLowered0,
    )
    }
    override public fun `wipe`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef82(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillAddressesBridgedEngineWipe(
        uniffiArgLowered0,
    )
    }
    
    

    companion object {
        
    }
}
// This template implements a class for working with a Rust struct via a handle
// to the live Rust struct on the other side of the FFI.
//
// There's some subtlety here, because we have to be careful not to operate on a Rust
// struct after it has been dropped, and because we must expose a public API for freeing
// theq Kotlin wrapper object in lieu of reliable finalizers. The core requirements are:
//
//   * Each instance holds an opaque handle to the underlying Rust struct.
//     Method calls need to read this handle from the object's state and pass it in to
//     the Rust FFI.
//
//   * When an instance is no longer needed, its handle should be passed to a
//     special destructor function provided by the Rust FFI, which will drop the
//     underlying Rust struct.
//
//   * Given an instance, calling code is expected to call the special
//     `destroy` method in order to free it after use, either by calling it explicitly
//     or by using a higher-level helper like the `use` method. Failing to do so risks
//     leaking the underlying Rust struct.
//
//   * We can't assume that calling code will do the right thing, and must be prepared
//     to handle Kotlin method calls executing concurrently with or even after a call to
//     `destroy`, and to handle multiple (possibly concurrent!) calls to `destroy`.
//
//   * We must never allow Rust code to operate on the underlying Rust struct after
//     the destructor has been called, and must never call the destructor more than once.
//     Doing so may trigger memory unsafety.
//
//   * To mitigate many of the risks of leaking memory and use-after-free unsafety, a `Cleaner`
//     is implemented to call the destructor when the Kotlin object becomes unreachable.
//     This is done in a background thread. This is not a panacea, and client code should be aware that
//      1. the thread may starve if some there are objects that have poorly performing
//     `drop` methods or do significant work in their `drop` methods.
//      2. the thread is shared across the whole library. This can be tuned by using `android_cleaner = true`,
//         or `android = true` in the [`kotlin` section of the `uniffi.toml` file](https://mozilla.github.io/uniffi-rs/kotlin/configuration.html).
//
// If we try to implement this with mutual exclusion on access to the handle, there is the
// possibility of a race between a method call and a concurrent call to `destroy`:
//
//    * Thread A starts a method call, reads the value of the handle, but is interrupted
//      before it can pass the handle over the FFI to Rust.
//    * Thread B calls `destroy` and frees the underlying Rust struct.
//    * Thread A resumes, passing the already-read handle value to Rust and triggering
//      a use-after-free.
//
// One possible solution would be to use a `ReadWriteLock`, with each method call taking
// a read lock (and thus allowed to run concurrently) and the special `destroy` method
// taking a write lock (and thus blocking on live method calls). However, we aim not to
// generate methods with any hidden blocking semantics, and a `destroy` method that might
// block if called incorrectly seems to meet that bar.
//
// So, we achieve our goals by giving each instance an associated `AtomicLong` counter to track
// the number of in-flight method calls, and an `AtomicBoolean` flag to indicate whether `destroy`
// has been called. These are updated according to the following rules:
//
//    * The initial value of the counter is 1, indicating a live object with no in-flight calls.
//      The initial value for the flag is false.
//
//    * At the start of each method call, we atomically check the counter.
//      If it is 0 then the underlying Rust struct has already been destroyed and the call is aborted.
//      If it is nonzero them we atomically increment it by 1 and proceed with the method call.
//
//    * At the end of each method call, we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
//    * When `destroy` is called, we atomically flip the flag from false to true.
//      If the flag was already true we silently fail.
//      Otherwise we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
// Astute readers may observe that this all sounds very similar to the way that Rust's `Arc<T>` works,
// and indeed it is, with the addition of a flag to guard against multiple calls to `destroy`.
//
// The overall effect is that the underlying Rust struct is destroyed only when `destroy` has been
// called *and* all in-flight method calls have completed, avoiding violating any of the expectations
// of the underlying Rust code.
//
// This makes a cleaner a better alternative to _not_ calling `destroy()` as
// and when the object is finished with, but the abstraction is not perfect: if the Rust object's `drop`
// method is slow, and/or there are many objects to cleanup, and it's on a low end Android device, then the cleaner
// thread may be starved, and the app will leak memory.
//
// In this case, `destroy`ing manually may be a better solution.
//
// The cleaner can live side by side with the manual calling of `destroy`. In the order of responsiveness, uniffi objects
// with Rust peers are reclaimed:
//
// 1. By calling the `destroy` method of the object, which calls `rustObject.free()`. If that doesn't happen:
// 2. When the object becomes unreachable, AND the Cleaner thread gets to call `rustObject.free()`. If the thread is starved then:
// 3. The memory is reclaimed when the process terminates.
//
// [1] https://stackoverflow.com/questions/24376768/can-java-finalize-an-object-when-it-is-still-in-scope/24380219

open class `CreditCardsBridgedEngine` : CreditCardsBridgedEngineInterface, uniffi.Disposable, AutoCloseable {
    @Suppress("UNUSED_PARAMETER")
    /**
     * @suppress
     */
    constructor(withHandle: uniffi.WithHandle, uniffiHandle: kotlin.Long) {
        this.uniffiHandle = uniffiHandle
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     *
     * This constructor can be used to instantiate a fake object. Only used for tests. Any
     * attempt to actually use an object constructed this way will fail as there is no
     * connected Rust object.
     */
    @Suppress("UNUSED_PARAMETER")
    constructor(noHandle: uniffi.NoHandle) {
        this.uniffiHandle = 0
        this.uniffiCleanable = null
    }

    /**
     * @suppress
     */
    public val uniffiHandle: kotlin.Long
    protected val uniffiCleanable: uniffi.Cleanable?

    private val wasDestroyed = java.util.concurrent.atomic.AtomicBoolean(false)
    private val callCounter = java.util.concurrent.atomic.AtomicLong(1)

    /**
     * Whether the current object has been destroyed and its reference is gone in the Rust side.
     */
    val uniffiIsDestroyed: kotlin.Boolean get() = wasDestroyed.get()

    override fun destroy() {
        // Only allow a single call to this method.
        // TODO: maybe we should log a warning if called more than once?
        if (this.wasDestroyed.compareAndSet(false, true)) {
            // This decrement always matches the initial count of 1 given at creation time.
            if (this.callCounter.decrementAndGet() == 0L) {
                uniffiCleanable?.clean()
            }
        }
    }

    @Synchronized
    override fun close() {
        this.destroy()
    }

    // Use a static inner class instead of a closure so as not to accidentally
    // capture `this` as part of the cleanable's action.
    private class UniffiCleanAction(private val uniffiHandle: kotlin.Long) : Runnable {
        override fun run() {
            if (uniffiHandle == 0.toLong()) {
                // Fake object created with `NoHandle`, don't try to free.
                return;
            }
            mozilla.appservices.autofill.uniffi.Scaffolding.objectFree83(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.autofill.uniffi.Scaffolding.objectCloneHandle83(uniffiHandle)
    }

    override public fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerLong(`serverModifiedMillis`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineApply(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType16(uniffiReturn)
    }
    override public fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`newSyncId`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineEnsureCurrentSyncId(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftString(uniffiReturn)
    }
    override public fun `lastSync`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineLastSync(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftLong(uniffiReturn)
    }
    override public fun `reset`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineReset(
        uniffiArgLowered0,
    )
    }
    override public fun `resetSyncId`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineResetSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftString(uniffiReturn)
    }
    override public fun `setUploaded`(`newTimestamp`: kotlin.Long, `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerLong(`newTimestamp`)
    val uniffiArgLowered2 = mozilla.appservices.autofill.uniffi.lowerType16(`uploadedIds`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineSetUploaded(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType16(`incomingEnvelopesAsJson`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineStoreIncoming(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `syncFinished`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineSyncFinished(
        uniffiArgLowered0,
    )
    }
    override public fun `syncId`(): kotlin.String? {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `syncStarted`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineSyncStarted(
        uniffiArgLowered0,
    )
    }
    override public fun `wipe`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef83(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillCreditCardsBridgedEngineWipe(
        uniffiArgLowered0,
    )
    }
    
    

    companion object {
        
    }
}
// This template implements a class for working with a Rust struct via a handle
// to the live Rust struct on the other side of the FFI.
//
// There's some subtlety here, because we have to be careful not to operate on a Rust
// struct after it has been dropped, and because we must expose a public API for freeing
// theq Kotlin wrapper object in lieu of reliable finalizers. The core requirements are:
//
//   * Each instance holds an opaque handle to the underlying Rust struct.
//     Method calls need to read this handle from the object's state and pass it in to
//     the Rust FFI.
//
//   * When an instance is no longer needed, its handle should be passed to a
//     special destructor function provided by the Rust FFI, which will drop the
//     underlying Rust struct.
//
//   * Given an instance, calling code is expected to call the special
//     `destroy` method in order to free it after use, either by calling it explicitly
//     or by using a higher-level helper like the `use` method. Failing to do so risks
//     leaking the underlying Rust struct.
//
//   * We can't assume that calling code will do the right thing, and must be prepared
//     to handle Kotlin method calls executing concurrently with or even after a call to
//     `destroy`, and to handle multiple (possibly concurrent!) calls to `destroy`.
//
//   * We must never allow Rust code to operate on the underlying Rust struct after
//     the destructor has been called, and must never call the destructor more than once.
//     Doing so may trigger memory unsafety.
//
//   * To mitigate many of the risks of leaking memory and use-after-free unsafety, a `Cleaner`
//     is implemented to call the destructor when the Kotlin object becomes unreachable.
//     This is done in a background thread. This is not a panacea, and client code should be aware that
//      1. the thread may starve if some there are objects that have poorly performing
//     `drop` methods or do significant work in their `drop` methods.
//      2. the thread is shared across the whole library. This can be tuned by using `android_cleaner = true`,
//         or `android = true` in the [`kotlin` section of the `uniffi.toml` file](https://mozilla.github.io/uniffi-rs/kotlin/configuration.html).
//
// If we try to implement this with mutual exclusion on access to the handle, there is the
// possibility of a race between a method call and a concurrent call to `destroy`:
//
//    * Thread A starts a method call, reads the value of the handle, but is interrupted
//      before it can pass the handle over the FFI to Rust.
//    * Thread B calls `destroy` and frees the underlying Rust struct.
//    * Thread A resumes, passing the already-read handle value to Rust and triggering
//      a use-after-free.
//
// One possible solution would be to use a `ReadWriteLock`, with each method call taking
// a read lock (and thus allowed to run concurrently) and the special `destroy` method
// taking a write lock (and thus blocking on live method calls). However, we aim not to
// generate methods with any hidden blocking semantics, and a `destroy` method that might
// block if called incorrectly seems to meet that bar.
//
// So, we achieve our goals by giving each instance an associated `AtomicLong` counter to track
// the number of in-flight method calls, and an `AtomicBoolean` flag to indicate whether `destroy`
// has been called. These are updated according to the following rules:
//
//    * The initial value of the counter is 1, indicating a live object with no in-flight calls.
//      The initial value for the flag is false.
//
//    * At the start of each method call, we atomically check the counter.
//      If it is 0 then the underlying Rust struct has already been destroyed and the call is aborted.
//      If it is nonzero them we atomically increment it by 1 and proceed with the method call.
//
//    * At the end of each method call, we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
//    * When `destroy` is called, we atomically flip the flag from false to true.
//      If the flag was already true we silently fail.
//      Otherwise we atomically decrement and check the counter.
//      If it has reached zero then we destroy the underlying Rust struct.
//
// Astute readers may observe that this all sounds very similar to the way that Rust's `Arc<T>` works,
// and indeed it is, with the addition of a flag to guard against multiple calls to `destroy`.
//
// The overall effect is that the underlying Rust struct is destroyed only when `destroy` has been
// called *and* all in-flight method calls have completed, avoiding violating any of the expectations
// of the underlying Rust code.
//
// This makes a cleaner a better alternative to _not_ calling `destroy()` as
// and when the object is finished with, but the abstraction is not perfect: if the Rust object's `drop`
// method is slow, and/or there are many objects to cleanup, and it's on a low end Android device, then the cleaner
// thread may be starved, and the app will leak memory.
//
// In this case, `destroy`ing manually may be a better solution.
//
// The cleaner can live side by side with the manual calling of `destroy`. In the order of responsiveness, uniffi objects
// with Rust peers are reclaimed:
//
// 1. By calling the `destroy` method of the object, which calls `rustObject.free()`. If that doesn't happen:
// 2. When the object becomes unreachable, AND the Cleaner thread gets to call `rustObject.free()`. If the thread is starved then:
// 3. The memory is reclaimed when the process terminates.
//
// [1] https://stackoverflow.com/questions/24376768/can-java-finalize-an-object-when-it-is-still-in-scope/24380219

open class `Store` : StoreInterface, uniffi.Disposable, AutoCloseable {
    @Suppress("UNUSED_PARAMETER")
    /**
     * @suppress
     */
    constructor(withHandle: uniffi.WithHandle, uniffiHandle: kotlin.Long) {
        this.uniffiHandle = uniffiHandle
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     *
     * This constructor can be used to instantiate a fake object. Only used for tests. Any
     * attempt to actually use an object constructed this way will fail as there is no
     * connected Rust object.
     */
    @Suppress("UNUSED_PARAMETER")
    constructor(noHandle: uniffi.NoHandle) {
        this.uniffiHandle = 0
        this.uniffiCleanable = null
    }
    constructor(`dbpath`: kotlin.String , `encdec`: mozilla.appservices.db_crypto.`EncryptorDecryptor`) {
        
        val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerString(`dbpath`)
        val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType63(`encdec`)

        val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.constructorAutofillStoreNew(
            uniffiArgLowered0,
            uniffiArgLowered1,
        )
        this.uniffiHandle = uniffiReturn
        this.uniffiCleanable = uniffi.CLEANER.register(this, UniffiCleanAction(uniffiHandle))
    }

    /**
     * @suppress
     */
    public val uniffiHandle: kotlin.Long
    protected val uniffiCleanable: uniffi.Cleanable?

    private val wasDestroyed = java.util.concurrent.atomic.AtomicBoolean(false)
    private val callCounter = java.util.concurrent.atomic.AtomicLong(1)

    /**
     * Whether the current object has been destroyed and its reference is gone in the Rust side.
     */
    val uniffiIsDestroyed: kotlin.Boolean get() = wasDestroyed.get()

    override fun destroy() {
        // Only allow a single call to this method.
        // TODO: maybe we should log a warning if called more than once?
        if (this.wasDestroyed.compareAndSet(false, true)) {
            // This decrement always matches the initial count of 1 given at creation time.
            if (this.callCounter.decrementAndGet() == 0L) {
                uniffiCleanable?.clean()
            }
        }
    }

    @Synchronized
    override fun close() {
        this.destroy()
    }

    // Use a static inner class instead of a closure so as not to accidentally
    // capture `this` as part of the cleanable's action.
    private class UniffiCleanAction(private val uniffiHandle: kotlin.Long) : Runnable {
        override fun run() {
            if (uniffiHandle == 0.toLong()) {
                // Fake object created with `NoHandle`, don't try to free.
                return;
            }
            mozilla.appservices.autofill.uniffi.Scaffolding.objectFree55(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.autofill.uniffi.Scaffolding.objectCloneHandle55(uniffiHandle)
    }

    override public fun `addAddress`(`a`: mozilla.appservices.autofill.`UpdatableAddressFields`): mozilla.appservices.autofill.`Address` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType57(`a`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddAddress(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
    )
    return uniffiReturn

    }
    override public fun `addAddressWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`): mozilla.appservices.autofill.`Address` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType64(`entryWithMeta`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddAddressWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
        uniffiArgLowered1.v10,
        uniffiArgLowered1.v11,
        uniffiArgLowered1.v12,
        uniffiArgLowered1.v13,
        uniffiArgLowered1.v14,
        uniffiArgLowered1.v15,
        uniffiArgLowered1.v16,
    )
    return uniffiReturn

    }
    override public fun `addCreditCard`(`cc`: mozilla.appservices.autofill.`UpdatableCreditCardFields`): mozilla.appservices.autofill.`CreditCard` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType59(`cc`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddCreditCard(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
    )
    return uniffiReturn

    }
    override public fun `addCreditCardWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`): mozilla.appservices.autofill.`CreditCard` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType65(`entryWithMeta`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddCreditCardWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
        uniffiArgLowered1.v10,
        uniffiArgLowered1.v11,
        uniffiArgLowered1.v12,
    )
    return uniffiReturn

    }
    override public fun `addManyAddressTombstones`(`tombstones`: kotlin.collections.List<mozilla.appservices.autofill.`AddressTombstone`>): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkTombstoneResultEntry`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType66(`tombstones`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddManyAddressTombstones(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType68(uniffiReturn)
    }
    override public fun `addManyAddressesWithMeta`(`entriesWithMeta`: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`>): kotlin.collections.List<mozilla.appservices.autofill.`AddressBulkResultEntry`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType70(`entriesWithMeta`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddManyAddressesWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType71(uniffiReturn)
    }
    override public fun `addManyCreditCardTombstones`(`tombstones`: kotlin.collections.List<mozilla.appservices.autofill.`CreditCardTombstone`>): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkTombstoneResultEntry`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType73(`tombstones`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddManyCreditCardTombstones(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType75(uniffiReturn)
    }
    override public fun `addManyCreditCardsWithMeta`(`entriesWithMeta`: kotlin.collections.List<mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`>): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardBulkResultEntry`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType77(`entriesWithMeta`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddManyCreditCardsWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType78(uniffiReturn)
    }
    override public fun `addPassport`(`p`: mozilla.appservices.autofill.`UpdatablePassportFields`): mozilla.appservices.autofill.`Passport` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType80(`p`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddPassport(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
    )
    return uniffiReturn

    }
    override public fun `addressesBridgedEngine`(): mozilla.appservices.autofill.`AddressesBridgedEngine` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerType55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreAddressesBridgedEngine(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType82(uniffiReturn)
    }
    override public fun `countAllAddresses`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreCountAllAddresses(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftLong(uniffiReturn)
    }
    override public fun `countAllCreditCards`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreCountAllCreditCards(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftLong(uniffiReturn)
    }
    override public fun `countAllPassports`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreCountAllPassports(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftLong(uniffiReturn)
    }
    override public fun `creditCardsBridgedEngine`(): mozilla.appservices.autofill.`CreditCardsBridgedEngine` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerType55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreCreditCardsBridgedEngine(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType83(uniffiReturn)
    }
    override public fun `deleteAddress`(`guid`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreDeleteAddress(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `deleteAllAddresses`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreDeleteAllAddresses(
        uniffiArgLowered0,
    )
    }
    override public fun `deleteAllCreditCards`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreDeleteAllCreditCards(
        uniffiArgLowered0,
    )
    }
    override public fun `deleteCreditCard`(`guid`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreDeleteCreditCard(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `deletePassport`(`guid`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreDeletePassport(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `getAddress`(`guid`: kotlin.String): mozilla.appservices.autofill.`Address` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreGetAddress(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getAllAddresses`(): kotlin.collections.List<mozilla.appservices.autofill.`Address`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreGetAllAddresses(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType84(uniffiReturn)
    }
    override public fun `getAllCreditCards`(): kotlin.collections.List<mozilla.appservices.autofill.`CreditCard`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreGetAllCreditCards(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType85(uniffiReturn)
    }
    override public fun `getAllPassports`(): kotlin.collections.List<mozilla.appservices.autofill.`Passport`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreGetAllPassports(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType86(uniffiReturn)
    }
    override public fun `getCreditCard`(`guid`: kotlin.String): mozilla.appservices.autofill.`CreditCard` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreGetCreditCard(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getPassport`(`guid`: kotlin.String): mozilla.appservices.autofill.`Passport` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreGetPassport(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `listCreditCardCandidates`(): kotlin.collections.List<mozilla.appservices.autofill.`CreditCardCandidate`> {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreListCreditCardCandidates(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType87(uniffiReturn)
    }
    override public fun `registerWithSyncManager`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerType55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreRegisterWithSyncManager(
        uniffiArgLowered0,
    )
    }
    override public fun `runMaintenance`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreRunMaintenance(
        uniffiArgLowered0,
    )
    }
    override public fun `scrubEncryptedData`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerType55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreScrubEncryptedData(
        uniffiArgLowered0,
    )
    }
    override public fun `scrubUndecryptableCreditCardDataForRemoteReplacement`(): mozilla.appservices.autofill.`CreditCardsDeletionMetrics` {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerType55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreScrubUndecryptableCreditCardDataForRemoteReplacement(
        uniffiArgLowered0,
    )
    return mozilla.appservices.autofill.uniffi.liftType89(uniffiReturn)
    }
    override public fun `shutdown`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreShutdown(
        uniffiArgLowered0,
    )
    }
    override public fun `touchAddress`(`guid`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreTouchAddress(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `touchCreditCard`(`guid`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreTouchCreditCard(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `touchPassport`(`guid`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreTouchPassport(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `updateAddress`(`guid`: kotlin.String, `a`: mozilla.appservices.autofill.`UpdatableAddressFields`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)
    val uniffiArgLowered2 = mozilla.appservices.autofill.uniffi.lowerType57(`a`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreUpdateAddress(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
        uniffiArgLowered2.v2,
        uniffiArgLowered2.v3,
        uniffiArgLowered2.v4,
        uniffiArgLowered2.v5,
        uniffiArgLowered2.v6,
        uniffiArgLowered2.v7,
        uniffiArgLowered2.v8,
        uniffiArgLowered2.v9,
    )
    }
    override public fun `updateAddressWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableAddressFieldsWithMeta`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType64(`entryWithMeta`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreUpdateAddressWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
        uniffiArgLowered1.v10,
        uniffiArgLowered1.v11,
        uniffiArgLowered1.v12,
        uniffiArgLowered1.v13,
        uniffiArgLowered1.v14,
        uniffiArgLowered1.v15,
        uniffiArgLowered1.v16,
    )
    }
    override public fun `updateCreditCard`(`guid`: kotlin.String, `cc`: mozilla.appservices.autofill.`UpdatableCreditCardFields`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)
    val uniffiArgLowered2 = mozilla.appservices.autofill.uniffi.lowerType59(`cc`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreUpdateCreditCard(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
        uniffiArgLowered2.v2,
        uniffiArgLowered2.v3,
        uniffiArgLowered2.v4,
        uniffiArgLowered2.v5,
    )
    }
    override public fun `updateCreditCardWithMeta`(`entryWithMeta`: mozilla.appservices.autofill.`UpdatableCreditCardFieldsWithMeta`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerType65(`entryWithMeta`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreUpdateCreditCardWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
        uniffiArgLowered1.v8,
        uniffiArgLowered1.v9,
        uniffiArgLowered1.v10,
        uniffiArgLowered1.v11,
        uniffiArgLowered1.v12,
    )
    }
    override public fun `updatePassport`(`guid`: kotlin.String, `p`: mozilla.appservices.autofill.`UpdatablePassportFields`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerObjectRef55(this)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`guid`)
    val uniffiArgLowered2 = mozilla.appservices.autofill.uniffi.lowerType80(`p`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.methodAutofillStoreUpdatePassport(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
        uniffiArgLowered2.v2,
        uniffiArgLowered2.v3,
        uniffiArgLowered2.v4,
        uniffiArgLowered2.v5,
        uniffiArgLowered2.v6,
        uniffiArgLowered2.v7,
        uniffiArgLowered2.v8,
    )
    }
    
    

    companion object {
        
    }
}
public fun `createAutofillKey`(): kotlin.String {

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.functionAutofillCreateAutofillKey(
    )
    return mozilla.appservices.autofill.uniffi.liftString(uniffiReturn)
}
public fun `createAutofillStoreWithStaticKeyManager`(`path`: kotlin.String , `key`: kotlin.String): mozilla.appservices.autofill.`Store` {
    val uniffiArgLowered0 = mozilla.appservices.autofill.uniffi.lowerString(`path`)
    val uniffiArgLowered1 = mozilla.appservices.autofill.uniffi.lowerString(`key`)

    val uniffiReturn = mozilla.appservices.autofill.uniffi.Scaffolding.functionAutofillCreateAutofillStoreWithStaticKeyManager(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.autofill.uniffi.liftType55(uniffiReturn)
}