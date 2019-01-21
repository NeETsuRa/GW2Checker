package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (string) – The unique persistent account GUID.
    age (number) - The age of the account in seconds.
    name (string) – The unique account name with numerical suffix. It is possible that the name change. Do not rely on the name, use id instead.[1]
    world (number) – The id of the home world the account is assigned to. Can be resolved against /v2/worlds.
    guilds (array) – A list of guilds assigned to the given account.
    guild_leader (array) – A list of guilds the account is leader of.
    created (string) – An ISO-8601 standard timestamp of when the account was created.
    access (array) – A list of what content this account has access to. Possible values:
        None – should probably never happen
        PlayForFree – has not yet purchased the game
        GuildWars2 – has purchased the base game
        HeartOfThorns – has purchased Heart of Thorns
        PathOfFire – has purchased Path of Fire
    commander (boolean) – True if the player has bought a commander tag.
    fractal_level (number) – The account's personal fractal reward level. Requires the additional progression scope.
    daily_ap (number) – The daily AP the account has. Requires the additional progression scope.
    monthly_ap (number) – The monthly AP the account has. Requires the additional progression scope.
    wvw_rank (number) – The account's personal wvw rank. Requires the additional progression scope.
    */

/*
Connected Endpoints:
    /v2/account/achievements
    /v2/account/bank
    /v2/account/dungeons
    /v2/account/dyes
    /v2/account/finishers
    /v2/account/gliders
    /v2/account/home
        /v2/account/home/cats
        /v2/account/home/nodes
    /v2/account/inventory
    /v2/account/mailcarriers
    /v2/account/masteries
    /v2/account/mastery/points
    /v2/account/materials
    /v2/account/minis
    /v2/account/mounts
        /v2/account/mounts/skins
        /v2/account/mounts/types
    /v2/account/outfits
    /v2/account/pvp/heroes
    /v2/account/raids
    /v2/account/recipes
    /v2/account/skins
    /v2/account/titles
    /v2/account/wallet
*/

/*
Optional Parameters:
    None
Call Options:
    https://api.guildwars2.com/v2/account
    Authorization: Bearer <API key>
*/

object Account {
    //Authorization: Bearer <API key>
    val url = ""+Properties.APIUrl+GW2_API_V2.account;

}