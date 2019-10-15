import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
/**
public class CsvWriter {

    public void writingToFile(String fileName) throws Exception {
        List tasks = buildTaskData();
        FileWriter = new File(fileName);
        FileWriter csvWriter = new FileWriter(csvFile);
        BufferedWriter bufferedWriter = new BufferedWriter(csvWriter);
        bufferedWriter .write("Title, Description, Project, Date, Status");
        bufferedWriter.newLine();
        for (Task task : tasks) {
            bufferedWriter.write(task.getTitle() +       " , ");
            bufferedWriter.write(task.getDescription() + " , ");
            bufferedWriter.write(task.getProject() +     " , ");
            bufferedWriter.write(task.getDate() +        " , ");
            bufferedWriter.write(task.getStatus() +      " , ");
            bufferedWriter.newLine()                               ;
        }
        csvWriter.flush();
        bufferedWriter.close();
        csvWriter.close();
    }

 }
 */
