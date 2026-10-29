package mozilla.appservices.sync15

enum class `DeviceType` {
    `DESKTOP`,`MOBILE`,`TABLET`,`VR`,`TV`,`UNKNOWN`;

    companion object
}

sealed class `EngineChoicesModel` {
    data class `Account`(val `enabledChanges`: kotlin.collections.Map<kotlin.String, kotlin.Boolean>,) : `EngineChoicesModel`()
    object `Device` : `EngineChoicesModel`()
    
    
    

    companion object
}