package mozilla.appservices.logins
public interface `LoginsBridgedEngineInterface` {
    fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String>
    
    fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String
    
    fun `lastSync`(): kotlin.Long
    
    fun `reset`(): Unit
    
    fun `resetLastSync`(): Unit
    
    fun `resetSyncId`(): kotlin.String
    
    fun `setUploaded`(`newTimestamp`: kotlin.Long , `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `syncFinished`(): Unit
    
    fun `syncId`(): kotlin.String?
    
    fun `syncStarted`(): Unit
    
    fun `wipe`(): Unit
    
}
public interface `LoginStoreInterface` {
    fun `add`(`login`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login`
    
    fun `addMany`(`logins`: kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`>): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`>
    
    fun `addManyWithMeta`(`entriesWithMeta`: kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`>): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`>
    
    fun `addOrUpdate`(`login`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login`
    
    fun `addWithMeta`(`entryWithMeta`: mozilla.appservices.logins.`LoginEntryWithMeta`): mozilla.appservices.logins.`Login`
    
    fun `arePotentiallyVulnerablePasswords`(`ids`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<kotlin.String>
    
    fun `bridgedEngine`(): mozilla.appservices.logins.`LoginsBridgedEngine`
    
    fun `count`(): kotlin.Long
    
    fun `countByFormActionOrigin`(`formActionOrigin`: kotlin.String): kotlin.Long
    
    fun `countByOrigin`(`origin`: kotlin.String): kotlin.Long
    
    fun `delete`(`id`: kotlin.String): kotlin.Boolean
    
    fun `deleteAll`(): kotlin.collections.List<kotlin.String>
    
    fun `deleteAllExceptFxa`(): kotlin.collections.List<kotlin.String>
    
    fun `deleteMany`(`ids`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<kotlin.Boolean>
    
    fun `deleteUndecryptableRecordsForRemoteReplacement`(): mozilla.appservices.logins.`LoginsDeletionMetrics`
    
    fun `findLoginToUpdate`(`look`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login`?
    
    fun `get`(`id`: kotlin.String): mozilla.appservices.logins.`Login`?
    
    fun `getByBaseDomain`(`baseDomain`: kotlin.String): kotlin.collections.List<mozilla.appservices.logins.`Login`>
    
    fun `getMany`(`ids`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<mozilla.appservices.logins.`Login`>
    
    fun `hasLoginsByBaseDomain`(`baseDomain`: kotlin.String): kotlin.Boolean
    
    fun `isEmpty`(): kotlin.Boolean
    
    fun `isPotentiallyVulnerablePassword`(`id`: kotlin.String): kotlin.Boolean
    
    fun `list`(): kotlin.collections.List<mozilla.appservices.logins.`Login`>
    
    fun `listCandidates`(): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`>
    
    fun `listCandidatesByOrigin`(`origins`: kotlin.collections.List<kotlin.String> , `domains`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`>
    
    fun `recordBreachAlertDismissal`(`id`: kotlin.String): Unit
    
    fun `recordBreachAlertDismissalTime`(`id`: kotlin.String , `timestamp`: kotlin.Long): Unit
    
    fun `recordPotentiallyVulnerablePasswords`(`passwords`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `registerWithSyncManager`(): Unit
    
    fun `reset`(): Unit
    
    fun `resetAllBreaches`(): Unit
    
    fun `runMaintenance`(`options`: mozilla.appservices.logins.`RunMaintenanceOptions`? = null): Unit
    
    fun `shutdown`(): Unit
    
    fun `touch`(`id`: kotlin.String): Unit
    
    fun `update`(`id`: kotlin.String , `login`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login`
    
    fun `wipeLocal`(): Unit
    
    fun `wipeLocalExceptFxa`(): Unit
    
}

data class `Login` (
    var `id`: kotlin.String,
    var `timesUsed`: kotlin.Long,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long,
    var `timePasswordChanged`: kotlin.Long,
    var `timeLastBreachAlertDismissed`: kotlin.Long?,
    var `origin`: kotlin.String,
    var `httpRealm`: kotlin.String?,
    var `formActionOrigin`: kotlin.String?,
    var `usernameField`: kotlin.String,
    var `passwordField`: kotlin.String,
    var `password`: kotlin.String,
    var `username`: kotlin.String,
) {
    

    companion object
}

data class `LoginCandidate` (
    var `id`: kotlin.String,
    var `timesUsed`: kotlin.Long,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long,
    var `timePasswordChanged`: kotlin.Long,
    var `timeLastBreachAlertDismissed`: kotlin.Long?,
    var `origin`: kotlin.String,
    var `httpRealm`: kotlin.String?,
    var `formActionOrigin`: kotlin.String?,
    var `usernameField`: kotlin.String,
    var `passwordField`: kotlin.String,
) {
    

    companion object
}

data class `LoginEntry` (
    var `origin`: kotlin.String,
    var `httpRealm`: kotlin.String?,
    var `formActionOrigin`: kotlin.String?,
    var `usernameField`: kotlin.String,
    var `passwordField`: kotlin.String,
    var `password`: kotlin.String,
    var `username`: kotlin.String,
) {
    

    companion object
}

data class `LoginMeta` (
    var `id`: kotlin.String,
    var `timesUsed`: kotlin.Long,
    var `timeCreated`: kotlin.Long,
    var `timeLastUsed`: kotlin.Long,
    var `timePasswordChanged`: kotlin.Long,
    var `timeLastBreachAlertDismissed`: kotlin.Long?,
) {
    

    companion object
}

data class `LoginEntryWithMeta` (
    var `entry`: mozilla.appservices.logins.`LoginEntry`,
    var `meta`: mozilla.appservices.logins.`LoginMeta`,
) {
    

    companion object
}

data class `LoginsDeletionMetrics` (
    var `localDeleted`: kotlin.ULong,
    var `mirrorDeleted`: kotlin.ULong,
) {
    

    companion object
}

data class `RunMaintenanceOptions` (
    var `deleteUndecryptableRecordsForRemoteReplacement`: kotlin.Boolean = true,
) {
    

    companion object
}

sealed class `BulkResultEntry` {
    data class `Success`(val `login`: mozilla.appservices.logins.`Login`,) : `BulkResultEntry`()
    data class `Error`(val `message`: kotlin.String,) : `BulkResultEntry`()
    
    

    companion object
}

enum class `LoginOrErrorMessage` {
    `LOGIN`,`STRING`;

    companion object
}

sealed class `LoginsApiException` : Exception() {
    
    class `NssUninitialized`() : `LoginsApiException`()
    
    
    class `NssAuthenticationException`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `AuthenticationException`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `AuthenticationCanceled`() : `LoginsApiException`()
    
    
    class `InvalidRecord`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `NoSuchRecord`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `MissingKey`() : `LoginsApiException`()
    
    
    class `InvalidKey`() : `LoginsApiException`()
    
    
    class `EncryptionFailed`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `DecryptionFailed`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `Interrupted`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    class `UnexpectedLoginsApiException`(val `reason`: kotlin.String,) : `LoginsApiException`()
    
    
    

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

open class `LoginsBridgedEngine` : LoginsBridgedEngineInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.logins.uniffi.Scaffolding.objectFree161(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.logins.uniffi.Scaffolding.objectCloneHandle161(uniffiHandle)
    }

    override public fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerLong(`serverModifiedMillis`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineApply(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType16(uniffiReturn)
    }
    override public fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`newSyncId`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineEnsureCurrentSyncId(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftString(uniffiReturn)
    }
    override public fun `lastSync`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineLastSync(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftLong(uniffiReturn)
    }
    override public fun `reset`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineReset(
        uniffiArgLowered0,
    )
    }
    override public fun `resetLastSync`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineResetLastSync(
        uniffiArgLowered0,
    )
    }
    override public fun `resetSyncId`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineResetSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftString(uniffiReturn)
    }
    override public fun `setUploaded`(`newTimestamp`: kotlin.Long, `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerLong(`newTimestamp`)
    val uniffiArgLowered2 = mozilla.appservices.logins.uniffi.lowerType16(`uploadedIds`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineSetUploaded(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType16(`incomingEnvelopesAsJson`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineStoreIncoming(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `syncFinished`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineSyncFinished(
        uniffiArgLowered0,
    )
    }
    override public fun `syncId`(): kotlin.String? {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `syncStarted`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineSyncStarted(
        uniffiArgLowered0,
    )
    }
    override public fun `wipe`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef161(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginsBridgedEngineWipe(
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

open class `LoginStore` : LoginStoreInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`path`: kotlin.String , `encdec`: mozilla.appservices.db_crypto.`EncryptorDecryptor`) {
        
        val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerString(`path`)
        val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType63(`encdec`)

        val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.constructorLoginsLoginStoreNew(
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
            mozilla.appservices.logins.uniffi.Scaffolding.objectFree151(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.logins.uniffi.Scaffolding.objectCloneHandle151(uniffiHandle)
    }

    override public fun `add`(`login`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login` {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType152(`login`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreAdd(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
    )
    return uniffiReturn

    }
    override public fun `addMany`(`logins`: kotlin.collections.List<mozilla.appservices.logins.`LoginEntry`>): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType156(`logins`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreAddMany(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType157(uniffiReturn)
    }
    override public fun `addManyWithMeta`(`entriesWithMeta`: kotlin.collections.List<mozilla.appservices.logins.`LoginEntryWithMeta`>): kotlin.collections.List<mozilla.appservices.logins.`BulkResultEntry`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType159(`entriesWithMeta`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreAddManyWithMeta(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType157(uniffiReturn)
    }
    override public fun `addOrUpdate`(`login`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login` {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType152(`login`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreAddOrUpdate(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
    )
    return uniffiReturn

    }
    override public fun `addWithMeta`(`entryWithMeta`: mozilla.appservices.logins.`LoginEntryWithMeta`): mozilla.appservices.logins.`Login` {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType160(`entryWithMeta`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreAddWithMeta(
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
    )
    return uniffiReturn

    }
    override public fun `arePotentiallyVulnerablePasswords`(`ids`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType16(`ids`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreArePotentiallyVulnerablePasswords(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType16(uniffiReturn)
    }
    override public fun `bridgedEngine`(): mozilla.appservices.logins.`LoginsBridgedEngine` {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerType151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreBridgedEngine(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftType161(uniffiReturn)
    }
    override public fun `count`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreCount(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftLong(uniffiReturn)
    }
    override public fun `countByFormActionOrigin`(`formActionOrigin`: kotlin.String): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`formActionOrigin`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreCountByFormActionOrigin(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftLong(uniffiReturn)
    }
    override public fun `countByOrigin`(`origin`: kotlin.String): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`origin`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreCountByOrigin(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftLong(uniffiReturn)
    }
    override public fun `delete`(`id`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreDelete(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `deleteAll`(): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreDeleteAll(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftType16(uniffiReturn)
    }
    override public fun `deleteAllExceptFxa`(): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreDeleteAllExceptFxa(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftType16(uniffiReturn)
    }
    override public fun `deleteMany`(`ids`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<kotlin.Boolean> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerType151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType16(`ids`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreDeleteMany(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType162(uniffiReturn)
    }
    override public fun `deleteUndecryptableRecordsForRemoteReplacement`(): mozilla.appservices.logins.`LoginsDeletionMetrics` {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerType151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreDeleteUndecryptableRecordsForRemoteReplacement(
        uniffiArgLowered0,
    )
    return uniffiReturn

    }
    override public fun `findLoginToUpdate`(`look`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login`? {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType152(`look`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreFindLoginToUpdate(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
    )
    return uniffiReturn

    }
    override public fun `get`(`id`: kotlin.String): mozilla.appservices.logins.`Login`? {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreGet(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getByBaseDomain`(`baseDomain`: kotlin.String): kotlin.collections.List<mozilla.appservices.logins.`Login`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`baseDomain`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreGetByBaseDomain(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType165(uniffiReturn)
    }
    override public fun `getMany`(`ids`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<mozilla.appservices.logins.`Login`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType16(`ids`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreGetMany(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType165(uniffiReturn)
    }
    override public fun `hasLoginsByBaseDomain`(`baseDomain`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`baseDomain`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreHasLoginsByBaseDomain(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `isEmpty`(): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreIsEmpty(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `isPotentiallyVulnerablePassword`(`id`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreIsPotentiallyVulnerablePassword(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `list`(): kotlin.collections.List<mozilla.appservices.logins.`Login`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreList(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftType165(uniffiReturn)
    }
    override public fun `listCandidates`(): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreListCandidates(
        uniffiArgLowered0,
    )
    return mozilla.appservices.logins.uniffi.liftType166(uniffiReturn)
    }
    override public fun `listCandidatesByOrigin`(`origins`: kotlin.collections.List<kotlin.String>, `domains`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<mozilla.appservices.logins.`LoginCandidate`> {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType16(`origins`)
    val uniffiArgLowered2 = mozilla.appservices.logins.uniffi.lowerType16(`domains`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreListCandidatesByOrigin(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.logins.uniffi.liftType166(uniffiReturn)
    }
    override public fun `recordBreachAlertDismissal`(`id`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreRecordBreachAlertDismissal(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `recordBreachAlertDismissalTime`(`id`: kotlin.String, `timestamp`: kotlin.Long): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)
    val uniffiArgLowered2 = mozilla.appservices.logins.uniffi.lowerLong(`timestamp`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreRecordBreachAlertDismissalTime(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `recordPotentiallyVulnerablePasswords`(`passwords`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType16(`passwords`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreRecordPotentiallyVulnerablePasswords(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `registerWithSyncManager`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerType151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreRegisterWithSyncManager(
        uniffiArgLowered0,
    )
    }
    override public fun `reset`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerType151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreReset(
        uniffiArgLowered0,
    )
    }
    override public fun `resetAllBreaches`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreResetAllBreaches(
        uniffiArgLowered0,
    )
    }
    override public fun `runMaintenance`(`options`: mozilla.appservices.logins.`RunMaintenanceOptions`?): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerType168(`options`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreRunMaintenance(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    }
    override public fun `shutdown`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerType151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreShutdown(
        uniffiArgLowered0,
    )
    }
    override public fun `touch`(`id`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreTouch(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `update`(`id`: kotlin.String, `login`: mozilla.appservices.logins.`LoginEntry`): mozilla.appservices.logins.`Login` {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`id`)
    val uniffiArgLowered2 = mozilla.appservices.logins.uniffi.lowerType152(`login`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreUpdate(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
        uniffiArgLowered2.v2,
        uniffiArgLowered2.v3,
        uniffiArgLowered2.v4,
        uniffiArgLowered2.v5,
        uniffiArgLowered2.v6,
    )
    return uniffiReturn

    }
    override public fun `wipeLocal`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreWipeLocal(
        uniffiArgLowered0,
    )
    }
    override public fun `wipeLocalExceptFxa`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerObjectRef151(this)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.methodLoginsLoginStoreWipeLocalExceptFxa(
        uniffiArgLowered0,
    )
    }
    
    

    companion object {
        
    }
}
public fun `createLoginStoreWithStaticKeyManager`(`path`: kotlin.String , `key`: kotlin.String): mozilla.appservices.logins.`LoginStore` {
    val uniffiArgLowered0 = mozilla.appservices.logins.uniffi.lowerString(`path`)
    val uniffiArgLowered1 = mozilla.appservices.logins.uniffi.lowerString(`key`)

    val uniffiReturn = mozilla.appservices.logins.uniffi.Scaffolding.functionLoginsCreateLoginStoreWithStaticKeyManager(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.logins.uniffi.liftType151(uniffiReturn)
}