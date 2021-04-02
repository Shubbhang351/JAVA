package back_traking;

class NQueen2 {
    static int count = 0;

    public static void queenCombination(boolean[][] board, int tq, int qpsf, int row, String ans) {
        if (tq == qpsf) {
            count++;
            System.out.println(ans);
            return;
        }

        if(row == board.length){
            return;
        }

        for (int col = 0; col < board[row].length; col++) {
            if (isSafeToPlaceQueen(board, row, col)) {
                board[row][col] = true;
                queenCombination(board, tq, qpsf + 1, row + 1, ans + "(" + row + "-" + col + ")" + " ");
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafeToPlaceQueen(boolean[][] board, int row, int col) {
        // vertically up
        int r = row - 1;
        int c = col;
        while (r >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }

        // digonally left
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // diagonally right
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];

        queenCombination(board, n, 0, 0, "");
        System.out.println(count);
    }
}
