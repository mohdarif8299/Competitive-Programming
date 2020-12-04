public class Problem5 {
    public static void main(String[] args) {
        String A = "scaler";
        int B = 2;
        B%=A.length();
        String substr1 = new StringBuffer(A.substring(0,(A.length()-B))).reverse().toString();
        String substr2 = new StringBuffer(A.substring((A.length()-B), A.length())).reverse().toString();
        System.out.println(new StringBuffer(substr1+substr2).reverse().toString());
    }
}