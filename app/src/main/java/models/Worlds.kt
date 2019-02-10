package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:

*/
/*
Connected Endpoints:
    id (number) – The world id.
    name (string) – The world name.
    population (string) – The world population level. One of: Low, Medium, High, VeryHigh, Full
*/
/*
Optional Parameters:
    lang – Request localized information.

Call Options:
    https://api.guildwars2.com/v2/worlds?ids=1001,1002,1003
    https://api.guildwars2.com/v2/worlds?ids=all
*/
class Worlds {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.worlds
}