package LeetCode;
import java.util.*;

class combinations77 {
    public static void solve(int n, int lastNum, int k, List<Integer> temp, List<List<Integer>> l){
        if(k == 0){
            l.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = lastNum; i <= n;i++){
            temp.add(i);
            solve(n, lastNum + 1, k - 1, temp, l);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(4, 1, 2, temp, l);
        System.out.println(l);
    }
}
