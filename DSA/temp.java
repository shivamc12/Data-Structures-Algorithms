import java.util.Arrays;

public class temp {
    public static void main(String[]args)
    {
        int[]arr={4,3,2,7,8,2,3,1};

    Ans(arr);
        System.out.println(Arrays.toString(arr));
    
    }   
    static void Ans(int[]arr)
    {
        int i=0;

        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i] !=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }

    }
    static void swap(int[]arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
