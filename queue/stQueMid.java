package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stQueMid 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st =new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int s = q.size();
        for(int i=0;i<s/2;i++)
        {
            st.push(q.remove());
        }
        for(int i=0;i<s/2;i++)
        {
            q.add(st.pop());
        }
        for(int i=0;i<s/2;i++)
        {
            q.add(q.remove());
        }
        for(int i=0;i<s/2;i++)
        {
            st.push(q.remove());
        }
        for(int i=0;i<s/2;i++)
        {
            q.add(st.pop());
            q.add(q.remove());
        }
        System.out.println(q);
    }     
}
//using just queue and stack we can change 1 2 3 4 into 1 3 2 4