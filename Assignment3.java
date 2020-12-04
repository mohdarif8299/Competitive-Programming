public class Assignment3 {
    public static void main(String[] args) {
        int N = 6;
        int A[][] = new int[N][];
        for(int i=0;i<N;i++) {
            A[i] = new int[i+1];
            for(int j=0;j<=i;j++) {
                   A[i][j] = j+1;
            }
        }
        for(int i=0;i<N;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}