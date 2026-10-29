package mozilla.appservices.remotetabs
public interface `RemoteCommandStoreInterface` {
    fun `addRemoteCommand`(`deviceId`: kotlin.String , `command`: mozilla.appservices.remotetabs.`RemoteCommand`): kotlin.Boolean
    
    fun `addRemoteCommandAt`(`deviceId`: kotlin.String , `command`: mozilla.appservices.remotetabs.`RemoteCommand` , `when`: mozilla.appservices.remotetabs.`Timestamp`): kotlin.Boolean
    
    fun `getUnsentCommands`(): kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`>
    
    fun `removeRemoteCommand`(`deviceId`: kotlin.String , `command`: mozilla.appservices.remotetabs.`RemoteCommand`): kotlin.Boolean
    
    fun `setPendingCommandSent`(`command`: mozilla.appservices.remotetabs.`PendingCommand`): kotlin.Boolean
    
}
public interface `TabsBridgedEngineInterface` {
    fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String>
    
    fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String
    
    fun `lastSync`(): kotlin.Long
    
    fun `reset`(): Unit
    
    fun `resetLastSync`(): Unit
    
    fun `resetSyncId`(): kotlin.String
    
    fun `setClients`(`clientData`: kotlin.String): Unit
    
    fun `setUploaded`(`newTimestamp`: kotlin.Long , `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit
    
    fun `syncFinished`(): Unit
    
    fun `syncId`(): kotlin.String?
    
    fun `syncStarted`(): Unit
    
    fun `wipe`(): Unit
    
}
public interface `TabsStoreInterface` {
    fun `bridgedEngine`(): mozilla.appservices.remotetabs.`TabsBridgedEngine`
    
    fun `closeConnection`(): Unit
    
