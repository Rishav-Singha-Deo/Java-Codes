import java.util.*;
class Bouncy
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        String s=sc.nextLine();
        int defaults=0;
        if(s.length()<2)
        {
            defaults=1;
        }
        int r=-1,ss=-1;
        for(int i=0;i<(s.length()-1);i++)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            if(c1>c2)
            {
                if(ss==2)
                    r=0;
                else
                {
                    r=ss=1;
                }
            }
            else if(c1<c2)
            {
                if(ss==1)
                    r=0;
                else
                {
                    r=ss=2;
                }
            }
            else if(c1==c2)
            {
                if(ss!=1||ss!=2)
                {
                    r=ss=0;
                }
            }
        }
        if(defaults==1)
            System.out.println("The number "+s+" isn't Bouncy");
        else if(r==1)
            System.out.println("The number "+s+" is Increasing");
        else if(r==2)
            System.out.println("The number "+s+" is Decreasing");
        else if(r==0)
            System.out.println("The number "+s+" is Bouncy");
    }
}