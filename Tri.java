import java.util.*;
class Tri
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
                System.out.print(" ");
            for(k=1;k<=(i+i-1);k++)
                System.out.print("*");
            System.out.println();
        }
    }
}