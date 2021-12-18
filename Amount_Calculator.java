import java.util.*;
class Amount_Calculator
    {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            double P,R,T,A;
            System.out.println("AMOUNT CALCULATOR");
            System.out.println("Enter the Principle");
            P=sc.nextDouble();
            System.out.println("Enter the Rate @ per annum");
            R=sc.nextDouble();
            System.out.println("Enter the time in years");
            T=sc.nextDouble();
            A=P+((P*R*T)/100);
            System.out.println("The amount is "+A);
        }
    }