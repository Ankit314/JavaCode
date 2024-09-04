public class Exception3 {
    public static void main(String[] args) {

        try {
            int a=10,b=2,c;

            c=a/b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

        try {

            int d[]={10,20,30,40};
            System.out.println(d[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
