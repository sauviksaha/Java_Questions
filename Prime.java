class Prime 
{

    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);

        boolean prime = true;
        for(int i = 2; i < n / 2; i++)
        {
            if(n % i == 0)
            {
                prime = false;
            }
        }

        if(prime == true)
        {
            System.out.println(n + " is a Prime Number.");
        }
        else
        {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
