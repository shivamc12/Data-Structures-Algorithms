import java.util.*;
public class Array_SwapIndex {
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];

        Inp(arr);

        System.out.println(Arrays.toString(arr));

        IndexSwap(arr);

        System.out.println(Arrays.toString(arr));



        

    }
    static void Inp(int[]arr)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 5 elements of an array");
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
    }

    static void IndexSwap(int[] arr)
    {
        int temp;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Now Enter 2 indexes which you would like to replace");
        System.out.println("First Index");
        int one=in.nextInt();
        System.out.println("Second Index");
        int two=in.nextInt();

        temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    
}
