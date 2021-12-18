import java.util.*;
class AreaMethod
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        AreaMethod obj=new AreaMethod();
        float a,b;
        System.out.print("Enter the length : ");
        a=sc.nextFloat();
        System.out.print("Enter the breadth : ");
        b=sc.nextFloat();
        float c=obj.area(a,b);
        System.out.print("The area is : "+c);
    }

    float area(float l,float b)
    {
        return (l*b);
    }
}