package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (number) – The quaggan identifier.
    url – The URL to the quaggan image.
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/quaggans --> list of all wuaggans
    https://api.guildwars2.com/v2/quaggans/box
*/
object Quaggans {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.quaggans
}