    fun `getAll`(): kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`>
    
    fun `newRemoteCommandStore`(): mozilla.appservices.remotetabs.`RemoteCommandStore`
    
    fun `registerWithSyncManager`(): Unit
    
    fun `setLocalTabs`(`remoteTabs`: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>): Unit
    
    fun `setLocalTabsInfo`(`info`: mozilla.appservices.remotetabs.`LocalTabsInfo`): Unit
    
}

data class `RemoteTabRecord` (
    var `title`: kotlin.String,
    var `urlHistory`: kotlin.collections.List<kotlin.String>,
    var `icon`: kotlin.String?,
    var `lastUsed`: kotlin.Long,
    var `inactive`: kotlin.Boolean = false,
    var `pinned`: kotlin.Boolean = false,
    var `index`: kotlin.UInt = 0u,
    var `windowId`: kotlin.String = "",
    var `tabGroupId`: kotlin.String = "",
) {
    

    companion object
}

data class `TabGroup` (
    var `id`: kotlin.String,
    var `name`: kotlin.String,
    var `color`: kotlin.String,
    var `collapsed`: kotlin.Boolean,
) {
    

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `Timestamp` = kotlin.Long

enum class `WindowType`(val value: kotlin.UByte) {
    `NORMAL`(0.toUByte());

    companion object
}

data class `Window` (
    var `id`: kotlin.String,
    var `lastUsed`: mozilla.appservices.remotetabs.`Timestamp`,
    var `index`: kotlin.UInt,
    var `windowType`: mozilla.appservices.remotetabs.`WindowType`,
) {
    

    companion object
}

data class `ClientRemoteTabs` (
    var `clientId`: kotlin.String,
    var `clientName`: kotlin.String,
    var `deviceType`: mozilla.appservices.sync15.`DeviceType`,
    var `lastModified`: kotlin.Long,
    var `remoteTabs`: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>,
    var `tabGroups`: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`TabGroup`>,
    var `windows`: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`Window`>,
) {
    

    companion object
}

data class `LocalTabsInfo` (
    var `tabs`: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>,
    var `tabGroups`: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`TabGroup`>,
    var `windows`: kotlin.collections.Map<kotlin.String, mozilla.appservices.remotetabs.`Window`>,
) {
    

    companion object
}

sealed class `RemoteCommand` {
    data class `CloseTab`(val `url`: kotlin.String,) : `RemoteCommand`()
    
    

    companion object
}

data class `PendingCommand` (
    var `deviceId`: kotlin.String,
    var `command`: mozilla.appservices.remotetabs.`RemoteCommand`,
    var `timeRequested`: mozilla.appservices.remotetabs.`Timestamp`,
    var `timeSent`: mozilla.appservices.remotetabs.`Timestamp`?,
) {
    

    companion object
}

sealed class `TabsApiException` : Exception() {
    
    class `SyncException`(val `reason`: kotlin.String,) : `TabsApiException`()
    
    
    class `SqlException`(val `reason`: kotlin.String,) : `TabsApiException`()
    
    
    class `UnexpectedTabsException`(val `reason`: kotlin.String,) : `TabsApiException`()
    
    
    

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

open class `RemoteCommandStore` : RemoteCommandStoreInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.remotetabs.uniffi.Scaffolding.objectFree445(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.remotetabs.uniffi.Scaffolding.objectCloneHandle445(uniffiHandle)
    }

    override public fun `addRemoteCommand`(`deviceId`: kotlin.String, `command`: mozilla.appservices.remotetabs.`RemoteCommand`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef445(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerString(`deviceId`)
    val uniffiArgLowered2 = mozilla.appservices.remotetabs.uniffi.lowerType435(`command`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsRemoteCommandStoreAddRemoteCommand(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
    )
    return mozilla.appservices.remotetabs.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `addRemoteCommandAt`(`deviceId`: kotlin.String, `command`: mozilla.appservices.remotetabs.`RemoteCommand`, `when`: mozilla.appservices.remotetabs.`Timestamp`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef445(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerString(`deviceId`)
    val uniffiArgLowered2 = mozilla.appservices.remotetabs.uniffi.lowerType435(`command`)
    val uniffiArgLowered3 = mozilla.appservices.remotetabs.uniffi.lowerType436(`when`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsRemoteCommandStoreAddRemoteCommandAt(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
        uniffiArgLowered3,
    )
    return mozilla.appservices.remotetabs.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `getUnsentCommands`(): kotlin.collections.List<mozilla.appservices.remotetabs.`PendingCommand`> {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef445(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsRemoteCommandStoreGetUnsentCommands(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftType440(uniffiReturn)
    }
    override public fun `removeRemoteCommand`(`deviceId`: kotlin.String, `command`: mozilla.appservices.remotetabs.`RemoteCommand`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef445(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerString(`deviceId`)
    val uniffiArgLowered2 = mozilla.appservices.remotetabs.uniffi.lowerType435(`command`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsRemoteCommandStoreRemoveRemoteCommand(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
    )
    return mozilla.appservices.remotetabs.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `setPendingCommandSent`(`command`: mozilla.appservices.remotetabs.`PendingCommand`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef445(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerType441(`command`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsRemoteCommandStoreSetPendingCommandSent(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
    )
    return mozilla.appservices.remotetabs.uniffi.liftBoolean(uniffiReturn)
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

open class `TabsBridgedEngine` : TabsBridgedEngineInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.remotetabs.uniffi.Scaffolding.objectFree442(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.remotetabs.uniffi.Scaffolding.objectCloneHandle442(uniffiHandle)
    }

    override public fun `apply`(`serverModifiedMillis`: kotlin.Long): kotlin.collections.List<kotlin.String> {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerLong(`serverModifiedMillis`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineApply(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.remotetabs.uniffi.liftType16(uniffiReturn)
    }
    override public fun `ensureCurrentSyncId`(`newSyncId`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerString(`newSyncId`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineEnsureCurrentSyncId(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.remotetabs.uniffi.liftString(uniffiReturn)
    }
    override public fun `lastSync`(): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineLastSync(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftLong(uniffiReturn)
    }
    override public fun `reset`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineReset(
        uniffiArgLowered0,
    )
    }
    override public fun `resetLastSync`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineResetLastSync(
        uniffiArgLowered0,
    )
    }
    override public fun `resetSyncId`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineResetSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftString(uniffiReturn)
    }
    override public fun `setClients`(`clientData`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerString(`clientData`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineSetClients(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setUploaded`(`newTimestamp`: kotlin.Long, `uploadedIds`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerLong(`newTimestamp`)
    val uniffiArgLowered2 = mozilla.appservices.remotetabs.uniffi.lowerType16(`uploadedIds`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineSetUploaded(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `storeIncoming`(`incomingEnvelopesAsJson`: kotlin.collections.List<kotlin.String>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerType16(`incomingEnvelopesAsJson`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineStoreIncoming(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `syncFinished`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineSyncFinished(
        uniffiArgLowered0,
    )
    }
    override public fun `syncId`(): kotlin.String? {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineSyncId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `syncStarted`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineSyncStarted(
        uniffiArgLowered0,
    )
    }
    override public fun `wipe`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef442(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsBridgedEngineWipe(
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

open class `TabsStore` : TabsStoreInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`path`: kotlin.String) {
        
        val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerString(`path`)

        val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.constructorTabsTabsStoreNew(
            uniffiArgLowered0,
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
            mozilla.appservices.remotetabs.uniffi.Scaffolding.objectFree7588(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.remotetabs.uniffi.Scaffolding.objectCloneHandle7588(uniffiHandle)
    }

    override public fun `bridgedEngine`(): mozilla.appservices.remotetabs.`TabsBridgedEngine` {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerType7588(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreBridgedEngine(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftType442(uniffiReturn)
    }
    override public fun `closeConnection`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef7588(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreCloseConnection(
        uniffiArgLowered0,
    )
    }
    override public fun `getAll`(): kotlin.collections.List<mozilla.appservices.remotetabs.`ClientRemoteTabs`> {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef7588(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreGetAll(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftType443(uniffiReturn)
    }
    override public fun `newRemoteCommandStore`(): mozilla.appservices.remotetabs.`RemoteCommandStore` {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerType7588(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreNewRemoteCommandStore(
        uniffiArgLowered0,
    )
    return mozilla.appservices.remotetabs.uniffi.liftType445(uniffiReturn)
    }
    override public fun `registerWithSyncManager`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerType7588(this)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreRegisterWithSyncManager(
        uniffiArgLowered0,
    )
    }
    override public fun `setLocalTabs`(`remoteTabs`: kotlin.collections.List<mozilla.appservices.remotetabs.`RemoteTabRecord`>): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef7588(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerType429(`remoteTabs`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreSetLocalTabs(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setLocalTabsInfo`(`info`: mozilla.appservices.remotetabs.`LocalTabsInfo`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.remotetabs.uniffi.lowerObjectRef7588(this)
    val uniffiArgLowered1 = mozilla.appservices.remotetabs.uniffi.lowerType446(`info`)

    val uniffiReturn = mozilla.appservices.remotetabs.uniffi.Scaffolding.methodTabsTabsStoreSetLocalTabsInfo(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
    )
    }
    
    

    companion object {
        
    }
}