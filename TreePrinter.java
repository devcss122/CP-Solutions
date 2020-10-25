import java.util.LinkedList;
import java.util.Queue;

public class TreePrinter {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    // Prints level order traversal line
    // by line using two queues.
    static int max(int a,int b)
    {
        return a>b?a:b;
    }
    static int height(Node root)
    {
            if(root==null)
                return 0;
            else
                return 1+max(height(root.left),height(root.right));
    }
    static void print(String a)
    {
        System.out.println(a);
    }
    static String printSpace(int length)
    {
        StringBuffer obj=new StringBuffer("");
        for(int n=0;n<length;n++)
        {
            obj.append(" ");
        }
        return obj.toString();
    }
    /*
    private static  void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
            return;
        
        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
        
        BTreePrinter.printWhitespaces(firstSpaces);
        
        List<Node<T>> newNodes = new ArrayList<Node<T>>();
        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }
            
            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");
        
        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }
                
                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);
                
                BTreePrinter.printWhitespaces(i + i - 1);
                
                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);
                
                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }
            
            System.out.println("");
        }
        
        printNodeInternal(newNodes, level + 1, maxLevel);
    }
    */
    static void levelOrder(Node root) {
        if (root == null)
            return;
        
        Queue<Node> q = new LinkedList<>();
        
        // Pushing root node into the queue.
        q.add(root);
        
        // Pushing delimiter into the queue.
        q.add(null);
        
        // Executing loop till queue becomes
        // empty
        int fr_space=height(root);
        while (!q.isEmpty()) {
            
            Node curr = q.poll();
            
            // condition to check the
            // occurence of next level
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } else {
                // Pushing left child current node
                if (curr.left != null)
                    q.add(curr.left);
                
                // Pushing right child current node
                if (curr.right != null)
                    q.add(curr.right);
                
                System.out.print(printSpace(fr_space--)+curr.data + " ");
            }
        }
    }
    
    // Driver function
    public static void main(String[] args) {
        
        Node root = new Node(1);
        Node n1=new Node(2);
        Node n2=new Node(3);
        Node n3=new Node(4);
        Node n4=new Node(5);
        Node n5=new Node(6);
        Node n6=new Node(7);
        Node n7=new Node(8);
        Node n8=new Node(9);
        
        /*
         1
        2 3
      5 4  6 7
         
         
         
         */
        root.left=n1;
        root.right=n2;
        
        n1.left=n3;
        n1.right=n4;
        
        n2.left=n5;
        n2.right=n6;
        
        //n3.left=n7;
        //n3.right=n8;
        levelOrder(root);
        System.out.println();
        //print("hello");
        //this print() method is valid static method can be accessed in another static method
        //without object!
    }
}
