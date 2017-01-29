package com.petarkolaric


class RobotTest extends GroovyTestCase {

    Robot robot;

    public void testTurnLeft() {
        robot = new Robot(0, 0, Robot.Direction.NORTH)

        robot.turnLeft()
        assert robot.getDirection() == Robot.Direction.WEST

        robot.turnLeft()
        assert robot.getDirection() == Robot.Direction.SOUTH

        robot.turnLeft()
        assert robot.getDirection() == Robot.Direction.EAST

        robot.turnLeft()
        assert robot.getDirection() == Robot.Direction.NORTH
    }

    public void testTurnRight() {
        robot = new Robot(0, 0, Robot.Direction.NORTH)

        robot.turnRight()
        assert robot.getDirection() == Robot.Direction.EAST

        robot.turnRight()
        assert robot.getDirection() == Robot.Direction.SOUTH

        robot.turnRight()
        assert robot.getDirection() == Robot.Direction.WEST

        robot.turnRight()
        assert robot.getDirection() == Robot.Direction.NORTH
    }

    public void testMoveForward() {
        robot = new Robot(2, 2, Robot.Direction.NORTH)
        robot.moveForward()
        assert robot.getXCoordinate() == 2
        assert robot.getYCoordinate() == 3

        robot = new Robot(2, 2, Robot.Direction.EAST)
        robot.moveForward()
        assert robot.getXCoordinate() == 3
        assert robot.getYCoordinate() == 2

        robot = new Robot(2, 2, Robot.Direction.SOUTH)
        robot.moveForward()
        assert robot.getXCoordinate() == 2
        assert robot.getYCoordinate() == 1

        robot = new Robot(2, 2, Robot.Direction.WEST)
        robot.moveForward()
        assert robot.getXCoordinate() == 1
        assert robot.getYCoordinate() == 2
    }

//    public void testMoveForwardStaysAtBounds() {
//        robot = new Robot(0, 0, Robot.Direction.SOUTH)
//        robot.moveForward()
//
//        assert robot.getYCoordinate() == 0
//
//        robot = new Robot(0, 0, Robot.Direction.WEST)
//        robot.moveForward()
//
//        assert robot.getYCoordinate() == 0
//
//        robot = new Robot(0, 0, Robot.Direction.NORTH)
//        robot.moveForward()
//
//        assert robot.getYCoordinate() == 0
//
//        robot = new Robot(0, 0, Robot.Direction.EAST)
//        robot.moveForward()
//
//        assert robot.getYCoordinate() == 0
//    }

}
