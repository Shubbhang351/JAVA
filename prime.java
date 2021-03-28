import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for(int i = 2;i <= (int)Math.sqrt(n);i++){
            if(primes[i] == true){
                for(int j = 2;i * j <= n;j++){
                    primes[i * j] = false;
                }
            }
        }

        for(int i = 0;i < primes.length;i++){
            if(primes[i] == true){
                System.out.println(i);
            }
        }
    }
}
