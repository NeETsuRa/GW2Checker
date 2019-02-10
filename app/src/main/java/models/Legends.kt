package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (string) (default/null value: "") - The id of the Legend.
    swap (integer) (default/null value: 0) - The id of the profession (swap Legend) skill resolvable against v2/skills.
    heal (integer) (default/null value: 0) - The id of the heal skill resolvable against v2/skills.
    elite (integer) (default/null value: 0) - The id of the elite skill resolvable against v2/skills.
    utilities (array of integers) - List of ids of the utility skills resolvable against v2/skills.
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
    ids - (Optional; Comma Delimited List|all) Request an array of Legends for the specified ids or all Legends. Cannot be used when using the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/legends --> List of all legends
    https://api.guildwars2.com/v2/legends/Legend2
    https://api.guildwars2.com/v2/legends?ids=Legend4
*/
class Legends {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.legends
}