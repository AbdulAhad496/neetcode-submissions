class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
         var newS  = ""
    val l1 = word1.length
    val l2 = word2.length
    val new = maxOf(l1, l2)
    for (i in 0 until new){
        if (i < l1 ) newS += word1[i]
        if (i < l2) newS += word2[i]
    }
    return newS
    }
}
