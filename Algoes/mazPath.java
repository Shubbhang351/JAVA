package Algoes;
import java.util.*;

class MazPath {
    public static int count = 0;
    public static void path(int i,int j,int a,int b,String ans){
        if(i == a - 1 && j == b - 1){
            System.out.print(ans + " ");
            count++;
            return;
        }
        if(i + 1 < a){
            path(i + 1,j,a,b,ans + 'V');
        }
        if(j + 1 < b){
            path(i,j + 1, a, b,ans + "H");
        }
        if(i + 1 < a && j + 1 < b){
            path(i + 1, j + 1, a, b, ans + "D");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        path(0,0,a,b,"");
        System.out.println("\n" + count);
    }
}
