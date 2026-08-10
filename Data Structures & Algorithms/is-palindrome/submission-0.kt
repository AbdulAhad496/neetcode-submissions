class Solution {
    fun isPalindrome(s: String): Boolean {
        var str = ""
    for (i in s.indices) {
        if (s[i] != ' ' && ((s[i].code >= 48 && s[i].code <= 57) || (s[i].code >= 65 && s[i].code <= 90) || (s[i].code >= 97 && s[i].code <= 122))) {
            str += s[i]
        }
    }

    var start = 0
    var end = str.length - 1
    while (start < end) {
        if (str[start].lowercase() != str[end].lowercase() ) return false
        start++
        end --
    }
    return true
    }
}
