import java.util.Date;

/**
 * This class is part of the "Pursuit" application.
 * "Pursuit" is a very simple, text based To Do List.
 *
 * This Task class creating a new task each time and using parameters.
 *
 * @author  Tarek Barodi
 * @version 2019.02.29
 */

public class Task
{
    private String title;
    private String description;
    private String project;
    private Date date;
    private String dueDate;
    private Boolean status;


    /**
     * Constructor creating a new task every time using the below parameters.
     * @param title
     * @param description
     * @param project
     * @param date
     * @param dueDate
     * @param status
     */
    public Task(String title, String description, String project, Date date, String dueDate, Boolean status) {
        this.title = title;
        this.description = description;
        this.project = project;
        this.date = date;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
