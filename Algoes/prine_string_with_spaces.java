package Algoes;
import java.util.*;

class Prine_string_with_spaces {
    public static void solve(String s,String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        solve(s.substring(1), ans + " " + s.charAt(0));


        solve(s.substring(1), ans + s.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solve(s.substring(1), "" + s.charAt(0));
    }
}
