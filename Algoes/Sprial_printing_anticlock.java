package Algoes;

import java.util.ArrayList;

class Sprial {

    public static ArrayList<Integer> sprialAntiClock(int[][] a){

        ArrayList<Integer> ans = new ArrayList<>();

        int minRow = 0;
        int maxRow = a.length - 1;
        int minCol = 0;
        int maxCol = a[0].length - 1;

        int nel = a.length * a[0].length;
        int count = 0;

        while(count < nel){
        // first column
        for(int r = minRow; r <= maxRow;r++){
            if(count >= nel){
                break;
            }
            ans.add(a[r][minCol]);
            count++;
        }
        minCol++;

        // last Row
        for(int c = minCol ; c <= maxCol;c++){
            if(count >= nel){
                break;
            }
            ans.add(a[maxRow][c]);
            count++;
        }
        maxRow--;
        

        // last column
        for(int r = maxRow ; r >= minRow ; r--){
            if(count >= nel){
                break;
            }
            ans.add(a[r][maxCol]);
            count++;
        }
        maxCol--;
        

        // first row
        for(int c = maxCol ; c >= minCol ; c--){
            if(count >= nel){
                break;
            }
            ans.add(a[minRow][c]);
            count++;
        }
        minRow++;
        
        }
        return ans;
    }

    public static ArrayList<Integer> sprialClock(int a[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        int minRow = 0;
        int maxRow = a.length - 1;
        int minCol = 0;
        int maxCol = a[0].length - 1;

        int nel = a.length * a[0].length;
        int count = 0;
        while(count < nel){
            // first row
            for(int c = minCol ; c <= maxCol ; c++){
                if(count >= nel){
                    break;
                }
                ans.add(a[minRow][c]);
                count++;
            }
            minRow++;

            // last column
            for(int r = minRow ; r <= maxRow ;r++){
                if(count >= nel){
                    break;
                }
                ans.add(a[r][maxCol]);
                count++;
            }
            maxCol--;

            // last row
            for(int c = maxCol ; c >= minCol ; c--){
                if(count >= nel){
                    break;
                }
                ans.add(a[maxRow][c]);
                count++;
            }
            maxRow--;

            // first column
            for(int r = maxRow ; r >= minRow ; r--){
                if(count >= nel){
                    break;
                }
                ans.add(a[r][minCol]);
                count++;
            }
            minCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[][] = {{6, 6, 2, 28, 2}, {12, 26, 3, 28, 7}, {22, 25, 3, 4, 23}};
        ArrayList<Integer> ans = sprialClock(a);
        System.out.println(ans);
    }
}
