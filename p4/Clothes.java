package p4;
public abstract class Clothes {
    protected Size size;
    protected double price;
    protected String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getInfo() {
        return String.format("Размер: %s (%s), Цена: %.2f, Цвет: %s",
                size.name(), size.getDescription(), price, color);
    }
}
