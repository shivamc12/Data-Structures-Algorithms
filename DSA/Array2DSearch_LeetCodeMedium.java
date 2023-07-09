public class Array2DSearch_LeetCodeMedium {
    public static void main(String[]args)
    {
        int [][]arr={{1,2,3,5,6},{7,8,9,10,11,12,13}};
        int target=10;
        System.out.println(Search(arr, target));
        
    }

    // Brute Force Approach
    static boolean Search(int [][]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
