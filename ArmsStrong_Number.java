import java.util.*;
public class ArmsStrong_Number {
    public static void main(String []args)
    {
        int num,temp=0,rem;
        
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number which you would like to check whether it is Armstrong or not");
        num=inp.nextInt();
        int save=num;
        while(num>0)
        {
           rem=num%10;
            temp=temp+(rem*rem*rem);
            num=num/10;
        }
        if(temp==save)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");

        }
        inp.close();
                    
    }
    
}
