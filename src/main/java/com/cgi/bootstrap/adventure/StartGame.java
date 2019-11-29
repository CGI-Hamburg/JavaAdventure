package com.cgi.bootstrap.adventure;

// Game Play Action happens here

public class StartGame {

    private static Room currentRoom;
    private static Reader reader;

    public static void main(String[] args) {

        GameConfig config = new GameConfig();
        currentRoom = config.createRoom();
        System.out.println (currentRoom.getDescription());
        reader = new Reader();
        String c = reader.getCommand();

        if (c!=null){
            switch (c){
                case "A": currentRoom = currentRoom.northExit;
                break;
                case "B": currentRoom = currentRoom.eastExit;
                break;
                case "C": currentRoom = currentRoom.southExit;
                break;
                case "D": currentRoom = currentRoom.westExit;
                break;
                default : throw null;
            }
        }

        System.out.println (currentRoom.getDescription());
    }



}
