package mozilla.appservices.suggest
public interface `SuggestStoreInterface` {
    fun `anyDismissedSuggestions`(): kotlin.Boolean
    
    fun `clear`(): Unit
    
    fun `clearDismissedSuggestions`(): Unit
    
    fun `dismissByKey`(`key`: kotlin.String): Unit
    
    fun `dismissBySuggestion`(`suggestion`: mozilla.appservices.suggest.`Suggestion`): Unit
    
    fun `dismissSuggestion`(`suggestionUrl`: kotlin.String): Unit
    
    fun `fetchGeonameAlternates`(`geoname`: mozilla.appservices.suggest.`Geoname`): mozilla.appservices.suggest.`GeonameAlternates`
    
    fun `fetchGeonames`(`query`: kotlin.String , `matchNamePrefix`: kotlin.Boolean , `filter`: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>?): kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`>
    
    fun `fetchGlobalConfig`(): mozilla.appservices.suggest.`SuggestGlobalConfig`
    
    fun `fetchProviderConfig`(`provider`: mozilla.appservices.suggest.`SuggestionProvider`): mozilla.appservices.suggest.`SuggestProviderConfig`?
    
    fun `ingest`(`constraints`: mozilla.appservices.suggest.`SuggestIngestionConstraints`): mozilla.appservices.suggest.`SuggestIngestionMetrics`
    
    fun `interrupt`(`kind`: mozilla.appservices.suggest.`InterruptKind`? = null): Unit
    
    fun `isDismissedByKey`(`key`: kotlin.String): kotlin.Boolean
    
    fun `isDismissedBySuggestion`(`suggestion`: mozilla.appservices.suggest.`Suggestion`): kotlin.Boolean
    
    fun `query`(`query`: mozilla.appservices.suggest.`SuggestionQuery`): kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`>
    
    fun `queryWithMetrics`(`query`: mozilla.appservices.suggest.`SuggestionQuery`): mozilla.appservices.suggest.`QueryWithMetricsResult`
    
}
public interface `SuggestStoreBuilderInterface` {
    fun `build`(): mozilla.appservices.suggest.`SuggestStore`
    
    fun `cachePath`(`path`: kotlin.String): mozilla.appservices.suggest.`SuggestStoreBuilder`
    
    fun `dataPath`(`path`: kotlin.String): mozilla.appservices.suggest.`SuggestStoreBuilder`
    
    fun `loadExtension`(`library`: kotlin.String , `entryPoint`: kotlin.String?): mozilla.appservices.suggest.`SuggestStoreBuilder`
    
    fun `remoteSettingsBucketName`(`bucketName`: kotlin.String): mozilla.appservices.suggest.`SuggestStoreBuilder`
    
    fun `remoteSettingsServer`(`server`: mozilla.appservices.remotesettings.`RemoteSettingsServer`): mozilla.appservices.suggest.`SuggestStoreBuilder`
    
    fun `remoteSettingsService`(`rsService`: mozilla.appservices.remotesettings.`RemoteSettingsService`): mozilla.appservices.suggest.`SuggestStoreBuilder`
    
}

data class `AlternateNames` (
    var `primary`: kotlin.String,
    var `localized`: kotlin.String?,
    var `abbreviation`: kotlin.String?,
) {
    

    companion object
}

data class `FtsMatchInfo` (
    var `prefix`: kotlin.Boolean,
    var `stemming`: kotlin.Boolean,
) {
    

    companion object
}

sealed class `GeonameType` {
    object `Country` : `GeonameType`()
    
    data class `AdminDivision`(val `level`: kotlin.UByte,) : `GeonameType`()
    object `AdminDivisionOther` : `GeonameType`()
    
    object `City` : `GeonameType`()
    
    object `Other` : `GeonameType`()
    
    
    

    companion object
}

