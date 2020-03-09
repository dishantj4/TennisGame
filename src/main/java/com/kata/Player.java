package com.kata;

public class Player {

    private String name;

    public String getName() {
        return name;
    }

    private int pointScore;

    public void setPointScore(int pointScore) {
        this.pointScore = pointScore;
    }

    public Player(String name, int pointScore) {
        this.name = name;
        this.pointScore = pointScore;
    }

    public int getPointScore() {
        return pointScore;
    }
}
