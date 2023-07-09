public class FindFirstAndLastElementSArray_LeetCodeM{
    public static void main(String[]args)
    {
        int[]arr={5,7,7,8,8,10};//[5,7,7,8,8,10]
        int target=8;
       int []arr2=Search(arr,target);
       for(int i=0;i<arr2.length;i++)
       {
        System.out.println(arr2[i]);
       }
    }
    static int[] Search(int[]arr,int target)
    {
        int []arr2={-1,-1};

        arr2[0]=BinarySearch(arr, target, true);
        arr2[1]=BinarySearch(arr,target,false);

        return arr2;

    }
    static int BinarySearch(int []arr,int target,Boolean StartIndex)
    {
        int start=0,end=arr.length-1;
        int ans=-1;
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
                ans=mid;
                if(StartIndex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            
        }
        return ans;     
    }
}