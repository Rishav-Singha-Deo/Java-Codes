import java.util.*;
public class reverse_3_digit
    {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            int d,a,b,c,rev;
            System.out.println("Enter a 3-digit number");
            d=sc.nextInt();
            a=d%10;
            b=d/10;
            b=b%10;
            c=d/100;
            rev=(a*100)+(b*10)+c;
            System.out.println(rev);
        }
    }