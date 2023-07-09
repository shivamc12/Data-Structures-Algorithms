public class RotationCountArray {
    public static void main(String[]args)
    {
        int arr[] = {7, 9, 11, 12, 5};
        System.out.println(Ans(arr));

    }
    static int Ans(int []arr)
    {
        int peak=Peak(arr);
        if(peak!=0)
        {
            return peak+1;
        }
        else
        {
        return 0;
        }
    }

    static int Peak(int[]arr)
    {
        int start=0,end=arr.length-1;
        int temp=end;
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
        

        return 0;
    }
    
}
