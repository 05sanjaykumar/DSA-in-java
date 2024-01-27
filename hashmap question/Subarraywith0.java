import java.util.HashMap;

public class Subarraywith0 
{
    public static int twosum(int num[])
    {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int l = num.length;
        int sum = 0;
        int maxlen =0;
        for(int i =0;i<l;i++)
        {
            sum+=num[i];
            if(hs.containsKey(sum))
            {
                maxlen = Math.max(maxlen,i - hs.get(sum));
            }
            else
            {
                hs.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) 
    {
        int arr[] = {15,-2,2,-8,1,7,10};
        int ans = twosum(arr);
        System.out.println(ans);
    }    
}
