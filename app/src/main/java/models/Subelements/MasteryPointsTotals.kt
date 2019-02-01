package models.Subelements


class MasteryPointsTotals {
    var region : String? = null// (string) – The mastery region. Current possible options: Tyria, Maguuma, Desert.
    var spent : Int? = null // (number) – Amount of masteries of this region spent in mastery tracks.
    var earned : Int? = null // (number) – Amount of masteries of this region earned for the account.

    override fun toString(): String {
        return "MasteryPointsTotals(\n\tregion=$region, \n" +
                "\tspent=$spent, \n" +
                "\tearned=$earned)\n"
    }
}