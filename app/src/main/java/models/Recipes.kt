package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (number) – The recipe id.
    type (string) – The recipe type. Possible values:
        Weapon recipes: Axe, Dagger, Focus, Greatsword, Hammer, Harpoon, LongBow, Mace, Pistol, Rifle, Scepter, Shield, ShortBow, Speargun, Staff, Sword, Torch, Trident, Warhorn
        Armor recipes: Boots, Coat, Gloves, Helm, Leggings, Shoulders
        Trinket recipes: Amulet, Earring, Ring
        Food recipes: Dessert, Feast, IngredientCooking, Meal, Seasoning, Snack, Soup, Food
        Crafting component recipes: Component, Inscription, Insignia, LegendaryComponent
        Refinement recipes: Refinement, RefinementEctoplasm, RefinementObsidian
        Guild recipes: GuildConsumable, GuildDecoration, GuildConsumableWvw
        Other recipes: Backpack, Bag, Bulk, Consumable, Dye, Food, Potion, UpgradeComponent
    output_item_id (number) – The item id of the produced item resolvable against v2/items.
    output_item_count (number) – The amount of items produced.
    time_to_craft_ms (number) – The time in milliseconds it takes to craft the item.
    disciplines (array of strings) – The crafting disciplines that can use the recipe. Possible values:
        Artificer
        Armorsmith
        Chef
        Huntsman
        Jeweler
        Leatherworker
        Tailor
        Weaponsmith
        Scribe
    min_rating (number) – The required rating to craft the recipe.
    flags (array of strings) – Flags applying to the recipe. Possible values:
        AutoLearned – Indicates that a recipe automatically unlocks upon reaching the required discipline rating.
        LearnedFromItem – Indicates that a recipe is unlocked by consuming a recipe sheet.
    ingredients (array of objects) – List of recipe ingredients. Each object contains the following properties:
        item_id (number) – The ingredient's item id resolvable against v2/items.
        count (number) – The quantity of this ingredient.
    guild_ingredients (array of objects, optional) - List of recipe ingredients that come from the guild such as decorations or schematics. Each object contains the following properties:
        upgrade_id (number) - The id of the used guild upgrade resolvable against v2/guild/upgrades.
        count (number) - The quantity of this guild ingredient.
    output_upgrade_id (number, optional) - The id of the produced guild upgrade resolvable against v2/guild/upgrades.
    chat_link (string) – The chat code for the recipe.

*/
/*
Connected Endpoints:
    /v2/recipes/search
*/
/*
Optional Parameters:

Call Options:
    https://api.guildwars2.com/v2/recipes/7319
    https://api.guildwars2.com/v2/recipes/7319?lang=de
    https://api.guildwars2.com/v2/recipes --> All recepies ID's
*/
object Recipes {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.recipes
}