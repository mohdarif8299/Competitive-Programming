public class Problem3 {
    public static void main(String[] args) {
        int A[] = {2, 1, 2, 5, 6};
        int count=1;
        boolean flag = false;
        int x = A[0];
        if(x%2==0) {
            flag = true;
            for(int i=1;i<A.length;i++) {
                if(flag && A[i]%2==1) {
                    count++;
                    flag = false;
                }
                if(!flag && A[i]%2==0) {
                    count++;
                    flag = true;
                }
            }
            
        }
        else {
            flag = false;
            for(int i=1;i<A.length;i++) {
                if(flag && A[i]%2==1) {
                    count++;
                    flag = false;
                }
                if(!flag && A[i]%2==0) {
                    count++;
                    flag = true;
                }
            }
        }
        System.out.println(count);
        
    }
}