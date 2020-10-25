import java.io.*;
import java.util.*;

//grade allocation
public class A1316
{

    public static int get(String s)
    {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(
            new InputStreamReader(System.in));
        PrintStream p = System.out;

        int t = get(bf.readLine());
        for (int i = 0; i < t; i++) {
            
            String nm[] = bf.readLine().split(" ");
            // int n = get(nm[0]);
            int m = get(nm[1]);
            String[] strarr = bf.readLine().split(" ");
            int sum = Arrays.stream(strarr)
                        .map(A1316::get)
                        .reduce((a,b)->a+b)
                        .orElse(0);
            p.println(Math.min(sum, m));
        }


    }
}