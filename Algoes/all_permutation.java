package Algoes;
import java.util.*;

class All_permutation {
    public static void permute(String ans,String s){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
     
        for(int j = 0;j < s.length();j++){
            String ss = s.substring(0, j) + s.substring(j + 1);
            permute(ans + s.charAt(j), ss);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdef";
       
        permute("", s);
    }
}
