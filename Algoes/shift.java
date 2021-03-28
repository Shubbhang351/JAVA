package Algoes;
import java.util.*;


class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        // int a[][] = {{5,4,5,3,6,1},{1,2,3,4,8,10},{10,6,10,5,3,3},{1,2,3,8,9,9},{2,7,1,7,2,1},{7,6,6,7,2,5}};
        // int k = 3;
        for(int i = 0;i < a.length;i++){
            int b[] = new int[a[i].length];
            for(int j = 0;j < a[i].length;j++){
                int e = j - k;
                if(e < 0){
                    e = a[i].length + e;
                }
                b[e] = a[i][j];
            }
            a[i] = b;
        }
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
