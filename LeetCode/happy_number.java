package LeetCode;
import java.util.*;

class Happy_number {
    public static int count = 0;
    public static int new_number(int n){
        int new_num = 0;
        while(n > 0){
            int rem = n % 10;
            new_num += (rem * rem);
            n = n / 10;
        }
        return new_num;
    }

    public static boolean is_Happy_number(int n){
        if(n == 1){
            return true;
        }
        // after observing we can see that 2,3,4,5,6,8,9 are not lucky number except 7.
        // so in every cycle if we get (2,3,4,5,6,8,9) then they are not lucky.
        // after observing we get cycle of 4 in (2,3,5,6,8,9) and 4 is not a lucky number.
        if(n != 7 && n < 10){
            return false;
        }
        count++;
        return is_Happy_number(new_number(n));
    }

    public static void main(String[] args) {
        System.out.println(is_Happy_number(19));
    }
}
