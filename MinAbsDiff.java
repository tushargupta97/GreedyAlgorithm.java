import java.util.*;
public class MinAbsDiff {
    public static void main(String[] args) {
       int A[]={4,1,8,7}, B[]={2,3,6,5};
       int minDiff=0;
       Arrays.sort(A);Arrays.sort(B);
       for(int i=0;i<A.length;i++){
        minDiff+=Math.abs(A[i]-B[i]);
       } 
       System.out.println("Min absolute difference of pairs ="+minDiff);
    }
}
