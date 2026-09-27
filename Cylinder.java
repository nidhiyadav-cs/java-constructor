import java.util.*;
class Shape
{
    private int r,h;
    public Shape(int x,int y)
    {
        r=x;
        h=y;
    }
    public void volCylinder()
    {
        float volume=3.14f*r*r*h;
        System.out.print("Volume of cylinder is " +volume);
    }
}
    public class Cylinder
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter radius: ");
            int x=sc.nextInt();
            System.out.print("Enter height: ");
            int y=sc.nextInt();
            Shape obj=new Shape(x,y);
            obj.volCylinder();
        
        
        }

    }
