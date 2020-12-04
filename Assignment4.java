public class Assignment4 {
    public static void main(String[] args) {
        int A[] = {5, 17, 100, 1};
        int maxEven=-1,minOdd=-1;
        boolean evenFlag = true,oddFlag=true;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0 && evenFlag) {
                maxEven = A[i];
                evenFlag = false;
            } 
            else if(A[i]%2==1 && oddFlag){
                minOdd = A[i];
                oddFlag = false;
            }
        }
        for(int i=1;i<A.length;i++) {
            if(A[i]%2==0) {
                if(maxEven<A[i]) maxEven = A[i];
            }
            else {
                if(minOdd>A[i]) minOdd = A[i];
            }
        }
        System.out.println(maxEven-minOdd);
    }
}