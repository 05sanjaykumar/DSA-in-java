package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class PreSucBinTree 
{
    public static class TreeNode 
    {
        int val;
        
        TreeNode left;
        TreeNode right;

        TreeNode(int val)
        {
            this.val = val;
        }
    }
    public static TreeNode constructBFS(String arr[])
    {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        int i = 1;
        q.add(root);
        while(i<n-1)
        {
            if(q.isEmpty())
            {
                System.out.println("hello");
                break;
            }
            TreeNode temp = q.remove();
            TreeNode left = new TreeNode(10);
            TreeNode right = new TreeNode(100);
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
    static int pre =-1;
    static int suc =-1;
    static boolean flag = false;
    static int temp =-1;
    public static void predSucc(TreeNode root,int tar)
    {
        if(root == null)
        {
            return;
        }
        predSucc(root.left,tar);
        if(temp==-1)
        {
            temp = root.val;
        }
        else
        {
            if(root.val == tar)
            {
                pre = temp;
                flag = true;
            }
            else if(root.val>tar && flag == true)
            {
                flag = false;
                suc  = root.val;
            }
            else
            {
                temp = root.val;
            }
        }
        predSucc(root.right,tar);

    }
    public static void main(String[] args) 
    {
        String arr[] = {"50","30","70","20","40","60","80"};
        TreeNode root = constructBFS(arr); 
        predSucc(root, 70);
        System.out.println(pre);
        System.out.println(suc);
    }
}
