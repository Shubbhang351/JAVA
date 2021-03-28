package sorting;
import java.util.*;

class Climbing{
    public static void climb(int curr,int n, String ans){
        if(curr > n){
            return;
        }
        if(curr == n){
            System.out.println(ans);
            return;
        }

        climb(curr + 1, n, ans + 1);
        climb(curr + 2, n, ans + 2);
        climb(curr + 3, n, ans + 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        climb(0, n, "");
    }
}