class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
          var k = 0
    for (i in nums.indices) {
        if (`val` != nums[i]) {
            nums[k] = nums[i]
            k++
        }
    }
    return k
    }
}
