import java.util.*;
import java.io.*;

//Birthday
public class C1131 {
    public static int get(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintStream p = System.out;
        int n = get(bf.readLine());

        String[] arrstr = bf.readLine().split(" ");

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Integer[] arr = Arrays.stream(arrstr).map(C1131::get).toArray(Integer[]::new);
        Arrays.sort(arr);
        // Arrays.stream(arrstr).map(get).forEach(e->pq.add(e));
        // p.println();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        int t = arr.length;
        // ad.add(pq.poll());
        ad.add(arr[t - 1]);
        // array size = 5
        // 4,2,
        // 3,1

        // array size 6
        // 5,3,1
        // 4,2
        // int j = t-1;
        // if(j%2 == 0)
        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (count % 2 != 0) {
                ad.addFirst(arr[i]);
                count++;
            } else {
                ad.addLast(arr[i]);
                count++;
            }
        }

        // p.println(ad);
        ad.forEach(e->System.out.print(e+" "));
    }
}