

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

public class Welcome
{
    private Parser parser;
    private ListController listController;
    private Print print;



    /**
     * Create the Pursuit and initialise it.
     */
    public Welcome()
    {
        parser = new Parser();
        listController = new ListController();
        print = new Print();
    }



    /**
     *  Main start routine.
     */
    public void start()
    {
        print.printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and execute them until the user quit.
        boolean finished = false;
        while (!finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        print.printBye();
    }


    /**
     * "Quit" was entered.
     * @return true, if this command quits the game, false otherwise.
     */
    public boolean saveAndQuit(Command command)
    {
        if(command.hasSecondWord())
        {
            print.printQuitError(); return false;
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
                    break;
                case ADDNEWTASK:
                    listController.addTask();
                    print.printAddTaskDetails();
                    //parser.readTaskDetails();
                    break;
                case EDITTASK:
                    break;
                case SAVEANDQUIT:
                    saveAndQuit(command);
                    break;
                case HELP:
                    print.printHelp();
                    break;
                case UNKNOWN:
                    print.printUnkown();
                    break;
            }
            return wantToQuit;
        }

    public static void main(String[] args)
    {
        Welcome welcome = new Welcome();
        welcome.start();
    }
}

