package enums

/**
 * Created by nejc.ravnjak on 17.01.19.
 */
enum class GW2_API_V2 (val value: String){
    account("/v2/account"),
    account_achievements("/v2/account/achievements"),
    account_bank("/v2/account/bank"),
    account_dungeons("/v2/account/dungeons"),
    account_dyes("/v2/account/dyes"),
    account_finishers("/v2/account/finishers"),
    account_gliders("/v2/account/gliders"),
    account_home("/v2/account/home"),
    account_home_cats("/v2/account/home/cats"),
    account_home_nodes("/v2/account/home/nodes"),
    account_inventory("/v2/account/inventory"),
    account_mailcarriers("/v2/account/mailcarriers"),
    account_masteries("/v2/account/masteries"),
    account_mastery_points("/v2/account/mastery/points"),
    account_materials("/v2/account/materials"),
    account_minis("/v2/account/minis"),
    account_mounts("/v2/account/mounts"),
    account_mounts_skins("/v2/account/mounts/skins"),
    account_mounts_types("/v2/account/mounts/types"),
    account_outfits("/v2/account/outfits"),
    account_pvp_heroes("/v2/account/pvp/heroes"),
    account_raids("/v2/account/raids"),
    account_recipes("/v2/account/recipes"),
    account_skins("/v2/account/skins"),
    account_titles("/v2/account/titles"),
    account_wallet("/v2/account/wallet"),
    achievements("/v2/achievements"),
    achievements_categories("/v2/achievements/categories"),
    achievements_daily("/v2/achievements/daily"),
    achievements_daily_tomorrow("/v2/achievements/daily/tomorrow"),
    achievements_groups("/v2/achievements/groups"),
    backstory("/v2/backstory"),
    backstory_answers("/v2/backstory/answers"),
    backstory_questions("/v2/backstory/questions"),
    build("/v2/build"),
    cats("/v2/cats"),
    characters("/v2/characters"),
    characters_CaracterName_backstory("/v2/characters/:id/backstory"),//CaracterName
    characters_CaracterName_core("/v2/characters/:id/core"),//CaracterName
    characters_CaracterName_crafting("/v2/characters/:id/crafting"),//CaracterName
    characters_CaracterName_equipment("/v2/characters/:id/equipment"),//CaracterName
    characters_CaracterName_heropoints("/v2/characters/:id/heropoints"),//CaracterName
    characters_CaracterName_inventory("/v2/characters/:id/inventory"),//CaracterName
    characters_CaracterName_skills("/v2/characters/:id/skills"),//CaracterName
    characters_CaracterName_specializations("/v2/characters/:id/specializations"),//CaracterName
    characters_CaracterName_training("/v2/characters/:id/training"),//CaracterName
    colors("/v2/colors"),
    //commerce("/v2/commerce (returns 404/503 errors if requested, directly request the sub-endpoints below)"),
    commerce_delivery("/v2/commerce/delivery"),
    commerce_exchange("/v2/commerce/exchange"),
    commerce_exchange_coins("/v2/commerce/exchange/coins"),
    commerce_exchange_gems("/v2/commerce/exchange/gems"),
    commerce_listings("/v2/commerce/listings"),
    commerce_prices("/v2/commerce/prices"),
    commerce_transactions("/v2/commerce/transactions"),
    continents("/v2/continents"),
    currencies("/v2/currencies"),
    dungeons("/v2/dungeons"),
    emblem("/v2/emblem"),
    emblem_backgrounds("/v2/emblem/backgrounds"),
    emblem_foregrounds("/v2/emblem/foregrounds"),
    files("/v2/files"),
    finishers("/v2/finishers"),
    gliders("/v2/gliders"),
    //guild("/v2/guild (returns 404/503 errors if requested, directly request the sub-endpoints below)"),
    guild_GuildID("/v2/guild/:id"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_log("/v2/guild/:id/log"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_members("/v2/guild/:id/members"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_ranks("/v2/guild/:id/ranks"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_stash("/v2/guild/:id/stash"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_storage("/v2/guild/:id/storage"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_teams("/v2/guild/:id/teams"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_treasury("/v2/guild/:id/treasury"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_GuildID_upgrades("/v2/guild/:id/upgrades"),//GuildID as 4BBB52AA-D768-4FC6-8EDE-C299F2822F0F
    guild_permissions("/v2/guild/permissions"),
    guild_search("/v2/guild/search"),
    guild_upgrades("/v2/guild/upgrades"),
    items("/v2/items"),
    itemstats("/v2/itemstats"),
    legends("/v2/legends"),
    mailcarriers("/v2/mailcarriers"),
    maps("/v2/maps"),
    masteries("/v2/masteries"),
    materials("/v2/materials"),
    minis("/v2/minis"),
    mounts("/v2/mounts"),
    mounts_skins("/v2/mounts/skins"),
    mounts_types("/v2/mounts/types"),
    nodes("/v2/nodes"),
    outfits("/v2/outfits"),
    pets("/v2/pets"),
    professions("/v2/professions"),
    pvp("/v2/pvp"),
    pvp_amulets("/v2/pvp/amulets"),
    pvp_games("/v2/pvp/games"),
    pvp_heroes("/v2/pvp/heroes"),
    pvp_ranks("/v2/pvp/ranks"),
    pvp_seasons("/v2/pvp/seasons"),
    pvp_seasons_leaderboards("/v2/pvp/seasons/leaderboards"),
    pvp_standings("/v2/pvp/standings"),
    pvp_stats("/v2/pvp/stats"),
    quaggans("/v2/quaggans"),
    races("/v2/races"),
    raids("/v2/raids"),
    recipes("/v2/recipes"),
    recipes_search("/v2/recipes/search"),
    skills("/v2/skills"),
    skins("/v2/skins"),
    specializations("/v2/specializations"),
    stories("/v2/stories"),
    stories_seasons("/v2/stories/seasons"),
    titles("/v2/titles"),
    tokeninfo("/v2/tokeninfo"),
    traits("/v2/traits"),
    worlds("/v2/worlds"),
    wvw("/v2/wvw"),
    wvw_abilities("/v2/wvw/abilities"),
    wvw_matches("/v2/wvw/matches"),
    wvw_matches_stats_teams("/v2/wvw/matches/stats/teams"),
    wvw_objectives("/v2/wvw/objectives"),
    wvw_ranks("/v2/wvw/ranks"),
    wvw_upgrades("/v2/wvw/upgrades");
}