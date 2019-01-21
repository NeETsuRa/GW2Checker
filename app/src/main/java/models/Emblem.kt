package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    list of emblems
*/
/*
Connected Endpoints:
    /v2/emblem/backgrounds
    /v2/emblem/foregrounds
*/
/*
Optional Parameters:

Call Options:
    https://api.guildwars2.com/v2/emblem --> list of emblems
*/
object Emblem {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.emblem

}