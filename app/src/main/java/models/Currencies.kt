package models

import enums.GW2_API_V2
import enums.Properties

/*
Fields:
    Each object returned contains the following properties:

        id (number) – The currency's ID.
        name (string) – The currency's name.
        description (string) – A description of the currency.
        icon (string) – A URL to an icon for the currency.
        order (number) – A number that can be used to sort the list of currencies when ordered from least to greatest.
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    /1?lang=en
Call Options:
     https://api.guildwars2.com/v2/currencies/1
     https://api.guildwars2.com/v2/currencies/1?lang=en
     https://api.guildwars2.com/v2/currencies --> All currencies
*/
class Currencies {
    //Authorization: none
    val url = ""+ Properties.APIUrl+ GW2_API_V2.currencies
}