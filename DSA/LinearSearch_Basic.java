public class LinearSearch_Basic{
    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,42,11};
        int target=11;
        int result=LinSearch(arr,target );
        System.out.println(result);

    } 
    static int LinSearch(int []arr,int target)
    {
        if (arr.length==0)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if (arr[i]==target)
                {
                    return target;
                }
            }
        }
        return -1;
    }
}