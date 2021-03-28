package Algoes;

class Jumping_number {
    public static void jumping(int curr,int n){
        if(curr > n){
            return;
        }
        else if(curr == 0){
            System.out.println(curr);
            for(int i = 1;i <= 9;i++){
                jumping(curr + i, n);
            }
        }
        else{
            System.out.println(curr);
            int r = curr % 10;
            if(r != 0){
                int curr1 = curr * 10 + (r - 1);
                jumping(curr1, n);
            }
            if(r != 9){
                jumping(curr * 10 + (r + 1), n);
            }
        }
    }

    public static void main(String[] args) {
        jumping(0, 20);
    }
}
