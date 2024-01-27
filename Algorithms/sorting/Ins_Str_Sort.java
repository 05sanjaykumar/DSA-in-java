package Algorithms.sorting;
public class Ins_Str_Sort 
{
    public static void main(String[] args) 
    {
        String arr[] = {"papaya","lime","watermelon","apple","mango","kiwi"};
        int len = arr.length;
        for(int i =1;i<len;i++)
        {
            int j =i;
            int l = Math.min(arr[i].length(),arr[i-1].length());
            int r =0;
            while(j>0 && arr[j-1].charAt(r)>=arr[j].charAt(r))
            {
                if(r>l-1)
                {
                    break;
                }
                if(arr[j-1].charAt(r)>arr[j].charAt(r))
                {
                    String temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    r=0;
                }
                if(arr[j-1].charAt(r)==arr[j].charAt(r))
                {
                    j++;
                    r++;
                }
                j--;
            }   
        }
        for(String x:arr)
        {
            System.out.print(x+" ");
        }    
        System.out.println();
    }    
}
//done using another and better method in l-40