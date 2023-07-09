public class BinarySearch_FloorNumber{
    public static void main(String[]args)
    {
        int []arr={1,2,3,4,6,7};
        int target=5;
        System.out.println(Search(arr,target));

    }
    static int Search(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return arr[end];
    }
}