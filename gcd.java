import java.util.*;

class gcd {

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a % b);
        }
    }

    public static int lcm(int a,int b){
        return (a * b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(lcm(n1,n2));
    }
}
