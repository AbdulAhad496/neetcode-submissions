class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
    val hash = hashSetOf<Char>()
    for (i in board.indices) {
        hash.clear()
        for (j in 0 until board[0].size) {
            if (board[i][j] != '.'){
                if (hash.contains(board[i][j])) {
                    return false
                }
                hash.add(board[i][j])
            }
        }
    }

    val hashCloumn = hashSetOf<Char>()
    for (i in 0 until board.size) {
        hashCloumn.clear()
        for (j in board[0].indices) {
            if (board[j][i] != '.'){
                if (hashCloumn.contains(board[j][i])) {
                    return false
                }
                hashCloumn.add(board[j][i])
            }
        }
    }

    for (boxRow in 0 until 3){
        for (boxColumn in 0 until 3){
            var hashNew = hashSetOf<Char>() 
            for (i in 0 until 3){
                for (j in 0 until 3){
                    var row = boxRow * 3 + i
                    var column = boxColumn * 3 + j
                    if (board[row][column] != '.'){
                        if (hashNew.contains(board[row][column])){
                            return false
                        }
                        hashNew.add(board[row][column])
                    }
                }
            }
        }
    }
    return true
}
}
