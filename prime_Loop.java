import java.util.*;
class prime_Loop//class declared
{
    public static void main(String [] args)//main method declared
    {
        Scanner sc=new Scanner(System.in);//Scanner class declared
        System.out.print("Enter the number of rows : ");
        int n=sc.nextInt();int i;//variables declared
        int a[]=new int[n];//array declared
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        for(i=0;i<n;i++)
        {
            int c=0;//counter declared
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                    c++;//checked for number of factors
            }
            if(c==2)//checked for prime number
                System.out.println((i+1)+"th place");
        }
    }//main method closed
}//class closed