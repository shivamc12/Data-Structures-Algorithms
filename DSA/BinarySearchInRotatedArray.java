public class BinarySearchInRotatedArray {
    public static void main(String[]args)
    {
        //int []arr={1,2,3,4,5,6,7,8,9};
        int[]arr={6,7,8,9,0,1,2,3,4,5};
        int target=0;
        System.out.println(Search(arr,target));

    }
    static int Search(int []arr,int target)
    {
        int peak=Peak(arr);
        int first=BinarySearch(arr, target,0,peak );
        if(peak==-1)
        {
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        if(first==-1)
        {
           int last= BinarySearch(arr, target, peak+1,arr.length-1);
            return last;
        }
        else
        {
            return first;
        }


    }
    static int BinarySearch(int []arr,int target,int start,int end)
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
    static int Peak(int[]arr)
    {
        int ans=0;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid >start &&arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[start]<arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
            
            
        


        return ans;
    }

    
}
