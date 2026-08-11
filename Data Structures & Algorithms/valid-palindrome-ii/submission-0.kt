class Solution {
    fun validPalindrome(s: String): Boolean {
        fun isPalindrome(str: String): Boolean {
            var left = 0
            var right = str.length - 1
            while (left < right) {
                if (str[left] != str[right]) return false
                left++
                right--
            }
            return true
        }

        if (isPalindrome(s)) return true

        for (i in s.indices) {
            val newS = s.substring(0, i) + s.substring(i + 1)
            if (isPalindrome(newS)) return true
        }

        return false
    }
}