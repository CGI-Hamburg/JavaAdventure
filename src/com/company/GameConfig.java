package com.company;

/**
 *  This class creates the game map - i.e. creation of the rooms.
 *
 * @author shirley
 * @version 0.1
 */

public class GameConfig {

    private Room currentRoom;

    public static void createRoom() {

        Room flur, kueche, wohnzimmer, waffenkammer, schlafzimmer, badehaus;

        // Create rooms
        flur = new Room("Junge, du bist im Flur.");
        kueche = new Room("Wo du schon Mal in der Küche bist, kannst du mir direkt ein Bier mitbringen.");
        wohnzimmer = new Room("Du befindest dich im chilligen Wohnzimmer.");
        waffenkammer = new Room("Psst, erzähl keinem was du hier in der Waffenkammer siehst!");
        schlafzimmer = new Room("Digga, warum gehst du in mein Schlafzimmer?");
        badehaus = new Room("Du kleines perverses Huhn bist im Badehaus.");

        // Create exits for rooms
        flur.setExits(kueche, schlafzimmer, null, null);
        kueche.setExits(null,wohnzimmer,flur,null);
        wohnzimmer.setExits(null,waffenkammer,schlafzimmer,kueche);
        waffenkammer.setExits(null,null,badehaus,wohnzimmer);
        schlafzimmer.setExits(wohnzimmer,badehaus,null,flur);
        badehaus.setExits(waffenkammer,null,null,schlafzimmer);

        //Start position
        currentRoom = flur;
    }








}
