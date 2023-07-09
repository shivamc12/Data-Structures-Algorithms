public class BitWiseOperator_CheckEvenOrOdd {
    public  static void main(String[]args)
    {
        int n=44;
        System.out.println(isOdd(n));

    }
    // 1010110101(1) This last digit will decide whether the number is even or odd since 
    // It is 2 power 0 * the number if number is 0 then it's even else odd
    //SO the right side number will always have some value to 2 Power
    static boolean isOdd(int n)
    {
        return (n&1)==1;
    }
    
}
