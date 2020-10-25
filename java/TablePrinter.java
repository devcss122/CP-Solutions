import java.util.StringJoiner;
public class TablePrinter
{
    String getLine(int l)
    {
        StringBuffer pbj=new StringBuffer("");
        for(int i=0;i<l;i++)
        {
            pbj.append("-");
        }
        return pbj.toString();
    }
    
    void createLine(int i,int times)
    {
        StringJoiner obj=new StringJoiner("+","+","+");
        obj.add(getLine(i));
        for(int j=0;j<times;j++)
        {
        System.out.println(obj);
        }
    }
    
    String printSpace(int count)
    {
        if(count<1)
            return "";
        StringBuffer obj=new StringBuffer("");
        for(int i=0;i<count;i++)
        {
            obj.append(" ");
        }
        return obj.toString();
    }
    void printTable(String arg1,String arg2,String arg3)
    {
        //int row_count=0;
        StringJoiner obj=new StringJoiner("+","+","+");
        obj.add(getLine(3));
        obj.add(getLine(7));
        obj.add(getLine(10));
      //  if(row_count==0)
        //    System.out.println(obj);
        StringJoiner data=new StringJoiner("|","|","|");
        
        data.add(arg1+printSpace(3-arg1.length()));
        
        data.add(arg2+printSpace(7-arg2.length()));
        
        data.add(arg3+printSpace(10-arg3.length()));
        //data.add(arg2);
        //data.add(arg3);
        
        System.out.println(data);
        System.out.println(obj);
       // row_count++;
        
        
    }
    int returnSpace(int a)
    {
        switch(a)
        {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 10;
            default:
                return 10;
        }
    }
    
    void printTable1(String...values)
    {
        StringJoiner obj=new StringJoiner("+","+","+");
        //obj.add(getLine(3));
        //obj.add(getLine(7));
        //obj.add(getLine(10));
        //  if(row_count==0)
        //    System.out.println(obj);
        StringJoiner data=new StringJoiner("|","|","|");
        
        int count=0;//indexing for argument arrays.
        for(String arg:values)
        {
            obj.add(getLine(returnSpace(count)));
            data.add(arg+printSpace(returnSpace(count)-arg.length()));
            count++;
        }
        System.out.println(obj);
        System.out.println(data);
        System.out.println(obj);
        
    }
    // Note => method with varible length arg is treating all arguments as
    // array of arguments
    //foreach is useful for repeated action
    // usually this approch is useful for arg_list exceeds than 3,4
    public static void main(String args[])
    {
        
        StringJoiner obj=new StringJoiner("|","|","|");
        TablePrinter ob=new TablePrinter();
        /*
        obj.add("hello");
        obj.add("hello");
        obj.add("hello");
        obj.add("hello");
        obj.add("hello");
        for(int i=0;i<10;i++)
        {
        ob.createLine(5,5);
        System.out.println(obj);
        ob.createLine(5,5);
        }*/
        ob.printTable("1","Aashish","Mumbai,Mah");
        ob.printTable("2","AMZ","Bandra,Mah");
        ob.printTable("3","Ravi","Mumbai,Mah");
        ob.printTable("4","ABD","Mumbai,Mah");
        ob.printTable("5","Aabhi","Mumbai,Mah");
        ob.printTable("6","Taha","Borivali,Mah");
        ob.printTable("7","Afif","Msa,Mah");
        ob.printTable("8","Danish","Mumbai,Mah");
        ob.printTable("9","Pawar","Mumbai,Mah");
        
        System.out.println();
        ob.printTable1("1","Aashish","Mumbai,Mah");
        ob.printTable1("2","AMZ","Bandra,Mah");
        ob.printTable1("2","AMZ","Bandra,Mah","9897672322");
    }
}
