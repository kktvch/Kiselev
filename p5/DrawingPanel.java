package p5;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawingPanel extends JPanel {
    private final ArrayList<Shape> shapes = new ArrayList<>();
    private final Random rand = new Random();

    public DrawingPanel() {
        setPreferredSize(new Dimension(600, 400));

        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(500);
            int y = rand.nextInt(300);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            if (rand.nextBoolean()) {
                int radius = 20 + rand.nextInt(40);
                shapes.add(new Circle(x, y, radius, color));
            } else {
                int w = 30 + rand.nextInt(50);
                int h = 30 + rand.nextInt(50);
                shapes.add(new RectangleShape(x, y, w, h, color));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
