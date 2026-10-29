package mozilla.appservices.search
public interface `SearchEngineSelectorInterface` {
    fun `filterEngineConfiguration`(`userEnvironment`: mozilla.appservices.search.`SearchUserEnvironment`): mozilla.appservices.search.`RefinedSearchConfig`
    
    fun `filterEngineConfigurationV3`(`userEnvironment`: mozilla.appservices.search.`SearchUserEnvironmentV3`): mozilla.appservices.search.`RefinedSearchConfigV3`
    
    fun `setConfigOverrides`(`overrides`: kotlin.String): Unit
    
    fun `setSearchConfig`(`configuration`: kotlin.String): Unit
    
    fun `setSearchConfigV3`(`configuration`: kotlin.String): Unit
    
    fun `useRemoteSettingsServer`(`service`: mozilla.appservices.remotesettings.`RemoteSettingsService` , `applyEngineOverrides`: kotlin.Boolean): Unit
    
    fun `useRemoteSettingsServerV3`(`service`: mozilla.appservices.remotesettings.`RemoteSettingsService`): Unit
    
}

enum class `JsonEngineMethod` {
    `POST`,`GET`;

    companion object
}

data class `SearchUrlParam` (
    var `name`: kotlin.String,
    var `value`: kotlin.String?,
    var `enterpriseValue`: kotlin.String?,
    var `experimentConfig`: kotlin.String?,
) {
    

    companion object
}

data class `JsonEngineUrl` (
    var `base`: kotlin.String?,
    var `method`: mozilla.appservices.search.`JsonEngineMethod`?,
    var `params`: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>?,
    var `searchTermParamName`: kotlin.String?,
    var `displayNameMap`: kotlin.collections.Map<kotlin.String, kotlin.String>?,
    var `isNewUntil`: kotlin.String?,
    var `excludePartnerCodeFromTelemetry`: kotlin.Boolean,
    var `acceptedContentTypes`: kotlin.collections.List<kotlin.String>?,
) {
    

    companion object
}

data class `JsonEngineUrls` (
    var `search`: mozilla.appservices.search.`JsonEngineUrl`?,
    var `suggestions`: mozilla.appservices.search.`JsonEngineUrl`?,
    var `trending`: mozilla.appservices.search.`JsonEngineUrl`?,
    var `searchForm`: mozilla.appservices.search.`JsonEngineUrl`?,
    var `visualSearch`: mozilla.appservices.search.`JsonEngineUrl`?,
) {
    

    companion object
}

enum class `SearchEngineClassification` {
    `GENERAL`,`UNKNOWN`;

    companion object
}

data class `SearchEngineUrl` (
    var `base`: kotlin.String,
    var `method`: kotlin.String,
    var `params`: kotlin.collections.List<mozilla.appservices.search.`SearchUrlParam`>,
    var `searchTermParamName`: kotlin.String?,
    var `displayName`: kotlin.String? = null,
    var `isNewUntil`: kotlin.String? = null,
    var `excludePartnerCodeFromTelemetry`: kotlin.Boolean = false,
    var `acceptedContentTypes`: kotlin.collections.List<kotlin.String>? = null,
) {
    

    companion object
}

data class `SearchEngineUrls` (
    var `search`: mozilla.appservices.search.`SearchEngineUrl`,
    var `suggestions`: mozilla.appservices.search.`SearchEngineUrl`?,
    var `trending`: mozilla.appservices.search.`SearchEngineUrl`?,
    var `searchForm`: mozilla.appservices.search.`SearchEngineUrl`?,
    var `visualSearch`: mozilla.appservices.search.`SearchEngineUrl`?,
) {
    

    companion object
}

data class `SearchEngineDefinition` (
    var `aliases`: kotlin.collections.List<kotlin.String>,
    var `charset`: kotlin.String,
    var `classification`: mozilla.appservices.search.`SearchEngineClassification`,
    var `identifier`: kotlin.String,
    var `isNewUntil`: kotlin.String?,
    var `name`: kotlin.String,
    var `optional`: kotlin.Boolean,
    var `partnerCode`: kotlin.String,
    var `telemetrySuffix`: kotlin.String,
    var `urls`: mozilla.appservices.search.`SearchEngineUrls`,
    var `orderHint`: kotlin.UInt?,
    var `clickUrl`: kotlin.String?,
) {
    

    companion object
}

