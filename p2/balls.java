package p2;
// Ball.java
class Ball {
    private String color;
    private int size;

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    @Override
    public String toString() {
        return "Ball{color='" + color + "', size=" + size + '}';
    }
}
// TestBall.java
class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 5);
        System.out.println(b1);
        b1.setSize(7);
        System.out.println("Updated ball: " + b1);
    }
}

public class balls {
}
