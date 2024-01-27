class SumOfSubarray
{
    static void sumPrint(int sum, int rem[],int index)
    {
        if(index == rem.length)
        {
            System.out.println(sum);
            return;
        }
        sumPrint(sum+rem[index],rem,index+1);
        sumPrint(sum,rem,index+1);
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,4,5};
        sumPrint(0,arr,0);
    }
}
//lecture 35
// Just understand that both the recurssive cases gets to include or not to include
// the value, just think for the first case, you don't need to think
// for the further cases, use on recurssive case a using one value
// and another as not using that value followed in the tree type.