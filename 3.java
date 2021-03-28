import java.util.*;

class Solution3 {

    public static boolean isPrime(int n){
        int s = (int)Math.sqrt(n);
        for(int i = 1;i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
