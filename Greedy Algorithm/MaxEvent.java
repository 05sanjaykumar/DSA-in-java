import java.util.ArrayList;
import java.util.Comparator;

public class MaxEvent 
{
    private static class OpenTerritory
    {
        int start;
        int end;
        int meeting_no;
        OpenTerritory(int start, int end, int me)
        {
            this.start = start;
            this.end = end;
            this.meeting_no = me;
        }
        public String toString()
        {
            return start+" "+end;
        }
    }
    private static class comp implements Comparator<OpenTerritory>
    {
        public int compare(OpenTerritory o1, OpenTerritory o2) 
        {
            if(o1.end>o2.end)
            {
                return 1;
            }
            else if(o1.end<o2.end)
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
            {1,6},
            {2,8},
            {7,12},
            {10,16}
        };
        ArrayList<OpenTerritory> ars = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            OpenTerritory object = new OpenTerritory(arr[i][0],arr[i][1],i+1);
            ars.add(object);
        }
        ars.sort(new comp());
        ArrayList<Integer> result = new ArrayList<>();
        result.add(ars.get(0).meeting_no);
        OpenTerritory previous_meeting = ars.get(0);
        for(int i=1;i<ars.size();i++)
        {
            OpenTerritory curr_meeting = ars.get(i);
            if(curr_meeting.start>previous_meeting.end)
            {
                result.add(ars.get(i).meeting_no);
                previous_meeting = curr_meeting;
            }
        }
        System.out.println(result);
    }    
}
//Leet code 1353
//lecture number 79
