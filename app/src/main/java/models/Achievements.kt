package models

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import models.Subelements.AchievementsBits
import models.Subelements.AchievementsRewards
import models.Subelements.AchivementTiers
import webAccess.HttpRequest

/*
Fields:
    id - The achievement id.
    icon (string, optional) – The achievement icon.
    name (string) – The achievement name.
    description (string) – The achievement description.
    requirement (string) – The achievement requirement as listed in-game.
    locked_text (string) – The achievement description prior to unlocking it.
    type (string) – The achievement type. Possible values:
        Default - A default achievement.
        ItemSet - Achievement is linked to Collections
    flags (array of strings) - Achievement categories. Possible values:
        Pvp - can only get progress in PvP or WvW
        CategoryDisplay - is a meta achievement
        MoveToTop - affects in-game UI collation
        IgnoreNearlyComplete - doesn't appear in the "nearly complete" UI
        Repeatable - can be repeated multiple times
        Hidden - hidden achievement; must fulfil unlock requirements before making progress or showing in the hero panel
        RequiresUnlock - must fulfil unlock requirements before making progress but will show in the hero panel before unlocking
        RepairOnLogin - unknown
        Daily - Flags an achievement as resetting daily.
        Weekly - Flags an achievement as resetting weekly.
        Monthly - Flags an achievement as resetting monthly.
        Permanent - Flags an achievement as progress never reseting.
    tiers (array of objects) - Describes the achievement's tiers. Each object contains:
        count (number) - The number of "things" (achievement-specific) that must be completed to achieve this tier.
        points (number) The amount of AP awarded for completing this tier.
    prerequisites (array of numbers) (optional) - Contains an array of achievement ids required to progress the given achievement.
    rewards (array of objects, optional) - Describes the rewards given for the achievement. Each object contains:
        type (string) - The type of reward. Additional fields appear for different values of type.
            If Coins:
                count (number) - The number of Coins to be rewarded.
            If Item:
                id (number) - The item ID to be rewarded.
                count (number) - The number of id to be rewarded.
            If Mastery:
                id (number) - The mastery point ID to be rewarded.
                region (string) - The region the Mastery Point applies to. Either Tyria, Maguuma or Desert.
            If Title:
                id (number) - The title id.
    bits (array of objects, optional) - Contains a number of objects, each corresponding to a bitmask value that can give further information on the progress towards the achievement. Each object has the following values:
        type (string) - The type of bit. Can be Text, Item, Minipet, or Skin.
        id (number, optional) - The ID of the item, mini, or skin, if applicable.
        text (string, optional) - The text for the bit, if type is Text.
    point_cap (number, optional) - The maximum number of AP that can be rewarded by an achievement flagged as Repeatable.
*/

/*
Connected Endpoints:
    /v2/achievements/categories
    /v2/achievements/daily
        /v2/achievements/daily/tomorrow
    /v2/achievements/groups
 */
/*
Optional Parameters:
    lang – The language to query the names for.
Call Options:
    https://api.guildwars2.com/v2/achievements?ids=1840,910,2258
    https://api.guildwars2.com/v2/achievements?ids=1840,910,2258&lang=de
    https://api.guildwars2.com/v2/achievements (List) --> No fields just all Achievements as list
 */
class Achievements {
    //Authorization: none
    val url = Properties.APIUrl.value+ GW2_API_V2.achievements.value

