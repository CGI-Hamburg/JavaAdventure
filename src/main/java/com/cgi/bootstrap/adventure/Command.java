package com.cgi.bootstrap.adventure;

/**
 *  This class hold information about the options that a user can select.
 *
 * @author shirley
 * @version 0.1
 */

public class Command {

    // Possible options
    private static final String[] validCommands = {
            "A", "B", "C", "D"
    };

    public boolean checkValidCommand(String input){
        for (String command: validCommands) {
            if (command.equals(input)) {
                return true;
            }
        }
        return false;
    }

}
