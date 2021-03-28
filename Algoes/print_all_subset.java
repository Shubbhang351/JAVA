package Algoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class printAllSubset {
    public static void printSubset(int arr[],String ans,int i){
        if(i == arr.length){
            System.out.println(ans);
            return;
        }

        // no call for ith index not to add in subset
        printSubset(arr, ans, i + 1);

        // yes call for ith index to add in subset
        printSubset(arr, ans + arr[i] + " ", i + 1);

        
    }

    public static void print_sum_of_subset(int arr[],int sum,int i, ArrayList<Integer> l){
        if(i == arr.length){
            l.add(sum);
            return;
        }

        // no call for ith index not to add in subset
        print_sum_of_subset(arr, sum, i + 1, l);


        // yes call for ith index to add in subset
        print_sum_of_subset(arr, sum + arr[i], i + 1, l);

        
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        printSubset(arr, "", 0);
        System.out.println("------------------");
        ArrayList<Integer> ans = new ArrayList();
        print_sum_of_subset(arr, 0, 0, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
