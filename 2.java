import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Coin{
    static void sol(int[] coins,int N){
        Arrays.sort(coins);
        int index = coins.length - 1;
        while(true){
            int coinValue = coins[index];
            index--;
            int maxAmount = (N / coinValue) * coinValue;
            if(maxAmount > 0){
                System.out.print("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
                N = N - maxAmount;
            }
            if(N == 0) break;
        }
    }

    public static void main(String[] args) {
        int [] coins = {9,6,5,1};
		int amount = 11;
		System.out.println("Coins available: "+Arrays.toString(coins));
        System.out.println("Target amount: "+ amount);
        Coin.sol(coins, amount);
    }
}