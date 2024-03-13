public class Memoizaiton_letter 
{
    // static int count=0;
    // private static void CheckPossiblilities(String s,int i,String letter)
    // {
    //     letter+=" ";
    //     if(i>s.length()-1)
    //     {
    //         count++;
    //         System.out.println(letter);
    //         return;
    //     }
    //     if(i-1>=0)
    //     {

    //         String p = s.charAt(i-1)+"";
    //         p+=s.charAt(i);
    //         int k = Integer.parseInt(p);
    //         if(k>26)
    //         {
    //             count--;
    //         }
    //     }
    //     if(s.charAt(i) == '0')
    //     {
    //         count--;
    //         // return;
    //     }
    //     if(i<=s.length()-1)
    //     {
    //         // count++;
    //         letter+=s.charAt(i)+"";
    //         CheckPossiblilities(s, i+1, letter);
    //     }
    //     if(i<=s.length()-2)
    //     {
    //         // count++;
    //         letter+=s.charAt(i+1)+"";
    //         CheckPossiblilities(s, i+2, letter);
    //     }
    // }
    private static int no_ways(String number, int idx,int dp[])
    {
        if(idx<=0)
        {
            return 1;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int not_combine = 0;
        if(number.charAt(idx)!='0')
        {
            not_combine = no_ways(number,idx-1,dp);
        }
        int combine =0;
        if((number.charAt(idx-1) == '1') || (number.charAt(idx-1) == '2' && number.charAt(idx)<='6'))
        {
            combine = no_ways(number, idx-2,dp);
        }
        dp[idx] = not_combine+combine;
        return dp[idx];
    }
    public static void main(String[] args) 
    {
        String s = "11126";  
        // CheckPossiblilities(s, 0, "");
        int dp[] = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            dp[i] = -1;
        }
        System.out.println(no_ways(s, s.length()-1,dp));
    }
}

//123 be decoded as 1 -> A, 2-> B, 3-> C, or 12->L, 3->C, or 1->A, 23-> W, so the total possibilites is 3 
