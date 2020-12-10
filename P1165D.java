import java.util.*;
public class P1165D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            boolean isValid = true;
            int n = sc.nextInt();
            ArrayList<Long> a = new ArrayList<Long>();
            for(int i=0;i<n;i++) {
                a.add(sc.nextLong());
            }
         
            ArrayList<Long> al = new ArrayList<Long>();
            Collections.sort(a,Collections.reverseOrder());
            Long max = a.get(0);
            Long min = a.get(a.size()-1);
            Long answer = max*min;

            for(long i=2;i*i<=answer;i++) {
                if(answer%i==0) {
                    al.add(i);
                    if(i!=answer/i) al.add(answer/i);
                } 
            }
            Collections.sort(al,Collections.reverseOrder());
            if(a.size()==al.size()) {
                for(int i=0;i<n;i++) {
                    if(!a.get(i).equals(al.get(i))) {
                        isValid = false;
                        break;
                    }
                }
                if(isValid) System.out.println(answer);
                else System.out.println("-1");
            }
            else {
                 System.out.println("-1");
            }
            t--;
        }
    }
}