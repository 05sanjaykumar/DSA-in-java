import java.util.ArrayList;
import java.util.Comparator;

public class Fraction_knapsnack 
{
    private static class property 
    {
        int weight;
        int value;
        double ratio;
    }
    private static class SortArray implements Comparator<property>
    {
        public int compare(property a, property b)
        {
            if(a.ratio < b.ratio)
            {
                return 1;
            }
            else if(a.ratio > b.ratio)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] = {
            {60,10},
            {100,20},
            {120,30},
        };
        ArrayList<property> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            property p = new property();
            p.weight = arr[i][0];
            p.value = arr[i][1];
            p.ratio = (double)arr[i][0]/arr[i][1];
            list.add(p);
        }
        list.sort(new SortArray());
        int total_weight = 50;
        double current_weight = 0;
        double post_weight =0;

        for(var x : list)
        {
            if(total_weight-x.value >= 0)
            {
                total_weight -= x.value;
                post_weight += x.weight;
                System.out.println(post_weight);
            }
            else
            {
                current_weight = (double)total_weight/x.value;
                post_weight+= current_weight*x.weight;
                break;
            }
        }
        System.out.println(post_weight);
    }
}
