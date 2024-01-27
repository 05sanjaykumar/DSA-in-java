import java.util.Stack;
public class PrefixToPostfix 
{
    public static void main(String[] args) 
    {
        String s = "-9/*+5346";    
        Stack<String> st = new Stack<String>();
        int l = s.length();
        for(int i =l-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch == '+' || ch == '*' || ch == '/' || ch == '-')
            {
                String v1 = st.pop();
                String v2 = st.pop();
                String t = v1+v2+ch;
                st.push(t);
            }
            else
            {
                st.push(ch+"");
                
            }
        }
        System.out.println(st.peek());
    }
}