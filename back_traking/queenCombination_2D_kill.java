package back_traking;

class QueenCombination_2D_kill {
    public static void queenCombination_extra_reCall(boolean[][] board, int tq, int qpsf, String ans, int row,
            int col) {
        // positive base case
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }

        // extra reCall
        if (col == board[0].length) {
            queenCombination_extra_reCall(board, tq, qpsf, ans, row + 1, 0);
            return;
        }

        // negative base case
        if (row == board.length) {
            return;
        }

        // place queen in current box (col th) if it is safe.
        if (isItSafeToPlaceTheQueen(board, row, col)) {
            
            board[row][col] = true;
            queenCombination_extra_reCall(board, tq, qpsf + 1, ans + "(" + row + "-" + col + ")" + " ", row, col + 1);
            board[row][col] = false;
        }

        // not place queen in current box (col th)
        queenCombination_extra_reCall(board, tq, qpsf, ans, row, col + 1);
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
        
        int r = row - 1;
        int c = col;
        // vertically upward
        while(r >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
        }

        // horizontallt left
        r = row;
        c = col - 1;
        while(c >= 0){
            if(board[r][c]){
                return false;
            }
            c--;
        }
         

        // diagonally left
        r = row - 1;
        c = col - 1;

        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        // diagonally right
        r = row - 1;
        c = col + 1;
        while(r >= 0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean board[][] = new boolean[3][4];
        queenCombination_extra_reCall(board, 3, 0, "", 0, 0);
    }
}
