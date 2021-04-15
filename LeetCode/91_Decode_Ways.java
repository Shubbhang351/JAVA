package LeetCode;
import java.util.*;

class Decode_ways{
    public int numDecodings(String s) {
        int[] arr = new int[s.length()];
        Arrays.fill(arr, -1);
        return encode(s, 0, arr);
    }

    public static int encode(String s, int i, int[] arr){

        if(i == s.length()){
            return 1;
        }

        if(s.charAt(i) == '0'){
            arr[i] = 0;
            return 0;
        }

        int l = 0;
        int r = 0;

        //l = encode(s, i + 1, arr);
        if(i + 1 < arr.length && arr[i + 1] != -1){
            l = arr[i + 1];
        }
        else{
            l = encode(s, i + 1, arr);
        }

        if(i < s.length() - 1){
            int n = Integer.valueOf(s.substring(i, i + 2));
            if(n >= 1 && n <= 26){
                //r = encode(s, i + 2, arr);
                if(i + 2 < arr.length && arr[i + 2] != -1){
                    r = arr[i + 2];
                }
                else{
                    r = encode(s, i + 2, arr);
                }
            }
        }
        arr[i] = l + r;
        return l + r;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new Decode_ways().numDecodings(s));
    }
}