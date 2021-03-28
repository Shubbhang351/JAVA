import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int counter[] = new int[256];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
        Arrays.sort(counter);
        System.out.println(counter[counter.length-1]);
    }
}
