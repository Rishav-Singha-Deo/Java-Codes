import java.util.*;
class WordPile
{
    char ch[];
    int capacity,top;
    WordPile(int cap)
    {
        capacity=cap;
        top=-1;
        ch=new char[20];
    }

    void pushChar(char v)
    {
        if(top==19)
            System.out.println("WordPile is full");
        else if(top==0)
            ch[top++]=v;    
        else
            ch[++top]=v;
    }

    char popChar()
    {
        if(top==-1)
        {    
            System.out.println("Stack Underflow");
            return ch[++top];
        }
        else
        {
            System.out.println("Deleted character "+ch[top]);
            return ch[--top];
        }
    }

    void display()
    {
        if(top==-1)
            System.out.println("EMPTY");
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print("-->"+ch[i]);
            }
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        WordPile wp=new WordPile(20);
        int c;
        do
        {
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.println("Enter only one character");
                char x=sc.next().charAt(0);
                wp.pushChar(x);
                break;
                case 2:
                wp.popChar();
                break;
                case 3:
                wp.display();
                break;
            }
        }
        while(c>=1&&c<=3);
    }
}
/*OUTPUT
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter only one character
a
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter only one character
b
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
1
Enter only one character
c
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
3
-->a-->b-->c
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
2
Deleted character c
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
3
-->a-->b
1.INSERT
2.DELETE
3.DISPLAY
4.EXIT
ENTER YOUR CHOICE
4
 */