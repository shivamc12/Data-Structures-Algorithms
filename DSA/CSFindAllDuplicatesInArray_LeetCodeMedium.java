import java.util.ArrayList;
import java.util.List;

public class CSFindAllDuplicatesInArray_LeetCodeMedium {
    public static void main (String[]args)
    {
        int[]arr={3,2,4,2,3};
        System.out.println(Ans(arr));

    }
    static ArrayList<Integer> Ans(int[]arr)
    {
        int i=0;
         ArrayList<Integer> ans=new ArrayList<>();

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
        for(int b =0 ;b<arr.length;b++)
        {
            if(arr[b]!=b+1)
            {
                ans.add(arr[b]);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
