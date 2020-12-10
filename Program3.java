public class Program3 {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++) {
            if(max<Integer.parseInt(args[i])) max = Integer.parseInt(args[i]);
        }
        System.out.println("Max Number is "+max);
    }
}