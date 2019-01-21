package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (integer) (default/null value: 0) - The id of the mastery.
    name (string) (default/null value: "") - The name of the selected mastery.
    requirement (string) (default/null value: "") - The written out requirements to unlock the mastery track.
    order (integer) (default/null value: 0) - The order in which the mastery track appears in a list.
    background (string) (default/null value: "") - The background uri for the mastery track.
    region (string) (default/null value: "") - The in-game region in which the mastery track belongs.
    levels (array) - An array containing the information of each mastery level.
        name (string) (default/null value: "") - The name for the given mastery.
        description (string) (default/null value: "") - The in game description for the given mastery.
        instruction (string) (default/null value: "") - The in game instructions for the given mastery.
        icon (string) (default/null value: "") - The icon uri for the mastery.
        point_cost (integer) (default/null value: 0) - The amount of mastery points required to unlock the mastery.
        exp_cost (integer) (default/null value: 0) - The total amount of experience needed to train the given mastery level. This total is non-cumulative between levels.

*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    ids - (Optional; Comma Delimited List|all) Request an array of masteries for the specified ids or all masteries. Cannot be used when accessing the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/masteries -- list of all id's
    https://api.guildwars2.com/v2/masteries/1
    https://api.guildwars2.com/v2/masteries?ids=1,2&lang=fr
*/
object Masteries {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.masteries
}