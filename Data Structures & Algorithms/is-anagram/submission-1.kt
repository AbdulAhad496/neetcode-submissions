class Solution {
    fun isAnagram(s: String, t: String): Boolean {
       val new = t.toCharArray().sorted().toString()
    if (s.length != t.length){ return false }
    if (s.toCharArray().sorted().toString() == new) return true
    return false
    }
}
