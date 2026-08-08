class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
       var multiply = 1
    var multyplyForzero = 1
    val output = IntArray(nums.size)
    for (i in nums.indices) {
        if (nums[i] == 0) {
            for (j in nums.indices) {
                if (j != i){
                    multyplyForzero *= nums[j]
                }
            }
        }
        multiply *= nums[i]
    }
    for (i in nums.indices) {
        if (nums[i] == 0){
            output[i] = multyplyForzero
        }else{
            output[i] = multiply / nums[i]
        }
    }
    return output
    }
}
