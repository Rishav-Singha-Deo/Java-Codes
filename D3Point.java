/* NAME : RISHAV SINGHA DEO
 * CLASS : XII(A)
 */
import java.util.*;
class D3Point extends D2Point//Sub class
{
    double z;
    D3Point()//Default constructor
    {
        z=0.0;
    }

    D3Point(double nx,double ny,double nz)//Parameterized constructor
    {
        super(nx,ny);
        z=nz;
    }

    double distance3D(D3Point b)
    {
        double n=Math.sqrt((b.x-x)*(b.x-x)+(b.y-y)*(b.y-y)+(b.z-z)*(b.z-z));
        return n;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the coordinates of the first point : ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int z1=sc.nextInt();
        System.out.print("\nEnter the coordinates of the second point : ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int z2=sc.nextInt();
        D3Point o1=new D3Point(x1,y1,z1);//First object created
        D3Point o2=new D3Point(x2,y2,z2);//Second object created
        double dist=o1.distance3D(o2);
        System.out.println("The required distance is "+dist);
    }
}
/*OUTPUT
Enter the coordinates of the first point : 5
4
3

Enter the coordinates of the second point : 7
8
9
The required distance is 7.483314773547883
*/
