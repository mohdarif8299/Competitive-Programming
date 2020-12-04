public class Assignment2 {
    public static void main(String[] args) {
        int A[] = {5, 17, 100, 11};
        int ans[] = new int[A.length];
        for(int i=1;i<A.length-1;i++) {
            ans[i] = A[i-1]*A[i+1];
        }
        ans[0] = A[0]*A[1];
        ans[A.length-1] = A[A.length-1]*A[A.length-2];
        for(int i=0;i<A.length;i++) System.out.print(ans[i]+" ");
    }
}