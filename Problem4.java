public class Problem4 {
 public static void main(String[] args) {
     int A[] = {2,4,1,3,2};
     int max = A[0],sum=0;
     for(int i=1;i<A.length;i++){
         if(max<A[i]) max = A[i];
     }
     for(int i=0;i<A.length;i++) {
         sum = sum+(max-A[i]);
     }
     System.out.println(sum);
 }   
}