public class EvenDigits_LeetCode {
    public static void main(String[]args)
    {
        int[] arr={11,2231,3232,4121,512,512};
        int ans=EvenDig(arr);
        System.out.println(ans);
    }
    static int EvenDig(int[]arr)
    {
        int count=0;
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {   
                int temp=0;
                int temp2=arr[i];
                while(temp2!=0)
                {
                    temp++;
                    temp2=temp2/10;
                }
                if(temp%2==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
}
