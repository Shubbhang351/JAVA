import java.util.*;
public class Main {

    public static int solve(int ele, int t){
        if(ele == 0){
            return 0;
        }
        if(ele <= t){
            return 1;
        }
        int count = 0;
        while(ele > t){
            ele = ele - t;
            count++;
        }
        count++;
        return count;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0;i < n;i++){
            ans += solve(a[i], k);
        }
        System.out.println(ans);
    }
}