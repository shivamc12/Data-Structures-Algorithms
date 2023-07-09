public class Minimum_Number {
    public static void main(String[]args)
    {
        int []arr={21,6,12,0,-31};
        int result=MinValue(arr);
        System.out.println(result);
    }
    static int MinValue(int[] arr)
    {   int min=arr[0];
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                
                if(min>arr[i])
                {
                    min=arr[i];
                }
                
            }
        }
        return min;
    }
    
}
