package models.Subelements

import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
         /v2/account/home/cats
         /v2/account/home/nodes
 */
class AccountHome {

    var cats : MutableList<HomeCats>? = mutableListOf<HomeCats>() // /v2/account/home/cats
    var nodes : List<String>? = mutableListOf<String>()// /v2/account/home/nodes

    constructor()

    fun initHome(): AccountHome {
        var result : AccountHome = AccountHome()
        result.getCats()
        result.getNodes()
        return result
    }

    private fun getNodes() {
        var nodesURL = Properties.APIUrl.value+ GW2_API_V2.account_home_nodes.value
        var result = HttpRequest().get(Properties.token.value,nodesURL)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace("\"","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            nodes = result.split(",")
        }
    }

    private fun getCats() {
        var a : HomeCats = HomeCats()
        cats = a.initHomeCats()
    }

    override fun toString(): String {
        return "AccountHome(cats=$cats, nodes=$nodes)\n"
    }

}