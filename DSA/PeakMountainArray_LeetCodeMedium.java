public class PeakMountainArray_LeetCodeMedium {
    public static void main(String[]args)
    {
        int[]arr ={0,2,3,4,6,7,1,0,-1,-2,-3};
        System.out.println(Search(arr));
    }
    static int Search(int[]arr)
    {
        int start=0,end=arr.length-1;
        
//The loop will break once the start and end both are equal
//So it will be interating till we find the largest number
while(start!=end)        
        {
            int mid=start+(end-start)/2;
            //If the mid is greater than mid+1 then we will set the end =mid because we need the largest number 
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else 
            {
                start=mid+1;
            }
        }
        //We can either return start or end since they both were pointing at the same index 
        return start;

    }
    
}
