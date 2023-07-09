public class BinarySearch_InfinityArrPos {
    public static void main(String[]args)
    {
        int[] arr={1,2,3,4,5,6,7,10,15,20,25};
        int target=4  ;
        System.out.println(FindSE(arr, target));

        
    }
    static int FindSE(int []arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }

        return Search(arr,target,start,end);
    }
    static int Search(int[]arr,int target,int start,int end)
    {
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
        return -1;
    }
}
