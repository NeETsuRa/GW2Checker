package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (string) - The id/name of the race.
    skills (array of numbers) - An array of skill ids resolvable against v2/skills.
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/races --> List of all the races
    https://api.guildwars2.com/v2/races/Asura
*/
class Races {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.races
}