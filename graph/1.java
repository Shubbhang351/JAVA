package graph;

import java.io.*;
import java.util.*;



class Solution{

    public static void DFS(char[][] grid,int x,int y,int c[][],int n,int m){
        if(grid[x][y] == 'X' && c[x][y] == 0){
            c[x][y] = 1;
            if(x + 1 < n){
                DFS(grid, x + 1, y, c, n, m);
            }
            if(x - 1 >= 0){
                DFS(grid, x - 1, y, c, n, m);
            }
            if(y + 1 < m){
                DFS(grid, x, y + 1, c, n, m);
            }
            if(y - 1 >= 0){
                DFS(grid, x, y - 1, c, n, m);
            }
        }
        else{
            return;
        }
    }

    

    public int xShape(char[][] grid){
        int[][] check = new int[grid.length][grid[0].length];
        int ans = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[i].length;j++){
                if(grid[i][j] == 'X' && check[i][j] == 0){
                    DFS(grid, i, j, check,grid.length,grid[0].length);
                    ans++;
                }
            }
        }
        System.out.println(ans);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] c = new char[n][m];
        for(int i = 0;i < n;i++){
            String s = sc.nextLine();
            for(int j=0;j < s.length();j++){
                c[i][j] = s.charAt(j);
            }
        }
        Solution o = new Solution();
        o.xShape(c);
    }
}