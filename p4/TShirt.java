package p4;
public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина надевает футболку. " + getInfo());
    }

    public void dressWomen() {
        System.out.println("Женщина надевает футболку. " + getInfo());
    }
}
