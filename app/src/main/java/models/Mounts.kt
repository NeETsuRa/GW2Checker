package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    List of Sub categoryes
*/
/*
Connected Endpoints:
    /v2/mounts/skins
    /v2/mounts/types
*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/mounts
*/
object Mounts {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.mounts
}