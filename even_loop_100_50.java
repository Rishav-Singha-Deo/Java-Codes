import java.util.*;
public class even_loop_100_50
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("These are even numbers from 100 to 50 backwards");
        for (int i=100;i>=50;i-=2)
        {
            System.out.println(i);
        }
    }
}