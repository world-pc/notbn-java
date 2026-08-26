package org.example;

public class Tile {

    private String owner;
    public Tile(String owner) {
        this.owner = owner; //1 for player 1, 2 for player 2
        System.out.println("created a tile.");
    }
}
