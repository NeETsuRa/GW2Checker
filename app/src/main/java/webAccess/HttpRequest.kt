package webAccess

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import java.io.IOException

/**
 * Created by nejc.ravnjak on 16.01.19.
 */
class HttpRequest {
    public val JSON = MediaType.get("application/json; charset=utf-8")
    var client = OkHttpClient()

    private fun prepareRequest(url: String, token: String, body: RequestBody? = null): Request {

        if (body==null)
            return Request.Builder()
                    .url(url)
                    .get()
                    .addHeader("Authorization", "Bearer "+token)
                    .build()
        return Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer "+token)
                .post(body)
                .build()
    }

    operator fun get(url: String): String {
        //TODO: Get Token Function
        val token = "18DB49E1-BF7C-5345-8C63-3E5CB7FAC342F9B6560C-D84D-4B72-B7A0-6B2A951F3E22"
        val request = prepareRequest(url, token)

        try {
            client.newCall(request).execute().use { response ->
                val resp = response.body()!!.string()
                return resp
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return ""
    }

    fun post(url: String, json: String): String? {
        //TODO: Get Token Function
        val token = "18DB49E1-BF7C-5345-8C63-3E5CB7FAC342F9B6560C-D84D-4B72-B7A0-6B2A951F3E22"

        val body = RequestBody.create(JSON, json)
        val request = prepareRequest(url, token, body)
        try {
            client.newCall(request).execute().use { response ->
                val resp = response.body()!!.string()
                return resp
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return ""
    }
}