package mozilla.appservices.fxaclient
public interface `FirefoxAccountInterface` {
    fun `authorizeCodeUsingSessionToken`(`params`: mozilla.appservices.fxaclient.`AuthorizationParameters`): kotlin.String
    
    fun `checkAuthorizationStatus`(): mozilla.appservices.fxaclient.`AuthorizationInfo`
    
    fun `clearAccessTokenCache`(): Unit
    
    fun `clearDeviceName`(): Unit
    
    fun `closeTabs`(`targetDeviceId`: kotlin.String , `urls`: kotlin.collections.List<kotlin.String>): mozilla.appservices.fxaclient.`CloseTabsResult`
    
    fun `disconnect`(): Unit
    
    fun `ensureCapabilities`(`supportedCapabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>): mozilla.appservices.fxaclient.`LocalDevice`
    
    fun `gatherTelemetry`(): kotlin.String
    
    fun `getAccessToken`(`scope`: kotlin.String , `useCache`: kotlin.Boolean = true): mozilla.appservices.fxaclient.`AccessTokenInfo`
    
    fun `getAttachedClients`(): kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`>
    
    fun `getAuthState`(): mozilla.appservices.fxaclient.`FxaRustAuthState`
    
    fun `getConnectionSuccessUrl`(): kotlin.String
    
    fun `getCurrentDeviceId`(): kotlin.String
    
    fun `getDevices`(`ignoreCache`: kotlin.Boolean): kotlin.collections.List<mozilla.appservices.fxaclient.`Device`>
    
    fun `getManageAccountUrl`(`entrypoint`: kotlin.String): kotlin.String
    
    fun `getManageDevicesUrl`(`entrypoint`: kotlin.String): kotlin.String
    
    fun `getPairingAuthorityUrl`(): kotlin.String
    
    fun `getProfile`(`ignoreCache`: kotlin.Boolean): mozilla.appservices.fxaclient.`Profile`
    
    fun `getSessionToken`(): kotlin.String
    
    fun `getSignedInUserForWebChannel`(): kotlin.String?
    
    fun `getState`(): mozilla.appservices.fxaclient.`FxaState`
    
    fun `getTokenServerEndpointUrl`(): kotlin.String
    
    fun `handlePushMessage`(`payload`: kotlin.String): mozilla.appservices.fxaclient.`AccountEvent`
    
    fun `handleSessionTokenChange`(`sessionToken`: kotlin.String): Unit
    
    fun `handleWebChannelLogin`(`jsonPayload`: kotlin.String): Unit
    
    fun `handleWebChannelPasswordChange`(`jsonPayload`: kotlin.String): Unit
    
    fun `hasScope`(`scope`: kotlin.String): kotlin.Boolean
    
    fun `initializeDevice`(`name`: kotlin.String , `deviceType`: mozilla.appservices.sync15.`DeviceType` , `supportedCapabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>): mozilla.appservices.fxaclient.`LocalDevice`
    
    fun `matchesServer`(`server`: mozilla.appservices.fxaclient.`FxaServer`): kotlin.Boolean
    
    fun `onAuthIssues`(): Unit
    
    fun `pollDeviceCommands`(): kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`>
    
    fun `processEvent`(`event`: mozilla.appservices.fxaclient.`FxaEvent`): mozilla.appservices.fxaclient.`FxaState`
    
    fun `resetAuthRecheckTimer`(): Unit
    
    fun `sendSingleTab`(`targetDeviceId`: kotlin.String , `title`: kotlin.String , `url`: kotlin.String , `isPrivate`: kotlin.Boolean = false): Unit
    
    fun `setDeviceName`(`displayName`: kotlin.String): mozilla.appservices.fxaclient.`LocalDevice`
    
    fun `setPushSubscription`(`subscription`: mozilla.appservices.fxaclient.`DevicePushSubscription`): mozilla.appservices.fxaclient.`LocalDevice`
    
    fun `simulateNetworkError`(): Unit
    
    fun `simulatePermanentAuthTokenIssue`(): Unit
    
    fun `simulateTemporaryAuthTokenIssue`(): Unit
    
    fun `toJson`(): kotlin.String
    
}

data class `ScopedKey` (
    var `kty`: kotlin.String,
    var `scope`: kotlin.String,
    var `k`: kotlin.String,
    var `kid`: kotlin.String,
) {
    

    companion object
}

data class `AccessTokenInfo` (
    var `scope`: kotlin.String,
    var `token`: kotlin.String,
    var `key`: mozilla.appservices.fxaclient.`ScopedKey`?,
    var `expiresAt`: kotlin.Long,
) {
    

    companion object
}

data class `AttachedClient` (
    var `clientId`: kotlin.String?,
    var `deviceId`: kotlin.String?,
    var `deviceType`: mozilla.appservices.sync15.`DeviceType`,
    var `isCurrentSession`: kotlin.Boolean,
    var `name`: kotlin.String?,
    var `createdTime`: kotlin.Long?,
    var `lastAccessTime`: kotlin.Long?,
    var `scope`: kotlin.collections.List<kotlin.String>?,
) {
    

    companion object
}

data class `AuthorizationInfo` (
    var `active`: kotlin.Boolean,
) {
    

    companion object
}

data class `AuthorizationParameters` (
    var `clientId`: kotlin.String,
    var `scope`: kotlin.collections.List<kotlin.String>,
    var `state`: kotlin.String,
    var `accessType`: kotlin.String,
    var `codeChallenge`: kotlin.String?,
    var `codeChallengeMethod`: kotlin.String?,
    var `keysJwk`: kotlin.String?,
) {
    

    companion object
}

data class `CloseTabsPayload` (
    var `urls`: kotlin.collections.List<kotlin.String>,
) {
    

    companion object
}

enum class `DeviceCapability` {
    `SEND_TAB`,`CLOSE_TABS`;

    companion object
}

data class `DevicePushSubscription` (
    var `endpoint`: kotlin.String,
    var `publicKey`: kotlin.String,
    var `authKey`: kotlin.String,
) {
    

    companion object
}

data class `Device` (
    var `id`: kotlin.String,
    var `displayName`: kotlin.String,
    var `deviceType`: mozilla.appservices.sync15.`DeviceType`,
    var `capabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>,
    var `pushSubscription`: mozilla.appservices.fxaclient.`DevicePushSubscription`?,
    var `pushEndpointExpired`: kotlin.Boolean,
    var `isCurrentDevice`: kotlin.Boolean,
    var `lastAccessTime`: kotlin.Long?,
) {
    

    companion object
}

data class `DeviceConfig` (
    var `name`: kotlin.String,
    var `deviceType`: mozilla.appservices.sync15.`DeviceType`,
    var `capabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>,
) {
    

    companion object
}

sealed class `FxaServer` {
    object `Release` : `FxaServer`()
    
    object `Stable` : `FxaServer`()
    
    object `Stage` : `FxaServer`()
    
    object `China` : `FxaServer`()
    
    object `LocalDev` : `FxaServer`()
    
    data class `Custom`(val `url`: kotlin.String,) : `FxaServer`()
    
    

    companion object
}

data class `FxaConfig` (
    var `server`: mozilla.appservices.fxaclient.`FxaServer`,
    var `clientId`: kotlin.String,
    var `redirectUri`: kotlin.String,
    var `tokenServerUrlOverride`: kotlin.String? = null,
) {
    

    companion object
}

data class `LocalDevice` (
    var `id`: kotlin.String,
    var `displayName`: kotlin.String,
    var `deviceType`: mozilla.appservices.sync15.`DeviceType`,
    var `capabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>,
    var `pushSubscription`: mozilla.appservices.fxaclient.`DevicePushSubscription`?,
    var `pushEndpointExpired`: kotlin.Boolean,
) {
    

    companion object
}

data class `Profile` (
    var `uid`: kotlin.String,
    var `email`: kotlin.String,
    var `displayName`: kotlin.String?,
    var `avatar`: kotlin.String,
    var `isDefaultAvatar`: kotlin.Boolean,
) {
    

    companion object
}

data class `TabHistoryEntry` (
    var `title`: kotlin.String,
    var `url`: kotlin.String,
    var `isPrivate`: kotlin.Boolean = false,
) {
    

    companion object
}

data class `SendTabPayload` (
    var `entries`: kotlin.collections.List<mozilla.appservices.fxaclient.`TabHistoryEntry`>,
    var `flowId`: kotlin.String = "",
    var `streamId`: kotlin.String = "",
) {
    

    companion object
}

sealed class `IncomingDeviceCommand` {
    data class `TabReceived`(val `sender`: mozilla.appservices.fxaclient.`Device`?,val `payload`: mozilla.appservices.fxaclient.`SendTabPayload`,) : `IncomingDeviceCommand`()
    data class `TabsClosed`(val `sender`: mozilla.appservices.fxaclient.`Device`?,val `payload`: mozilla.appservices.fxaclient.`CloseTabsPayload`,) : `IncomingDeviceCommand`()
    
    

    companion object
}

sealed class `AccountEvent` {
    data class `CommandReceived`(val `command`: mozilla.appservices.fxaclient.`IncomingDeviceCommand`,) : `AccountEvent`()
    object `ProfileUpdated` : `AccountEvent`()
    
    object `AccountAuthStateChanged` : `AccountEvent`()
    
    object `AccountDestroyed` : `AccountEvent`()
    
    data class `DeviceConnected`(val `deviceName`: kotlin.String,) : `AccountEvent`()
    data class `DeviceDisconnected`(val `deviceId`: kotlin.String,val `isLocalDevice`: kotlin.Boolean,) : `AccountEvent`()
    object `Unknown` : `AccountEvent`()
    
    
    

    companion object
}

sealed class `CloseTabsResult` {
    object `Ok` : `CloseTabsResult`()
    
    data class `TabsNotClosed`(val `urls`: kotlin.collections.List<kotlin.String>,) : `CloseTabsResult`()
    
    

    companion object
}

sealed class `FxaException`(message: kotlin.String) : kotlin.Exception(message) {
    class `Authentication`(message: kotlin.String) : `FxaException`(message)
    class `Forbidden`(message: kotlin.String) : `FxaException`(message)
    class `Network`(message: kotlin.String) : `FxaException`(message)
    class `NoExistingAuthFlow`(message: kotlin.String) : `FxaException`(message)
    class `WrongAuthFlow`(message: kotlin.String) : `FxaException`(message)
    class `OriginMismatch`(message: kotlin.String) : `FxaException`(message)
    class `SyncScopedKeyMissingInServerResponse`(message: kotlin.String) : `FxaException`(message)
    class `Panic`(message: kotlin.String) : `FxaException`(message)
    class `Other`(message: kotlin.String) : `FxaException`(message)

    companion object
}

sealed class `FxaEvent` {
    data class `Initialize`(val `deviceConfig`: mozilla.appservices.fxaclient.`DeviceConfig`,) : `FxaEvent`()
    data class `BeginOAuthFlow`(val `service`: kotlin.String,val `scopes`: kotlin.collections.List<kotlin.String>,val `entrypoint`: kotlin.String,) : `FxaEvent`()
    data class `BeginPairingFlow`(val `pairingUrl`: kotlin.String,val `service`: kotlin.String,val `scopes`: kotlin.collections.List<kotlin.String>,val `entrypoint`: kotlin.String,) : `FxaEvent`()
    data class `CompleteOAuthFlow`(val `code`: kotlin.String,val `state`: kotlin.String,) : `FxaEvent`()
    object `CancelOAuthFlow` : `FxaEvent`()
    
    object `CheckAuthorizationStatus` : `FxaEvent`()
    
    data class `WebChannelPasswordChange`(val `jsonPayload`: kotlin.String,) : `FxaEvent`()
    object `Disconnect` : `FxaEvent`()
    
    object `CallGetProfile` : `FxaEvent`()
    
    
    

    companion object
}

enum class `FxaRustAuthState` {
    `DISCONNECTED`,`CONNECTED`,`AUTH_ISSUES`;

    companion object
}

sealed class `FxaState` {
    object `Uninitialized` : `FxaState`()
    
    object `Disconnected` : `FxaState`()
    
    data class `Authenticating`(val `oauthUrl`: kotlin.String,val `initialState`: mozilla.appservices.fxaclient.`FxaRustAuthState`,) : `FxaState`()
    object `Connected` : `FxaState`()
    
    object `AuthIssues` : `FxaState`()
    
    
    

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

open class `FirefoxAccount` : FirefoxAccountInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`config`: mozilla.appservices.fxaclient.`FxaConfig`) {
        
        val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerType115(`config`)

        val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.constructorFxaClientFirefoxAccountNew(
            uniffiArgLowered0.v0,
            uniffiArgLowered0.v1,
            uniffiArgLowered0.v2,
            uniffiArgLowered0.v3,
            uniffiArgLowered0.v4,
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
            mozilla.appservices.fxaclient.uniffi.Scaffolding.objectFree2506(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.fxaclient.uniffi.Scaffolding.objectCloneHandle2506(uniffiHandle)
    }

    override public fun `authorizeCodeUsingSessionToken`(`params`: mozilla.appservices.fxaclient.`AuthorizationParameters`): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerType116(`params`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountAuthorizeCodeUsingSessionToken(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `checkAuthorizationStatus`(): mozilla.appservices.fxaclient.`AuthorizationInfo` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountCheckAuthorizationStatus(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftType117(uniffiReturn)
    }
    override public fun `clearAccessTokenCache`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountClearAccessTokenCache(
        uniffiArgLowered0,
    )
    }
    override public fun `clearDeviceName`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountClearDeviceName(
        uniffiArgLowered0,
    )
    }
    override public fun `closeTabs`(`targetDeviceId`: kotlin.String, `urls`: kotlin.collections.List<kotlin.String>): mozilla.appservices.fxaclient.`CloseTabsResult` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`targetDeviceId`)
    val uniffiArgLowered2 = mozilla.appservices.fxaclient.uniffi.lowerType16(`urls`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountCloseTabs(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return uniffiReturn

    }
    override public fun `disconnect`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountDisconnect(
        uniffiArgLowered0,
    )
    }
    override public fun `ensureCapabilities`(`supportedCapabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>): mozilla.appservices.fxaclient.`LocalDevice` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerType100(`supportedCapabilities`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountEnsureCapabilities(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `gatherTelemetry`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGatherTelemetry(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getAccessToken`(`scope`: kotlin.String, `useCache`: kotlin.Boolean): mozilla.appservices.fxaclient.`AccessTokenInfo` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`scope`)
    val uniffiArgLowered2 = mozilla.appservices.fxaclient.uniffi.lowerBoolean(`useCache`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetAccessToken(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return uniffiReturn

    }
    override public fun `getAttachedClients`(): kotlin.collections.List<mozilla.appservices.fxaclient.`AttachedClient`> {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetAttachedClients(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftType121(uniffiReturn)
    }
    override public fun `getAuthState`(): mozilla.appservices.fxaclient.`FxaRustAuthState` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetAuthState(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftType109(uniffiReturn)
    }
    override public fun `getConnectionSuccessUrl`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetConnectionSuccessUrl(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getCurrentDeviceId`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetCurrentDeviceId(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getDevices`(`ignoreCache`: kotlin.Boolean): kotlin.collections.List<mozilla.appservices.fxaclient.`Device`> {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerBoolean(`ignoreCache`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetDevices(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.fxaclient.uniffi.liftType123(uniffiReturn)
    }
    override public fun `getManageAccountUrl`(`entrypoint`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`entrypoint`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetManageAccountUrl(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getManageDevicesUrl`(`entrypoint`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`entrypoint`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetManageDevicesUrl(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getPairingAuthorityUrl`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetPairingAuthorityUrl(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getProfile`(`ignoreCache`: kotlin.Boolean): mozilla.appservices.fxaclient.`Profile` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerBoolean(`ignoreCache`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetProfile(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getSessionToken`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetSessionToken(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `getSignedInUserForWebChannel`(): kotlin.String? {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetSignedInUserForWebChannel(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `getState`(): mozilla.appservices.fxaclient.`FxaState` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetState(
        uniffiArgLowered0,
    )
    return uniffiReturn

    }
    override public fun `getTokenServerEndpointUrl`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountGetTokenServerEndpointUrl(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    override public fun `handlePushMessage`(`payload`: kotlin.String): mozilla.appservices.fxaclient.`AccountEvent` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`payload`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountHandlePushMessage(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `handleSessionTokenChange`(`sessionToken`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`sessionToken`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountHandleSessionTokenChange(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `handleWebChannelLogin`(`jsonPayload`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`jsonPayload`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountHandleWebChannelLogin(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `handleWebChannelPasswordChange`(`jsonPayload`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`jsonPayload`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountHandleWebChannelPasswordChange(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `hasScope`(`scope`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`scope`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountHasScope(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.fxaclient.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `initializeDevice`(`name`: kotlin.String, `deviceType`: mozilla.appservices.sync15.`DeviceType`, `supportedCapabilities`: kotlin.collections.List<mozilla.appservices.fxaclient.`DeviceCapability`>): mozilla.appservices.fxaclient.`LocalDevice` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`name`)
    val uniffiArgLowered2 = mozilla.appservices.fxaclient.uniffi.lowerType98(`deviceType`)
    val uniffiArgLowered3 = mozilla.appservices.fxaclient.uniffi.lowerType100(`supportedCapabilities`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountInitializeDevice(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
    )
    return uniffiReturn

    }
    override public fun `matchesServer`(`server`: mozilla.appservices.fxaclient.`FxaServer`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerType104(`server`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountMatchesServer(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    return mozilla.appservices.fxaclient.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `onAuthIssues`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountOnAuthIssues(
        uniffiArgLowered0,
    )
    }
    override public fun `pollDeviceCommands`(): kotlin.collections.List<mozilla.appservices.fxaclient.`IncomingDeviceCommand`> {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountPollDeviceCommands(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftType127(uniffiReturn)
    }
    override public fun `processEvent`(`event`: mozilla.appservices.fxaclient.`FxaEvent`): mozilla.appservices.fxaclient.`FxaState` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerType128(`event`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountProcessEvent(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered1.v7,
    )
    return uniffiReturn

    }
    override public fun `resetAuthRecheckTimer`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountResetAuthRecheckTimer(
        uniffiArgLowered0,
    )
    }
    override public fun `sendSingleTab`(`targetDeviceId`: kotlin.String, `title`: kotlin.String, `url`: kotlin.String, `isPrivate`: kotlin.Boolean): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`targetDeviceId`)
    val uniffiArgLowered2 = mozilla.appservices.fxaclient.uniffi.lowerString(`title`)
    val uniffiArgLowered3 = mozilla.appservices.fxaclient.uniffi.lowerString(`url`)
    val uniffiArgLowered4 = mozilla.appservices.fxaclient.uniffi.lowerBoolean(`isPrivate`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountSendSingleTab(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
        uniffiArgLowered4,
    )
    }
    override public fun `setDeviceName`(`displayName`: kotlin.String): mozilla.appservices.fxaclient.`LocalDevice` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerString(`displayName`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountSetDeviceName(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `setPushSubscription`(`subscription`: mozilla.appservices.fxaclient.`DevicePushSubscription`): mozilla.appservices.fxaclient.`LocalDevice` {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)
    val uniffiArgLowered1 = mozilla.appservices.fxaclient.uniffi.lowerType103(`subscription`)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountSetPushSubscription(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
    )
    return uniffiReturn

    }
    override public fun `simulateNetworkError`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountSimulateNetworkError(
        uniffiArgLowered0,
    )
    }
    override public fun `simulatePermanentAuthTokenIssue`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountSimulatePermanentAuthTokenIssue(
        uniffiArgLowered0,
    )
    }
    override public fun `simulateTemporaryAuthTokenIssue`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountSimulateTemporaryAuthTokenIssue(
        uniffiArgLowered0,
    )
    }
    override public fun `toJson`(): kotlin.String {
        
    val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerObjectRef2506(this)

    val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.methodFxaClientFirefoxAccountToJson(
        uniffiArgLowered0,
    )
    return mozilla.appservices.fxaclient.uniffi.liftString(uniffiReturn)
    }
    
    

    companion object {
        public fun `fromJson`(`data`: kotlin.String): mozilla.appservices.fxaclient.`FirefoxAccount` {
            
        val uniffiArgLowered0 = mozilla.appservices.fxaclient.uniffi.lowerString(`data`)

        val uniffiReturn = mozilla.appservices.fxaclient.uniffi.Scaffolding.constructorFxaClientFirefoxAccountFromJson(
            uniffiArgLowered0,
        )
        return mozilla.appservices.fxaclient.uniffi.liftType2506(uniffiReturn)
        }
        
    }
}