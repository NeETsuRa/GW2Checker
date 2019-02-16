package models.Subelements

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
    id (number) - The category's ID.
    name (string) – The category name.
    description (string) – The category description.
    order (number) – A number describing where to sort this category among other the other categories in its group. Lowest numbers go first, highest numbers go last.
    icon (string) – A URL to an image for the icon of the category.
    achievements (array) – An array containing a number of achievement IDs that this category contains. (See /v2/achievements.)
 */
class AchievementCategories {
    var url = Properties.APIUrl.value+ GW2_API_V2.achievements_categories.value

    var id : Int? = null //(number) - The category's ID.
    var name : String? = null //(string) – The category name.
    var description : String? = null //(string) – The category description.
    var order : Int? = null //(number) – A number describing where to sort this category among other the other categories in its group. Lowest numbers go first, highest numbers go last.
    var icon : String? = null //(string) – A URL to an image for the icon of the category.
    var achievements : MutableList<Int>? = mutableListOf<Int>() //(array) – An array containing a number of achievement IDs that this category contains. (See /v2/achievements.)

    constructor()
    constructor(cat: AchievementCategories) {
        this.id = cat.id
        this.name = cat.name
        this.description = cat.description
        this.order = cat.order
        this.icon = cat.icon
        this.achievements = cat.achievements
    }
    constructor(id: Int?, name: String?, description: String?, order: Int?, icon: String?, achievements: MutableList<Int>?) {
        this.id = id
        this.name = name
        this.description = description
        this.order = order
        this.icon = icon
        this.achievements = achievements
    }

    fun getAllCategories(): List<Int>? {
        var categories : List<Int>? = mutableListOf<Int>()// /v2/account/titles
        var result = HttpRequest().get(Properties.token.value,url)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            categories = result.split(",").map { it.toInt() }
        }
        return categories
    }

    fun getAchievementCategorie(id: Int?): AchievementCategories {
        var gson = Gson()
        var getUrl = url+"/"+id
        var result = gson.fromJson(HttpRequest().get(Properties.token.value,getUrl), AchievementCategories::class.java)

        return result
    }

    fun getCategoriesPerAchievement(id: String?): MutableList<AchievementCategories>? {
        var accountAchievements : MutableList<AchievementCategories>? = mutableListOf<AchievementCategories>()
        var allCategories = getAllCategories()
        allCategories?.forEach {
            var categorie = getAchievementCategorie(it)
            if (categorie.achievements!!.contains(id?.toInt())){
                accountAchievements?.add(categorie)
            }
        }

        return accountAchievements
    }
    //TODO catergoryes per achivement

    override fun toString(): String {
        return "AchievementCategories(\n" +
                " id=$id,\n" +
                " name=$name,\n" +
                " description=$description,\n" +
                " order=$order,\n" +
                " icon=$icon, \n" +
                " achievements=$achievements)\n\n"
    }


}