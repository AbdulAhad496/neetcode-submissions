class Solution {
    fun rotate(nums: IntArray, k: Int){
    fun Reverse(nums: IntArray, start : Int,end : Int){
        var start = start
        var end = end
        while (start < end){
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
            end--
        }
    }

    val s = 0
    val end = nums.size - 1
    val effectiveK = k % nums.size
    Reverse(nums,s,end)
    Reverse(nums,s,effectiveK - 1)
    Reverse(nums,effectiveK,end)
}
}
