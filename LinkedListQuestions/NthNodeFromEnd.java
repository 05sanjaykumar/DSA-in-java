package LinkedListQuestions;
public class NthNodeFromEnd
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static Node nthNode(int n,Node head)
    {
        Node fast =head;
        Node slow = head;
        for(int i=0;i<2;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) 
    {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);
        Node g = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node x = nthNode(2, a);
        System.out.println(x.data);
    }
}