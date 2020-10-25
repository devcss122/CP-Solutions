import java.io.*;
public class A96
{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(
            new InputStreamReader(System.in)
        );

        PrintStream p = System.out;
        String inp = bf.readLine();

        if(inp.contains("0000000")||inp.contains("1111111"))
        {
            p.println("YES");
        }
        else p.println("NO");
    }
}