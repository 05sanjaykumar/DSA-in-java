import java.util.*;

public class maxing 
{
    public static List<List<Integer>> funct(int nums[], List<Integer> st,boolean maps[],List<List<Integer>> ay)
    {
        int n  = nums.length;
        if(st.size() == n)
        {
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<st.size();i++)
            {
                list.add(st.get(i));
            }
            ay.add(list);
            return ay;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(maps[i]==false)
            {
                maps[i] = true;
                st.add(nums[i]);
                funct(nums,  st,maps, ay);
                st.removeLast();
                maps[i] = false;
            }
            else
            {
                continue;
            }
        }
        return ay;
    }
    public static List<List<Integer>> permute(int nums[])
    {
        int l = nums.length;
        boolean arr[] = new boolean[l];
        List<Integer> st = new ArrayList<>();
        List<List<Integer>> ay = new ArrayList<>();
        return funct(nums,st,arr,ay);
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3};
        List<List<Integer>> ary = permute(arr);
        System.out.println(ary);
    }    
}
