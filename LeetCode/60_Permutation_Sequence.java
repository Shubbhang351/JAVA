package LeetCode;
import java.util.*;

class Permutation_Sequence_60 {
    static int o = 0;
    public static void permute(int[] nums, boolean[] available, List<Integer> temp, List<List<Integer>> list, int k){

        if(temp.size() == nums.length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = 0;i < nums.length;i++){
            if(available[i] == false){
                continue;
            }

            available[i] = false;
            temp.add(nums[i]);
            permute(nums, available, temp, list, k);

            temp.remove(temp.size() - 1);
            available[i] = true;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        boolean[] available = new boolean[nums.length];
        Arrays.fill(available, true);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        permute(nums, available, temp, list,3);
        System.out.println(list);
    }
}
