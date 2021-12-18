/* Name : RISHAV SINGHA DEO
 * Class : XII(A)
 */
import java.util.*;
class Stack//declared class
{
    int S[],top;//instance variables declared
    Stack()//declared constructor
    {
        S=new int[10];
        top=-1;
    }

    void push(int ele)
    {
        if(top==9)
            System.out.println("STACK IS FULL");
        else
            S[++top]=ele;
    }

    void pop()
    {
        if(top==-1)
            System.out.println("STACK IS EMPTY");
        else
            System.out.println("Deleted element "+S[--top]);
    }

    void disp()
    {
        if(top==-1)
            System.out.println("STACK IS EMPTY");
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(S[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        int ch;
        do
        {
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter element");
                int x=sc.nextInt();
                st.push(x);
                break;
                case 2:
                st.pop();
                break;
                case 3:
                st.disp();
                break;
            }
        }
        while(ch>=1&&ch<=3);
    }
}