import java.util.Scanner;
class Multiplication
{
    int a, b;
    // Constructor
    Multiplication(int x, int y)
    {
        a = x;
        b = y;
    }
    void multiply()
    {
        int result = a * b;
        System.out.println("Multiplication = " + result);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        Multiplication obj = new Multiplication(x, y);
        obj.multiply();
    }
}