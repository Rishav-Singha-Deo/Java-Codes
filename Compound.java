import java.util.*;
class Compound extends Account
{
    double rate,time;
    Compound(double rate,double time,int accNo,double principal)//Default constructor
    {
        super(accNo,principal);
        this.rate=rate;
        this.time=time;
    }

    double calculate()
    {
        return (principal*rate*time)/100.00;
    }

    void display()
    {
        super.display();
        calculate();
    }
}