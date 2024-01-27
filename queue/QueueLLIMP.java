package queue;
public class QueueLLIMP 
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
    public static class LL
    {
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
        int remove()
        {
            if(head == null)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else
            {
                int d = head.data;
                head = head.next;
                size--;
                return d;
            }
        }
        void display()
        {
            if(head == null)
            {
                System.out.println("The Queue is empty");
            }
            else
            {
                Node temp = head;
                while(temp!=null)
                {
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        int Size()
        {
            return size;
        }
        int peek()
        {
            if(head!= null)
            {
                return head.data;
            }
            else
            {
                return remove();
            }
        }
    }
    public static void main(String[] args) 
    {
        LL que = new LL();
        que.add(5);
        que.add(2);
        System.out.println(que.Size());
        System.out.println(que.peek());
        que.remove();
        que.remove();
        que.display();
        que.peek();
    }    
}
