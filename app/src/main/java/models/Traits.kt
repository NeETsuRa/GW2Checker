package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    check the link: https://wiki.guildwars2.com/wiki/API:2/traits
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – Request localized information.

Call Options:
    https://api.guildwars2.com/v2/traits/214
    https://api.guildwars2.com/v2/traits --> list of all traits
*/
class Traits {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.traits
}