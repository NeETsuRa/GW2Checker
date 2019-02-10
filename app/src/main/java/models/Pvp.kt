package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    ist of availeble endpoints
*/
/*
Connected Endpoints:
    /v2/pvp/amulets
    /v2/pvp/games
    /v2/pvp/heroes
    /v2/pvp/ranks
    /v2/pvp/seasons
        /v2/pvp/seasons/leaderboards
    /v2/pvp/standings
    /v2/pvp/stats

*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/pvp
*/
class Pvp {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.pvp
}