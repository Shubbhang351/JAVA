package back_traking;

import java.util.*;

class Queen_permute {
    public static int count = 0;
    public static void queenPermutations(boolean boxes[], int qpsf, int tq, String ans) {

        if(qpsf == tq){
            count++;
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == false) {
                boxes[i] = true;
                queenPermutations(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
                boxes[i] = false;  //undo step.
            }
        }
    }

    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        queenPermutations(boxes, 0, 2, "");
        System.out.println(count);
    }
} 