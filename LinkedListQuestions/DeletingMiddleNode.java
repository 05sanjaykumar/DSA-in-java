package LinkedListQuestions;
public class DeletingMiddleNode 
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
    static Node find(Node head)
    {
        Node fast = head;
        Node slow = head;
        Node pos = head;
        int c =0;
        if(slow.next == null)
        {
            return null;
        }
        while(fast!=null)
        {
            if(fast.next == null)
            {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(c>0)
            {
                pos = pos.next;
            }
            c++;
        }
        pos.next = pos.next.next;
        return head;
        
    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Node x1 = new Node(10);
        Node x2 = new Node(13);
        Node x3 = new Node(4);
        Node x4 = new Node(5);
        Node x5 = new Node(12);
        Node x6 = new Node(13);
        
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        
        System.out.println("Before deleting");
        display(x1);

        Node v = find(x1);
        System.out.println("After deleting");
        display(v);
    }   
}
