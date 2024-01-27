import java.util.ArrayList;
import java.util.List;

public class NumberComb 
{
    static int combinations = 0;
    public static List<String> addItems(String arr[],String digits,String inc,List<String> ars)
    {
        if(digits.length() == 0)
        {
            ars.add(inc);
            combinations++;
            return ars;
        }
        char c = digits.charAt(0);
        if(c == '1' || c =='0')
        {
            addItems(arr,digits.substring(1),inc,ars);
        }
        else
        {
            int num = c-'1';
        if(num == 6 || num == 8)
        {
            String main = arr[num];
            for(int i=0;i<=3;i++)
            { 
                addItems(arr,digits.substring(1),inc+main.charAt(i),ars);
            }
        }
        else
        {
            String main = arr[num];
            for(int i=0;i<=2;i++)
            {
                addItems(arr,digits.substring(1),inc+main.charAt(i),ars);
            }
        }
        }
        
        return ars;
    }
    public static List<String> letterCombinations(String digits) 
    {
        String arr[] = {
            "","abc","def",
            "ghi","jkl","mno",
            "pqrs","tuv","wxyz"
            };
        List<String> ars = new ArrayList<String>();
        return addItems(arr,digits,"",ars);

    }
    public static void main(String[] args) 
    {
         List<String> ars=letterCombinations("82");
         for(var x:ars)
         {
            System.out.println(x);
         }
         System.out.println("Total combinations are :"+combinations);

    }    
}
