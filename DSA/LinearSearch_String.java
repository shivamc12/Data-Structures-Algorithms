public class LinearSearch_String {
    public static void main(String[]args)
    {
        String str="hello";
        char target='e';
        char result=Search(str, target);
        System.out.println(result);
    }
    static char Search(String str,char target)
    {
        if(str.length()==0)
        {
            return '0';
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==target)
                {
                    return 'Y';
                }
            }
        }
        return '0';
    }

}
