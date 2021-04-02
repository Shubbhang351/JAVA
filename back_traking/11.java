import java.util.*;
public class Main {

    public static boolean isPalen(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String s1 = new String(s);
        
        String t = "";

        while(s.length() > 0){
            if(isPalen(s)){
                break;
            }
            else{
                t = t + s.charAt(s.length() - 1);

                s = s.substring(0, s.length() - 1);
            }
        }
        System.out.println(t + s1);
    }
}