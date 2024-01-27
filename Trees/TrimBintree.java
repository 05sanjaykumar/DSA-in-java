package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class TrimBintree
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
    public static int Size(TreeNode root)
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
    public static void nthLevel(TreeNode root,int n)
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
    public static TreeNode findNode(TreeNode root,int low,int high)
    {
        if(root == null)
        {
            return null;
        }
        if(root.val<=high && root.val>=low)
        {
            return root;
        }
        else if(root.val<low && root.val < high)
        {
            return findNode(root.right,low,high);
        }
        else
        {
            return findNode(root.left,low,high);
        }
    }
    public static void helper(TreeNode root, int low, int high)
    {   
        if(root == null)
        {
            return;
        }
        while(root.left!=null && root.left.val<low)
        {
            root.left = root.left.right;
        }
        while(root.right!=null && root.right.val>high)
        {
            root.right = root.right.left;
        }
        helper(root.left,low,high);
        helper(root.right,low,high);
    }
    public static TreeNode trimBST(TreeNode root, int low, int high) 
    {
        root = findNode(root,low,high);
        if(root == null)
        {
            return null;
        }
        helper(root,low,high);
        return root;
    }
    public static void main(String[] args) 
    {
        String arr[] = {"28","12","45","4","24","35","47","2","9","14","25","31","42","46","48","0","3","8","11","13","20","","26","30","33","41","43","","","","49","","1","","","7","","10","","","","17","22","","27","29","","32","34","36","","","44","","","","","6","","","","16","18","21","23","","","","","","","","","","37","","","5","","15","","","19","","","","","","40","","","","","","","39","","38"};

        TreeNode root = constructBFS(arr);
        int s = Size(root)+1;
        for(int i =0;i<=s;i++)
        {
            nthLevel(root, i);
            System.out.println();
        }
        trimBST(root,12,22);
        s = Size(root)+1;
        for(int i =0;i<=s;i++)
        {
            nthLevel(root, i);
            System.out.println();
        }
        
    }   
}
