package Algoes;

import java.util.*;

class Solution{
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        int res = a[0];
       
        int max = res;
        for(int i = 1;i < a.length;i++){
            res = Math.max(a[i], res + a[i]);
            if(res > max){
                max = res;
            }
        }
        System.out.println(max);
    }
}