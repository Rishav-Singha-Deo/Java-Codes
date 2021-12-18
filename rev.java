import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter anything : ");
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            r=c+r;
        }
        System.out.println("Reversed word : "+r);
    }
}