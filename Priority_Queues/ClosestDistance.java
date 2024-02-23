package Priority_Queues;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ClosestDistance
{
    private static class axes
    {
        double distance;
        int index_x;
        int index_y;
    }
    private static class Comp implements Comparator<axes>
    {
        public int compare(axes v1, axes v2)
        {
            if(v1.distance>v2.distance)
            {
                return -1;
            }
            else if(v1.distance<v2.distance)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    public static void main(String[] args) 
    {
        int values[][] = {
            {5,3},
            {1,2},
            {3,4},
            {5,6},
            {7,8},
            {9,10}
        };   
        int k =3;
        PriorityQueue<axes> pq = new PriorityQueue<>(new Comp());
        int len = values.length;
        for(int i=0;i<len;i++)
        {
            int x = values[i][0];
            int y = values[i][1];
            double distance = Math.sqrt((x*x)+(y*y));
            axes object = new axes();
            object.distance = distance;
            object.index_x = x;
            object.index_y = y;
            int size = pq.size();
            if(size>=k)
            {
                double top = pq.peek().distance;
                if(object.distance<top)
                {
                    pq.remove();
                    pq.add(object);
                }
            }
            else
            {
                pq.add(object);
            }
        }
        while(!pq.isEmpty())
        {
            int x = pq.peek().index_x;
            int y = pq.peek().index_y;
            double distance = pq.peek().distance;
            System.out.printf("The x axis is %d and the y axis %d and distance is %.2f",x,y,distance);
            pq.remove();
            System.out.println();
        }
    }
}