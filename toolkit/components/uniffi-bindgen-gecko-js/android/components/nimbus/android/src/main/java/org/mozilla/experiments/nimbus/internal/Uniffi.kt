package org.mozilla.experiments.nimbus.internal
import org.json.JSONObject
public interface `GeckoPrefHandler` {
    fun `getPrefsWithState`(): kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>>
    
    fun `setGeckoPrefsOriginalValues`(`originalGeckoPrefs`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`>): Unit
    
    fun `setGeckoPrefsState`(`newPrefsState`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): Unit
    
}
public interface `MetricsHandler` {
    fun `recordDatabaseLoad`(`event`: org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef`): Unit
    
    fun `recordDatabaseMigration`(`event`: org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef`): Unit
    
    fun `recordEnrollmentStatuses`(`enrollmentStatusExtras`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`>): Unit
    
    fun `recordFeatureActivation`(`event`: org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`): Unit
    
    fun `recordFeatureExposure`(`event`: org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`): Unit
    
    fun `recordMalformedFeatureConfig`(`event`: org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef`): Unit
    
    fun `recordRolloutsOptOut`(): Unit
    
    fun `recordStudiesOptOut`(): Unit
    
    fun `submitTargetingContext`(): Unit
    
}
public interface `NimbusStringHelperInterface` {
    fun `getUuid`(`template`: kotlin.String): kotlin.String?
    
    fun `stringFormat`(`template`: kotlin.String , `uuid`: kotlin.String? = null): kotlin.String
    
}
public interface `NimbusTargetingHelperInterface` {
    fun `evalJexl`(`expression`: kotlin.String): kotlin.Boolean
    
    fun `evalJexlDebug`(`expression`: kotlin.String): kotlin.String
    
}
public interface `NimbusClientInterface` {
    fun `advanceEventTime`(`bySeconds`: kotlin.Long): Unit
    
    fun `applyPendingExperiments`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `clearEvents`(): Unit
    
    fun `createStringHelper`(`additionalContext`: org.mozilla.experiments.nimbus.internal.`JsonObject`? = null): org.mozilla.experiments.nimbus.internal.`NimbusStringHelper`
    
    fun `createTargetingHelper`(`additionalContext`: org.mozilla.experiments.nimbus.internal.`JsonObject`? = null): org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper`
    
    fun `dumpStateToLog`(): Unit
    
    fun `enrollInFirefoxLab`(`slug`: kotlin.String): org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult`
    
    fun `fetchExperiments`(): Unit
    
    fun `getActiveExperiments`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`>
    
    fun `getAvailableExperiments`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`>
    
    fun `getAvailableFirefoxLabs`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`>
    
    fun `getExperimentBranch`(`id`: kotlin.String): kotlin.String?
    
    fun `getExperimentBranches`(`experimentSlug`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`>
    
    fun `getExperimentParticipation`(): kotlin.Boolean
    
    fun `getFeatureConfigVariables`(`featureId`: kotlin.String): kotlin.String?
    
    fun `getPreviousGeckoPrefStates`(`experimentSlug`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>?
    
    fun `getRolloutParticipation`(): kotlin.Boolean
    
    fun `initialize`(): Unit
    
    fun `isFetchEnabled`(): kotlin.Boolean
    
    fun `optInWithBranch`(`experimentSlug`: kotlin.String , `branch`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `optOut`(`experimentSlug`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `recordEvent`(`eventId`: kotlin.String , `count`: kotlin.Long = 1L): Unit
    
    fun `recordFeatureExposure`(`featureId`: kotlin.String , `slug`: kotlin.String?): Unit
    
    fun `recordMalformedFeatureConfig`(`featureId`: kotlin.String , `partId`: kotlin.String): Unit
    
    fun `recordPastEvent`(`eventId`: kotlin.String , `secondsAgo`: kotlin.Long , `count`: kotlin.Long = 1L): Unit
    
    fun `registerPreviousGeckoPrefStates`(`geckoPrefStates`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): Unit
    
    fun `resetEnrollments`(): Unit
    
    fun `resetTelemetryIdentifiers`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `setExperimentParticipation`(`optIn`: kotlin.Boolean): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `setExperimentsLocally`(`experimentsJson`: kotlin.String): Unit
    
    fun `setFetchEnabled`(`flag`: kotlin.Boolean): Unit
    
    fun `setRolloutParticipation`(`optIn`: kotlin.Boolean): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `unenrollForGeckoPref`(`prefState`: org.mozilla.experiments.nimbus.internal.`GeckoPrefState` , `prefUnenrollReason`: org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason`): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `unenrollFromAllFirefoxLabs`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>
    
    fun `unenrollFromFirefoxLab`(`slug`: kotlin.String): org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult`
    
}
public interface `RecordedContext` {
    fun `getEventQueries`(): kotlin.collections.Map<kotlin.String, kotlin.String>
    
    fun `record`(): Unit
    
    fun `setEventQueryValues`(`eventQueryValues`: kotlin.collections.Map<kotlin.String, kotlin.Double>): Unit
    
    fun `toJson`(): org.mozilla.experiments.nimbus.internal.`JsonObject`
    
}



/**
 * Typealias from the type name used in the UDL file to the custom type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `JsonObject` = JSONObject

data class `AppContext` (
    var `appName`: kotlin.String,
    var `appId`: kotlin.String,
    var `channel`: kotlin.String,
    var `appVersion`: kotlin.String?,
    var `appBuild`: kotlin.String?,
    var `architecture`: kotlin.String?,
    var `deviceManufacturer`: kotlin.String?,
    var `deviceModel`: kotlin.String?,
    var `locale`: kotlin.String?,
    var `os`: kotlin.String?,
    var `osVersion`: kotlin.String?,
    var `androidSdkVersion`: kotlin.String?,
    var `debugTag`: kotlin.String?,
    var `installationDate`: kotlin.Long?,
    var `customTargetingAttributes`: org.mozilla.experiments.nimbus.internal.`JsonObject`?,
) {
    

    companion object
}

data class `ExperimentBranch` (
    var `slug`: kotlin.String,
    var `ratio`: kotlin.Int,
) {
    

    companion object
}

data class `AvailableExperiment` (
    var `slug`: kotlin.String,
    var `userFacingName`: kotlin.String,
    var `userFacingDescription`: kotlin.String,
    var `branches`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`>,
    var `referenceBranch`: kotlin.String?,
) {
    

    companion object
}

data class `CalculatedAttributes` (
    var `daysSinceInstall`: kotlin.Int?,
    var `daysSinceUpdate`: kotlin.Int?,
    var `language`: kotlin.String?,
    var `region`: kotlin.String?,
) {
    

    companion object
}

data class `DatabaseLoadExtraDef` (
    var `corrupt`: kotlin.Boolean?,
    var `error`: kotlin.String?,
    var `initialVersion`: kotlin.UShort?,
    var `migratedVersion`: kotlin.UShort?,
    var `migrationError`: kotlin.String?,
) {
    

    companion object
}

data class `DatabaseMigrationExtraDef` (
    var `reason`: kotlin.String,
    var `fromVersion`: kotlin.UShort,
    var `toVersion`: kotlin.UShort,
    var `error`: kotlin.String?,
) {
    

    companion object
}

data class `EnrolledExperiment` (
    var `featureIds`: kotlin.collections.List<kotlin.String>,
    var `slug`: kotlin.String,
    var `userFacingName`: kotlin.String,
    var `userFacingDescription`: kotlin.String,
    var `branchSlug`: kotlin.String,
    var `isRollout`: kotlin.Boolean,
) {
    

    companion object
}

enum class `EnrollmentChangeEventType` {
    `ENROLLMENT`,`ENROLL_FAILED`,`DISQUALIFICATION`,`UNENROLLMENT`,`UNENROLL_FAILED`;

