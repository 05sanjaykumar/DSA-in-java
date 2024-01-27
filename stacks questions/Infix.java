import java.util.Stack;

class Infix
{
    public static void main(String[] args) 
    {  
        String s = "9-(5+3)*4/6";
        Stack<Integer> ch = new Stack<Integer>();
        Stack<Character> op = new Stack<Character>();
        int l = s.length();
        
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if(c == '+' || c == '/' || c == '*' || c == '-' || c == '(' || c ==')' )
            {
                if(op.isEmpty() || c == '(')
                {
                    op.push(c);
                }
                else if((op.peek() == '+' || op.peek() == '-' )&&(c=='+' ||c=='-'))
                {
                    if(op.peek() == '+')
                    {
                        int v1 = ch.pop();
                        int v2 = ch.pop();
                        op.pop();
                        ch.push(v1+v2);
                        op.push(c);
                    }
                    else
                    {
                        int v1 = ch.pop();
                        int v2 = ch.pop();
                        op.pop();
                        ch.push(v2-v1);
                        op.push(c);
                    }
                }
                else if((op.peek() == '*' || op.peek() == '/' )&&(c=='*' ||c=='/'))
                {
                    if(op.peek() == '/')
                    {
                        int v1 = ch.pop();
                        int v2 = ch.pop();
                        op.pop();
                        ch.push(v2/v1);
                        op.push(c);
                    }
                    else
                    {
                        int v1 = ch.pop();
                        int v2 = ch.pop();
                        op.pop();
                        ch.push(v2*v1);
                        op.push(c);
                    }
                }
                else if((op.peek() == '*' || op.peek() == '/' )&&(c=='+' ||c=='-'))
                {
                    if(op.peek() == '/')
                    {
                        int v1 = ch.pop();
                        int v2 = ch.pop();
                        op.pop();
                        ch.push(v2/v1);
                        op.push(c);
                    }
                    else
                    {
                        int v1 = ch.pop();
                        int v2 = ch.pop();
                        op.pop();
                        ch.push(v2*v1);
                        op.push(c);
                    }
                }
                else if(c==')')
                {
                    int v1 = ch.pop();
                    int v2 = ch.pop();
                    char r = op.pop();
                    //System.out.println(r);
                    if(r== '+')
                    {
                        ch.push(v1+v2);
                    }
                    else if(r == '-')
                    {
                        ch.push(v2-v1);
                    }
                    else if(r == '*')
                    {
                        ch.push(v2*v1); 
                    }
                    else
                    {
                        ch.push(v2/v1);
                    }
                    op.pop();
                }
                else
                {
                    op.push(c);
                }
            }
            else
            {
                if(c == '(')
                {
                    op.push(c);
                }
                else
                {
                    ch.push(c-48);
                }
            }
        }
        while(ch.size()!=1 && !op.isEmpty())
        {
            int v1 = ch.pop();
            int v2 = ch.pop();
            char r = op.pop();
            if(r== '+')
            {
                ch.push(v1+v2);
            }
            else if(r == '-')
            {
                ch.push(v2-v1);
            }
            else if(r == '*')
            {
                ch.push(v2*v1); 
            }
            else
            {
                ch.push(v2/v1);
            }
        }
        System.out.println(ch.pop());
    }
}