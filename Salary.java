import java.util.*;
class Salary extends Pay
{
    double da,hra,gross;
    void Calculate()
    {
        da=0.20*basic;
        hra=0.20*basic;
        gross=da+hra+basic;
    }

    void display()
    {
        System.out.print("    D.A. : "+da+"    H.R.A. : "+"Gross : "+gross);
    }

    void test()
    {
        getData();
        Calculate();
        super.display();
        display();
    }
}