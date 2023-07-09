import java.util.*;
public class CSFindMissingPositive_LeetCodeHard {
    public static void main(String[]args)
    {
        int []arr={1,2,0};
        System.out.println(Ans(arr));
        // Ans(arr);
        // System.out.println(Arrays.toString(arr));
    }
    static int Ans(int[]arr)
    {
        int i=0;

        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j-1]!=j)
            {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
}
