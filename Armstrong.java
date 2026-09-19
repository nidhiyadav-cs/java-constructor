import java.util.Scanner;
class Main
{
    int n;
    // Constructor
    Main(int x)
    {
        n = x;
    }
    void check()
    {
        int temp = n;
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Main obj = new Main(num);
        obj.check();
    }
}
