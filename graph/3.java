package graph;


import java.util.*;

class Solution3 {

    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int n){
        if(visited[n] == false){
            visited[n] = true;
            for(int i = 0;i < adj.get(n).size();i++){
                dfs(adj,visited,adj.get(n).get(i));
            }
        }
        return;
    }

    public int isEularCircuitExist(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];

        for(int i = 0;i < adj.size();i++){
            if(visited[i] == false && adj.get(i).size() > 0){
                dfs(adj,visited,i);
                break;
            }
        }
        
        for(int i = 0;i < visited.length;i++){
            if(visited[i] == false && adj.get(i).size() > 0){
                return 0;
            }
        }
        int count_even = 0;
        int count_odd = 0;
        for(int i = 0;i < adj.size();i++){
            if(adj.get(i).size() % 2 == 0){
                count_even++;
            }
            else{
                count_odd++;
            }
        }

        if(count_even == adj.size()){
            return 2;
        }
        else if(count_odd == 2){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < V;i++){
            adj.add(new ArrayList<Integer>());
        }
        int e = sc.nextInt();
        while(e-- > 0){
            System.out.print("a : ");
            int a = sc.nextInt();
            System.out.print("\n" + "b : ");
            int b = sc.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        for(ArrayList a:adj){
            System.out.print(a);
        }

        System.out.print("ans  >> " +new Solution3().isEularCircuitExist(V, adj));
    }
}
