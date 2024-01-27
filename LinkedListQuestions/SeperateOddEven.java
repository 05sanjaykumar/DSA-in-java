package LinkedListQuestions;
public class SeperateOddEven 
{
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
        }
    }
    static void Split(Node head)
    {
        Node t1 =new Node(0);
        Node t2 =new Node(0);
        Node temp = head;
        Node f1 =t1;
        Node f2 = t2;
        while(true)
        {
            if(temp.next==null)// we are giving here because the last node, if even points out then next odd node still remains connected, so once if we give one node even then the other node should be odd and should fixed as null should that the value doesn't repeat at the end of the linked list
            {
                if(temp.data%2==0)
                {
                    t2.next = temp;
                    t1.next =null;
                }
                else
                {
                    t1.next = temp;
                    t2.next= null;
                }
                break;
            }
            else if(temp.data%2==0)
            {
                t2.next = temp;
                temp = temp.next;
                t2 = t2.next;
            }
            else
            {
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;
            }
            
        }
        display(f1.next);
        display(f2.next);
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
        Node x6 = new Node(6);
        Node x7 = new Node(7);
        Node x8 = new Node(8);
        Node x9 = new Node(9);
        Node x10 = new Node(10);
        Node x11 = new Node(11);
        
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        x6.next = x7;
        x7.next = x8;
        x8.next = x9;
        x9.next = x10;
        x10.next = x11;

        Split(x1);
    }    
}
