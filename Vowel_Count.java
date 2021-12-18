import java.util.*;
class Vowel_Count
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word : ");
        String s=sc.nextLine();
        int l=s.length();
        int c=0;
        s=s.toLowerCase();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        System.out.println("Number of vowels is "+c);
    }
}