import java.util.*;
public class removeContinousElements 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<Integer>();
        int arr[]  ={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int var = Integer.MIN_VALUE;
        for(int x:arr)
        {
            if(st.isEmpty())
            {
                st.push(x);
                var = x;
            }
            else if(st.peek()!=x && var!=x)
            {
                st.push(x);
                var = x;
            }
            else if(st.peek() == var)
            {
                st.pop();
            }
        }    
        System.out.println(st);
    }
}
