import java.util.*;
class AddMatrix
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of the matrix : ");
        int n=sc.nextInt();
        int i,j;
        int a[][]=new int [n][n];
        int b[][]=new int [n][n];
        int c[][]=new int [n][n];
        System.out.println("Enter the elements for the 1st matrix");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        System.out.println("Enter the elements for the 2st matrix");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                b[i][j]=sc.nextInt();
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                c[i][j]=a[i][j]+b[i][j];
        System.out.println("The new matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print("  "+c[i][j]);
            System.out.println();
        }
    }
}