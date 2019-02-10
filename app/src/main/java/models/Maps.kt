package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (number) – The map id.
    name (string) – The map name.
    min_level (number) – The minimal level of this map.
    max_level (number) – The maximum level of this map.
    default_floor (number) – The default floor of this map.
    floors (array) – A list of available floors for this map.
    region_id (number) – The id of the region this map belongs to.
    region_name (string, optional) – The name of the region this map belongs to.
    continent_id (number) – The id of the continent this map belongs to.
    continent_name (string) – The name of the continent this map belongs to.
    map_rect (array) – The dimensions of the map, given as the coordinates of the lower-left (SW) and upper-right (NE) corners.
    continent_rect (array) – The dimensions of the map within the continent coordinate system, given as the coordinates of the upper-left (NW) and lower-right (SE) corners.

    Special types
    Coordinate properties are two-element lists of the x and y position.
    Rectangle properties are two-element lists of coordinates.

*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – Show localized texts in the specified language.
Call Options:
    https://api.guildwars2.com/v2/maps/15
    https://api.guildwars2.com/v2/maps --> list of all maps
*/
class Maps {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.maps
}