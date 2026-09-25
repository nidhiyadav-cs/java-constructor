import java.util.*;
class Circle
{
    private int r;
    public Circle(int a)
    {
        r=a;
    }
    public void areaCircle()
    {
        float area=3.14f*r*r;
        System.out.println("Area of circle is " +area);
    }
    public void circumCircle()
    {
        float circum=2*3.14f*r;
        System.out.println("Circumference is " +circum);
    }
}
public class Constructor1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        int n=sc.nextInt();
        Circle obj=new Circle(n);
        obj.areaCircle();
        obj.circumCircle();
    }
}