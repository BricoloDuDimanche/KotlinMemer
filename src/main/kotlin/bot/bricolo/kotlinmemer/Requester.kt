package bot.bricolo.kotlinmemer

import kotlinx.coroutines.future.await
import java.io.InputStream
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.URLEncoder

internal object Requester {
    private val client = HttpClient.newHttpClient()

    suspend fun request(url: String, params: Map<String, String>, token: String): HttpResponse<InputStream> {
        val builder = HttpRequest.newBuilder(URI.create("$url?${toQueryString(params)}"))
                .setHeader("User-Agent", "KotlinMemer (https://github.com/BricoloDuDimanche/KotlinMemer, ${KMemerVersion.VERSION})")
                .setHeader("Authorization", token)
                .GET()

        return client.sendAsync(builder.build(), HttpResponse.BodyHandlers.ofInputStream()).await()
    }

    private fun toQueryString(params: Map<String, String>): String {
        val sb = StringBuilder()
        for (e in params.entries) {
            if (sb.isNotEmpty()) sb.append('&')
            sb.append(URLEncoder.encode(e.key, "UTF-8")).append('=').append(URLEncoder.encode(e.value, "UTF-8"))
        }
        return sb.toString()
    }
}
