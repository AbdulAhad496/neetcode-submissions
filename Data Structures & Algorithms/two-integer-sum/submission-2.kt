class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = HashMap<Int, Int>()

    for (i in nums.indices) {
        val complement = target - nums[i]

        if (hash.containsKey(complement)) {
            return intArrayOf(hash[complement]!!, i)
        }

        hash[nums[i]] = i
    }

    return intArrayOf()
    }
}
