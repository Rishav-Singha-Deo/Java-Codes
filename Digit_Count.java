/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Digit_Count
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        System.out.print("Enter any number : ");
        n=sc.nextInt();
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        System.out.println(c+" digits");
    }
}
/* OUTPUT
 * Enter any number : 1256
 * 4 digits
 */