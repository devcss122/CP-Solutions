import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.nio.charset.*;
import java.math.BigInteger;
public class FactMod
{
//  static long[] arr;


   static int modPow(int n,int a,int b)
    {
        return BigInteger.valueOf(n)
        .modPow(BigInteger.valueOf(a),BigInteger.valueOf(b))
        .intValue();
    }

  static int factmod(int n,int p)
  {
     long res  =1;
     while(n >1)
     {
         res *= modPow(p-1,n/p,p)%p;
         for(int i=2;i<=n%p;i++)
             res =(res*i)%p;
         n/=p;    
         
     }
    return (int) res%p;
  }

  public static void main(String[] args) throws IOException
  {
        Scanner sc = new Scanner(System.in);
       // System.out.println(sc.nextIt)
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println(factmod(sc.nextInt(),10_000_000+7));
        }
  }
  
  


}