    companion object
}

data class `EnrollmentChangeEvent` (
    var `experimentSlug`: kotlin.String,
    var `branchSlug`: kotlin.String,
    var `reason`: kotlin.String?,
    var `change`: org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEventType`,
    var `featureIds`: kotlin.collections.List<kotlin.String>,
) {
    

    companion object
}

data class `EnrollmentSlugs` (
    var `slug`: kotlin.String,
    var `branchSlug`: kotlin.String,
) {
    

    companion object
}

enum class `PrefBranch` {
    `DEFAULT`,`USER`;

    companion object
}

/**
 * Typealias from the type name used in the UDL file to the builtin type.  This
 * is needed because the UDL type name is used in function/method signatures.
 * It's also what we have an external type that references a custom type.
 */
public typealias `PrefValue` = kotlin.String

data class `OriginalGeckoPref` (
    var `pref`: kotlin.String,
    var `branch`: org.mozilla.experiments.nimbus.internal.`PrefBranch`,
    var `value`: org.mozilla.experiments.nimbus.internal.`PrefValue`?,
) {
    

    companion object
}

data class `PreviousGeckoPrefState` (
    var `originalValue`: org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`,
    var `featureId`: kotlin.String,
    var `variable`: kotlin.String,
) {
    

    companion object
}

data class `EnrollmentStatusExtraDef` (
    var `branch`: kotlin.String?,
    var `conflictSlug`: kotlin.String?,
    var `errorString`: kotlin.String?,
    var `reason`: kotlin.String?,
    var `slug`: kotlin.String?,
    var `status`: kotlin.String?,
    var `prevGeckoPrefStates`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>?,
) {
    

    companion object
}

data class `FeatureExposureExtraDef` (
    var `branch`: kotlin.String?,
    var `slug`: kotlin.String,
    var `featureId`: kotlin.String,
) {
    

    companion object
}

enum class `FirefoxLabsEnrollStatus` {
    `ENROLLED`,`ALREADY_ENROLLED`,`NO_EXPERIMENT`,`NOT_FIREFOX_LABS_OPT_IN`,`FEATURE_CONFLICT`,`ERROR`;

