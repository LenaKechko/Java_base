/**
 * Created with IntelliJ IDEA.
 * User: Зяблик
 * Date: 25.09.16
 * Time: 7:10
 * To change this template use File | Settings | File Templates.
 */
public class Robot {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public int X = 0;
    public int Y = 0;

    public Direction getDirection() {
        return Direction.UP;
        // текущее направление взгляда
    }

    public int getX() {
        return X;
        // текущая координата X
    }

    public int getY() {
        return Y;
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
       /* if (robot.getX() == toX) {
            int step = toY - robot.getY();
            if (step > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (step < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            step = Math.abs(step);
            while (step != 0) {
                robot.stepForward();
                step--;
            }
        } else if (robot.getY() == toY) {
            int step = toX - robot.getX();
            if (step > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (step < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            step = Math.abs(step);
            while (step != 0) {
                robot.stepForward();
                step--;
            }
        } else {
            int stepX = toX - robot.getX();
            int stepY = toY - robot.getY();
            if (stepX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (stepX < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            stepX = Math.abs(stepX);
            while (stepX != 0) {
                robot.stepForward();
                stepX--;
            }
            if (stepY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (stepY < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            stepY = Math.abs(stepY);
            while (stepY != 0) {
                robot.stepForward();
                stepY--;
            }
        }*/
        int stepX = toX - robot.getX();
        int stepY = toY - robot.getY();
        if (stepX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (stepX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        stepX = Math.abs(stepX);
        while (stepX != 0) {
            robot.stepForward();
            stepX--;
        }
        if (stepY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (stepY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        stepY = Math.abs(stepY);
        while (stepY != 0) {
            robot.stepForward();
            stepY--;
        }
    }
}
