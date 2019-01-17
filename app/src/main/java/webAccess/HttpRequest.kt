package webAccess

import android.util.Log
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import java.io.IOException

/**
 * Created by nejc.ravnjak on 16.01.19.
 */
class HttpRequest {
    private val JSON = MediaType.get("application/json; charset=utf-8")
    private var client = OkHttpClient()

    fun get(token: String, url: String): String {
        var response = ""
        val thread = Thread(Runnable {
            try {
                response = getF(token,url)
                Log.d("HttpRequest", "webAccess:HttpRequest:get:: " + response)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })

        thread.start()
        thread.join()
        return response
    }

    fun post(token: String, url: String, json: String): String {
        var response = ""
        val thread = Thread(Runnable {
            try {
                response = postF(token,url,json)
                Log.d("HttpRequest", "webAccess:HttpRequest:post:: " + response)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })

        thread.start()
        thread.join()
        return response
    }

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

    private fun getF(token: String, url: String): String {
        val request = prepareRequest(url, token)
        try {
            client.newCall(request).execute().use { response ->
                val resp = response.body()!!.string()
                return resp
            }
        } catch (e: IOException) {
            handleError(e);
        }
        return ""
    }

    private fun postF(token: String, url: String, json: String): String {
        val body = RequestBody.create(JSON, json)
        val request = prepareRequest(url, token, body)
        try {
            client.newCall(request).execute().use { response ->
                val resp = response.body()!!.string()
                return resp
            }
        } catch (e: IOException) {
            handleError(e);
        }
        return ""
    }

    private fun handleError(e: IOException) {
        e.printStackTrace()
    }
}