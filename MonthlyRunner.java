import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * MonthlyRunner
 */
public class MonthlyRunner {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        File inputData = new File("inputData");
        File[] allFiles = inputData.listFiles();

        for (File file : allFiles) {
            try {
                //Reads data from file
                Scanner scanFile = new Scanner(file);
                //get first string out of the file
                
                String data = scanFile.nextLine();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }
}