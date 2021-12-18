import java.util.*;
class Method_Cube
{
    int cube(int a)
    {
        int c=a*a*a;
        return c;
    }
    void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int y=0;
        y=cube(x);
        System.out.println("The cube of "+x+" is "+y);
    }
}