import java.util.*;
class coordinate_distance
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2,d;
        System.out.println("Enter the value of x1");
        x1=sc.nextDouble();
        System.out.println("Enter the value of y1");
        y1=sc.nextDouble();
        System.out.println("Enter the value of x2");
        x2=sc.nextDouble();
        System.out.println("Enter the value of y2");
        y2=sc.nextDouble();
        d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("Distance is "+d);
    }
}