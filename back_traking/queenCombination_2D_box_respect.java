package back_traking;

class QueenCombination_2D_box_respect {
    static int count = 0;
    static int count1 = 0;
    public static void queenCombination_extra_reCall(boolean[][] boxes, int tq,int qpsf,String ans, int row, int col){
        // positive base case
        if(tq == qpsf){
            count++;
            System.out.println(ans);
            return;
        }

        // extra reCall
        if(col == boxes[0].length){
            queenCombination_extra_reCall(boxes, tq, qpsf, ans, row + 1, 0);
            return;
        }

        // negative base case
        if(row == boxes.length){
            return;
        }

        // place queen in current box (col th)
        boxes[row][col] = true;
        queenCombination_extra_reCall(boxes, tq, qpsf + 1, ans + "(" + row + "-" + col + ")" + " ", row, col + 1);
        boxes[row][col] = false;
        
        // not place queen in current box (col th)
        queenCombination_extra_reCall(boxes, tq, qpsf, ans, row, col + 1);
    }

    // manually change 
    public static void queenCombination(boolean[][] boxes, int tq,int qpsf,String ans, int row, int col){
        // positive base case
        if(tq == qpsf){
            count1++;
            System.out.println(ans);
            return;
        }

        // extra reCall
        if(col == boxes[0].length){
            col = 0;
            row++;
        }

        // negative base case
        if(row == boxes.length){
            return;
        }

        // place queen in current box (col th)
        boxes[row][col] = true;
        queenCombination(boxes, tq, qpsf + 1, ans + "(" + row + "-" + col + ")" + " ", row, col + 1);
        boxes[row][col] = false;
        
        // not place queen in current box (col th)
        queenCombination(boxes, tq, qpsf, ans, row, col + 1);
    }

    public static void main(String[] args) {
        boolean[][] boxes = new boolean[4][4];
        queenCombination(boxes, 4, 0, "", 0, 0);
        System.out.println(count1);
    }
}
