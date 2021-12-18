class TheString
{
    String str;
    int len,wordcount,cons;
    public TheString()
    {
        str="RishavSinghaDeo";
    }

    public TheString(String ds)
    {
        str=ds;
    }

    void countFreq()
    {
        int i;
        char ch;
        len=str.length();
        wordcount=1;
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
                wordcount++;
            else if(ch>=65&&ch<=90||ch>=97&&ch<=122)
            {
                ch=Character.toLowerCase(ch);
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
                    cons++;
            }
        }
    }

    void Display()
    {
        System.out.println("Original String : "+str);
        System.out.println("Total Consonants : "+cons);
    }

    void main()
    {
        TheString obj=new TheString("Destination Point Computers Jhansi");
        obj.countFreq();
        obj.Display();
    }
}