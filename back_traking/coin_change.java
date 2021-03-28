package back_traking;
import java.util.*;

class Coin_change {
    static int count = 0;
    public static void coinChange(int denom[],int amount, int lastDenomIndex, String ans){
        if(amount == 0){
            count++;
            System.out.println(ans);
            return;
        }
       

        for(int i = lastDenomIndex; i < denom.length; i++){
            if(amount >= denom[i]){
                coinChange(denom, amount - denom[i], i, ans + denom[i]);
            }
        }
    }

    public static void main(String[] args) {
        int denom[] = {2,3,5,6};
        int amount = 10;
        int lastDenomIndex = 0;
        coinChange(denom, amount, lastDenomIndex, "");
    }
}
