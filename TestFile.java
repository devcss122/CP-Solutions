import java.io.File;
class TestFile
{
    public static void main(String args[])
    {
        File f=new File("TestFile.java");
        System.out.println("Name :"+f.getName());
        //System.out.println("Parent Name :"+f.getParent());
        //System.out.println("Parent file :"+f.getParentFile());
        System.out.println("Path :"+f.getPath());
        System.out.println("isDirectory :"+f.isDirectory());
        System.out.println("isFile :"+f.isFile());
        
        System.out.println("\007");
        System.out.flush();
        
    }
}
