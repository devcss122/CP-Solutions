import java.util.*;
import java.util.regex.*;
import java.io.*;
public class A58
{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(
            new InputStreamReader(System.in)
        );
        PrintStream p = System.out;

        String inp = bf.readLine();

        Matcher m = Pattern.compile("^.*h+(.*)e+.*l+.*l+.*o+.*$")
                    .matcher(inp);

        p.println( m.lookingAt() ? "YES":"NO");
            
    }
}