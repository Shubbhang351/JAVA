import java.io.*;
import java.util.*;

class Solution{
    public static boolean bin(int arr[],int x){
        
        int s = 0;
        int e = arr.length;
        while(s < e){
            int mid = (s + e) / 2;
            if(arr[mid] == x){
                return true;
            }
            else if(arr[mid] < x){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        return false;
    }
    public void solve(int a[], int x){
        Arrays.sort(a);
        for(int i = 0;i < a.length;i++){
            int r = x - a[i];
            if(r > 0){
                if(bin(a,r)){
                    
                    System.out.print("yes");
                    return;
                }
            }
        }
        System.out.print("no");
    }

    public static void main(String...args){
        int[] A = {1,4,45,6,10,8};
        new Solution().solve(A,16);
        System.out.print((int)Math.sqrt(4));
        Set<Integer> set = new HashSet<Integer>();
        set.add(16);
        set.size();
    }
}