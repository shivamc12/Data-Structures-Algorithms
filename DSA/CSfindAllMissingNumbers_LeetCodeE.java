import java.util.Arrays;

public class CSfindAllMissingNumbers_LeetCodeE {
    public static void main(String[]args)
    {
        int[]arr={4,3,2,7,8,2,3,1};
        int[]temp;
        temp=Ans(arr);
        System.out.println(Arrays.toString(temp));
    
    }   
    static int[] Ans(int[]arr)
    {
        int[]temp=new int[arr.length];
        int i=0;
        int c=0;

        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]<arr.length&&arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }
        for(int b=0;b<arr.length;b++)
        {
            if(arr[b]!=b+1)
            {
                temp[c]=b+1;
                c++;
            }
        }
        return temp;

    }
    static void swap(int[]arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
