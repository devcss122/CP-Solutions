import java.util.Scanner;
class TestQueue
{
    static void print(String arg)
    {
        System.out.println(arg);
    }
    int q[];
    int front=-1;
    int rear=-1;
    int maxSize;
    TestQueue(int size)
    {
        q=new int[size];
        this.maxSize=size;
    }
    int getSize()
    {
        if(isEmpty())
            return 0;
        else
        return (rear-front)+1;
    }
    boolean isFull()
    {
        if(rear == maxSize -1)
            return true;
        else return false;
    }
    boolean isEmpty()
    {
        if(front <0 || front > rear)
            return true ;
        else return false;
    }
    
    void enqueue(int data)
    {
        if(isFull())
            return ;
        if(isEmpty())
            front=rear=0;
        else rear=rear+1;
        q[rear]=data;
    }
    int dequeue()
    {
        if(isEmpty())
            return -1;//return 0 usually
        int data=q[front];
        front++;
        return data;
    }
    public static void main(String arg[])
    {
        TestQueue obj=new TestQueue(100);
        Scanner sc=new Scanner(System.in);
       
       // obj.enqueue(10);
       // System.out.println(obj.getSize());
       // System.out.println(obj.dequeue()+" "+obj.getSize());
        
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            char c=sc.next().charAt(0);
            if(c=='E')
            {
                obj.enqueue(sc.nextInt());
                System.out.println(obj.getSize());
            }
            else if(c=='D')
            {
                    print(obj.dequeue()+" "+obj.getSize());
            }
            else print("invalid query");
        }
    }
    
}
