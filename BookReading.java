import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.Long.parseLong;
public class BookReading
{
    // // naive brute force approch
    // static long get(long n,long m)
    // {
    //     if(n == m) return n;
    //     long result =0L;
    //     for (long i = 0; i < n; i+=m)
    //     {
    //         result += getUnit(i);
    //         // result+= String.valueOf(i).charAt(0)-'0';
    //     }
    //     return result;
    // }
    // static long getUnit(long n)
    // {
    //     return n%10;
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextLong();
    //     for(int i=0;i<t;i++)
    //     {
    //         System.out.println(get(sc.nextLong(), sc.nextLong()));
    //     }    
    // }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int j = 0; j < q; j++) {
            long n=sc.nextLong(),m=sc.nextLong();
           
            
            n = n/m;
            Vector<Long> digits = new Vector<>(10);
            for (int i = 0; i < 10; i++) {
                digits.add(i, ( ( i+1 )*m )%10 ) ;//) );
            }    
            // System.out.println(digits);
            long sum = 0;
            for (int i = 0; i < n%10; i++) {
                sum+= digits.get(i);
            }
            //  System.out.println(sum);
            System.out.println(sum+n/10* digits.stream().sum());//;reduce(0L,(a,b)->a+b));
        }    
    }
}