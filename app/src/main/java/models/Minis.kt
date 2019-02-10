package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id - The mini id.
    name (string) – The mini name.
    unlock (string) – A description of how to unlock the mini (only present on a few entries).
    icon (string) – The mini icon.
    order (number) – The sort order that is used for displaying the mini in-game.
    item_id (number) – The item which unlocks the mini and can be resolved against /v2/items

*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – The language to query the names for.

Call Options:
    https://api.guildwars2.com/v2/minis/1
    https://api.guildwars2.com/v2/minis --> list of all minis
*/
class Minis {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.minis
}