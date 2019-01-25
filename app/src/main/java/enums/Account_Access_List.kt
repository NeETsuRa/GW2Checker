package enums

enum class Account_Access_List(val value: String) {
    None("None"),// None – should probably never happen
    PlayForFree("PlayForFree"), // PlayForFree – has not yet purchased the game
    GuildWars2("GuildWars2"),// GuildWars2 – has purchased the base game
    HeartOfThorns("HeartOfThorns"),// HeartOfThorns – has purchased Heart of Thorns
    PathOfFire("PathOfFire")// PathOfFire – has purchased Path of Fire
}