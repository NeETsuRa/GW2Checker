package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    For each objective requested, the following object is returned as a response:

        id (string) - The name of the dungeon.
        paths (array of objects) - An array of object containing the following:
            id (string) - The given name for the dungeon path.
            type (string) - The type of the chosen path. Can be either Story or Explorable
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:

Call Options:
    https://api.guildwars2.com/v2/dungeons --> list of all Dungeons
    https://api.guildwars2.com/v2/dungeons/caudecus_manor
    https://api.guildwars2.com/v2/dungeons?lang=de
*/
class Dungeons {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.dungeons
}