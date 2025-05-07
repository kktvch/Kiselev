package p4;
public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.M, 1000, "белый"),
            new Pants(Size.L, 2000, "черный"),
            new Skirt(Size.S, 1500, "красный"),
            new Tie(Size.XS, 800, "синий")
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}
