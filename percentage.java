import java.util.*;
class percentage
    {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            float a,b,c,d,e,f;
            System.out.println("Here you'll get the percentage of a student in 5 subjects of 100 marks");
            System.out.println("English");
            a=sc.nextFloat();
            System.out.println("Physics");
            b=sc.nextFloat();
            System.out.println("Chemistry");
            c=sc.nextFloat();
            System.out.println("Computer");
            d=sc.nextFloat();
            System.out.println("Maths");
            e=sc.nextFloat();
            f=((a+b+c+d+e)/500)*100;
            System.out.println("The percentage is"+f);
        }
    }