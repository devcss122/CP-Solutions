class VaribleLengthMethod
{
    static void function(int...values)
    {
        System.out.print("arguments are => ");
        for(int a:values)
        {
            System.out.print(" "+a);
        }
        System.out.println();
    }
    
    static void stringFunc(String...values)
    {
        for(String a:values)
        {
            System.out.println(a+" = >"+a.length());
        }
    }
    
    public static void main(String args[])
    {
        function();
        function(1,2,3);
        function(2,4);
        stringFunc("hello");
        stringFunc("hello","world","!");
        
    }
}
