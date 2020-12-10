import java.util.*;
public class P1342C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q;i++) {
            int answer=0;
            long l = sc.nextLong();
            long r = sc.nextLong();
             if(l<=a && r<b) {
              answer  =0; 
            }
            else if(l>a && r>b) {
                answer = (int)(r-l)-Math.max(a,b)+1;
            }
            else  {
                answer = (int)Math.abs(Math.max(a,b)-Math.max(l, r))+1;
            }

            System.out.println(answer +"");
        }
        t--;
       }
    }
}