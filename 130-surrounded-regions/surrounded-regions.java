class Solution {

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') dfs(i, 0, vis, board);
            if (board[i][m - 1] == 'O') dfs(i, m - 1, vis, board);
        }

        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') dfs(0, j, vis, board);
            if (board[n - 1][j] == 'O') dfs(n - 1, j, vis, board);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }

    void dfs(int i, int j, boolean[][] vis, char[][] board) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return;
        if (board[i][j] != 'O' || vis[i][j])
            return;

        vis[i][j] = true;
        board[i][j] = '#';

        dfs(i - 1, j, vis, board);
        dfs(i + 1, j, vis, board);
        dfs(i, j - 1, vis, board);
        dfs(i, j + 1, vis, board);
    }
}
