import java.util.*;

// import sun.launcher.resources.launcher;

import java.io.*;

public class B493 {
    public static int get(String t) {
        return Integer.parseInt(t);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = System.out;
        // List<Integer> m = new ArrayList<>();
        LinkedList<Integer> f = new LinkedList<>(), s = new LinkedList<>();
        int first = 0, second = 0;
        int n = get(bf.readLine());
        int temp = 0;
        // int f1=0,s1=0;
        int sum =0;
        for (int i = 0; i < n; i++) {
            temp = get(bf.readLine());
            // m.add(temp);
            sum+= temp;
            if (temp > 0) {
                first += temp;
                f.add(temp);
                // f1=temp;
            } else {
                second += Math.abs(temp);
                s.add(Math.abs(temp));
                // second (temp);
                // s1=temp;
            }

        }
        int ans =0;
        // p.printf("%d %d ", first,second);
        if (first > second)
            ans =1;
        else if (second > first)
            ans =2;
        else if(second == first)
         {
            Iterator<Integer> r = f.iterator(), q = s.iterator();
            int t1 = f.get(0), t2 = s.get(0);

            while (r.hasNext() || q.hasNext()) {
                // int t1 = r.next(), t2 = q.next();

                if (t1 == t2) {
                    t1 = r.next();
                    t2 = q.next();
                } else {
                    // p.printf("%d %d", t1,t2);
                    if (t1 > t2) 
                        ans =1;
                    else 
                        ans=2;
                    
                    break;
                }

            }
            // p.println(ans ==1 ? "first":"second");
        }
    //     if(ans != 0 &&sum == 0)
    //         ans = temp > 0 ?1:2;
    // // p.printf("%d", ans);
        p.println(ans ==1 ?"first":"second"); 
    // if(ans ==1 )
    //     p.println("first");
    // else if(ans ==2 )
    //     p.println("second");
   
    }

}