package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class nthlvlTree 
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
    public static void nthLevel(Node root,int n)
    {
        if(root == null)
        {
            return;
        }
        if(n==1)
        {
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void BFS(Node root) // iterative
    {
        Queue<Node> q = new LinkedList<>();
        if(root!=null)
        {
            q.add(root);
        }
        while(q.size()>0)
        {
            Node temp = q.peek();
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }
            System.out.println(temp.val+" ");
            q.remove();
        }
    }
    public static void printAllLevels(Node root, int n)
    {
        if(n == 0)
        {
            return;
        }
        printAllLevels(root, n-1);
        System.out.print("level "+n+"-> ");
        nthLevel(root, n);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        d.right =f;
        d.left = g;

        b.right = e;
        e.left = h;

        BFS(root);
    }
}
