class Solution{
    public int maxAreaOfIsland(int[][] grid){
        int m=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int a=dfs(i,j,grid);
                    m=Math.max(a,m);
                }
            }
        }
        return m;
    }

    int dfs(int i,int j,int[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0)
            return 0;

        grid[i][j]=0;
        int a=1;
        a+=dfs(i+1,j,grid);
        a+=dfs(i-1,j,grid);
        a+=dfs(i,j+1,grid);
        a+=dfs(i,j-1,grid);
        return a;
    }
}
