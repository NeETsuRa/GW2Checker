package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    The endpoint returns an array, each value being a string showing the WvW API endpoints
*/
/*
Connected Endpoints:
    /v2/wvw/abilities
    /v2/wvw/matches
        /v2/wvw/matches/stats/teams
    /v2/wvw/objectives
    /v2/wvw/ranks
    /v2/wvw/upgrades
*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/wvw
*/
object Wvw {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.wvw
}