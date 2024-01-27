public class FrequencyCountStrings
{
    public static void main(String[] args) 
    {
        String s = "sanjay";
        int len = s.length();
        
        int arr[] = new int[26];

        for(int i=0;i<len;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i] == 0)
            {
                continue;
            }
            System.out.println((char)(i+'a')+" : "+arr[i]);
        }    
    }
}