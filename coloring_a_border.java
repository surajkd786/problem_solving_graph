class Solution {
   
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
       solve(grid,row,col,grid[row][col]);
        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[0].length; j++){
                if(grid[i][j]<0){
                    grid[i][j]=color;                    
                }
            }
          
        }
          return grid;
    }
        static int[][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
        public static void solve(int[][] grid,int row, int col,int clr){
            int count=0;
            grid[row][col]=-clr;
            for(int i=0;i<4;i++){
            int xdash=row+dirs[i][0];
            int ydash=row+dirs[i][1];
            if(xdash<0 || ydash<0 || xdash>=grid.length || ydash>=grid[0].length || Math.abs(grid[xdash][ydash])!=clr ){
                continue;
            }
                count++;
            if(Math.abs(grid[xdash][ydash])==clr){
                solve(grid,xdash,ydash,clr);
            }

            
            
        }
            if(count==4)
                grid[row][col]=clr;
            }
    }
