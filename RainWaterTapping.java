import java.util.*;

public class RainWaterTapping {

    public static int trappingRainWater(int[] a){
        int ans = 0;
        int[] left_high = new int[a.length];
        int[] right_high = new int[a.length];
        for(int i = 0;i < a.length;i++){
            if(i == 0){
                left_high[i] = a[i];
                continue;
            }
            left_high[i] = Math.max(a[i] , left_high[i - 1]);
        }
        for(int i = right_high.length - 1;i >= 0;i--){
            if(i == right_high.length - 1){
                right_high[i] = a[i];
                continue;
            }
            right_high[i] = Math.max(right_high[i + 1] , a[i]);
        }
        
        for(int i = 0 ; i < a.length ; i++){
            int min = Math.min(left_high[i] , right_high[i]);
            ans += min - a[i];
        }
      
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int b[] = {2, 0, 2};
        int c[] = {3, 0, 2, 0, 4};
        trappingRainWater(c);
    }
}
