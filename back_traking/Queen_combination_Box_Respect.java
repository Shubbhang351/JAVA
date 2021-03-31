package back_traking;

class Queen_combination_Box_Respect {
    public static void queenCombination(boolean[] boxes, int tq, String ans, int box){
        if(tq == 0){
            System.out.println(ans);
            return;
        }
        if(box >= boxes.length){
            return;
        }
        
        queenCombination(boxes, tq - 1, ans + 'b' + box + " ", box + 1);

        queenCombination(boxes, tq, ans, box + 1);
    }

    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        queenCombination(boxes, 3, "", 0);
    }
}
