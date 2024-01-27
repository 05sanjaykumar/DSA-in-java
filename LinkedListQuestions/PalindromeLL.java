package LinkedListQuestions;
public class PalindromeLL 
{
    static class ListNode
    {
        int val;
        ListNode next;
        ListNode(int data)
        {
            this.val = data;
        }
    }
    public static ListNode reverseList(ListNode head) 
    {
         ListNode curr =  head;
         ListNode pre =  null;
         ListNode after =  null;
         while(curr!=null)
         {
             after = curr.next;
             curr.next = pre;
             pre = curr;
             curr = after;
         }  
         return pre; 
    }
    public static boolean isPalindrome(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }// finding the left middle element
        ListNode palt = reverseList(slow.next); // to reverse the elements after the middle element to find whether palindrom or not.
        slow.next = palt;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p2!=null)
        {
            if(p1.val!=p2.val)
            {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(2);
        ListNode x3 = new ListNode(3);
        ListNode x4 = new ListNode(2);
        ListNode x5 = new ListNode(1);
        
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;        
        
        boolean p = isPalindrome(x1);
        System.out.println(p);
    }    
}