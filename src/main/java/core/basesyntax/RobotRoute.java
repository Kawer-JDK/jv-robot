package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
    if (toX == robot.getX() && toY == robot.getY()) {
        System.out.println("Robot is on right place");
    }
    }
}
