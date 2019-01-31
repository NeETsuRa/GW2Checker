package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception

/**
    id (integer) – The id of the finisher resolvable against /v2/finishers.
    permanent (boolean) – Indicates if the finisher is permanent or temporary.
    quantity (integer) – If permanent is false, this field will indicate the number of uses the finisher has remaining.
 */

class AccountFinisher {
    val url = Properties.APIUrl.value+ GW2_API_V2.account_finishers.value

    var id : Int? = null //  (integer) – The id of the finisher resolvable against /v2/finishers.
    var permanent : Boolean? = false //  (boolean) – Indicates if the finisher is permanent or temporary.
    var quantity : Int? = null //  (integer) – If permanent is false, this field will indicate the number of uses the finisher has remaining.

    constructor()

    constructor(id: Int?, permanent: Boolean?, quantity: Int?) {
        this.id = id
        this.permanent = permanent
        this.quantity = quantity
    }

    constructor(accFinisher: AccountFinisher) {
        this.id = accFinisher.id
        this.permanent = accFinisher.permanent
        this.quantity = accFinisher.quantity
    }


    fun initAccountFinisher(): MutableList<AccountFinisher>? {
        var accountFinisher : MutableList<AccountFinisher>? = mutableListOf<AccountFinisher>()
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
                    var result = gson?.fromJson(i, AccountFinisher::class.java)
                    accountFinisher?.add(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.d("initAccountFinisher", "Error: $i")
                }
            }
        }
        return accountFinisher
    }

    override fun toString(): String {
        return "AccountFinisher(id=$id)\n"
    }


}