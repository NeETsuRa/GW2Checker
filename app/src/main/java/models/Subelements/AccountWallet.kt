package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception

/*
id (number) – The currency's ID that can be resolved against /v2/currencies.
value (number) – The amount of this currency.
 */
class AccountWallet {

    val url = Properties.APIUrl.value+ GW2_API_V2.account_wallet.value

    var id  : Int? = null //(number) – The currency's ID that can be resolved against /v2/currencies.
    var value  : Int? = null //(number) – The amount of this currency.

    constructor()

    constructor(id: Int?, value: Int?) {
        this.id = id
        this.value = value
    }

    constructor(wallet: AccountWallet) {
        this.id = wallet.id
        this.value = wallet.value
    }

    fun initAccountWallet(): MutableList<AccountWallet>? {
        var accWallet : MutableList<AccountWallet>? = mutableListOf<AccountWallet>()
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
                    var result = gson?.fromJson(i, AccountWallet::class.java)
                    accWallet?.add(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.d("initAccountFinisher", "Error: $i")
                }
            }
        }
        return accWallet
    }

    override fun toString(): String {
        return "value=$value"
    }


}