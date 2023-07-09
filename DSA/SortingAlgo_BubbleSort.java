//Time Complexity 
//Best case O(N) 
//Worst case O(N*N)

//Space Complexity is O(1) since there is no extra space required for us to to sort 
//Stable sorting Algorithm which means if two numbers are same then first one will remain to its place
import java.util.Arrays;
public class SortingAlgo_BubbleSort {
    public static void main(String[]args)
    {
        //int []arr={5,31,4,6,1,4,0};
        int []arr={1,2,3,4,5,6,7};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] BubbleSort(int[]arr)
    {
        boolean swap=false;
        for(int i=0;i<arr.length;i++)
        {

            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])// just check wheteher the previous elment if smaller if not then swap 
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            //A break statement so that if an array is sorted we can simply break out it Since there are no swaps which means it's already sortec
            //It is futile to run the loop again and again if it is sorted
            if(!swap)// we could also write swao ==false
            {
                break;
            }
        }
        return arr;
    }
    
}
