import java.util.*;
class Happy1
{
    int n; //variable declaration
    Happy1()//constructor of the class
    {
        n=0;
    }

    void getnum(int nn)
    {
        n=nn;//initialization
    }

    int sum_square_digits(int x)//recursive function
    { 
        if(x>=0&&x<=9)//check if it is a single digit
            return x*x;//base case
        else 
            return(sum_square_digits(x%10)+sum_square_digits(x/10));
    }

    void isHappy()
    {
        int a,num;
        for(int i=0;i<50;i++)
        {
            a=0;num=0;
            a=sum_square_digits(i);
            while(a>9)//if it is not single digit
            {
                num=sum_square_digits(a);
                a=num;
            }
            if(num==1)//check if final sum is one
                System.out.println(i);
        }
    }

    public void main()
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n=ab.nextInt();
        Happy1 obj=new Happy1();
        obj.getnum(n);
        obj.isHappy();
    }
}