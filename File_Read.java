import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Read{
    public static void main(String[] args) {
        
        
        
        try {

            File file = new File("/media/md-mehedi-hasan/Extra/Java Practice/practice/File_in_Java/File_Operation/Mehedi.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){

                String id = scanner.next();
                String name = scanner.next();

                System.out.println("Id: "+id+" Name: "+name);
            }

            scanner.close();


        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }

    }
}