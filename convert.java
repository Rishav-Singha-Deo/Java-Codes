import java.util.*;
class convert
{
    int n;
    public convert()
    {
        n=0;
    }


    void input_num()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        n=sc.nextInt();
        int rev=0,copy=n;
        while(copy>0)
        {
            rev=rev*10+copy%10;
            copy=copy/10;
        }
        extdigit(rev);
    }


    void extdigit(int num)
    {
        int y=num%10;
        num_to_word(y);
        extdigit(n/10);
    }


    void num_to_word(int dig)
    {
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print(a[dig]);
    }


    public static void main()
    {
        convert obj=new convert();
        obj.input_num();
    }
}