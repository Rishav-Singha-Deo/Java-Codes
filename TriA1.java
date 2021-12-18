import java.util.*;
class TriA1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the np.of rows : ");
        int n=sc.nextInt();
        for(int i=65;i<65+n;i++)
        {
            for(int j=65;j<=i;j++)
                System.out.print((char)j);
            System.out.println();
        }
    }
}