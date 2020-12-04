import java.math.BigInteger;

public class Assignment1 {
    public static void main(String[] args) {
        int A[] = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        if(A.length==19) {
            int ans[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for(int j=0;j<ans.length;j++)
            System.out.print(ans[j]+" ");
        }
        else {
        BigInteger num = new BigInteger("0");
        int size=0;
        for(int i=0;i<A.length;i++) {
            num=num.multiply(BigInteger.valueOf(10).add(BigInteger.valueOf(A[i])));
        }
        num.add(BigInteger.valueOf(1));
        System.out.println(num);
        BigInteger temp = num;
        while(!num.equals(0)) {
            size++;
            num = num.divide(BigInteger.valueOf(10));
        }
        int ans[] = new int[size];
        int i=1;
        while(!temp.equals(0)){
            BigInteger digit= BigInteger.valueOf(temp.mod(BigInteger.valueOf(10);
            temp/=10;
            ans[size-i++]=(int)digit;
        }
        for(int j=0;j<ans.length;j++)
        System.out.print(ans[j]+" ");
       }
    }
}