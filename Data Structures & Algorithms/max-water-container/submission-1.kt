class Solution {
    fun maxArea(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
//    var Area = 0
//    for (i in nums.indices) {
//        for (j in i + 1 until nums.size) {
//            val width = j - i
//            val lenght = minOf(nums[i], nums[j])
//            if (width * lenght > Area) Area = width * lenght
//        }
//    }
//    return Area
    var start = 0
    var end = nums.size - 1
    var area = 0
    while (start < end) {
        val height = minOf(nums[start], nums[end])
        val lenght = end - start
        if (height*lenght > area) area = height*lenght
        if (nums[start] > nums[end]) {
            end--
        }else{
            start++
        }
    }
    return area
}
}
