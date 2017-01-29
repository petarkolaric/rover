package com.petarkolaric

class BoardTest extends GroovyTestCase {
    Board board;

    void testAddRobot() {
        Robot robot = new Robot(0, 1)
        board = new Board(10, 10)
        board.addRobot(robot)

        assert board.getRobots().get(0).getXCoordinate() == 0
        assert board.getRobots().get(0).getYCoordinate() == 1
        assert board.getRobots().size() == 1
    }
}