data class `RefinedSearchConfig` (
    var `engines`: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinition`>,
    var `appDefaultEngineId`: kotlin.String?,
    var `appPrivateDefaultEngineId`: kotlin.String?,
) {
    

    companion object
}

enum class `SearchEngineClassificationV3` {
    `AI`,`GENERAL`,`UNKNOWN`;

    companion object
}

data class `SearchEnginePartnerDetails` (
    var `code`: kotlin.String?,
    var `telemetrySuffix`: kotlin.String?,
) {
    

    companion object
}

data class `SearchEngineDefinitionV3` (
    var `aliases`: kotlin.collections.List<kotlin.String>,
    var `charset`: kotlin.String,
    var `classification`: mozilla.appservices.search.`SearchEngineClassificationV3`,
    var `identifier`: kotlin.String,
    var `isNewUntil`: kotlin.String?,
    var `name`: kotlin.String,
    var `optional`: kotlin.Boolean,
    var `partner`: kotlin.collections.Map<kotlin.String, mozilla.appservices.search.`SearchEnginePartnerDetails`>?,
    var `urls`: mozilla.appservices.search.`SearchEngineUrls`,
    var `orderHint`: kotlin.UInt?,
    var `deprecated`: kotlin.Boolean,
) {
    

    companion object
}

data class `RefinedSearchConfigV3` (
    var `engines`: kotlin.collections.List<mozilla.appservices.search.`SearchEngineDefinitionV3`>,
    var `appDefaultEngineId`: kotlin.String?,
    var `appPrivateDefaultEngineId`: kotlin.String?,
) {
    

    companion object
}

enum class `SearchUpdateChannel` {
    `NIGHTLY`,`AURORA`,`BETA`,`RELEASE`,`ESR`,`DEFAULT`;

    companion object
}

enum class `SearchApplicationName` {
    `FIREFOX_ANDROID`,`FIREFOX_IOS`,`FOCUS_ANDROID`,`FOCUS_IOS`,`FIREFOX`;

    companion object
}

enum class `SearchDeviceType` {
    `SMARTPHONE`,`TABLET`,`NONE`;

    companion object
}

data class `SearchUserEnvironment` (
    var `locale`: kotlin.String,
    var `region`: kotlin.String,
    var `updateChannel`: mozilla.appservices.search.`SearchUpdateChannel`,
    var `distributionId`: kotlin.String,
    var `experiment`: kotlin.String,
    var `appName`: mozilla.appservices.search.`SearchApplicationName`,
    var `version`: kotlin.String,
    var `deviceType`: mozilla.appservices.search.`SearchDeviceType`,
) {
    

    companion object
}

enum class `SearchUpdateChannelV3` {
    `NIGHTLY`,`AURORA`,`BETA`,`RELEASE`,`ESR`,`DEFAULT`;

    companion object
}

enum class `SearchApplicationNameV3` {
    `FIREFOX_ANDROID`,`FIREFOX_IOS`,`FOCUS_ANDROID`,`FOCUS_IOS`,`FIREFOX_WIN`,`FIREFOX_MACOSX`,`FIREFOX_LINUX`,`UNKNOWN`;

    companion object
}

enum class `SearchDeviceTypeV3` {
    `SMARTPHONE`,`TABLET`,`NONE`;

    companion object
}

data class `SearchUserEnvironmentV3` (
    var `locale`: kotlin.String,
    var `region`: kotlin.String,
    var `updateChannel`: mozilla.appservices.search.`SearchUpdateChannelV3`,
    var `distributionId`: kotlin.String,
    var `experiment`: kotlin.String,
    var `appName`: mozilla.appservices.search.`SearchApplicationNameV3`,
    var `version`: kotlin.String,
    var `deviceType`: mozilla.appservices.search.`SearchDeviceTypeV3`,
) {
    

    companion object
}

sealed class `SearchApiException` : Exception() {
    
    class `Other`(val `reason`: kotlin.String,) : `SearchApiException`()
    
    
    

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

open class `SearchEngineSelector` : SearchEngineSelectorInterface, uniffi.Disposable, AutoCloseable {
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
    constructor() {
        

        val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.constructorSearchSearchEngineSelectorNew(
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
            mozilla.appservices.search.uniffi.Scaffolding.objectFree6082(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.search.uniffi.Scaffolding.objectCloneHandle6082(uniffiHandle)
    }

    override public fun `filterEngineConfiguration`(`userEnvironment`: mozilla.appservices.search.`SearchUserEnvironment`): mozilla.appservices.search.`RefinedSearchConfig` {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerType371(`userEnvironment`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorFilterEngineConfiguration(
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
    override public fun `filterEngineConfigurationV3`(`userEnvironment`: mozilla.appservices.search.`SearchUserEnvironmentV3`): mozilla.appservices.search.`RefinedSearchConfigV3` {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerType374(`userEnvironment`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorFilterEngineConfigurationV3(
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
    override public fun `setConfigOverrides`(`overrides`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerString(`overrides`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorSetConfigOverrides(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setSearchConfig`(`configuration`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerString(`configuration`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorSetSearchConfig(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setSearchConfigV3`(`configuration`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerString(`configuration`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorSetSearchConfigV3(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `useRemoteSettingsServer`(`service`: mozilla.appservices.remotesettings.`RemoteSettingsService`, `applyEngineOverrides`: kotlin.Boolean): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerType222(`service`)
    val uniffiArgLowered2 = mozilla.appservices.search.uniffi.lowerBoolean(`applyEngineOverrides`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorUseRemoteSettingsServer(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `useRemoteSettingsServerV3`(`service`: mozilla.appservices.remotesettings.`RemoteSettingsService`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.search.uniffi.lowerType6082(this)
    val uniffiArgLowered1 = mozilla.appservices.search.uniffi.lowerType222(`service`)

    val uniffiReturn = mozilla.appservices.search.uniffi.Scaffolding.methodSearchSearchEngineSelectorUseRemoteSettingsServerV3(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    
    

    companion object {
        
    }
}