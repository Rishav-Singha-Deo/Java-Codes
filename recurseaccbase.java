/*
Decimal to binary,octal and Hexadecimal coversion

 *Arya Majumder
 *Class XII B 
 *Roll no- 17
 */
import java.util.*;//package declared
class recurseaccbase//class declared
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of base 10");
        int n=sc.nextInt();
        System.out.println("Enter your choice 1 for binary , 2 for octal and 3 for hexadecimal conversion");
        int ch=sc.nextInt();
        recurseaccbase ob=new recurseaccbase();
        switch(ch)
        {
            case 1: ob.converse(n,2);
            break;
            case 2: ob.converse(n,8);
            break;
            case 3: ob.converse(n,16);
            break;
        }
    }

    void converse(int n,int b)
    {
        if(n>0)
        {
            int d=n%b;
            converse(n/b,b);
            if(d==10)
            {
                System.out.print("A");
            }
            else if(d==11)
            {
                System.out.print("B");
            }
            else if(d==12)
            {
                System.out.print("C");
            }
            else if(d==13)
            {
                System.out.print("D");
            }
            else if(d==14)
            {
                System.out.print("E");
            }
            else if(d==15)
            {
                System.out.print("F");
            }
            else
            {
                System.out.print(d);
            }
        }
    }
}
/*OUTPUT
 * Enter the number of base 10
100
Enter your choice 1 for binary , 2 for octal and 3 for hexadecimal conversion
1
1100100

Enter the number of base 10
100
Enter your choice 1 for binary , 2 for octal and 3 for hexadecimal conversion
2
144

Enter the number of base 10
100
Enter your choice 1 for binary , 2 for octal and 3 for hexadecimal conversion
3
64*/