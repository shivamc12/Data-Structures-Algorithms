public class MaximumWealthLeetCode {
    public static void main(String[]args)
    {
        int [][]arr={{1,2},{2,4,5},{2,1,2,1}};
        int ans=CheckWealth(arr);
        System.out.println(ans);
    }
    static int CheckWealth(int[][]arr)
    {
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=0;
            for(int j=0;j<arr[i].length;j++)
            {
                
                temp=arr[i][j]+temp;
                if(max<temp)
                {
                    max=temp;
                    count=i+1;
                }
                
            }
        }
        return max;
    }
    
}
