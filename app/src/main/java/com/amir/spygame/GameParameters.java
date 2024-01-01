package com.amir.spygame;

public class GameParameters {
    static int playerNumber;

    public GameParameters(int playerCount) {
        this.playerNumber = playerCount;
    }

    public GameParameters() {

    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
