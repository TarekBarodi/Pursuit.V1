import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/***
 * This class is part of the "Pursuit" application.
 * "Pursuit" is a very simple, text based To Do List.
 *
 * This Task class creating a new task each time and using parameters.
 *
 * @author  Tarek Barodi
 * @version 2019.02.29
 */

public class Task implements Serializable
{
    public String title;
    public String description;
    public String project;
    public Date date;
    public LocalDate dueDate;
    public Boolean pending = true;


    /***
     * Constructor creating a new task every time using the below parameters.
     * @param title
     * @param description
     * @param project
     * @param date
     * @param dueDate
     * @param pending
     */

    public Task(String title, String description, String project, Date date, LocalDate dueDate, Boolean pending)
    {
        this.title = title;
        this.description = description;
        this.project = project;
        this.date = date;
        this.dueDate = dueDate;
        this.pending = pending;
    }

    /***
     * Constructor creating a new task every time without values.
     */

    public Task() { }

    /**
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", project='" + project + '\'' +
                ", date=" + date +
                ", dueDate=" + dueDate +
                ", pending=" + pending +
                '}';
    }
    */


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getProject()
    {
        return project;
    }

    public void setProject(String project)
    {
        this.project = project;
    }


    public Date getDate()
    {
        return date;
    }


    public void setDate(Date date)
    {
        this.date = date;
    }


    public LocalDate getDueDate()
    {
        return dueDate;
    }


    public void setDueDate(LocalDate dueDate)
    {
        this.dueDate = dueDate;
    }






    public Boolean getPending()
    {
        return pending;
    }


    public void setPending(Boolean pending)
    {
        this.pending = pending;
    }


}
