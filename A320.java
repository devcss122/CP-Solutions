import java.util.*;
import java.util.regex.*;
import java.io.*;
//Magic numbers
public class A320
{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(
            new InputStreamReader(System.in)
        );
        PrintStream p = System.out;


        String inp = bf.readLine();

        Matcher m = Pattern.compile("^(1|(14)|(144))*$")
        .matcher(inp);
        // if(m.lookingAt())
        p.println(m.lookingAt()?"YES":"NO");
    }
}