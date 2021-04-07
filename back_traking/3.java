package back_traking;
import java.util.*;


class Main_123 {

    public static int check(int ar[]){
        if(ar.length == 1)return 0;
        int b=0;
        int e=0;
        int size=ar.length;
        int sum=0;

        for(int x:ar)
            e+=x;

        for(int i=0; i<size; ++i){
            b+=ar[i];
            e-=ar[i];
            if(e==b){
                ++sum;
                int ar1[]=new int[i+1];
                int ar2[]=new int[size-ar1.length];

                for(int j=0; j<=i; ++j)
                    ar1[j]=ar[j];
                for(int k=0; k<ar2.length; ++k)
                    ar2[k]=ar[k+i+1];
                

                int s1=check(ar1);
                int s2=check(ar2);
                sum+=s1 > s2 ? s1:s2;
                return sum;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int size=sc.nextInt();
            sc.nextLine();
            String s[]=sc.nextLine().split(" ");
            int ar[]=new int[size];
            for(int i=0; i<size; ++i)
                ar[i]=Integer.valueOf(s[i]);

            System.out.println(check(ar));
        }
    }
}