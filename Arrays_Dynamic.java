import java.util.*;
public class Arrays_Dynamic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(10);

        System.out.println("Enter the number of elements you need in the array");
        int num=in.nextInt();

        for(int i =0;i<num;i++)
        {
            list.add(in.nextInt());
        }
        System.out.println("The elements in this dynamic array are ");
        System.out.println(list);

        System.out.println("Enter the number which you would like to check if it's in the array or not");
        int check=in.nextInt();

        System.out.println(list.contains(check));
        
        System.out.println("Enter the index which you want to remove ");
        int rem=in.nextInt();

        list.remove(rem);
        System.out.println(list);
        


    }
    
}
