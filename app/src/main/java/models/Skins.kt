package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    https://wiki.guildwars2.com/wiki/API:2/skins --> check online
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – Request localized information.

Call Options:
    https://api.guildwars2.com/v2/skins/10
    https://api.guildwars2.com/v2/skins --> List of all the Skins
*/
class Skins {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.skins
}