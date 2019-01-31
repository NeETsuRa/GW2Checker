package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception

class AccountMasteries {
    val url = Properties.APIUrl.value+ GW2_API_V2.account_masteries.value

    var id : Int? = null // (integer) – The id of the mastery resolvable against /v2/masteries.
    var level : Int? = null // (integer) – Indicates the level at which the mastery is on the account. Is a 0-indexed reference to the /v2/masteries.levels array indicating the maximum level unlocked by the user. If omitted, this mastery hasn't been started.

    constructor()

    constructor(id: Int?, level: Int?) {
        this.id = id
        this.level = level
    }

    constructor(mas: AccountMasteries) {
        this.id = mas.id
        this.level = mas.level
    }

    fun initAccountMasteries(): MutableList<AccountMasteries>? {

        var accountMasterie : MutableList<AccountMasteries>? = mutableListOf<AccountMasteries>()
        var gson = Gson()
        var response = HttpRequest().get(Properties.token.value,url)
        if(!response.equals("[]")) {
            response = response.substring(2, response.length - 1)
            while (response.contains("null")) {
                var i = response.indexOf("null")
                response = response.removeRange(i, i + 5)
            }

            var list = response.split("},")
            list.forEach {
                var i = it
                if (!it.equals(list.last()))
                    i += "}"
                try {
                    var result = gson?.fromJson(i, AccountMasteries::class.java)
                    accountMasterie?.add(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.d("initAccountInventory", "Error: $i")
                }
            }
        }
        return accountMasterie
    }

    override fun toString(): String {
        return "AccountMasteries(id=$id, level=$level)\n"
    }


}