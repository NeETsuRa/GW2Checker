package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (integer) (default/null value: 0) - The id of the story.
    season (string) (default/null value: "") - The id for the story season; resolvable against v2/stories/seasons.
    name (string) (default/null value: "") - The name of the story.
    description (string) (default/null value: "") - The description of the story.
    timeline (string) (default/null value: "") - The (in-game, not real-world) date of the story.
    level (integer) (default/null value: 1) - The minimum level required for a character to begin this story.
    order (integer) (default/null value: 0) - The order in which this story is displayed in the Story Journal.
    chapters (array of object) (default/null value: {}) - An array of chapter objects providing details about the chapters for this story. Each object may contain the following values:
        name (string) (default/null value: "") - The name of the chapter.
    races (array of string) (default/null value: {}) (Optional) - When present, provides a list of races that are eligible to participate in this story.
    flags (array of string) (default/null value: {}) (Optional) - When present, provides a list of additional requirements for a character to participate in this story.
*/
/*
Connected Endpoints:
    /v2/stories/seasons
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    page - (Optional; integer)
    page_size - (Optional; integer)
    id - (Optional) Request the story for the specified id. Cannot be used when specifying the id endpoint or ids parameter.
    ids - (Optional; Comma Delimited List|all) Request an array of stories for the specified ids or all stories. Cannot be used when using the id endpoint or id parameter.

Call Options:
    https://api.guildwars2.com/v2/stories --> List of all the storys
    https://api.guildwars2.com/v2/stories/1
    https://api.guildwars2.com/v2/stories?ids=41
    https://api.guildwars2.com/v2/stories?id=15
*/
class Stories {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.stories
}