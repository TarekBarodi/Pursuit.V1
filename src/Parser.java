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
public class Parser {

    private CommandWords commands;    //Holds all valid command words
    private Scanner reader;      //Source of command input


    /**
     * Constructor - Create a parser to read from the terminal window.
     */
    public Parser() {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }


    /**
     * Get only the first word from the user and ignore the rest.
     *
     * @returen The next command from the user.
     */
    public Command getCommand() {
        String inputLine;                   //will hold the full input line.
        String word = null;

        System.out.println("> ");           //print prompt

        inputLine = reader.nextLine();

        //find up to one word on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if (tokenizer.hasNext()) {
            word = tokenizer.next();        //get first word & ignore the rest of the input line.
        }
        return new Command(commands.getCommandWord(word));
    }


/**

 Scanner reader = new Scanner(System.in);


 public int readInt() {
 int i = reader.nextInt();
 return i;
 }

 public String readString() {
 String str = reader.nextLine();
 return str;
 }
 */
}