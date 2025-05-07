package p4;
public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина надевает штаны. " + getInfo());
    }

    public void dressWomen() {
        System.out.println("Женщина надевает штаны. " + getInfo());
    }
}
