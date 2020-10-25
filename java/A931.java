import java.io.BufferedReader;
// import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class A931
{
    public static int get(String t)
    {
        return Integer.parseInt(t);
    }
    public static void main(String[] args) throws IOException
    {
        PrintStream p = System.out;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int a = get(b.readLine());
        int c = get(b.readLine());
        int n = a-c;
        if(n%2 == 0) 
        {
            n/=2;
            p.println(n*(n+1));
        }
        else{
            n/=2;
            p.println(n*(n+1) +(n+1));

        }
    }
}