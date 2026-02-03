class Solution{
    public int findJudge(int n, int[][] trust){
        int[][] mat = new int[n + 1][n + 1];
     for (int[] t : trust) {
            mat[t[0]][t[1]] = 1;
        }
     for (int i = 1; i <= n; i++){
     int in = 0, out = 0;
     for (int j = 1; j <= n; j++){
        out += mat[i][j];
         in += mat[j][i];
    }
    if (out == 0 && in == n - 1) return i;
    }
        return -1;
    }
}
