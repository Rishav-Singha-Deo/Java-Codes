import java.io.*;
class Merger
{
    long n1,n2,mergeNum;
    Merger()
    {
        n1=0;
        n2=0;
        mergeNum=0;
    }
    
    void readNum()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two no.s");
        n1=Long.parseLong(br.readLine());
        n2=Long.parseLong(br.readLine());
    }
    
    void joinNum()
    {
        int p=1;
        long t=n2;
        while(t>0)
        {
            p=p*10;
            t=t/10;
        }
        mergeNum=n1*p+n2;
    }
    
    void show()
    {
        System.out.println("Merged no. is "+mergeNum);
    }
    
    void main()throws IOException
    {
        Merger obj=new Merger();
        obj.readNum();
        obj.joinNum();
        obj.show();
    }
}