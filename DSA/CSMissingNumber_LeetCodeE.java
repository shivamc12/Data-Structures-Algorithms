public class CSMissingNumber_LeetCodeE {
    public static void main(String[]args)
    {
        int []arr={4,0,1,2};
System.out.println(Ans(arr));


    } 
    static int Ans(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]<arr.length&& arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int b=0;b<arr.length;b++)
        {
            if(arr[b]!=b)
            {
            return b;
            }
        }
        return arr.length;
    }
    static void swap(int[]arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    
}
