package p5;
import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}
