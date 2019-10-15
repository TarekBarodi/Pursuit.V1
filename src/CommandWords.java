import java.util.HashMap;

/**
 * This class is part of the "Pursuit" application.
 * "Pursuit" is a very simple, text based to do list.
 *
 * This class holds an enumeration of all command words known
 * to the application.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Tarek Barodi
 * @version 2019
 */

public class CommandWords {

    //A mapping between a command word and the CommandWord associate with it.
    private HashMap<String, CommandWord> validCommands;



    /**
     * Constructor - Initialise the command words by create & loop through the HashMap to
     * start fill it with each value of the CommandWord.
     */
    public CommandWords() {
        validCommands = new HashMap<>();
        for (CommandWord command : CommandWord.values())
        {
            if (command != CommandWord.UNKNOWN){ validCommands.put(command.toString(),command);}
        }
    }



    /**
     * Find the CommandWord associated with a command word.
     * @param commandWord The word to look up.
     * @return The CommandWord corresponding to commandWord, or UNKNOWN
     *         if it is not a valid command word.
     */
    public CommandWord getCommandWord(String commandWord)
    {
        CommandWord command = validCommands.get(commandWord);
        if (command != null)
        {
            return command;
        }
        else
            {
                return CommandWord.UNKNOWN;
            }
    }




    /**
     * Check whether a given String is a valid command word.
     * @return true if it is, false if it isn't.
     */
    public boolean isCommand(String command)
    {
        return validCommands.containsKey(command);
    }




    /**
     * Print all valid commands to System.out.
     */
    public void showAll()
    {
        for (String command : validCommands.keySet())
        {
            System.out.println(command + " ");
        }

        System.out.println();
    }
}
