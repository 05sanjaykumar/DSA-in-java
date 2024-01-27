import java.util.*;
public class MaximalHistogram
{
    public static void main(String[] args) 
    {
        int arr[] = {2,1,5,6,2,3};
        int l  = arr.length-1;
        int ngidx[] = new int[l+1]; // next smaller index
        Stack<Integer> st =new Stack<Integer>();
        Stack<Integer> track = new Stack<Integer>();
        for(int i=l;i>=0;i--) 
        {
              if(st.isEmpty())
            {
                ngidx[i] = -1;
                track.push(i);
                st.push(arr[i]);
            } 
            else if(st.peek() >=arr[i])
            {
                while (true) 
                {
                    if(st.isEmpty())
                    {
                        st.push(arr[i]);
                        track.push(i);
                        ngidx[i] = -1;
                        break;
                    }
                    else if(st.peek() < arr[i])
                    {
                        ngidx[i] = track.peek();
                        st.push(arr[i]);
                        track.push(i);
                        break;
                    }
                    else
                    {
                        st.pop();
                        track.pop();
                    }
                }
            }
            else
            {

                ngidx[i] = track.peek();
                st.push(arr[i]); 
                track.push(i);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ngidx));
        st.clear();
        track.clear();

        int pgidx[] = new int[l+1]; //previous smaller index
        for(int i=0;i<=l;i++) 
        {
            if(st.isEmpty())
            {
                pgidx[i] = -1;
                track.push(i);
                st.push(arr[i]);
            }
            else if(st.peek() >=arr[i])
            {
                while (true) 
                {
                    if(st.isEmpty())
                    {
                        st.push(arr[i]);
                        track.push(i);
                        pgidx[i] = -1;
                        break;
                    }
                    else if(st.peek() < arr[i])
                    {
                        pgidx[i] = track.peek();
                        st.push(arr[i]);
                        track.push(i);
                        break;
                    }
                    else
                    {
                        st.pop();
                        track.pop();
                    }
                }
            }
            else
            {
                pgidx[i] = track.peek();
                st.push(arr[i]);
                track.push(i);
            }
        }
        System.out.println(Arrays.toString(pgidx));
        int store = -1;
        int ans = 0;
        for(int i=0;i<=l;i++)
        {
            if(ngidx[i]!=-1 && pgidx[i]!=-1)
            {
                ans = (int)Math.abs(((ngidx[i]-pgidx[i])-1)*arr[i]);
            }
            else if(ngidx[i]==-1 && pgidx[i]!=-1)
            {
                ans = (l-pgidx[i])*arr[i];
            }
            else if(ngidx[i]!=-1 && pgidx[i]==-1)
            {
                ans = ngidx[i]*arr[i];
            }
            else
            {
                ans = (l+1)*arr[i];
            }
            if(ans>store)
            {
                store = ans;
            }
        }
        System.out.println("The largest histogram area is :-"+store);
    }
}