import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class File_Write extends Thread{
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n");

        Formatter formatter = new Formatter("/media/md-mehedi-hasan/Extra/Java Practice/practice/File_in_Java/File_Operation/Mehedi.txt");

        Scanner input = new Scanner(System.in);

        System.out.println("How many Students : ");
        int num = input.nextInt();
        for(int i = 0;i<num;i++){

            System.out.println("Id and Name : ");
            
            String id = input.next();
            
            String name = input.next();
            

            formatter.format("%s %s \n",id, name);

        }



        formatter.close();

        System.out.println("\n");
    }
}
