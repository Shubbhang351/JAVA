import java.util.*;

// find no. of triangles form from the elements of an unsorted array
// Input :- [3,5,4]
// output :- 1
// 
// Input :- [6,4,9,7,8]
// output :- 10 

class Solution2 {
    public static int noOfTriangles(int a[]){
        Arrays.sort(a);
        int count = 0;
        for(int i = a.length - 1;i >= 0;i--){
            int l = 0;
            int r = i - 1;
            while(l < r){
                if(a[l] + a[r] > a[i]){
                    count += r - l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {6,4,9,7,8};
        System.out.println(noOfTriangles(a));
    }
}
