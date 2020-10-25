import java.io.File;
class RenameAFile
{
    public static void main(String args[])
    {
        File f1=new File(args[0]);
        File f2=new File(args[1]);
        boolean success=false;
        if(!f1.exists())
            System.out.println("Source file not found !");
        if(f2.exists())
            System.out.println("Duplicate file exists!");
        else
            success=f1.renameTo(f2);
        
        if(success)
            System.out.println("SuccessFully renamed !");
        
    }
}
