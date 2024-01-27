public class KeyboardCombinations2 
{
    static int countings = 0;
    static void comb(String val, String values[], String s,int len,int idx)
    {
        // if(val.charAt(idx)=='1')
        // {
        //    idx+=1;
        //    System.out.println(idx);
        // }
        if(s.length() == len)
        {
            countings++;
            System.out.println(s);
            return;
        }
        for(int i =0;i<(values[val.charAt(idx)-'1']).length();i++)
        {
             comb(val, values, s+(values[val.charAt(idx)-'1']).charAt(i), len,idx+1);
        }
    }
    public static void main(String[] args) 
    {
        String values[] = 
        {
            "","abc","def",
            "ghi","jkl","mno",
            "pqrs","tuv","wxyz"
        };   
        String user_val = "123";
        int len = user_val.length();
        //
        String sts = "";
        for(int i=0;i<len;i++)
        {
            if(user_val.charAt(i)=='1')
            {
                continue;
            }
            else
            {
                sts+=user_val.charAt(i);
            }
        }
        //
        comb(sts,values,"",sts.length(),0);
        System.out.println("The total number of the countings is :"+countings);
    }
}
