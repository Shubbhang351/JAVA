import java.util.*;

class Solution3 {
    public static boolean nextPermutation(int a[]){
        int i = a.length - 1;
        while(i > 0 && a[i - 1] >= a[i]){
            i--;
        }
        if(i <= 0){
            return false;
        }
        int j = a.length - 1;
        while(a[j] <= a[i - 1]){
            j--;
        }
        int temp = a[j];
        a[j] = a[i - 1];
        a[i - 1] = temp;

        ArrayList<Integer> t = new ArrayList<>();
        for(int o = a.length - 1;o >= i;o--){
            t.add(a[o]);
        }
        int k = 0;
        for(int o = i;o < a.length;o++){
            a[o] = t.get(k);
            k++;
        }
        return true;
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
            if(!nextPermutation(a)){
                Arrays.sort(a);
            }
            for(int i = 0;i < a.length;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
