import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class R427{

    public static int get(String t)
    {
        return Integer.parseInt(t);
    }
    public static void main(String[] args) throws IOException
    {
        PrintStream p = System.out;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = b.readLine().split(" ");
        int s = get(inp[0]);
        int v1 = get(inp[1]);
        int v2 = get(inp[2]);
        int t1 = get(inp[3]);
        int t2 = get(inp[4]);

        int score1 = t1 + (v1*s) +t1;
        int score2 = t2 + (v2*s)+t2;
        // p.println(score1+" "+score2);
        if(score1 < score2)
            p.println("First");
        else if(score1 > score2)
            p.println("Second");
        else
            p.println("Friendship");

    }
}