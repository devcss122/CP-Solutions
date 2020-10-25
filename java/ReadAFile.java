import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
class ReadAFile
{
    public static void main(String arg[]) throws IOException
    {
        InputStream isr=new FileInputStream(arg[0]);
        int c=isr.read();
        while(c!=-1)
        {
            System.out.print((char)c);
            c=isr.read();
        }
    }

}
