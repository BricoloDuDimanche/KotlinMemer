package bot.bricolo.kotlinmemer

import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

class Bucket(
        private var limit: Long, private var remaining: Long, private var reset: Date,
        gLimit: Long, gRemaining: Long, gReset: Date
) {
    companion object {
        private var gLimit: Long = 0
        private var gRemaining: Long = 0
        private var gReset: Date = Date()
    }

    init {
        Bucket.gLimit = gLimit
        Bucket.gRemaining = gRemaining
        Bucket.gReset = gReset
    }

    @Synchronized
    fun tryConsume(): Boolean {
        refill()
        if (remaining != 0L && gRemaining != 0L) {
            remaining -= 1
            gRemaining -= 1
            return true
        }
        return false
    }

    fun consume(): CompletableFuture<Void> {
        val future = CompletableFuture<Void>()
        if (!tryConsume()) {
            val time = if (gRemaining == 0L) gReset else reset
            CompletableFuture.delayedExecutor(time.time - Date().time, TimeUnit.MILLISECONDS).execute {
                consume().thenAccept { future.complete(null) }
            }
        } else {
            future.complete(null)
        }
        return future
    }

    fun update(limit: Long, reset: Date, gLimit: Long, gReset: Date) {
        refill()
        this.limit = limit
        this.reset = reset
        Bucket.gLimit = gLimit
        Bucket.gReset = gReset
    }

    @Synchronized
    private fun refill() {
        if (reset.time < Date().time) {
            remaining = limit
        }
        if (gReset.time < Date().time) {
            gRemaining = gLimit
        }
    }
}
