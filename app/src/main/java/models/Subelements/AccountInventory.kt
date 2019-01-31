package models.Subelements

import android.util.Log
import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest
import java.lang.Exception

/*
id (number) – The item's ID.
count (number) – The amount of items in the item stack.
charges (number, optional) – The amount of charges remaining on the item.
skin (number, optional) – The skin applied to the item, if it is different from its original. Can be resolved against /v2/skins.
upgrades (array, optional) – An array of item IDs for each rune or signet applied to the item.
infusions (array, optional) – An array of item IDs for each infusion applied to the item.
binding (string, optional) – The current binding of the item. Either Account or Character if present.
bound_to (string, optional) – If binding is Character, this field tells which character it is bound to.
*/

class AccountInventory {

    val url = Properties.APIUrl.value+ GW2_API_V2.account_inventory.value

    var id : Int? = null //(number) – The item's ID.
    var count : Int? = null // (number) – The amount of items in the item stack.
    var charges : Int? = null // (number, optional) – The amount of charges remaining on the item.
    var skin : Int? = null // (number, optional) – The skin applied to the item, if it is different from its original. Can be resolved against /v2/skins.
    var upgrades : MutableList<String>? = mutableListOf<String>() // (array, optional) – An array of item IDs for each rune or signet applied to the item.
    var infusions : MutableList<String>? = mutableListOf<String>() //  (array, optional) – An array of item IDs for each infusion applied to the item.
    var binding : String? = null //(string, optional) – The current binding of the item. Either Account or Character if present.
    var bound_to : String? = null //(string, optional) – If binding is Character, this field tells which character it is bound to.

    constructor()

    constructor(id: Int?, count: Int?, charges: Int?, skin: Int?, upgrades: MutableList<String>?, infusions: MutableList<String>?, binding: String?, bound_to: String?) {
        this.id = id
        this.count = count
        this.charges = charges
        this.skin = skin
        this.upgrades = upgrades
        this.infusions = infusions
        this.binding = binding
        this.bound_to = bound_to
    }
    constructor(inventory: AccountInventory) {
        this.id = inventory.id
        this.count = inventory.count
        this.charges = inventory.charges
        this.skin = inventory.skin
        this.upgrades = inventory.upgrades
        this.infusions = inventory.infusions
        this.binding = inventory.binding
        this.bound_to = inventory.bound_to
    }

    fun initAccountInventory(): MutableList<AccountInventory>? {
        var accountInventory : MutableList<AccountInventory>? = mutableListOf<AccountInventory>()
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
                    var result = gson?.fromJson(i, AccountInventory::class.java)
                    accountInventory?.add(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.d("initAccountInventory", "Error: $i")
                }
            }
        }
        return accountInventory
    }

    override fun toString(): String {
        return "AccountInventory(id=$id, Count=$count)\n"
    }


}