
/*
 * TODO COMMENT
 */

public enum CommandWord {
    // A value for each command word along with its
    // corresponding user interface string.
    SHOWTASKLIST("1"), ADDNEWTASK("2"), EDITTASK("3"), SAVEANDQUIT("4"), HELP("help"), UNKNOWN("?");

    //The command string.
    private String commandString;

    /**
     * Initialise the command string.
     * @param commandString The command string.
     */
    CommandWord(String commandString) {
        this.commandString = commandString;
    }

    /**
     * Method for the init constructor of CommandWords
     * To add the commandString to the HashMap.
     * @return The key of command word as a string.
     */
    public String toString() {
        return commandString;
    }

    public static CommandWord fromString(String commandIn) {
        for (CommandWord command : CommandWord.values()) {
            if (command.commandString.equalsIgnoreCase(commandIn)) {
                return command;
            }
        }
        return CommandWord.UNKNOWN;
    }
}
