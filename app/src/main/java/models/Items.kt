package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    https://wiki.guildwars2.com/wiki/API:2/items --> check on web; List loo long
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    ids - (Optional; Comma Delimited List) Request an array of items for the specified ids. Cannot be used when using the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/items --> all items

*/
object Items {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.items
}