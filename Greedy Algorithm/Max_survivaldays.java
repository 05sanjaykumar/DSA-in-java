public class Max_survivaldays 
{
    public static void main(String[] args) 
    {
        int s = 10; // Total number of days
        int n = 16;// total food that can be gained each day
        int m = 2; // the food needed
        //Sunday shop is closed and today is monday
        int total_food_needed = m*s;
        int collected_food = 0;
        int total_days_collected = 0;
        int p = total_food_needed;
        for(int i =1;i<=10;i++)
        {
            if(collected_food >= total_food_needed)
            {
                break;
            }
            else if(p<=0)
            {
                total_days_collected =-1;
                break;
            }
            else if(i%7 == 0)
            {
                p-=m;
            }
            else
            {
                total_days_collected++;
                collected_food+=n;
                p-=m;
            }
        }
        if(total_days_collected == -1)
        {
            System.out.println("Not able to survive");
        }
        else
        {
            System.out.println("able to surivive and max days food needed to be collected is "+total_days_collected);
        }
    }    
}
//Can have more optimised solution if we use basic maths calculations instead of for loops