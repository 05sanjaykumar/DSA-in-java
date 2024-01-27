import java.util.Stack;

public class postfix 
{
    public static void main(String[] args) 
    {
        String infix = "9-(5+3)*4/6";    
        Stack<String> val = new Stack<String>();
        Stack<Character> op = new Stack<Character>();

        for(int i=0;i<infix.length();i++)
        {
            char ch = infix.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57)
            {
                String s = ""+ch;
                val.push(s);
            }
            else if(op.size()== 0 || ch == '(' || op.peek() == '(')
            {
                op.push(ch);
            }
            else if(ch == ')')
            {
                while(op.peek()!='(')
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =  v1 + v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else
        {
                if(ch == '+' || ch == '-')
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =   v1 + v2+o;
                    val.push(t);
                    op.push(ch);
                }
                if(ch == '/' || ch == '*')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t =  v1 + v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }

                }
            }
            
            
        }
        while(val.size()>1)
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =  v1 + v2+o;
                    val.push(t);
                }
                String prefix = val.pop();
                System.out.println( prefix);

    
    }
}
