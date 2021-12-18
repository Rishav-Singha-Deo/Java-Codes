import java.util.*;
class Shift
{
    int mat[][],m,n;
    Shift(int mm,int nn)
    {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements row-wise");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
    }

    void cyclic(Shift P)
    {
        for(int i=0;i<m-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=P.mat[i+1][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            mat[m-1][i]=P.mat[0][i];
        }
    }

    void display()
    {
        System.out.println("The shifted array is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        Shift obj1=new Shift(r,c);
        Shift obj2=new Shift(r,c);
        obj1.input();
        obj2.cyclic(obj1);
        obj2.display();
    }
}