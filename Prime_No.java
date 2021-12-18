/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Prime_No
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x=sc.nextInt();
        int i,c=0;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
                c++;
        }
        if(c==0)
            System.out.println("The given number is prime");
        else
            System.out.println("The given number isn't prime");
    }
}
/* OUTPUT
 * =============================
 * Enter a number : 15
 * The given number isn't prime
 * =============================
 * Enter a number : 5
 * The given number is prime
 */