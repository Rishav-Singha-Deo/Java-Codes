import java.util.*;
class Area
{
    float length,breadth;
    Area(float l,float b)
    {
        length=l;
        breadth=b;
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        System.out.print("Enter the length : ");
        a=sc.nextFloat();
        System.out.print("Enter the breadth : ");
        b=sc.nextFloat();
        Area obj=new Area(a,b);
        System.out.print("The area is : "+obj.area());
    }

    float area()
    {
        return (length*breadth);
    }
}