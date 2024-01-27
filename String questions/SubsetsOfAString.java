import java.util.ArrayList;

public class SubsetsOfAString
{
    static ArrayList<String> getIt(String s)
    {
        ArrayList<String> al = new ArrayList<String>();
        if(s.length()==0)
        {
            al.add("");
            return al;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getIt(s.substring(1));
        for(String ss:smallAns)
        {
            al.add(ss);
            al.add(ss+curr);
        }
        return al;    
    }
    public static void main(String[] args) 
    {
        ArrayList<String> ans = getIt("abc");
        int count=0;
        for(String s:ans)
        {
            System.out.println(s);
            count++;
        }
        System.out.println("The length is :"+count);
    }
}