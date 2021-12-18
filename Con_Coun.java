/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Con_Coun
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word : ");
        String s=sc.nextLine();
        int l=s.length();
        int c=0;
        s=s.toLowerCase();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
                c++;
        }
        System.out.println("Number of consonants is "+c);
    }
}
/* OUTPUT
 * Enter a word : Rishav
 * Number of consonants is 4
 */