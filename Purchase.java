//Starting of subclass
import java.util.*;
class Purchase extends Stock
{
    int pqty,prate;
    Purchase(String ite,int qty,int r,int pq,int pr)//parameterised constructor
    {
        super(ite,qty,r);
        pqty=pq;
        prate=pr;
    }
    
    void update()
    {
        qty=qty+pqty;
        
        if(rate!=0)
        {
            rate=prate;
        }
        amt=rate*qty;
    }
    
    void display()
    {
        System.out.println("Previous dtails:");
        super.display();
        update();
        System.out.println("New details:");
        super.display();
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Item name");
        String it=sc.nextLine();
        System.out.println("Quantity of item");
        int qt=sc.nextInt();
        System.out.println("unit price of item");
        int ra=sc.nextInt();
        System.out.println("Previous Quantity");
        int pqt=sc.nextInt();
        System.out.println("Previous Rate");
        int pra=sc.nextInt();
        
        Purchase ob=new Purchase(it,qt,ra,pqt,pra);
        ob.display();
    }
}
/*INPUT:
 * Item name
c
Quantity of item
100
unit price of item
60
Previous Quantity
69
Previous Rate
80

OUTPUT:
Previous dtails:
The Stock details:
Item name:c
Quantity of item:100
unit price of item:60
Net value of item:6000
New details:
The Stock details:
Item name:c
Quantity of item:169
unit price of item:80
Net value of item:13520
*/
