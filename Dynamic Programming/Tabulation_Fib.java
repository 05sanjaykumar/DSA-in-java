public class Tabulation_Fib 
{
    
    public static void main(String[] args) 
    {
        int n = 6;
        long arr[] = new long[n+1];
        arr[0] = 1; // write the base condition of the function
        arr[1] = 1;// at first
        for(int i=2;i<=n;i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n-1]);

    }    
}
