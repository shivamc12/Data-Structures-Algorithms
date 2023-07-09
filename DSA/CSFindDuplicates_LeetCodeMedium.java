public class CSFindDuplicates_LeetCodeMedium {
    public static void main(String[]args)
    {
        int[] arr={2,4,3,1,5,4};
        System.out.println(Ans(arr));
    }
    static int Ans(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!= i+1)
            {
                int correct=arr[i]-1;
                if(arr[i] !=arr[correct])
                {
                    swap(arr,i,correct);
                }
                else
                {
                    return arr[i];
                }
            }
            else
            {
                i++;
            }
        }
        return -1;

    }
    static void swap(int[]arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;

    }
    
}
