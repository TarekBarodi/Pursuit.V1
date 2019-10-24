import javax.swing.*;
import java.io.*;
import java.util.ArrayList;


public class CsvWriter
{
    static String filePath = "/Users/tarekbarodi/Desktop/Pursuit.V1/src/TaskFile.csv";






    /**
     * FileWriter: this object write on the file and the false mean Overwrite the existing data
     *             but the true is Append by putting data at the bottom of the existing data
     * BufferedWriter: It is extension of FileWriter to make sure that your characters your strings and
     *                 arrays are more efficiently written to the file
     * PrintWriter: gives us access to syntax
     * @param: ArrayList <Task> tasksList, copy it from the taskList field.

    public static void writeSaveTask(ArrayList<Task> tasksList)
    {
        try
        {
            FileWriter fw     = new FileWriter(filePath,false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw    = new PrintWriter(bw);

            pw.println("title, description, project, date, dueDate, status");
            bw.newLine();

            for (Task task : tasksList)
            {
                pw.write(task.getTitle()+ " , ");
                pw.write(task.getDescription()+ " , ");
                pw.write(task.getProject()+ " , ");
                pw.write(task.getDate()+ " , ");
                pw.write(task.getDueDate()+ " , " );
                pw.write(task.getPending()+ " , ");
            }

            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Task saved");
        }

        catch (Exception E)
        {
            JOptionPane.showMessageDialog(null,"Error while saving the task");
        }
    }
    */



    /**
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
     */

 }

