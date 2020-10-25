import java.util.*;
import java.io.*;
public class B279
{
    static class Scan{
        BufferedReader bf ;
        StringTokenizer st;
        Reader(){
            bf = new BufferedReader(new InputStreamReader(System.in));

        }
        String ns() throws Exception
        {
            while(st == null || !st.hasMoreTokens())
                st=new StringTokenizer(br.readLine());


            return st.nextToken();
        }
        int ni()
        {
            return Integer.parseInt(ns());
        }
    }
    public static void main(String[] args)
    {
        // BufferedReader bf = new BufferedReader(
        //     new InputStreamReader(System.in)
        // )   ;
        // PrintStream p = System.out;

        PrintWriter p = new PrintWriter(new BufferedOutputStream(System.out));
        String[] t1 = bf.readLine().split(" ");
        Scan s = new Scan();
        int n = s.ni();
        int t = s.ni();

        t1 = bf.readLine().split(" ");
        // Integer[] b = Arrays.stream(t1).map(B279::get).toArray(Integer[]::new);
        for(int i=0;i<n;i++)
        {
            
        }
    }
}