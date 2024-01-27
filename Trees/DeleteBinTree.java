package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteBinTree 
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
    public static void printPreOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }       

        System.out.print(root.val+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
        
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
    public static void helper(TreeNode root,TreeNode temp)
    {
        if(root == null)
        {
            return;
        }
        temp.right = root;
        temp.left = null;
        helper(root.left,temp.right);
        helper(root.right,temp.right);
    }
    public static void flatten(TreeNode root) 
    {
        TreeNode temp = new TreeNode(0);
        TreeNode get = temp;
        helper(root,temp);    
        get = get.right;
        root = get;
    }
    public static void deleteNode(TreeNode root,int val)
    {
        if(root == null)
        {
            return;
        }
        else if(root.val>val)
        {
            if(root.left == null)
            {
                return;
            }
            else if(root.left.val == val)
            {
                TreeNode t= root.left;
                if(t.left==null && t.right==null)
                {
                    root.left = null;
                }
                else if(t.left==null && t.right!=null)
                {
                    root.left = t.right;
                }
                else if(t.left!=null && t.right==null)
                {
                    root.left = t.left;
                }
                else
                {
                    TreeNode curr = t;
                    TreeNode pred = curr.left;
                    while(pred.right!=null)
                    {
                        pred = pred.right;
                    }
                    deleteNode(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else
            {
                deleteNode(root.left, val);
            }
        }
        else
        {
            if(root.right == null)
            {
                return;
            }
            else if(root.right.val == val)
            {
                TreeNode t= root.right;
                if(t.left==null && t.right==null)
                {
                    root.right = null;
                }
                else if(t.left==null && t.right!=null)
                {
                    root.right = t.right;
                }
                else if(t.left!=null && t.right==null)
                {
                    root.right = t.left;
                }
                else
                {
                    TreeNode curr = t;
                    TreeNode pred = curr.left;
                    while(pred.right!=null)
                    {
                        pred = pred.right;
                    }
                    deleteNode(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }

            }
            else
            {
                deleteNode(root.right, val);
            }
        }
    }
    public static void main(String[] args) 
    {
        String arr[] = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        TreeNode root = constructBFS(arr);
        printPreOrder(root);
        System.out.println();
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        temp.right = null;
        deleteNode(temp, 50);
        printPreOrder(temp.left);
    }
}
