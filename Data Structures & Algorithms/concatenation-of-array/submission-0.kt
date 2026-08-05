class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
    val list = nums.toMutableList()
    val n = nums.size

    for (i in 0 until n) {
        list.add(nums[i])
    }
    return list.toIntArray()
}
}
