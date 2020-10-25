import java.util.Scanner;
class Table
{
    String table[][];
    Table(int row)
    {
        table=new String[row][2];
    }
    void entry(int row,Integer rollno,String data)
    {
        table[row][0]=rollno.toString();
        table[row][1]=data;
    }
    String retrive(Integer rollno)
    {
        for(int i=0;i<table.length;i++)
        {
            if(table[i][0].equals(rollno.toString()))
            {
                return table[i][1];
            }
        }
        return "not found";
        
    }
    void print()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Table obj=new Table(10);
        Scanner sc=new Scanner(System.in);
        /*obj.entry(0,1,"abc");
        obj.entry(1,2,"pqr");
        obj.print();
        System.out.println(obj.table[1][0]+" "+obj.table[0].length+" "+obj.table.length);
        
        System.out.println(obj.retrive(1));
         */
        int num_records=sc.nextInt();
        for(int i=0;i<num_records;i++)
        {
            obj.entry(i,sc.nextInt(),sc.next());
        }
        int n=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            System.out.println(obj.retrive(sc.nextInt()));
        }
        
    }
}

