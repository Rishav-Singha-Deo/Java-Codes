import java.util.*;
class Thanos
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of creatures in the whole universe : ");
        int a=sc.nextInt();
        System.out.print("Does Thanos has all the six infinity stones : ");
        String s=sc.nextLine();
        System.out.print("Did they stop him from snapping his fingers : ");
        String ss=sc.nextLine();
        if(s!="yes"|| s!="Yes" || ss!="yes" || ss!="Yes")
            a=a/2;
        System.out.println("Dude, you got only "+a+" creatures left.");
    }
}