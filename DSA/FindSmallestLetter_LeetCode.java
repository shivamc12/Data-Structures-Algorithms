public class FindSmallestLetter_LeetCode {
    public static void main(String[]args)
    {
        char[] str={'a','b','d','e'};
        char target='x';
        System.out.println(Search(str, target));
    }
    static char Search(char[] letter,int target)
    {
        int start=0;
        int end=letter.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letter[mid]<target)
            {
                start=mid+1;
            }
            else if(letter[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                return letter[mid];
            }
        }
        int temp=letter.length-1;
        if(letter[temp]<target)
        {
            return letter[0];
        }
        return letter[end];
    }
    
}
