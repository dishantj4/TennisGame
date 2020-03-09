package com.kata;

public class Player {

    private String name;
    private int pointScore;

    public Player(String name, int pointScore) {
        this.name = name;
        this.pointScore = pointScore;
    }

    public int getPointScore() {
        return pointScore;
    }
}
