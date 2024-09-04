import java.io.FileReader;

public class file {

    public static void main(String[] args) {
        try {

            FileReader l=new FileReader("C:\\Users\\Ankit\\Desktop\\LC.txt");

            try {

                int i;
                while ((i=l.read())!=-1)
                {

                    System.out.println((char) i);

                }

            }
            finally {
                l.close();



            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
