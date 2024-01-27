package Trees;
public class Morris_Travesal 
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
    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(20);
        TreeNode ten = new TreeNode(10);
        TreeNode thirty = new TreeNode(30);

        root.left = ten;
        root.right = thirty;

        TreeNode fourty = new TreeNode(40);
        thirty.right = fourty;

        TreeNode five = new TreeNode(5);
        TreeNode fifteen = new TreeNode(15);

        ten.left =five;
        ten.right=fifteen;

        TreeNode twelve = new TreeNode(12);
        TreeNode eighteen = new TreeNode(18);
        fifteen.right=eighteen;
        fifteen.left=twelve;

        TreeNode sixteen = new TreeNode(16);
        TreeNode thirteen = new TreeNode(13);

        twelve.right = thirteen;
        eighteen.left=sixteen;

        //code
        TreeNode curr = root;
        while(curr!=null)
        {
            if(curr.left!=null)
            {
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right!=curr)
                {
                    pred = pred.right;
                }
                if(pred.right == null)
                {
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right == curr)
                {
                    pred.right = null;
                    System.out.print(curr.val+" ");
                    curr = curr.right;
                }
            }
            else
            {
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }
    }
}
