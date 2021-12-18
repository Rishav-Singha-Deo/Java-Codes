import java.util.*;
class Account
{
    int accNo;
    double principal;
    Account(int acno,double pr)//Default constructor
    {
        accNo=acno;
        principal=pr;
    }

    void display()
    {
        System.out.println("Account number : "+accNo+"\nPrincipal : "+principal);
    }
}