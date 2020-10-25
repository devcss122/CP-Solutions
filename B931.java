import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
// import java.util.Arrays;

public class B931
{

    public static int get(String t)
    {
        return Integer.parseInt(t);
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = System.out;
        String[] t = b.readLine().split(" ");
        // p.println(Arrays.toString(t));
        int a = get(t[1]);
        int c = get(t[2]);
        int n = get(t[0]);

        int mid = n/2;
        if( (a < mid && c > mid) || (a > mid && c < mid)) p.println("Final!");


    }
}