package P7;
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    public void moveUp() {
        if (hasSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveDown() {
        if (hasSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    public void moveLeft() {
        if (hasSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    public void moveRight() {
        if (hasSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    public String toString() {
        return "TopLeft: " + topLeft + ", BottomRight: " + bottomRight;
    }
}
