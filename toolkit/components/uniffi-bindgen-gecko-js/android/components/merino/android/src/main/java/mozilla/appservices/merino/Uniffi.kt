package mozilla.appservices.merino
public interface `CuratedRecommendationsClientInterface` {
    fun `getCuratedRecommendations`(`request`: mozilla.appservices.merino.`CuratedRecommendationsRequest`): mozilla.appservices.merino.`CuratedRecommendationsResponse`
    
}
public interface `SuggestClientInterface` {
    fun `getSuggestions`(`query`: kotlin.String , `options`: mozilla.appservices.merino.`SuggestOptions`): kotlin.String?
    
    fun `resetSession`(): Unit
    
}

data class `CuratedRecommendationsConfig` (
    var `baseHost`: kotlin.String?,
    var `userAgentHeader`: kotlin.String,
) {
    

    companion object
}

enum class `CuratedRecommendationLocale` {
    `FR`,`FR_FR`,`ES`,`ES_ES`,`IT`,`IT_IT`,`EN`,`EN_CA`,`EN_GB`,`EN_IE`,`EN_US`,`DE`,`DE_DE`,`DE_AT`,`DE_CH`,`PL`,`PL_PL`;

    companion object
}

data class `SectionSettings` (
    var `sectionId`: kotlin.String,
    var `isFollowed`: kotlin.Boolean,
    var `isBlocked`: kotlin.Boolean,
) {
    

    companion object
}

data class `CuratedRecommendationsRequest` (
    var `locale`: mozilla.appservices.merino.`CuratedRecommendationLocale`,
    var `region`: kotlin.String? = null,
    var `count`: kotlin.Int? = 100,
    var `topics`: kotlin.collections.List<kotlin.String>? = null,
    var `feeds`: kotlin.collections.List<kotlin.String>? = null,
    var `sections`: kotlin.collections.List<mozilla.appservices.merino.`SectionSettings`>? = null,
    var `experimentName`: kotlin.String? = null,
    var `experimentBranch`: kotlin.String? = null,
    var `enableInterestPicker`: kotlin.Boolean = false,
) {
    

    companion object
}

data class `RecommendationDataItem` (
    var `corpusItemId`: kotlin.String,
    var `scheduledCorpusItemId`: kotlin.String? = null,
    var `url`: kotlin.String,
    var `title`: kotlin.String,
    var `excerpt`: kotlin.String,
    var `topic`: kotlin.String? = null,
    var `publisher`: kotlin.String,
    var `isTimeSensitive`: kotlin.Boolean,
    var `imageUrl`: kotlin.String,
    var `iconUrl`: kotlin.String?,
    var `tileId`: kotlin.Long? = null,
    var `receivedRank`: kotlin.Long,
) {
    

    companion object
}

data class `Tile` (
    var `size`: kotlin.String,
    var `position`: kotlin.Int,
    var `hasAd`: kotlin.Boolean,
    var `hasExcerpt`: kotlin.Boolean,
) {
    

    companion object
}

data class `ResponsiveLayout` (
    var `columnCount`: kotlin.Int,
    var `tiles`: kotlin.collections.List<mozilla.appservices.merino.`Tile`>,
) {
    

    companion object
}

data class `Layout` (
    var `name`: kotlin.String,
    var `responsiveLayouts`: kotlin.collections.List<mozilla.appservices.merino.`ResponsiveLayout`>,
) {
    

    companion object
}

