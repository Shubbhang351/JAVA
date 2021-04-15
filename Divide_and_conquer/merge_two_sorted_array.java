package Divide_and_conquer;
import java.util.*;

class Merge{

    public static int[] mergeTwoSortedArrays(int[] one, int[] two){
        int ans[] = new int[one.length + two.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < one.length && j < two.length){
            if(one[i] < two[j]){
                ans[k] = one[i];
                i++;
            }
            else{
                ans[k] = two[j];
                j++;
            }
            k++;
        }
        while(i < one.length){
            ans[k] = one[i];
            i++;
            k++;
        }

        while(j < two.length){
            ans[k] = two[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int one[] = {10,30,50,80,100};
        int two[] = {15,20,25,60,70};
        int ans[] = mergeTwoSortedArrays(one, two);
        System.out.println(Arrays.toString(ans));
    }
}