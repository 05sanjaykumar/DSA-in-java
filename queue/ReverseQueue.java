package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue
{
    public static Queue<Integer> rev(Queue<Integer> mr)
    {
        Stack<Integer> st = new Stack<Integer>();
        while(!mr.isEmpty())
        {
            st.add(mr.peek());
            mr.remove();
        }
        while(!st.isEmpty())
        {
            mr.add(st.peek());
            st.pop();
        }
        return mr;
    }
    public static void main(String[] args) 
    {
        Queue<Integer> it = new LinkedList<Integer>();
        it.add(1);
        it.add(2);
        it.add(3);
        it.add(4);
        System.out.println(it);
        Queue<Integer> sr = rev(it);
        System.out.println(sr);
    }
}