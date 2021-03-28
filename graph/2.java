package graph;

import java.util.*;

class Solution1 {

    public static boolean isCycle(int n,int[][] aa,boolean[] visited,boolean[] inStack){
        visited[n] = true;
        inStack[n] = true;

        for(int i = 0;i < aa[n].length;i++){
            if(aa[n][i] == 1){
                if(visited[i] == false){
                    if(isCycle(i, aa, visited, inStack) == true){
                        return true;
                    }
                }
                else if(inStack[i] == true){
                    return true;
                }
            }
        }
        inStack[n] = false;
        return false;
        
    }

    public boolean isPossible(int N, int[][] pre){
        boolean visited[] = new boolean[N];
        boolean inStack[] = new boolean[N];
        int[][] aa = new int[N][N];

        for(int i = 0;i < pre.length;i++){
            int[] ele = pre[i];
            aa[ele[1]][ele[0]] = 1;
        }

        for(int i = 0;i < N;i++){
            if(visited[i] == false){
                if(isCycle(i, aa, visited, inStack) == true){
                    return true;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] pre = new int[p][2];
        
        for(int i = 0;i < p;i++){
            for(int j = 0;j < 2;j++){
                pre[i][j] = sc.nextInt();
            }
        }
        System.out.print(new Solution1().isPossible(n, pre));
    }
}
