import java.util.Scanner;
class Sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        sc.close();
        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        while(n > 0)
        {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.println("Sum of the digits of " + num + " = " + sum);
    }
}
