package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (integer) (default/null value: 0) - The id of the outfit.
    name (string) (default/null value: "") - The name of the outfit (this is also the outfit displayed over a character in-game.)
    icon (string/url) (default/null value: "") - The icon for the selected outfit.
    unlock_items (array of integers) - An array of item id which unlock this outfit; resolvable against v2/items.
*/
/*
Connected Endpoints:
    None
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    page - (Optional; integer)
    page_size - (Optional; integer)
    id - (Optional) Request the outfit for the specified id. Cannot be used when specifying the id endpoint or ids parameter.
    ids - (Optional; Comma Delimited List|all) Request an array of outfits for the specified ids or all outfits. Cannot be used when using the id endpoint or id parameter.

Call Options:
    https://api.guildwars2.com/v2/outfits --> List of all outfits
    https://api.guildwars2.com/v2/outfits/8
    https://api.guildwars2.com/v2/outfits?id=10
    https://api.guildwars2.com/v2/outfits?ids=40,45
    https://api.guildwars2.com/v2/outfits?id=20&lang=fr
*/
object Outfits {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.outfits
}