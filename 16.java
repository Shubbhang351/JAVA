import java.util.*;

class Solution16 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = n * 2 - 1;
        int space = 1;
        for(int i = 1; i <= n;i++){
            if(i >= 3 && i <= n / 2){
                space = space + 2;
            }
            else{
                space = space - 2;
            }
            int nn = (col - space) / 2;
            int p = 1;
            int s = nn - i;
            int d = i;
            for(int j = 1;j <= col;j++){
                if(i == 1 || i == n){
                    if(j == col / 2 + 1){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(p == 1){
                        if(s > 0){
                            System.out.print(" ");
                        }
                        else{
                            
                        }
                    }
                }
            }
        }
    }
}
