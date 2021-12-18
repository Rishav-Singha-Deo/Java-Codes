import java.io.DataInputStream;
class Salesman
{public static void main(String args[])
    {DataInputStream in=new DataInputStream(System.in);
        int sales[][]=new int[2][4];
        int i,j,total;
        try
        {for(i=0;i<5;i++)
            {total=0;
                System.out.println("Enter sales of salesman "+(i+1));
                for(j=0;j<12;j++)
                {System.out.print("Month "+(j+1)+": ");
                    sales[i][j]=Integer.parseInt(in.readLine());
                    total+=sales[i][j];
                }
                System.out.println("Total salesof salesman "+(i+1)+"="+total);
            }
        }
        catch(Exception e){}
    }
}