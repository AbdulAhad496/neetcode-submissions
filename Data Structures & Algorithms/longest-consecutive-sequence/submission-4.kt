class Solution {
    fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    nums.sort()

    var current = 1
    var longest = 1

    for (i in 1 until nums.size) {

        if (nums[i] == nums[i - 1]) {
            continue
        }

        if (nums[i] == nums[i - 1] + 1) {
            current++
        } else {
            current = 1
        }

        longest = maxOf(longest, current)
    }

    return longest
}
}
