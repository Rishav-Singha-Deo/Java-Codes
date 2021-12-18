import java.util.*;
class Avg_SDA
{public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrray");
        int n=sc.nextInt();
        int i,s=0,c=1;
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c=c+1;
                s=s+a[i];
            }
        }
        double avg=s/c;
        System.out.println("Average of all even no.s:"+avg);
    }
}