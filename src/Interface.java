import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is the main class of the "Pursuit" application.
 * "Pursuit" is a very simple, text based to do list.  Users
 * can add their tasks, edit, remove and view them by date or
 * by project. That's all. It should really be extended to make
 * it more interesting!
 *
 * This main class creates and initialises all the others: it
 * creates the parser and starts the game.  It also evaluates and
 * executes the commands that the parser returns.
 *
 * @author  Tarek Barodi
 * @version 2019
 */

public class Interface
{
    private Parser         parser        ;
    private TaskList       taskList      ;



    /**
     * Create the Pursuit and initialise it.
     */
    public Interface()
    {
        parser   = new Parser()  ;
        taskList = new TaskList();
    }
    
    

    /**
     *  Main start routine.
     */
    public void start()
    {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and execute them until the user quit.
        boolean finished = false;
        while (!finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        printBye();
    }


    /**
     * "Quit" was entered.
     * @return true, if this command quits the game, false otherwise.
     */
    public boolean saveAndQuit(Command command)
    {
        if(command.hasSecondWord())
        {
            printQuitError(); return false;
        }
        else
            {
                return true;
            }
    }



        /**
         * Given a command, process (that is: execute) the command.
         * @param command The command to be processed.
         * @return true If the command ends the application, false otherwise.
         */
        private boolean processCommand(Command command)
        {
            boolean wantToQuit = false;                //use it to return false after the switch.
            CommandWord commandWord = command.getCommandWord();
            switch (commandWord)
            {
                case SHOWTASKLIST:
                    showTaskList();
                    break;

                case ADDNEWTASK:
                    printParserAddTaskDetails();
                    break;

                case EDITTASK:
                    break;

                case SAVEANDQUIT:
                    saveAndQuit(command);
                    break;

                case HELP:
                    printHelp();
                    break;

                case UNKNOWN:
                    printUnkown();
                    break;
            }
            return wantToQuit;
        }


    /**
     * This method will display the show task list interface to help the use to choose between
     * show the task list by date or by project and in case of wrong entry the method will call
     * itself again and once the user inside the list also he/she has an option to go back or
     * go home.
     */
    public void showTaskList()
    {
        System.out.println("\n Press (1) to show Task List by Date ");
        System.out.println("\n Press (2) to show Task List by Project ");
        String taskListByDateOrProjectInput = parser.getInput();
        if (taskListByDateOrProjectInput.equals("1"))
        {
            // inside the show task list
            taskList.showByDate();
            System.out.println("\n Press (1) to go back ");
            System.out.println("\n Press any key to go Home ");
            String backFromShowTaskList = parser.getInput();
            if (backFromShowTaskList.equals("1"))
            {
                showTaskList();
            }
            else
            {
                printWelcome();
            }

        }
        else if (taskListByDateOrProjectInput.equals("2"))
        {
            taskList.showByProject();
            System.out.println("\n Press (1) to go back ");
            System.out.println("\n Press any key to go Home ");
            String backFromShowTaskList = parser.getInput();
            if (backFromShowTaskList.equals("1"))
            {
                showTaskList();
            }
            else
            {
                printWelcome();
            }

        }
        else
        {
            System.out.println("\n Please read the below once again and enter a valid option :) ");
            showTaskList();
        }
    }


    /**
     * This method will execute once the user press the option number 2 from the interface list
     * and will print out and take input from user one by one and assign each input to different
     * variables to make east to use them as parameters in the addTask method to create the new
     * task. Date is equal to the current date & Status is false as default (Pending).
     */
    public void printParserAddTaskDetails()
    {
        System.out.println("\n Please enter the Title of the task: ");
        String title = parser.getInput();   // assign the input of the user to a variable (title)

        System.out.println("\n Please enter the Title of the Description: ");
        String description = parser.getInput();

        System.out.println("\n Please enter the Title of the Project: ");
        String project = parser.getInput();

        // the date is equal to the creating date

        System.out.println("\n Please enter the Title of the Due Date: ");
        String dueDate = parser.getInput();
        // creating a simpleDateFormat object by passing the data pattern.
        // pass the date string to simpleDateFormat parse method.
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss").parse("31/12/1998");


        // status pending by default

        // calling the addTask method which exist in the taskList
        taskList.addTask(title, description, project, new Date(), dueDate, false);

        System.out.println("\n The task " + title + " have been successfully added to the list under the " +
                "project " + project + "\n press (1) to view your tasks otherwise press any key " +
                "to ga back home");
        String afterAddingTaskInput = parser.getInput();
        if (afterAddingTaskInput.equals("1"))
        {
            showTaskList();
        }
        else
        {
            printWelcome();
        }


    }


    /**
     * Print out the opening message for the player.
     */
    public void printWelcome(){

        System.out.println("\n Welcome to Pursuit" +
                "\n ================== " +
                "\n You have X tasks todo and Y tasks are done " +
                "\n Pick an option: ");
        System.out.println("\n(" + CommandWord.SHOWTASKLIST + ") Show Task List (by date or project)");
        System.out.println("\n(" + CommandWord.ADDNEWTASK + ") Add New Task");
        System.out.println("\n(" + CommandWord.EDITTASK + ") Edit Task (Update, Mark as done, Remove");
        System.out.println("\n(" + CommandWord.SAVEANDQUIT + ") Save & Quit");
        System.out.println("\n(" + CommandWord.HELP + ") for Help");
        System.out.println("\n ============================================ ");
    }

    /**
     * Print out a list of valid command words.

     static void showCommands()
     {
     commands.showAll();
     }
     */

    public void printHelp(){
        System.out.println("\n Welcome to Pursuit" +
                "\n Simply use the keyboard to type a number or " +
                "\n a word which equal to that want to do and in  " +
                "\n case of further help please read the Welcome page ");
        printWelcome();
        //showCommands();
    }


    public void printUnkown(){
        System.out.println("I don't know what you mean..., Please read the Welcome list and pick one an option");
    }


    public void printQuitError() {
        System.out.println("\n Quit as a command word should contain only one word which is Quit");
    }


    public void printBye(){
        System.out.println("Thank you for using Pursuit, Good Bye");
    }


}

