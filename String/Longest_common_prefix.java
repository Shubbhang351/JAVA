package String;
import java.util.*;

class longestCommonPrefix {

    public static String solve(String a[] , Integer l[]){
        int min = Collections.min(Arrays.asList(l));
        String ans = "";
        for(int j = 0;j < min;j++){
            char ch = a[0].charAt(j);
            for(int i = 1;i < a.length;i++){
                if(ch != a[i].charAt(j)){
                    return ans;
                }
            }
            ans = ans + ch;
        }
        return ans;
    }

    public static String solve2(String a[]){
        if(a.length == 0){
            return "";
        }
        if(a.length == 1){
            return a[0];
        }
        int len = a.length;
        Arrays.sort(a);
        int min = Math.min(a[0].length() , a[len - 1].length());
        int i = 0;
        while()
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.nextLine();
        String a[] = sc.nextLine().split(" ");
        Integer l[] = new Integer[n];
        for(int i = 0;i < n;i++){
            l[i] = a[i].length();
        }
        System.out.println(solve(a, l));
    }
}
