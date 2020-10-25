import java.util.*;
public class R74A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            System.out.println(sc.nextLong() - sc.nextLong() == 1?"NO":"YES");
        }
    }
}