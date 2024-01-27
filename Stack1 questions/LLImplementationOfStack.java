public class LLImplementationOfStack 
{
    public static class stack
    {
        Node head = null;
        int idx = 0;
        void push(int data)
        {
            Node temp = new Node(data);
            if(head != null)
            {
                temp.next = head;
                
            }
            head = temp;
            idx++;
        }
        void peek()
        {
            System.out.println(head.data);
        }
        int pop()
        {
            if(head == null)
            {
                System.out.println("Underflow");
                return -1;
            }
            else
            {
                int val = head.data;
                head = head.next;
                return val;
            }
        }
        void displayRec(Node head)
        {
            if(head==null)
            {
                return;
            }
            displayRec(head.next);
            System.out.print(head.data+" ");
        }
        void display()
        {
            Node temp = head;
            displayRec(temp);
            System.out.println();
        }
    }
    public static class Node
    {
        Node next;
        int data;
        Node head;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[] args) 
    {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.display();
        st.push(3);
        // st.peek();
        st.display();
    }    
}
