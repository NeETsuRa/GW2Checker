package models.Subelements
/*
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
*/
class AchievementsRewards {
    var type : String? = null //(string) - The type of reward. Additional fields appear for different values of type.
    var count : Int? = null //(number) - The number of id to be rewarded.
    var region : String? = null //(string) - The region the Mastery Point applies to. Either Tyria, Maguuma or Desert.
    var id : Int? = null //(number) - The title id.

    constructor()
    constructor(type: String?, count: Int?, region: String?, id: Int?) {
        this.type = type
        this.count = count
        this.region = region
        this.id = id
    }

    override fun toString(): String {
        return "AchievementsRewards(type=$type, count=$count, region=$region, id=$id)"
    }


}