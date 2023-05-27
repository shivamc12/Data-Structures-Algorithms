import java.util.*;
public class Arrays_Practise {
    public static void main(String[]args)
    {
        
        Scanner in=new Scanner(System.in);
        int[] arr=new int[3];
        String[] str=new String[4];
        System.out.println("num or str ?");
        String choice=in.next();
        System.out.println(choice);

        if(choice.equals("num"))
        {
            System.out.println("Enter the elements in an array");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=in.nextInt();
            }
            printArrayNum(arr);
        }

        else if(choice.equals("str"))
        {
            System.out.println("Enter the elements in the String");
            for(int i=0;i<str.length;i++)
            {
                str[i]=in.next();
            }
            printString(str);

        }

        in.close();
    }

    static void printArrayNum(int[] arr)
    {
        System.out.println("The numbers stored in an array");
        System.out.println(Arrays.toString(arr));
    }

    static void printString(String[] str)
    {
        System.out.println("The elements in the array are");
        System.out.println(Arrays.toString(str));
    }
    
}
