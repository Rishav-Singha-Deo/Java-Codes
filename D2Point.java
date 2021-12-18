/* NAME : RISHAV SINGHA DEO
 * CLASS : XII(A)
 */
import java.util.*;
class D2Point//Base class
{
    double x,y;
    D2Point()//Default constructor
    {
        x=0.0;
        y=0.0;
    }
    D2Point(double nx,double ny)//Parameterized constructor
    {
        x=nx;
        y=ny;
    }
    double distance2D(D2Point b)
    {
        double m=Math.sqrt(((b.x-x)*(b.x-x))+((b.y-y)*(b.y-y)));
        return m;
    }
}