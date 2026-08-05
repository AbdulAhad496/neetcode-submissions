class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
         var hash = hashSetOf<Int>()
    for (i in nums){
        if (hash.contains(i)){
            return true
        }
        hash.add(i)
    }
    return false
    }
}
