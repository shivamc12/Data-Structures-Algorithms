import java.util.*;
public class Array_MaxValue {
    public static void main(String[]args)
    {
        int[] arr=new int[5];
        int temp;

        Set(arr);


        temp=Max(arr);
        System.out.print("The Maximum number out of these 5 numbers is ");
        System.out.println(temp);


    }

    static void Set(int[]arr)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            arr[i]=in.nextInt();
        }
    }

    static int Max(int[]arr)
    {
        int max=0;
        for(int i=0;i<5;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }

        }

        return max;
    }
    
}
