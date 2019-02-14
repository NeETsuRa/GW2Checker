package models.Subelements
/*
    id (number) - The achievement id.
    level (object) - Describes the level requirement for the daily to appear.
        min (number) - The minimum level. Any character below this level will not see this daily achievement.
        max (number) - The maximum level. Any character above this level will not see this daily achievement.
    required_access (array) - Contains which Guild Wars 2 campaigns are required in order to see this daily achievement. Possible values: GuildWars2, and/or HeartOfThorns, and/or PathOfFire.
 */
class AchievementsDailyElement {
    var id : Int? = null //(number) - The achievement id.
    var level : LevelRange = LevelRange() //(object) - Describes the level requirement for the daily to appear.
    var required_access : MutableList<String>? = mutableListOf<String>() // (array) - Contains which Guild Wars 2 campaigns are required in order to see this daily achievement. Possible values: GuildWars2, and/or HeartOfThorns, and/or PathOfFire.

    constructor()
    constructor(id: Int?, level: LevelRange, required_access: MutableList<String>?) {
        this.id = id
        this.level = level
        this.required_access = required_access
    }

    override fun toString(): String {
        return " id=$id,\n" +
                " level=$level," +
                " required_access=$required_access)\n\n"
    }


}