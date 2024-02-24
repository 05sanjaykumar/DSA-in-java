public class smallestDigitNumber 
{
    static boolean b = false;
    public static String ToString(int arr[])
    {
        String s = "";
        for(int x:arr)
        {
            s+=Integer.toString(x);
        }
        return s;
    }
    public static void fill(int arr[], int sum,int i,int dig)
    {
        if(sum==0)
        {
            b = true;
            return;
        }
        if(i==dig)
        {
            return;
        }
        for(int j=1;j<=9;j++)
        {
            arr[i] = j;
            fill(arr, sum-j, i+1, dig);
            if(b == true)
            {
                return;
            }
        }
    }
    public static boolean check(int sum, int digits)
    {
        if(digits*9>=sum && sum>=digits)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        int digits = 3;
        int sum = 9;    
        int arr[] = new int[digits];
        if(check(sum, digits) == true)
        {
            fill(arr, sum, 0, digits);
            String s = ToString(arr);
            System.out.println(s);
        }
        else
        {
            System.out.println("Code not able to run change the sum or digits");
        }

    }    
}
