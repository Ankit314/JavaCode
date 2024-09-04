class name {
    private
    int n=5;
    int x=n;
    public
    void pattern()
    {
        for (int i=1;i<=n;i++){
            for (int j=1;j<2*n;j++){
                if (j==x || j==n+i-1){
                    System.out.print("*");
                } else if ((j>=x)!=false && j<=n+i-1 && i==n/2+1) {
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            x--;

        }
    }
    void patternN()
    {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1 || j==n || i==j){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    void patternK()
    {
        int x=n/2+1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n/2+1;j++)
            {
                if (j==1 || j==x)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if (i<=n/2){
                x--;
            }
            else
            {
                x++;
            }
            System.out.println();


        }
    }
    void patternI()
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==n/2+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void patternT(){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || j==n/2+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        name obj=new name();
        obj.pattern();
        obj.patternN();
        obj.patternK();
        obj.patternI();
        obj.patternT();
    }

}

