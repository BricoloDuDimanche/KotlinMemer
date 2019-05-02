package bot.bricolo.kotlinmemer

import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

class Bucket(private var limit: Long, private var remaining: Long, private var reset: Date) {

    @Synchronized
    fun tryConsume(): Boolean {
        refill()
        if (remaining != 0L) {
            remaining -= 1
            return true
        }
        return false
    }

    fun consume(): CompletableFuture<Void> {
        val future = CompletableFuture<Void>()
        if (!tryConsume()) {
            CompletableFuture.delayedExecutor(reset.time - Date().time, TimeUnit.MILLISECONDS).execute {
                consume().thenAccept { future.complete(null) }
            }
        } else {
            future.complete(null)
        }
        return future
    }

    fun update(limit: Long, reset: Date) {
        refill()
        this.limit = limit
        this.reset = reset
    }

    @Synchronized
    private fun refill() {
        println(reset.time)
        println(Date().time)
        if (reset.time < Date().time) {
            remaining = limit
        }
    }
}
