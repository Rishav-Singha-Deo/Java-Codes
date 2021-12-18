/*Name: RISHAV SINGHA DEO
 * Class: XII
 * Sec: B
 * ROLL NO. : 6
 */
import java.util.*;
class ConstantChange
{
    String word;
    int len;
    String shiftedword;
    String chword;
    
    ConstantChange()//constructor
    {
        word="";
        len=0;
    }
    
    void readword()//method for taking word input
    {
       Scanner sc=new Scanner(System.in);//scanner class
       System.out.println("Enter a String");
       word=sc.nextLine();
       word=word.toLowerCase();//change word to lower case
       len=word.length();//word length
    }
    
    void shiftCons()
    {
        String s1,s2;
        s1="";
        s2="";
        char ch;
        for(int i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                s2=s2+ch;
            }
            
            else
            {
                s1=s1+ch;
            }
            
            shiftedword=s1+s2;
        }
    }
    
    void changeword()//method for changing the word to upper case
    {
        char ch;
        String s="";
        for(int i=0;i<len;i++)
        {
            ch=shiftedword.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            
               s=s+Character.toUpperCase(ch);
               
            else
               s=s+ch;
            }
           chword=s;
        }
        
    void show()//Display method
    {
        System.out.println("original word: "+word);
        System.out.println("Shifted word: "+shiftedword);
        System.out.println("Changed word: "+chword);
    }
    
    public static void main()//main method
    {
        ConstantChange c=new ConstantChange();//object declaration
        
        c.readword();
        c.shiftCons();
        c.changeword();
        c.show();
    }//end of main
}//end of class

/*OUTPUT
 * Enter a String
interesting
original word: interesting
Shifted word: ntrstngieei
Changed word: NTRSTNGieei
*/