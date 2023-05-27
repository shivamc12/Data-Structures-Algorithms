import java.util.*;
public class Array_Reverse {
    public static void main(String[]args)
    {
        int[] arr = new int[5];
        Inp(arr);
        System.out.print("Array Before Reversing:- ");
        System.out.println(Arrays.toString(arr));
        Rev(arr);
        System.out.print("Array After Reversing:- ");
        System.out.println(Arrays.toString(arr));

    }
    static void Inp(int[] arr)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 5 elements in an array");
        for(int i=0;i<5;i++)
        {
            arr[i]=in.nextInt();
        }

    }
    

    static void Rev(int[] arr)
    {
        int start=0,end=4;
        int temp;

        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    
}
