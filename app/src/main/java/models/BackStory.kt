package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    List: This request will return an array of the endpoints that may be requested.
*/
/*
Connected Endpoints:
    /v2/backstory/answers
    /v2/backstory/questions
*/
/*
Optional Parameters:

Call Options:
    https://api.guildwars2.com/v2/backstory
*/
class BackStory {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.backstory
}