package back_traking;
import java.util.*;

class CoinChange_single_duplicateDenom {
    public static void coinChange_User_respect(int[] denom, int amount, String ans, int lastDenomIndex){
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        if(lastDenomIndex == denom.length || amount < 0){
            return;
        }

        for(int i = lastDenomIndex; i < denom.length; i++){
            
            if(i > lastDenomIndex && denom[i] == denom[i - 1]){
                continue;
            }

            coinChange_User_respect(denom, amount - denom[i], ans + denom[i] + " ", i + 1);
        }
    }

    // public static void coinChange_coin_respect(int[] denom, int amount, String ans, in)

    // we have duplicate coins in denom[] and we have to use the coin only single time.

    public static void main(String[] args) {
        int denom[] = {2,2,2,3,4};

        Arrays.sort(denom);

        coinChange_User_respect(denom, 6, "", 0);
    }
}
