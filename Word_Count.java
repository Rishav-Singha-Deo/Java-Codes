import java.util.*;
class Word_Count
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentance : ");
        String s=sc.nextLine();
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
                c++;
        }
        c++;
        System.out.println("There are "+c+" words in this sentance");
    }
}