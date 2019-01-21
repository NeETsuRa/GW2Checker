package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (string) – The file identifier.
    icon (string) – The URL to the image
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:

Call Options:
    https://api.guildwars2.com/v2/files?ids=all
    https://api.guildwars2.com/v2/files --> list of files
*/
object Files {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.files
}