package queue;
import java.util.LinkedList;
import java.util.Queue;

public class StImpQu 
{
    public static class stack
    {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        void add(int data)
        {
            q1.add(data);
        }
        int pop()
        {
            if(q1.isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else
            {
                while(q1.size()!=1)
                {
                    q2.add(q1.remove());
                }
                int s = q1.remove();
                while(!q2.isEmpty())
                {
                    q1.add(q2.remove());
                }
                return s;
            }
        }
        int peek()
        {
            if(q1.isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else
            {
                while(q1.size()!=1)
                {
                    q2.add(q1.remove());
                }
                int s = q1.remove();
                while(!q2.isEmpty())
                {
                    q1.add(q2.remove());
                }
                q1.add(s);
                return s;
            }
        }
    }
    public static void main(String[] args) 
    {
        stack st = new stack();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }    
}
