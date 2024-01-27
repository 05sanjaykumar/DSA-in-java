package LinkedListQuestions;
public class LinkingLists
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
    public static class linkedlist
    {
        Node head,tail;
        void insertAtFirst(int data)
        {
            Node temp = new Node(data);
            if(head == null)
            {
                tail = temp;
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }
        void insertAtLast(int data)
        {
            if(head == null)
            {
                insertAtFirst(data);
                return;
            }
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;

        }
        int size()
        {
            Node temp = head;
            int count = 0;
            while(temp!=null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
        void insert(int index, int data)
        {
            if(index == 0 )
            {
                insertAtFirst(data);
                return;
            }
            if(index == size())
            {
                insertAtLast(data);
                return;
            }
            if(index<0 || index>size()-1)
            {
                System.out.println("Over or Under flow");
                return;
            }
            Node temp = head;
            Node t = new Node(data);
            for(int i=0;i<index-1;i++)
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
            System.out.println();
        }
        void delete(int index)
        {
            Node t = head;
            int s = size();
            if(s==0)
            {
                System.out.println("not able to delete");
                return;
            }
            if(s==1)
            {
                head = tail = null;
                System.out.println("List Empty");
                return;
            }
            if(index ==0)
            {
                head = t.next;
                return;
            }
            for(int i=0;i<index-1;i++)
            {
                t = t.next;
            }
            if(index == s)
            {
             tail = t;   
            }
            if(index>s)
            {
                System.out.println("No index");
            }
            t.next = t.next.next;
        }
    }
    public static void main(String[] args) 
    {
        linkedlist list = new linkedlist();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(5);
        list.display();
        System.out.println(list.size());
        list.insert(3, 4);
        list.insert(5, 6);
        list.display();
        list.delete(5);
        list.display();
    }
}