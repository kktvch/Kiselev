package p5;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DrawingPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
