package back_traking;

class NQueen2 {
    static int count = 0;

    public static void queenCombination(boolean[][] board, int tq, int qpsf, int row, String ans) {
        if (tq == qpsf) {
            count++;
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board[row].length; i++) {
            if (isSafeToPlaceQueen(board, row, i)) {
                board[row][i] = true;
                queenCombination(board, tq, qpsf + 1, row + 1, ans + "(" + row + "-" + i + ")" + " ");
                board[row][i] = false;
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
