import java.util.*;
class DDA
{public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[][]=new int[4][4];
        System.out.println("Enter the array elements for 4 X 4 matrix : ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements of 4 X 4 matrix : ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}