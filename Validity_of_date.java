/*Name:Rishav Singha Deo
  Class:XI  Sec:B(MOR)  Roll No.:5*/
//This program is made to check if the given date exists or not
//VALIDITY OF A DATE
import java.util.*;
public class Validity_of_date                                                   //name of the class given
{
    public static void main(String [] args)
    {
        int d,m,y;                                                              //variables taken
        Scanner sc=new Scanner(System.in);                                      //scanner class used
        System.out.println("ENTER THE DAY OF THE DATE");
        d=sc.nextInt();                                                         //variable for date
        System.out.println("ENTER THE MONTH OF THE DATE");
        m=sc.nextInt();                                                         //variable for month
        System.out.println("ENTER THE YEAR OF THE DATE");
        y=sc.nextInt();                                                         //variable for year
        int ycheck=y%4;
        if(ycheck==0)                                                           //checking for a leap year
        {
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)          //checking for months of 31 days
            {
                if(d<=31)                                                       //condition for 31 days given
                System.out.println("VALID DATE");
                else
                System.out.println("INVALID DATE");
            }
            else if(m==4 || m==6 || m==9 || m==11)                              //checking for months of 30 days
            {
                if(d<=30)                                                       //condition for 30 days given
                System.out.println("VALID DATE");
                else
                System.out.println("INVALID DATE");
            }
            else
            {
                if(d<=28)                                                       //for fubruary
                System.out.println("VALID DATE");
                else
                System.out.println("INVALID DATE");
            }
        }
        else if(ycheck!=0)                                                      //checking for not leap year
        {
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)          //checking for months of 31 days
            {
                if(d<=31)                                                       //condition for 31 days
                System.out.println("VALID DATE");
                else
                System.out.println("INVALID DATE");
            }
            else if(m==4 || m==6 || m==9 || m==11)                              //checking for months of 30 days
            {
                if(d<=30)                                                       //condition for 30 days
                System.out.println("VALID DATE");
                else
                System.out.println("INVALID DATE");
            }
            else
            {
                if(d<=28)                                                       //for february
                System.out.println("VALID DATE");
                else
                System.out.println("INVALID DATE");
            }
        }
        else                                                                    //for any mistake in input
                System.out.println("INVALID ENTRY");
    }
}