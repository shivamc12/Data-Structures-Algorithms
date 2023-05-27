import java.util.*;
public class Alphabet_Case_Check {
    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter one character");

        char ch=inp.next().trim().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Upper case");
        }
        inp.close();
    }
}
