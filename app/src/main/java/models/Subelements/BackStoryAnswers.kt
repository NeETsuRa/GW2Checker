package models.Subelements

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
    id (string) (default/null value: 0) - The id of the answer.
    title (string) (default/null value: "") - The title (or name) of the answer.
    description (string) (default/null value: "") - The description of the answer; as displayed in-game when presented as an answer choice to a question during the Biography portion of character creation.
    journal (string) (default/null value: "") - The Story Journal entry for the answer; as displayed in-game.
    question (integer) (default/null value: 0) - The id of the Biography question that this answers; resolves against v2/backstory/questions.
    professions (array of string) (default/null value: {}) (Optional) - When present, an array of professions that this answer is available as a choice for.
    races (array of string) (default/null value: {}) (Optional) - When present, an array of races that this answer is available as a choice for.
 */
class BackStoryAnswers {
    val url = Properties.APIUrl.value+ GW2_API_V2.backstory_answers.value

    var id  : String? = null //(string) (default/null value: 0) - The id of the answer.
    var title  : String? = null //(string) (default/null value: "") - The title (or name) of the answer.
    var description  : String? = null //(string) (default/null value: "") - The description of the answer; as displayed in-game when presented as an answer choice to a question during the Biography portion of character creation.
    var journal  : String? = null //(string) (default/null value: "") - The Story Journal entry for the answer; as displayed in-game.
    var question : Int? = null //(integer) (default/null value: 0) - The id of the Biography question that this answers; resolves against v2/backstory/questions.
    var professions : MutableList<String>? = mutableListOf<String>() //(array of string) (default/null value: {}) (Optional) - When present, an array of professions that this answer is available as a choice for.
    var races : MutableList<String>? = mutableListOf<String>() //(array of string) (default/null value: {}) (Optional) - When present, an array of races that this answer is available as a choice for.

    fun getAllBackStoryAnwcers(): MutableList<String>? {
        var backStoryAnwcers : List<String>? = mutableListOf<String>()
        var result = HttpRequest().get(Properties.token.value,url)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.replace("\"","")
            result = result.substring(1, result.length - 1)
            backStoryAnwcers = result.split(",").map { it }
        }
        return backStoryAnwcers as MutableList<String>?
    }
    fun getBackStoryAnwcer(id: String?): BackStoryAnswers {
        var gson = Gson()
        var getUrl = url+"/"+id
        var result = gson.fromJson(HttpRequest().get(Properties.token.value,getUrl), BackStoryAnswers::class.java)

        return result
    }
    fun getBackStoryAnwcers(ids: MutableList<String>?): MutableList<BackStoryAnswers>? {
        var result: MutableList<BackStoryAnswers>? = mutableListOf<BackStoryAnswers>()
        ids?.forEach { result?.add(getBackStoryAnwcer(it)) }
        return result
    }

    override fun toString(): String {
        return "BackStoryAnswers(\n" +
                " id=$id,\n" +
                " title=$title,\n" +
                " description=$description,\n" +
                " journal=$journal,\n" +
                " question=$question,\n" +
                " professions=$professions,\n" +
                " races=$races)\n\n"
    }


}