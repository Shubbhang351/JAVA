package back_traking;

class NKnights{
    public static void knightsCombinations(boolean[][] board, int tk, int kpsf, String ans, int row, int col){
        // positive base case
        if(tk == kpsf){
            System.out.println(ans);
            return;
        }

        // extra reCall to change the row
        if(col == board[0].length){
            knightsCombinations(board, tk, kpsf, ans, row + 1, 0);
            return;
        }

        // negative base case :- exit from board
        if(row == board.length){
            return;
        }

        // knight can be placed in current board (col th)
        board[row][col] = true;
        knightsCombinations(board, tk, kpsf + 1, ans + "(" + row + "-" + col + ")" + " ", row, col + 1);
        board[row][col] = false;

        // knight can not be placed in current board (col th)
        knightsCombinations(board, tk, kpsf, ans, row, col + 1);
    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knightsCombinations(board, 4, 0, "", 0, 0);
    }
}