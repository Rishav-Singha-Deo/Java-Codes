import java.io.*;
class Mixer
{
    int arr[],n;
    public Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }

    void accept()throws IOException
    {
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a no.");
            arr[i]=Integer.parseInt(br.readLine());
        }
    }

    Mixer mix(Mixer A)
    {
        int i,j,t;
        Mixer M=new Mixer(n+A.n);
        for(i=0;i<n;i++)
        {
            M.arr[i]=arr[i];
        }
        for(i=0,j=n;i<A.n;i++,j++)
        {
            M.arr[j]=A.arr[i];
        }
        for(i=0;i<M.n;i++)
        {
            for(j=i+1;j<M.n;j++)
            {
                if(M.arr[i]>M.arr[j])
                {
                    t=M.arr[i];
                    M.arr[i]=M.arr[j];
                    M.arr[j]=t;
                }
            }
        }
        return(M);
    }

    void display()
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[])throws IOException
    {
        Mixer X=new Mixer(5);
        Mixer Y=new Mixer(4);
        Mixer Z=new Mixer(9);
        X.accept();
        Y.accept();
        Z=X.mix(Y);
        Z.display();
    }
}