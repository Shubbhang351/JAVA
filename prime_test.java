import java.util.*;

class prime_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("Not Prime");
        }
        else if(n == 2 || n == 3){
            System.out.println("Prime");
        }
        else{
            for(int i = 2;i <= (int)Math.sqrt(n);i++){
                if(n % i == 0){
                    System.out.println("Not Prime");
                    System.exit(0);
                }
            }
            System.out.println("Prime");
        }
    }
}
