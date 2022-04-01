class Armstrong
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int num = n;
        int temp = 0;

        while(n > 0)
        {
            int d = n % 10;
            temp = temp + (int) Math.pow(d, 3);
            n = n / 10;
        }

        if(temp == num)
        {
            System.out.println(num + " is an Armstrong Number.");
        }
        else
        {
            System.out.println(num + " is not an Armstrong Number.");
        }
    }
}
