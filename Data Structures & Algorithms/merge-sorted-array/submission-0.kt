class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int){
    for (i in nums2.indices){
        nums1[m+i] = nums2[i]
    }
    nums1.sort()
}
}
