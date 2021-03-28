package Algoes;

import java.util.*;

public class Union_and_intersection_sortedArray {

    public static void union(int a[],int b[]){
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                System.out.print(a[i] + " ");
                i++;
            }
            else if(b[j] < a[i]){
                System.out.print(b[j] + " ");
                j++;
            }
            else{
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
    }

    public static void intersection(int a[],int b[]){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < a.length && j <b.length){
            if(a[i] == b[j]){
                if(ans.size() > 0 && ans.get(ans.size() - 1) == a[i]){
                    i++;
                    j++;
                }
                else{
                    ans.add(a[i]);
                    i++;
                    j++;
                }
            }
            else if(a[i] < b[j]){
                i++;
            }
            else {
                j++;
            }
        }
        for(Integer k : ans){
            System.out.print(k + "");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[n];
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        
        union(a, b);
        intersection(a, b);
    }
    
}
