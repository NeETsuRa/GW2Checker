package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (number) – The specialization's ID.
    name (string) – The name of the specialization.
    profession (string) – The profession that this specialization belongs to.
    elite (boolean) – true if this specialization is an Elite specialization, false otherwise.
    icon (string) – A URL to an icon of the specialization.
    background (string) – A URL to the background image of the specialization.
    minor_traits (array) – Contains a list of IDs specifying the minor traits in the specialization.
    major_traits (array) – Contains a list of IDs specifying the major traits in the specialization.

*/
/*
Connected Endpoints:
    None
*/
/*
Optional Parameters:
    lang – Request localized information.

Call Options:
    https://api.guildwars2.com/v2/specializations/1
    https://api.guildwars2.com/v2/specializations --> List of all Specialisations
*/
object Specializations {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.specializations
}