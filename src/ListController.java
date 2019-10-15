import java.util.*;
import java.util.stream.Collectors;


public class ListController
{
    private ArrayList<Task> tasks;


    public void addTask()
    {
        //read line from user
        Task task = new Task("titleFromUser", "descriptionFromUser", "my project", new Date(), true);
        //TODO: look into SimpleDateFormat or whatever it's called
        tasks = new ArrayList<>();    //init the arraylist to be ready to receive items and it could be done using the constructor
        tasks.add(task);

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
        List<Task> sortedTasks = tasks.stream()
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
        List<Task> sortedTasks = tasks.stream()
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

