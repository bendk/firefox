package mozilla.appservices.adsclient
public interface `MozAdsClientInterface` {
    fun `clearCache`(): Unit
    
    fun `recordClick`(`clickUrl`: kotlin.String , `options`: mozilla.appservices.adsclient.`MozAdsCallbackOptions`? = null): Unit
    
    fun `recordImpression`(`impressionUrl`: kotlin.String , `options`: mozilla.appservices.adsclient.`MozAdsCallbackOptions`? = null): Unit
    
    fun `reportAd`(`reportUrl`: kotlin.String , `reason`: mozilla.appservices.adsclient.`MozAdsReportReason` , `options`: mozilla.appservices.adsclient.`MozAdsCallbackOptions`? = null): Unit
    
    fun `requestImageAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`> , `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`? = null): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsImage`>
    
    fun `requestSpocAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`> , `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`? = null): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>>
    
    fun `requestSpocOrImageAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`> , `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`? = null): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>>
    
    fun `requestTileAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`> , `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`? = null): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsTile`>
    
    fun `shutdown`(): Unit
    
}
public interface `MozAdsTelemetry` {
    fun `recordBuildCacheError`(`label`: kotlin.String , `value`: kotlin.String): Unit
    
    fun `recordClientError`(`label`: kotlin.String , `value`: kotlin.String): Unit
    
    fun `recordClientOperationTotal`(`label`: kotlin.String): Unit
    
    fun `recordDeserializationError`(`label`: kotlin.String , `value`: kotlin.String): Unit
    
    fun `recordHttpCacheOutcome`(`label`: kotlin.String , `value`: kotlin.String): Unit
    
}
public interface `MozAdsClientBuilderInterface` {
    fun `build`(): mozilla.appservices.adsclient.`MozAdsClient`
    
    fun `cacheConfig`(`cacheConfig`: mozilla.appservices.adsclient.`MozAdsCacheConfig`): mozilla.appservices.adsclient.`MozAdsClientBuilder`
    
    fun `environment`(`environment`: mozilla.appservices.adsclient.`MozAdsEnvironment`): mozilla.appservices.adsclient.`MozAdsClientBuilder`
    
    fun `telemetry`(`telemetry`: mozilla.appservices.adsclient.`MozAdsTelemetry`): mozilla.appservices.adsclient.`MozAdsClientBuilder`
    
    fun `userAgent`(`userAgent`: kotlin.String): mozilla.appservices.adsclient.`MozAdsClientBuilder`
    
}

data class `MozAdsCacheConfig` (
    var `dbPath`: kotlin.String,
    var `defaultCacheTtlSeconds`: kotlin.ULong? = null,
    var `maxSizeMib`: kotlin.ULong? = null,
) {
    

    companion object
}

enum class `MozAdsCacheMode` {
    `CACHE_FIRST`,`NETWORK_FIRST`;

    companion object
}

data class `MozAdsCachePolicy` (
    var `mode`: mozilla.appservices.adsclient.`MozAdsCacheMode`,
    var `ttlSeconds`: kotlin.ULong? = null,
) {
    

    companion object
}

