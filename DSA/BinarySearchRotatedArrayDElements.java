public class BinarySearchRotatedArrayDElements{
    public static void main(String[]args)
    {
        int[] arr={3, 3, 3, 1, 2, 3};
        System.out.println(Search(arr));
    }
    static int Search(int []arr)
    {
        int start=0,end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                return arr[mid];
            }
            else if(arr[mid]<arr[mid+1])
            {
                return arr[mid+1];
            }
            else
            {
                if(arr[start]>arr[start+1])
                {
                    return arr[start];
                }
                start++;
                
                if(arr[end]<arr[end-1])
                {
                    return arr[end-1];
                }
                end--;
            }
            
        }


        return -1;
    }

}