import java.util.*;



class Solution17{

    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int z = 0;
        int o = 0;
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            if(a[i] == 0)
                z++;
            else
                o++;
        }
        int j = 0;
        while(true){
            if(z > 0){
                a[j] = 0;
                j++;
                z--;
            }
            else if(o > 0){
                a[j] = 1;
                j++;
                o--;
            }
            else{
                break;
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
        

    }
}