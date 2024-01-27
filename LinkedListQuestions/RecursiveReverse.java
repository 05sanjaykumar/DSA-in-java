package LinkedListQuestions;
public class RecursiveReverse 
{
    static Node tail = null;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static Node reverse(Node head)
    {
        if(head.next == null)
        {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Node x1 = new Node(1);
        Node x2 = new Node(2);
        Node x3 = new Node(3);
        Node x4 = new Node(4);
        Node x5 = new Node(5);
        
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;        
        display(x1);
        Node r = reverse(x1);
        display(r);
        
    }    
}