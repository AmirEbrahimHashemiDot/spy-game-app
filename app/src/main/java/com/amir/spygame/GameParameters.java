package com.amir.spygame;

public class GameParameters {
    static int playerNumber;
    static int cardItemsClicked;

    public GameParameters(int playerCount) {
        this.playerNumber = playerCount;
    }

    public GameParameters() {

    }

    public static int getCardItemsClicked() {
        return cardItemsClicked;
    }

    public static void setCardItemsClicked(int cardItemsClicked) {
        GameParameters.cardItemsClicked = cardItemsClicked;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
