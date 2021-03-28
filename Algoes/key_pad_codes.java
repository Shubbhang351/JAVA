package Algoes;
import java.util.*;

class Key_pad_codes {
    public static void solve(String s,String ans,String[] n,ArrayList<String> l){
        if(s.length() == 0){
            l.add(ans);
            return;
        }

        String oo = n[Integer.valueOf(s.substring(0, 1)) - 1];
        for(int i = 0;i < oo.length();i++){
            String s1 = s.substring(1);
            solve(s1, ans + oo.charAt(i), n, l);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] n = {"abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        ArrayList<String> ans = new ArrayList<>();
        solve(s, "", n, ans);
        for(String i:ans){
            System.out.print(i + " ");
        }
        System.out.println("\n" + ans.size());
    }
}
