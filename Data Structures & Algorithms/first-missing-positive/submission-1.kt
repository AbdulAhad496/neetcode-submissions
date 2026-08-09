class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val hash = hashSetOf<Int>()
    for (i in nums){
        if (i > 0){
            hash.add(i)
        }
    }

    for (i in 1 until hash.size + 1) {
        if (!hash.contains(i)) return i
    }
    return hash.size + 1
    }
}
