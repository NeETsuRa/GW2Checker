package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    id (integer) (default/null value: 0) - The itemstat id.
    name (string) (default/null value: "") - The name of the set of stats.
    attributes (array of objects) (default/null value: {} empty array) – List of attribute bonuses. Each object may contain the following :
        attribute (string) - The name of the attribute, may be one of the following:
            AgonyResistance - Agony Resistance
            BoonDuration - Concentration
            ConditionDamage – Condition Damage
            ConditionDuration - Expertise
            CritDamage – Ferocity
            Healing – Healing Power
            Power – Power
            Precision – Precision
            Toughness – Toughness
            Vitality – Vitality
        multiplier (number, decimal) - The multiplier number for that attribute. [1]
        value (number) - The value number for that attribute.[1]

*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    ids - (Optional; Comma Delimited List|all) Request an array of itemstats for the specified ids or all itemstats. Cannot be used when using the id endpoint. Limited to 200 ids per request.

Call Options:
    https://api.guildwars2.com/v2/itemstats --> all stats
    https://api.guildwars2.com/v2/itemstats/584
    https://api.guildwars2.com/v2/itemstats?ids=1012
    https://api.guildwars2.com/v2/itemstats?ids=1012&lang=de
*/
class ItemStats {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.itemstats
}