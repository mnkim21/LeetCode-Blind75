class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1){
                    result = Math.max(result, dfs(grid,i,j));
                }
            }
        }
        return result;
    }

    public int dfs(int[][] grid, int i, int j) {
        // if we gets out of bound OR its a 0 (= water) then return 0 
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;

        // We do not come back to the same place and cause infinite (Stack over flow)
        grid[i][j] = 0;

        int area = 1; // This is because the current cell is part of this island
        area += dfs(grid, i - 1, j); // down
        area += dfs(grid, i + 1, j); // up
        area += dfs(grid, i, j - 1); //left
        area += dfs(grid, i, j + 1); //right

        return area;
    }
}