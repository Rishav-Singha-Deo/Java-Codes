import java.util.*;
class Letter_Patterns
{
    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your message : ");
        String s=sc.nextLine();
        s=s.toUpperCase();
        System.out.print("Enter the backgroung : ");
        char b=sc.next().charAt(0);
        System.out.print("Enter the foreground : ");
        char t=sc.next().charAt(0);
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            display(c,b,t);
        }
        System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
    }

    void display(char c,char b,char t)
    {
        if(c=='A')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
        }
        else if(c=='B')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='C')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='D')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='E')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
        }
        else if(c=='F')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
        }
        else if(c=='G')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='H')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
        }
        else if(c=='I')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
        }
        else if(c=='J')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='K')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+t+""+b);
        }
        else if(c=='L')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
        }
        else if(c=='M')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+b+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
        }
        else if(c=='N')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
        }
        else if(c=='O')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='P')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
        }
        else if(c=='Q')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+b+""+t+""+t+""+b);
        }
        else if(c=='R')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
        }
        else if(c=='S')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='T')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
        }
        else if(c=='U')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
        }
        else if(c=='V')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
        }
        else if(c=='W')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+t+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+b+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
        }
        else if(c=='X')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+t+""+b+""+b+""+b+""+b+""+b+""+t+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+t+""+b+""+b+""+b+""+b+""+b+""+t+""+b);
        }
        else if(c=='Y')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+t+""+b+""+b+""+b+""+b+""+b+""+t+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
        }
        else if(c=='Z')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+t+""+t+""+t+""+t+""+b+""+b);
        }
        else if(c==' ')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
        }
        else if(c=='.')
        {
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
        }
        else if(c=='?')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+t+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+t+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+t+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+t+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
        }
        else if(c=='!')
        {
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+b+""+b+""+b+""+b+""+b);
            System.out.println(b+""+b+""+b+""+b+""+t+""+b+""+b+""+b+""+b);
        }
        else
        {
            System.out.println("Not recognizable");
        }
    }
}