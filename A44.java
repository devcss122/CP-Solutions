import java.io.*;
import java.util.*;
import javafx.util.Pair;
public class A44
{

    public static int get(String s)
    {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = System.out;
        int n = get(bf.readLine());
        Set<Pair<String,String>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split(" ");
            set.add(new Pair<String,String>(temp[0],temp[1]));
        }
        // p.print(set);
        p.println(set.size());
    }
}