data class `Geoname` (
    var `geonameId`: kotlin.Long,
    var `geonameType`: mozilla.appservices.suggest.`GeonameType`,
    var `name`: kotlin.String,
    var `countryCode`: kotlin.String,
    var `featureClass`: kotlin.String,
    var `featureCode`: kotlin.String,
    var `adminDivisionCodes`: kotlin.collections.Map<kotlin.UByte, kotlin.String>,
    var `population`: kotlin.ULong,
    var `latitude`: kotlin.String,
    var `longitude`: kotlin.String,
) {
    

    companion object
}

data class `GeonameAlternates` (
    var `geoname`: mozilla.appservices.suggest.`AlternateNames`,
    var `country`: mozilla.appservices.suggest.`AlternateNames`?,
    var `adminDivisions`: kotlin.collections.Map<kotlin.UByte, mozilla.appservices.suggest.`AlternateNames`>,
) {
    

    companion object
}

enum class `GeonameMatchType` {
    `ABBREVIATION`,`AIRPORT_CODE`,`NAME`;

    companion object
}

data class `GeonameMatch` (
    var `geoname`: mozilla.appservices.suggest.`Geoname`,
    var `matchType`: mozilla.appservices.suggest.`GeonameMatchType`,
    var `prefix`: kotlin.Boolean,
) {
    

    companion object
}

data class `LabeledTimingSample` (
    var `label`: kotlin.String,
    var `value`: kotlin.ULong,
) {
    

    companion object
}

enum class `YelpSubjectType`(val value: kotlin.UByte) {
    `SERVICE`(0.toUByte()),`BUSINESS`(1.toUByte());

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `JsonValue` = kotlin.String

sealed class `Suggestion` {
    data class `Amp`(val `title`: kotlin.String,val `url`: kotlin.String,val `rawUrl`: kotlin.String,val `icon`: kotlin.ByteArray?,val `iconMimetype`: kotlin.String?,val `fullKeyword`: kotlin.String,val `blockId`: kotlin.Long,val `advertiser`: kotlin.String,val `iabCategory`: kotlin.String,val `categories`: kotlin.collections.List<kotlin.Int>,val `impressionUrl`: kotlin.String,val `clickUrl`: kotlin.String,val `rawClickUrl`: kotlin.String,val `score`: kotlin.Double,val `ftsMatchInfo`: mozilla.appservices.suggest.`FtsMatchInfo`?,val `suggestionId`: kotlin.String,) : `Suggestion`()
    data class `Wikipedia`(val `title`: kotlin.String,val `url`: kotlin.String,val `icon`: kotlin.ByteArray?,val `iconMimetype`: kotlin.String?,val `fullKeyword`: kotlin.String,) : `Suggestion`()
    data class `Amo`(val `title`: kotlin.String,val `url`: kotlin.String,val `iconUrl`: kotlin.String,val `description`: kotlin.String,val `rating`: kotlin.String?,val `numberOfRatings`: kotlin.Long,val `guid`: kotlin.String,val `score`: kotlin.Double,) : `Suggestion`()
    data class `Yelp`(val `url`: kotlin.String,val `title`: kotlin.String,val `icon`: kotlin.ByteArray?,val `iconMimetype`: kotlin.String?,val `score`: kotlin.Double,val `hasLocationSign`: kotlin.Boolean,val `subjectExactMatch`: kotlin.Boolean,val `subjectType`: mozilla.appservices.suggest.`YelpSubjectType`,val `locationParam`: kotlin.String,) : `Suggestion`()
    data class `Mdn`(val `title`: kotlin.String,val `url`: kotlin.String,val `description`: kotlin.String,val `score`: kotlin.Double,) : `Suggestion`()
    data class `Weather`(val `city`: mozilla.appservices.suggest.`Geoname`?,val `score`: kotlin.Double,) : `Suggestion`()
    data class `Dynamic`(val `suggestionType`: kotlin.String,val `data`: mozilla.appservices.suggest.`JsonValue`?,val `dismissalKey`: kotlin.String?,val `score`: kotlin.Double,) : `Suggestion`()
    
    

