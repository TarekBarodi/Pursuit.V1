import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 /**
public class CsvReader
{
    List <Task> tasks = new ArrayList<>();

    Path path = new Path("src/TaskFile.csv");  ///Users/tarekbarodi/Desktop/Pursuit.V1/src/TaskFile.csv

    for
    {
        List<String> listOfLines = Files.readAllLines(path);
        listOfLines.get(0);

        Scanner scanner = new Scanner(listOfLines.get(int index));
            scanner.useDelimiter(" \t+ ");

            Task task = new Task();
            task.getTitle() = scanner.next();
            task.getDescription() = scanner.next();
            task.getProject() = scanner.next();
            task.getDate() = scanner.next();
            task.getStatus() = scanner.next();

            task.add(task);

            return tasks;
    }




    /**
    public List readCsvFile(String filePath) throws Exception {
        List taskList = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line = null;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            //Skip the header now
            if (count == 0){
                count++;
                continue; 
            }

            String[] lineContents = line.split(" , ");
            taskDetails 
        }
    }
     */


