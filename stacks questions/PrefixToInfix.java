import java.util.Stack;

public class PrefixToInfix 
{
    public static void main(String[] args) 
    {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<Integer>();
        int len = str.length();
        for(int i=len-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            if(ch == '+' ||ch == '-' ||ch == '/' || ch == '*' )
            {
                int v1 = st.pop();
                int v2 = st.pop();
                if(ch == '+')
                {
                    st.push(v2+v1);
                } 
                else if(ch == '-')
                {
                    st.push(v1-v2);
                }
                else if(ch == '*')
                {
                    st.push(v2*v1);
                }
                else
                {
                    st.push(v1/v2);
                }
            }
            else
            {
                st.push(ch-48);
            }
        } 
        System.out.println(st.peek());    
    }
}
