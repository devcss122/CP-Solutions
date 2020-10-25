import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import javafx.util.Pair;
public class Cards1220A
{

    static Pair<Long,Long> convert(List<Character> list)
    {
        // Pair<Integer,Integer> p = new Pair<>();
        Map<Character,Long> map = new HashMap<>();
        map =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));//.entrySet().stream().collect(Collectors.toMap(k,v));//.forEach((k,v)->map.put(k,v));
        // System.out.println(map);
        Long zeros =0L,ones =0L;
        // while(map.get('z')!=0)
        if(map.containsKey('z'))
        {
            zeros = map.get('z');
            map.put('z',0L);
            map.put('e',map.get('e')-zeros);
            map.put('r',map.get('r')-zeros);
            map.put('o',map.get('o')-zeros);
        }

        ones = map.get('o');


        return new Pair<Long,Long>(zeros,ones);
    }

    public static void main(String[] args)
    {
        List<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String val = sc.next();
        val.chars()
        .mapToObj(ch->(char)ch)
        .forEach(e-> list.add(e));
        // System.out.println(list);
        // for(int i =0;i<count;i++)
        // {
            
        // }
        Pair<Long,Long> p =convert(list);
            // System.out.println(p);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<p.getValue();i++)
        {
            sb.append("1 ");
        }   
        for (int i = 0; i < p.getKey(); i++)
        {
            sb.append("0 ");    
        }
        System.out.println(sb);
    }
}