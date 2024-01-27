package Algorithms.sorting;
public class CountSort 
{
    public static void main(String[] args) 
    {
        //int arr[] = {4,3,1,5,3,1,3,5};
        int arr[] = {1,4,5,2,2,5};
        int range[] = new int[6];
        for(int i=0;i<arr.length;i++)
        {
            range[arr[i]]++;
        }
        int x =0;
        int len = arr.length;
        int p =0;
        int g=0;
        while(true)
        {
            if(g>=len)
            {
                break;
            }
            for(int i=0;i<range[x];i++)
            {
                arr[g] = p;
                g++;
            }
            x++;
            p++;
        }
        for(int z:arr)
        {
            System.out.print(z+" ");
        }
        System.out.println();
    }
}
