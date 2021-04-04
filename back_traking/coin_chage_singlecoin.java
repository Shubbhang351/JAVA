package back_traking;

class Coin_chage_singlecoin {
    public static void coinChange(int[] denom, int amount, String ans, int i){
        if(amount == 0){
            System.out.println(">>" +ans);
            return;
        }

        if(i >= denom.length || amount < 0){
            return;
        }

        for(int j = i;j < denom.length;j++){
            coinChange(denom, amount - denom[j], ans + " " + denom[j], j + 1);
        }
    }

    public static void coinChange2(int[] denom, int amount, String ans, int i){

        if(amount == 0){
            System.out.println(">>" +ans);
            return;
        }

        if(i >= denom.length || amount < 0){
            return;
        }

        coinChange2(denom, amount - denom[i], ans + " " + denom[i], i + 1);

        coinChange2(denom, amount, ans, i + 1);
    }
    

    public static void main(String[] args) {
        int[] denom = {1,2,3};
        coinChange2(denom, 3, "", 0);
    }
}
