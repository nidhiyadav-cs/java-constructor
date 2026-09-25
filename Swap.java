import java.util.Scanner;
class Number
{
    private int a,b;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void swap()
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A is " +a+" B is " +b);
    }
}
public class Swap
{
    public static void main(String args[])
    {
        Number obj=new Number();
        obj.getdata();
        obj.swap();
    }
}