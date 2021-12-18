import java.util.*;
class Pallindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or a number : ");
        String s=sc.nextLine();
        String r="";
        int l=s.length();
        for(int i=(l-1);i>=0;i--)
        {
            char ch=s.charAt(i);
            r=r+ch;
        }
        if(r.equalsIgnoreCase(s))
            System.out.println(s+" is pallindrome");
        else
            System.out.println(s+" isn't pallindrome");
    }
}