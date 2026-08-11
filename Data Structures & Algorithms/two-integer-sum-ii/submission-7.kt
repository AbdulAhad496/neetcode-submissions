class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var start = 0
        var end = numbers.size - 1
        while (numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] < target){
                start++
            }
            if(numbers[start] + numbers[end] > target){
                end--
            }
        }
        return intArrayOf(start + 1,end + 1)
    }
}
