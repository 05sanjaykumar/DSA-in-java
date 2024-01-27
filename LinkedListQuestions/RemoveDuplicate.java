package LinkedListQuestions;
public class RemoveDuplicate 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static void removeDuplicate(Node head)
    {
        Node t = head;
        Node temp = new Node(0);
        Node f = temp;
        while(t.next!=null)
        {
            
            if(t.data==t.next.data)
            {
                t =t.next;
            }
            else
            {
                temp.next = t;
                temp = temp.next;
                t = t.next;
            }
            if(t.next == null)
            {
                temp.next = t;
                temp = temp.next;
            }
        }
        
        f = f.next;
        display(f);
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
        Node x2 = new Node(1);
        Node x3 = new Node(2);
        Node x4 = new Node(3);
        Node x5 = new Node(3);
        Node x6 = new Node(5);
        Node x7 = new Node(5);
        Node x8 = new Node(5);
         
        
        
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        x6.next = x7;
        x7.next = x8;        
        display(x1);
        removeDuplicate(x1);
    }    
}
