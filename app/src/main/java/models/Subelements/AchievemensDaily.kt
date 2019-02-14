package models.Subelements

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
pve, pvp, wvw, fractals, and special
 */
class AchievemensDaily {
    val url = Properties.APIUrl.value+ GW2_API_V2.achievements_daily.value

     var pve : MutableList<AchievementsDailyElement>? = mutableListOf<AchievementsDailyElement>() //
     var pvp : MutableList<AchievementsDailyElement>? = mutableListOf<AchievementsDailyElement>() //
     var wvw : MutableList<AchievementsDailyElement>? = mutableListOf<AchievementsDailyElement>() //
     var fractals : MutableList<AchievementsDailyElement>? = mutableListOf<AchievementsDailyElement>() //
     var special : MutableList<AchievementsDailyElement>? = mutableListOf<AchievementsDailyElement>() //

    fun getDailyAchievements(): AchievemensDaily? {
        var gson = Gson()
        var result = gson.fromJson(HttpRequest().get(Properties.token.value,url), AchievemensDaily::class.java)

        return result
    }

    override fun toString(): String {
        return "AchievemensDaily(\n" +
                " pve=$pve,\n" +
                " pvp=$pvp,\n" +
                " wvw=$wvw,\n" +
                " fractals=$fractals,\n" +
                " special=$special)\n"
    }


}