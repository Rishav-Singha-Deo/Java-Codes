import java.util.*;
class Happy
{
    int n; //variable declaration
    Happy()//constructor of the class
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
        int a=0,num=0;
        a=sum_square_digits(n);
        while(a>9)//if it is not single digit
        {
            num=sum_square_digits(a);
            a=num;
        }
        if(num==1)//check if final sum is one
            System.out.println("Happy Number");
        else 
            System.out.println("Not a Happy number");
    }

    public void main()
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n=ab.nextInt();
        Happy obj=new Happy();
        obj.getnum(n);
        obj.isHappy();
    }
}
/*OUTPUT
 * Enter the number to  be checked:
 * 28
 * Happy
 */