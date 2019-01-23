package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (string) - The API key that was requested.
    name (string) - The name given to the API key by the account owner. Warning: The value of this field is not escaped and may contain valid HTML, JavaScript, other code. Handle with care.
    permissions (array) - Array of strings describing which permissions the API key has. The array can contain any of:
        account - Grants access to the /v2/account endpoint (This permission is required for all API keys).
        builds - Grants access to view each character's equipped specializations and gear.
        characters - Grants access to the /v2/characters endpoint.
        guilds - Grants access to guild info under the /v2/guild/:id/ sub-endpoints.
        inventories - Grants access to inventories in the /v2/characters, /v2/account/bank, and /v2/account/materials endpoints.
        progression - Grants access to achievements, dungeon unlock status, mastery point assignments, and general PvE progress.
        pvp - Grants access to the /v2/pvp sub-endpoints. (i.e. /v2/pvp/games, /v2/pvp/stats)
        tradingpost - Grants access to the /v2/commerce/transactions endpoint.
        unlocks - Grants access to the /v2/account/skins and /v2/account/dyes endpoints.
        wallet - Grants access to the /v2/account/wallet endpoint.
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    none
Call Options:
     https://api.guildwars2.com/v2/tokeninfo

*/
object TokenInfo {
    //Authorization: Bearer <API key>
    val url = ""+ Properties.APIUrl+ GW2_API_V2.tokeninfo
}