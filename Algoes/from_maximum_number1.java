package Algoes;

import java.util.*;

class FromLargest {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = { 1, 2, 3, 1, 2, 4, 1 };
        int m[] = { 2, 1, 3, 1, 5, 2, 2 };
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < n;i++){
            if(h.containsKey(a[i])){
                h.put(a[i], h.get(a[i]) + 1);
            }
            else{
                h.put(a[i], 1);
            }
        }
        // for(int i = 0;i < n;i++){
        // a[i] = sc.nextInt();
        // h.put(a[i], 1);
        // }
        // for(int i = 0;i < n;i++){
        // m[i] = sc.nextInt();
        // }
        for (int i = 0; i < n; i++) {
            h.put(a[i], h.get(a[i]) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int j = 0; j < n; j++) {
            if (h.containsKey(m[j])) {
                if (h.get(m[j]) > 0) {
                    ans.add(m[j]);
                    h.put(m[j], h.get(m[j]) - 1);
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    
    }
}