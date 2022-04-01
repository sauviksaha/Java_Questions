class Palindrome
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int num = n;
        int temp = 0;

        while(n > 0)
        {
            int d = n % 10;
            temp = temp * 10 + d;
            n = n / 10;
        }

        if(temp == num)
        {
            System.out.println(num + " is a Palindrome Number.");
        }
        else
        {
            System.out.println(num + " is not a Palindrome Number.");
        }
    }
}
