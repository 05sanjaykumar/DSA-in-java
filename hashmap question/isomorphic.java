import java.util.HashMap;

public class isomorphic 
{
    public static void main(String[] args) 
    {
        String s1 = "abcd";
        String s2 = "xyzx";
        if(s1.length() != s2.length())
        {
            System.out.println(false);
        }
        else
        {
            Boolean b = true;
            HashMap<Character,Character> st = new HashMap<>();
            for(int i =0;i<s1.length();i++)
            {
                char x = s1.charAt(i);
                char y = s2.charAt(i);
                if(st.containsKey(x))
                {
                    char z = st.get(x);
                    if(z!=y)
                    {
                        b= false;
                        System.out.println(false);
                        break;
                    }
                }
                else
                {
                    if(st.containsValue(y))
                    {
                        b = false;
                        System.out.println(false);  
                    }
                    else
                    {
                        st.put(x, y);
                    }
                }
            }
            if(b == true)
            {
                System.out.println(true);
            }
        }
    }    
}
