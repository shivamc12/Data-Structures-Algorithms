public class Pattern1 {
    public static void main(String[]args)
    {
        Pattern(5);
    }
    static void Pattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
