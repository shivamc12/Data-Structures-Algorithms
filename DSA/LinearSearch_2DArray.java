public class LinearSearch_2DArray {
    public static void main(String[]args)
    {
        int[][] arr={{1,2,3,4},{2,4,2,41},{3,21,2,2,2}};
        int target=41;
        System.out.println(Search(arr,target));
    }
    static int Search(int[][]arr,int target)
    {
        if(arr.length==0)
        {
            return 0;
        }
        else
        {
            for(int row=0;row<arr.length;row++)
            {
                for(var col=0;col<arr[row].length;col++)
                {
                    if (target==arr[row][col])
                    {
                        return arr[row][col];
                    }
                }
            }
        }
        return -1;
    }
    
}
