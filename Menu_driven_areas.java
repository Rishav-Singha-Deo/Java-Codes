import java.util.*;
class Menu_driven_areas
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        int ch=sc.nextInt();
        if(ch==1)
        {
            float l,b,a;
            System.out.print("Enter the length : ");
            l=sc.nextFloat();
            System.out.print("Enter the breadth : ");
            b=sc.nextFloat();
            a=l*b;
            System.out.println("The area is "+a+" sq units");
        }
        else if(ch==2)
        {
            float e,a;
            System.out.println("Enter the side");
            e=sc.nextFloat();
            a=e*e;
            System.out.println("The area is "+a+" sq units");
        }
        else if(ch==3)
        {
            int sch;
            System.out.println("1:Radius 2:Diameter");
            sch=sc.nextInt();
            if(sch==1)
            {
                float r,a;
                System.out.println("Enter the radius");
                r=sc.nextFloat();
                a=(22/7)*r*r;
                System.out.println("The area is "+a+" sq units");
            }
            else if(sch==2)
            {
                float d,a;
                System.out.println("Enter the diameter");
                d=sc.nextFloat();
                a=(22/7)*d*d/4;
                System.out.println("The area is "+a+" sq units");
            }
            else
                System.out.println("Wrong input");
        }
        else if(ch==4)
        {
            int sch;
            System.out.println("1.Using height & base");
            System.out.println("2.Using");
            System.out.println("3.Sides");
            sch=sc.nextInt();
            if(sch==1)
            {
                double h,b,a;
                System.out.println("Enter the height");
                h=sc.nextDouble();
                System.out.println("Enter the base");
                b=sc.nextDouble();
                a=0.5*h*b;
                System.out.print("The area is "+a+" sq units");
            }   
            else if(sch==2)
            {
                float a,b,c,s,q,w,e;
                double ar;
                System.out.println("Enter 1st side");
                a=sc.nextFloat();
                System.out.println("Enter 2nd side");
                b=sc.nextFloat();
                System.out.println("Enter 3rd side");
                c=sc.nextFloat();
                q=a+b;
                w=b+c;
                e=a+c;
                if(q<c || w<a || e<b)
                {System.out.println("Wrong input");
                }
                else
                {
                    s=(a+b+c)/3;
                    ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                    System.out.println("The area is "+ar+" sq units");
                }
            }
            else
                System.out.println("Wrong input");
        }
        else
            System.out.println("Wrong input");
    }
}