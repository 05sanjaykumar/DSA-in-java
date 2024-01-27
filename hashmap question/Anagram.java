import java.util.HashMap;

public class Anagram 
{
    public static void main(String[] args) 
    {
        String s1 = "anagram";
        String s2 = "nagaram";
        int len = s1.length();
        if(s1.length()!=s2.length())
        {
            System.out.println("Not anagram");
        }   
        else
        {
            HashMap<Character,Integer> hm = new HashMap<>();
            HashMap<Character,Integer> hy = new HashMap<>();
            for(int i =0;i<len;i++)
            {
                char c = s1.charAt(i);
                char s = s2.charAt(i);
                if(hm.containsKey(c))
                {
                    hm.put(c,hm.get(c)+1);
                }
                else
                {
                    hm.put(c, 1);
                }
                if(hy.containsKey(s))
                {
                    hy.put(s,hy.get(s)+1);
                }
                else
                {
                    hy.put(s, 1);
                }
            }
            if(hm.equals(hy))
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
    }    
}
