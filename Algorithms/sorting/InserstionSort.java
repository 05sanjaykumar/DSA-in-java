package Algorithms.sorting;
public class InserstionSort
{
    static void Sort(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int j =i;
            int temp = 0;
            while(j>0 && arr[j-1]>arr[j])
            {
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
            
        }
    }
    public static void main(String[] args) 
    {
         int a[] = {8,3,6,5,4,2};
         Sort(a);
         for(int x:a)
         {
            System.out.print(x+" ");
         }            
    }
}
// Lecture 39