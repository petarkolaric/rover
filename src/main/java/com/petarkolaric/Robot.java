package com.petarkolaric;

public class Robot {
    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;

    public Direction getDirection() {
        return direction;
    }


    public Robot (int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction.NORTH;
    }

    public Robot (int xCoordinate, int yCoordinate, Direction direction){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void moveForward() {
        switch (direction)
        {
            case NORTH:
                yCoordinate++;
                break;
            case EAST:
                xCoordinate++;
                break;
            case SOUTH:
                yCoordinate--;
                break;
            case WEST:
                xCoordinate--;
                break;
            default:
        }
    }


    public enum Direction {NORTH, EAST, SOUTH, WEST;
        public Direction turnRight() {
            return this.ordinal() < Direction.values().length - 1
                    ? Direction.values()[this.ordinal() + 1]
                    : Direction.values()[0];
        }
        public Direction turnLeft() {
            return this.ordinal() > 0
                    ? Direction.values()[this.ordinal() - 1]
                    : Direction.values()[Direction.values().length - 1];
        }
    }
}
