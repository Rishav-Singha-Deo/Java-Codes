import java.util.*;
class Calculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int ch,a,b;
        System.out.print("Press\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.print("Enter 1st number : ");
            a=sc.nextInt();
            System.out.print("Enter 2nd number : ");
            b=sc.nextInt();
            System.out.println("The sum is : "+(a+b));
            break;
            case 2:
            System.out.print("Enter 1st number : ");
            a=sc.nextInt();
            System.out.print("Enter 2nd number : ");
            b=sc.nextInt();
            System.out.println("The difference is : "+(a-b));
            break;
            case 3:
            System.out.print("Enter 1st number : ");
            a=sc.nextInt();
            System.out.print("Enter 2nd number : ");
            b=sc.nextInt();
            System.out.println("The product is : "+(a*b));
            break;
            case 4:
            System.out.print("Enter 1st number : ");
            a=sc.nextInt();
            System.out.print("Enter 2nd number : ");
            b=sc.nextInt();
            System.out.println("The quotient is : "+(a/b));
            break;
            default:
            System.out.println("ERROR! INVALID ENTRY");
        }
    }
}