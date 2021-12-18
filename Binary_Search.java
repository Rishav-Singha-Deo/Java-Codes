import java.util.*;
class Binary_Search
{   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter the array elements");
        for(int i=0;i<9;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static void bs(int ar[],int lb,int ub,int k)
    {
        int p=(lb+ub)/2;
        while((ar[p]!=k)&&(lb<ub))
        {
            if(ar[p]>k)
                ub=p-1;
            else
            {
                lb=p+1;
                p=(lb+ub)/2;
            }
        }
        if(lb<ub)
            System.out.println("At "+p);
        
    }
}