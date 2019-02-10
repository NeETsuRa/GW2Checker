package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (string) - The name of the dungeon.
    wings (array of objects) - An array of object containing the following:
        id (string) - The given name for the dungeon path.
        events (array of objects)
            id (string) - The event/encounter name.
            type (string) - The type of events. Can be either Checkpoint, or Boss

*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang (string, optional) – Request localized responses.

Call Options:
    https://api.guildwars2.com/v2/raids
    https://api.guildwars2.com/v2/raids/forsaken_thicket
*/
class Raids {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.raids
}