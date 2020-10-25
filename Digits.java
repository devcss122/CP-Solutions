import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;
public class Digits
{
    static boolean isPrime(long a)
    {
        return BigInteger.valueOf(a).isProbablePrime(100);
    }
    static int digitSum(long l)
    {
        int res=0;
        for(char c:String.valueOf(l).toCharArray())
        {
            res+= c-'0';
        }
        return res;
    }
    static boolean divisible(long ele,long k)
    {
        return ele%k==0;
    }
    static void run()
    {
   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        // System.out.println(digitSum(255));
        // System.out.println(isPrime(29));
        // System.out.println(divisible(24, 4));
        LongStream longStream = LongStream.range(a,b);
        longStream = longStream.parallel();
        long count = longStream.filter(e->isPrime(digitSum(e)) && divisible(e, k)).count();
        System.out.println(count);
    }
}