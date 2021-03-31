package back_traking;

class Coin_change_permutation {
    public static void coinChange(int[] denom, int amount, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i < denom.length;i++){
            if(denom[i] <= amount){
                coinChange(denom, amount - denom[i], ans + " " + denom[i]);
            }
        }
    }

    public static void main(String[] args) {
        int denom[] = {2,3,5};
        int amount = 7;
        
        coinChange(denom, amount, "");
    }
}
