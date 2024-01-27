package LinkedListQuestions;
public class MergeTwoLinkList
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
    static void merge(Node head1,Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;
        Node connect = new Node(100); // assinging new values so that we don't need to find whether temp1 or temp2 is greater or not, insead of assinging connect as null
        Node temp = connect;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data>=temp2.data)
            {
                connect.next = temp2;
                temp2 = temp2.next;
                connect = connect.next;
            }
            else
            {
                connect.next = temp1;
                temp1 = temp1.next;
                connect = connect.next;
            }
        }
        if(temp2!=null)
        {
            connect.next = temp2;
        }
        if(temp1!=null)
        {
            connect.next = temp1;
        }
        /*
        while(temp2!=null)
        {
            connect.next = temp2;
            temp2 = temp2.next;
            connect = connect.next;
        }
        while(temp1!=null)
        {
            connect.next = temp1;
            temp1 = temp1.next;
            connect = connect.next;
        }
        */
        temp = temp.next;
        display(temp);
    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Node x1 = new Node(1);
        Node x2 = new Node(3);
        Node x3 = new Node(5);
        Node x4 = new Node(7);
        Node x5 = new Node(9);
        Node x6 = new Node(11);
        
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6; 
        
        Node y1 = new Node(2);
        Node y2 = new Node(4);
        Node y3 = new Node(6);
        Node y4 = new Node(8);
        Node y5 = new Node(10);
        Node y6 = new Node(12);
        
        y1.next = y2;
        y2.next = y3;
        y3.next = y4;
        y4.next = y5;
        y5.next = y6; 
        merge(x1, y1); 
    }
}
//Linked List question questions lecture 52