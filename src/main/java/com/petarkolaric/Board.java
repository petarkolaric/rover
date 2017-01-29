package com.petarkolaric;

import java.util.ArrayList;

public class Board {
    private int xSize;
    private int ySize;

    private ArrayList<Robot> robots = new ArrayList<>();

    public Board (int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void addRobot(Robot newRobot){
        robots.add(newRobot);
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }

}
