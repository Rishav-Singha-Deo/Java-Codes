import java.util.*;
class Deque//declared class
{
    int Dq[],front,rear,size;//instance variables declared
    Deque(int nn)//parameterized constructor
    {
        size=nn;
        front=0;
        rear=0;
        Dq=new int[size];
    }

    void addrear(int ele)//method for insertion of an element
    {
        if(rear>=size-1)
            System.out.println("Full from rear");
        else
        {
            rear++;
            Dq[rear]=ele;
        }
    }

    void addfront(int ele)
    {
        if(front<0)
            System.out.println("Full from front");
        else
        {
            Dq[front]=ele;
            front--;
        }
    }

    int delfront()//method for deletion of an element
    {
        if(front==rear)
            return -9999;
        else
            return front++;
    }

    int delrear()
    {
        if(rear==front)
            return -9999;
        else
            return rear--;
    }

    void display()//method for displaying the array
    {
        if(front==rear)
            System.out.println("EMPTY");
        else
        {
            for(int i=front+1;i<=rear;i++)
            {
                System.out.print(Dq[i]+"-->");
            }
            System.out.println();
        }
    }

    public static void main()//main method
    {
        Scanner sc=new Scanner(System.in);
        Deque dq=new Deque(10);
        int ch;
        do
        {
            System.out.println("1.INSERT FROM REAR");
            System.out.println("2.INSERT FROM FRONT");
            System.out.println("3.DELETE FROM FRONT");
            System.out.println("4.DELETE FROM REAR");
            System.out.println("5.DISPLAY");
            System.out.println("6.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter element");
                int x=sc.nextInt();
                dq.addrear(x);
                break;
                case 2:
                System.out.println("Enter element");
                int y=sc.nextInt();
                dq.addfront(y);
                break;
                case 3:
                dq.delfront();
                break;
                case 4:
                dq.delrear();
                break;
                case 5:
                dq.display();
                break;
            }
        }
        while(ch>=1&&ch<=5);
    }
}