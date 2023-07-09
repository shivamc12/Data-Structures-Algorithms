public class Recursion_BinarySearch {
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int target=10;
        System.out.println(Ans(arr,target,0,arr.length-1));
    }
    static int Ans(int []arr,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]>target)
        {
            return Ans(arr,target,start,end=mid-1);
        }
        if(arr[mid]<target)
        {
            return Ans(arr,target,mid+1,end);
        }
        return mid;

    }
}
