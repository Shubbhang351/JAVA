package back_traking;

class Coin_Change_coin_respect {
    public static void coinChange(int denom[], int amount, int i, String ans){
        // positive base case
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        // negative base case
        if(amount < 0 || i >= denom.length){
            return;
        }

        // current (i th) coin can contribute in amount
        coinChange(denom, amount - denom[i], i, ans + denom[i] + " ");

        // current (i th) coin can not contribute in amount
        coinChange(denom, amount, i + 1, ans);
    }

    public static void main(String[] args) {
        int[] denom = {2,3,5};
        int amount = 7;
        coinChange(denom, amount, 0, "");
    }
}
