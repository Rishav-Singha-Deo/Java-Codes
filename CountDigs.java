import java.util.*;
class CountDigs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,tmp,c=0;
        System.out.print("Enter a number : ");
        a=sc.nextInt();
        tmp=a;
        while(tmp!=0)
        {
            c++;
            tmp=tmp/10;
        }
        System.out.println("There are "+c+" digits");
    }
}