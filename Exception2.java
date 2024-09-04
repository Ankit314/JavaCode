public class Exception2 {

    public static void main(String[] args) {
        String str="1234";
        try {

            int a=Integer.parseInt(str);
            System.out.println(a);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Method Ended");

    }
}
