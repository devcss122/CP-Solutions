import java.util.Scanner;
/**
 * Techno cup Problem B 1223
 */
public class B1223
{

    static boolean check(String a,String b)
    {
        
        long count1 = a.chars().distinct().count();
        long count2 = b.chars().distinct().count();
        if( (count1 & count2) == 0) 
            return false;
        else 
            return true;    
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =   sc.nextInt();
        while(t-- > 0)
        {
            String t1 = sc.next();
            String t2 = sc.next();
            System.out.println(check(t1, t2)?"YES":"NO");
        }
    }
}