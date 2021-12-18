import java.util.*;
class Pay
{
    String name;
    double basic;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name : ");
        name=sc.nextLine();
        System.out.print("Enter the basic pay scale : ");
        basic=sc.nextDouble();
    }

    void display()
    {
        System.out.print("Name : "+name+"    Basic : "+basic);
    }
}