import java.util.HashSet;
public class BigConsceElm 
{
    public static int rev(HashSet<Integer> st,int j,int v)
    {
        if(st.contains(j-1))
        {
            return rev(st,j-1,0);
        }
        else if(st.contains(j))
        {
            st.remove(j);
            v = v+1;
            return rev(st,j+1,v);
        }
        else
        {
            return v;
        }
    }
    public static int check(int arr[])
    {
         HashSet<Integer> hs = new HashSet<>();
         for(int i =0;i<arr.length;i++)
         {
            hs.add(arr[i]);
         }
         int r =0;
         for(int i=0;i<arr.length;i++)
         {
            int l = rev(hs,arr[i],0);
            r = Math.max(r, l);
         }
         return r;
    }
    public static void main(String[] args) 
    {
          int ars[] = {100,200,1,2,3,4};
        //   int nums[] = {0,0,1,3,2,4,5,6,8,7,9};
          int s = check(ars);
          System.out.println(s);
    }
}
//To check the longest consecutive number, here ars {1, 2, 3, 4}
// is consecutive so the total length would be four
