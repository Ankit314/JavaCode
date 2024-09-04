public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        int x;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                x=(2*(i+j))-3;
                System.out.print(" "+x);
            }
            System.out.println();
        }
    }
}
