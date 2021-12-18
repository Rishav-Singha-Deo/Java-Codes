import java.util.*;
class seq
{
    void main()
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter : ");
        int b=a.nextInt();
        for(int i=1;i<=b;i++)
        {
            int c=i*i*i-1;
            System.out.println(c);
        }
    }
}