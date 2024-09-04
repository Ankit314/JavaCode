import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Exception4 {
    public static void main(String[] args) {
        try {

            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30};
            System.out.println(arr[0]);

            String str=null;
            System.out.println(str.toUpperCase());

        }
        catch (ArrayIndexOutOfBoundsException d){

            System.out.println("Array Exception");

        }
        catch (ArithmeticException c){

            System.out.println("Arithmetic Exception");

        }
        catch (NumberFormatException b){

            System.out.println("Number format Exception");

        }
        catch (Exception a){
            System.out.println("All exception Handel");
        }
    }
}
