package bot.bricolo.kotlinmemer

import kotlinx.coroutines.future.await
import java.awt.Color
import java.io.InputStream
import java.net.URI
import java.util.*

@Suppress("unused")
class KotlinMemer(private val token: String) {
    @Suppress("PrivatePropertyName")
    private val API_ENDPOINT = "https://dankmemer.services/api/"
    private val buckets = mutableMapOf<String, Bucket>()

    suspend fun abandon(text: String): InputStream? {
        return request("abandon", mapOf(Pair("text", text)))
    }

    suspend fun aborted(avatar1: URI): InputStream? {
        return request("aborted", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun affect(avatar1: URI): InputStream? {
        return request("affect", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun airpods(avatar1: URI): InputStream? {
        return request("airpods", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun america(avatar1: URI): InputStream? {
        return request("america", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun armor(text: String): InputStream? {
        return request("armor", mapOf(Pair("text", text)))
    }

    suspend fun balloon(text: String): InputStream? {
        return request("balloon", mapOf(Pair("text", text)))
    }

    suspend fun bed(avatar1: URI, avatar2: URI? = null): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("avatar1", avatar1.toString()))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()))

        return request("bed", params)
    }

    suspend fun bongocat(avatar1: URI): InputStream? {
        return request("bongocat", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun boo(text1: String, text2: String): InputStream? {
        return request("boo", mapOf(Pair("text", "$text1, $text2")))
    }

    suspend fun brain(small: String, medium: String, big: String, verybig: String): InputStream? {
        return request("brain", mapOf(Pair("text", "$small,$medium,$big,$verybig")))
    }

    suspend fun brazzers(avatar1: URI): InputStream? {
        return request("brazzers", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun byemom(avatar1: URI, username1: String, text: String, avatar2: URI?): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("avatar1", avatar1.toString()), Pair("username1", username1), Pair("text", text))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()), Pair("username1", username1), Pair("text", text))

        return request("byemom", params)
    }

    suspend fun cancer(avatar1: URI): InputStream? {
        return request("cancer", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun changemymind(text: String): InputStream? {
        return request("changemymind", mapOf(Pair("text", text)))
    }

    suspend fun citation(text: String): InputStream? {
        return request("citation", mapOf(Pair("text", text)))
    }

    suspend fun communism(avatar1: URI): InputStream? {
        return request("communism", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun corporate(avatar1: URI): InputStream? {
        return request("corporate", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun crab(line1: String, line2: String): InputStream? {
        return request("crab", mapOf(Pair("text", "$line1,$line2")))
    }

    suspend fun cry(text: String): InputStream? {
        return request("cry", mapOf(Pair("text", text)))
    }

    suspend fun dab(avatar1: URI): InputStream? {
        return request("dab", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun dank(avatar1: URI): InputStream? {
        return request("dank", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun deepfry(avatar1: URI): InputStream? {
        return request("deepfry", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun delete(avatar1: URI): InputStream? {
        return request("delete", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun disability(avatar1: URI): InputStream? {
        return request("disability", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun door(avatar1: URI): InputStream? {
        return request("door", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun egg(avatar1: URI): InputStream? {
        return request("egg", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun excuseme(text: String): InputStream? {
        return request("excuseme", mapOf(Pair("text", text)))
    }

    suspend fun facts(text: String): InputStream? {
        return request("facts", mapOf(Pair("text", text)))
    }

    suspend fun failure(avatar1: URI): InputStream? {
        return request("failure", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun fakenews(avatar1: URI): InputStream? {
        return request("fakenews", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun fedora(avatar1: URI): InputStream? {
        return request("fedora", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun floor(avatar1: URI, avatar2: URI, text: String): InputStream? {
        return request("floor", mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()), Pair("text", text)))
    }

    suspend fun garfield(text: String, avatar1: URI, avatar2: URI?): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("text", text), Pair("avatar1", avatar1.toString()))
        else
            mapOf(Pair("text", text), Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()))

        return request("garfield", params)
    }

    suspend fun gay(avatar1: URI): InputStream? {
        return request("gay", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun hitler(avatar1: URI): InputStream? {
        return request("hitler", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun humansgood(text: String): InputStream? {
        return request("humansgood", mapOf(Pair("text", text)))
    }

    suspend fun invert(avatar1: URI): InputStream? {
        return request("invert", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun jail(avatar1: URI): InputStream? {
        return request("jail", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun knowyourlocation(text: String): InputStream? {
        return request("knowyourlocation", mapOf(Pair("text", text)))
    }

    suspend fun laid(avatar1: URI): InputStream? {
        return request("laid", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun madethis(avatar1: URI, avatar2: URI?): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("avatar1", avatar1.toString()))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()))

        return request("madethis", params)
    }

    suspend fun magik(avatar1: URI): InputStream? {
        return request("magik", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun master(text: String): InputStream? {
        return request("master", mapOf(Pair("text", text)))
    }

    suspend fun meme(background: URI, topText: String, bottomText: String, font: Font?, color: Color?): InputStream? {
        val params = mutableMapOf(Pair("avatar1", background.toString()), Pair("top_text", topText), Pair("bottom_text", bottomText))
        if (font != null) params["font"] = font.font
        if (color != null) params["color"] = String.format("%02x%02x%02x", color.red, color.green, color.blue)
        return request("meme", params)
    }

    suspend fun note(text: String): InputStream? {
        return request("note", mapOf(Pair("text", text)))
    }

    suspend fun ohno(text: String): InputStream? {
        return request("ohno", mapOf(Pair("text", text)))
    }

    suspend fun plan(text: String): InputStream? {
        return request("plan", mapOf(Pair("text", text)))
    }

    suspend fun presentation(text: String): InputStream? {
        return request("presentation", mapOf(Pair("text", text)))
    }

    suspend fun quote(avatar1: URI, username1: String, text: String): InputStream? {
        return request("quote", mapOf(Pair("avatar1", avatar1.toString()), Pair("username1", username1), Pair("text", text)))
    }

    suspend fun radialblur(avatar1: URI): InputStream? {
        return request("radialblur", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun rip(avatar1: URI): InputStream? {
        return request("rip", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun roblox(avatar1: URI): InputStream? {
        return request("roblox", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun salty(avatar1: URI): InputStream? {
        return request("salty", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun satan(avatar1: URI): InputStream? {
        return request("satan", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun savehumanity(text: String): InputStream? {
        return request("savehumanity", mapOf(Pair("text", text)))
    }

    suspend fun screams(avatar1: URI, avatar2: URI?): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("avatar1", avatar1.toString()))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()))

        return request("screams", params)
    }

    suspend fun shit(text: String): InputStream? {
        return request("shit", mapOf(Pair("text", text)))
    }

    suspend fun sickban(avatar1: URI): InputStream? {
        return request("sickban", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun slap(avatar1: URI, avatar2: URI?): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("avatar1", avatar1.toString()))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()))

        return request("slap", params)
    }

    suspend fun slapsroof(text: String): InputStream? {
        return request("slapsroof", mapOf(Pair("text", text)))
    }

    suspend fun spank(avatar1: URI, avatar2: URI?): InputStream? {
        val params = if (avatar2 == null)
            mapOf(Pair("avatar1", avatar1.toString()))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("avatar2", avatar2.toString()))

        return request("spank", params)
    }

    suspend fun stroke(text: String): InputStream? {
        return request("stroke", mapOf(Pair("text", text)))
    }

    suspend fun surprised(text: String): InputStream? {
        return request("surprised", mapOf(Pair("text", text)))
    }

    suspend fun sword(text: String, username2: String): InputStream? {
        return request("sword", mapOf(Pair("text", text), Pair("username2", username2)))
    }

    suspend fun thesearch(text: String): InputStream? {
        return request("thesearch", mapOf(Pair("text", text)))
    }

    suspend fun trash(avatar1: URI): InputStream? {
        return request("trash", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun trigger(avatar1: URI): InputStream? {
        return request("trigger", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun tweet(avatar1: URI, username1: String, text: String, username2: String?): InputStream? {
        val params = if (username2 == null)
            mapOf(Pair("avatar1", avatar1.toString()), Pair("username1", username1), Pair("text", text))
        else
            mapOf(Pair("avatar1", avatar1.toString()), Pair("username1", username1), Pair("text", text), Pair("username2", username2))

        return request("tweet", params)
    }

    suspend fun ugly(avatar1: URI): InputStream? {
        return request("ugly", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun unpopular(avatar1: URI, text: String): InputStream? {
        return request("unpopular", mapOf(Pair("avatar1", avatar1.toString()), Pair("text", text)))
    }

    suspend fun vr(text: String): InputStream? {
        return request("vr", mapOf(Pair("text", text)))
    }

    suspend fun walking(text: String): InputStream? {
        return request("walking", mapOf(Pair("text", text)))
    }

    suspend fun wanted(avatar: URI): InputStream? {
        return request("wanted", mapOf(Pair("avatar1", avatar.toString())))
    }

    suspend fun warp(avatar: URI): InputStream? {
        return request("warp", mapOf(Pair("avatar1", avatar.toString())))
    }

    suspend fun whodidthis(avatar1: URI): InputStream? {
        return request("whodidthis", mapOf(Pair("avatar1", avatar1.toString())))
    }

    suspend fun yomomma(): InputStream? {
        return request("yomomma", mapOf())
    }

    suspend fun youtube(avatar1: URI, username1: String, text: String): InputStream? {
        return request("youtube", mapOf(Pair("avatar1", avatar1.toString()), Pair("username1", username1), Pair("text", text)))
    }

    suspend fun fuck(text1: String, text2: String): InputStream? {
        return request("fuck", mapOf(Pair("text", "$text1,$text2")))
    }

    suspend fun goggles(avatar: URI): InputStream? {
        return request("goggles", mapOf(Pair("avatar1", avatar.toString())))
    }

    suspend fun pretending(text: String, react: String): InputStream? {
        return request("justpretending", mapOf(Pair("text", "$text,$react")))
    }

    suspend fun lick(text1: String, text2: String): InputStream? {
        return request("lick", mapOf(Pair("text", "$text1,$text2")))
    }

    suspend fun violence(text: String): InputStream? {
        return request("violence", mapOf(Pair("text", text)))
    }

    suspend fun dream(avatar: URI): InputStream? {
        return request("dream", mapOf(Pair("avatar1", avatar.toString())))
    }

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

        val gRemaining = response.headers().firstValue("x-global-ratelimit-remaining").get().toLong()
        val gLimit = response.headers().firstValue("x-global-ratelimit-limit").get().toLong()
        val gReset = Date(response.headers().firstValue("x-global-ratelimit-reset").get().toLong())

        if (buckets.containsKey(endpoint)) {
            buckets[endpoint]!!.update(limit, reset, gLimit, gReset)
        } else {
            buckets[endpoint] = Bucket(limit, remaining, reset, gLimit, gRemaining, gReset)
        }

        // Response
        val code = response.statusCode()
        return if (code == 200) response.body() else null
    }
}
