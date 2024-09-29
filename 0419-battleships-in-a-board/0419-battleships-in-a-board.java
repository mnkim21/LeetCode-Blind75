class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length; // 3
        int cols = board[0].length; // 5

        int result = 0;
        
        // 1.
        // for(int i = 0; i < rows; i++) {
        //     for(int y = 0; y < cols; y++) {
        //         if(board[i][y] == 'X'
        //             && (i == 0 || board[i-1][y] != 'X') // Check for left
        //             && (y == 0 || board[i][y-1] != 'X') // Check for up
        //         ) {
        //             result++;
        //         }
        //     }
        // }

        // 2. DFS
        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j < cols; j++) {
                if(board[i][j] == 'X') {
                    dfs(board, i, j);
                    result++;
                }
            }
        }
        return result;
    }
    public void dfs(char[][] board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '.') return;

        board[i][j] = '.';
        dfs(board, i- 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }
}