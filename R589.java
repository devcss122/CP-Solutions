import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
    fist number between l and r having distict digits
*/
public class R589
{
    static boolean hasDistictDigits(int number)
    {
        String t = String.valueOf(number);
        HashSet<Character> set = new HashSet();
        for(char c:t.toCharArray())
        {
            set.add(c);
        }
        return t.length() == set.size();
    }


    public static void main(String[] args)
    {
        // System.out.println(hasDistictDigits(1234));
        // System.err.println(hasDistictDigits(1223));
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++)
        {
            if(hasDistictDigits(i))
                list.add(i);
        }
        if(list.size()==0)
            System.out.println("-1");
        else
            System.out.println(list.get(0));    
    }
}