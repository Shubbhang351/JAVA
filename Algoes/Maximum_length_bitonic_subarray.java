package Algoes;

import java.util.*;

class Solution34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            int maxi[] = new int[n];
            int mini[] = new int[n];
            for(int i = 0;i < n;i++){
                if(i == 0){
                    maxi[i] = 1;
                    continue;
                }
                maxi[i] = a[i] >= a[i - 1] ? maxi[i - 1] + 1 : 1;
            }
            //System.out.println(Arrays.toString(maxi));
            for(int i = n - 1;i >= 0;i--){
                if(i == n - 1){
                    mini[i] = 1;
                    continue;
                }
                mini[i] = a[i] >= a[i + 1] ? mini[i + 1] + 1 : 1;
            }
            //System.out.println(Arrays.toString(mini));

            int ans = Integer.MIN_VALUE;
            for(int i = 0;i < n;i++){
                int k = maxi[i] + mini[i] - 1;
               
                if(ans < k){
                    ans = k;
                }
            }
            System.out.println(ans);
        }
    }
}
