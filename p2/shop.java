package p2;
// Shop.java
import java.util.ArrayList;
// Computer.java
class Computer {
    private String name;
    private int price;

    public Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public int getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (" + price + " руб)";
    }
}


class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer comp) {
        computers.add(comp);
    }

    public void removeComputer(String name) {
        computers.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    public Computer findComputer(String name) {
        for (Computer c : computers) {
            if (c.getName().equalsIgnoreCase(name)) return c;
        }
        return null;
    }

    public void printAll() {
        for (Computer c : computers) {
            System.out.println(c);
        }
    }
}
// TestShop.java
class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer(new Computer("ASUS", 60000));
        shop.addComputer(new Computer("HP", 55000));
        shop.addComputer(new Computer("Mac", 120000));

        shop.printAll();
        System.out.println("Поиск HP: " + shop.findComputer("HP"));

        shop.removeComputer("HP");
        shop.printAll();
    }
}

public class shop {
}
