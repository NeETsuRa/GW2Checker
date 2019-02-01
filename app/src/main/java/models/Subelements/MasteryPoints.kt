package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception
/*
totals (array of objects)
    region (string) – The mastery region. Current possible options: Tyria, Maguuma, Desert.
    spent (number) – Amount of masteries of this region spent in mastery tracks.
    earned (number) – Amount of masteries of this region earned for the account.
unlocked (array of numbers) – Array of mastery ids.
 */
class MasteryPoints {
    val url = Properties.APIUrl.value+ GW2_API_V2.account_mastery_points.value

    var totals : MutableList<MasteryPointsTotals>? = mutableListOf<MasteryPointsTotals>() //totals (array of objects)
    var unlocked : List<Int>? = mutableListOf<Int>()// unlocked (array of numbers) – Array of mastery ids.

    constructor()
    constructor(totals: MutableList<MasteryPointsTotals>?, unlocked: List<Int>?) {
        this.totals = totals
        this.unlocked = unlocked
    }
    constructor(points: MasteryPoints) {
        this.totals = points.totals
        this.unlocked = points.unlocked
    }

    fun initMasteryPoints(): MasteryPoints {
        var gson = Gson()
        var response = HttpRequest().get(Properties.token.value,url)
        return gson?.fromJson(response, MasteryPoints::class.java)
    }

    override fun toString(): String {
        return "MasteryPoints( \ntotals=$totals,  \nunlocked=$unlocked)"
    }
}