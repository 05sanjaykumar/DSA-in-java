public class FlippingBinaryStrings 
{
    public static void main(String[] args) 
    {
        String st = "0001010111";
        int len = st.length();
        int count1=0;
        int count2=0;
        for(int i =0;i<len;i++)
        {
            if(i%2 == (st.charAt(i)-'0'))
            {
                continue;
            }
            else
            {
                count1++;
            }
        }
        for(int i =0;i<len;i++)
        {
            if(i%2 != (st.charAt(i)-'0'))
            {
                continue;
            }
            else
            {
                count2++;
            }
        }
        System.out.println(Math.min(count1, count2));   
    }    
}
