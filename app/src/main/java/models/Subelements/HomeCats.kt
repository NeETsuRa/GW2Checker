package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception

/*
id (number) – The id for the cat that can be resolved against /v2/cats.
hint (string, optional) – A hint to identify what is needed for each cat.
 */
class HomeCats {
    val url = Properties.APIUrl.value+ GW2_API_V2.account_home_cats.value

    var id : Int? = null // (number) – The id for the cat that can be resolved against /v2/cats.
    var hint : String? = null //(string, optional) – A hint to identify what is needed for each cat.

    constructor()

    constructor(id: Int?, hint: String?) {
        this.id = id
        this.hint = hint
    }

    constructor(cat: HomeCats) {
        this.id = cat.id
        this.hint = cat.hint
    }


    fun initHomeCats(): MutableList<HomeCats>? {
        var homeCat : MutableList<HomeCats>? = mutableListOf<HomeCats>()
        var gson = Gson()
        var response = HttpRequest().get(Properties.token.value,url)
        if(!response.equals("[]")) {
            response = response.substring(2, response.length - 1)
            var list = response.split("},")
            list.forEach {
                var i = it
                if (!it.equals(list.last()))
                    i += "}"
                try {
                    var result = gson?.fromJson(i, HomeCats::class.java)
                    homeCat?.add(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.d("initAccountBank", "Error: $i")
                }
            }
        }
        return homeCat
    }

    override fun toString(): String {
        return "HomeCats(id=$id)\n"
    }

}