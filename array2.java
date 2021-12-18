import java.io.DataInputStream;
class array2
{public static void main(String args [])
    {DataInputStream in=new DataInputStream(System.in);
        final int size=100;
        int i,count=0;
        float Sal[]=new float[size];
        float an_sal;
        try
        {for(i=0;i<size;i++)
            {System.out.println("Monthly salary for employee "+(i+1)+" : ");
                Sal[i]=Float.valueOf(in.readLine()).floatValue();
            }
        }
        catch(Exception e){}
        for(i=0;i<size;i++)
        {an_sal=Sal[i]*12;
            if(an_sal>100000)
                count++;
        }
        System.out.println(count+" employees out of "+size+" employees are earning more than Rs.10 Lakh per annum");
    }
}