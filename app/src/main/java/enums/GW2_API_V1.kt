package enums

/**
 * Created by nejc.ravnjak on 17.01.19.
 * all endpoints for guild wars API1
 *
 * URL to API:
 *  https://wiki.guildwars2.com/wiki/API:1
 */
enum class GW2_API_V1(val endpoint: String) {
    Build("/v1/build.json"),
    Colors("/v1/colors.json"),
    Continents("/v1/continents.json"),
    Event_details("/v1/event_details.json"),
    Event_names("/v1/event_names.json"),
    Events("/v1/events.json"),
    Files("/v1/files.json"),
    Guild_details("/v1/guild_details.json"),
    Item_details("/v1/item_details.json"),
    Items("/v1/items.json"),
    Map_floor("/v1/map_floor.json"),
    Map_names("/v1/map_names.json"),
    Maps("/v1/maps.json"),
    Recipe_details("/v1/recipe_details.json"),
    Recipes("/v1/recipes.json"),
    Skin_details("/v1/skin_details.json"),
    Skins("/v1/skins.json"),
    World_names("/v1/world_names.json"),
    wvw_Match_details("/v1/wvw/match_details.json"),
    wvw_Matches("/v1/wvw/matches.json"),
    wvw_Objective_names("/v1/wvw/objective_names.json");

}