    companion object
}

data class `QueryWithMetricsResult` (
    var `suggestions`: kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`>,
    var `queryTimes`: kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`>,
) {
    

    companion object
}

data class `SuggestGlobalConfig` (
    var `showLessFrequentlyCap`: kotlin.Int,
) {
    

    companion object
}

enum class `SuggestionProvider`(val value: kotlin.UByte) {
    `AMP`(1.toUByte()),`WIKIPEDIA`(2.toUByte()),`AMO`(3.toUByte()),`YELP`(5.toUByte()),`MDN`(6.toUByte()),`WEATHER`(7.toUByte()),`DYNAMIC`(9.toUByte());

    companion object
}

enum class `AmpMatchingStrategy` {
    `NO_KEYWORD_EXPANSION`,`FTS_AGAINST_FULL_KEYWORDS`,`FTS_AGAINST_TITLE`;

    companion object
}

data class `SuggestionProviderConstraints` (
    var `dynamicSuggestionTypes`: kotlin.collections.List<kotlin.String>? = null,
    var `ampAlternativeMatching`: mozilla.appservices.suggest.`AmpMatchingStrategy`? = null,
) {
    

    companion object
}

data class `SuggestIngestionConstraints` (
    var `providers`: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>? = null,
    var `providerConstraints`: mozilla.appservices.suggest.`SuggestionProviderConstraints`? = null,
    var `emptyOnly`: kotlin.Boolean = false,
) {
    

    companion object
}

data class `SuggestIngestionMetrics` (
    var `ingestionTimes`: kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`>,
    var `downloadTimes`: kotlin.collections.List<mozilla.appservices.suggest.`LabeledTimingSample`>,
) {
    

    companion object
}

data class `SuggestionQuery` (
    var `keyword`: kotlin.String,
    var `providers`: kotlin.collections.List<mozilla.appservices.suggest.`SuggestionProvider`>,
    var `providerConstraints`: mozilla.appservices.suggest.`SuggestionProviderConstraints`? = null,
    var `limit`: kotlin.Int? = null,
) {
    

    companion object
}

enum class `InterruptKind` {
    `READ`,`WRITE`,`READ_WRITE`;

    companion object
}

sealed class `SuggestApiException` : Exception() {
    
    class `Network`(val `reason`: kotlin.String,) : `SuggestApiException`()
    
    
    class `Backoff`(val `seconds`: kotlin.ULong,) : `SuggestApiException`()
    
    
    class `Interrupted`() : `SuggestApiException`()
    
    
    class `Other`(val `reason`: kotlin.String,) : `SuggestApiException`()
    
    
    

    companion object
}

sealed class `SuggestProviderConfig` {
    data class `Weather`(val `score`: kotlin.Double,val `minKeywordLength`: kotlin.Int,) : `SuggestProviderConfig`()
    
    

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

open class `SuggestStore` : SuggestStoreInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`path`: kotlin.String , `remoteSettingsService`: mozilla.appservices.remotesettings.`RemoteSettingsService`) {
        
        val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerString(`path`)
        val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType222(`remoteSettingsService`)

        val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.constructorSuggestSuggestStoreNew(
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
            mozilla.appservices.suggest.uniffi.Scaffolding.objectFree416(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.suggest.uniffi.Scaffolding.objectCloneHandle416(uniffiHandle)
    }

    override public fun `anyDismissedSuggestions`(): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreAnyDismissedSuggestions(
        uniffiArgLowered0,
    )
    return mozilla.appservices.suggest.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `clear`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreClear(
        uniffiArgLowered0,
    )
    }
    override public fun `clearDismissedSuggestions`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreClearDismissedSuggestions(
        uniffiArgLowered0,
    )
    }
    override public fun `dismissByKey`(`key`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`key`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreDismissByKey(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `dismissBySuggestion`(`suggestion`: mozilla.appservices.suggest.`Suggestion`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType384(`suggestion`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreDismissBySuggestion(
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
        uniffiArgLowered1.v17,
        uniffiArgLowered1.v18,
        uniffiArgLowered1.v19,
        uniffiArgLowered1.v20,
        uniffiArgLowered1.v21,
        uniffiArgLowered1.v22,
        uniffiArgLowered1.v23,
        uniffiArgLowered1.v24,
        uniffiArgLowered1.v25,
        uniffiArgLowered1.v26,
        uniffiArgLowered1.v27,
        uniffiArgLowered1.v28,
        uniffiArgLowered1.v29,
        uniffiArgLowered1.v30,
        uniffiArgLowered1.v31,
        uniffiArgLowered1.v32,
        uniffiArgLowered1.v33,
        uniffiArgLowered1.v34,
        uniffiArgLowered1.v35,
        uniffiArgLowered1.v36,
        uniffiArgLowered1.v37,
        uniffiArgLowered1.v38,
        uniffiArgLowered1.v39,
        uniffiArgLowered1.v40,
        uniffiArgLowered1.v41,
        uniffiArgLowered1.v42,
        uniffiArgLowered1.v43,
        uniffiArgLowered1.v44,
        uniffiArgLowered1.v45,
    )
    }
    override public fun `dismissSuggestion`(`suggestionUrl`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`suggestionUrl`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreDismissSuggestion(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `fetchGeonameAlternates`(`geoname`: mozilla.appservices.suggest.`Geoname`): mozilla.appservices.suggest.`GeonameAlternates` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType381(`geoname`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreFetchGeonameAlternates(
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
    )
    return uniffiReturn

    }
    override public fun `fetchGeonames`(`query`: kotlin.String, `matchNamePrefix`: kotlin.Boolean, `filter`: kotlin.collections.List<mozilla.appservices.suggest.`Geoname`>?): kotlin.collections.List<mozilla.appservices.suggest.`GeonameMatch`> {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`query`)
    val uniffiArgLowered2 = mozilla.appservices.suggest.uniffi.lowerBoolean(`matchNamePrefix`)
    val uniffiArgLowered3 = mozilla.appservices.suggest.uniffi.lowerType403(`filter`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreFetchGeonames(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3.v0,
        uniffiArgLowered3.v1,
    )
    return mozilla.appservices.suggest.uniffi.liftType405(uniffiReturn)
    }
    override public fun `fetchGlobalConfig`(): mozilla.appservices.suggest.`SuggestGlobalConfig` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreFetchGlobalConfig(
        uniffiArgLowered0,
    )
    return mozilla.appservices.suggest.uniffi.liftType407(uniffiReturn)
    }
    override public fun `fetchProviderConfig`(`provider`: mozilla.appservices.suggest.`SuggestionProvider`): mozilla.appservices.suggest.`SuggestProviderConfig`? {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType389(`provider`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreFetchProviderConfig(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `ingest`(`constraints`: mozilla.appservices.suggest.`SuggestIngestionConstraints`): mozilla.appservices.suggest.`SuggestIngestionMetrics` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType410(`constraints`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreIngest(
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
    override public fun `interrupt`(`kind`: mozilla.appservices.suggest.`InterruptKind`?): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType412(`kind`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreInterrupt(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    }
    override public fun `isDismissedByKey`(`key`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`key`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreIsDismissedByKey(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.suggest.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `isDismissedBySuggestion`(`suggestion`: mozilla.appservices.suggest.`Suggestion`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType384(`suggestion`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreIsDismissedBySuggestion(
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
        uniffiArgLowered1.v17,
        uniffiArgLowered1.v18,
        uniffiArgLowered1.v19,
        uniffiArgLowered1.v20,
        uniffiArgLowered1.v21,
        uniffiArgLowered1.v22,
        uniffiArgLowered1.v23,
        uniffiArgLowered1.v24,
        uniffiArgLowered1.v25,
        uniffiArgLowered1.v26,
        uniffiArgLowered1.v27,
        uniffiArgLowered1.v28,
        uniffiArgLowered1.v29,
        uniffiArgLowered1.v30,
        uniffiArgLowered1.v31,
        uniffiArgLowered1.v32,
        uniffiArgLowered1.v33,
        uniffiArgLowered1.v34,
        uniffiArgLowered1.v35,
        uniffiArgLowered1.v36,
        uniffiArgLowered1.v37,
        uniffiArgLowered1.v38,
        uniffiArgLowered1.v39,
        uniffiArgLowered1.v40,
        uniffiArgLowered1.v41,
        uniffiArgLowered1.v42,
        uniffiArgLowered1.v43,
        uniffiArgLowered1.v44,
        uniffiArgLowered1.v45,
    )
    return mozilla.appservices.suggest.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `query`(`query`: mozilla.appservices.suggest.`SuggestionQuery`): kotlin.collections.List<mozilla.appservices.suggest.`Suggestion`> {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType414(`query`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreQuery(
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
    return mozilla.appservices.suggest.uniffi.liftType383(uniffiReturn)
    }
    override public fun `queryWithMetrics`(`query`: mozilla.appservices.suggest.`SuggestionQuery`): mozilla.appservices.suggest.`QueryWithMetricsResult` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef416(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType414(`query`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreQueryWithMetrics(
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

open class `SuggestStoreBuilder` : SuggestStoreBuilderInterface, uniffi.Disposable, AutoCloseable {
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
        

        val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.constructorSuggestSuggestStoreBuilderNew(
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
            mozilla.appservices.suggest.uniffi.Scaffolding.objectFree417(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.suggest.uniffi.Scaffolding.objectCloneHandle417(uniffiHandle)
    }

    override public fun `build`(): mozilla.appservices.suggest.`SuggestStore` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerObjectRef417(this)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderBuild(
        uniffiArgLowered0,
    )
    return mozilla.appservices.suggest.uniffi.liftType416(uniffiReturn)
    }
    override public fun `cachePath`(`path`: kotlin.String): mozilla.appservices.suggest.`SuggestStoreBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerType417(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`path`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderCachePath(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.suggest.uniffi.liftType417(uniffiReturn)
    }
    override public fun `dataPath`(`path`: kotlin.String): mozilla.appservices.suggest.`SuggestStoreBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerType417(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`path`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderDataPath(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.suggest.uniffi.liftType417(uniffiReturn)
    }
    override public fun `loadExtension`(`library`: kotlin.String, `entryPoint`: kotlin.String?): mozilla.appservices.suggest.`SuggestStoreBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerType417(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`library`)
    val uniffiArgLowered2 = mozilla.appservices.suggest.uniffi.lowerOptionString(`entryPoint`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderLoadExtension(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.suggest.uniffi.liftType417(uniffiReturn)
    }
    override public fun `remoteSettingsBucketName`(`bucketName`: kotlin.String): mozilla.appservices.suggest.`SuggestStoreBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerType417(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`bucketName`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderRemoteSettingsBucketName(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.suggest.uniffi.liftType417(uniffiReturn)
    }
    override public fun `remoteSettingsServer`(`server`: mozilla.appservices.remotesettings.`RemoteSettingsServer`): mozilla.appservices.suggest.`SuggestStoreBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerType417(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType325(`server`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderRemoteSettingsServer(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    return mozilla.appservices.suggest.uniffi.liftType417(uniffiReturn)
    }
    override public fun `remoteSettingsService`(`rsService`: mozilla.appservices.remotesettings.`RemoteSettingsService`): mozilla.appservices.suggest.`SuggestStoreBuilder` {
        
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerType417(this)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerType222(`rsService`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.methodSuggestSuggestStoreBuilderRemoteSettingsService(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.suggest.uniffi.liftType417(uniffiReturn)
    }
    
    

    companion object {
        
    }
}
public fun `rawSuggestionUrlMatches`(`rawUrl`: kotlin.String , `cookedUrl`: kotlin.String): kotlin.Boolean {
    val uniffiArgLowered0 = mozilla.appservices.suggest.uniffi.lowerString(`rawUrl`)
    val uniffiArgLowered1 = mozilla.appservices.suggest.uniffi.lowerString(`cookedUrl`)

    val uniffiReturn = mozilla.appservices.suggest.uniffi.Scaffolding.functionSuggestRawSuggestionUrlMatches(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.suggest.uniffi.liftBoolean(uniffiReturn)
}