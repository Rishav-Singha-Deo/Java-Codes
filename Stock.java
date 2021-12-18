/*NAME : Rishav Singha Deo
 * CLASS : XII     SEC : B
 * ROLL NO. : 6
 */ 
//Super Class
import java.util.*;
class Stock
{
    String item;
    int qty,rate,amt;

    Stock(String ite,int qt,int r)
    {
        item=ite;
        qty=qt;
        rate=r;
        amt=qty*rate;
    }

    void display()
    {
        System.out.println("The Stock details:");
        System.out.println("Item name:"+item);
        System.out.println("Quantity of item:"+qty);
        System.out.println("unit price of item:"+rate);
        System.out.println("Net value of item:"+amt);
    }
}