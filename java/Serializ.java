import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
class Emp implements Serializable
{
    int id;
    String name;
    double salary;
    Emp(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        Emp e=new Emp(sc.nextInt(),sc.next(),sc.nextDouble());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.dat"));
        out.writeObject(e);
        System.out.println("data is written to file ..");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.dat"));
        Emp v;
        try
        {
        v = (Emp)in.readObject();
        System.out.println(v.id+" "+v.name+" "+v.salary);
        }
        catch(ClassNotFoundException exp)
        {
            System.out.println("exception class not found...");
        }
        
        
        
    }
}

