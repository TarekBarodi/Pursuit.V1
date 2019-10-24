import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList implements Serializable
{
    public ArrayList<Task> tasksList;



    /***
     * Constructor initiate the taskList Array List to be ready to receive the new tasks.
     */
    public TaskList()
    {
        tasksList = new ArrayList<>();
        List<Task> tasks;
    }


    /**
     * In this scenario is better to use the constructor to create an instance of the taskList
     * because we want to create only once and only one ArrayList
     * @param title
     * @param description
     * @param project
     * @param date
     * @param dueDate
     * @param pending
     */
    public void addTask(String title, String description, String project, Date date, LocalDate dueDate, boolean pending)
    {
        Task task = new Task(title, description, project, date, dueDate, pending);
        tasksList.add(task);
        //for (Task ta : taskslist)      //TODO  for (int i = 0; i < tasksList.size(); i++)
    }


    public LocalDate stringToDate(String date)
    {
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate ld = LocalDate.parse(date, dtf);
            return ld;
        }
        catch (DateTimeParseException e)
        {
            return null;
        }

    }


    public boolean editTask(int taskID)
    {
        return false;
    }


    public boolean removeTask(int taskID)
    {
        return false;
    }


    public boolean markAsDone(int taskID)
    {
        return false;
    }



    /***
     * streams for grouping by date "getDate"
     */
    public void showByDate()
    {
        List<Task> sortedTasks = tasksList.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for (Task t:sortedTasks)
        {
            System.out.println(" - " + t.getDueDate().format(dtf) + " | " +
                    t.getTitle() + " | " +
                    t.getProject() + " | " +
                    sdf.format(t.getDate())+ " | " +
                    t.getPending() + " | " +   //t.getStatus() ? "done" : "pending" + " | " +
                    t.getDescription());
        }
    }



    /***
     * streams for grouping by project "getProject"
     */
    public void showByProject()
    {
        List<Task> sortedTasks = tasksList.stream()
                .sorted(Comparator.comparing(Task::getProject))
                .collect(Collectors.toList());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (Task t:sortedTasks)
        {
            System.out.println(" - " + t.getProject() + " | " +
                    t.getTitle() + " | " +
                    t.getDueDate() + " | " +
                    t.getDate() + " | " +
                    t.getPending() + " | " +
                    t.getDescription());
        }
    }


    public void loadTasks()
    {
        //TODO: look into ObjectInputStream
    }


    public TaskList getTasksList() {
        return this;
    }


    public void saveTasks()
    {
        WriterReaderCSV wrCSV = new WriterReaderCSV();
        wrCSV.writeToCSV(getTasksList());
    }


}