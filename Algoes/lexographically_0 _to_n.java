package Algoes;

class lexographically {
    public static void lexicoCounting(int curr, int n) {
        if (curr > n) {
            return;
        } 
         else {
            System.out.println(curr);
            int i = curr == 0 ? 1 : 0;
            while(i <= 9){
                
                lexicoCounting(curr * 10 + i, n);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        
        lexicoCounting(0, 1000);
    }
}
