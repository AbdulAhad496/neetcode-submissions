class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencies : Map<Int,Int> = nums.groupBy { it }.mapValues { it.value.size }
    val sorted = frequencies.toList().sortedByDescending { it.second }
    val arr = IntArray(k)
    for (i in 0 until k) {
        arr[i] = sorted[i].first
    }
    return arr
    }
}
