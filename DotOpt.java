import java.util.*;
class DotOpt
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        DotOpt obj=new DotOpt();
        float a,b;
        System.out.print("Enter the length : ");
        a=sc.nextFloat();
        System.out.print("Enter the breadth : ");
        b=sc.nextFloat();
        obj.area(a,b);
    }

    void area(float l,float b)
    {
        System.out.print("The area of the rectangle is : "+(l*b));
    }
}