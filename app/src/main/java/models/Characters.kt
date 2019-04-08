package models

import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
Fields:
    List: List of all characters
*/
/*
Connected Endpoints:
    /v2/characters/:id/backstory
    /v2/characters/:id/core
    /v2/characters/:id/crafting
    /v2/characters/:id/equipment
    /v2/characters/:id/heropoints
    /v2/characters/:id/inventory
    /v2/characters/:id/skills
    /v2/characters/:id/specializations
    /v2/characters/:id/training
*/
/*
Optional Parameters:
    none
Call Options:
    https://api.guildwars2.com/v2/characters/
*/
class Characters {
    //Authorization: Bearer <API key>
    val url = ""+ Properties.APIUrl+ GW2_API_V2.characters
    var accountCharacters : List<String>? = mutableListOf<String>()// /v2/characters

    constructor(accountCharacters: List<String>?) {
        this.accountCharacters = accountCharacters
    }

    constructor(){
    }

    fun getCharacters(){
        val dungeonsUrl = Properties.APIUrl.value+GW2_API_V2.characters.value
        var result = HttpRequest().get(Properties.token.value,dungeonsUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace("\"","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            accountCharacters = result.split(",")
        }
    }

    override fun toString(): String {
        return "Characters(\n"+
                "List=$accountCharacters\n" +
                ")"
    }


}