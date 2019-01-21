package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    https://wiki.guildwars2.com/wiki/API:2/skills --> check online
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – Request localized information.

Call Options:
    https://api.guildwars2.com/v2/skills/14375
    https://api.guildwars2.com/v2/skills --> list of all skils
*/
object Skills {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.skills
}