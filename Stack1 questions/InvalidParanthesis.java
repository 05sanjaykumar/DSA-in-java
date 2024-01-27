import java.util.Stack;
public class InvalidParanthesis 
{
    public static void main(String[] args) 
    {
        String s = "())";
        int r =0;
        Stack<Character> st = new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c == '(')
            {
                st.push(')');
            }
            else if (c == '{')
            {
                st.push('}');
            }
            else if(c == '[')
            {
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() !=c )
            {
                System.out.println(false);
                r++;
            }
        }
        if(r==0)
        {
            System.out.println(st.isEmpty());
        }
    }
}
