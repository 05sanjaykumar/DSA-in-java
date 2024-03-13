public class CoinExchangeTabulation 
{
    // private static int checkPossibilities(int arr[],int sum,int i,int dp[][])
    // {
    //     if(dp[i][sum] !=-1)
    //     {
    //         return dp[i][sum];
    //     }
    //     if(i == 0)
    //     {
    //         if(sum%arr[i] == 0)
    //         {
    //             return 1;
    //         }
    //         else
    //         {
    //             return 0;
    //         }
    //     }
    //     int include =0;
    //     if(sum>=arr[i])
    //     {
    //         include = checkPossibilities(arr, sum-arr[i],i,dp);
    //     }
    //     int notInclude = checkPossibilities(arr, sum, i-1,dp);;
    //     return dp[i][sum] = include+notInclude;
    // }
    public static void main(String[] args) 
    {
        int arr[] = {2,5,3,6};
        int sum = 10;
        int dp[][] = new int[arr.length+1][sum+1];
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<=sum;j++)
        //     {
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(checkPossibilities(arr, sum, arr.length-1,dp));  
        for(int i =0;i<=sum;i++)
        {
            if(i%arr[0] == 0)
            {
                dp[0][i] = 1;
            }
            else
            {
                dp[0][i] = 0;
            }
        }  
        for(int idx = 1;idx<arr.length;idx++)
        {
            for(int j=0;j<=sum;j++)
            {
                int pick =0;
                if(j>=arr[idx])
                {
                    pick = dp[idx][j-arr[idx]];
                }
                int notPick = dp[idx-1][j];
                dp[idx][j] = pick+notPick;
            }
        }
        System.out.println(dp[arr.length-1][sum]);
    }    
}
