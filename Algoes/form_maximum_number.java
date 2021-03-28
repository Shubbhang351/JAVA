package Algoes;

import java.util.*;

class Soluition33 {
    public static void main(String[] args) {
        List a = new ArrayList<>();
        for(int i = 10;i > 0;i--){
            a.add(i);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
