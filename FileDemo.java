import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("\n");


        File dir = new File("/media/md-mehedi-hasan/Extra/Java Practice/practice/File_in_Java/File_Operation");

        dir.mkdir();
        
        if (dir.exists()) {
            System.out.println("Folder is a Created");
        }

        String path = dir.getAbsolutePath();

        System.out.println(path);
        
        System.out.println(dir.getName());

        File file1 = new File(path+"/Mehedi.txt");
        File file2 = new File(path+"/hasan.txt");
        File file3 = new File(path+"/Jian.txt");

        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();


       if (dir.exists()) {
        System.out.println("Folder");
       }







        System.out.println("\n");
        
        System.out.println("\n");

    }   
}
