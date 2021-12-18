import java.util.*;
class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int [10];
        int i,s=0;
        System.out.println("Enter the size here : ");
        
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            s+=x[i];
        }
        System.out.println("Sum = ");
    }
}