package batchprocessor;

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
                String fileName = file.getName();
                // Reads data from file
                int underscoreLocation = fileName.indexOf("_");
                String fileType = fileName.substring(0, underscoreLocation);
               MonthlyItem mi = createMonthlyItem(fileType);
                // invoke a factory method that will create the appropriate class
                Scanner scanFile = new Scanner(file);
                // get first string out of the file

                String data = scanFile.nextLine();
                //Tell the monthly item object to pricess the data
                mi.process(data);
            } 
            catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Unknow file type found. Message "+ e.getMessage());
            }

        }

    }

    private static MonthlyItem createMonthlyItem(String fileType) throws Exception {
        String fulClassName = "batchprocessor." + fileType;
        // use reflection to create an object , based on a string representation ofthe a class name
        return (MonthlyItem) Class.forName(fulClassName).getDeclaredConstructor().newInstance();
    }
}