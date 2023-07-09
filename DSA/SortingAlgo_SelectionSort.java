import java.util.Arrays;

public class SortingAlgo_SelectionSort {
    public static void main(String[]args)
    {
        int []arr={1000,25,100,12,220,10,121,-1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] SelectionSort(int[]arr)
    {   
        int last=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            int index=largestElem(arr, last);
            Swap(arr, index, last);
            last=last-1;
        }
        return arr;
    }
    static int largestElem(int[]arr,int end)
    {
        int index=0;
        for(int i=0;i<end;i++)
        {
            if(arr[index]<arr[i+1])
            {
                index=i+1;
            }
        }
        return index;
    }
    static void Swap(int[]arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
