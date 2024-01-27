import java.util.HashSet;

public class MaxNumbers 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> sh = new HashSet<>();
        int arr[] = {2,1,1,3,2,3};
        int l =0;
        for(int i=0;i<arr.length;i++)
        {
            if(sh.contains(arr[i]))
            {
                sh.remove(arr[i]);
            }
            else
            {
                sh.add(arr[i]);
                if(l<sh.size())
                {
                    l = sh.size();
                }
            }
        }
        System.out.println(l);
    }    
}
//Lecture 62, from 33:46