package LeetCode;
import java.util.*;

class Decode_ways{
    public int numDecodings(String s) {
        return encode(s, 0);
    }

    public static int encode(String s, int i){

        if(i == s.length()){
            return 1;
        }

        if(s.charAt(i) == '0'){
            return 0;
        }

        int l = 0;
        int r = 0;

        l = encode(s, i + 1);

        if(i < s.length() - 1){
            int n = Integer.valueOf(s.substring(i, i + 2));
            if(n >= 1 && n <= 26){
                r = encode(s, i + 2);
            }
        }
        return l + r;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new Decode_ways().numDecodings(s));
    }
}