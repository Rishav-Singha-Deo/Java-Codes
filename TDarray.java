import java.util.*;
class TDarray
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n=sc.nextInt();
        int a[][]=new int [n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        System.out.println("The new Array is\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}