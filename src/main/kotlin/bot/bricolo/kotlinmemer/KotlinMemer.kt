package bot.bricolo.kotlinmemer

import kotlinx.coroutines.future.await
import java.io.InputStream
import java.util.*

class KotlinMemer(private val token: String) {
    @Suppress("PrivatePropertyName")
    private val API_ENDPOINT = "https://dankmemer.services/api/"
    private val buckets = mutableMapOf<String, Bucket>()

    suspend fun abandon(text: String) = request("abandon", mapOf(Pair("text", text)))

    // --------------
    // Internal
    // --------------
    private suspend fun request(endpoint: String, params: Map<String, String>): InputStream? {
        if (buckets.containsKey(endpoint)) {
            buckets[endpoint]!!.consume().await()
        }

        val response = Requester.request("$API_ENDPOINT$endpoint", params, token)

        // Update bucket
        val remaining = response.headers().firstValue("x-ratelimit-remaining").get().toLong()
        val limit = response.headers().firstValue("x-ratelimit-limit").get().toLong()
        val reset = Date(response.headers().firstValue("x-ratelimit-reset").get().toLong())

        if (buckets.containsKey(endpoint)) {
            buckets[endpoint]!!.update(limit, reset)
        } else {
            buckets[endpoint] = Bucket(limit, remaining, reset)
        }

        // Response
        val code = response.statusCode()
        println(code)
        return if (code == 200) response.body() else null
    }
}
