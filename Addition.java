import java.util.*;
class Constructor
{
    private int x,y;
    public Constructor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = sc.nextInt();
        System.out.print("Enter second number: ");
        y = sc.nextInt();
    }
    public void add()
    {
        int ans=x+y;
        System.out.print("Addition is " +ans);
    }
}
public class Addition
{
    public static void main(String args[])
    {
        Constructor obj = new Constructor();
        obj.add();
    }
}