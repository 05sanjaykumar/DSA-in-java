package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenTrees 
{
    public static class TreeNode
    {
        int val;
        List<TreeNode> child;
        TreeNode(int val)
        {
            this.val = val;
            child = new ArrayList<>();
        }
    }
    public static void printPostOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        for(int i=0;i<root.child.size();i++)
        {
            printPostOrder(root.child.get(i));
        }
        System.out.print(root.val+" ");
    }
    public static void printPreOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val+" ");
        for(int i=0;i<root.child.size();i++)
        {
            printPreOrder(root.child.get(i));
        }
    }
    public static void PrintBFS(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // int max = Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            TreeNode curr = q.peek();
            // max = (max>curr.val)?max:curr.val;
            System.out.println(curr.val);
            q.remove();
            int n = curr.child.size();
            for(int i=0;i<n;i++)
            {
                q.add(curr.child.get(i));
            }
        }
        // System.out.println(max);


    }
    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(30);
        root.child.add(new TreeNode(5));
        root.child.add(new TreeNode(11));
        root.child.add(new TreeNode(63));

        root.child.get(0).child.add(new TreeNode(1));
        root.child.get(0).child.add(new TreeNode(4));
        root.child.get(0).child.add(new TreeNode(8));

        root.child.get(1).child.add(new TreeNode(6));
        root.child.get(1).child.add(new TreeNode(7));
        root.child.get(1).child.add(new TreeNode(15));

        root.child.get(2).child.add(new TreeNode(31));
        root.child.get(2).child.add(new TreeNode(55));
        root.child.get(2).child.add(new TreeNode(65));

        printPreOrder(root);
        System.out.println();
        printPostOrder(root);
        System.out.println();
        PrintBFS(root);

    }    
}
