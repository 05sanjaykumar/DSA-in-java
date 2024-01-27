package Algorithms.sorting;
public class QuickSort 
{
    public static int partition(int arr[],int st,int end)
    {
        int p = arr[st];
        int ars[] = arr.clone();
        int x=st;
        int part = 0;
        for(int i=st;i<=end;i++)
        {
            if(ars[i]<p)
            {
                arr[x++]=ars[i];
            }
        }
        part = x;
        for(int i=st;i<=end;i++)
        {
            if(ars[i]>=p)
            {
                arr[x++]=ars[i];
            }
        }
        return part;
    }
    public static void disp(int arr[])
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void sort(int arr[] , int st,int end)
    {
        if(st>=end)
        {
            return;
        }
        int pi = partition(arr,st,end);
        sort(arr,0,pi-1);
        sort(arr,pi+1,end);
    }
    public static void main(String[] args) 
    {
        int arr[] = {7,13,8,5,10,2,4};
        int len = arr.length-1;
        sort(arr,0,len);
        disp(arr);
    }    
}
