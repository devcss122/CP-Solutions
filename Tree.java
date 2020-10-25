//import java.util.StringJoiner;
class Tree
{
    static class Node
    {
        int data;
        Node left,right;
        Node(int t)
        {
            this.data=t;
        }
    }
    
    
    static String print(Node root)
    {
        String temp;
        temp=Integer.toString(root.data);
        //temp.add(root.data);
        if(root.right!=null && root.left!=null)
            temp+=" => { "+print(root.left)+","+print(root.right)+" }";
        else if(root.left!=null && root.right==null)
            temp+=" => { "+print(root.left)+", }";
        else if(root.left==null && root.right!=null)
            temp+=" => { ,"+print(root.right)+" }";
        else
            temp+="";
        return temp;
    }
    
    public static void main(String args[])
    {
        Node root=new Node(8);
        Node r3=new Node(3);
        Node r10=new Node(10);
        Node r1=new Node(1);
        Node r6=new Node(6);
        Node r4=new Node(4);
        Node r7=new Node(7);
        Node r13=new Node(13);
        Node r14=new Node(14);
        ///Node r9=new Node(12);
        //Node r10=new Node(14);
        root.left=r3;
        root.right=r10;
        r3.left=r1;
        r3.right=r6;
        r6.left=r4;
        r6.right=r7;
        r10.right=r14;
        r14.left=r13;
        
        
        //tree diagram
        /*
        
            8
         3     10
       1  6       14
          4,7    13
         
         
         
         */
        System.out.println(print(root));
        
        
    }
}
