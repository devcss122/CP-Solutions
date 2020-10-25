/*
Problem 1219C    
Alice became interested in periods of integer numbers. We say positive X integer number is periodic with length L if there exists positive integer number P with L digits such that X can be written as PPPP…P. For example:

X=123123123 is periodic number with length L=3 and L=9
X=42424242 is periodic number with length L=2,L=4 and L=8
X=12345 is periodic number with length L=5
*/
import static java.lang.Integer.parseInt;
public class PeriodicNumber
{

    static int getRepeated(int number,int times)
    {
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        for(int i=0;i<times;i++) sb.append(number);

        return parseInt(sb.toString());
    }

    //get periodic number
    static int get(int l,int A)
    {
        int length = 1+Math.log10(A);
        
    }
    

    public static void main(String[] args)
    {
        
    }

}