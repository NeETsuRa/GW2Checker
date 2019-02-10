package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    For each requested glider id, an object with the following properties is returned:
        id (int eger) (default/null value: 0) - The id of the glider.
        unlock_items (array of numbers) (optional) - An array of item ids used to unlock the glider. Can be resolved against v2/items
        order (integer) (default/null value: 0) - The order in which the glider appears in a list.
        icon (string) (default/null value: "") - The icon uri for the glider.
        name (string) (default/null value: "") - The name of the glider as it appears in-game.
        description (string) - The in-game glider description.
        default_dyes</code (array of numbers) - List of dye <code>ids. Can be resolved against v2/colors.

*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    page - (Optional; integer)
    page_size - (Optional; integer)
    ids - (Optional; Comma Delimited List|all) Request an array of gliders for the specified ids or all gliders. Cannot be used when accessing the id endpoint
Call Options:
    https://api.guildwars2.com/v2/gliders/1
    https://api.guildwars2.com/v2/gliders --> list of all

*/
class Gliders {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.gliders
}