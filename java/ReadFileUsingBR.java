import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class ReadFileUsingBR
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader reader=new BufferedReader(new FileReader(args[0]));
        String line=reader.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=reader.readLine();
        }
        
        System.out.println("\n\n [Done using BufferedReader]");
    }
}
