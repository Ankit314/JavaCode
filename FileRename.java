import java.io.File;

public class FileRename {

    public static void main(String[] args) {
        File f=new File("C:\\Users\\Ankit\\Desktop\\LC.txt");
        File r=new File("C:\\Users\\Ankit\\Desktop\\NC.txt");

        if (f.exists()){

            System.out.println(f.renameTo(r));

        }
        else {

            System.out.println("File Does not exist........");

        }

    }
}
