package com.cgi.bootstrap.adventure;
import java.util.Scanner;

/**
 *  This class reads the written input of the player.
 *
 * @author shirley
 * @version 0.1
 */

public class Reader {

    private Command commands;
    private Scanner scanner;

    public Reader()
    {
        commands = new Command();
        scanner = new Scanner(System.in);
    }

    // Einlesen der Eingabe des Spielers
    public String getCommand(){

        String s = scanner.nextLine();

        Logger.debug(s);

        boolean b = commands.checkValidCommand(s);
        if (b){
            return s;
        } else {
            System.out.println("Nö.");
        }

        return null;
    }





}
