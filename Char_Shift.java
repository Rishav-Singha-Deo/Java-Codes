import java.util.*;
class Char_Shift
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word : ");
        String s=sc.nextLine();
        String st="";
        s=s.trim();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if((c>=65 && c<=90)||(c>=97 && c<=122))
            {
                c++;
                st=st+c;
            }
        }
        System.out.println("The word with shifted characters is "+st);
    }
}