data class `FeedSection` (
    var `feedId`: kotlin.String,
    var `receivedFeedRank`: kotlin.Int,
    var `recommendations`: kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`>,
    var `title`: kotlin.String,
    var `subtitle`: kotlin.String? = null,
    var `layout`: mozilla.appservices.merino.`Layout`,
    var `isFollowed`: kotlin.Boolean,
    var `isBlocked`: kotlin.Boolean,
) {
    

    companion object
}

data class `InterestPickerSection` (
    var `sectionId`: kotlin.String,
) {
    

    companion object
}

data class `InterestPicker` (
    var `receivedFeedRank`: kotlin.Int,
    var `title`: kotlin.String,
    var `subtitle`: kotlin.String,
    var `sections`: kotlin.collections.List<mozilla.appservices.merino.`InterestPickerSection`>,
) {
    

    companion object
}

data class `CuratedRecommendationsResponse` (
    var `recommendedAt`: kotlin.Long,
    var `data`: kotlin.collections.List<mozilla.appservices.merino.`RecommendationDataItem`>,
    var `feeds`: kotlin.collections.List<mozilla.appservices.merino.`FeedSection`>? = null,
    var `interestPicker`: mozilla.appservices.merino.`InterestPicker`? = null,
) {
    

    companion object
}

data class `SuggestConfig` (
    var `baseHost`: kotlin.String?,
) {
    

    companion object
}

data class `SuggestOptions` (
    var `providers`: kotlin.collections.List<kotlin.String>?,
    var `source`: kotlin.String?,
    var `country`: kotlin.String?,
    var `region`: kotlin.String?,
    var `city`: kotlin.String?,
    var `clientVariants`: kotlin.collections.List<kotlin.String>?,
    var `requestType`: kotlin.String?,
    var `acceptLanguage`: kotlin.String?,
) {
    

    companion object
}

sealed class `CuratedRecommendationsApiException` : Exception() {
    
    class `Network`(val `reason`: kotlin.String,) : `CuratedRecommendationsApiException`()
    
    
    class `Other`(val `code`: kotlin.UShort?,val `reason`: kotlin.String,) : `CuratedRecommendationsApiException`()
    
    
    

    companion object
}

sealed class `MerinoSuggestApiException` : Exception() {
    
    class `Network`(val `reason`: kotlin.String,) : `MerinoSuggestApiException`()
    
    
    class `Other`(val `code`: kotlin.UShort?,val `reason`: kotlin.String,) : `MerinoSuggestApiException`()
    
    
    

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

open class `CuratedRecommendationsClient` : CuratedRecommendationsClientInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`config`: mozilla.appservices.merino.`CuratedRecommendationsConfig`) {
        
        val uniffiArgLowered0 = mozilla.appservices.merino.uniffi.lowerType191(`config`)

        val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.constructorMerinoCuratedRecommendationsClientNew(
            uniffiArgLowered0.v0,
            uniffiArgLowered0.v1,
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
            mozilla.appservices.merino.uniffi.Scaffolding.objectFree4019(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.merino.uniffi.Scaffolding.objectCloneHandle4019(uniffiHandle)
    }

    override public fun `getCuratedRecommendations`(`request`: mozilla.appservices.merino.`CuratedRecommendationsRequest`): mozilla.appservices.merino.`CuratedRecommendationsResponse` {
        
    val uniffiArgLowered0 = mozilla.appservices.merino.uniffi.lowerObjectRef4019(this)
    val uniffiArgLowered1 = mozilla.appservices.merino.uniffi.lowerType193(`request`)

    val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.methodMerinoCuratedRecommendationsClientGetCuratedRecommendations(
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
    )
    return uniffiReturn

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

open class `SuggestClient` : SuggestClientInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`config`: mozilla.appservices.merino.`SuggestConfig`) {
        
        val uniffiArgLowered0 = mozilla.appservices.merino.uniffi.lowerType195(`config`)

        val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.constructorMerinoSuggestClientNew(
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
            mozilla.appservices.merino.uniffi.Scaffolding.objectFree4020(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.merino.uniffi.Scaffolding.objectCloneHandle4020(uniffiHandle)
    }

    override public fun `getSuggestions`(`query`: kotlin.String, `options`: mozilla.appservices.merino.`SuggestOptions`): kotlin.String? {
        
    val uniffiArgLowered0 = mozilla.appservices.merino.uniffi.lowerObjectRef4020(this)
    val uniffiArgLowered1 = mozilla.appservices.merino.uniffi.lowerString(`query`)
    val uniffiArgLowered2 = mozilla.appservices.merino.uniffi.lowerType197(`options`)

    val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.methodMerinoSuggestClientGetSuggestions(
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
    return mozilla.appservices.merino.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `resetSession`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.merino.uniffi.lowerObjectRef4020(this)

    val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.methodMerinoSuggestClientResetSession(
        uniffiArgLowered0,
    )
    }
    
    

    companion object {
        
    }
}
public fun `allCuratedRecommendationLocales`(): kotlin.collections.List<kotlin.String> {

    val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.functionMerinoAllCuratedRecommendationLocales(
    )
    return mozilla.appservices.merino.uniffi.liftType16(uniffiReturn)
}
public fun `curatedRecommendationLocaleFromString`(`locale`: kotlin.String): mozilla.appservices.merino.`CuratedRecommendationLocale`? {
    val uniffiArgLowered0 = mozilla.appservices.merino.uniffi.lowerString(`locale`)

    val uniffiReturn = mozilla.appservices.merino.uniffi.Scaffolding.functionMerinoCuratedRecommendationLocaleFromString(
        uniffiArgLowered0,
    )
    return uniffiReturn

}