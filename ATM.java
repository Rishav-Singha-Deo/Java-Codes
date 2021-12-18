import java.util.*;
class ATM
{
    Scanner sc=new Scanner(System.in);
    int bal=200000;
    void Withdraw()
    {
        System.out.print("1. Savings Account\n2. Current Account\n");
        int ch=sc.nextInt();
        System.out.print("Enter amount in Rupees : ");
        int amt=sc.nextInt();
        if(amt<=(bal-1000))
        {
            bal=bal-amt;
            System.out.print("Please collect your cash");
        }
        else
            System.out.print("Invalid amount");
    }

    void Deposit()
    {
        System.out.print("1. Savings Account\n2. Current Account\n");
        int ch=sc.nextInt();
        System.out.print("Enter the cash in the slot : ");
        int amt=sc.nextInt();
        if(amt<=49000)
        {
            bal=bal+amt;
            System.out.print("Cash deposit successful");
        }
        else
            System.out.print("Not enough Balance");
    }

    void Balance()
    {
        System.out.print("1. Savings Account\n2. Current Account\n");
        int ch=sc.nextInt();
        System.out.print("Your current balance is : "+bal);
    }
}