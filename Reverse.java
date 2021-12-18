/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Reverse
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any word or number : ");
        String s=sc.nextLine();
        String r="";
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            r=r+ch;
        }
        System.out.println("Reversed word '"+r+"'");
    }
}
/* OUTPUT
 * Enter any word or number : rishav
 * Reversed word 'vahsir'
 */