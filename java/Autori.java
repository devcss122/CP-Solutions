
package autori;
import java.util.Scanner;
public class Autori {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []str1 = str.split("-");
        for (int i = 0 ; i<str1.length ; i++){
            System.out.print(str1[i].charAt(0));
        
        }
        
    
    }

    
}
