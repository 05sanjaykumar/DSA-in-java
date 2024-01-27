package LinkedListQuestions;

public class DeleteNthNodeEnd
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
     static void nthNode(int n,Node head)
    {
        Node fast =head;
        Node slow = head;
        for(int i=0;i<n+1;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
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
        System.out.println("Before removing");
        display(a);
        nthNode(0, a);
        System.out.println("After removing");
        display(a);
        
    }
} 