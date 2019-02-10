package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (number) – The category id.
    name (string) – The category name.
    items (array of numbers) – The ids of the items in this category.
    order (integer) – The order in which the category appears in the material storage.
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – Request localized information.

Call Options:
    https://api.guildwars2.com/v2/materials/38
    https://api.guildwars2.com/v2/materials --> list of all materials
*/
class Materials {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.materials
}