import java.util.*;
// import java.io.PrintWriter;
public class R501
{

    static void compressSongs(List<Integer> a,List<Integer> b,int n, int m)
    {
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            diff.add(b.get(i)-a.get(i));
        }
        int total = a.stream().reduce(0,(x , y) -> x+y);
        if(total <= m)
        {
            System.out.println("0");
        }
        else
        {
            Collections.sort(diff);
            int i =0;
            while(total > m && i < n)
            {
                total += diff.get(i);++i;
            }
            System.out.println(total<=m?i:"-1");
        }
    }

    public static void main(String[] args)
    {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        compressSongs(a, b, n, total);

    }
}