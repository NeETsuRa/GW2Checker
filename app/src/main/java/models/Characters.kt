package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    List: List of all characters
*/
/*
Connected Endpoints:
    /v2/characters/:id/backstory
    /v2/characters/:id/core
    /v2/characters/:id/crafting
    /v2/characters/:id/equipment
    /v2/characters/:id/heropoints
    /v2/characters/:id/inventory
    /v2/characters/:id/skills
    /v2/characters/:id/specializations
    /v2/characters/:id/training
*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/characters/
*/
object Characters {
    //Authorization: Bearer <API key>
    val url = ""+ Properties.APIUrl+ GW2_API_V2.characters;
}