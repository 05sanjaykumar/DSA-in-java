package LinkedListQuestions;
public class SndMiddleElement 
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
    static void find(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null)
        {
            if(fast.next == null)
            {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
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
        

        find(x1);
    }   
}
