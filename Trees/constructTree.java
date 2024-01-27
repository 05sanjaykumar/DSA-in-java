package Trees;
import java.util.*;

public class constructTree 
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
        if(root.right == null && root.left == null)
        {
            return 0;
        }
        return Size(root.left) + Size(root.right)+1;
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
    public static Node constructBFS(String arr[])
    {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        int i = 1;
        q.add(root);
        while(i<n-1)
        {
            if(q.isEmpty())
            {
                System.out.println("hello");
                break;
            }
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals(""))
            {
                left = null;
            }
            else
            {
                left.val = Integer.parseInt(arr[i]);
                q.add(left);
            }
            if(arr[i+1].equals(""))
            {
                right = null;
            }
            else
            {
                right.val = Integer.parseInt(arr[i+1]);
                q.add(right);
            }
            temp.right = right;
            temp.left = left;
            i+=2;
        }

        return root;
    }
    public static void main(String[] args) 
    {
        String arr[] = {"1","2","3","4","5","6","","7","","","8","","","","9",""};
        Node root = constructBFS(arr);
        int s = Size(root)+1;
        for(int i =0;i<=s;i++)
        {
            nthLevel(root, i);
            System.out.println();
        }
    }   
}
