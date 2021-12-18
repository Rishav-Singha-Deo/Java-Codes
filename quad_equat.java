/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class quad_equat
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e;
        System.out.println("Enter the values of a, b & c as in ax^2+bx+c=0");
        System.out.println("Enter the value of a");
        a=sc.nextDouble();
        System.out.println("Enter the value of b");
        b=sc.nextDouble();
        System.out.println("Enter the value of c");
        c=sc.nextDouble();
        d=(-(b)+Math.sqrt(4*a*c))/(2*a);
        System.out.println("First root = "+d);
        e=(-(b)-Math.sqrt(4*a*c))/(2*a);
        System.out.println("Second root = "+e);
    }
}
/* OUTPUT
 * Enter the values of a, b & c as in ax^2+bx+c=0
 * Enter the value of a
 * 1
 * Enter the value of b
 * 2
 * Enter the value of c
 * 3
 * First root =0.7320508075688772
 * Second root = -2.732050807568877
 */