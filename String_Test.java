import java.util.*;
class String_Test
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2,s3;
        int a;
        System.out.print("Enter the string1 : ");
        s1=sc.nextLine();
        System.out.print("Enter the string2 : ");
        s2=sc.nextLine();
        a=s1.compareTo(s2);
        System.out.println("compareTo"+a);
    }
}