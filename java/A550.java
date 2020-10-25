import java.io.*;
import java.util.*;
import java.util.regex.*;

public class A550 {

    static boolean check(String v) {
        
        
        String v1 = v;
        if (v1.contains("AB")) {
            v1.replaceAll("AB", "");
            return v1.contains("BA");
        } else {
            v1.replaceAll("BA", "");
            return v1.contains("AB");
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = System.out;
        String inp = bf.readLine();

        // Matcher m = Pattern.compile("\\w*((BA[A-Z]*AB)|(AB[A-Z]*BA))\\w*")
        // .matcher(inp);

        // p.println(m.lookingAt()?"YES":"NO");
        p.println(check(inp) ? "YES" : "NO");
        // p.println(m.matches());
        // if(inp.contains("AB") && inp.contains("BA"))
        // {
        // p.println("YES");
        // }
        // else
        // p.println("NO");
    }
}