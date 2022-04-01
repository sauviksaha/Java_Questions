class Max
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        int max;

        if(a > b && a > c && a > d)
            max = a;
        else if(b > a && b > c && b > d) 
            max = b;
        else if(c > a && c > b && c > d) 
            max = c;
        else
            max = c;

        System.out.println("Maximum No. = " + max);
    }
}
