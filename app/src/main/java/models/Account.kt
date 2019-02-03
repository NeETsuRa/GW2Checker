package models

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import models.Subelements.*
import webAccess.HttpRequest

/*
Fields:
    id (string) – The unique persistent account GUID.
    age (number) - The age of the account in seconds.
    name (string) – The unique account name with numerical suffix. It is possible that the name change. Do not rely on the name, use id instead.[1]
    world (number) – The id of the home world the account is assigned to. Can be resolved against /v2/worlds.
    guilds (array) – A list of guilds assigned to the given account.
    guild_leader (array) – A list of guilds the account is leader of.
    created (string) – An ISO-8601 standard timestamp of when the account was created.
    access (array) – A list of what content this account has access to. Possible values:
        None – should probably never happen
        PlayForFree – has not yet purchased the game
        GuildWars2 – has purchased the base game
        HeartOfThorns – has purchased Heart of Thorns
        PathOfFire – has purchased Path of Fire
    commander (boolean) – True if the player has bought a commander tag.
    fractal_level (number) – The account's personal fractal reward level. Requires the additional progression scope.
    daily_ap (number) – The daily AP the account has. Requires the additional progression scope.
    monthly_ap (number) – The monthly AP the account has. Requires the additional progression scope.
    wvw_rank (number) – The account's personal wvw rank. Requires the additional progression scope.
    */

/*
Connected Endpoints:
    (D) /v2/account/achievements
    (D) /v2/account/bank
    (D) /v2/account/dungeons
    (D) /v2/account/dyes
    (D) /v2/account/finishers
    (D) /v2/account/gliders
    (D) /v2/account/home
    (D)     /v2/account/home/cats
    (D)     /v2/account/home/nodes
    (D) /v2/account/inventory
    (D) /v2/account/mailcarriers
    (D) /v2/account/masteries
    (D) /v2/account/mastery/points
    (D) /v2/account/materials
    (D) /v2/account/minis
    /v2/account/mounts
        /v2/account/mounts/skins
        /v2/account/mounts/types
    /v2/account/outfits
    /v2/account/pvp/heroes
    /v2/account/raids
    /v2/account/recipes
    /v2/account/skins
    /v2/account/titles
    /v2/account/wallet
*/

/*
Optional Parameters:
    None
Call Options:
    https://api.guildwars2.com/v2/account
    Authorization: Bearer <API key>
*/
class Account {
    //Authorization: Bearer <API key>
    val url = Properties.APIUrl.value+GW2_API_V2.account.value

    //MainParameters
    var id : String? = null //(string) – The unique persistent account GUID.
    var age : Int? = null // (number) - The age of the account in seconds.
    var name : String? = null// (string) – The unique account name with numerical suffix. It is possible that the name change. Do not rely on the name, use id instead.[1]
    var world : Int? = null // (number) – The id of the home world the account is assigned to. Can be resolved against /v2/worlds.
    var guilds : MutableList<String>? = mutableListOf<String>() //(array) – A list of guilds assigned to the given account.
    var guild_leader : MutableList<String>? = mutableListOf<String>() //(array) – A list of guilds the account is leader of.
    var created : String? = null //(string) – An ISO-8601 standard timestamp of when the account was created.
    var access : MutableList<String>? = mutableListOf<String>() //(array) – A list of what content this account has access to. Possible values: Account_Access_List
    var commander : String? = null // (boolean) – True if the player has bought a commander tag.
    var fractal_level : Int? = null  // (number) – The account's personal fractal reward level. Requires the additional progression scope.
    var daily_ap : Int? = null  //(number) – The daily AP the account has. Requires the additional progression scope.
    var monthly_ap : Int? = null //(number) – The monthly AP the account has. Requires the additional progression scope.
    var wvw_rank : Int? = null //(number) – The account's personal wvw rank. Requires the additional progression scope.

    //ConnectedParameters
    var accountAchievements : MutableList<AccountAchievements>? = mutableListOf<AccountAchievements>() // /v2/account/achievements
    var accountBank : MutableList<AccountBank>? = mutableListOf<AccountBank>() // /v2/account/bank
    var accountDungeons : List<String>? = mutableListOf<String>()// /v2/account/dungeons
    var accountDyes : List<Int>? = mutableListOf<Int>()// /v2/account/dyes
    var accountFinishers : MutableList<AccountFinisher>? = mutableListOf<AccountFinisher>() // /v2/account/finishers
    var accountGliders : List<Int>? = mutableListOf<Int>()// /v2/account/gliders
    var accountHome : AccountHome? = AccountHome() // /v2/account/home
    var accountInventory : MutableList<AccountInventory>? = mutableListOf<AccountInventory>() // /v2/account/inventory
    var accountMailcarriers : List<Int>? = mutableListOf<Int>()// /v2/account/mailcarriers
    var accountMasteries : MutableList<AccountMasteries>? = mutableListOf<AccountMasteries>() //  /v2/account/masteries
    var accountMasteryPoints : MasteryPoints = MasteryPoints() // /v2/account/mastery/points
    var accountMaterials : MutableList<AccountMaterials>? = mutableListOf<AccountMaterials>() // /v2/account/materials
    var accountMinis : List<Int>? = mutableListOf<Int>()// /v2/account/minis

    constructor(){}

