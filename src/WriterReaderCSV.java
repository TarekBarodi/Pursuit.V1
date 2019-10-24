import java.io.*;

/**
 * Object Serialization class
 *
 * Author: Tarek Barodi
 * Date: 2019
 */
public class WriterReaderCSV {

    public void writeToCSV(TaskList taskList) {

        try {
            FileOutputStream fops = new FileOutputStream("/Users/tarekbarodi/Desktop/Pursuit.V1/src/TaskFile.csv");
            ObjectOutputStream oops = new ObjectOutputStream(fops);
            oops.writeObject(taskList);
            oops.flush();
            oops.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TaskList readFromCSV() {

        try{
            FileInputStream fips = new FileInputStream("/Users/tarekbarodi/Desktop/Pursuit.V1/src/TaskFile.csv");
            ObjectInputStream oips = new ObjectInputStream(fips);
            TaskList taskList = (TaskList) oips.readObject();
            oips.close();
            return taskList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }


}
