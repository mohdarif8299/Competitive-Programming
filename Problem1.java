import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        for (int i = 0; i < A.length; i++) {
            int abs_val = Math.abs(A[i]);
            if (A[abs_val - 1] > 0)
                A[abs_val - 1] = -A[abs_val - 1];
            else
                System.out.println(abs_val);
        }
 
        System.out.print("And the missing element is ");
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }
}