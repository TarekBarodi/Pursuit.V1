import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * this class contains the list of tasks which contacted to the CSV files
 * Author: Tarek Barodi
 * Date: 2019
 */
public class TaskList implements Serializable {
    public ArrayList<Task> tasksList;
    public Parser parser;
    public Interface anInterface;


    /**
     * Constructor initiate the taskList Array List to be ready to receive the new tasks.
     */
    public TaskList() {
        tasksList = new WriterReaderCSV().readFromCSV();
        parser = new Parser();
    }


    /**
     * In this scenario is better to use the constructor to create an instance of the taskList
     * because we want to create only once and only one ArrayList
     *
     * @param title
     * @param description
     * @param project
     * @param dueDate
     * @param pending
     */
    public void addTask(String title, String description, String project, LocalDate dueDate, boolean pending) {
        Task task = new Task(title, description, project, dueDate, pending);
        tasksList.add(task);
        //for (Task ta : taskslist)      //TODO  for (int i = 0; i < tasksList.size(); i++)
    }

    /**
     * This method will return number the tasks we have in the list
     * @return
     */
    public int numOfTasks() {
        return tasksList.size();
    }

    /**
     * This method will determine the format of the date
     * @param date
     * @return
     */
    public LocalDate stringToDate(String date) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate ld = LocalDate.parse(date, dtf);
            return ld;
        } catch (DateTimeParseException e) {
            return null;
        }

    }


    public boolean editTask(int taskID) {
        return false;
    }


    public boolean removeTask(int taskID) {
        return false;
    }


    public boolean markAsDone(int taskID) {
        return false;
    }


    /**
     * streams for grouping the tasks by date "getDate"
     */
    public void showByDate() {
        List<Task> sortedTasks = tasksList.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for (Task t : sortedTasks) {
            System.out.println(" - " + t.getDueDate()/*.format(dtf) */ + " | " +
                    t.getTitle() + " | " +
                    t.getProject() + " | " +
                    sdf.format(t.getDueDate()) + " | " +
                    t.getPending() + " | " +   //t.getStatus() ? "done" : "pending" + " | " +
                    t.getDescription());
        }
    }


    /**
     * streams for grouping the tasks by project "getProject"
     */
    public void showByProject() {
        List<Task> sortedTasks = tasksList.stream()
                .sorted(Comparator.comparing(Task::getProject))
                .collect(Collectors.toList());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (Task t : sortedTasks) {
            System.out.println(" - " + t.getProject() + " | " +
                    t.getTitle() + " | " +
                    t.getDueDate() + " | " +
                    t.getPending() + " | " +
                    t.getDescription());
        }
    }

    public void showAllTasks() {
        //allTask.add(new Task("st", "sdfsdf", "pro", new Date().n, null, false));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int i = 1;
        for (Task t : tasksList) {
            System.out.println("-----------------------------------------------------------");
            System.out.println(" Task # " + i + " | " + t.getTitle() + " | " + t.getDescription() + " | " + t.getProject() + " | "
                    + " | " + t.getDueDate() + " | " + t.getPending());
            System.out.println("-----------------------------------------------------------");
            i++;
            System.out.println("Please type the number of the task to start editing it");

        }

        String taskNumberInput = parser.getInput();

        try
        {
            int taskIndex = Integer.parseInt(taskNumberInput);
            Task selectedTask = tasksList.get(taskIndex - 1 );
            System.out.println(selectedTask);
            System.out.println("Press 1 to edit the task and 0 to remove a task");
            String taskEditNumberInput = parser.getInput();
            if (taskEditNumberInput.equals("0")) {
                tasksList.remove(i);
            } else if (taskEditNumberInput.equals("1")) {
                System.out.println("Press t to change the Title");
                System.out.println("Press d to change the Description");
                System.out.println("Press p to change the Project name");
                System.out.println("Press dd to change the Due Date");
                System.out.println("Press s to change the Status of task");
                String editOptionInput = parser.getInput();
                if (editOptionInput.toLowerCase().equals("t")) {
                    System.out.println("Please type the new Title and press Enter to continue");
                    String setTitleInput = parser.getInput();
                    System.out.println("Press y to confirm the change");
                    System.out.println("Press any key to go back to the list");
                    String optionSetTitleInput = parser.getInput();
                    if (optionSetTitleInput.equals("y")) {
                        selectedTask.setTitle(setTitleInput);
                        System.out.println(selectedTask);
                        System.out.println("Press any key to go to the home page");
                        String anyKey = parser.getInput();
                        anInterface.printWelcome();
                    } else {
                        showAllTasks();
                    }

                } else if (editOptionInput.toLowerCase().equals("d")) {
                    System.out.println("Please type the new Description and press Enter to continue");
                    String setDescriptionInput = parser.getInput();
                    System.out.println("Press y to confirm the change");
                    System.out.println("Press any key to go back to the list");
                    String optionSetDescriptionInput = parser.getInput();
                    if (optionSetDescriptionInput.equals("y")) {
                        selectedTask.setTitle(setDescriptionInput);
                        System.out.println(selectedTask);
                        System.out.println("Press any key to go to the home page");
                        String anyKey = parser.getInput();
                        anInterface.printWelcome();
                    } else {
                        showAllTasks();
                    }

                } else if (editOptionInput.toLowerCase().equals("p")) {
                    System.out.println("Please type the new Project and press Enter to continue");
                    String setProjectInput = parser.getInput();
                    System.out.println("Press y to confirm the change");
                    System.out.println("Press any key to go back to the list");
                    String optionSetProjectInput = parser.getInput();
                    if (optionSetProjectInput.equals("y")) {
                        selectedTask.setTitle(setProjectInput);
                        System.out.println(selectedTask);
                        System.out.println("Press any key to go to the home page");
                        String anyKey = parser.getInput();
                        anInterface.printWelcome();
                    } else {
                        showAllTasks();
                    }

                } else if (editOptionInput.toLowerCase().equals("dd")) {
                    System.out.println("Please type the new Due Date and press Enter to continue");
                    String setDueDateInput = parser.getInput();
                    System.out.println("Press y to confirm the change");
                    System.out.println("Press any key to go back to the list");
                    String optionSetDueDateInput = parser.getInput();
                    if (optionSetDueDateInput.equals("y")) {
                        selectedTask.setTitle(setDueDateInput);
                        System.out.println(selectedTask);
                        System.out.println("Press any key to go to the home page");
                        String anyKey = parser.getInput();
                        anInterface.printWelcome();
                    } else {
                        showAllTasks();
                    }
                } else if (editOptionInput.toLowerCase().equals("s")) {
                    System.out.println("Please type the new Due Date and press Enter to continue");
                    String setStatusInput = parser.getInput();
                    System.out.println("Press y to confirm the change");
                    System.out.println("Press any key to go back to the list");
                    String optionSetStatusInput = parser.getInput();
                    if (optionSetStatusInput.equals("y")) {
                        selectedTask.setTitle(setStatusInput);
                        System.out.println(selectedTask);
                        System.out.println("Press any key to go to the home page");
                        String anyKey = parser.getInput();
                        anInterface.printWelcome();
                    } else {
                        showAllTasks();
                    }
                }

            }
        } catch (Exception e){
            System.out.println("Press a valid option");
            showAllTasks();
        }
    }


    public void loadTasks() {
        //TODO: look into ObjectInputStream
    }


    public TaskList getTasksList() {
        return this;
    }


    public void saveTasks() {
        WriterReaderCSV wrCSV = new WriterReaderCSV();
        wrCSV.writeToCSV(tasksList);
    }


}