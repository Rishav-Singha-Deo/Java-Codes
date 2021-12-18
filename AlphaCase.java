import java.util.*;
class AlphaCase
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word or sentance : ");
        String s=sc.nextLine();
        String w=" ";
        int l=s.length();
        for(int i=0;i<1;i++)
        {
            char ch=s.charAt(i);
            boolean b=Character.isUpperCase(ch);
            if (b==true)
            {
                ch=Character.toLowerCase(ch);
                w=w+ch;
            }
            else
            {
                ch=Character.toUpperCase(ch);
                w=w+ch;
            }
        }
        System.out.println(w);
    }
}