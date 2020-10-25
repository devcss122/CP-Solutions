import java.util.*;
import java.io.PrintWriter;//for faster printing
public class R51
{
   static PrintWriter ob =  null;
    public static void main(String[] args) 
    {
        ob = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("YES");
        for (long i = a; i <b+1; i+=2)
        {
            ob.printf("%d %d\n",i,i+1);    
        }

            // for (int i = 0; i < (b-a)/2 +1; i++) {
            //     // System.out.printf("%d %d\n",a+i*2,a+i*2+1);
            //     ob.printf("%d %d\n",a+i*2,a+i*2+1);
            // }
        ob.flush();
    }
}