package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception

/*
id (number) – The item ID of the material.
category (number) – The material category the item belongs to. Can be resolved against /v2/materials.
binding (string, optional) – The binding of the material. Either Account or omitted.
count (number) – The number of the material that is stored in the account vault.
 */
class AccountMaterials{

    val url = Properties.APIUrl.value+ GW2_API_V2.account_materials.value

    var id : Int? = null //   (number) – The item ID of the material.
    var category  : Int? = null // (number) – The material category the item belongs to. Can be resolved against /v2/materials.
    var binding  : String? = null // (string, optional) – The binding of the material. Either Account or omitted.
    var count  : Int? = null // (number) – The number of the material that is stored in the account vault.

    constructor()

    constructor(id: Int?, category: Int?, binding: String?, count: Int?) {
        this.id = id
        this.category = category
        this.binding = binding
        this.count = count
    }

    constructor(acc: AccountMaterials) {
        this.id = acc.id
        this.category = acc.category
        this.binding = acc.binding
        this.count = acc.count
    }

    fun initAccountMaterials(): MutableList<AccountMaterials>? {
        var accMaterials : MutableList<AccountMaterials>? = mutableListOf<AccountMaterials>()
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
                    var result = gson?.fromJson(i, AccountMaterials::class.java)
                    accMaterials?.add(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.d("initAccountFinisher", "Error: $i")
                }
            }
        }
        return accMaterials
    }

    override fun toString(): String {
        return "AccountMaterials(id=$id)\n"
    }

}