import java.util.*;

public class Array2D_Practise {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
       //int[][] arr=new int[2][];//Rows are mandatory whereas colums are not 
        
        //int[][] arr={ {1,2} ,{1,2,3},{1,23,2,2} };

        //int[][] arr=new int[3][3];
        
        int[][] arr={{1,23,3},{12,21,23,2}};
        // for(int row=0;row<arr.length;row++)
        // {
        //     for(int col=0;col<arr[row].length;col++)
        //     {
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        printarrenh(arr);

        

    }
    static void printarrenh(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }





    // static void printarr(int [][]arr)
    // {
    //     for(int row=0;row<arr.length;row++)
    //     {
    //         for(int col=0;col<arr[row].length;col++)
    //         {
    //             System.out.print(arr[row][col]+" ");
    //         }
    //         System.out.println();
    //     }
}

