public class EvenSubarray {
    public static void main(String[] args) {
        int A[] = {
            796, 483, 671, 998, 149, 374, 801, 191, 457, 802, 903, 329, 191, 286, 153, 600, 917, 189, 724, 741, 306, 253, 520, 372 
        };
        if(A.length%2==0 && A[0]%2==0 && A[A.length-1]%2==0) {
             int count=0;
            for(int i=0;i<A.length;i++) {
                if(A[i]%2!=0)  {
                    count++;
                   break;
                }

            }
            if(count==0) {
                System.out.println("YES");
            }
            else  {
                count=0;
                int k = A.length/2;
                if(k%2!=0) k+=1;
                int iIndex=0,jIndex = 0;
                for(int i=1;i<A.length-2;i+=1) {
                    if(A[i]%2==0 && A[i+1]%2==0) {
                        iIndex = i;
                        jIndex = i+1;
                        System.out.println(i+  "   "+(i+1));
                        System.out.println(A[i]+ "  "+A[i+1]);
                    }
                }

                if(iIndex%2==1 && (jIndex+A.length)%2==0) {
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }

        }
        else 
            System.out.println("NO");
    }
}