package models.Subelements
/*
    count (number) - The number of "things" (achievement-specific) that must be completed to achieve this tier.
    points (number) The amount of AP awarded for completing this tier.
 */
class AchivementTiers {
    var count : Int? = null //(number) - The number of "things" (achievement-specific) that must be completed to achieve this tier.
    var points : Int? = null //(number) The amount of AP awarded for completing this tier.

    constructor()
    constructor(count: Int?, points: Int?) {
        this.count = count
        this.points = points
    }
    constructor(tiers: AchivementTiers) {
        this.count = tiers.count
        this.points = tiers.points
    }

    override fun toString(): String {
        return "AchivementTiers(count=$count, points=$points)"
    }

}