package models.Subelements

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import models.Account
import webAccess.HttpRequest

/*
    id (number) – The achievement id.
    bits (array, optional) – This attribute contains an array of numbers, giving more specific information on the progress for the achievement. The meaning of each value varies with each achievement.
    current (number, optional) – The player's current progress towards the achievement.
    max (number, optional) – The amount needed to complete the achievement.
    done (boolean) – Whether or not the achievement is done.
    repeated (number, optional) – The number of times the achievement has been completed if the achievement is repeatable.
    unlocked (boolean, optional) – Whether or not the achievement is unlocked. Note that if this property does not exist, the achievement is unlocked as well.
*/
class AccountAchievements {
    val url = Properties.APIUrl.value+ GW2_API_V2.account_achievements.value
    val token = "18DB49E1-BF7C-5345-8C63-3E5CB7FAC342F9B6560C-D84D-4B72-B7A0-6B2A951F3E22"

    var id : Int? = null //(number) – The achievement id.
    var bits : MutableList<String>? = mutableListOf<String>() //(array, optional) – This attribute contains an array of numbers, giving more specific information on the progress for the achievement. The meaning of each value varies with each achievement.
    var current  : Int? = null //(number, optional) – The player's current progress towards the achievement.
    var max  : Int? = null //(number, optional) – The amount needed to complete the achievement.
    var done  : Boolean? = null //(boolean) – Whether or not the achievement is done.
    var repeated  : Int? = null //(number, optional) – The number of times the achievement has been completed if the achievement is repeatable.
    var unlocked  : Boolean? = null //(boolean, optional) – Whether or not the achievement is unlocked. Note that if this property does not exist, the achievement is unlocked as well.

    constructor()

    constructor(id: Int?, bits: MutableList<String>?, current: Int?, max: Int?, done: Boolean?, repeated: Int?, unlocked: Boolean?) {
        this.id = id
        this.bits = bits
        this.current = current
        this.max = max
        this.done = done
        this.repeated = repeated
        this.unlocked = unlocked
    }

    constructor(acc: AccountAchievements) {
        this.id = acc.id
        this.bits = acc.bits
        this.current = acc.current
        this.max = acc.max
        this.done = acc.done
        this.repeated = acc.repeated
        this.unlocked = acc.unlocked
    }

    fun initAccountAchievements(){
        var gson = Gson()
        var response = HttpRequest().get(token,url)
        /*
        response = response.substring(2, response.length - 1)

        var list = response.split("},")
        list.forEach{
            var i = it + "}"
            var result = gson?.fromJson(i, AccountAchievements::class.java)
        }*/
    }


    override fun toString(): String {
        return "AccountAchievements()"
    }
}