import java.util.Arrays;

public class SortingAlgo_InsertionSort {
    public static void main(String args[])
    {
        int[] arr={1,24,12,45,123};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] InsertionSort(int [] arr) 
    {
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else
                {
                    break;
                }
            }
        }

        return arr;
    }
    
}
