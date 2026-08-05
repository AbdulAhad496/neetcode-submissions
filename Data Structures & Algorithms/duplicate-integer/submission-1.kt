class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hash1 : HashSet<Int> = hashSetOf()
    for (i in nums){
        if (hash1.contains(i)){
            return true
        }
        hash1.add(i)
    }
    return false
    }
}
