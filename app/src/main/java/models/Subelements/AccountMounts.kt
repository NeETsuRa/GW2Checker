package models.Subelements

import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

class AccountMounts {

    var skins : List<Int>? = mutableListOf<Int>()// /v2/account/mounts/skins
    var types : List<String>? = mutableListOf<String>()// /v2/account/mounts/types

    constructor()

    constructor(skins: List<Int>?, types: List<String>?) {
        this.skins = skins
        this.types = types
    }

    constructor(mount: AccountMounts) {
        this.skins = mount.skins
        this.types = mount.types
    }

    fun getTypes(){
        val dungeonsUrl = Properties.APIUrl.value+ GW2_API_V2.account_mounts_types.value
        var result = HttpRequest().get(Properties.token.value,dungeonsUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace("\"","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            types = result.split(",")
        }
    }

    fun getSkins(){
        val dyesUrl = Properties.APIUrl.value+ GW2_API_V2.account_mounts_skins.value
        var result = HttpRequest().get(Properties.token.value,dyesUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            skins = result.split(",").map { it.toInt() }
        }
    }
    fun initAccountMounts(): AccountMounts {
        getSkins()
        getTypes()
        return AccountMounts(skins,types)
    }

    override fun toString(): String {
        return "AccountMounts(skins=$skins, types=$types)"
    }

}