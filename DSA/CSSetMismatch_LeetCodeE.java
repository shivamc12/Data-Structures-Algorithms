import java.util.Arrays;
public class CSSetMismatch_LeetCodeE{
    public static void main(String[]args)
    {
        int []arr={1,2,2,4};
        int[]temp=Ans(arr);
    System.out.println(Arrays.toString(temp));
    }
    static int[] Ans(int[]arr)
    {
        int[]temp={-1,-1};
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                temp[1]=j+1;
                temp[0]=arr[j];
            }
        }

        return temp;
    }
    static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}