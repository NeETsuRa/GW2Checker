package models.Subelements

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
    /*
    id (number) - The category's ID.
    name (string) – The category name.
    description (string) – The category description.
    order (number) – A number describing where to sort this category among other the other categories in its group. Lowest numbers go first, highest numbers go last.
    icon (string) – A URL to an image for the icon of the category.
    achievements (array) – An array containing a number of achievement IDs that this category contains. (See /v2/achievements.)
*/
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
}