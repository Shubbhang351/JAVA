package LeetCode;
import java.util.*;

class Subsets_78 {
    // No duplicates in arr
    // Respect to Element


    //https://leetcode.com/problems/subsets/


    public static void subset_element_respect(int[] arr,int i, List<Integer> temp, List<List<Integer>> list){
        if(i == arr.length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }

        temp.add(arr[i]);

        subset_element_respect(arr, i + 1, temp, list);

        temp.remove(temp.size() - 1);

        subset_element_respect(arr, i + 1, temp, list);
    }

    public static void subset_user_respect(int[] arr, int vixd, List<Integer> temp, List<List<Integer>> list){
        list.add(new ArrayList<Integer>(temp));

        for(int i = vixd; i < arr.length;i++){
            temp.add(arr[i]);
            subset_user_respect(arr, i + 1, temp, list);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        //subset_element_respect(arr, 0, temp, list);
        subset_user_respect(arr, 0, temp, list);
        System.out.println(list);
    }
}
