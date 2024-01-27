import java.util.Stack;

public class PostfixToInfix 
{
    public static void main(String[] args) 
    {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<Integer>();
        int len = str.length();
        for(int i=0;i<len;i++)
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
                    st.push(v2-v1);
                }
                else if(ch == '*')
                {
                    st.push(v2*v1);
                }
                else
                {
                    st.push(v2/v1);
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
