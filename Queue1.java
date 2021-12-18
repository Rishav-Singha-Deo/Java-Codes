import java.util.*;
class Queue1
{
    int Que[],size,front,rear;
    Queue1(int mm)
    {
        size=mm;
        front=-1;
        rear=-1;
        Que=new int[size];
    }


    void addele(int ele)
    {
        if(rear==size-1)
            System.out.println("OVERFLOW");
        else
        {
            Que[++rear]=ele;
        }
    }


    void delele()
    {
        if(front==-1)
            System.out.println("UNDERFLOW");
        else
        {
            System.out.println("Deleted element "+Que[front]);
            rear--;
        }
    }


    void display()
    {
        if(rear==-1)
            System.out.println("STACK EMPTY");
        else
        {
            System.out.println("Array is :");
            for(int i=front;i<=rear;i++)
            {
                System.out.println(Que[i]);
            }
        }
    }


    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue(10);
        int ch;
        do
        {
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("Enter choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter element");
                int x=sc.nextInt();
                q.addele(x);
                break;
                case 2:
                q.delele();
                break;
                case 3:
                q.display();
                break;
            }
        }
        while(ch>=1&&ch<=3);
    }
}