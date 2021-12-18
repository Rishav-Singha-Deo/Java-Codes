import java.io.*;
class ConsChange
{
    String word;
    int len;
    public ConsChange()
    {
        word="rishav_s_deo";
        len=10;
    }

    void readword()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a word in lower case : ");
        word=br.readLine();
        len=word.length();
    }

    void shiftcons()
    {
        String v="",c="";
        int i;
        char ch;
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                v=v+ch;
            else
                c=c+ch;
            word=c+v;
        }
        System.out.println(word);
    }

    void changeword()
    {
        int i;
        char ch;
        String s="";
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
                ch=(char)(ch-32);
            s=s+ch;
            word=s;
        }
        System.out.println(word);
    }

    void show()
    {
        System.out.println(word);
        shiftcons();
        changeword();
    }

    void main()throws IOException
    {
        ConsChange obj=new ConsChange();
        obj.readword();
        obj.show();
    }
}