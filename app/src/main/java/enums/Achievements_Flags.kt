package enums

enum class Achievements_Flags(val value: String)  {
    Pvp("Pvp"),// Pvp - can only get progress in PvP or WvW
    CategoryDisplay("CategoryDisplay"),// CategoryDisplay - is a meta achievement
    MoveToTop("MoveToTop"),// MoveToTop - affects in-game UI collation
    IgnoreNearlyComplete("IgnoreNearlyComplete"),// IgnoreNearlyComplete - doesn't appear in the "nearly complete" UI
    Repeatable("Repeatable"),// Repeatable - can be repeated multiple times
    Hidden("Hidden"),// Hidden - hidden achievement; must fulfil unlock requirements before making progress or showing in the hero panel
    RequiresUnlock("RequiresUnlock"),// RequiresUnlock - must fulfil unlock requirements before making progress but will show in the hero panel before unlocking
    RepairOnLogin("RepairOnLogin"),// RepairOnLogin - unknown
    Daily("Daily"),// Daily - Flags an achievement as resetting daily.
    Weekly("Weekly"),// Weekly - Flags an achievement as resetting weekly.
    Monthly("Monthly"),// Monthly - Flags an achievement as resetting monthly.
    Permanent("Permanent"),// Permanent - Flags an achievement as progress never reseting.
}