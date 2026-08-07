class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
         nums.sort()
    val length = nums.size
    var count = 0
    val hash = hashSetOf<Int>()
    for (i in nums.indices) {
        for (j in i + 1 until length) {
            if (nums[i] == nums[j]) {
                count++
            }
        }
        if (count == length/3) hash.add(nums[i])
        count = 0
    }
    return hash.toList()
    }
}
