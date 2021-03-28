package Data_structure.Array;

import java.util.Arrays;
import java.util.Scanner;

class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int c = n - 1;c >= 0;c--){
            for(int r = 0;r < n;r++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}
