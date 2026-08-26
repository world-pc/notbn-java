package org.example;

public class Player {

    private int row, col;

    public Player(String player_type) {
        if(player_type.equals("player1")) {
            System.out.println("creating a player 1");
        }
        else if(player_type.equals("player2")) {
            System.out.println("creating a player 2");
        }
    }
}
