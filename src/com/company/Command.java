package com.company;

/**
 *  This class hold information about the options that a user can select.
 *
 * @author shirley
 * @version 0.1
 */

public class Command {
    private String option;

    // Create an option.
    public Command(String option) {
        this.option = option;
    }

    /**
     * Return Option
     * @return the option
     */
    public String getOption(){
        return option;
    }
}
