package batterup_kattis;
import java.util.*;
public class BatterUp_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        int [] score = new int[num];
        int cnt = 0 ;
        int total = 0 ;
        for(int i = 0  ; i<num ; i++){
            score[i]=s.nextInt();
            if(score[i]!=-1){
                cnt++;
                total+=score[i];
            }
        }
        System.out.println((double)total/cnt);
    }
    
}
