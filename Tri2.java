import java.util.*;
class Tri2
{
    public static void main(String[]arhs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
                System.out.print(" ");
            for(int k=0;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}