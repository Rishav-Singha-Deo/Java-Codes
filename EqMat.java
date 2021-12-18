import java.util.*;
class EqMat
{
    int a[][];
    int m,n;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }

    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    boolean check(EqMat P,EqMat Q)
    {
        int i,j,signal=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(P.a[i][j]==Q.a[i][j])
                    signal=1;
            }
        }
        if(signal==1)
            return true;
        else
            return false;
    }

    void print()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void main()
    {
        EqMat obj1=new EqMat(5,5);
        EqMat obj2=new EqMat(5,5);
        obj1.readarray();
        obj2.readarray();
        if(check(obj1,obj2)==true)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}