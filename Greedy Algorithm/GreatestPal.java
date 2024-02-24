public class GreatestPal 
{
    public static String Reverse(String num)
    {
        int len = num.length();
        String rev = "";
        for(int i= len-1;i>=0;i--)
        {
            rev+=num.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        int num = 123;// try 313551 1234 1 10 2 101 3333366 3138551 1133300 11100 111100 313535133
        int freq[] = new int[10];
        String number = Integer.toString(num);
        int len = number.length();
        for(int i=0;i<len;i++)
        {
            char c = number.charAt(i);
            freq[c-'0']++;
        }
        if(len%2 == 0)
        {
            for(int i=0;i<10;i++)
            {
                if(freq[i] == 0 || freq[i]%2 == 0)
                {
                    continue;
                }
                else
                {
                    System.out.println("Not able to form palindrome");
                    System.exit(0);
                }
            }
            String construct = "";
            for(int i=9;i>=0;i--)
            {
                if(freq[i]>0)
                {
                    while(freq[i]>0)
                    {
                        construct+=Integer.toString(i);
                        freq[i]-=2;
                    }
                }
            }
            construct = construct+Reverse(construct);
            System.out.println(construct);
        }
        else
        {
            int cp = 0;
            int numlock = 0;
            for(int i=0;i<10;i++)
            {
                if(freq[i] == 0 || freq[i]%2 == 0)
                {
                    continue;
                }
                else if(freq[i]%2 == 1)
                {
                    cp++;
                    numlock = i;
                }   
                else if(cp>1)
                {
                    System.out.println("Not able to form palindrome");
                    System.exit(0);
                }
            }
            String construct = "";
            for(int i=9;i>=0;i--)
            {
                if(numlock == i)
                {
                    if(freq[i]>1)
                    {
                        while(freq[i]>1)
                        {
                            construct+=Integer.toString(i);
                            freq[i]-=2;
                        }
                    }
                    continue;
                }
                if(freq[i]>0)
                {
                    while(freq[i]>0)
                    {
                        construct+=Integer.toString(i);
                        freq[i]-=2;
                    }
                }
            }
            String create = Integer.toString(numlock);
            construct = construct+create+Reverse(construct);
            System.out.println(construct);

        }
    }    
}
