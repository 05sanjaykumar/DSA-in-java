public class Memoization_MaxRobbery 
{
    public static int maxPossiblities(int arr[],int i,int dp[])
    {
        if(i>arr.length-1)
        {
            return 0;
        }
        else if(i == arr.length-1)
        {
            return arr[i];
        }
        else if(dp[i]!=-1)
        {
            return dp[i];
        }
        else
        {
            int first = arr[i]+maxPossiblities(arr, i+2,dp);
            int second = maxPossiblities(arr, i+1,dp);
            dp[i] = Math.max(first,second);
            return dp[i];
        }
    }
    
    public static void main(String[] args) 
    {
        long startTime = System.nanoTime();
        int arr[] ={8,1,2,9};
        int dp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dp[i] =-1;
        }

        System.out.println(maxPossiblities(arr,0,dp));
        long endTime = System.nanoTime();
        
        // Calculate the runtime
        long runtime = endTime - startTime;
        
        System.out.println("Runtime: " + runtime + " nanoseconds");
    }    
}
//Lecture 82