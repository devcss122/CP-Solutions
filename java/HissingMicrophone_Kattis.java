package hissingmicrophone_kattis;
import java.util.*;
public class HissingMicrophone_Kattis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String temp="";
        boolean isFound = false;
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i)=='s')
                temp+=str.charAt(i);
            else
                temp="";
            if(temp.equals("ss")){
               System.out.println("hiss");
               isFound = true;
               break;
            }
        }
        if(!isFound)
            System.out.println("no hiss");
    }
    
}
