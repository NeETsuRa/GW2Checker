package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id of the node
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:

Call Options:
    https://api.guildwars2.com/v2/nodes --> List of all nodes
    https://api.guildwars2.com/v2/nodes/ghost_pepper_node
*/
class Nodes {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.nodes
}