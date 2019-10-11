import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;


public class ListController {


    private ArrayList<Task> tasks;


    public void addTask() {
        //read line from user
        Task task = new Task("titleFromUser", "descriptionFromUser", "my project", new Date());
        //TODO: look into SimpleDateFormat or whatever it's called
        tasks.add(task);
    }

    public boolean editTask(int taskID){

        return false;
    }

    public boolean removeTask(int taskID){
        return false;
    }

    public boolean markAsDone(int taskID){
        return false;
    }

    public void showByDate(){

        //TODO: look into streams for sorting
        //ascending oder
        tasks.stream().sorted().forEach(s1-> System.out.println(s1));
        //descending oder
        tasks.stream().sorted(Comparator.reverseOrder()).forEach(s2-> System.out.println(s2));



    }

    public void showByProject(){

        //TODO: look into streams for grouping

    }

    public void loadTasks(){

        //TODO: look into ObjectInputStream

    }

    public void saveTasks(){

        //TODO: look into ObjectOutputStream

    }


}
