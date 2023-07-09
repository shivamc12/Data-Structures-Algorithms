import java.util.*;
public class String_Palindrome {
    public static void main(String[]args)
    {
        String str=("a");
        System.out.println(Check(str));


        
    }
    static boolean Check(String str)
    {
        boolean ans=true;
        int start=0,end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                ans=false;
                break;
            }
            else
            {
                start++;
                end--;
            }
        }
        
        return  ans;
    }
    
}
