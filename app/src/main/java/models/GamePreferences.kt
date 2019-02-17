package models

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import models.Subelements.Build
import webAccess.HttpRequest

/*
Fields:

*/
/*
Connected Endpoints:
    /v2/build
    /v2/cats
*/
/*
Optional Parameters:

Call Options:

*/
class GamePreferences {
    var build = Build()
    var cats = 0

    fun setBuildNummer(){
        var url = Properties.APIUrl.value+GW2_API_V2.build.value
        var gson = Gson()
        build = gson?.fromJson(HttpRequest().get(Properties.token.value,url), Build::class.java)
    }

    override fun toString(): String {
        return "GamePreferences(\n" +
                " build=$build,\n" +
                " cats=$cats)\n\n"
    }


}