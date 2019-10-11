
/**
 * This class is part of the "Pursuit" application.
 * "Pursuit" is a very simple, text based to do list.
 *
 * This class holds information about a command that was issued by the user.
 * A command currently consists of one part: a CommandWord and a string.
 *
 * The way this is used is: Commands are already checked for being valid
 * command words. If the user entered an invalid command (a word that is not
 * known) then the CommandWord is UNKNOWN.
 *
 * @author  Tarek Barodi
 * @version 2019
 */

public class Command {

    private CommandWord commandWord;

    /**
     * Create a command object. First word must be supplied, but
     * the second word must be null.
     * @param commandWord The CommandWord. UNKNOWN if the command word
     * was not recognised.
     */
    public Command(CommandWord commandWord) {
        this.commandWord = commandWord;
    }

    /*
     * Return the command word (the first word) of this command.
     * @return The command word.
     */
    public CommandWord getCommandWord()
    {
        return commandWord;
    }

    /**
     * @return true is this common was not understood.
     */
    public boolean isUnkown(){
        return (commandWord == CommandWord.UNKNOWN);
    }




}
