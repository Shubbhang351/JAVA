package Algoes;
import java.util.*;

class BoardPath {
    public static int count = 0;
    public static void path(int i,int m,int n,String ans){
        if(i == n){
            System.out.print(ans + " ");
            count++;
            return;
        }
        else if(i > n){
            return;
        }
        else{
            for(int j = 1;j <= m;j++){
                path(i + j, m, n, ans + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        path(0, m, n, "");
        System.out.print("\n" + count);
    }
}
