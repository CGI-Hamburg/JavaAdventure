package com.company;

/**
 *  This class hold information about Rooms.
 *
 * @author Hundemami
 * @version 0.1
 */

public class Room {

    private int numberDoors;
    private String[] directions;
    private String roomName;
    private String description;

    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;


    public String[] getDirections() {
        return directions;
    }

    public void setDirections(String[] directions) {
        this.directions = directions;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Describing the room, for example "Waffenkammer"
    // @shirley
    public Room(String description)
    {
        this.description = description;
    }

    // Method to set the exits for each room
    // @shirley
    public void setExits(Room A, Room B, Room C, Room D)
    {
        if(A != null) {
            northExit = A;
        }
        if(B != null) {
            eastExit = B;
        }
        if(C != null) {
            southExit = C;
        }
        if(D != null) {
            westExit = D;
        }
    }
}
