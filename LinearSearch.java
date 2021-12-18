import java.util.*;
class LinearSearch
{
    public static void main()
    {
        int a[]={1,2,3,4,5,6,7,8,9,0};
        int key=7;
        int found=0;
        int i=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                found=1;
                break;
            }
        }
        if(found==1)
            System.out.println("Index "+i);
        else
            System.out.println("Not here");
    }
}