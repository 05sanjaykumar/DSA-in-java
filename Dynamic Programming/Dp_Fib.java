public class Dp_Fib 
{
    private static long fibbo(int n, long[] arr)
    {
        if(n==0 || n==1)
        {
            return (long)n;
        }
        if(arr[n]!=-1)
        {
            return arr[n];
        }
        else
        {
            arr[n] = (int) (fibbo(n-1,arr)+fibbo(n-2,arr));
            return arr[n];
        }
    }
    public static void main(String[] args) 
    {
        int n = 47;
        long arr[] = new long[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i] = -1;
        }
        System.out.println(fibbo(n,arr));

    }    
}
