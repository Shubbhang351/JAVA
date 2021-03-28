package String;

import java.util.*;
import java.util.regex.*;

public class PatternJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pt = Pattern.compile("[A-Z]{1}[a-z]*");
        String s = sc.nextLine();
        Matcher m = pt.matcher(s); 
        while (m.find()) {
            System.out.println(m.group());
         }
    }
}
