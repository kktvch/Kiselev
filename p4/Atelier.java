package p4;
public class Atelier {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Одежда для мужчин:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("Одежда для женщин:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }
}
