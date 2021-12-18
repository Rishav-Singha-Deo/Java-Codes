/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Queue//declared class
{
    int Que[],front,rear,size;//instance variables declared
    Queue(int nn)//parameterized constructor
    {
        size=nn;
        front=-1;
        rear=-1;
        Que=new int[size];
    }

    void addele(int ele)//method for insertion of an element
    {
        if(rear==size-1)
            System.out.println("OVERFLOW");
        else if(rear==-1)
        {
            front=rear=0;
            Que[rear]=ele;
        }
        else
            Que[++rear]=ele;
    }

    void delele()//method for deletion of an element
    {
        if(front==-1)
        {
            System.out.println("UNDERFLOW");
            front=rear=-1;
        }
        else
        {
            System.out.println("Deleted element "+Que[front]);
            front++;
        }
    }

    void display()//method for displaying the array
    {
        if(front>rear)
            System.out.println("EMPTY");
        else if(rear==-1)
            System.out.println("EMPTY");
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(Que[i]+"-->");
            }
            System.out.println();
        }
    }

    public static void main()//main method
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
            System.out.println("ENTER YOUR CHOICE");
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
}//class closed
/*OUTPUT
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter element
1
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter element
2
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter element
3
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter element
4
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
3
1-->2-->3-->4-->
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
2
Deleted element 1
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
3
2-->3-->4-->
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
4
 */