    companion object
}

data class `FirefoxLabsEnrollResult` (
    var `status`: org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollStatus`,
    var `enrollmentChangeEvents`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>,
) {
    

    companion object
}

data class `FirefoxLabsMetadata` (
    var `slug`: kotlin.String,
    var `enrolled`: kotlin.Boolean,
    var `titleStringId`: kotlin.String,
    var `descriptionStringId`: kotlin.String,
    var `requiresRestart`: kotlin.Boolean,
    var `feedbackUrl`: kotlin.String?,
) {
    

    companion object
}

enum class `FirefoxLabsUnenrollStatus` {
    `UNENROLLED`,`ALREADY_UNENROLLED`,`NO_EXPERIMENT`,`NOT_FIREFOX_LABS_OPT_IN`,`ERROR`;

    companion object
}

data class `FirefoxLabsUnenrollResult` (
    var `status`: org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollStatus`,
    var `enrollmentChangeEvents`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`>,
) {
    

    companion object
}

data class `GeckoPref` (
    var `pref`: kotlin.String,
    var `branch`: org.mozilla.experiments.nimbus.internal.`PrefBranch`,
) {
    

    companion object
}

data class `PrefEnrollmentData` (
    var `experimentSlug`: kotlin.String,
    var `prefValue`: org.mozilla.experiments.nimbus.internal.`PrefValue`,
    var `featureId`: kotlin.String,
    var `variable`: kotlin.String,
) {
    

    companion object
}

data class `GeckoPrefState` (
    var `geckoPref`: org.mozilla.experiments.nimbus.internal.`GeckoPref`,
    var `geckoValue`: org.mozilla.experiments.nimbus.internal.`PrefValue`?,
    var `enrollmentValue`: org.mozilla.experiments.nimbus.internal.`PrefEnrollmentData`?,
    var `isUserSet`: kotlin.Boolean,
) {
    

    companion object
}

data class `MalformedFeatureConfigExtraDef` (
    var `branch`: kotlin.String?,
    var `slug`: kotlin.String?,
    var `featureId`: kotlin.String,
    var `part`: kotlin.String,
) {
    

    companion object
}

data class `NimbusServerSettings` (
    var `rsService`: mozilla.appservices.remotesettings.`RemoteSettingsService`,
    var `collectionName`: kotlin.String,
) {
    

    companion object
}

sealed class `NimbusException`(message: kotlin.String) : kotlin.Exception(message) {
    class `InvalidPersistedData`(message: kotlin.String) : `NimbusException`(message)
    class `RkvException`(message: kotlin.String) : `NimbusException`(message)
    class `IoException`(message: kotlin.String) : `NimbusException`(message)
    class `JsonException`(message: kotlin.String) : `NimbusException`(message)
    class `EvaluationException`(message: kotlin.String) : `NimbusException`(message)
    class `InvalidExpression`(message: kotlin.String) : `NimbusException`(message)
    class `InvalidFraction`(message: kotlin.String) : `NimbusException`(message)
    class `TryFromSliceException`(message: kotlin.String) : `NimbusException`(message)
    class `EmptyRatiosException`(message: kotlin.String) : `NimbusException`(message)
    class `OutOfBoundsException`(message: kotlin.String) : `NimbusException`(message)
    class `UrlParsingException`(message: kotlin.String) : `NimbusException`(message)
    class `UuidException`(message: kotlin.String) : `NimbusException`(message)
    class `InvalidExperimentFormat`(message: kotlin.String) : `NimbusException`(message)
    class `InvalidPath`(message: kotlin.String) : `NimbusException`(message)
    class `InternalException`(message: kotlin.String) : `NimbusException`(message)
    class `NoSuchExperiment`(message: kotlin.String) : `NimbusException`(message)
    class `NoSuchBranch`(message: kotlin.String) : `NimbusException`(message)
    class `DatabaseNotReady`(message: kotlin.String) : `NimbusException`(message)
    class `VersionParsingException`(message: kotlin.String) : `NimbusException`(message)
    class `BehaviorException`(message: kotlin.String) : `NimbusException`(message)
    class `TryFromIntException`(message: kotlin.String) : `NimbusException`(message)
    class `ParseIntException`(message: kotlin.String) : `NimbusException`(message)
    class `TransformParameterException`(message: kotlin.String) : `NimbusException`(message)
    class `ClientException`(message: kotlin.String) : `NimbusException`(message)
    class `UniFfiCallbackException`(message: kotlin.String) : `NimbusException`(message)
    class `RegexException`(message: kotlin.String) : `NimbusException`(message)

    companion object
}

enum class `PrefUnenrollReason` {
    `CHANGED`,`FAILED_TO_SET`;

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

open class GeckoPrefHandlerImpl : GeckoPrefHandler, uniffi.Disposable, AutoCloseable {
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
            org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectFree239(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectCloneHandle239(uniffiHandle)
    }

    override public fun `getPrefsWithState`(): kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef239(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusGeckoPrefHandlerGetPrefsWithState(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType224(uniffiReturn)
    }
    override public fun `setGeckoPrefsOriginalValues`(`originalGeckoPrefs`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`OriginalGeckoPref`>): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef239(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType227(`originalGeckoPrefs`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusGeckoPrefHandlerSetGeckoPrefsOriginalValues(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setGeckoPrefsState`(`newPrefsState`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef239(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType228(`newPrefsState`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusGeckoPrefHandlerSetGeckoPrefsState(
        uniffiArgLowered0,
        uniffiArgLowered1,
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

open class MetricsHandlerImpl : MetricsHandler, uniffi.Disposable, AutoCloseable {
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
            org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectFree237(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectCloneHandle237(uniffiHandle)
    }

    override public fun `recordDatabaseLoad`(`event`: org.mozilla.experiments.nimbus.internal.`DatabaseLoadExtraDef`): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType229(`event`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordDatabaseLoad(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
        uniffiArgLowered1.v4,
    )
    }
    override public fun `recordDatabaseMigration`(`event`: org.mozilla.experiments.nimbus.internal.`DatabaseMigrationExtraDef`): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType230(`event`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordDatabaseMigration(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
    )
    }
    override public fun `recordEnrollmentStatuses`(`enrollmentStatusExtras`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentStatusExtraDef`>): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType231(`enrollmentStatusExtras`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordEnrollmentStatuses(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `recordFeatureActivation`(`event`: org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType233(`event`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordFeatureActivation(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
    )
    }
    override public fun `recordFeatureExposure`(`event`: org.mozilla.experiments.nimbus.internal.`FeatureExposureExtraDef`): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType233(`event`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordFeatureExposure(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
    )
    }
    override public fun `recordMalformedFeatureConfig`(`event`: org.mozilla.experiments.nimbus.internal.`MalformedFeatureConfigExtraDef`): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType234(`event`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordMalformedFeatureConfig(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
        uniffiArgLowered1.v2,
        uniffiArgLowered1.v3,
    )
    }
    override public fun `recordRolloutsOptOut`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordRolloutsOptOut(
        uniffiArgLowered0,
    )
    }
    override public fun `recordStudiesOptOut`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerRecordStudiesOptOut(
        uniffiArgLowered0,
    )
    }
    override public fun `submitTargetingContext`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef237(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusMetricsHandlerSubmitTargetingContext(
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

open class `NimbusStringHelper` : NimbusStringHelperInterface, uniffi.Disposable, AutoCloseable {
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
            org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectFree242(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectCloneHandle242(uniffiHandle)
    }

    override public fun `getUuid`(`template`: kotlin.String): kotlin.String? {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef242(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`template`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusStringHelperGetUuid(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `stringFormat`(`template`: kotlin.String, `uuid`: kotlin.String?): kotlin.String {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef242(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`template`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerOptionString(`uuid`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusStringHelperStringFormat(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftString(uniffiReturn)
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

open class `NimbusTargetingHelper` : NimbusTargetingHelperInterface, uniffi.Disposable, AutoCloseable {
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
            org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectFree243(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectCloneHandle243(uniffiHandle)
    }

    override public fun `evalJexl`(`expression`: kotlin.String): kotlin.Boolean {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef243(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`expression`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusTargetingHelperEvalJexl(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `evalJexlDebug`(`expression`: kotlin.String): kotlin.String {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef243(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`expression`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusTargetingHelperEvalJexlDebug(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftString(uniffiReturn)
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

open class `NimbusClient` : NimbusClientInterface, uniffi.Disposable, AutoCloseable {
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
    constructor(`appCtx`: org.mozilla.experiments.nimbus.internal.`AppContext` , `recordedContext`: org.mozilla.experiments.nimbus.internal.`RecordedContext`? , `coenrollingFeatureIds`: kotlin.collections.List<kotlin.String> , `dbpath`: kotlin.String , `metricsHandler`: org.mozilla.experiments.nimbus.internal.`MetricsHandler` , `geckoPrefHandler`: org.mozilla.experiments.nimbus.internal.`GeckoPrefHandler`? , `remoteSettingsInfo`: org.mozilla.experiments.nimbus.internal.`NimbusServerSettings`?) {
        
        val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType235(`appCtx`)
        val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType236(`recordedContext`)
        val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType16(`coenrollingFeatureIds`)
        val uniffiArgLowered3 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`dbpath`)
        val uniffiArgLowered4 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType237(`metricsHandler`)
        val uniffiArgLowered5 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType238(`geckoPrefHandler`)
        val uniffiArgLowered6 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType240(`remoteSettingsInfo`)

        val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.constructorNimbusNimbusClientNew(
            uniffiArgLowered0.v0,
            uniffiArgLowered0.v1,
            uniffiArgLowered0.v2,
            uniffiArgLowered0.v3,
            uniffiArgLowered0.v4,
            uniffiArgLowered0.v5,
            uniffiArgLowered0.v6,
            uniffiArgLowered0.v7,
            uniffiArgLowered0.v8,
            uniffiArgLowered0.v9,
            uniffiArgLowered0.v10,
            uniffiArgLowered0.v11,
            uniffiArgLowered0.v12,
            uniffiArgLowered0.v13,
            uniffiArgLowered0.v14,
            uniffiArgLowered0.v15,
            uniffiArgLowered0.v16,
            uniffiArgLowered1,
            uniffiArgLowered2,
            uniffiArgLowered3,
            uniffiArgLowered4,
            uniffiArgLowered5,
            uniffiArgLowered6.v0,
            uniffiArgLowered6.v1,
            uniffiArgLowered6.v2,
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
            org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectFree4303(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectCloneHandle4303(uniffiHandle)
    }

    override public fun `advanceEventTime`(`bySeconds`: kotlin.Long): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerLong(`bySeconds`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientAdvanceEventTime(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `applyPendingExperiments`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientApplyPendingExperiments(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `clearEvents`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientClearEvents(
        uniffiArgLowered0,
    )
    }
    override public fun `createStringHelper`(`additionalContext`: org.mozilla.experiments.nimbus.internal.`JsonObject`?): org.mozilla.experiments.nimbus.internal.`NimbusStringHelper` {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType203(`additionalContext`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientCreateStringHelper(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType242(uniffiReturn)
    }
    override public fun `createTargetingHelper`(`additionalContext`: org.mozilla.experiments.nimbus.internal.`JsonObject`?): org.mozilla.experiments.nimbus.internal.`NimbusTargetingHelper` {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType203(`additionalContext`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientCreateTargetingHelper(
        uniffiArgLowered0,
        uniffiArgLowered1.v0,
        uniffiArgLowered1.v1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType243(uniffiReturn)
    }
    override public fun `dumpStateToLog`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientDumpStateToLog(
        uniffiArgLowered0,
    )
    }
    override public fun `enrollInFirefoxLab`(`slug`: kotlin.String): org.mozilla.experiments.nimbus.internal.`FirefoxLabsEnrollResult` {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`slug`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientEnrollInFirefoxLab(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `fetchExperiments`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientFetchExperiments(
        uniffiArgLowered0,
    )
    }
    override public fun `getActiveExperiments`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrolledExperiment`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetActiveExperiments(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType245(uniffiReturn)
    }
    override public fun `getAvailableExperiments`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`AvailableExperiment`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetAvailableExperiments(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType247(uniffiReturn)
    }
    override public fun `getAvailableFirefoxLabs`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`FirefoxLabsMetadata`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetAvailableFirefoxLabs(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType249(uniffiReturn)
    }
    override public fun `getExperimentBranch`(`id`: kotlin.String): kotlin.String? {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`id`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetExperimentBranch(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `getExperimentBranches`(`experimentSlug`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`ExperimentBranch`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`experimentSlug`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetExperimentBranches(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType205(uniffiReturn)
    }
    override public fun `getExperimentParticipation`(): kotlin.Boolean {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetExperimentParticipation(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `getFeatureConfigVariables`(`featureId`: kotlin.String): kotlin.String? {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`featureId`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetFeatureConfigVariables(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftOptionString(uniffiReturn)
    }
    override public fun `getPreviousGeckoPrefStates`(`experimentSlug`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`PreviousGeckoPrefState`>? {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`experimentSlug`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetPreviousGeckoPrefStates(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return uniffiReturn

    }
    override public fun `getRolloutParticipation`(): kotlin.Boolean {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientGetRolloutParticipation(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `initialize`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientInitialize(
        uniffiArgLowered0,
    )
    }
    override public fun `isFetchEnabled`(): kotlin.Boolean {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientIsFetchEnabled(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftBoolean(uniffiReturn)
    }
    override public fun `optInWithBranch`(`experimentSlug`: kotlin.String, `branch`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`experimentSlug`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`branch`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientOptInWithBranch(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `optOut`(`experimentSlug`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`experimentSlug`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientOptOut(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `recordEvent`(`eventId`: kotlin.String, `count`: kotlin.Long): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`eventId`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerLong(`count`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientRecordEvent(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `recordFeatureExposure`(`featureId`: kotlin.String, `slug`: kotlin.String?): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`featureId`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerOptionString(`slug`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientRecordFeatureExposure(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `recordMalformedFeatureConfig`(`featureId`: kotlin.String, `partId`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`featureId`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`partId`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientRecordMalformedFeatureConfig(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    }
    override public fun `recordPastEvent`(`eventId`: kotlin.String, `secondsAgo`: kotlin.Long, `count`: kotlin.Long): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`eventId`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerLong(`secondsAgo`)
    val uniffiArgLowered3 = org.mozilla.experiments.nimbus.internal.uniffi.lowerLong(`count`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientRecordPastEvent(
        uniffiArgLowered0,
        uniffiArgLowered1,
        uniffiArgLowered2,
        uniffiArgLowered3,
    )
    }
    override public fun `registerPreviousGeckoPrefStates`(`geckoPrefStates`: kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`GeckoPrefState`>): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType228(`geckoPrefStates`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientRegisterPreviousGeckoPrefStates(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `resetEnrollments`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientResetEnrollments(
        uniffiArgLowered0,
    )
    }
    override public fun `resetTelemetryIdentifiers`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientResetTelemetryIdentifiers(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `setExperimentParticipation`(`optIn`: kotlin.Boolean): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerBoolean(`optIn`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientSetExperimentParticipation(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `setExperimentsLocally`(`experimentsJson`: kotlin.String): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`experimentsJson`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientSetExperimentsLocally(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setFetchEnabled`(`flag`: kotlin.Boolean): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerBoolean(`flag`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientSetFetchEnabled(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `setRolloutParticipation`(`optIn`: kotlin.Boolean): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerBoolean(`optIn`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientSetRolloutParticipation(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `unenrollForGeckoPref`(`prefState`: org.mozilla.experiments.nimbus.internal.`GeckoPrefState`, `prefUnenrollReason`: org.mozilla.experiments.nimbus.internal.`PrefUnenrollReason`): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType226(`prefState`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType251(`prefUnenrollReason`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientUnenrollForGeckoPref(
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
        uniffiArgLowered2,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `unenrollFromAllFirefoxLabs`(): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentChangeEvent`> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientUnenrollFromAllFirefoxLabs(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType213(uniffiReturn)
    }
    override public fun `unenrollFromFirefoxLab`(`slug`: kotlin.String): org.mozilla.experiments.nimbus.internal.`FirefoxLabsUnenrollResult` {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectRef4303(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`slug`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusNimbusClientUnenrollFromFirefoxLab(
        uniffiArgLowered0,
        uniffiArgLowered1,
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

open class RecordedContextImpl : RecordedContext, uniffi.Disposable, AutoCloseable {
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
            org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectFree202(uniffiHandle)
        }
    }

    /**
     * @suppress
     */
    fun uniffiCloneHandle(): kotlin.Long {
        if (uniffiHandle == 0.toLong()) {
            throw uniffi.InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.objectCloneHandle202(uniffiHandle)
    }

    override public fun `getEventQueries`(): kotlin.collections.Map<kotlin.String, kotlin.String> {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef202(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusRecordedContextGetEventQueries(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType131(uniffiReturn)
    }
    override public fun `record`(): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef202(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusRecordedContextRecord(
        uniffiArgLowered0,
    )
    }
    override public fun `setEventQueryValues`(`eventQueryValues`: kotlin.collections.Map<kotlin.String, kotlin.Double>): Unit {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef202(this)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType25(`eventQueryValues`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusRecordedContextSetEventQueryValues(
        uniffiArgLowered0,
        uniffiArgLowered1,
    )
    }
    override public fun `toJson`(): org.mozilla.experiments.nimbus.internal.`JsonObject` {
        
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerObjectReceiverRef202(this)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.methodNimbusRecordedContextToJson(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType204(uniffiReturn)
    }
    
    

    companion object {
        
    }
}
public fun `getActiveEnrollments`(`dbPath`: kotlin.String): kotlin.collections.List<org.mozilla.experiments.nimbus.internal.`EnrollmentSlugs`> {
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`dbPath`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.functionNimbusGetActiveEnrollments(
        uniffiArgLowered0,
    )
    return org.mozilla.experiments.nimbus.internal.uniffi.liftType198(uniffiReturn)
}
public fun `getCalculatedAttributes`(`installationDate`: kotlin.Long? , `dbPath`: kotlin.String , `locale`: kotlin.String): org.mozilla.experiments.nimbus.internal.`CalculatedAttributes` {
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType56(`installationDate`)
    val uniffiArgLowered1 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`dbPath`)
    val uniffiArgLowered2 = org.mozilla.experiments.nimbus.internal.uniffi.lowerString(`locale`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.functionNimbusGetCalculatedAttributes(
        uniffiArgLowered0.v0,
        uniffiArgLowered0.v1,
        uniffiArgLowered1,
        uniffiArgLowered2,
    )
    return uniffiReturn

}
public fun `validateEventQueries`(`recordedContext`: org.mozilla.experiments.nimbus.internal.`RecordedContext`): Unit {
    val uniffiArgLowered0 = org.mozilla.experiments.nimbus.internal.uniffi.lowerType202(`recordedContext`)

    val uniffiReturn = org.mozilla.experiments.nimbus.internal.uniffi.Scaffolding.functionNimbusValidateEventQueries(
        uniffiArgLowered0,
    )
}