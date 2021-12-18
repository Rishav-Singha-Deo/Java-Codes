import java.util.*;
public class diamond_pattern
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m;
        for(i=0;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print("");
            }
            for(m=i;m>=0;m--)
            {
                System.out.print(m);
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for(i=4;i>=0;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(m=i;m>+0;m--)
            {
                System.out.print(m);
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}