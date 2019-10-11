/**
 * This class is part of the "Pursuit" application.
 * "Pursuit" is a very simple, text based To Do List.
 *
 * This Print class handling only the print out methods
 *
 * @author  Tarek Barodi
 * @version 2019.02.29
 */

public class Print {


    /**
     * Print out the opening message for the player.
     */
    static void printWelcome(){

        System.out.println("\n Welcome to Pursuit" +
                           "\n ================== " +
                           "\n You have X tasks todo and Y tasks are done " +
                           "\n Pick an option: ");
        System.out.println("\n(" + CommandWord.SHOWTASKLIST + ") Show Task List (by date or project)");
        System.out.println("\n(" + CommandWord.ADDNEWTASK + ") Add New Task");
        System.out.println("\n(" + CommandWord.EDITTASK + ") Edit Task (Update, Mark as done, Remove");
        System.out.println("\n(" + CommandWord.SAVEANDQUIT + ") Save & Quit");
        System.out.println("\n ============================================ ");
    }

    static void printBye(){
        System.out.println("Thank you for using Pursuit, Good Bye");
    }

    static void printUnkown(){
        System.out.println("I don't know what you mean..., Please read the Welcome list and pick one an option");
    }

    /**
     * Print out a list of valid command words.

    static void showCommands()
    {
        commands.showAll();
    }
    */

    static void printHelp(){
        System.out.println("\n Welcome to Pursuit" +
                           "\n Simply use the keyboard to type a number or " +
                           "\n a word which equal to that want to do and in  " +
                           "\n case of further help please read the Welcome page ");
        printWelcome();
        //showCommands();
    }

}
