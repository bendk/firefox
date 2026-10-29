package mozilla.appservices.places.uniffi
public interface `SqlInterruptHandleInterface` {
    fun `interrupt`(): Unit
    
}
public interface `PlacesConnectionInterface` {
    fun `acceptResult`(`searchString`: kotlin.String , `url`: kotlin.String): Unit
    
    fun `applyObservation`(`visit`: mozilla.appservices.places.uniffi.`VisitObservation`): Unit
    
    fun `bookmarksCountBookmarksInTrees`(`folderGuids`: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>): kotlin.UInt
    
    fun `bookmarksDelete`(`id`: mozilla.appservices.places.uniffi.`Guid`): kotlin.Boolean
    
    fun `bookmarksDeleteEverything`(): Unit
    
    fun `bookmarksGetAllWithUrl`(`url`: kotlin.String): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>
    
    fun `bookmarksGetByGuid`(`guid`: mozilla.appservices.places.uniffi.`Guid` , `getDirectChildren`: kotlin.Boolean): mozilla.appservices.places.uniffi.`BookmarkItem`?
    
    fun `bookmarksGetRecent`(`limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>
    
    fun `bookmarksGetTree`(`itemGuid`: mozilla.appservices.places.uniffi.`Guid`): mozilla.appservices.places.uniffi.`BookmarkItem`?
    
    fun `bookmarksGetUrlForKeyword`(`keyword`: kotlin.String): mozilla.appservices.places.uniffi.`Url`?
    
    fun `bookmarksInsert`(`bookmark`: mozilla.appservices.places.uniffi.`InsertableBookmarkItem`): mozilla.appservices.places.uniffi.`Guid`
    
    fun `bookmarksSearch`(`query`: kotlin.String , `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>
    
    fun `bookmarksUpdate`(`data`: mozilla.appservices.places.uniffi.`BookmarkUpdateInfo`): Unit
    
    fun `deleteEverythingHistory`(): Unit
    
    fun `deleteVisit`(`url`: kotlin.String , `timestamp`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Unit
    
    fun `deleteVisitsBetween`(`start`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `end`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Unit
    
    fun `deleteVisitsFor`(`url`: kotlin.String): Unit
    
    fun `getHistoryHighlights`(`weights`: mozilla.appservices.places.uniffi.`HistoryHighlightWeights` , `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`>
    
    fun `getHistoryMetadataBetween`(`start`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `end`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>
    
    fun `getHistoryMetadataSince`(`since`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>
    
    fun `getLatestHistoryMetadataForUrl`(`url`: mozilla.appservices.places.uniffi.`Url`): mozilla.appservices.places.uniffi.`HistoryMetadata`?
    
    fun `getMostRecentHistoryMetadata`(`limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>
    
    fun `getMostRecentSearchEntriesInHistoryMetadata`(`limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>
    
    fun `getTopFrecentSiteInfos`(`numItems`: kotlin.Int , `thresholdOption`: mozilla.appservices.places.uniffi.`FrecencyThresholdOption`): kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`>
    
    fun `getVisitCount`(`excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.Long
    
    fun `getVisitCountForHost`(`host`: kotlin.String , `before`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.Long
    
    fun `getVisitInfos`(`startDate`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `endDate`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`>
    
    fun `getVisitPage`(`offset`: kotlin.Long , `count`: kotlin.Long , `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`>
    
    fun `getVisitPageWithBound`(`bound`: kotlin.Long , `offset`: kotlin.Long , `count`: kotlin.Long , `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound`
    
    fun `getVisited`(`urls`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<kotlin.Boolean>
    
    fun `getVisitedUrlsInRange`(`start`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `end`: mozilla.appservices.places.uniffi.`PlacesTimestamp` , `includeRemote`: kotlin.Boolean): kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`>
    
    fun `matchUrl`(`query`: kotlin.String): mozilla.appservices.places.uniffi.`Url`?
    
    fun `metadataDelete`(`url`: mozilla.appservices.places.uniffi.`Url` , `referrerUrl`: mozilla.appservices.places.uniffi.`Url`? , `searchTerm`: kotlin.String?): Unit
    
    fun `metadataDeleteOlderThan`(`olderThan`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Unit
    
    fun `metadataDeleteSearchTerms`(): Unit
    
    fun `newInterruptHandle`(): mozilla.appservices.places.uniffi.`SqlInterruptHandle`
    
    fun `noteHistoryMetadataObservation`(`data`: mozilla.appservices.places.uniffi.`HistoryMetadataObservation` , `options`: mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions`): Unit
    
    fun `placesHistoryImportFromIos`(`dbPath`: kotlin.String , `lastSyncTimestamp`: kotlin.Long): mozilla.appservices.places.uniffi.`HistoryMigrationResult`
    
    fun `queryAutocomplete`(`search`: kotlin.String , `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`>
    
    fun `queryHistoryMetadata`(`query`: kotlin.String , `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>
    
    fun `runMaintenance`(`options`: mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions`): Unit
    
}
public interface `PlacesApiInterface` {
    fun `newConnection`(`connType`: mozilla.appservices.places.uniffi.`ConnectionType`): mozilla.appservices.places.uniffi.`PlacesConnection`
    
    fun `registerWithSyncManager`(): Unit
    
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `Guid` = kotlin.String

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `PlacesTimestamp` = kotlin.Long

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `Url` = kotlin.String

data class `BookmarkData` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`,
    var `position`: kotlin.UInt,
    var `dateAdded`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `lastModified`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `url`: mozilla.appservices.places.uniffi.`Url`,
    var `title`: kotlin.String?,
) {
    

    companion object
}

data class `BookmarkSeparator` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`,
    var `dateAdded`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `lastModified`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`,
    var `position`: kotlin.UInt,
) {
    

    companion object
}

data class `BookmarkFolder` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`,
    var `dateAdded`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `lastModified`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`?,
    var `position`: kotlin.UInt,
    var `title`: kotlin.String?,
    var `childGuids`: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>?,
    var `childNodes`: kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`>?,
) {
    

    companion object
}

sealed class `BookmarkItem` {
    data class `Bookmark`(val `b`: mozilla.appservices.places.uniffi.`BookmarkData`,) : `BookmarkItem`()
    data class `Separator`(val `s`: mozilla.appservices.places.uniffi.`BookmarkSeparator`,) : `BookmarkItem`()
    data class `Folder`(val `f`: mozilla.appservices.places.uniffi.`BookmarkFolder`,) : `BookmarkItem`()
    
    

    companion object
}

data class `BookmarkUpdateInfo` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`,
    var `title`: kotlin.String?,
    var `url`: kotlin.String?,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`?,
    var `position`: kotlin.UInt?,
) {
    

    companion object
}

enum class `DocumentType` {
    `REGULAR`,`MEDIA`;

    companion object
}

data class `HistoryMetadata` (
    var `url`: kotlin.String,
    var `title`: kotlin.String?,
    var `previewImageUrl`: kotlin.String?,
    var `createdAt`: kotlin.Long,
    var `updatedAt`: kotlin.Long,
    var `totalViewTime`: kotlin.Int,
    var `searchTerm`: kotlin.String?,
    var `documentType`: mozilla.appservices.places.uniffi.`DocumentType`,
    var `referrerUrl`: kotlin.String?,
) {
    

    companion object
}

data class `Dummy` (
    var `md`: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`>?,
) {
    

    companion object
}

data class `HistoryHighlight` (
    var `score`: kotlin.Double,
    var `placeId`: kotlin.Int,
    var `url`: kotlin.String,
    var `title`: kotlin.String?,
    var `previewImageUrl`: kotlin.String?,
) {
    

    companion object
}

data class `HistoryHighlightWeights` (
    var `viewTime`: kotlin.Double,
    var `frequency`: kotlin.Double,
) {
    

    companion object
}

data class `HistoryMetadataObservation` (
    var `url`: kotlin.String,
    var `referrerUrl`: kotlin.String? = null,
    var `searchTerm`: kotlin.String? = null,
    var `viewTime`: kotlin.Int? = null,
    var `documentType`: mozilla.appservices.places.uniffi.`DocumentType`? = null,
    var `title`: kotlin.String? = null,
) {
    

    companion object
}

data class `HistoryMigrationResult` (
    var `numTotal`: kotlin.UInt,
    var `numSucceeded`: kotlin.UInt,
    var `numFailed`: kotlin.UInt,
    var `totalDuration`: kotlin.ULong,
) {
    

    companion object
}

enum class `VisitType` {
    `LINK`,`TYPED`,`BOOKMARK`,`EMBED`,`REDIRECT_PERMANENT`,`REDIRECT_TEMPORARY`,`DOWNLOAD`,`FRAMED_LINK`,`RELOAD`,`UPDATE_PLACE`;

    companion object
}

data class `HistoryVisitInfo` (
    var `url`: mozilla.appservices.places.uniffi.`Url`,
    var `title`: kotlin.String?,
    var `timestamp`: mozilla.appservices.places.uniffi.`PlacesTimestamp`,
    var `visitType`: mozilla.appservices.places.uniffi.`VisitType`,
    var `isHidden`: kotlin.Boolean,
    var `previewImageUrl`: mozilla.appservices.places.uniffi.`Url`?,
    var `isRemote`: kotlin.Boolean,
) {
    

    companion object
}

data class `HistoryVisitInfosWithBound` (
    var `infos`: kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`>,
    var `bound`: kotlin.Long,
    var `offset`: kotlin.Long,
) {
    

    companion object
}

sealed class `BookmarkPosition` {
    data class `Specific`(val `pos`: kotlin.UInt,) : `BookmarkPosition`()
    object `Append` : `BookmarkPosition`()
    
    
    

    companion object
}

data class `InsertableBookmark` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`? = null,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`,
    var `position`: mozilla.appservices.places.uniffi.`BookmarkPosition`,
    var `dateAdded`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
    var `lastModified`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
    var `url`: mozilla.appservices.places.uniffi.`Url`,
    var `title`: kotlin.String? = null,
) {
    

    companion object
}

data class `InsertableBookmarkSeparator` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`? = null,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`,
    var `position`: mozilla.appservices.places.uniffi.`BookmarkPosition`,
    var `dateAdded`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
    var `lastModified`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
) {
    

    companion object
}

data class `InsertableBookmarkFolder` (
    var `guid`: mozilla.appservices.places.uniffi.`Guid`? = null,
    var `parentGuid`: mozilla.appservices.places.uniffi.`Guid`,
    var `position`: mozilla.appservices.places.uniffi.`BookmarkPosition`,
    var `dateAdded`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
    var `lastModified`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
    var `title`: kotlin.String? = null,
    var `children`: kotlin.collections.List<mozilla.appservices.places.uniffi.`InsertableBookmarkItem`>,
) {
    

    companion object
}

sealed class `InsertableBookmarkItem` {
    data class `Bookmark`(val `b`: mozilla.appservices.places.uniffi.`InsertableBookmark`,) : `InsertableBookmarkItem`()
    data class `Folder`(val `f`: mozilla.appservices.places.uniffi.`InsertableBookmarkFolder`,) : `InsertableBookmarkItem`()
    data class `Separator`(val `s`: mozilla.appservices.places.uniffi.`InsertableBookmarkSeparator`,) : `InsertableBookmarkItem`()
    
    

    companion object
}

enum class `HistoryMetadataPageMissingBehavior` {
    `INSERT_PAGE`,`IGNORE_OBSERVATION`;

    companion object
}

data class `NoteHistoryMetadataObservationOptions` (
    var `ifPageMissing`: mozilla.appservices.places.uniffi.`HistoryMetadataPageMissingBehavior` = HistoryMetadataPageMissingBehavior.IGNORE_OBSERVATION,
) {
    

    companion object
}

data class `PlacesRunMaintenanceOptions` (
    var `dbSizeLimit`: kotlin.UInt,
    var `pruneLimit`: kotlin.UInt = 12u,
) {
    

    companion object
}

data class `SearchResult` (
    var `url`: mozilla.appservices.places.uniffi.`Url`,
    var `title`: kotlin.String,
    var `frecency`: kotlin.Long,
) {
    

    companion object
}

data class `TopFrecentSiteInfo` (
    var `url`: mozilla.appservices.places.uniffi.`Url`,
    var `title`: kotlin.String?,
) {
    

    companion object
}

data class `VisitObservation` (
    var `url`: mozilla.appservices.places.uniffi.`Url`,
    var `title`: kotlin.String? = null,
    var `visitType`: mozilla.appservices.places.uniffi.`VisitType`?,
    var `isError`: kotlin.Boolean? = null,
    var `isRedirectSource`: kotlin.Boolean? = null,
    var `isPermanentRedirectSource`: kotlin.Boolean? = null,
    var `at`: mozilla.appservices.places.uniffi.`PlacesTimestamp`? = null,
    var `referrer`: mozilla.appservices.places.uniffi.`Url`? = null,
    var `isRemote`: kotlin.Boolean? = null,
    var `previewImageUrl`: mozilla.appservices.places.uniffi.`Url`? = null,
) {
    

    companion object
}

enum class `ConnectionType` {
    `READ_ONLY`,`READ_WRITE`,`SYNC`;

    companion object
}

enum class `FrecencyThresholdOption` {
    `NONE`,`SKIP_ONE_TIME_PAGES`;

    companion object
}

sealed class `PlacesApiException` : Exception() {
    
    class `UnexpectedPlacesException`(val `reason`: kotlin.String,) : `PlacesApiException`()
    
    
    class `UrlParseFailed`(val `reason`: kotlin.String,) : `PlacesApiException`()
    
    
    class `PlacesConnectionBusy`(val `reason`: kotlin.String,) : `PlacesApiException`()
    
    
    class `OperationInterrupted`(val `reason`: kotlin.String,) : `PlacesApiException`()
    
    
    class `UnknownBookmarkItem`(val `reason`: kotlin.String,) : `PlacesApiException`()
    
    
    class `InvalidBookmarkOperation`(val `reason`: kotlin.String,) : `PlacesApiException`()
    
    
    

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `VisitTransitionSet` = kotlin.Int
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

open class `SqlInterruptHandle` : SqlInterruptHandleInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.places.uniffi.uniffi.Scaffolding.objectFree300(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.places.uniffi.uniffi.Scaffolding.objectCloneHandle300(uniffiHandle)
    }

    override public fun `interrupt`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef300(this)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesSqlInterruptHandleInterrupt(
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

open class `PlacesConnection` : PlacesConnectionInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.places.uniffi.uniffi.Scaffolding.objectFree286(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.places.uniffi.uniffi.Scaffolding.objectCloneHandle286(uniffiHandle)
    }

    override public fun `acceptResult`(`searchString`: kotlin.String, `url`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`searchString`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerString(`url`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionAcceptResult(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `applyObservation`(`visit`: mozilla.appservices.places.uniffi.`VisitObservation`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType287(`visit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionApplyObservation(
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
    }
    override public fun `bookmarksCountBookmarksInTrees`(`folderGuids`: kotlin.collections.List<mozilla.appservices.places.uniffi.`Guid`>): kotlin.UInt {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType260(`folderGuids`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksCountBookmarksInTrees(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftUInt(uniffiReturn)
    }
    override public fun `bookmarksDelete`(`id`: mozilla.appservices.places.uniffi.`Guid`): kotlin.Boolean {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType255(`id`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksDelete(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `bookmarksDeleteEverything`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksDeleteEverything(
        uniffiArgLowered0,
    )
    }
    override public fun `bookmarksGetAllWithUrl`(`url`: kotlin.String): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`url`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksGetAllWithUrl(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType262(uniffiReturn)
    }
    override public fun `bookmarksGetByGuid`(`guid`: mozilla.appservices.places.uniffi.`Guid`, `getDirectChildren`: kotlin.Boolean): mozilla.appservices.places.uniffi.`BookmarkItem`? {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType255(`guid`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerBoolean(`getDirectChildren`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksGetByGuid(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return uniffiReturn

    }
    override public fun `bookmarksGetRecent`(`limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksGetRecent(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType262(uniffiReturn)
    }
    override public fun `bookmarksGetTree`(`itemGuid`: mozilla.appservices.places.uniffi.`Guid`): mozilla.appservices.places.uniffi.`BookmarkItem`? {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType255(`itemGuid`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksGetTree(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `bookmarksGetUrlForKeyword`(`keyword`: kotlin.String): mozilla.appservices.places.uniffi.`Url`? {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`keyword`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksGetUrlForKeyword(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `bookmarksInsert`(`bookmark`: mozilla.appservices.places.uniffi.`InsertableBookmarkItem`): mozilla.appservices.places.uniffi.`Guid` {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType276(`bookmark`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksInsert(
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
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType255(uniffiReturn)
    }
    override public fun `bookmarksSearch`(`query`: kotlin.String, `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`BookmarkItem`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`query`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksSearch(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType262(uniffiReturn)
    }
    override public fun `bookmarksUpdate`(`data`: mozilla.appservices.places.uniffi.`BookmarkUpdateInfo`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType289(`data`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionBookmarksUpdate(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
    )
    }
    override public fun `deleteEverythingHistory`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionDeleteEverythingHistory(
        uniffiArgLowered0,
    )
    }
    override public fun `deleteVisit`(`url`: kotlin.String, `timestamp`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`url`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`timestamp`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionDeleteVisit(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `deleteVisitsBetween`(`start`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `end`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`start`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`end`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionDeleteVisitsBetween(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `deleteVisitsFor`(`url`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`url`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionDeleteVisitsFor(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `getHistoryHighlights`(`weights`: mozilla.appservices.places.uniffi.`HistoryHighlightWeights`, `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryHighlight`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType290(`weights`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetHistoryHighlights(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType291(uniffiReturn)
    }
    override public fun `getHistoryMetadataBetween`(`start`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `end`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`start`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`end`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetHistoryMetadataBetween(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType265(uniffiReturn)
    }
    override public fun `getHistoryMetadataSince`(`since`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`since`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetHistoryMetadataSince(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType265(uniffiReturn)
    }
    override public fun `getLatestHistoryMetadataForUrl`(`url`: mozilla.appservices.places.uniffi.`Url`): mozilla.appservices.places.uniffi.`HistoryMetadata`? {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType257(`url`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetLatestHistoryMetadataForUrl(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getMostRecentHistoryMetadata`(`limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetMostRecentHistoryMetadata(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType265(uniffiReturn)
    }
    override public fun `getMostRecentSearchEntriesInHistoryMetadata`(`limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetMostRecentSearchEntriesInHistoryMetadata(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType265(uniffiReturn)
    }
    override public fun `getTopFrecentSiteInfos`(`numItems`: kotlin.Int, `thresholdOption`: mozilla.appservices.places.uniffi.`FrecencyThresholdOption`): kotlin.collections.List<mozilla.appservices.places.uniffi.`TopFrecentSiteInfo`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`numItems`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType294(`thresholdOption`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetTopFrecentSiteInfos(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType295(uniffiReturn)
    }
    override public fun `getVisitCount`(`excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType297(`excludeTypes`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisitCount(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftLong(uniffiReturn)
    }
    override public fun `getVisitCountForHost`(`host`: kotlin.String, `before`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.Long {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`host`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`before`)
    val uniffiArgLowered3 = mozilla.appservices.places.uniffi.uniffi.lowerType297(`excludeTypes`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisitCountForHost(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftLong(uniffiReturn)
    }
    override public fun `getVisitInfos`(`startDate`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `endDate`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`startDate`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`endDate`)
    val uniffiArgLowered3 = mozilla.appservices.places.uniffi.uniffi.lowerType297(`excludeTypes`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisitInfos(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType271(uniffiReturn)
    }
    override public fun `getVisitPage`(`offset`: kotlin.Long, `count`: kotlin.Long, `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryVisitInfo`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerLong(`offset`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerLong(`count`)
    val uniffiArgLowered3 = mozilla.appservices.places.uniffi.uniffi.lowerType297(`excludeTypes`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisitPage(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType271(uniffiReturn)
    }
    override public fun `getVisitPageWithBound`(`bound`: kotlin.Long, `offset`: kotlin.Long, `count`: kotlin.Long, `excludeTypes`: mozilla.appservices.places.uniffi.`VisitTransitionSet`): mozilla.appservices.places.uniffi.`HistoryVisitInfosWithBound` {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerLong(`bound`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerLong(`offset`)
    val uniffiArgLowered3 = mozilla.appservices.places.uniffi.uniffi.lowerLong(`count`)
    val uniffiArgLowered4 = mozilla.appservices.places.uniffi.uniffi.lowerType297(`excludeTypes`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisitPageWithBound(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
        uniffiArgLowered4,
    )
    return uniffiReturn

    }
    override public fun `getVisited`(`urls`: kotlin.collections.List<kotlin.String>): kotlin.collections.List<kotlin.Boolean> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType16(`urls`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisited(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType162(uniffiReturn)
    }
    override public fun `getVisitedUrlsInRange`(`start`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `end`: mozilla.appservices.places.uniffi.`PlacesTimestamp`, `includeRemote`: kotlin.Boolean): kotlin.collections.List<mozilla.appservices.places.uniffi.`Url`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`start`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`end`)
    val uniffiArgLowered3 = mozilla.appservices.places.uniffi.uniffi.lowerBoolean(`includeRemote`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionGetVisitedUrlsInRange(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType299(uniffiReturn)
    }
    override public fun `matchUrl`(`query`: kotlin.String): mozilla.appservices.places.uniffi.`Url`? {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`query`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionMatchUrl(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `metadataDelete`(`url`: mozilla.appservices.places.uniffi.`Url`, `referrerUrl`: mozilla.appservices.places.uniffi.`Url`?, `searchTerm`: kotlin.String?): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType257(`url`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType270(`referrerUrl`)
    val uniffiArgLowered3 = mozilla.appservices.places.uniffi.uniffi.lowerOptionString(`searchTerm`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionMetadataDelete(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2.v0,
        uniffiArgLowered2.v1,
        uniffiArgLowered3,
    )
    }
    override public fun `metadataDeleteOlderThan`(`olderThan`: mozilla.appservices.places.uniffi.`PlacesTimestamp`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType256(`olderThan`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionMetadataDeleteOlderThan(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `metadataDeleteSearchTerms`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionMetadataDeleteSearchTerms(
        uniffiArgLowered0,
    )
    }
    override public fun `newInterruptHandle`(): mozilla.appservices.places.uniffi.`SqlInterruptHandle` {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionNewInterruptHandle(
        uniffiArgLowered0,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType300(uniffiReturn)
    }
    override public fun `noteHistoryMetadataObservation`(`data`: mozilla.appservices.places.uniffi.`HistoryMetadataObservation`, `options`: mozilla.appservices.places.uniffi.`NoteHistoryMetadataObservationOptions`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType301(`data`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerType302(`options`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionNoteHistoryMetadataObservation(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
        uniffiArgLowered1.v5,
        uniffiArgLowered1.v6,
        uniffiArgLowered2,
    )
    }
    override public fun `placesHistoryImportFromIos`(`dbPath`: kotlin.String, `lastSyncTimestamp`: kotlin.Long): mozilla.appservices.places.uniffi.`HistoryMigrationResult` {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`dbPath`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerLong(`lastSyncTimestamp`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionPlacesHistoryImportFromIos(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return uniffiReturn

    }
    override public fun `queryAutocomplete`(`search`: kotlin.String, `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`SearchResult`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`search`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionQueryAutocomplete(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType304(uniffiReturn)
    }
    override public fun `queryHistoryMetadata`(`query`: kotlin.String, `limit`: kotlin.Int): kotlin.collections.List<mozilla.appservices.places.uniffi.`HistoryMetadata`> {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerString(`query`)
    val uniffiArgLowered2 = mozilla.appservices.places.uniffi.uniffi.lowerInt(`limit`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionQueryHistoryMetadata(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType265(uniffiReturn)
    }
    override public fun `runMaintenance`(`options`: mozilla.appservices.places.uniffi.`PlacesRunMaintenanceOptions`): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef286(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType306(`options`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesConnectionRunMaintenance(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
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

open class `PlacesApi` : PlacesApiInterface, uniffi.Disposable, AutoCloseable {
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
            mozilla.appservices.places.uniffi.uniffi.Scaffolding.objectFree253(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return mozilla.appservices.places.uniffi.uniffi.Scaffolding.objectCloneHandle253(uniffiHandle)
    }

    override public fun `newConnection`(`connType`: mozilla.appservices.places.uniffi.`ConnectionType`): mozilla.appservices.places.uniffi.`PlacesConnection` {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerObjectRef253(this)
    val uniffiArgLowered1 = mozilla.appservices.places.uniffi.uniffi.lowerType285(`connType`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesApiNewConnection(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType286(uniffiReturn)
    }
    override public fun `registerWithSyncManager`(): Unit {
        
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerType253(this)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.methodPlacesPlacesApiRegisterWithSyncManager(
        uniffiArgLowered0,
    )
    }
    
    

    companion object {
        
    }
}
public fun `placesApiNew`(`dbPath`: kotlin.String): mozilla.appservices.places.uniffi.`PlacesApi` {
    val uniffiArgLowered0 = mozilla.appservices.places.uniffi.uniffi.lowerString(`dbPath`)

    val uniffiReturn = mozilla.appservices.places.uniffi.uniffi.Scaffolding.functionPlacesPlacesApiNew(
        uniffiArgLowered0,
    )
    return mozilla.appservices.places.uniffi.uniffi.liftType253(uniffiReturn)
}