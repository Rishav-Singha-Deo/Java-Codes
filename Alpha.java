/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Alpha
{
    String Str;
    Alpha()
    {
        Str="";
    }

    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word : ");
        Str=sc.nextLine();
    }

    void arrange()
    {
        char[] arr=Str.toCharArray();
        int i,j;
        char newValue;
        for(i=1;i<arr.length;i++)
        {
            newValue=arr[i];
            j=i;
            while(j>0&&arr[j-1]>newValue)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=newValue;
        }
        Str=new String(arr);
    }

    void display()
    {
        System.out.println("Word now is : "+Str);
    }

    void main()
    {
        Alpha reobj=new Alpha();
        reobj.readword();
        reobj.display();
        reobj.arrange();
        reobj.display();
    }
}
/* OUTPUT
 * Enter a word : Rishav
 * Word now is : Rishav
 * Word now is : Rahisv
 */