    constructor(id: String?, age: Int?, name: String?, world: Int?, guilds: MutableList<String>?, guild_leader: MutableList<String>?, created: String?, access: MutableList<String>?, commander: String?, fractal_level: Int?, daily_ap: Int?, monthly_ap: Int?, wvw_rank: Int?) {
        this.id = id
        this.age = age
        this.name = name
        this.world = world
        this.guilds = guilds
        this.guild_leader = guild_leader
        this.created = created
        this.access = access
        this.commander = commander
        this.fractal_level = fractal_level
        this.daily_ap = daily_ap
        this.monthly_ap = monthly_ap
        this.wvw_rank = wvw_rank
    }

    constructor(acc:Account){
        this.id = acc.id
        this.age = acc.age
        this.name = acc.name
        this.world = acc.world
        this.guilds = acc.guilds
        this.guild_leader = acc.guild_leader
        this.created = acc.created
        this.access = acc.access
        this.commander = acc.commander
        this.fractal_level = acc.fractal_level
        this.daily_ap = acc.daily_ap
        this.monthly_ap = acc.monthly_ap
        this.wvw_rank = acc.wvw_rank
    }

    fun initialiseAccount(){
        var gson = Gson()
        var result = gson?.fromJson(HttpRequest().get(Properties.token.value,url), Account::class.java)

        this.id = result.id
        this.age = result.age
        this.name = result.name
        this.world = result.world
        this.guilds = result.guilds
        this.guild_leader = result.guild_leader
        this.created = result.created
        this.access = result.access
        this.commander = result.commander
        this.fractal_level = result.fractal_level
        this.daily_ap = result.daily_ap
        this.monthly_ap = result.monthly_ap
        this.wvw_rank = result.wvw_rank

    }

    fun getHome(){
        accountHome = accountHome?.initHome()
    }

    fun getAchievements(){
        var a : AccountAchievements = AccountAchievements()
        accountAchievements = a.initAccountAchievements()
    }

    fun getBank(){
        var a : AccountBank = AccountBank()
        accountBank = a.initAccountBank()
    }

    fun getInventory(){
        var a : AccountInventory = AccountInventory()
        accountInventory = a.initAccountInventory()
    }

    fun getFinishers(){
        var a : AccountFinisher = AccountFinisher()
        accountFinishers = a.initAccountFinisher()
    }

    fun getMasteries(){
        var a : AccountMasteries = AccountMasteries()
        accountMasteries = a.initAccountMasteries()
    }

    fun getMasteryPoints(){
        var a : MasteryPoints = MasteryPoints()
        accountMasteryPoints = a.initMasteryPoints()
    }

    fun getAccountMaterials(){
        var a : AccountMaterials = AccountMaterials()
        accountMaterials = a.initAccountMaterials()
    }

    fun getDungeons(){
        val dungeonsUrl = Properties.APIUrl.value+GW2_API_V2.account_dungeons.value
        var result = HttpRequest().get(Properties.token.value,dungeonsUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace("\"","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            accountDungeons = result.split(",")
        }
    }

    fun getDyes(){
        val dyesUrl = Properties.APIUrl.value+GW2_API_V2.account_dyes.value
        var result = HttpRequest().get(Properties.token.value,dyesUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            accountDyes = result.split(",").map { it.toInt() }
        }
    }

    fun getGliders(){
        val glidersUrl = Properties.APIUrl.value+GW2_API_V2.account_gliders.value
        var result = HttpRequest().get(Properties.token.value,glidersUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            accountGliders = result.split(",").map { it.toInt() }
        }
    }

    fun getMailcarriers(){
        val glidersUrl = Properties.APIUrl.value+GW2_API_V2.account_mailcarriers.value
        var result = HttpRequest().get(Properties.token.value,glidersUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            accountMailcarriers = result.split(",").map { it.toInt() }
        }
    }

    fun getMinis(){
        val glidersUrl = Properties.APIUrl.value+GW2_API_V2.account_minis.value
        var result = HttpRequest().get(Properties.token.value,glidersUrl)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            accountMinis = result.split(",").map { it.toInt() }
        }
    }

    override fun toString(): String {
        return "Account(\n" +
                "  url='$url',\n" +
                "  id=$id,\n" +
                "  age=$age,\n" +
                "  name=$name,\n" +
                "  world=$world,\n" +
                "  guilds=$guilds,\n" +
                "  guild_leader=$guild_leader,\n" +
                "  created=$created,\n" +
                "  access=$access,\n" +
                "  commander=$commander,\n" +
                "  fractal_level=$fractal_level,\n" +
                "  daily_ap=$daily_ap,\n" +
                "  monthly_ap=$monthly_ap,\n" +
                "  wvw_rank=$wvw_rank\n" +
                ")\n" +
                "\n" +
                "${accountAchievements.toString()} \n"+
                "${accountBank.toString()} \n"+
                "${accountDungeons.toString()} \n"+
                "${accountDyes.toString()} \n"+
                "${accountFinishers.toString()} \n"+
                "${accountGliders.toString()} \n"+
                "${accountHome.toString()} \n"+
                "${accountInventory.toString()} \n"+
                "${accountMailcarriers.toString()} \n"+
                "${accountMasteries.toString()} \n"+
                "${accountMasteryPoints.toString()} \n"+
                "${accountMaterials.toString()} \n"+
                "${accountMinis.toString()} \n"

    }


}
