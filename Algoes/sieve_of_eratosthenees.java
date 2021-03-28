package Algoes;

import java.util.Arrays;
import java.util.Scanner;

public class sieve_of_eratosthenees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] a = new boolean[n + 1];
        Arrays.fill(a, true);
        a[0] = false;
        a[1] = false;
   
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2;i <= sqrt;i++){
            if(a[i]){
                int j = 2;
                while(i * j <= n){
                    a[i * j] = false;
                    j++;
                }
            }
        }
        for(int i = 0;i < a.length;i++){
            if(a[i]){
                System.out.print(i + " ");
            }
        }
    }
}
