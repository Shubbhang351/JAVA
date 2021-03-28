package Algoes;

import java.util.*;

class Code_of_string {

    public static void solve(String s, String ans, String all_alpha, ArrayList<String> l) {
        if (s.length() == 0) {
            l.add(ans);
            return;
        }
        if (s.length() == 1) {
            ans += all_alpha.charAt(Integer.valueOf(s) - 1);
            l.add(ans);
            return;
        }

        String ans1 = ans + all_alpha.charAt(Integer.valueOf(s.substring(0, 1)) - 1);
        String s1 = s.substring(1);
        solve(s1, ans1, all_alpha, l);

        if (Integer.valueOf(s.substring(0, 2)) - 1 <= 25) {
            ans1 = ans + all_alpha.charAt(Integer.valueOf(s.substring(0, 2)) - 1);
            s1 = s.substring(2);
            solve(s1, ans1, all_alpha, l);
        }

        // ans1 = ans + all_alpha.charAt(Integer.valueOf(s.substring(0, 2)) - 1);
        // s1 = s.substring(2);
        // solve(s1, ans1, all_alpha, l);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "252";
        String all_alpha = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> ans = new ArrayList<>();
        solve(s, "", all_alpha, ans);
        System.out.println(ans);
    }
}
