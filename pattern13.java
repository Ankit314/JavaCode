public class pattern13
{
    public static void main(String[] args)
    {
        int n=5;
        int x;
        int y;
        for (int i=1;i<=n;i++)
        {
            x=i;
            y=n-i+1;
            for (int j=1;j<=n;j++)
            {
                if (j % 2 == 1)
                {
                    System.out.print(" " + x);
                }
                else
                {
                    System.out.print(" " + y);
                }
                x = n + x;
                y = y + n;
            }
            System.out.println();

        }

    }
}
