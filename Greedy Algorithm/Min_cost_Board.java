import java.util.Arrays;

public class Min_cost_Board 
{
    public static void main(String[] args) 
    {
        int X[] = {2,1,3,1,4};
        int Y[] = {4,1,2};
        int m = 6;
        int n = 4;
        int x_cost = 1; // horizontal cut
        int y_cost = 1; // vertical cut
        Arrays.sort(X);
        Arrays.sort(Y);
        int i = m-2;
        int j = n-2;
        int total = 0;
        while(true)
        {
            if(i == -1 || j == -1)
            {
                break;
            }
            if(X[i]*y_cost > Y[j]*x_cost)
            {
                total+= X[i]*y_cost;
                x_cost++;
                i--;
            }
            else
            {
                total+= Y[j]*x_cost;
                y_cost++;
                j--;
            }
        }
        while(j!=-1)
        {
            total+= Y[j]*x_cost;
            y_cost++;
            j--;
        }
        while(i!=-1)
        {
            total+= X[i]*y_cost;
            x_cost++;
            i--;
        }
        System.out.println(total);
    }
}
