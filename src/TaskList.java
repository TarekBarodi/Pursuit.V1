import java.util.*;
import java.util.stream.Collectors;


public class TaskList
{
    private ArrayList<Task> tasksList;

    /**
     * Constructor initiate the taskList Array List to be ready to receive the new tasks.
     */
    public TaskList()
    {
        tasksList = new ArrayList<>();
    }


    public void addTask(String title, String description, String project, Date date, String dueDate, boolean status)
    {
        Task task = new Task(title, description, project, date, dueDate, status);
        tasksList.add(task);


        //tasks = new ArrayList<>();    better to using the constructor here because we want to create only once and only one ArrayList
        //TODO: look into SimpleDateFormat or whatever it's called
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


    public void showByDate()
    {
        List<Task> sortedTasks = tasksList.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());

       for (Task t:sortedTasks)
       {
           System.out.println(t.getTitle() + " " +
                              t.getDescription() + " " +
                              t.getProject() + " " +
                              t.getStatus());
       }
    }


    public void showByProject()
    {
        //TODO: look into streams for grouping
        List<Task> sortedTasks = tasksList.stream()
                .sorted(Comparator.comparing(Task::getProject))
                .collect(Collectors.toList());

        for (Task t:sortedTasks)
        {
            System.out.println(t.getTitle() + " " +
                               t.getDescription() + " " +
                               t.getDate() + " " +
                               t.getStatus());
        }
    }


    public void loadTasks()
    {
        //TODO: look into ObjectInputStream
    }


    public void saveTasks()
    {
        //TODO: look into ObjectOutputStream
    }


}

