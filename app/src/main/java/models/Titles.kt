package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (integer) (default/null value: 0) - The id of the title.
    name (string) (default/null value: "") - The name of the title (this is also the title displayed over a character in-game.)
    achievement (integer) (default/null value: 0) (Now depreciated) - The id of the achievement that grants this title; resolvable against v2/achievements.
    achievements (array of integers) - The id of the achievement that grants this title; resolvable against v2/achievements.
    ap_required (number) - The amount of AP required to have said title.
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
    id - (Optional) Request the title for the specified id. Cannot be used when specifying the id endpoint or ids parameter.
    ids - (Optional; Comma Delimited List|all) Request an array of titles for the specified ids or all titles. Cannot be used when using the id endpoint or id parameter.

Call Options:
    https://api.guildwars2.com/v2/titles
    https://api.guildwars2.com/v2/titles/8
    https://api.guildwars2.com/v2/titles?id=10
    https://api.guildwars2.com/v2/titles?ids=30
    https://api.guildwars2.com/v2/titles?ids=40,90
    https://api.guildwars2.com/v2/titles?id=222&lang=es
*/
class Titles {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.titles
}