package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    For each requested profession id, an object with the following properties is returned:
        id (string) (default/null value: "") - The profession id.
        name (string) (default/null value: "") - The name of the profession.
        icon (string) (default/null value: "") - The icon for the profession.
        icon_big (string) (default/null value: "") - The large icon for the profession.
        specializations (array of integer) (default/null value: 0) - List of API:2/specializations ids.
        training (array of objects) (default/null value: {} empty array) - List of training details objects.
            id (integer) (default/null value: 0) - The id of the API:2/skills or API:2/specializations inidcated by the category.
            category (string) (default/null value: "") - The category for the training object. May include the following values:
                Skills - API:2/skills.
                Specializations - API:2/specializations.
                EliteSpecializations - Elite Specializations API:2/specializations.
            name (string) (default/null value: "") - The name of the skill or specialization inidcated by the category and id.
            track (array of objects) (default/null value: {} empty array) - List of skills and traits training details tracks objects. Includes the following objects:
                cost (integer) (default/null value: 0) - The cost to train this skill or trait.
                type (string) (default/null value: "") - Inidcates whether this is a skill or trait. May include the following values:
                    Trait
                    Skill
                skill_id (integer) (default/null value: 0) - The API:2/skills id. This field is only present if type is Skill.
                trait_id (integer) (default/null value: 0) - The API:2/traits id. This field is only present if type is Trait.
        weapons (object) - The weapons available for this profession. The key indicates the weapon type, which is one of the following:
            Axe - Axe
            Dagger - Dagger
            Mace - Mace
            Pistol - Pistol
            Sword - Sword
            Scepter - Scepter
            Focus - Focus
            Shield - Shield
            Torch - Torch
            Warhorn - Warhorn
            Greatsword - Greatsword
            Hammer - Hammer
            Longbow - Longbow
            Rifle - Rifle
            Shortbow - Short bow
            Staff - Staff
            Speargun - Speargun
            Spear - Spear
            Trident - Trident

    Each of the above weapons objects contain the following properties:
        flag (array of string) - May be one of: "Mainhand", "Offhand", "TwoHand", "Aquatic".
        specialization (integer) (default/null value: 0) - The API:2/specializations id of the required specialization to use this weapon. This field is only present if the weapon requires a specialization to be used.
        skills (array of objects) (default/null value: {} empty array) - The list of weapon skills objects. Includes the following objects:
            id (integer) (default/null value: 0) - The id of the API:2/skills.
            slot (string) (default/null value: "") - The skill bar slot that this weapon skill can be used in. May include the following values:
                Profession_1
                Utility
                Heal
                Elite
            offhand (string) (default/null value: "") - The name of the offhand weapon this skill requires to be equipped. This field is usually only present for Thief skills.
            attunement (string) (default/null value: "") - The Elementalist attunement that this skill requires. This field is usually only present for Elementalist skills.
            source (string) (default/null value: "") - The name of the class the skill was stolen from. This only applies to thief stolen skills.
        flags (array of strings) - Can contain the following values:
            NoRacialSkills - This profession cannot equip racial skills.
            NoWeaponSwap - This profession can only use one weapon set.
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    page - (Optional; integer)
    page_size - (Optional; integer)
    ids - (Optional; Comma Delimited List|all) Request an array of professions for the specified ids or all professions. Cannot be used when using the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/professions --> List of all Proffesions
    https://api.guildwars2.com/v2/professions/Engineer
    https://api.guildwars2.com/v2/professions?ids=Necromancer
    https://api.guildwars2.com/v2/professions?ids=Necromancer,Warrior
*/
object Professions {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.professions
}