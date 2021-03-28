import java.util.*;

class Try {
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i <= n;i++){
            System.out.println("Entere number");
            int e = sc.nextInt();
            System.out.println("ans >>" +fibonacci(e));
        }
    }
}
