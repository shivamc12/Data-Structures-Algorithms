public class BinarySearch {
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5,60,7,8,9,0};
        int target=3;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            //int mid = (start+end) /2 it would give an error since it could exceed int limit if numer is large
            int mid=start+(end-start)/2;

            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }

        }

        return -1;
    }
    
}
