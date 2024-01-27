public class KeyboardCombinations
{
    static int countings = 0;
    static void comb(String val, String values[], String s,int len,int idx)
    {
        if(s.length() == len)
        {
            countings++;
            System.out.println(s);
            return;
        }
        comb(val, values, s+(values[val.charAt(idx)-'1']).charAt(0), len,idx+1);
        comb(val, values, s+(values[val.charAt(idx)-'1']).charAt(1), len,idx+1);
        comb(val, values, s+(values[val.charAt(idx)-'1']).charAt(2), len,idx+1);
        if(val.charAt(idx)=='7' || val.charAt(idx)=='9')
        {
            comb(val, values, s+(values[val.charAt(idx)-'1']).charAt(3), len,idx+1);
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
        String user_val = "235";
        int len = user_val.length();
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
        comb(sts,values,"",sts.length(),0);
        System.out.println("The total number of the countings is :"+countings);
    }
}



// This program use the the older key combinations of the
// mobile phone and print the respective number according to 
// the given numbers in different combinations
// Lecture 36