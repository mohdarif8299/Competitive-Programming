public class Program7 {
    public static void main(String[] args) {
        int [] arr = new int [args.length];
         for(int i=0; i<args.length; i++) {
         arr[i] = Integer.parseInt(args[i]);
         if(isPrime(arr[i])) {
             System.out.println(arr[i] +" is Prime" );
         }
      }


    }
    public static boolean isPrime(int num) {
        int count = 0;
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) {
                count++;
            }
        }
        if(count==0) {
            return true;
        }
        return false;
    }
    
}