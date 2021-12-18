import java.util.*;
class Cel_Far_Kel
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float A,B,C;
        System.out.print("Press");
        System.out.println("1 for celcius to farenheit");
        System.out.println("2 for farenheit to celcius");
        System.out.println("3 for celcius to kelvin,");
        System.out.println("4 for farenheit to kelvin");
        System.out.println("5 for kelvin to celcius");
        System.out.println("6 for kelvin to farenheit");
        c=sc.nextInt();
        if(c==1)
        {
            System.out.println("Enter temperature in celcius");
            A=sc.nextFloat();
            B=((9*A)+160)/5;
            System.out.println("The temperature in farenheit is "+B);
        }
        else if(c==2)
        {
            System.out.println("Enter temperature in farenheit");
            A=sc.nextFloat();
            B=(5*A+160)/9;
            System.out.println("The temperature in celcius is "+B);
        }
        else if(c==3)
        {
            System.out.println("Enter temperature in celcius");
            A=sc.nextFloat();
            B=A+273;
            System.out.println("The temperature in kelvin is "+B);
        }
        else if(c==4)
        {
            System.out.println("Enter temperature in farenheit");
            A=sc.nextFloat();
            C=(5*A+160)/9;
            B=C+273;
            System.out.println("The temperature in kelvin is "+B);
        }
        else if(c==5)
        {
            System.out.println("Enter temperature in kelvin");
            A=sc.nextFloat();
            B=273-A;
            System.out.println("The temperature in celcius is "+B);
        }
        else
        {
            System.out.println("Enter temperature in kelvin");
            A=sc.nextFloat();
            C=273-A;
            B=((9*A)+160)/5;
            System.out.println("The temperature in farenheit id "+B);
        }
    }
}