import java.util.ArrayList;

public class Project {
    private ArrayList<Task> projectTasks;

    public Project(ArrayList<Task> projectTasks) {
        this.projectTasks = projectTasks;
    }

    public ArrayList<Task> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectTasks(ArrayList<Task> projectTasks) {
        this.projectTasks = projectTasks;
    }
}
