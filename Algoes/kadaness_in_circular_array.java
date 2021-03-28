import java.util.*;

class Solution1{
    public static int kadanes(int a[]){
        int res = a[0];
        int max = res;
        for(int i = 1;i < a.length;i++){
            res = Math.max(a[i], res + a[i]);
            if(res > max)
                max = res;
        }
        return max;
    }

    public static int maxSumInCircularArray(int a[]){
        //case 1 : CE are not wrapping {CE :- Contributing elements}
        int CENonWrapping = kadanes(a);

        //case 2 : CE are wrapping.
        int totalSum = 0;
        for(int i = 0;i < a.length;i++){
            totalSum += a[i];
            a[i] = -a[i];
        }
        int nonCESum = kadanes(a);

        int CEWrapping = totalSum + nonCESum;

        return Math.max(CENonWrapping, CEWrapping);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(maxSumInCircularArray(a));
        }
    }
}