data class `MozAdsCallbackOptions` (
    var `ohttp`: kotlin.Boolean = false,
) {
    

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `AdsClientUrl` = kotlin.String

data class `MozAdsCallbacks` (
    var `click`: mozilla.appservices.adsclient.`AdsClientUrl`,
    var `impression`: mozilla.appservices.adsclient.`AdsClientUrl`,
    var `report`: mozilla.appservices.adsclient.`AdsClientUrl`?,
) {
    

    companion object
}

enum class `MozAdsIabContentTaxonomy` {
    `IAB1_0`,`IAB2_0`,`IAB2_1`,`IAB2_2`,`IAB3_0`;

    companion object
}

data class `MozAdsContentCategory` (
    var `categories`: kotlin.collections.List<kotlin.String>,
    var `taxonomy`: mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy`,
) {
    

    companion object
}

data class `MozAdsIabContent` (
    var `categoryIds`: kotlin.collections.List<kotlin.String>,
    var `taxonomy`: mozilla.appservices.adsclient.`MozAdsIabContentTaxonomy`,
) {
    

    companion object
}

data class `MozAdsImage` (
    var `altText`: kotlin.String?,
    var `blockKey`: kotlin.String,
    var `callbacks`: mozilla.appservices.adsclient.`MozAdsCallbacks`,
    var `format`: kotlin.String,
    var `imageUrl`: mozilla.appservices.adsclient.`AdsClientUrl`,
    var `url`: mozilla.appservices.adsclient.`AdsClientUrl`,
) {
    

    companion object
}

data class `MozAdsPlacementRequest` (
    var `iabContent`: mozilla.appservices.adsclient.`MozAdsIabContent`? = null,
    var `placementId`: kotlin.String,
) {
    

    companion object
}

data class `MozAdsPlacementRequestWithCount` (
    var `count`: kotlin.UInt,
    var `iabContent`: mozilla.appservices.adsclient.`MozAdsIabContent`? = null,
    var `placementId`: kotlin.String,
) {
    

    companion object
}

data class `MozAdsRequestOptions` (
    var `blocks`: kotlin.collections.List<kotlin.String> = emptyList(),
    var `cachePolicy`: mozilla.appservices.adsclient.`MozAdsCachePolicy`? = null,
    var `flags`: kotlin.collections.Map<kotlin.String, kotlin.Boolean> = emptyMap(),
    var `ohttp`: kotlin.Boolean = false,
    var `relevance`: kotlin.collections.Map<kotlin.String, kotlin.Double> = emptyMap(),
) {
    

    companion object
}

data class `MozAdsSpocFrequencyCaps` (
    var `capKey`: kotlin.String,
    var `day`: kotlin.UInt,
) {
    

    companion object
}

data class `MozAdsSpocRanking` (
    var `itemScore`: kotlin.Double,
    var `personalizationModels`: kotlin.collections.Map<kotlin.String, kotlin.UInt>,
    var `priority`: kotlin.UInt,
) {
    

    companion object
}

data class `MozAdsSpoc` (
    var `blockKey`: kotlin.String,
    var `callbacks`: mozilla.appservices.adsclient.`MozAdsCallbacks`,
    var `caps`: mozilla.appservices.adsclient.`MozAdsSpocFrequencyCaps`,
    var `domain`: kotlin.String,
    var `excerpt`: kotlin.String,
    var `format`: kotlin.String,
    var `imageUrl`: mozilla.appservices.adsclient.`AdsClientUrl`,
    var `ranking`: mozilla.appservices.adsclient.`MozAdsSpocRanking`,
    var `sponsor`: kotlin.String,
    var `sponsoredByOverride`: kotlin.String?,
    var `title`: kotlin.String,
    var `url`: mozilla.appservices.adsclient.`AdsClientUrl`,
) {
    

    companion object
}

data class `MozAdsStoreConfig` (
    var `dbPath`: kotlin.String,
) {
    

    companion object
}

data class `MozAdsTile` (
    var `blockKey`: kotlin.String,
    var `callbacks`: mozilla.appservices.adsclient.`MozAdsCallbacks`,
    var `format`: kotlin.String,
    var `imageUrl`: mozilla.appservices.adsclient.`AdsClientUrl`,
    var `name`: kotlin.String,
    var `url`: mozilla.appservices.adsclient.`AdsClientUrl`,
) {
    

    companion object
}

sealed class `MozAdsClientApiException` : Exception() {
    
    class `Other`(val `reason`: kotlin.String,) : `MozAdsClientApiException`()
    
    
    

    companion object
}

sealed class `MozAdsEnvironment` {
    object `Prod` : `MozAdsEnvironment`()
    
    object `Staging` : `MozAdsEnvironment`()
    
    data class `Custom`(val v1: mozilla.appservices.adsclient.`AdsClientUrl`,) : `MozAdsEnvironment`()
    
    

    companion object
}

sealed class `MozAdsImageOrSpoc` {
    data class `Image`(val v1: mozilla.appservices.adsclient.`MozAdsImage`,) : `MozAdsImageOrSpoc`()
    data class `Spoc`(val v1: mozilla.appservices.adsclient.`MozAdsSpoc`,) : `MozAdsImageOrSpoc`()
    
    

    companion object
}

enum class `MozAdsReportReason` {
    `INAPPROPRIATE`,`NOT_INTERESTED`,`SEEN_TOO_MANY_TIMES`,`SCAM`,`MISLEADING`,`OFFENSIVE`;

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

open class `MozAdsClient` : MozAdsClientInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.adsclient.uniffi.Scaffolding.objectFree49(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.adsclient.uniffi.Scaffolding.objectCloneHandle49(uniffiHandle)
    }

    override public fun `clearCache`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientClearCache(
        uniffiArgLowered0,
    )
    }
    override public fun `recordClick`(`clickUrl`: kotlin.String, `options`: mozilla.appservices.adsclient.`MozAdsCallbackOptions`?): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerString(`clickUrl`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType32(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientRecordClick(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
    )
    }
    override public fun `recordImpression`(`impressionUrl`: kotlin.String, `options`: mozilla.appservices.adsclient.`MozAdsCallbackOptions`?): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerString(`impressionUrl`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType32(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientRecordImpression(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
    )
    }
    override public fun `reportAd`(`reportUrl`: kotlin.String, `reason`: mozilla.appservices.adsclient.`MozAdsReportReason`, `options`: mozilla.appservices.adsclient.`MozAdsCallbackOptions`?): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerString(`reportUrl`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType34(`reason`)
    val uniffiArgLowered3 = mozilla.appservices.adsclient.uniffi.lowerType32(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientReportAd(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3.v0,
        uniffiArgLowered3.v1,
    )
    }
    override public fun `requestImageAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`>, `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`?): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsImage`> {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType35(`mozAdRequests`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType37(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientRequestImageAds(
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
    return mozilla.appservices.adsclient.uniffi.liftType39(uniffiReturn)
    }
    override public fun `requestSpocAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`>, `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`?): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsSpoc`>> {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType40(`mozAdRequests`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType37(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientRequestSpocAds(
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
    return mozilla.appservices.adsclient.uniffi.liftType42(uniffiReturn)
    }
    override public fun `requestSpocOrImageAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequestWithCount`>, `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`?): kotlin.collections.Map<kotlin.String, kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsImageOrSpoc`>> {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType40(`mozAdRequests`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType37(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientRequestSpocOrImageAds(
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
    return mozilla.appservices.adsclient.uniffi.liftType44(uniffiReturn)
    }
    override public fun `requestTileAds`(`mozAdRequests`: kotlin.collections.List<mozilla.appservices.adsclient.`MozAdsPlacementRequest`>, `options`: mozilla.appservices.adsclient.`MozAdsRequestOptions`?): kotlin.collections.Map<kotlin.String, mozilla.appservices.adsclient.`MozAdsTile`> {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType35(`mozAdRequests`)
    val uniffiArgLowered2 = mozilla.appservices.adsclient.uniffi.lowerType37(`options`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientRequestTileAds(
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
    return mozilla.appservices.adsclient.uniffi.liftType47(uniffiReturn)
    }
    override public fun `shutdown`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef49(this)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientShutdown(
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

open class `MozAdsClientBuilder` : MozAdsClientBuilderInterface, uniffi.Disposable, AutoCloseable {
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
        

        val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.constructorAdsClientMozAdsClientBuilderNew(
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
            mozilla.appservices.adsclient.uniffi.Scaffolding.objectFree51(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.adsclient.uniffi.Scaffolding.objectCloneHandle51(uniffiHandle)
    }

    override public fun `build`(): mozilla.appservices.adsclient.`MozAdsClient` {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerObjectRef51(this)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientBuilderBuild(
        uniffiArgLowered0,
    )
    return mozilla.appservices.adsclient.uniffi.liftType49(uniffiReturn)
    }
    override public fun `cacheConfig`(`cacheConfig`: mozilla.appservices.adsclient.`MozAdsCacheConfig`): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerType51(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType50(`cacheConfig`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientBuilderCacheConfig(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
    )
    return mozilla.appservices.adsclient.uniffi.liftType51(uniffiReturn)
    }
    override public fun `environment`(`environment`: mozilla.appservices.adsclient.`MozAdsEnvironment`): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerType51(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType52(`environment`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientBuilderEnvironment(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    return mozilla.appservices.adsclient.uniffi.liftType51(uniffiReturn)
    }
    override public fun `telemetry`(`telemetry`: mozilla.appservices.adsclient.`MozAdsTelemetry`): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerType51(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerType53(`telemetry`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientBuilderTelemetry(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.adsclient.uniffi.liftType51(uniffiReturn)
    }
    override public fun `userAgent`(`userAgent`: kotlin.String): mozilla.appservices.adsclient.`MozAdsClientBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.adsclient.uniffi.lowerType51(this)
    val uniffiArgLowered1 = mozilla.appservices.adsclient.uniffi.lowerString(`userAgent`)

    val uniffiReturn = mozilla.appservices.adsclient.uniffi.Scaffolding.methodAdsClientMozAdsClientBuilderUserAgent(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.adsclient.uniffi.liftType51(uniffiReturn)
    }
    
    

    companion object {
        
    }
}