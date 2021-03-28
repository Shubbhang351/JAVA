package back_traking;

class Queen_combination {
    public static int count = 0;
    public static void queenCombination(boolean[] boxes,int qpsf,int tq, String ans,int last_box){

        if(qpsf == tq){
            count++;
            System.out.println(ans);
            return;
        }

        for(int i = last_box + 1;i < boxes.length;i++){
            
                boxes[i] = true;
                queenCombination(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
                boxes[i] = false;
            
        }
    }

    public static void main(String[] args) {
        queenCombination(new boolean[4], 0, 2, "", -1);
        System.out.println(count);
    }
}
