package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    For each requested continent id, an object with the following properties is returned:
        id (number) – The id of the continent.
        name (string) – The name of the continent.
        continent_dims (array of two numbers) – The width and height dimensions of the continent.
        min_zoom (number) – The minimal zoom level for use with the map tile service.
        max_zoom (number) – The maximum zoom level for use with the map tile service.
        floors (array of numbers) – A list of floors available for this continent.
        Note: There are only two continents, Tyria and Mists.

    For each requested sector, an object with the following properties is returned:
        id (number) – The id of the sector.
        name (string) – The name of the sector.
        level (number) – The level of the sector.
        coord (array of two numbers) – The width and height dimensions of the continent.
        bounds (array of array of two numbers)
        chat_link (string)
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    https://api.guildwars2.com/v2/continents?ids=all&lang=en
        en (English, default)
        de (German)
        es (Spanish)
        fr (French)

Call Options:
    https://api.guildwars2.com/v2/continents?ids=all
*/
class Continents {
    val url = ""+ Properties.APIUrl+ GW2_API_V2.continents
}