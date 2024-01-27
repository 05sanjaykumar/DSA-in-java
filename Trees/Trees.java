package Trees;
public class Trees 
{
    public static class Node 
    {
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val = val;
        }
    }
    public static int Size(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return Size(root.left) + Size(root.right)+1;
    }
    public static int Sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return Sum(root.left) + Sum(root.right)+root.val;
    }
     public static int Product(Node root)
    {
        if(root == null)
        {
            return 1;
        }
        return Product(root.left)*Product(root.right)*root.val;
    }
    public static int max(Node root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(c, b));
    }
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.right == null && root.left == null)
        {
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void printPreOrder(Node root)
    {
        if(root == null)
        {
            return;
        }       

        System.out.print(root.val+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
        
    }
    public static void print(Node root)
    {
        if(root == null)
        {
            return;
        }
        printPreOrder(root.left);
        System.out.print(root.val+" ");
        printPreOrder(root.right);
        
    }
    public static void printPostOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            printPreOrder(root.left);
            printPreOrder(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String[] args) 
    {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(6);
        Node c = new Node(5);
        root.left = a;
        a.left = b;
        a.right =c;
        Node d = new Node(10);
        Node e = new Node(11);

        root.right = d;
        d.right = e;

        System.out.print("Pre order -> ");
        printPreOrder(root);
        System.out.println();
        // System.out.println();
        // System.out.println("The size of the tree is:"+Size(root));
        // System.out.println();
        // System.out.println("The sum of the value is :"+Sum(root));
        // System.out.println();
        // System.out.println("The max of the value is :"+max(root));
        // System.out.println();
        // System.out.println("The height of the tree is :"+height(root));
        // System.out.println();
        // System.out.println("The height of the tree is :"+Product(root));
        System.out.print("In order -> ");
        print(root);
        System.out.println();
        System.out.print("Post order -> ");
        printPostOrder(root);
        System.out.println();

    }
}
