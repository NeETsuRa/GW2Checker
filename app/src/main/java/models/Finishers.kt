package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
For each requested finisher id, an object with the following properties is returned:
    id (integer) (default/null value: 0) - The id of the finisher.
    unlock_details (string) (default/null value: "") - A description explaining how to acquire the finisher.
    unlock_items (array of numbers) (optional) - An array of item ids used to unlock the finisher. Can be resolved against v2/items
    order (integer) (default/null value: 0) - The order in which the finisher appears in a list.
    icon (string) (default/null value: "") - The icon uri for the finisher.
    name (string) (default/null value: "") - The name of the finisher as it appears in-game.
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
    ids - (Optional; Comma Delimited List|all) Request an array of finishers for the specified ids or all finishers. Cannot be used when accessing the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/finishers/1
    https://api.guildwars2.com/v2/finishers?ids=2
    https://api.guildwars2.com/v2/finishers --> List of all
*/
class Finishers {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.finishers
}