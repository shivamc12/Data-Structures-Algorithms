public class BitWiseOperator_FindTheNotRepeatedNo {
    public static void main(String args[])
    {
        int[]arr={1,1,3,3,4,4,6};
        System.out.println(ans(arr));
    }
    static int ans(int []arr)
    {
        int num=0;
        for(int i : arr)
        {
            num^=i;
        }
        return num;
    }

    
}
