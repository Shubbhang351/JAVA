package LeetCode;

import java.util.ArrayList;
import java.util.*;

class Permutation_47 {
    public static void permute2(int[] nums, boolean[] available, List<Integer> temp, List<List<Integer>> list){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0;i < nums.length;i++){
            if(available[i] == false){
                continue;
            }

            if(i > 0 && nums[i] == nums[i - 1] && available[i-1]){
                continue;
            }
            

            available[i] = false;
            temp.add(nums[i]);

            permute2(nums, available, temp, list);

            temp.remove(temp.size() - 1);
            available[i] = true;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3};

        boolean[] available = new boolean[nums.length];
        Arrays.fill(available, true);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        permute2(nums, available, temp, list);
        System.out.println(list);
    }
}
