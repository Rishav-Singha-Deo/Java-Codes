import java.util.*;
import java.lang.*;
import java.io.*;

class first     //super class
{
    public void disp_first_name()
    {
        System.out.println("Rishav");
    }
}

class second extends first      //sub class
{
    public void disp_last_name()
    {
        System.out.println("Singha Deo");
    }
}

public class main       //main method
{
    public static void main(String[] args)
    {
        second obj=new second();
        obj.disp_first_name(); 
        obj.disp_last_name();  
    } 
}