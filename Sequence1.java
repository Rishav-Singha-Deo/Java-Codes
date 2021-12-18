import java.util.*;
class Sequence1
{
    public static void main(String args[])
    {
        for(int i=100;i>0;i-=3)
        {
            System.out.print(i+" ");
            if((i+1)%8==0)
                System.out.println();
        }
    }
}