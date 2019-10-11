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

public class Welcome {

    static Parser parser;

    /**
     * Create the Pursuit and initialise it.
     */
    public Welcome() {
        parser = new Parser();
        System.out.println("eeeeeee");   //testing
    }
             
        /**
         *  Main start routine.
         */
        public void start(){
            Print.printWelcome();
            // Enter the main command loop.  Here we repeatedly read commands and
            // execute them until the user quit.
            boolean finished = false;
            while (!finished){
                Command command = parser.getCommand();
                 finished = processCommand(command);
            }
            Print.printBye();
        }

        /**
         * Given a command, process (that is: execute) the command.
         * @param command The command to be processed.
         * @return true If the command ends the application, false otherwise.
         */
        private boolean processCommand(Command command) {

            boolean wantToQuit = false;                //use it to return false after the switch.
            CommandWord commandWord = command.getCommandWord();
            switch (commandWord) {
                case SHOWTASKLIST:

                    break;

                case ADDNEWTASK:

                    break;

                case EDITTASK:

                    break;

                case SAVEANDQUIT:

                    break;

                case HELP:
                    Print.printHelp();
                    break;

                case UNKNOWN:
                    Print.printUnkown();

                    break;
            }

            return wantToQuit;
        }

    public static void main(String[] args) {  }

    






    
    //Parser parser = new Parser();
    //String str = parser.readString();
    //CommandWord commandKey = CommandWord.fromString(str);
    //System.out.println(commandKey);

    //Show a member of the HashMap.
    //CommandWord[] command = CommandWord.values();
    //System.out.println(command[0].name() + "( " + command[0].toString() + " )");

}

