import java.util.*;
class addsss
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of students : ");
        int n=sc.nextInt();
        String[] stun=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter : ");
            String tmp=sc.nextLine();
            stun[i]=tmp;
        }
        for(int j=0;j<n;j++)
            System.out.println(j+". "+stun[j]);
    }
}