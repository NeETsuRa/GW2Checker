package models.Subelements
/*
        min (number) - The minimum level. Any character below this level will not see this daily achievement.
        max (number) - The maximum level. Any character above this level will not see this daily achievement.
 */
class LevelRange {
    var min  : Int? = null //(number) - The minimum level. Any character below this level will not see this daily achievement.
    var max  : Int? = null //(number) - The maximum level. Any character above this level will not see this daily achievement.

    constructor()
    constructor(min: Int?, max: Int?) {
        this.min = min
        this.max = max
    }

    override fun toString(): String {
        return "LevelRange(min=$min, max=$max)"
    }


}