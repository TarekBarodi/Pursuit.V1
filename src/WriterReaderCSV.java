import java.io.*;
import java.util.ArrayList;

/**
 * Object Serialization class
 *
 * Author: Tarek Barodi
 * Date: 2019
 */
public class WriterReaderCSV {

    /**
     * This method save the data on the CSV file and once the user click on save and quit
     * @param taskList
     */
    public void writeToCSV(ArrayList<Task> taskList) {

        try {
            FileOutputStream fops = new FileOutputStream("src/TaskFile.csv");
            ObjectOutputStream oops = new ObjectOutputStream(fops);
            oops.writeObject(taskList);
            oops.flush();
            oops.close();
        }
        catch (EOFException e)
        {
            System.out.println("The list is empty, nothing to save");
            return;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method reading the files from the files once the application starts
     * @return
     */
    public ArrayList<Task> readFromCSV() {
        ArrayList<Task> taskList = new ArrayList<>();
        try{
            FileInputStream fips = new FileInputStream("/Users/tarekbarodi/Desktop/Pursuit.V1/src/TaskFile.csv");
            ObjectInputStream oips = new ObjectInputStream(fips);
            taskList = (ArrayList<Task>) oips.readObject();
            oips.close();
        }
        catch (EOFException e)
        {
            System.out.println("the list is empty nothing to show");
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return taskList;


    }


}
