package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (integer) (default/null value: 0) - The <codeid</code> of the pet.
    name (string) (default/null value: "") - The name of the pet.
    description (string) (default/null value: "") - The description of the pet.
    icon (string) (default/null value: "") - The icon uri for the pet.
    skills (array of objects)
        id (number) - The id of the skill, to be resolved against v2/skills.
*/
/*
Connected Endpoints:

*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    page - (Optional; integer)
    page_size - (Optional; integer)
    ids - (Optional; Comma Delimited List|all) Request an array of pets for the specified ids or all pets. Cannot be used when using the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/pets --> list of all pets
    https://api.guildwars2.com/v2/pets/33
    https://api.guildwars2.com/v2/pets?ids=42
*/
class Pets {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.pets
}