public class Subarray 
{
    public static void main(String[] args) 
    {
        int arr[] = {5,3,2,6,3,1};
        int len = arr.length;
        int pre[] = new int[len];
        int sum = 0;
        for(int i =0;i<len;i++)
        {
            sum+= arr[i];
            pre[i] = sum;
        }
        int val = -1;
        int taget = -1;
        for(int i =0;i<len-1;i++)
        {
            if(pre[i]==(sum-pre[i]))
            {
                val = pre[i];
                taget = i;
            }
        }
        System.out.printf("The value is %d and the target is %d \n",val,taget);
    } 
}
// In this program we are spliting the array into two, where the sum of
// each subarray is equal to each array
// Example above the program (array is given)
// if we split the index at 2, the sum of each sub array is equal
// watch this in physics wallah channel (Array 6 - prefix sum)