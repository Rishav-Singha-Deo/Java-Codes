import java.util.*;
class Sum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows : ");
        int n=sc.nextInt();
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        for(int i=0;i<n;i++)
        {
            System.out.print("1 column "+(i+1)+" row : ");
            a[i]=sc.nextInt();
            {
                {
                    
                }
            }
            System.out.print("2 column "+(i+1)+" row : ");
            b[i]=sc.nextInt();
            c[i]=a[i]+b[i];
        }
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" + "+b[i]+" = "+c[i]);
    }
}