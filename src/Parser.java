import java.util.Scanner;


/**
 * This class is part of the "Pursuit" application.
 * "Pursuit" is a very simple, text based To Do List.
 * <p>
 * This parser reads user input and tries to interpret it as a command
 * Every time it is called it reads a line from the terminal and
 * tries to interpret the line as an one-word command. It returns the command
 * as an object of class Command.
 * <p>
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 *
 * @author Tarek Barodi
 * @version 2019.02.29
 */
public class Parser
{
    private CommandWords commands;    //Holds all valid command words
    private Scanner      reader  ;    //Source of command input



    /**
     * Constructor - Create a parser to read from the terminal window.
     */
    public Parser()
    {
        commands = new CommandWords()    ;
        reader   = new Scanner(System.in);
    }



    /**
     * Get only the first word from the user and ignore the rest.
     *
     * @returen The next command from the user.
     */
    public Command getCommand()
    {
        String inputLine   ;                            // will hold the full input line.
        String word1 = null;
        String word2 = null;

        System.out.println("> ");                       // print prompt

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);     // find up to one word on the line.
        if (tokenizer.hasNext())
        {
            word1 = tokenizer.next();                    // get first word
        }
            if (tokenizer.hasNext())
            {
                word2 = tokenizer.next();                // get second word
            }                                            // note: we just ignore the rest of the input line.

        return new Command(commands.getCommandWord(word1), word2);
    }


    /**
     * This method takes the input from the user
     * @return
     */
    public String getInput()
    {
        return reader.nextLine();
    }
}