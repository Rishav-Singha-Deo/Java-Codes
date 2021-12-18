import java.util.*;
class Pallin_Sentence
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter a sentence : ");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        int count=st.countTokens();
        String a[]=new String [count];
        for(i=0;i<count;i++)
        {
            a[i]=st.nextToken();
        }
        String str="";
        for(i=0;i<count;i++)
        {
            str=str+a[i].charAt(0);
        }
        if(pallin(str)==true)
        System.out.println("The new word is "+str+" and it is a pallindrome word.");
        else
        System.out.println("The new word is "+str+" and it is not a pallindrome word.");
    }

    boolean pallin(String s)
    {
        String r="";
        int l=s.length();
        for(int i=(l-1);i>=0;i--)
        {
            char ch=s.charAt(i);
            r=r+ch;
        }
        if(r.equalsIgnoreCase(s))
            return true;
        else
            return false;
    }
}