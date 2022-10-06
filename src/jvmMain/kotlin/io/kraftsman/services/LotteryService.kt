package io.kraftsman.services

class LotteryService {
    fun draw(start: Int = 1, end: Int = 49, count: Int = 6): List<Int> =
        (start..end).shuffled().take(count)
}
