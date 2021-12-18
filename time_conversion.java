import java.util.*;
class time_conversion
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TIME CONVERTER");
        int ch,h,m,M;
        System.out.println("1:Minutes to hour minutes        2:Hour minutes to minutes");
        System.out.print("Your choice here:");
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.print("Enter the time in minutes:");
            M=sc.nextInt();
            h=M/60;
            m=M%60;
            System.out.print(h+" hours ");
            System.out.println(m+" minutes");
        }
        else if(ch==2)
        {
            System.out.print("Enter the hours:");
            h=sc.nextInt();
            System.out.print("Enter the minutes:");
            m=sc.nextInt();
            M=(h*60)+m;
            System.out.println(M+" minutes");
        }
        else
            System.out.println("!? PLEASE CHECK THE INPUT ?!");
    }
}