    var id  : String? = null //- The achievement id.
    var icon  : String? = null //(string, optional) – The achievement icon.
    var name  : String? = null //(string) – The achievement name.
    var description  : String? = null //(string) – The achievement description.
    var requirement  : String? = null //(string) – The achievement requirement as listed in-game.
    var locked_text  : String? = null //(string) – The achievement description prior to unlocking it.
    var type  : String? = null //(string) – The achievement type. Possible values: enum: Achivement_type
    var flags  : MutableList<String>? = mutableListOf<String>() //(array of strings) - Achievement categories. Possible values: enum: Achievements_Flags
    var tiers : MutableList<AchivementTiers>? = mutableListOf<AchivementTiers>() //(array of objects) - Describes the achievement's tiers. Each object contains:
    var prerequisites : MutableList<Int>? = mutableListOf<Int>() //(array of numbers) (optional) - Contains an array of achievement ids required to progress the given achievement.
    //TODO: AchievementsRewards
    var rewards : MutableList<AchievementsRewards>? = mutableListOf<AchievementsRewards>() //(array of objects, optional) - Describes the rewards given for the achievement. Each object contains:
        //    type (string) - The type of reward. Additional fields appear for different values of type.
        // If Coins:
        //     count (number) - The number of Coins to be rewarded.
        // If Item:
        //     id (number) - The item ID to be rewarded.
        //     count (number) - The number of id to be rewarded.
        // If Mastery:
        //     id (number) - The mastery point ID to be rewarded.
        //     region (string) - The region the Mastery Point applies to. Either Tyria, Maguuma or Desert.
        // If Title:
        //     id (number) - The title id.
    var bits : MutableList<AchievementsBits>? = mutableListOf<AchievementsBits>() //(array of objects, optional) - Contains a number of objects, each corresponding to a bitmask value that can give further information on the progress towards the achievement. Each object has the following values:
    var point_cap : Int? = null //(number, optional) - The maximum number of AP that can be rewarded by an achievement flagged as Repeatable.

    constructor()
    constructor(id: String?, icon: String?, name: String?, description: String?, requirement: String?, locked_text: String?, type: String?, flags: MutableList<String>?, tiers: MutableList<AchivementTiers>?, prerequisites: MutableList<Int>?, rewards: MutableList<AchievementsRewards>?, bits: MutableList<AchievementsBits>?, point_cap: Int?) {
        this.id = id
        this.icon = icon
        this.name = name
        this.description = description
        this.requirement = requirement
        this.locked_text = locked_text
        this.type = type
        this.flags = flags
        this.tiers = tiers
        this.prerequisites = prerequisites
        this.rewards = rewards
        this.bits = bits
        this.point_cap = point_cap
    }
    constructor(achievement: Achievements) {
        this.id = achievement.id
        this.icon = achievement.icon
        this.name = achievement.name
        this.description = achievement.description
        this.requirement = achievement.requirement
        this.locked_text = achievement.locked_text
        this.type = achievement.type
        this.flags = achievement.flags
        this.tiers = achievement.tiers
        this.prerequisites = achievement.prerequisites
        this.rewards = achievement.rewards
        this.bits = achievement.bits
        this.point_cap = achievement.point_cap
    }


    fun getAllAchievements(): List<Int>? {
        var achievements : List<Int>? = mutableListOf<Int>()// /v2/account/titles
        var result = HttpRequest().get(Properties.token.value,url)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            achievements = result.split(",").map { it.toInt() }
        }
        return achievements
    }
    fun getAchievement(id: Int?): Achievements {
        var gson = Gson()
        var getUrl = url+"/"+id
        var result = gson?.fromJson(HttpRequest().get(Properties.token.value,getUrl), Achievements::class.java)

        return Achievements(
                result.id,
                result.icon,
                result.name,
                result.description,
                result.requirement,
                result.locked_text,
                result.type,
                result.flags,
                result.tiers,
                result.prerequisites,
                result.rewards,
                result.bits,
                result.point_cap
        )
    }
    fun getAchievements(ids: MutableList<Int>?){
        //TODO
    }

    override fun toString(): String {
        //TODO refractor
        return "Achievements(url='$url', id=$id, icon=$icon, name=$name, description=$description, requirement=$requirement, locked_text=$locked_text, type=$type, flags=$flags, tiers=$tiers, prerequisites=$prerequisites, rewards=$rewards, bits=$bits, point_cap=$point_cap)"
    }

}