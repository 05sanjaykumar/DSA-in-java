package LinkedListQuestions;
public class CycleOfLL
{
    public static class Node
    {
        Node next;
        int val;
        Node(int val)
        {
            this.val = val;
        }
    }
    public static Node detectCycle(Node head) 
    {
        Node fast = head;
        Node slow = head;
        Node temp = head;
        while(fast!=null)
        {
            if(slow == null)
            {
                return null;
            }
            if(fast.next == null)
            {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            {
                break;
            }
        }
        if(fast == null)
        {
            return null;
        }
        while(temp!=slow)
        {
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) 
    {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);    
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Node x = detectCycle(a);
        System.out.println(x.val);

    }
}