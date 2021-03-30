package LeetCode;
import java.util.*;

class PermuteString{
    public static boolean solve(String t,String s){
        int a[] = new int[26];
        for(int i = 0;i < t.length();i++){
            a[(int)t.charAt(i) - (int)'a']++;
        }
        return false;
    }
}