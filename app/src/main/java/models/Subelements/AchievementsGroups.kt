package models.Subelements

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
id (string) - The group's GUID.
name (string) – The group name.
description (string) – The group description.
order (number) – A number describing where to sort this group among other groups. Lowest numbers go first, highest numbers go last.
categories (array) – An array containing a number of category IDs that this group contains. (See /v2/achievements/categories.)
 */
class AchievementsGroups {
    val url = Properties.APIUrl.value+ GW2_API_V2.achievements_groups.value

    var id  : String? = null //(string) - The group's GUID.
    var name  : String? = null //(string) – The group name.
    var description  : String? = null //(string) – The group description.
    var order : Int? = null //(number) – A number describing where to sort this group among other groups. Lowest numbers go first, highest numbers go last.
    var categories : MutableList<Int>? = mutableListOf<Int>() //(array) – An array containing a number of category IDs that this group contains. (See /v2/achievements/categories.)

    fun getAllGroups(): List<String>? {
        var groups : List<String>? = mutableListOf<String>()//
        var result = HttpRequest().get(Properties.token.value,url)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            groups = result.split(",").map { it }
        }
        return groups
    }
    fun getGroup(id: Int?): AchievementsGroups {
        var gson = Gson()
        var getUrl = url+"/"+id
        var result = gson.fromJson(HttpRequest().get(Properties.token.value,getUrl), AchievementsGroups::class.java)

        return result
    }
    fun getGroups(ids: MutableList<Int>?): MutableList<AchievementsGroups>? {
        var result: MutableList<AchievementsGroups>? = mutableListOf<AchievementsGroups>()
        ids?.forEach { result?.add(getGroup(it)) }
        return result
    }

    override fun toString(): String {
        return "AchievementsGroups(id=$id, name=$name, description=$description, order=$order, categories=$categories)"
    }


}
