import java.util.*;
public class R468
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.abs(b-a);
        if(x%2 == 0)
        {
            x/=2;
            System.out.println(x*(x+1));
        }
        else
        {
            x/=2;
            System.out.println(x*(x+1) + (x+1) );

        }

    }
}