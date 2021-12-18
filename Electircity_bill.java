import java.util.*;
public class Electircity_bill
    {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            double A,B;
            System.out.println("ELECTRICITY BILL CALCULATOR");
            System.out.println("Enter the amount of units consumed");
            A=sc.nextDouble();
            if (A<=100)
            {
                B=(A*0.5)+250;
                System.out.println("The bill of the consumer is Rs."+B);
            }
            else if(A>100 && A<=250)
            {
                B=(100*0.5)+(A-100)*1.6+250;
                System.out.println("The bill for the consumer is Rs."+B);
            }
            else if(A>250 && A<=350)
            {
                B=(100*0.5)+(250*1.6)+(A-350)*2.3+250;
                System.out.println("The bill for the consumer is Rs."+B);
            }
            else
            {
                B=(100*0.5)+(250*1.6)+(350*2.3)+(A-700)*4+250;
                System.out.println("The bill for the consumer is Rs."+B);
            }
        }
    }