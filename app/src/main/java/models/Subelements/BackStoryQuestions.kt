package models.Subelements

import com.google.gson.Gson
import enums.GW2_API_V2
import enums.Properties
import webAccess.HttpRequest

/*
    id (integer) (default/null value: 0) - The id of the question.
    title (string) (default/null value: "") - The title (or name) of the question.
    description (string) (default/null value: "") - The description of the question; as displayed in-game when presented as a Biography choice during character creation.
    answers (array of integer) (default/null value: {}) - The list of answers for this question; resolvable against v2/backstory/answers.
    order (integer) (default/null value: 0) - The order in which this question is displayed in-game while answering your characters' Biography questions during character creation.
    races (array of string) (default/null value: {}) (Optional) - When present, an array of races that this question is presented to.
    professions (array of string) (default/null value: {}) (Optional) - When present, an array of professions that this question is presented to.
 */
class BackStoryQuestions {
    val url = Properties.APIUrl.value+ GW2_API_V2.backstory_questions.value

    var id : Int? = null //(integer) (default/null value: 0) - The id of the question.
    var title : String? = null //(string) (default/null value: "") - The title (or name) of the question.
    var description : String? = null //(string) (default/null value: "") - The description of the question; as displayed in-game when presented as a Biography choice during character creation.
    var answers : MutableList<Int>? = mutableListOf<Int>() //(array of integer) (default/null value: {}) - The list of answers for this question; resolvable against v2/backstory/answers.
    var order : Int? = null //(integer) (default/null value: 0) - The order in which this question is displayed in-game while answering your characters' Biography questions during character creation.
    var races : MutableList<String>? = mutableListOf<String>() //(array of string) (default/null value: {}) (Optional) - When present, an array of races that this question is presented to.
    var professions : MutableList<String>? = mutableListOf<String>() //(array of string) (default/null value: {}) (Optional) - When present, an array of professions that this question is presented to.


    fun getAllBackStoryQuestions(): List<Int>? {
        var backStoryQuestions : List<Int>? = mutableListOf<Int>()
        var result = HttpRequest().get(Properties.token.value,url)
        if(!result.equals("[]")){
            result = result.replace("\n","")
            result = result.replace(" ","")
            result = result.substring(1, result.length - 1)
            backStoryQuestions = result.split(",").map { it.toInt() }
        }
        return backStoryQuestions
    }
    fun getBackStoryQuestion(id: Int?): BackStoryQuestions {
        var gson = Gson()
        var getUrl = url+"/"+id
        var result = gson.fromJson(HttpRequest().get(Properties.token.value,getUrl), BackStoryQuestions::class.java)

        return result
    }
    fun getBackStoryQuestions(ids: MutableList<Int>?): MutableList<BackStoryQuestions>? {
        var result: MutableList<BackStoryQuestions>? = mutableListOf<BackStoryQuestions>()
        ids?.forEach { result?.add(getBackStoryQuestion(it)) }
        return result
    }

    override fun toString(): String {
        return "BackStoryQuestions(id=$id, title=$title, description=$description, answers=$answers, order=$order, races=$races, professions=$professions)"
    }

}