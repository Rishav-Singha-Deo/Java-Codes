/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Cqueue//declared class
{
    int Cq[],front,rear,size;//instance variables declared
    Cqueue(int nn)//parameterized constructor
    {
        size=nn;
        front=rear=-1;
        Cq=new int[999999999];
    }

    void insert(int ele)//method for insertion of an element
    {
        if(rear==size-1)
        {    
            rear=size;
            front++;
            Cq[rear]=ele;
        }
        else if(rear==-1)
        {
            front=rear=0;
            Cq[rear]=ele;
        }
        else if(front>0)
        {
            ++front;
            Cq[++rear]=ele;
        }
        else
            Cq[++rear]=ele;
    }

    void delete()//method for deletion of an element
    {
        if(front==-1)
            System.out.println("UNDERFLOW");
        else
            System.out.println("Deleted element "+Cq[rear--]);
    }

    void display()//method for displaying the array
    {
        if(rear==-1)
            System.out.println("EMPTY");
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(Cq[i]+"-->");
            }
            System.out.println();
        }
    }

    public static void main()//main method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the circular queue");
        int a=sc.nextInt();
        Cqueue cq=new Cqueue(a);
        int ch;
        do
        {
            System.out.println("1.INSERT");//menu printed
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            ch=sc.nextInt();//choice taken from the user
            switch(ch)
            {
                case 1:
                System.out.println("Enter element");
                int x=sc.nextInt();
                cq.insert(x);
                break;
                case 2:
                cq.delete();
                break;
                case 3:
                cq.display();
                break;
            }
        }
        while(ch>=1&&ch<=3);
    }
}//close of class