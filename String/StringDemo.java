package String;

import java.lang.reflect.Array;
import java.util.*;

public class StringDemo {
    public static boolean checkPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static String isAna(String s1,String s2){
        int all_char = 26;
        int a1[] = new int[all_char];
        int a2[] = new int[all_char];
        for(int i = 0;i < s1.length();i++){
            int k = s1.charAt(i);
            if(k >= (int)'a' && k <= (int)'z'){
                a1[k - (int)'a']++;
            }
        }
        for(int i = 0;i < s2.length();i++){
            int k = s2.charAt(i);
            if(k >= (int)'a' && k <= (int)'z'){
                a2[k - (int)'a']++;
            }
        }
        for(int i = 0;i < a1.length;i++){
            if(a1[i] != a2[i]){
                return "False";
            }
        }
        return "True";
    }

    public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    }

    public static void change(String a[],int i,int j){
        String s1 = a[i];
        String s2 = a[j];
        if(s1.length() == s2.length() || s1.charAt(0) != s2.charAt(0)){
            return;
        }
        int sl = s1.length() < s2.length() ? s1.length() : s2.length();
        String s3 = s1.substring(0, sl);
        String s4 = s2.substring(0, sl);
        if(s3.equals(s4)){
            a[i] = s2;
            a[j] = s1;
            return;
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a[] = new String[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextLine();
        }
        Arrays.sort(a);
        for(int i = 0;i < n;i++){
            if(i == n - 1){
                break;
            }
            change(a, i, i + 1);
        }
        for(int i = 0;i < n;i++){
            System.out.println(a[i]);
        }
    }
}
