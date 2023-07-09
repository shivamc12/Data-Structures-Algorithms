public class BinarySearch_OrderAgnostic{
    public static void main(String[]args)
    {
        int[]arr={10,9,8,7,6,5,4,3,2,1};
        int[]arr2={1,2,3,4,5,6,7,8,9};
        int target=10;

        System.out.print("The Element is in this position ");
        System.out.println(binarySearch(arr,target));
        System.out.print("The Element is in this position ");
        System.out.println(binarySearch(arr2,target));
    }
    static int binarySearch(int[]arr,int target)
    {
        int start=0,end=arr.length-1;
        if(arr[start]>arr[end]){
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]<target)
                {
                    end=mid-1;
                }
                else if(arr[mid]>target)
                {
                    start=mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        else if(arr[start]<arr[end])
        {
            while(start<=end)
            {
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
        }
        return -1;
    }
}