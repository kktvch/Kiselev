package p6;
public class Main {
    public static void main(String[] args) {
        Movable p = new MovablePoint(0, 0, 2, 3);
        System.out.println(p);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        Movable c = new MovableCircle(10, 10, 1, 1, 5);
        System.out.println(c);
        c.moveDown();
        c.moveLeft();
        System.out.println(c);
    }
}
