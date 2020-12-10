public class Program4 {
    public static void main(String[] args) {
        int evenSum=0,oddSum=0,evenCount=0,oddCount=0;
        for(int i=0;i<args.length;i++) {
            if(Integer.parseInt(args[i])%2==0) {
                evenSum+=Integer.parseInt(args[i]);
                evenCount+=1;
            }
            else {
                oddSum+=Integer.parseInt(args[i]);
                oddCount+=1;
            }
        }

        System.out.println("Even Numbers Sum = "+evenSum+" Even Numbers Average = "+(evenSum/evenCount));
        System.out.println("Odd Numbers Sum = "+oddSum+" Odd Numbers Average = "+(oddSum/oddCount));
        
    }
}