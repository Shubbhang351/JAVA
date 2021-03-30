package Algoes;
import java.util.*;

class Subset_target {
    static int count;
    public static void subSet(int i,int sum,int[] arr,String ans,int target){
        if(i == arr.length){
            if(sum == target){
                System.out.print(ans + " ");
                count++;
            }
            return;
        }
        subSet(i + 1,sum + arr[i], arr, ans + arr[i] + " ",target);
        subSet(i + 1,sum, arr, ans,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        subSet(0,0, arr, "",target);
        System.out.print("\n" + count);
    }
}
