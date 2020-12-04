public class Beggar{
    public static void main(String[] args) {
        int N=5;
        int A[] = new int[N];
        int W[][] = {
            {1, 2, 10}, {2, 3, 20}, {2, 5, 25}
        };
            for(int i=0;i<W.length;i++) {
                    A[W[i][0]-1]+=W[i][2];
                    if(W[i][1]<N)
                    A[W[i][1]]+= -W[i][2];
            }
            
            for(int i=1;i<N;i++) {
                A[i]+=A[i-1];
            }
            for(int i=0;i<N;i++) System.out.print(A[i]+"  ");
    }
}