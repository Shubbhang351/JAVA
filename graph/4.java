package graph;

import java.util.*;

class Solution4 {

    public static int path(int[][] mat,int i,int j,int a,int b){
        if(i == a - 1 && j == b - 1){
            return 1;
        }
        int rigth = 0;
        if(j + 1 < b){
            rigth = rigth + path(mat,i,j + 1,a,b);
        }
        int down = 0;
        if(i + 1 < a){
            down = down + path(mat,i + 1,j,a,b);
        }
        return rigth + down;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] mat = new int[a][b];

        System.out.print(Solution4.path(mat, 0, 0, a, b));
    }
}
