import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//bark to unlock
public class A868 {
    public static int get(String t) {
        return Integer.parseInt(t);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = System.out;
        String temp = b.readLine();
        int n = get(b.readLine());
        // StringBuffer sb = new StringBuffer();
        char first = temp.charAt(0);
        char second = temp.charAt(1);

        int flag1 = 0, flag2 = 0, flag3 = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String val = b.readLine();
            if (val.contains(String.valueOf(temp)) || val.contains(new StringBuffer(temp).reverse()))
            {
                // flag3 = 1;
                p.println("YES");
                System.exit(0);
            }
            list.add(val);
            // p.println(x);
            // } else if (val.contains(String.valueOf(first))) {
            //     flag1 = 1;
            //     // p.println("flag1 set");
            // } else if (val.contains(String.valueOf(second))) {
            //     flag2 = 1;
            //     // p.println("flag2 set");
            // } else if (flag1 == 1 && val.indexOf(second) == 1) {
            //     flag3 = 1;
            //     // p.println("flag3 done");
            // } else if (flag2 == 1 && val.indexOf(first) == 1) {
            //     flag3 = 1;
            //     // p.println("flag3 done");

            // }
            // else if(flag1 ==1 && flag2 ==1)
            //     flag3=1;
        }
        // if()
        // p.println(list);
        // p.println(flag3 == 1 ? "YES" : "NO");
        // for (int i = 0; i < list.size(); i++) {
        //     for (int j = 1; j < list.size(); j++) {
        //         p.println(list.get(i).concat(list.get(j)));
        //         if(list.get(i).concat(list.get(j)).contains(temp))
        //             {
        //                 p.println("YES");
        //                 System.exit(0);
        //             }
        //     }
        // }


        //randomize shuffling for 0(n*2)
        for (int i = 0; i < n*n; i++) {
            Collections.shuffle(list);
            StringBuffer sb=  new StringBuffer();
            list.stream().forEach(e->sb.append(e));
            // p.println(sb);
            if(sb.toString().contains(temp)){
                p.println("YES");
                System.exit(0);
            }
        }
        // list.add(b.readLine());

        // char c = temp.charAt(0);
        // list.stream().
        // for (int i = 0; i < list.size(); i++) {
        // if(list.get(i).contains(String.valueOf(c)))
        // {

        // }
        // }
        // sb.append(b.readLine());

        // System.out.println();
        // p.println(sb.toString());
        // if(sb.toString().contains(temp)||sb.toString().contains(new
        // StringBuffer(temp).reverse()))
        // p.println("YES");
        // else
        p.println("NO");
    }
}